---
# required metadata

title: [EDI 3PL]
description: [Overview of the 3PL EDI module process]
author: [jdutoit2]
manager: Kym Parker
ms.date: 19/11/2021
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
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [jdutoit2]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Process overview

## Picking list and Picking list registration (From warehouse)
When a Warehouse (WH) has been loaded as a 3PL Trading partner and has the **Picking list** document setup and enabled, posting a sales or transfer order's picking list will create an outbound staging record to send to the 3PL instructing them to ship the stock. <br>
The 3PL then returns the **Picking list registration** document, confirming what has/will be shipped.

## Shipment advice and Shipment receipts (To warehouse)
When a Warehouse (WH) has been loaded as a 3PL Trading partner and has the **Shipment advice** document(s) setup and enabled, the following trigger points will create an outbound staging record to inform the 3PL of inbound stock to their warehouse:
- **Purchase order** - Generate **Receipts list**, by navigating to **Accounts payable > Purchase order > All purchase orders** and **Receive** tab on the Action Pane.
- **Transfer order** - **Ship transfer order**, by navigating to **Inventory management > Inbound orders > Transfer order** and **Ship** tab on the Action Pane.
- **Return order** - Send **Return order**, by navigating to **Accounts receivable > Orders > All return orders** and **Return order** tab on the Action Pane.
- **Voyage** - **Send to EDI**, by navigating to **Landed cost > Voyages > All voyages** and **Manage** tab on the Action Pane.

The 3PL then returns the **Shipment receipt** document (s), confirming what has been received.

## Inventory adjustments
Various inbound documents are available for a 3PL to adjust inventory.
- **Transfer** - Used for transfers between batches or between inventory statuses.
- **Counting** - Compares 3PL's on-hand to D365's on hand and creates movement journals for the variances.
- **Reconciliation** - Compares 3PL's on-hand to D365's on hand and creates movement journals for the variances. Has an additional EDI reconciliation page that users can manage which variances are accepted/rejected. Also has the option on including all inventory for the warehouse.
- **Movement** - 3PL informs company of up or down quantity adjustments in inventory.

## Summary

Outbound document				| D365 trigger to create outbound	| Inbound document
:--						          |:--			                        |:--
Picking list (From WH) <br> • Sales order <br> • Transfer order	| Generate Picking list	| Picking list registration
Shipment advice – Purchase order (To WH)	| Generate Receipts list		| Shipment receipt – Purchase order
Shipment advice – Transfer order (To WH)	| Ship Transfer order			  | Shipment receipt – Transfer order
Shipment advice – Return order (To WH)		| Send Return order			    | Shipment receipt – Return order
Shipment advice – Voyage (To WH)		      | Send to EDI			        	| Shipment receipt – Voyage
<br>						        |					        |                           | Inventory adjustment - Transfer
<br> 						        |					        |                           | Inventory adjustment - Counting
<br> 						        |					        |                           | Inventory adjustment - Reconciliation
<br> 						        |					        |                           | Inventory adjustment - Movement


