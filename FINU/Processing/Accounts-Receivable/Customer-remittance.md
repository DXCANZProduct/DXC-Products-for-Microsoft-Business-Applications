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
- Remittance custom format mapping, set on Method of payment
- One import file creates one customer payment journal.
- Options per legal entity:
    - Automatically post created customer payment journal
    - If invoice can't be settled, option to create customer payment journal line as prepayment
    - Ability to attach original import file to created customer payment journal
- Options per method of payments: 
    - If D365 customer account can't be found, option to use an Error customer account.
    - Settle transaction
    - Customer payment journal line date can use Remittance transaction date or Today's date
- Ability to use the following methods to obtain D365 customer account:
    - Customer reference number
    - Invoice number
- Filter on customer payment journal to view journals created via the periodic task.

## Prerequisites
The following setup are prerequisites for the Customer remittance import

1. [Accounts receivable parameters](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md#accounts-receivable-parameters)
2. [Remittance format](../../Setup/ACCOUNTS-RECEIVABLE/Remittance-format.md)
3. [Methods of payment](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md#methods-of-payment)
4. [Financial utilities connection](../../Setup/ACCOUNTS-RECEIVABLE/Finance-utilities-connections.md)
5. [Periodic task](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md#periodic-task)
6. [Customer references](../../Setup/ACCOUNTS-RECEIVABLE/Customer-reference.md) - if customer references are to be used to find the applicable D365 customer account

## Processing

## Customer payment journal

Filter **Imported via financial utilities connection** on the **Customer payment journal**, provides users with the ability to filter to journals imported via the periodic task.
