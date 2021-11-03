---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Customer purchase order acknowledgement]
author: [jdutoit2]
manager: Kym Parker
ms.date: 1/11/2021
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

# Customer purchase order acknowledgement

EDI customers may require a purchase order acknowledgement (POA) for an order and can be one of the reasons a sales order is being put on hold. Where the [Customer purchase order acknowledgement document setting profile](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order%20acknowledgement.md) **Lock order** is set to _Yes_, the sales order will be put on hold till the the POA has been sent. The Hold code that will be used is determined by the **POA pending hold code** assigned on **EDI > Setup > EDI parameters** tab **Hold codes**.

> Note: Customer purchase order acknowledgement (POA) can only be sent for a sales order created via EDI.

## Sales order
Users can access **All sales orders** page by navigating to **Sales and marketing > Orders > All sales orders** and manage the EDI order's Acknowledgement's details by using the below buttons that have been added to the **EDI** tab on the Action Pane.

Field	                  | Description
:--                     |:--
**Acknowledgement**     |	Select the **Acknowledgement** button to review order details for the POA. The details of this page will be discussed in below.
**Send to EDI**         |	Select the **Send to EDI** button to create the **Customer purchase order acknowledgement** staging table record.
**Reset flag**          |	Select the **Reset flag** button to reset the **EDI status** to allow for re-sending of the POA to the staging table. Note: The POA record on the staging table should be deleted manually before the sales order flag is reset.

## Processing
The POA can be sent [manually](#manually-processing-purchase-order-acknowledgement) or [automatically](#automatically-processing-purchase-order-acknowledgement) to the customer.
Both of these options will be discussed in the following subsections.

### Manually processing Purchase order acknowledgement
The **Acknowledgement** page is accessed by navigating to **Sales and marketing > Orders > All sales orders**, and selecting **Acknowledgement** on the **EDI** tab on the Action Pane.

The Acknowledgement page is split into five tabs:
1. [Header](#header) - Manage the POA header's response for ship and receipt dates. 
3. [Line price](#line-price) - Manage the POA line' price response, example Customer's sales price vs. Net system price. 
4. [Line quantity](#line-quantity) - Manage the POA line' quantity response, example Customer sales quantity vs. Reserved sales quantity.
5. [Line pack](#line-pack) - Manage the POA line' pack response, example Customer pack vs. System pack
6. [Line inner](#line-inner) - Manage the POA line' inner response, example Customer inner vs. System inner

Customer mapped values for POA response codes are setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) and assigned to the Customer trading partner's **POA response code group**.

#### Header
The following tables describe the fields and buttons that are available on the **Header** tab of the Acknowledgement page. <br>
The **Header** POA response codes are managed on this tab.

##### Fields
Field	              | Description
:--                 |:--
<ins>**Delivery Date**</ins>
**Customer**        |	Customer requested ship date (start of delivery window)
**Acknowledged**    |	Acknowledged receipt date. Updates Sales order header's **Confirmed ship date**.
<ins>**Deadline**</ins>
**Customer**        |	Customer requested receipt date (end of delivery window)
**Acknowledged**    |	Acknowledged delivery date to be sent to the customer. Updates Sales order header's **Confirmed receipt date**.
<ins>**POA**</ins>
**POA code**        |	POA header code to be sent to the customer. Displays the mapped value as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) for the following header responses: <br> •	**Header – accept** – Where all response codes are _Accept_ <br> •	**Header - change** - Where the customer and acknowledged dates are different <br> •	**Header - accepted with reserved** - Where the customer and acknowledged dates are the same, however one or more lines have an _Advise_ POA difference code.
**Auto triggered**  |	Indicates if the **POA code** is an auto triggered value.

##### Buttons
It is possible to update the POA response codes by using the available buttons:
Button              | Description
:--                 |:--
**Order POA**       |	Automatically set the response codes. <br> Note: When selected the response codes for all the tabs will be set.  Where auto generated codes are overwritten, the header code should be manually set.
**POA response**    |	Manually set the **POA code** response to mapped values of  <br> • **Change** <br> • **Accepted** <br> • **Not accepted** - only available for manual selection <br> • **Accepted with reserve** <br> If the auto triggered POA code has been manually overridden using this button, the field **Auto triggered** will be set to _No_.

#### Line price
The following tables describe the fields and buttons that are available on the **Line price** tab of the Acknowledgement page. <br>
The **Line price** POA response codes are managed on this tab.

##### Fields
Field	                    | Description
:--                       |:--
**Log**                   |	This will show a warning if the Customer pack does not match the System pack
**Store code**            |	Sales line's store code
**Item number**           |	Item number from the sales order
**Barcode**               |	Barcode for the item number from the sales order
**Product name**          |	Item name for the item number from the sales order
**Unit**                  |	Unit from the sales line
**Customer sales price**  |	Unit price received in the EDI purchase order
**Net system price**      |	Valid trade agreement unit price for the customer, net off discounts
**Acknowledged price**    |	Acknowledged price to be sent to the customer. Note: The acknowledged price will be automatically set as either the customer or system values dependant on the **Use customer price** setting on the [Customer purchase order](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order.md) document type setting profile.
**Price code**            | POA line price code to be sent to the customer. Displays the mapped value as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) for the following line price responses: <br> •	**Line price - accept** - Where the customer and acknowledged price are the same <br> • **Line price - advise** - Where the customer and acknowledged price are different
**Auto triggered item**   |	Indicates if the **Price code** is an auto triggered value
**PO change**             | Indicates if the price was updated by a **Customer purchase order change** record

##### Buttons
It is possible to update the Acknowledged values and POA response codes by using the available buttons for a particular or multiple lines:

Button              | Description
:--                 |:--
**Inventory**       |	Update the dimensions displayed on the POA acknowledgement form
**Item POA**        |	• **Use system price** - Update the acknowledged price field to the system price <br> • **Use customer price**	Update the acknowledged price field to the customer sales price <br> • **Clear response codes** - Clear previously set response codes <br> • **Auto set response codes** - Automatically set the response codes
**POA responses**	  | Manually set the **Price code** response to mapped value for **Accept price** or **Advise price**

#### Line quantity
The following tables describe the fields and buttons that are available on the **Line quantity** tab of the Acknowledgement page. <br>
The **Line item** and **Line shipment** POA response codes are managed on this tab.

##### Fields
Field	                    | Description
:--                       |:--
**Store code**            |	Sales line's store code
**Item number**           |	Item number from the sales order
**Barcode**               |	Barcode for the item number from the sales order
**Product name**	        | Item name for the item number from the sales order
**Unit**                  |	Unit from the sales line
**Customer sales quantity** |	Quantity received in the purchase order
**Reserved sales quantity** |	Reserved quantity for each sales line. If reservation is set to manual, users have to reserve stock first if “Reserved qty” is to be used for POA since it updates the Sales order line as per POA's **Acknowledged quantity**. 
**Acknowledged quantity**   |	Acknowledged quantity to be sent to the customer. Note: The acknowledged quantity will be set as either the customer or reserved values dependant on the **Quantity type** set on the [Customer purchase order acknowledgement](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order%20acknowledgement.md) document type setting profile.
**Qty code**                |	POA line quantity code to be sent to the customer. Displays the mapped value as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) for the following line quantity responses: <br> •	**Line item accept** - Where the customer and acknowledged quantities are the same <br> • **Line item - out of stock** - Where the customer and acknowledged quantities are different <br> • **Line item - withdrawn** - Only available for manual selection.
**Shipment code**           |	POA line shipment code to be sent to the customer. Displays the mapped value as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) for the following line shipment responses: <br> • **Line shipment - full** - Where line item POA response is accept or where line item is out of inventory and the Trading partner setting **No backorder** is set to _Yes._ <br> • **Line shipment - partial** - Where line item POA response is out of inventory and the and the Trading partner setting **No backorder** is set to _No_.
**Auto triggered item**     |	Indicates if the **Qty code** is an auto triggered value
**Auto triggered shipment** |	Indicates if the **Shipment code** is an auto triggered value

##### Buttons
It is possible to update the Acknowledged values and POA response codes by using the available buttons for a particular or multiple lines:

Button              | Description
:--                 |:--
**Inventory**       |	Update the dimensions displayed on the POA acknowledgement form
**Item POA**        | • **Use customer quantity** -	Update the acknowledged quantity field to the customer quantity <br> • **Use reserved quantity** - Update the acknowledged quantity field to the reserved quantity <br> • **Clear quantity** -	Clear previously set acknowledged quantity <br> • **Clear response codes** -	Clear previously set response codes <br> • **Auto set response codes** - Automatically set the response codes
**POA responses**   |	Manually set the mapped value for: <br> • **Qty code** response to: **Accept item**, **Article withdrawn** (only manual) or **Out of inventory** <br> • **Shipment code** response to: **Complete shipment** or **Part shipment**

#### Line pack
The following tables describe the fields and buttons that are available on the **Line pack** tab of the Acknowledgement page. <br>
The **Line item - pack** POA response codes are managed on this tab.

##### Fields
Field	                    | Description
:--                       |:--
**Log**                   |	This will show a warning if the Customer pack does not match the System pack
**Store code**            |	Sales line's store code
**Item number**           |	Item number from the sales order
**Barcode**               |	Barcode for the item number from the sales order
**Product name**          |	Item name for the item number from the sales order
**Unit**                  |	Unit from the sales line
**Customer pack**         |	Pack quantity received in the purchase order
**System pack**           |	Valid system pack for the inner or outer as specified on **Package size - inner/outer** on the settings profile for the Customer purchase order acknowledgement
**Acknowledged pack**     |	Acknowledged pack quantity to be sent to the customer. Note: The automatically acknowledged pack (Customer or System) is set on **Pack type** on the settings profile for the Customer purchase order acknowledgement.
**Pack code**             |	POA line pack code to be sent to the customer. Displays the mapped value as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) for the following line pack responses: <br> • **Line item - pack accept** - Where the customer and acknowledged packs are the same <br> • **Line item - pack difference** - Where the customer and acknowledged packs are different
**Auto triggered item**   |	Indicates if the **Pack code** is an auto triggered value

##### Buttons
It is possible to update the Acknowledged values and POA response codes by using the available buttons for a particular or multiple lines:

Button                      | Description
:--                         |:--
**Inventory**               |	Update the dimensions displayed on the POA acknowledgement form
**Item POA**                | • **Use system pack** - Update the acknowledged pack field to the system pack. Calculated by using unit conversion and rounding setup on the item. <br> • **Use customer pack** -	Update the acknowledged pack field to the customer pack
**Clear response codes**    |	Clear previously set response codes
**Auto set response codes** |	Automatically set the response code
**POA Responses**           |	Manually set the mapped value for **Pack code** response to **Pack accept** or **Pack difference**


#### Line inner
The following tables describe the fields and buttons that are available on the **Line inner** tab of the Acknowledgement page. <br>
The **Line item - inner** POA response codes are managed on this tab.

##### Fields
Field	                    | Description
:--                       |:--
**Log**                   |	This will show a warning if the Customer inner does not match the System inner
**Store code**            |	Sales line store code
**Item number**           |	Item number from the sales order
**Barcode**               |	Barcode for the item number from the sales order
**Product name**	        | Item name for the item number from the sales order
**Unit**                  |	Unit from the sales line
**Customer inners**       | Number of inners received in the purchase order
**System inners**         |	Valid system number of inners. Note: The number of inners is calculated based on the quantity within an outer and inner.
**Acknowledged inners**   |	Acknowledged number of inners. Note: The automatically acknowledged inner (Customer or System) is set on **Inner type** on the settings profile for the Customer purchase order acknowledgement.
**Inner code**            |	POA line inner code to be sent to the customer. Displays the mapped value as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) for the following line inner responses: <br> • **Line item - inner accept** - Where the customer and acknowledged inners are the same <br> • **Line item - inner difference** - Where the customer and acknowledged inners are different
**Auto triggered item**   |	Indicates if the **Inner code** is an auto triggered value

##### Buttons
It is possible to update the Acknowledged values and POA response codes by using the available buttons for a particular or multiple lines:

Button              | Description
:--                 |:--
**Inventory**               |	Update the dimensions displayed on the POA acknowledgement form
**Item POA**                | • **Use system inner** - Update the acknowledged inner field to the system inner <br> • **Use customer inner** -	Update the acknowledged inner field to the customer inner
**Clear response codes**    |	Clear previously set response codes
**Auto set response codes** |	Automatically set the response code
**POA Responses**           |	Manually set the mapped value for **Inner code** response to **Inner accept** or **Inner difference**

### Automatically processing Purchase order acknowledgement
