---
# required metadata

title: [Finance Utilities ]
description: [Introduction to Finance Utilities Parameters]
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

# Advanced bank statement functionality

The **Financial utilities parameter** page within **Cash and bank management** is used to define settings that apply to Advanced bank statement functionality. These settings offer extended options on reconciliation matching rules, additional functionality on the bank reconciliation worksheet and other behavior. The settings also includes number sequence.

## Setup
### Finance utilities parameters

To open the **Financial utilities parameters** page, go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters**. <br>
Then set the fields as desribed in the following subsections.

**Reconciliation matching rule**
| Field | Description|
|--|--|
| Extended matching rule operator | This parameter activates a new operator **Included in** in the Reconciliation matching rules form. It supplements the Contains capability, and means that the field selected is a part of the nominated Bank statement field. |
| Extended financial details for new transaction | This parameter enables the capture of the following details automatically if the bank statement line is marked as ‘New’ <br> • Financial dimensions <br> • GST  <br> • Sub-Ledger offset account |

**Bank reconciliation**
| Field | Description|
|--|--|
|Ability to reconcile unmatched statements |If this parameter is not marked, the button Mark as reconciled is disabled in the Bank Reconciliation Worksheet when Unmatched Amount is NOT zero. |
|Ability to enter reconciliation balances |This parameter allows the user to enter any amount to balance the difference between the statement and bank transactions, in a separate Correction column. <br> The correction balance is posted to the account associated with the bank transaction type.|
|Auto assign Match id|Streamline **Match Id** and **Match Bank** reconciliation Worksheet functionality. When marked bank statement and bank transactions balances, can click **Match** button and **Match id** will be auto assigned. No need to first click **Match Id** and then **Match**.|

**Bank statement**
| Field | Description|
|--|--|
|Enable custom bank statement formats |This parameter enables a Customized format field in bank statement format form. <br> If the bank statement format is marked as a customised format, additional fields become active to configure the BAI2/NAI/Flat file statement upload |
|Auto-post bank statement|When Auto-post bank statement is **YES**, the bank statement will automatically be posted upon selecting **Mark as** reconciled from the **Bank Reconciliation Worksheet** form.|
