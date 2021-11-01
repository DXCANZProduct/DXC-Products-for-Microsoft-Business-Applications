---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Review sales order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 18/10/2021
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

# Review sales order

The Customer EDI module includes modifications to Sales orders. Users can access **All sales orders** page by navigating to **Sales and marketing > Orders > All sales orders**.

## Warnings/Errors
When the sales order validation resulted in a warning or error, the **EDI log** field on the sales order list page can be used to easily identify that there is an issue that might need investigation. <br>
- ![alt text](../IMAGE/Error.png "Error") Error identified with the sales order <br>
- ![alt text](../IMAGE/Warning.png "Warning")  Warning identified with the sales order <br>

To view the actual validation error messages, select the **Log** button available via the **EDI** tab on the Action Pane of the sales order. 

> Note: To setup EDI order validation, see [Setup validation profiles](../SETUP/Validation%20profiles.md) <br>
> Note: For further information relating to validation refer to the validation section(s) in the processing of [Customer purchase order](Customer%20purchase%20order.md).

## Sales order holds
EDI sales orders can be placed on hold for the following reasons (one or more could apply) The below also displays which Hold code would be used as setup in **EDI > Setup > EDI parameters**. 

**Reason**				| **Hold code in EDI parameters** | **Description**		
:--					|:--				  |:--
Validation errors have been identified  | Validation error hold code     | For further information see the Warnings/Errors section on this document	
Purchase order acknowledgement is required for the customer	| POA pending hold code | Where a purchase order acknowledgement (POA) is required for a customer: <br> • **Customer purchase order acknowledgement** document must be setup on the customer trading partner's Outgoing documents. <br> • **Lock order** field set to _Yes_ on the **Customer purchase order acknowledgement** settings profile. <br> This hold will be released once the purchase order acknowledgement has been sent to the customer. 
Purchase order confirmation must be received from the customer after sending the purchase order acknowledgement | POC pending hold code | Purchase order confirmation requirements are setup via: <br> • **Customer purchase order** document must be setup on the customer trading partner's Incoming documents. <br> • **PO confirmation required** set to _Yes_ on the **Customer purchase order acknowledgement** settings profiles . <br> This hold will be released once the purchase order confirmation has been received from the customer. 

An order that has been placed on EDI hold will be visible via the **Hold** field on the sales order list page. 

> Note: When an order has been placed on hold, it will not be possible to release the order for picking or posting delivery notes and invoices. 

## Sales order list Page
**Field**		| **Description**
:--			|:--
**EDI Log**		| Used to identify that a warning or error has occurred.
**POA Status**		| All EDI orders requiring a POA will have an additional status to identify the status of the POA. The EDI **POA status**' available are: <br> •	**Pending** – The purchase order acknowledgement document is enabled and pending for the trading partner (POA document setting **Lock order** is _Yes_) and the order is therefore on hold. <br> • **Sent** - Purchase order acknowledgement has been sent to the customer, and a confirmation is not required (POA document setting **PO confirmation required** is _No_) <br> • **Confirm Pending** – The purchase order acknowledgment has been sent and a confirmation of the purchase order acknowledgement is required by the trading partner and the order is therefore on hold (POA doc setting **PO Confirmation required** is _Yes_ <br> • **POC Received** – The customer has returned a purchase order confirmation for the purchase order acknowledgement. 
**Hold**		| Used to identify the hold status of the EDI order
**Do not process**	| Lock sales order for processing

## EDI tab
### EDI tab - Buttons

The Customer EDI module includes modifications to Sales orders. Users can access **All sales orders** page by navigating to **Sales and marketing > Orders > All sales orders**. <br> The following buttons have been added to the EDI tab on the Action Pane.

**Field**		| **Description**
:--			|:--
<ins>**Validation**</ins>	
**Validate**		| Select the **Validate** button to run validation rules for the sales order. Validation rules are determined by **Validation profile** setup on the Trading partner's **Customer purchase order** document.
**Log**			| Select the **Log** button to view the validation errors that have occurred for the order. 
<ins>**POA**</ins>	
**Acknowledgement**	| Option to manually review and/or process the Purchase order acknowledgement to the Customer. The **Send to EDI** option is also included within this form
**Send to EDI**		| Press this button to manually create the Purchase order acknowledgement staging record using the acknowledged values as per **Acknowledgement** . This could also be setup as periodic job.
**Reset flag**		| Select the **Reset flag** button to reset the EDI status to allow for re-sending of POA to the staging table.
<ins>**Change order**</ins>	
**Changes**		| Select to view all the pending changes for the sales order and approve/reject each. <br> The form is filter to **Pending** status but can be unfiltered to view automatic or previously processed manual changes. See [below](#edi-ribbon--changes) for more detail.
<ins>**Reference**</ins>	
**History**		| Select to view EDI records to the sales order. See [below](#edi-ribbon--history) for more detail.
**Trading partners**	| Link to Trading partner page for the sales order's customer

### EDI tab – Changes
All the EDI changes applicable to the Sales order can be manually approved or rejected via the **Changes** button. Where the Customer purchase order change's settings profile **Processing method** are set to be **Manual**, these would appear as **pending** changes on the changes page. All pending records will be displayed in ascending order.

#### Changes header
Header fields for the **Changes** is discussed in this section.

**Field**		| **Description**
:--			|:--
**EDI number**		| EDI number and link to the staging record
**Status**		| Status of the Customer purchase order change EDI record. Filtered to Pending. <br> Options are: <br> • **Pending** - Where **Processing method** is set to  _Manual_ and the change hasn’t been approved/rejected. <br> • **Approved** - Where **Processing method** is set to _Manual_ and the change has been manually approved and the changes applied to Sales order. If POA is required, an Accept POA record will be created. <br> • **Rejected** - Change has been manually rejected. Sales order has not been updated. If POA is required, a **Reject POA** record will be created. <br> • **Auto** - When the change has automatically been approved and applied to the Sales order. **Processing method** is set to _Automatic_ and all the line order change types received where set with tolerance as _Approve_. If a POA is required, an **Accept POA** record will be created. Where **Processing method** is set to _Automatic_ and the line order change types received where set with tolerance as _Reject with warning log_: the staging record will error. These can still be viewed on Changes, but won’t be applied to Sales order.
**Order purpose code**	| Indicates the purpose of the EDI record. Examples are: <br> •	Change
**Created date and time**	| The date and time the selected record was created in the staging table
**Group control number**	| Customer’s group control number for the staging record

#### Changes lines
Contains the details for each line on the Customer purchase order change record. <br> 
Lines flagged as ‘No change’ will be ignored in the update. 

**Field**			| **Description**
:--				|:--
**Order line change type**	| The Change or Response type code. Code specifying the type of change to the line item.
**Line number**			| The line within the EDI table/file. <br> Used to find applicable sales line to update. Except where adding new lines.
**Item number**			| The item identifier as sent by the trading partner. Used when Item Id source is: <br> • Our item number <br> • External item number
**Bar code**			| The item identifier as sent by the trading partner. Used when Item Id source is: <br> • GTIN <br> • Barcode
**SKU**				| SKU for item
**Site**			| Storage dimension - Site
**Warehouse**			| Storage dimension - Warehouse
**Configuration**		| Inventory dimension - Configuration
**Colour**			| Inventory dimension - Colour
**Size**			| Inventory dimension - Size
**Style**			| Inventory dimension - Style
**Customer sales quantity**	| The customer order quantity for this line
**Customer inners**		| The customer’s inners per outer quantity
**Customer pack**		| The customer’s pack quantity
**Unit**			| The customer unit of measure for this line
**Unit price**			| Customer unit price inclusive of discounts (net price)
**Line amount excluding tax**	| The total line amount excluding tax
**Line amount including tax**	| The total line amount including tax (if provided else 0)
**Requested ship date**		| The requested ship date (delivery window)
**Requested receipt date**	| The requested receipt date (delivery window)
**Delivery name**		| Address for Delivery – Delivery name
**Store code**			| The store code

### EDI tab – History
All the EDI staging records applicable to the Sales order can be viewed via the **History** button.

**Field**			| **Description**
:--				|:--
**EDI Document type**		| EDI document type of the staging record
**EDI number**			| EDI number and link to the staging record
**Reference**			| Additional information for the staging record, examples: <br> <ins>Inbound</ins> <br> • **Original** – First Customer Purchase order received. Only available via Customer purchase order document <br> • **Change** – Subsequent change/s to the order. Only available via Customer purchase order change document. <br> • **Cancel** – Cancellation received. Can be received via Customer purchase order (if **EDI parameters > Allow historic PO types** is enabled) or Customer purchase order change document <br> • **Confirmation** – Confirmation received. Can be received via Customer purchase order (if **EDI parameters > Allow historic PO types** is enabled) or Customer purchase order change document. <br> <ins>Outbound</ins> <br> • **C** - Purchase order acknowledgement response <br> • **ASN345435** – D365 Packing slip for the EDI ASN <br> • **IN4734743** – D365 Sales Invoice number for the EDI record.
**Created date and time**	| Created date and time of the EDI staging record

## Sales order EDI header fields

The following EDI fields have been added to the Sales order's Header and is available on the EDI fast tab. <br>
**Populated by** will indicate if the field is populated by:
- Original - Customer purchase order staging record
- Change - Change purchase order staging record
- Original / Change - Customer purchase order staging record, but can be updated by change purchase order staging record 
- Trading partner - Customer trading partner
- Original / Trading partner - Customer purchase order staging record, but if blank populated by Trading partner
- Doc setting - Customer purchase order document setting profile

**Field**			| **Description**		| **Populated by 
:--				|:--				|:--							  	
<ins>**Identification**</ins>		
**Original EDI number**		| EDI Customer purchase order staging table record id			| Original	
**Change EDI number**		| Latest EDI Customer purchase order change staging table record id	| Change
**Company GLN**			| The company’s global location number is shown here.			| Original
**Customer GLN**		| The customer’s global location number is shown here. <br> Populated by staging's Customer GLN, if staging blank populated by Trading partner | Original / Trading partner
<ins>**General**</ins>		
**Original order date**		| The purchase order date from the EDI order is shown here		| Original
**Change order date**		| The purchase order date from the EDI order change is shown here	| Change
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

**Field**			| **Description**
:--				|:--
**Line number**			| EDI line number
**Store code**			| Store code for the individual line
**EDI item number**		| Item number as provided on EDI inbound document
**Order line change type**  | If the order line was added or updated by a customer purchase order change, the [Order line change type](../SETUP/CUSTOMER%20SETUP/Order%20line%20change%20type%20group.md#setup-order-line-change-type-group) will be displayed. Some examples: <br> • **Add additional item** - The line has been added by a change <br> • **Price change** - The sales line's unit price has been updated by a change <br> • **Delete items** - The sales line's deliver remainder has been cancelled by a change

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
    - **System pack** - Purchase order acknowledgement document setting profile **Package size - inner/outer** determines if the inner or outer unit determines the system pack. Example: Product has a outer unit of box and inner unit of ea with a unit conversion of 10 between the two units. For a order of 200 ea, the results for system pack would be the following if **Package size - inner/outer** is set to: <br> • Inner: 200 <br> • Outer: 200/10 = 20
- **Inner**: Customer purchase order acknowledgement document setting profile **Inner type**:
    - **Customer inner** - EDI order line's **Customer inners**
    - **System inner** - Products's unit conversion between **Outer unit** and **Inner unit**  as setup on EDI FasTab on Product
