---
# required metadata

title: Finance Utilities
description: Cash and bank management setup - Modern bank reconciliation
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-09-04
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
- **Offset type bank** - Modern bank reconciliation doesn't include an option for offset type Bank which is used for bank transfers. In Finance utilities we support this option under **Generate voucher**.
- **Offset type customer**:
    - Ability to use **Customer reference** to find the Customer account.
    - Field format - enhanced option in Reconciliation matching rule for using part of a bank statement field to find the invoice / customer.
    - One customer payment journal for all matched bank statement lines (only 'Generate customer payment').
    - Posting options (only 'Generate customer payment').
 - **Correction amounts** - Ability to enter correction amounts at time of matching Bank statement transactions to Bank transactions.


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

> Note: Std doesn't allow journal names where **Summarise amounts in bank account** is _Yes_.

## Bank reconciliation matching rules

Finance utilities extensions to Modern bank reconciliation adds the following functionality to each action that replaces **Mark new transactions**:

### Ledger

Action: **Generate voucher** <br>
Finance utilities functionality extends **Financial details** in **Step 2: Voucher parameters** with:

- **Offset company** - ability to offset to a different legal entity (intercompany).
- **Offset account type** - select ledger to offset to an expense or income ledger account.
- **Sales tax group** - only enabled for offset type ledger. If an intercompany offset company is selected, our field will provide tax drop-down options from the applicable intercompany legal entity. For current legal entity company offsets, std's tax field is utilised.
- **Item sales tax group** - only enabled for offset type ledger. If an intercompany offset company is selected, our field will provide tax drop-down options from the applicable intercompany legal entity. For current legal entity company offsets, std's tax field is utilised.

### Bank

Action: **Generate voucher** <br>
Finance utilities functionality extends **Financial details** in **Step 2: Voucher parameters** with:

- **Offset company** - ability to offset to a different legal entity (intercompany).
- **Offset account type** - select bank for bank transfers.


### Vendor
 
Action: **Generate vendor payment** <br>
Finance utilities functionality extends **Financial details** in **Step 2: Vendor payment parameters** with:

- **Offset company** - ability to offset to a different legal entity (intercompany).
 
### Customer

The following is applicable to both customer actions
- **Generate customer payment**
- **Settle customer invoice**

#### Step 2

Finance utilities functionality extends **Customer invoice field** in **Step 2 (Optional): Identify customer account through invoice matching / Match open invoices** with:
- **Reference number** - in Step 2 when identitying customer account through invoice matching, the Finance utilities **Customer reference** can be used to find the D365 customer account.
- **Field format** - option to use part of a bank statement field to find the D365 customer acount. For example using only 'FTI00000453' from bank statement field value 'xx FTI00000453 yy'

##### Field format

Select the applicable line in Step 2, and select **Field format**. The following options are provided:
- **No format** - The bank statement field will be used as-is (default).
- **Fixed field position** - Set **Start position** and **Length**.
- **Delimited field position** - Set **Delimiter** (default is space) and **Field position**.
- **Custom format** - Ability to use a [regex](https://regex101.com/) format.

The **Example** and **Value** field is automatically updated based on above selection.
The user can also paste/type their own example into Example to view the resulted Value from their setup.

Example result for each option:

Option	  	| Setup             | Example <br> Bank statement field's original data	  | Value
:--       	|:--                |:--                                                  |:--
**No format**  |                 | xxUS-001xx                      | xxUS-001xx
**Fixed field position**        | Start position: 2 <br> Length: 6  | xxUS-001xx        | US-001
**Delimited field position**    | Delimiter:  <br> Field position: 0   | US-001 extra description  | US-001
**Custom format**               | `\*(.+)\*` <br> (\w+\s*-\s*\d+) <br> [1-9][0-9]*   | \**US-001\**  <br> xx FTI-0035345 yy <br>  CR025126  | US-001 <br> FTI-0035345 <br> 25126

> **Important notes for both Customer actions**:
> When using **Step 2**:
> - An invoice needs to exist for the customer, as std uses CustInvoiceForBankReconciliationView to find the customer.
> - If the customer had a method of payment in above view, this method of payment would be used in the customer payment journal. The default on the Reconciliation matching rule will only be used where the customer didn't have a method of payment assigned in the view for the record.
> - Customer reference numbers must be kept unique accross all legal entities. Std code will look in current legal entity first, and then when it couldn't find it, Finance Utilities is able to look in the offset company.

#### Step 3

Standard functionality: When **Automatic customer account matching** is set to _Yes_ in Step 3's Financial details, std will first try and find the customer account with bank statement field **Related bank account** in the customer's bank account **IBAN** and then **Bank account number** and will then use **Step 2**'s setup if it couldn't find via the customer bank account.

Find customer order: 
1. Customer bank account's IBAN
2. Customer bank account's Bank account number
3. Reconciliation matching rule's Step 2


Finance utilities functionality extends **Financial details** in **Step 3: Customer payment journal parameters** with:
- **Offset company** - ability to offset to a different legal entity (intercompany).

Finance utilities **Description mask** is replaced with standard's [Default description](#default-description)

The following is only applicable to
- **Generate customer payment**
    - **One journal** for all matched bank statement lines. No setup required, this is automatic for this action.
    - **Post** - provides the following three options:
        -  **Do not post** - generally only used in initial testing. The customer payment journal will only be created (not posted). Once the user has reviewed and manually posted the customer payment journal, refresh the bank reconciliation’s worksheet to bring in the new bank transactions. User has to either use a match with bank statement rule or manually match the applicable bank statement lines with these new bank transactions. When running the reconciliation matching rule in the bank recon, the infolog will provide the journal number created.
        -  **Post** -  Indicates if the created customer payment journal should automatically be posted. The newly posted bank transaction(s) will also automatically be matched to the applicable bank statement lines.
        -  **Post and transfer** - Indicates if the created customer payment journal should automatically be posted. If any errors found (example stopped customer), the error lines will be moved to a new journal. The newly posted bank transaction(s) will also automatically be matched to the applicable bank statement lines.



### Default description

1. Enable feature **Enable default descriptions for advanced bank reconciliation**
2. Setup [Default descriptions](https://learn.microsoft.com/en-us/dynamics365/finance/cash-bank-management/apply-cash-adv-bank-rec#enable-default-descriptions-for-advanced-bank-reconciliation) for **Bank - reconciliation worksheet** for each applicable **Language** or select **user**. <br> 

Finance utilities will use the same default description on the intercompany transaction.

This applies to all of the following actions: 
- Generate customer payment
- Generate vendor payment
- Generate voucher
- Settle customer invoice - std doesn't use default description for this action, added with Finance Utilities

### Duplicate

Modern bank reconciliation has added new button **Duplicate**, which allows users to copy matching rules. Similar to Finance Utilities **Copy matching rule**.

When Financial utilities parameter **Enable modern bank reconciliation extensions** is set to _Yes_, the Finance Utilities button **Copy matching rule** is hidden (will be deprecated in future).
The additional Finance Utilities fields for the new Modern bank reconciliation actions have been added the std's **Duplicate** button.

# Migration

### Reconciliation matching rules

See the following [page](Modern-bank-reconciliation-er-migration.md) for migrating 'Mark new transaction' Reconciliation matching rules to the new actions.

# Processing

Processing is discussed in detail [here](../../Processing/Bank-Statement-Reconciliation/Modern-bank-reconciliation.md)


