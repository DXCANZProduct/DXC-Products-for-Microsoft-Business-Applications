---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL setup - Transaction direction mapping]
author: [jdutoit2]
manager: Kym Parker
ms.date: 17/11/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# 3PL setup
## Setup Transaction direction mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Transaction direction mapping**

Code mapping the 3PL's value to a EDI Transaction direction. <br>
With some EDI standards quantities are always positive. The transaction direction code indicates if the movement is **out** or **into** inventory. When direction mapping indicates an **out** value, the quantity is converted to **negative**. All in direction quantities are used as-is. A blank in mapping is also acceptable. If no mapping is assigned to the 3PL, the qty’s will be used as-is (not converted).

- Click **New** to create a new record
-	In the **Name** field, enter the name of the transaction direction mapping group
-	In the **Description** field, enter a description of the transaction direction mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Transaction direction**. Options are In or Out.
-	Specify the 3PL's value used to identify the **EDI code**

## Where used
Transaction direction mapping is assigned on the [3PL Trading partner's](../Trading%20partner.md) Options field called **Transaction direction mapping**. <br>
Used on field **TransactionDirection** on EDI documents:
- Inventory adjustment - Movement

## Data entities:
- Transaction direction mapping
- Transaction direction mapping lines
