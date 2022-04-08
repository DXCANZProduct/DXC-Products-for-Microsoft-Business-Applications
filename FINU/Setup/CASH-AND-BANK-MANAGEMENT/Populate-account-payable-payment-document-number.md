---
# required metadata

title: [Finance Utilities ]
description: [Cash and bank management setup - Accounts payable payment document number]
author: [jdutoit2]
manager: Kym Parker
ms.date: 04/03/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
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

# Advanced bank reconciliation functionality
The fields as described in the following subsections are available to control the additional functionality for advanced bank reconciliation.

## Setup
### Populate Accounts Payable Payment Document Number 

The enhancement to support the Finance utilities Reconciliation matching rule's **Group by document number** feature is to display the Journal id or Cheque number under **Document number** field on the bank reconciliation screen. Document field on the payment journal line is not updated. Reconciliation matching rules can then be used to automatically match the _sum_ of the D365 transactions having the _same document number_ as that on the Bank statement.
To activate the Document number:
- Go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters**, set **Populate bank transaction document number** to _Yes_.
- Go to **Accounts Payable > Setup > Accounts payable parameters**, select the **Number sequences** tab and set the **Payment reference** number sequence.
