---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor Documents - Review purchase order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 12/11/2021
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

# Review purchase order

The Vendor EDI module includes modifications to Purchase orders. Users can access **All purchase orders** page by navigating to **Accounts payable > Purchase orders > All sales orders**.

## Purchase order status

EDI purchase orders will be placed in **External review** if the Trading partner has the following setup:
-	Vendor purchase order document setting profile **Acknowledgement required**’ is set to _Yes_

## EDI tab
### EDI tab - Buttons
The following buttons have been added to the EDI tab on the Purchase order Action Pane.

**Field**		| **Description**
:--			|:--
<ins>**Purchase order confirmation**</ins>	
**Confirmation**	| Option to manually review the purchase order acknowledgement received from the vendor and process the purchase order confirmation to the vendor. The **Send to EDI** option is also included within this form
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

The following EDI fields have been added to the Purchase order's Header and is available on the EDI fast tab. <br>
**Populated by** will indicate if the field is populated by:
- Original - Purchase order staging record
- Change - Change purchase order staging record
- Original / Change - Vendor purchase order staging record, but can be updated by change purchase order staging record 
- POA - Vendor purchase order acknowledgement staging record
- Trading partner - Vendor trading partner
- Doc setting - Vendor purchase order document setting profile
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
**Order purpose code**      | Latest order purpose code is shown here: <br> • **Original** - Only the original/one EDI purchase order has been sent <br> •	**Change** - Last EDI message sent was a Purchase order change <br> •	**Confirmation** - Last EDI message sent was a Confirmation for a Purchase order acknowledgement <br> •	**Cancellation** - Last EDI message sent was a Cancellation for the PO  | Change
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


**Advertisement date**		| The advertisement date applicable for the order			| Original
**Package characteristic code**	| The code used to for the package contents				| Original
**Package label code**		| The code used for the label						| Original
**Store zone**			| The store zone from the EDI order is shown here			| Original
**Department**			| The customer’s department from the EDI order is shown here		| Original
**Purpose code**		| The customer’s purpose code from the EDI order is shown here		| Original
**Buyer code**			| The customer’s buyer code from the EDI order is shown here		| Original
**Retail buyer location**	| The customer’s retail buyer location from the EDI order is shown here	| Original
**EDI order type**		| The EDI order type is shown here					| Original
**Order purpose code**		| Latest purpose code: Original, Change, Cancellation or Confirmation	| Original
<ins>**Delivery**</ins>	
**Store code**			| The store code from the EDI order is shown here. <br> Can be updated by order change.	| Original / Change
**Requested receipt date**	| The requested receipt date (delivery window) from the EDI order is shown here. <br> Can be updated by order change.	| Original / Change
**Requested ship date**		| The requested ship date (delivery window) from the EDI order is shown here. <br> Can be updated by order change.	| Original / Change
**Delivery time**		| The delivery time from the EDI order is shown here. <br> Can be updated by order change.	| Original / Change
<ins>**Version**</ins>		
**Original version number**	| The original version number from the EDI order.			| Original
**Change version number**	| The latest PO version number from the EDI order change		| Change
<ins>**Settings**</ins>		
**Bypass duplicate check**	| Used to validate the customer purchase order number. <br> Note: For further information see **Duplicate tolerance** in [Customer purchase order settings profiles](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order.md)			  | Doc setting
**No backorders**		| Identify if the trading partner accepts backorders. <br> Note: Copied from the trading partner setup **No backorders** and used on the **Customer purchase order acknowledgement** to identify full or partial shipments. 			 | Trading partner
<ins>**Status**</ins>		
**POA status**			| Current purchase order acknowledgement status. This field is populated by the EDI module and not editable. Options are: <br> • **Pending** - The POA document setting **Lock order** is set to _Yes_ which makes the POA required but in this scenario haven’t been sent yet. <br> • **Sent** - The POA has been sent and a Confirmation is not required as POA document setting **PO confirmation required** is set to _No_. <br> •	**Confirm pending** - The POA has been sent and a Confirmation is required. POA document setting **PO confirmation required** is set to _Yes_. <br> • **POC received** - The Confirmation has been received from the Customer. | Doc setting, <br> POA and POC

## Sales order EDI line fields
### EDI tab
The following EDI fields have been added to the Sales order's Lines and is available on the **EDI** tab for the applicable sales order.

**Field**			| **Description**                                       | **Populated by** 
:--				    |:--                                                    |:--
**Line number**			| EDI line number                                   | Original / Change
**Store code**			| Store code for the individual line                | Original / Change
**EDI item number**		| Item number as provided on EDI inbound document   | Original / Change
**Order line change type**  | If the order line was added or updated by a customer purchase order change, the [Order line change type](../SETUP/CUSTOMER%20SETUP/Order%20line%20change%20type%20group.md#setup-order-line-change-type-group) will be displayed. Some examples: <br> • **Add additional item** - The line has been added by a change <br> • **Price change** - The sales line's unit price has been updated by a change <br> • **Delete items** - The sales line's deliver remainder has been cancelled by a change  | Change

### POA resonse tab
The following EDI fields have been added to the Sales order's Lines and is available on the **POA resonse** tab. <br>
After selecting the applicable sales order, the following details available are: 
- Customer - Customer purchase order values
Once the Customer purchase order acknowledgement (POA) has been sent, these following values are populated:
- Acknowledged - Acknowledged value sent on the customer purchase order acknowledgement
- Customer code - The customer's mapped value for the response as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md)
- Auto triggered - Indicates if the acknowledgement was auto triggered else it was manually set by a user.

Example:
<br>		| **Customer**	| **Acknowledged**	| **Customer code**			| **Auto triggered**
:--		|:--		|:--			|:--					|:--		
**Net Price**	| 40		| 41			| PA (Line price – advise)		| Yes
**Quantity**	| 100		| 100			| IA (Line item – accept)		| Yes
**Shipment**	|		|			| SF (Line shipment – full)		| Yes
**Pack**	|		| 8			| PD (Line item – pack difference)	| Yes
**Inner**	| 6		| 6			| LIA (Line item – inner accept)	| Yes

#### Auto triggered
POA response's auto triggered values are calculated by:
- **Net price**: Customer purchase order document setting profile **Use customer price**:
    - **Yes** - EDI order line's unit price 
    - **No** - System calculated unit price for the customer and item combination
- **Quantity**: Customer purchase order acknowledgement document setting profile **Quantity type**:
    - **Customer quantity** - EDI order line's quantity
    - **Reserved quantity** - Sales order line's reserved quantity
- **Shipment**: Will there be more shipments for the order line. **POA code** for [POA responde code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md):
    - **Line shipment - full** - Full EDI order line quantity is reserved on the sales order line or Trading partner setting **No backorders** is set to _Yes_. 
    - **Line shipment - partial** -  Partial EDI order line quantity is reserved for the sales order line, or the **Customer purchase order acknowledgement** document setting profile **Quantity type** is set to use _Customer quantity_.
- **Pack**: Customer purchase order acknowledgement document setting profile **Pack type**
    - **Customer pack** - EDI order line's **Customer pack**
    - **System pack** - Purchase order acknowledgement document setting profile **Package size - inner/outer** determines if the inner or outer unit determines the system pack. Example: Product has an outer unit of box and inner unit of ea with an unit conversion of 10 between the two units. For an order of 200 ea, the results for system pack would be the following if **Package size - inner/outer** is set to: <br> • Inner: 200 <br> • Outer: 200/10 = 20
- **Inner**: Customer purchase order acknowledgement document setting profile **Inner type**:
    - **Customer inner** - EDI order line's **Customer inners**
    - **System inner** - Products's unit conversion between **Outer unit** and **Inner unit**  as setup on EDI FasTab on Product
