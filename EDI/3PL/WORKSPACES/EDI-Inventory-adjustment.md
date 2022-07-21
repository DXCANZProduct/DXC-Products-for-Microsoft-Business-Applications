---
# required metadata

title: EDI 3PL
description: EDI 3PL workspaces - EDI Inventory adjustment
author: jdutoit2
manager: Kym Parker
ms.date: 2022-06-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIInventoryAdjustmentWorkspace
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
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
**Open picking list** can be used in scenarios where a 3PL warehouse has a Picking list posted but not yet sent to EDI and has the 'Picking list' enabled on the trading partner.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create a 3PL Picking list staging table record and update the record as Sent to EDI = Yes
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

### Open shipment advice - Purchase order
**Open shipment advice - Purchase order** can be used in scenarios where a 3PL warehouse has a Purchase order **Receipt list** posted but not yet sent to EDI and has the 'Shipment advice - Purchase order' document enabled on the trading partner.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create a 3PL Shipment advice - Purchase order staging table record and update the record as Sent to EDI = Yes
**Reset flag**    |	Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include** |	Ability to exclude/include records from open list

Field	                | Description
:--                   |:--
**Vendor account**    | Vendor account for the purchase order receipts list
**Purchase order**    | Purchase order for the receipts list
**Receipts list**     | Receipt list
**Delivery terms**    | Delivery terms for the receipts list
**Delivery date**     | Delivery date for the receipts list
**Cancelled**         | Indicates if the receipts list has been cancelled

### Open shipment advice - Return order
**Open shipment advice - Return order** can be used in scenarios where a 3PL warehouse has a Return order sent, but Sent to EDI is set to _No_, and has the 'Shipment advice - Return order' document enabled on the trading partner.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create a 3PL Shipment advice - Return order staging table record and update the record as Sent to EDI = Yes
**Reset flag**    |	Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include** |	Ability to exclude/include records from open list

Field	                | Description
:--                   |:--
**RMA number**        | RMA number for the return order
**Delivery terms**    | Delivery terms for the return order
**Deadline**          | Deadline for the return order
**Return status**     | Return status of the return order

### Open shipment advice - Voyage
**Open shipment advice - Voyage** can be used in scenarios where a 3PL warehouse has a Landed cost Voyage sent, but Sent to EDI is set to _No_, and has the 'Shipment advice - Voyage' document enabled on the trading partner.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create a 3PL Shipment advice - Voyage staging table record and update the record as Sent to EDI = Yes
**Reset flag**    |	Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include** |	Ability to exclude/include records from open list

Field	                | Description
:--                   |:--
**Voyage**            | Landed cost voyage number
**Shipping company**  | Shipping company for the voyage
**Booking reference** | Freight forwarder's booking reference for the voyage
**Voyage status**     | Status for the voyage

