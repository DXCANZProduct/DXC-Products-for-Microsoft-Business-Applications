---
# required metadata

title: [Finance Utilities ]
description: [Cash and bank management setup - Periodic import Bank statement]
author: [jdutoit2]
manager: Kym Parker
ms.date: 10/05/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Import bank statements via financial utilities connection]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

## Bank statement periodic import
When the bank statements are to be imported via the periodic task **Import bank statements via financial utilities connection**, the following prerequisites are required.

### Prerequisites
1.	Setup [Financial utilities connection](Finance-utilities-connections.md)
1.	Setup [Bank accounts](Bank-accounts.md):
   - Select applicable **Posting date**
   - Select applicable **Financial utilities connection** (Optional for info)

### Batch job
After the prerequisites have been completed, setup required batch job(s) by using **Cash and bank management > Periodic tasks > Import bank statements via financial utilities connection**

Field         | Description                         | Mandatory
:--           |:--                                  |:--:
**Financial utilities connection**  |	Select the applicable Financial utilities connection  |	Y
**Statement format**  |	Select the applicable bank statement format	  | Y
**Bank account**  |	If applicable, select a bank account	  | N

### Bank statement
**Cash and bank management > Bank statement reconciliation > Bank statements**. <br>
Filter **Imported via financial utilities connection** on the **Bank statement** form, provides users with the ability to filter to bank statements imported via the batch job. <br>
If the file contains any bank accounts that can't be found in D365, no bank statements will be created, and the file will be moved from the Import to **Error path** as setup on the Financial connection.

Where the Statement format selected in the Batch job, is a **Custom format**, the created bank statement’s:
- **From date** - will be set to earliest date found in the file for the bank account
- **To date** - will be set to latest date found in the file for the bank account

