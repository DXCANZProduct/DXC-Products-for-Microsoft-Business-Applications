---
# required metadata

title: Finance Utilities 
description: Bank statement reconciliation processing - Cash and bank management reports 
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankReconciliationHeader 
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

## Cash and bank management reports
Finance utilities have additional reporting for the reconciliation facilities to enable better problem resolution and auditing.

### Bank Reconciliation Report
Users can reach the **Bank reconciliation** report by navigating to **Cash and bank management > Inquiries and reports > Bank reconciliation reports > Bank reconciliation**.

In the report parameters, select the following:
- Bank account
- Checking date: Compared to the bank statement ending date
- Reconciliation summary - Yes/No **
- Uncleared transaction details - Yes/No ** <br>
The report prints a **Reconciliation summary** report and an **Unreconciled bank transactions** report if both are set to _Yes_. <br>

> Note: Ensure that all statements are reconciled and the statement posted before printing this report.

#### Reconciliation summary 

Content                     |   Heading                       |   Description
:--                         |:--                              |:--
**Header**                  | Checking date                   | Bank statement end date
||  Bank account                |  From the selection             
||  Bank account currency       |  Currency from the bank account 
||  Description                 |  Bank account description       
||  Bank account statement date |  From the selection             
||  Reconciled date             |  Reconciled date from the bank reconciliation      
| **Balances** |  Closing balance per bank statement |  Closing balance as per last posted bank statement up to _Checking date_ 
||  Unreconciled bank transactions  |  Bank transactions not yet reconciled up to _Checking date_. If **Uncleared transaction details** was set to _Yes_, the transaction details can be viewed on **Unreconciled bank transactions** 
||  Expected closing bank account balance |  Closing balance per bank statement _PLUS_ Unreconciled bank transactions 
||  Actual closing bank account balance |  Actual D365 bank account balance at _Checking date_ 
||  Difference |  Difference between Expected and Actual bank account balances 

#### Unreconciled bank transactions 
If parameter **Uncleared transaction details** was set to _Yes_, the following will be printed for all unreconciled bank transactions to the _Checking date_.
The **Grand total** of this section should equal to the **Unreconciled bank transactions** on **Reconciliation summary**.

|   Content           |   Heading                 |   Description   |
|:--|:--|:--|
|   **Header**        |  Bank account             |  As selected  |
|                     |  Name                     |  Bank account name |
|                     |  Routing number           |  Bank's routing number |
|                     |  Bank account number      |  Bank's account number |
|                     |  Ledger account           |  Bank's ledger account |
|   **Transactions**  |  Bank transaction type    |  Bank transaction type for the transaction |
|                     |  Date                     |  Date for the transaction |
|                     |  Cost Center              |  Cost center for the transaction |
|                     |  Payment reference        |  Payment reference for the transaction |
|                     |  Transaction text         |  Transaction text for the reference|
|                     |  Currency                 |  Currency for the transaction |
|                     |  Amount in trx. Currency  |  Amount in transaction currency |
|                     |  Amount                   |  Amount in bank's currency |

### Bank statement matching report

Users can reach the **Bank statement matching** report by navigating to **Cash and bank management > Inquiries and reports > Bank reconciliation reports > Bank statement matching**.

-	The report shows all **matched** lines for all bank statement(s) for the selected bank account within the **To date** range.
-	The report is sorted by **Date** and **Match ID**.
-	Lines containing vouchers are D365 Bank transactions.
-	Lines that have no voucher information are Bank statement lines.

In the report parameters, select the following:
- Bank account

|   Content                   |   Heading                       |   Description   |
|:--|:--|:--|
|   **Header**                |  Bank account                   |  As selected  |
|                             |  Bank statement                 |  Bank statement identifier(s) (from the Reconciliation) |
|                             |  Bank account statement to date |  Shows the most recent bank statement's date, if not selected in **To date**|
|   **Matched Transactions**  |  Date                           |  Transaction date  |
|                             |  Match ID                       |  When transactions have been manually matched on the bank reconciliation. This would be blank where the transactions were matched with a **Reconciliation matching rule**. |
|                             |  Type                           |  Bank transaction type |
|                             |  Payment reference              |  Payment reference for the D365 bank transaction or bank statement line|
|                             |  Transaction text               |  Transaction text |
|                             |  Amount                         |  Debit or credit transaction amount |
|                             |  Voucher                        |  D365 bank transaction's voucher. When voucher is blank, the transaction is from the bank statement lines |
