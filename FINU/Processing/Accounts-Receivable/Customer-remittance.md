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

## Prerequisites
The following setup are prerequisites for the Customer remittance import

1. [Accounts receivable parameters](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md#accounts-receivable-parameters)
2. [Remittance format](../../Setup/ACCOUNTS-RECEIVABLE/Remittance-format.md)
3. [Methods of payment](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.html#methods-of-payment)
4. [Financial utilities connection](../../Setup/ACCOUNTS-RECEIVABLE/Finance-utilities-connections.md)
5. [Periodic task](../../Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.html#periodic-task)

Select **Import statement**.
Where the selected statement format is marked as **Customised format** the following additional fields are available on the import:

| **Field**        | **Description**                                               | Options
|-                 |-                                                              |-
| **From date**    | Select transactions >= this date                              | Calendar
| **To date**      | Select transactions <= this date                              | Calendar
| **Date**         | Select which date to use when **Mark as new** <br> transactions are posted | •	Today’s date <br> •	Statement Transaction Date <br> (_To date_ of the Bank statement header)

> Note: Where the bank statement file contains transactions related to multiple dates and multiple bank accounts (i.e. the file is imported using the option **Import statement for multiple bank accounts in all legal entities**, separate bank statement records get created in D365 for each bank account. 

The **Statement ID** number sequence in Cash and bank management parameters is used to generate the Statement identifier. 

When a bank statement (BAI2/NAI/BRS/Flat file) is imported, statement lines will only be imported where the following matching rules are validated:  
1.	If Bank statement format is setup as **Customised format**, bank statement lines has to be between the **From date** and **To date** specified in the **Import bank statement**.  
2.	If **Import statement for multiple bank accounts in all legal entities** is NOT enabled in the import bank statement screen, the bank account number in the bank statement line has to match the bank account number of the bank account selected in the import bank statement screen. 
3.	If **Import statement for multiple bank accounts in all legal entities** is enabled in the import bank statement screen, the **Bank account number** in the bank statement line has to match the bank account number of one of the bank accounts in bank master in any of the legal entities. <br>

In addition, where Import statement for multiple bank accounts in all legal entities is enabled, and if D365 finds multiple bank accounts in same/different legal entities with the same bank account number while importing the statement, following order of priority is applied: 
1.	Bank accounts with the same Bank account number in the same D365 entity in which user is importing the bank statement, system imports the bank statement to the first identified bank account record. 
2.	If the bank account exists within multiple D365 entities, the bank statement is imported into the bank account in the D365 entity from which user is importing the bank statement. If this bank account is not in the entity in which user is importing the bank statement, system imports the bank statement to the first identified bank account record 

### Periodic import

The bank statement can also automatically be imported by using periodic task [Import bank statements via financial utilities connection](../Setup/CASH-AND-BANK-MANAGEMENT/Bank-statement-import.md)
