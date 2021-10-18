---
# required metadata

title: [Finance Utilities ]
description: [Bank statement reconciliation processing - Cash and bank management reports ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

## Cash and bank management reports
Finance utilities have additional reporting for the reconciliation facilities to enable better problem resolution and auditing.

### Bank Reconciliation Report
Users can reach the **Bank reconciliation** report by navigating to **Cash and bank management > Inquiries and reports > Bank reconciliation reports > Bank reconciliation**.

In the report parameters, select the following:
- Bank account
- Checking date: Compared to the bank statement ending date
- Reconciliation summary - Yes/No **
- Uncleared transaction details - Yes/No **

** The report prints a **Reconciliation summary** report and an **Unreconciled bank transactions** report if both are set to _Yes_. <br>
Ensure that all statements are reconciled and the statement posted before printing this report.

#### Reconciliation summary 
|   Content                     |   Heading                       |   Description   |
|- |-|-|
| **Header**                    |  Checking date                  |  Bank statement end date |  |
||  Bank account                |  From the selection             |  |
||  Bank account currency       |  Currency from the bank account |  |
||  Description                 |  Bank account description       |  |
||  Bank account statement date |  From the selection             |  |
||  Reconciled date             |  Reconciled date from the bank reconciliation      |  |
| **Balances** |  Closing balance per bank statement |  Closing balance as per last posted bank statement up to _Checking date_ |  |
||  Unreconciled bank transactions  |  Bank transactions not yet reconciled up to _Checking date_  |  |
||  Expected closing bank account balance |  Closing balance per bank statement _PLUS_ Unreconciled bank transactions |  |
||  Actual closing bank account balance |  Actual D365 bank account balance at _Checking date_ |  |
||  Difference |  Difference between Expected and Actual bank account balances |  |

#### Unreconciled bank transactions 

|   Content    |   Heading   |   Description   |
|-|-|-|
|   Header  |  Bank account  |  As selected  |
|  |  Name |  |
|  |  Routing number |  |
|  |  Bank account number |  |
|  |  Ledger account |  |
|   Transactions  |  Bank transaction type  |  |
|  |  Date |  |
|  |  Cost Center |  |
|  |  Payment reference |  |
|  | Transaction text |  |
|  | Amount in trx. Currency |  |
|  | Amount |  |

### Bank statement matching report

Users can reach the **Bank statement matching** report by navigating to **Cash and bank management > Inquiries and reports > Bank reconciliation reports > Bank statement matching**.

-	The report shows all matched lines for the selected bank statement(s) and bank transactions.
-	The report is sorted by Date and Match ID.
-	Lines containing vouchers are D365O transactions.
-	Lines that have no voucher information are statement lines.

|   Content    |   Heading   |   Description   |
|-|-|-|
|   **Header**  |  Bank account  |  As selected  |
|  |  Bank statement |  Bank statement identifiers (from the Reconciliation) |
|  |  Bank account statement to date |  Shows the most recent if not selected |
|   **Matched Transactions**  |  Date  |    |
|  |  Match ID |  From the bank Reconciliation |
|  |  Type |  Bank transaction type |
|  |  Payment reference |  |
|  |  Transaction text |  |
|  |  Amount |  |
|  |  Voucher |  D365O Posting reference |
