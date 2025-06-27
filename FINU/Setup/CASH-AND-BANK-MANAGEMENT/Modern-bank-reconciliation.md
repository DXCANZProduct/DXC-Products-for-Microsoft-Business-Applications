---
# required metadata

title: Finance Utilities
description: Cash and bank management setup - Modern bank reconciliation
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-06-26
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankReconciliationMatchRule, SAB_FinUtilParameters
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Advanced bank reconciliation functionality
The fields as described in the following subsections are available to control the additional functionality for advanced bank reconciliation with **Modern bank reconciliation** feature.

## Overview
Modern bank reconciliation feature contains exciting changes to Advanced bank reconciliation. 
The biggest change is the removal of Action **Mark new transactions**. This is replaced in std with:
- **Generate voucher** - offset type ledger
- **Generate vendor payment** - offset type vendor without settlement
- **Generate customer payment** - offset type customer without settlement
- **Settle customer invoice** - offset type customer with settlement

Summary of Finance Utilities extensions to Modern bank reconciliation:
- **Offset company** - Ability to post the offset to intercompany ledger, bank, vendor or customer.
- **Offset type bank** - Modern bank reconciliation doesn't include an option for offset type Bank, we've added this option to **Generate voucher**.
- **Offset type customer**:
    - Ability to use **Customer reference** to find the Customer account.
    - One customer payment journal for all matched bank statement lines (only 'Generate customer payment).
    - Posting options.

## Migration
See the following [link](Modern-bank-reconciliation-migration.md) for migration details.


# Setup

## Financial utilities parameters
Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters

In order to utilise Finance utilities extensions to Modern bank reconciliation:
- Enable feature **Modern bank reconciliation** and
- Set **Enable modern bank reconciliation extensions** to _Yes_

## Bank account
Cash and bank management > Bank statement reconciliation > Bank accounts

The following standard setup is required on each applicable bank account if customer/vendor payments will be created either by running Reconciliation matching rules, or within the Bank reconciliation Worksheet:

- Customer payment journal
- Vendor payment journal

## Bank reconciliation matching rules

Finance utilities extensions to Modern bank reconciliation adds the following functionality to each action that replaces **Mark new transactions**:

### Ledger

- **Generate voucher**
    - **Offset company** - ability to offset to a different legal entity (intercompany).
    - **Offset account type** - select ledger to offset to an expense or income ledger account.
    - **Sales tax group** - only enabled for offset type ledger. If an intercompany offset company is selected, our field will provide tax drop-down options from the applicable intercompany legal entity.
    - **Item sales tax group** - only enabled for offset type ledger. If an intercompany offset company is selected, our field will provide tax drop-down options from the applicable intercompany legal entity.

### Bank

- **Generate voucher**
    - **Offset company** - ability to offset to a different legal entity (intercompany).
    - **Offset account type** - select bank for bank transfers.
    - **Sales tax group** - only enabled for offset type ledger. If an intercompany offset company is selected, our field will provide tax drop-down options from the applicable intercompany legal entity.


 ### Vendor
 
- **Generate vendor payment**
    - **Offset company** - ability to offset to a different legal entity (intercompany).
 
### Customer

The following is applicable to both customer actions
- **Generate customer payment**
- **Settle customer invoice**

    - **Offset company** - ability to offset to a different legal entity (intercompany).
    - **Reference number** - in Step 2 when identitying customer account through invoice matching, the Finance utilities **Customer reference** can be used to find the D365 customer account.
    - **Post** - provides the following three options:
        -  **Do not post** - generally only used in initial testing. The customer payment journal will only be created (not posted). Once the user has reviewed and manually posted the customer payment journal, refresh the bank reconciliation’s worksheet to bring in the new bank transactions. User has to either use a match with bank statement rule or manually match the applicable bank statement lines with these new bank transactions. When running the reconciliation matching rule in the bank recon, the infolog will provide the journal number created.
        -  **Post** -  Indicates if the created customer payment journal should automatically be posted. The newly posted bank transaction(s) will also automatically be matched to the applicable bank statement lines.
        -  **Post and transfer** - Indicates if the created customer payment journal should automatically be posted. If any errors found (example stopped customer), the error lines will be moved to a new journal. The newly posted bank transaction(s) will also automatically be matched to the applicable bank statement lines.

The following is only applicable to
- **Generate customer payment**
    - One journal for all matched bank statement lines. No setup required, this is automatic for this action.
 

> **Important notes**:
> When using **Step 2 (Optional): Identify customer account through invoice matching**:
> - An invoice needs to exist for the customer, as std uses CustInvoiceForBankReconciliationView to find the customer.
> - If the customer had a method of payment in above view, this method of payment would be used in the customer payment journal. The default on the Reconciliation matching rule will only be used where the customer didn't have a method of payment assigned.
> - Customer reference numbers must be kept unique accross all legal entities. Std code will look in current legal entity first, and then when it couldn't find it, Finance Utilities is able to look in the offset company.

# Processing

Processing is discussed in detail [here](../../Processing/Bank-Statement-Reconciliation/Modern-bank-reconciliation.md)


