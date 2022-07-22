---
# required metadata

title: EDI Vendor
description: EDI Vendor Setting profiles - Vendor advanced shipping notice
author: jdutoit2
manager: Kym Parker
ms.date:2021-11-09
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

# Vendor document type setting profiles - Advanced shipping notice (ASN)

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Vendor advanced shipping notice**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Advanced shipping notice**</ins> |
**Item ID source**  |	Determine the method of item identification used by this vendor when selling products	  | •	**Our item number** - this is the item ID on the items form <br> •	**External item number** - this is the item Id on the vendor external item form <br> •	**GTIN** - this is the GTIN assigned to an item <br> •	**Barcode** - This is the Barcode assigned to an item.
**Blank unit**      |	Ability to select which unit to use when ASN staging line’s **Unit** is blank	  | •	**Purchase line unit** - this is the unit id on the purchase order line form <br> •	**Inventory unit** - this is the item’s inventory unit <br> •	**Error** –An infolog is displayed with an error. It is not possible to carry on processing until the error has been corrected. EDI Status = Error 
<ins>**Shipment type**</ins>  |
**Part shipment**   |	Specify the part shipment identifiers for ASN	    | PS
**Final shipment**  |	Specify the final shipment identifiers for ASN	  | FS
**Update Final shipment deliver remainder**     | Ability to update the purchase order line's deliver remainder with final shipment | •	**Yes** - If delivery is marked as Final shipment for the order line, the deliver remainder is updated. This can be used for example where no backorders are allowed and to keep open purchase order quantities accurate. <br> •	**No** - No updates to purchase order line's deliver remainder with final shipment.
<ins>**Arrival journal**</ins> | Only applicable to non-WAX enabled warehouses
**Journal name**    |	Specify the arrival journal name to be used	      | Warehouse management journal names
**Quarantine management** |	Ability to select if arrival journal should be quarantine managed	  | Yes/No
**Auto post journal**     |	When the arrival journal is created, the journal should also be automatically posted	| •	**Yes** – Arrival journal is created, posted and stock registered. If posting errors, staging record will error <br> •	**No** – Arrival journal is created, but not posed
**Auto post receipt**     |	Enabled if **Auto post journal** is set to _Yes_. Option to post purchase order's product receipt for applicable registered stock	| •	**Yes** – Product receipt is posted based on registered stock <br> •	**No** – No additional action
<ins>**Load**</ins>       | Only applicable to WAX enabled warehouses
**Duplicate tolerance**   |	Options how to handle load duplicates created via non-EDI processes (example: Warehouse management parameter > Loads > Automatically create at purchase order entry)	| •	**Error** – Staging will error with not enough deliver remainder available for record <br> •	**Replace** – Deletes the non-EDI load line for the purchase order line <br> •	**Update existing** – The non-EDI load is reduced by EDI ASN. If 0 remaining on non-EDI load, the line is deleted. <br> Example: non-EDI load for quantity 200, and EDI ASN only for quantity 150. Non-EDI load is updated to quantity 50 and new EDI load created for quantity 150

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Vendor advanced shipping notice** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI settings - Vendor documents advanced shipping notice

