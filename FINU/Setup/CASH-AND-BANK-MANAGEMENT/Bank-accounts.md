---
# required metadata

title: [Finance Utilities ]
description: [Cash and bank management setup - Bank accounts]
author: [jdutoit2]
manager: Kym Parker
ms.date: 10/05/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  BankAccountTableListPage
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

## Bank accounts
When the bank statements are to be imported via the periodic task [Import bank statements via financial utilities connection](Bank-statement-import.md), the following setup is required on each bank account.

To open the **Bank accounts** page, go to **Cash and bank management > Bank accounts > Bank accounts**, expand the **Reconciliation** FastTab. Then set the fields as desribed in the following subsections.

Field         | Description                         
:--           |:--                        
**Posting date**    | 	Select the applicable posting date to be used for mark as new transactions, options include:  <br> •	Statement transaction date <br> •	Today’s date
**Financial utilities connection**  |	Select the applicable [Financial utilities connection](Finance-utilities-connections.md) <br> Optional (for info)

