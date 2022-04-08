---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL setup - Inventory status Id mapping]
author: [jdutoit2]
manager: Kym Parker
ms.date: 17/11/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [EDI]
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
## Setup Inventory status Id mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Inventory status Id mapping**

Code mapping the 3PL's value to a D365 Inventory status Id. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the inventory status Id mapping group
-	In the **Description** field, enter a description of the inventory status Id mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Inventory status** from the available list. Options are obtained from **Inventory status** setup at **Warehouse management > Setup > Inventory > Inventory statuses**
-	Specify the 3PL's value used to identify the **Value**

## Where used
Inventory status Id mapping is assigned on the [3PL Trading partner's](../Trading-partner.md) Options field called **Inventory status Id mapping**. <br>
Used on field **InventStatusId** on EDI documents:
- Picking list registration
- Shipment receipt - Purchase order
- Shipment receipt - Transfer order
- Shipment receipt - Return order
- Shipment receipt - Voyage
- Inventory adjustment - Transfer (InventStatusIdFrom and InventStatusIdTo)
- Inventory adjustment - Counting
- Inventory adjustment - Reconciliation
- Inventory adjustment - Movement

## Data entities:
- Inventory status Id mapping
- Inventory status Id mapping lines
