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

The following subsections will describe how to view, process and send Customer purchase order acknowledgements. <br>
The Acknowledgement can be viewed from the [Sales order](#sales-order) and will be populated with default values per Trading partner.<br>
The Acknowledgement can be either [manually](#manually-processing-purchase-order-acknowledgement) processed or [automatically](#automatically-processing-purchase-order-acknowledgement) sent via periodic job. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed.
The created POA record can be viewed for a sales order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Sales order page.<br>

## Prerequisites
The following setup is prerequisites for the customer purchase order acknowledgement

1. If required to put sales orders on hold till the POA has been sent, assign the applicable hold code to [POA pending hold code](../SETUP/CUSTOMER%20SETUP/Hold%20codes.md) in EDI parameters.
2. Create [POA response groups](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) to map the customer's values to EDI POA response groups.
3. Create [Template](../../CORE/Setup/DocumentTypes/File%20templates.md) for the document.
4. Create [Setting profile](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order%20acknowledgement.md) for the document.
5. Create [Outbound filenames](../../CORE/Setup/DocumentTypes/Outbound%20filenames.md) for the document.
6. If the customer [trading partner](../SETUP/Trading%20partner.md) doesn't exist, create the new trading partner.
7. Assign the applicable POA response group to the customer trading partner.
8. Add and enable the customer purchase order acknowledgement document to the [Customer trading partner](../SETUP/Trading%20partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

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
**POA response**	  | Manually set the **Price code** response to mapped value for **Accept price** or **Advise price**

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
**POA response**   |	Manually set the mapped value for: <br> • **Qty code** response to: **Accept item**, **Article withdrawn** (only manual) or **Out of inventory** <br> • **Shipment code** response to: **Complete shipment** or **Part shipment**

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
**Item POA**                | • **Use system pack** - Update the acknowledged pack field to the system pack. Calculated by using unit conversion and rounding setup on the item. <br> • **Use customer pack** -	Update the acknowledged pack field to the customer pack <br> • **Clear response codes** - Clear previously set response codes <br> • **Auto set response codes** - Automatically set the response code
**POA Response**           |	Manually set the mapped value for **Pack code** response to **Pack accept** or **Pack difference**


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
**Item POA**                | • **Use system inner** - Update the acknowledged inner field to the system inner <br> • **Use customer inner** -	Update the acknowledged inner field to the customer inner <br> • **Clear response codes** - Clear previously set response codes <br> • **Auto set response codes** - Automatically set the response code
**POA Response**           |	Manually set the mapped value for **Inner code** response to **Inner accept** or **Inner difference**

### Automatically processing Purchase order acknowledgement

Ability to automatically send customer purchase acknowledgements.
Users can access the periodic job by navigating to **EDI > Periodic tasks > Send customer purchase order acknowledgement**.

By default only sales orders that fall under the following criteria is included in POA being sent automatically:
- Sales orders that doesn’t contain any POA response codes where **Allow auto send** is set to _No_ on [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md#setup-poa-responde-codes)
- Sales orders that are not on hold (excluding POA and POC pending hold codes)
- POA is pending (still required to be sent), which is determined by **POA status** is _Pending_ or _In progress_. A sales order's POA status is set to _Pending_ when the Purchase order acknowledgement setting **Lock order** is set to _Yes_. And changes to **In progress** when clicking on **Acknowledgement** page on the sales order header's EDI tab on the Action Pane and selecting _OK_. 

Additional sales order filter options are:
- Include blank confirmed receipt date – Y/N
- Include blank confirmed ship date – Y/N
- Customer account
- Invoice account
- Users can also add additional filters like site and warehouse 

## View staging table records
To view the Customer purchase order acknowledgement staging records, go to **EDI > Documents > Customer documents > Customer purchase order acknowledgement**. 
Use this page to review staging and process EDI Customer purchase order acknowledgements documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI%20parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – Th staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Customer account assigned to the staging record.
**Trading partner GLN**         | The Customer’s global location number is shown here.
**Customer Requisition**        | Customer purchase order's Customer requisition.
**Sales order**                 |	Sales order number for the staging record.
**Customer reference**          |	Customer purchase order's Customer reference.
**POA code**                    |	POA Header code group as mapped in [POA response code groups](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md#setup-poa-responde-codes)
**Created Date and Time**       | The date and time the selected record was created in the staging table.
**Received**                    |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.

### Buttons
The following buttons are available on the **Customer purchase order acknowledgement** Action Pane, tab **Purchase order acknowledgement**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_.
**Create files**	              | Creates the outbound file for all records where **Staging to target status** is set to _Not started_.
**Outbound files**              | View the outbound file record created by the selected staging record.
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading%20partner.md) page.
**Sales Order**	                | The sales order relating to the selected staging record.
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Customer purchase order acknowledgement**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	              | **Description**	                                      | **Source D365 field**
:---                    |:---                                                   |:---
<ins>**Identification FastTab**</ins>		
<ins>**Identification**</ins>		
**EDI number**          | EDI Staging table record id                           | Sales Order > EDI > Original EDI number
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here    | Sales order > EDI > Company GLN
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	            
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – Th staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.	• **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**General**</ins>	
**Customer account**        |	Customer account for the staging record	           | Sales Order > Customer account
**Sales order**             |	Sales order number for the staging record          | Sales order > Sales order
**Customer requisition**    | Customers purchase order number to be populated in the Customer requisition field of the sales order header.	| Sales order > General > Customer requisition
**EDI order type**          | The EDI order type is shown here.	                            | Sales Order > EDI > EDI order type
<ins>**Status**</ins>	
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.
<ins>**General FastTab**</ins>	
<ins>**POA**</ins>	
**POA code**                |	POA Header response codes	                                    | Sales order > Acknowledgement > POA code
<ins>**Status**</ins>		
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – Th staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.
**Created Date and Time**       | The date and time the selected record was created in the staging table.
<ins>**Other**</ins>	
**Purchase order date**     | The purchase order date from the EDI record is shown here.    | Sales Order > EDI > Original order date
**Package characteristic code** | The code used to for the package contents.	              | Sales Order > EDI > Package characteristic code
**Package label code**      | The code used for the label.	                                | Sales Order > EDI > Package label code
**Advertisement date**	    | The advertisement date applicable for the order	              | Sales Order > EDI > Advertisement date
**Department**              | The customer’s department from the EDI PO is shown here.	    | Sales Order > EDI > Department
**Store zone**              | The store zone from the EDI record is shown here.	            | Sales Order > EDI > Store zone
**Buyer code**              | The customer’s buyer code from the EDI record is shown here.	| Sales Order > EDI > Buyer code
**Retail buyer location**   | The customer’s retail buyer location from the EDI record is shown here.	| Sales Order > EDI > Retail buyer location code
**Purpose code**            | The customer’s purpose code from the EDI record is shown here.	        | Sales Order > EDI > Purpose code
**Our account number**      |	Our account number in the customers system                    | Customer > Account number
<ins>**Delivery address**</ins>
**Delivery name**           |	Address for Delivery	                                        | Sales Order > Delivery Address Information
**City**                    |	Delivery address - City	
**Country/region**          |	Delivery address - Country/region	
**ISO**                     |	Delivery address - Country/region ISO	
**County**                  |	Delivery address - County	
**District**                |	Delivery address - District	
**Post box**                |	Delivery address - Post box	
**State**                   |	Delivery address - State	
**Street**                  |	Delivery address - Street	
**Street number**           |	Delivery address - Street number	
**ZIP/postal code**         |	Delivery address - Zip/postal code	
**Building complement**     |	Delivery address - Building complement	
**Store code**              |	Delivery address - Store code	
<ins>**Version**</ins>
**PO version number**       | The PO version number from the EDI record.	                                | Sales Order > EDI > Original version number

### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	              | **Description**	                                      | **Source D365 field**
:---                    |:---                                                   |:---
**Store code**          |	The store code from the EDI order is shown here.	    | Sales line > EDI > Store code
**Item number**         |	Item number from the sales order	                    | Sales line > Item number
**Barcode**             |	Barcode for the item number from the sales order	    | Sales line > Barcode
**External item number**  |	The external item id specified for this customer/item combination. This is the part number for this item in the Customer’s system.	| Sales line> General > External references > External
**Style**               |	Inventory dimension - Style	                          | Sales line > Style
**Size**                |	Inventory dimension - Size	                          | Sales line > Size
**Colour**              |	Inventory dimension - Colour	                        | Sales line > Colour
**Configuration**       |	Inventory dimension - Configuration	                  | Sales line > Configuration
**POA code shipment**   |	Purchase order acknowledgement code for shipment of the item	| Sales line > EDI > POA response > Customer code > Shipment
**POA code item**       |	Purchase order acknowledgement code for the item <br> Combination of all line item POA codes. <br> Example: PO-IA-PD-LIA <br> PO: Line price - accept <br> IA: Line item - accept <br> PD: Line item - pack difference <br> LIA: Line item - inner accept	<br> Field delimiter: - <br> Note: Line item status is a combination of the following: <br> Price code + Qty code + Pack code + Inner Code. The Customer purchase order acknowledgement document setting **Field delimiter** (can also be blank) is used inbetween the POA codes.              | Sales line > EDI > POA response > Customer code > Price and Quantity
**Currency**            |	The currency of the order	                            | Sales order > Currency
**Unit price excl. tax**  |	The net price per unit excl. tax	                  | Sales line > Price excl. tax
**Unit price incl. tax**  |	The net price per unit incl. tax	                  | Sales line > Price incl. tax
**Line amount excl. tax** |	Line amount excl. tax	                              | Sales line amount > Price excl. tax
**Line amount incl. tax** |	Line amount incl. tax	                              | Sales line amount > Price incl. tax
**Unit**                  |	This is the Unit of measure that the stock has been ordered in    | Sales line > Unit
**Sales quantity**        |	The acknowledged quantity for this line             | Sales line > Quantity
**Acknowledgement inners**  |	Acknowledged quantity of inners per outer	        | Sales line > EDI > POA > Acknowledgement inners
**Acknowledgement pack**    |	Pack quantity acknowledged	                      | Sales line > EDI > POA > Acknowledgement pack
