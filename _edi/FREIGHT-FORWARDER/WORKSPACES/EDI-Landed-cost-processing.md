---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder workspaces - EDI Landed cost processing
author: Pontus Ek
ms.date: 2024-12-04
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFreightForwarderProcessingWorkspace
audience: Application User
# ms.devlang:
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconEDIVendorDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Workspaces

## EDI Landed cost processing

The EDI Landed cost processing workspace provides a quick and easy way to view the pending actions for EDI Freight forwarders. <br>
Users can obtain purchase orders that needs to be sent as Voyage advice <br>

Users can access the **EDI Landed cost processing workspace** by navigating to **EDI > Freight forwarder workspaces > EDI Landed cost processing**. <br> 

The following subsections will discuss the various tiles and tabs available on the workspace.

### Open purchase order
Filters to D365 purchase orders where a Voyage advice is outstanding for the purchase order:
- Purchase order **Shipping company** is setup as a EDI Freight forwarder landed cost Trading partner and has **Voyage advice** document enabled
- Purchase order status is _Open order_
- Purchase order Voyage advice **Sent to EDI** is set to _No_


In addition, from within the workspace it is possible to view and even process information relating to the selected records. <br>
The following buttons are available in the Workspace and is similar to the buttons found to manually creating the voyage advice on the purchase order.

Field	              | Description
|:--                |:--
**Send to EDI**	    | Select the **Send to EDI** button to create Voyage advice staging table record
**Reset flag**      | Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include**    |	Ability to exclude/include records from open list

The following filters are available

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


