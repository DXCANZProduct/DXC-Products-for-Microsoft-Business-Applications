---
# required metadata

title: [EDI Freight forwarder]
description: [EDI Freight forwarder Setup - Document type Setting profiles - Voyage creator]
author: [jdutoit2]
manager: Kym Parker
ms.date: 25/11/2021
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
