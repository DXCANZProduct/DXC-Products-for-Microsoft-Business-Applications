---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder Setup - Document type Setting profiles - Voyage creator
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDITradingPartner, SAB_EDIDocumentTypeTable
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Freight forwarder document type setting profiles - Voyage creator

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Voyage creator**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Item ID source**  |	Determine the method of item identification used by this freight forwarder	| •	**Our Item number** - this is the item ID on the items form <br> •	**External item number** - this is the purchase order’s external item ID <br> •	**GTIN** - this is the GTIN assigned to an item <br> •	**Barcode** - This is the Barcode assigned to an item.
**Allow purchase order over delivery**  |	Increase deliver remainder on purchase order (PO) |	If Voyage qty > PO remainder <br> •	**Yes** – Voyage is created, and PO deliver remainder increased <br> •	**No** – Staging record errors, and Voyage isn’t created
**Allow transfer order over delivery**  |	Increase ship and receive remain on transfer order (TO) |	If Voyage qty > TO remainder <br> •	**Yes** – Voyage is created, and TO deliver remainder increased <br> •	**No** – Staging record errors, and Voyage isn’t created
**Duplicate tolerance** |	If external voyage id/booking reference already exists	          | •	**Accept** – Add to existing Open Voyage <br> •	**Warning** – Creates new Voyage and staging record has Warning log <br> •	**Error** – Staging record errors, and Voyage isn’t created
**Source line search strategy** |	Determines which source line to use when PO/TO contains multiple lines for same item + dims. See following subsection for additional details	| •	Top down <br> •	Expected date <br> •	Quantity

### Source line strategy
When a purchase or transfer order contains multiple open order lines for the same item and dimensions (size, color, configuration or style), the source line strategy is utilized to determine which line/s to allocate to the voyage.
-	**Top down** - Order lines are allocated according to line number, from top down.
-	**Expected date** - Order line with delivery date closest to voyage’s ship date.
-	**Quantity** - Order line with closest match to voyage quantity (order line qty >= voyage qty)

If there are multiple matches for date or qty, strategy defaults to top down.

#### Example
Source transactions with all same item and dimensions:

Order line no	  | Qty	  | Delivery date
:--             |:--    |:--
1	              | 90	  | 1 March 2022
2	              | 110	  | 15 March 2022
3	              | 120	  | 29 March 2022

Voyage: Qty 100 and ship date 28 March 2022. <br>
Each strategy will use the following source line number(s):

Top down	            | Expected date	  | Quantity
:--                   |:--              |:--
Line 1 (qty 90) <br> Line 2 (qty 10)  | Line 3 (qty 100) | Line 2 (qty 100)

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Voyage creator** for the Freight forwarder landed cost Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI setting voyage creator
