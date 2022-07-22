---
# required metadata

title: EDI Vendor
description: EDI Vendor Setup - Document type Setting profiles - Vendor purchase order acknowledgement
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
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

# Vendor document type setting profiles - Purchase order acknowledgement (POA)

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Vendor purchase order acknowledgement**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Acknowledgement**</ins>  |
**Item ID source**  |	Determine the method of item identification used by this vendor when selling products	  | •	**Our Item number** - this is the item ID on the items form <br> •	**External item number** - this is the item Id on the vendor external item form <br> •	**GTIN** - this is the GTIN assigned to an item <br> •	**Barcode** - This is the Barcode assigned to an item.
**Price includes sales tax**  |	Specify if the unit price received from the Vendor includes tax	  | •	**As per purchase order** – The vendor is setup in D365 to match vendor’s method of including/excluding tax in pricing <br> •	**Excluding tax** – Vendor sends pricing excluding tax <br> •	**Including tax** – Vendor sends pricing including tax
**Use vendor price**  |	Select this flag to use the vendor's price on the purchase order	        | •	**Yes** - If there is a variance between the trade agreement /list price stored in D365 and the Vendor’s price received in the purchase order acknowledgement, the vendors price will be used if within the variance range. <br> • **No** - Use system price
**Maximum negative price variance** |	Where **Use Vendor Price** is set to _Yes_: <br> Specify the maximum negative price variance that can occur without warning. 	| It is recommended that these settings are set to at least 0.01 if POA pricing has to be converted to PO pricing (include/exclude tax) to avoid any rounding differences between the two solutions being flagged.
**Maximum positive price variance** |	Where **Use Vendor Price** is set to _Yes_: <br> Specify the maximum positive price variance that can occur without warning	  | It is recommended that these settings are set to at least 0.01 if POA pricing has to be converted to PO pricing (include/exclude tax) to avoid any rounding differences between the two solutions being flagged.
**Package size – inner/outer**      |	Specify if the inner or outer pack quantity is sent on the purchase order confirmation	| •	Inner <br> •	Outer
**Confirmed pack**                  |	Option will be used to automatically set the confirmed pack	  | •	System pack <br> •	Vendor pack
**Confirmed inner**                 |	Option will be used to automatically set the confirmed inner	| •	System inner <br> •	Vendor inner
<ins>**Confirmation**</ins>         |
**Purchase order confirmation required**  |	Specify whether a POC is required for the POA	  | •	**Yes** – if within validation the purchase order is changed to purchase order acknowledgement’s values and posts a standard Purchase order confirmation (new purchase journal version). The **Acknowledgement status** on the purchase order header will change to _Confirmation pending_ once the POA has been received from the vendor for the order. Once the confirmation has been sent, the **Acknowledgement status** will change to _Confirmation sent_. <br> o	**Yes (PO is auto-confirmed)**: automatically sends confirmation to the vendor. <br> o	**Yes (PO is manual confirmed)**: The manual Confirmation form on Purchase order > EDI header > Confirmation can be used to manage values sent on Confirmation. Send to EDI creates the outbound document. <br> When purchase order values match vendor’s purchase order acknowledgement values, a purchase order change with order purpose Confirmation is sent to the vendor and PO status is updated to Confirmed. If values don’t match order purpose Change is sent and purchase order's status remains in _In external review_. <br> Values compared: <br> o	Ordered quantity <br> o	Net unit price <br> o	Discounts <br> o	Batch <br> •	**No** - Confirmation isn’t required, but still have the option to send manually via Purchase order > EDI header > Confirmation
**Purchase order confirmation not required for accept** |	When the Vendor sends a POA with **Header – accept**, this option provides the ability to not send a Purchase order confirmation to the Vendor. 	| •	**Yes** – Purchase order confirmation is not created for POA with Header - accept <br> •	**No** – Purchase order confirmation is created (if required as per previous setting) for the POA with Header - accept

## Acknowledgement and Purchase order confirmation required	
Summary of how the following affects Purchase order's **Status** and **Acknowledgement status**:
- **Vendor purchase order** and **Vendor purchase order change** setting profile's **Acknowledgement required**
- **Vendor purchase order acknowledgement** setting profile's **Purchase order confirmation required**

### Purchase order's Status
When setting profile **Acknowledgement required** is set to:
- **Yes** - Purchase order **Status** is updated to _In external review_ (similar to Vendor collaboration) when sending the purchase order to the Vendor (via clicking Confirm/Confirmation on PO), until an Accept POA is received back from the Vendor OR updated Purchase order values match to vendor’s Purchase order acknowledgement.
- **No** - Purchase order **Status** is updated to _Confirmed_.

### Purchase order's Acknowledgement status
On the EDI FastTab on the purchase order header, the field **Acknowledgement status** is updated as per below after each step.

Acknowledgement required  | Confirmation required | 1. Confirm purchase order               | 2. POA processed        | 3. Confirmation sent
:--                       |:--                    |:--                                      |:--                      |:--
Yes	                      | Yes	                  | Acknowledgement pending	                | Confirmation pending	  | Confirmation sent
Yes	                      | No	                  | Acknowledgement pending	                | Acknowledgement received| Confirmation sent
No	                      | Yes	                  | Blank	                                  | Confirmation pending	  | Confirmation sent
No	                      | No	                  | Blank	                                  | Acknowledgement received|	Confirmation sent


## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Vendor purchase order acknowledgement** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI settings - Vendor documents purchase order acknowledgment
