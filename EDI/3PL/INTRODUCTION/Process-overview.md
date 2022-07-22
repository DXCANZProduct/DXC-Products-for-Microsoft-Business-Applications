---
# required metadata

title: EDI 3PL
description: Overview of the 3PL EDI module process
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: PurchTableListPage, InventTransferOrder, ReturnTableListPage, SAB_EDIDocumentWorkspace
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Process overview

## Picking list and Picking list registration (From warehouse)
When a D365 warehouse has been loaded as a 3PL Trading partner and has the **Picking list** document setup and enabled, posting a sales or transfer order's picking list will create an outbound staging record to send to the 3PL instructing them to ship the stock. <br>
The 3PL then returns the **Picking list registration** document, confirming what has/will be shipped.

The inbound **Picking list registration** documents needs to refer back to original **Picking list**:
- Picking route (PickingRouteID)
- Lot ID (InventTransId) or Line number (LineNum) - depending on document setting 'Line matching strategy'
- Inventory's:
  - Product dimensions
  - Storage dimensions like Inventory status

## Shipment advice and Shipment receipts (To warehouse)
When a D365 warehouse has been loaded as a 3PL Trading partner and has the **Shipment advice** document(s) setup and enabled, the following trigger points will create an outbound staging record to inform the 3PL of inbound stock to their warehouse:
- **Purchase order** - Generate **Receipts list**, by navigating to **Accounts payable > Purchase order > All purchase orders** and **Receive** tab on the Action Pane.
- **Transfer order** - **Ship transfer order**, by navigating to **Inventory management > Inbound orders > Transfer order** and **Ship** tab on the Action Pane.
- **Return order** - Send **Return order**, by navigating to **Accounts receivable > Orders > All return orders** and **Return order** tab on the Action Pane.
- **Voyage** - **Send to EDI**, by navigating to **Landed cost > Voyages > All voyages** and **Manage** tab on the Action Pane.

The 3PL then returns the **Shipment receipt** document (s), confirming what has been received:
- **Purchase order** - Post D365 arrival journal and optionally post purchase order's product receipt for registered stock.
- **Transfer order** - Post D365 arrival journal and optionally receive transfer order.
- **Return order** - Create D365 arrival journal and optionally post arrival journal or delivery note.
- **Voyage** - Create D365 arrival journal and optionally post arrival journal.

The inbound **Shipment receipt** documents needs to refer back to original **Shipment advice**:
- Purchase order
    - Purchase order (PurchId)
    - Receipts list (ReceiptsListId)
    - Lot ID (InventTransId)
    - Inventory's:
        - Product dimensions
        - Storage dimensions like Inventory status
- Transfer order
    - Transfer number (InventTransferId)
    - Lot ID (InventTransId)
    - Inventory's:
        - Product dimensions
        - Storage dimensions like Inventory status
- Return order
    - RMA number (ReturnItemNum)
    - Lot ID (InventTransId)
    - Inventory's:
        - Product dimensions
        - Storage dimensions like Inventory status
- Voyage
    - Voyage (ShipId)
    - Lot ID (InventTransId)
    - Inventory's:
        - Product dimensions
        - Storage dimensions like Inventory status

## Inventory adjustments
Various inbound documents are available for a 3PL to adjust inventory.
- **Transfer** - Used for transfers between batches or between inventory statuses.
- **Counting** - Compares 3PL's on-hand to D365's on hand and creates movement journals for the variances.
- **Reconciliation** - Compares 3PL's on-hand to D365's on hand at the end of specified date and creates movement journals for the accepted variances. Has an additional EDI reconciliation page that users can manage which variances are accepted/rejected. Also has the option on including all inventory for the warehouse.
- **Movement** - 3PL informs company of up or down quantity adjustments in inventory.

## Summary

The following table provides a summary of how the various documents relate for the warehouse (WH) and the minimum D365 transaction created for the inbound document.

Outbound document				| D365 trigger to create outbound	| Inbound document                                          | Inbound D365 transaction
:--						          |:--			                        |:--                                                        |:--
Picking list  <br> • Sales order <br> • Transfer order	| Generate Picking list	(From WH) | Picking list registration | Stock picked
Shipment advice – Purchase order 	| Generate Receipts list (To WH)		| Shipment receipt – Purchase order             | Arrival journal
Shipment advice – Transfer order 	| Ship Transfer order	(To WH)		    | Shipment receipt – Transfer order             | Arrival journal
Shipment advice – Return order 		| Send Return order	(To WH)		      | Shipment receipt – Return order               | Arrival journal
Shipment advice – Voyage 		      | Send to EDI	(To WH)		          	| Shipment receipt – Voyage                     | Arrival journal
<br>						        				          | <br>                      | Inventory adjustment - Transfer               | Transfer journal
<br> 						        			            | <br>                      | Inventory adjustment - Counting               | Movement journal
<br> 						        				          | <br>                      | Inventory adjustment - Reconciliation         | Movement journal
<br> 						        				          | <br>                      | Inventory adjustment - Movement               | Movement journal

## Document errors
When an incoming staging record/document errors, it has not created/updated the target D365 transaction. <br>
When an outgoing staging record/document errors, it has not created the Outbound file. <br>

Staging/document errors can be viewed at: <br>
- **EDI > Documents** - On each document type, user can set filter **Staging to target status** to _Error_
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace.md) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.

### Fixing Staging-to-Target EDI errors 
See [FAQ](FAQ.md#fixing-staging-to-target-edi-errors) for example errors and possible method(s) of fixing.
