---
# required metadata

title: EDI Vendor
description: EDI Vendor Documents - Review purchase order
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
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

# Review purchase order

The Vendor EDI module includes modifications to Purchase orders. Users can access **All purchase orders** page by navigating to **Accounts payable > Purchase orders > All purchase orders**.

## Purchase order status

EDI purchase orders will be placed in **External review** if the Trading partner has the following setup:
-	Vendor purchase order document setting profile **Acknowledgement required** is set to _Yes_

## EDI tab
### EDI tab - Buttons
The following buttons have been added to the EDI tab on the Purchase order Action Pane.

**Field**		| **Description**
:--			|:--
<ins>**Purchase order confirmation**</ins>	
**Confirmation**	| Option to manually review the purchase order acknowledgement received from the vendor and process the purchase order confirmation to the vendor. The **Send to EDI** option is also included within this [page](Vendor-purchase-order-acknowledgement.md#processing-purchase-order-confirmation-poc).
**Send to EDI**		| Press this button to manually create the Vendor purchase order confirmation staging record using the confirmed values as per **Confirmation** . This could also be setup to be sent automatically, by setting the Vendor purchase order acknowledgement's **Purchase order confirmation required** to _Yes (PO is auto-confirmed)_.
**Reset flag**		| Select the **Reset flag** button to reset the EDI status to allow for re-sending of the purchase order confirmation to the staging table.
<ins>**Reference**</ins>	
**History**		| Select to view EDI records to the purchase order. See [EDI tab - History](#edi-tab--history) for more detail.
**Trading partners**	| Link to Trading partner page for the purchase order's vendor

### EDI tab – History
All the EDI staging records applicable to the Purchase order can be viewed via the **History** button.

**Field**			| **Description**
:--				|:--
**EDI Document type**		| EDI document type of the staging record
**EDI number**			| EDI number and link to the staging record
**Reference**			| Additional information for the staging record, examples: <br> <ins>Outbound</ins> <br> • **Original** – First vendor purchase order sent <br> • **Change** – Subsequent change/s to the purchase order <br> • **Cancel** – Cancellation sent • **Confirmation** – Confirmation sent for vendor's purchase order acknowledgement <br> <ins>Inbound</ins> <br> • **Header - accept** - Vendor's purchase order acknowledgement response <br> • **ASN345435** – Packing slip as per vendor’s advanced shipping notice <br> • **IN4734743** – Invoice number as per vendor’s purchase invoice
**Created date and time**	| Created date and time of the EDI staging record

## Purchase order EDI header fields

The following EDI fields have been added to the Purchase order and Purchase agreement Header and is available on the EDI fast tab. <br>
**Populated by** will indicate if the field is populated by:
- Original - Purchase order staging record
- Change - Change purchase order staging record
- Original / Change - Vendor purchase order staging record, but can be updated by change purchase order staging record 
- POA - Vendor purchase order acknowledgement staging record
- Trading partner - Vendor trading partner
- EDI calc - Calculated by EDI

**Field**			| **Description**		| **Populated by** 
:--				|:--				|:--							  	
<ins>**Identification**</ins>		
**Original EDI number**		| EDI Vendor purchase order staging table record id			| Original	
**Change EDI number**		| Latest EDI Vendor purchase order change staging table record id	| Change
**Company GLN**			| The company’s global location number is shown here.			| Original
**Trading partner GLN**		| The vendor’s global location number is shown here         | Trading partner
<ins>**General**</ins>		
**Original order date**		| The date the original purchase order version was created is shown here		| Original
**Change order date**		| The date the latest change purchase order version was created is shown here	| Change
**Requester**               | Requester sent on outbound EDI purchase order                                 | Original
**Buyer group**             | Buyer group sent on outbound EDI purchase order                               | Original
**Order type**              | The EDI order type is shown here                                              | Original 
**Order purpose code**      | Latest order purpose code is shown here: <br> • **Original** - Only the original/one EDI purchase order has been sent <br> •	**Change** - Last EDI message sent was a Purchase order change <br> •	**Confirmation** - Last EDI message sent was a Confirmation for a Purchase order acknowledgement <br> •	**Cancellation** - Last EDI message sent was a Cancellation for the PO  | Original / Change 
**Bill to**                 | Our account number (as loaded on Vendor’s Invoice account)                    | Original
**Ship to**                 | Our account number (as loaded on Vendor’s Order account)                      | Original
<ins>**Delivery**</ins>	
**Site**                    | The Site from the latest EDI purchase order is shown here                     | Original / Change
**Warehouse**               | The Warehouse from the latest EDI purchase order is shown here                | Original / Change
**Delivery date**           | The requested receipt date of the latest EDI purchase order is shown here     | Original / Change
<ins>**Version**</ins>	
**Original version number** | The D365 purchase order version number that generated the original EDI order record | Original
**Change version number**   | The D365 purchase order version number that generated the latest change EDI order record    | Change
**Acknowledged version number** | The version number acknowledged as per Vendor’s last Purchase order acknowledgement     | POA
**Acknowledgement status**  | Current status for purchase order acknowledgement and confirmation. <br> Available options: <br> • **Blank** – No purchase order acknowledgement required <br> •	**Acknowledgement pending** – Purchase order acknowledgement required and still pending <br> •	**Acknowledgement received** – Purchase acknowledgement received, and purchase order confirmation not required. Acknowledgement/confirmation process is complete <br> •	**Confirmation pending** – Purchase acknowledgement received, and purchase order confirmation required and still pending <br> •	**Confirmation sent** – Purchase order confirmation has been sent. Acknowledgement/confirmation process is complete | EDI calc
**Acknowledgement status date** | Date of current Acknowledgement status        | EDI calc

## Purchase order EDI line fields
### EDI tab
The following EDI fields have been added to the Purchase order and Purchase agreement * Lines and is available on the **EDI** tab.

**Field**			| **Description**                                       | **Populated by** 
:--			     |:--                                                    |:--
**Line number**     | EDI line number
**Original ordered quantity**   | Purchase quantity sent on original EDI purchase order                     | Original purchase order
**Change ordered quantity**     | Purchase quantity sent on latest change EDI purchase order. <br> Note: Any receipts are deducted on the purchase quantity sent, it only contains the ‘deliver remainder’ at the moment of generating the order change.                              | Change purchase order
**Original line amount**        | Net line amount excluding tax sent on original EDI purchase order         | Original purchase order
**Change line amount**          | Net line amount excluding tax sent on latest change EDI purchase order    | Change purchase order
**Original effective date**     | Effective date sent on original EDI purchase order                        | Original purchase agreement
**Change effective date**	  | Effective date sent on latest change EDI purchase order                   | Change purchase agreement
**Original expiration date**	  | Expiration date sent on original EDI purchase order                       | Original purchase order
**Change expiration date**	  | Expiration date sent on latest change EDI purchase order                  | Change purchase agreement


### EDI acknowledgement tab
The following EDI fields have been added to the Purchase order's Lines and is available on the **EDI acknowledgement** tab. <br>
After selecting the applicable purchase order, the following details available are: 
- EDI order - D365 purchase order values
Once the Vendor purchase order acknowledgement (POA) have been processed, the following values are populated:
- Acknowledged - Acknowledged value received on the vendor purchase order acknowledgement
- Acknowledgement response - The vendor's POA response for the purchase order line
- Confirmation - The confirmation response sent to vendor in response to the purchase order akcnowledgement
- Auto triggered - Indicates if the confirmation was auto triggered else it was manually set by a user on the Confirmation button on the EDI Action Pane

Example:
<br>		| EDI order	        | Acknowledged	    | Acknowledgement response	        | Confirmation	    | Auto triggered
|-          |-                  |-                  |-                                  |-                  |-
**Date**    | 4/12/2019	        | 5/12/2019	        | Header- accepted with reserved    |		            | 
**Price**	| 40	            | 41	            | Line price – advise	            | 41	            | Yes
**Quantity**| 100	            | 100	            | Line item – accept	            | 100	            | Yes
**Shipment**|                   |                   | Line shipment – full		        |                   | Yes
**Pack**	| 10	            | 8	                | Line item – pack difference	    | 10	            | Yes
**Inner**	| 6	                | 6	                | Line item – inner accept	        | 6	                | Yes


#### Auto triggered
Confirmation response's auto triggered values are calculated by:
- **Date**: Not auto trigger option, uses Purchase order header's **Confirmed delivery date**
- **Price**: Vendor purchase order acknowledgement document setting profile **Use vendor price**:
     - **Yes** - acknowledged line's unit price
     - **No** - System calculated unit price for the vendor and item combination
- **Quantity**: Purchase order line's quantity
- **Shipment**: Will the original order quantity be shipped in full:
    - **Line shipment - full** - Full D365 purchase order line quantity has been acknowledged 
    - **Line shipment - partial** -  Partial D365 purchase order line quantity has been acknowledged
- **Pack**: Vendor purchase order acknowledgement document setting profile **Confirmed pack**
    - **Vendor pack** - EDI purchase order acknowledgement line's **Pack quantity**
    - **System pack** - Purchase order acknowledgement document setting profile **Package size - inner/outer** determines if the inner or outer unit determines the system pack. Example: Product has an outer unit of box and inner unit of ea with an unit conversion of 10 between the two units. For an order of 200 ea, the results for system pack would be the following if **Package size - inner/outer** is set to: <br> • Inner: 200 <br> • Outer: 200/10 = 20
- **Inner**: Vendor purchase order acknowledgement document setting profile **Confirmed inner**:
    - **Vendor inner** - EDI purchase order acknowledgement line's **Inners quantity**
    - **System inner** - Products's unit conversion between **Outer unit** and **Inner unit** as setup on EDI FasTab on Product
