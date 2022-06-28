---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL workspaces - EDI Inventory adjustment]
author: [jdutoit2]
manager: Kym Parker
ms.date: 28/06/2022
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

# Workspaces

## EDI Inventory adjustment

The EDI Inventory adjustment workspace provides a quick and easy way to view and mange open 3PL inventory adjustments. <br>
It is useful where companies have decided not to automatically post the D365 target journal and manually review before posting. <br>
Users can also obtain outbound 3PL transactions that are setup for the trading partner, but **Sent to EDI** is set to _No_. <br>
Users can access the workspace by navigating to **EDI > 3PL workspaces > EDI Inventory adjustment**. <br> 

The following subsections will discuss the various tiles and tabs available on the workspace.

### Reconciliations
Access by selecting **Open reconciliations** tile or **Reconciliation** tab. <br>
From within the workspace it is possible to view and even process open EDI Inventory reconciliations created by **Inventory adjustment - Reconciliation** records. <br>
Includes the ability to **Open reconciliation** or **Mark as closed** directly within the Workspace.

Field	                | Description
:--                   |:--
**Company**           | Company account for the reconciliation record
**Date**              | Reconciliation date
**Reconciliation id** |	EDI Inventory reconciliation id
**Site**              |	Site
**Warehouse**         |	Warehouse
**Lines**             | Total number of lines
**Pending lines**     |	Number of pending lines
**Rejected lines**    |	Number of rejected lines
**Variance lines**    |	Number of variance lines

### Transfer
Access by selecting **Open transfer journals** tile or **Transfer** tab. <br>
From within the workspace it is possible to view and even process unposted transfer journals created by **Inventory adjustment - Transfer** records. <br>
Includes the ability to open the transfer **Journal** from the Workspace.

Field	                | Description
:--                   |:--
**Company**           | Company account for the transfer adjustment record
**Journal**           |	Transfer journal id
**Site**              |	Site
**Warehouse**         |	Warehouse
**Lines**             |	Total number of lines
 
### Counting
Access by selecting **Open count journals** tile or **Counting** tab. <br>
From within the workspace it is possible to view and even process unposted movement journals created by **Inventory adjustment - Counting** records. <br>
Includes the ability to open the movement **Journal** from the Workspace.

Field	                | Description
:--                   |:--
**Company**           | Company account for the counting adjustment record
**Journal**           |	Movement journal id
**Site**              |	Site
**Warehouse**         |	Warehouse
**Lines**             |	Total number of lines

### Movement
Access by selecting **Open movement journals** tile or **Movement** tab. <br>
From within the workspace it is possible to view and even process unposted movement journals created by **Inventory adjustment - Movement** records. <br>
Includes the ability to open the movement **Journal** from the Workspace.

Field	                | Description
:--                   |:--
**Company**           | Company account for the movement adjustment record
**Journal**           |	Movement journal id
**Site**              |	Site
**Warehouse**         |	Warehouse
**Date**              | Movement date (from EDI document)
**Lines**             |	Total number of lines

### Open picking list
**Open picking list** can be used in scenarios where a 3PL warehouse has a Picking list posted but not yet sent to EDI and has the Picking list enabled on the trading partner.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create a Vendor purchase order staging table record and update the record as Sent to EDI = Yes
**Reset flag**    |	Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include** |	Ability to exclude/include records from open list

Field	                | Description
:--                   |:--
**Warehouse**         |	Warehouse
**Customer**          | Customer for Sales order picking lists. Blank for Transfer order picking lists
**Picking route**     | Picking route
**Reference**         | Sales order or Transfer order shipment
**Number**            | Reference's number
**Consignment note number** | EDI Consignment note number for the picking list
