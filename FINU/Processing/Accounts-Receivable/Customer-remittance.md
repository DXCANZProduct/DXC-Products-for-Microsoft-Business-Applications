---
# required metadata

title: DXC Finance Utilities - AR Utilities
description: Customer remittance processing
author: jdutoit2
manager: Kym Parker
ms.date: 2023-04-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: LedgerJournalTable_CustPaym
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Customer remittance import 

The functionality as described in the following subsections relates to customer remittance import available in additional licensed feature **Finance utilities - AR utilities**.

> Note: The menu items and additional fields on existing menu items are only available where additional licensed feature **Finance utilities - AR utilities** is enabled.

## Functionality

Customer remittance import includes the following functionality:
- Periodic import from ftp, sftp or Azure blob storage.
- Decryption of import files supported.
- Remittance custom format mapping.
- One import file creates one customer payment journal.
- Options per legal entity:
    - Automatically post created customer payment journal
    - Create prepayment. ** If the Method of payment's Settle transaction is set to _Yes_:
        - If an invoice can't be settled and automatic settlement is set to _Yes_, standard automatic settlement is used to settle open invoice(s) for the customer
        - If an invoice can't be settled and automatic settlement is set to _No_ - option to create customer payment journal line as prepayment
    - Ability to attach original import file to created customer payment journal
- Options per methods of payment: 
    - If D365 customer account can't be found, option to use an Error customer account.
    - Settle transaction. When set to _Yes_, the functionality will attempt to settle the payment line against an open invoice for the customer. Also see prepayment options per legal entity **
    - Customer payment journal line date can use Remittance transaction date or Today's date
    - Remittance file format
- Ability to use the following methods to obtain D365 customer account:
    - Customer reference number
    - Invoice number
    - If D365 customer account can't be found, the functionality will create the line against the Error customer account setup on the method of payment
- Filter on customer payment journal to view journals created via the periodic task.

## Assumptions
The following assumptions apply to the functionality:
- An invoice will only be referenced once in the import file

## Prerequisites
The following setup are prerequisites for the Customer remittance import

1. [Accounts receivable parameters](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md#accounts-receivable-parameters)
2. [Remittance format](../../Setup/ACCOUNTS-RECEIVABLE/Remittance-format.md)
3. [Methods of payment](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md#methods-of-payment)
4. [Financial utilities connection](../../Setup/ACCOUNTS-RECEIVABLE/Finance-utilities-connections.md)
5. [Periodic task](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md#periodic-task)
6. [Customer references](../../Setup/ACCOUNTS-RECEIVABLE/Customer-reference.md) - if customer references are to be used to find the applicable D365 customer account

## Processing

When the file is imported, AR Utilities converts the data as per setup and creates an import using Data management composite entity **Customer payment journal**.

### Data entity mapping

The fields from the [Remittance format] are mapped to the following DMF fields:

**Data entity**     | **Data entity field**     | **Source**
:--                 |:--                        |:--

| **Remittance format field**  | **Data management target** |
:--                     |:--
**Amount**              | Customer payment journal line entity > Credit
**Reference number**    | Used to find D365 customer account and populate: Customer payment journal line entity > Ledger account <br> Account type is set to Customer.
**Description**         | Customer payment journal line entity > Description
**Invoice**             | Customer payment journal line entity > Invoice
**Payment reference**   | 
**Date**                |

## Customer payment journal

Filter **Imported via financial utilities connection** on the **Customer payment journal**, provides users with the ability to filter to journals imported via the periodic task.
