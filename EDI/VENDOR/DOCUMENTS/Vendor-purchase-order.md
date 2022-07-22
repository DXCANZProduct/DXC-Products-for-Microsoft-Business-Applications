---
# required metadata

title: EDI Vendor
description: EDI Vendor Documents - Vendor purchase order
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDITradingPartner, PurchTableListPage
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

# Vendor purchase order

## Prerequisites
The following setup is prerequisites for the vendor purchase order

### Vendor setup
EDI > Setup > Vendor setup
1. Create [Order type group](../SETUP/VENDOR-SETUP/Order-type-group.md) - mapped to OrderType on the document.
1. Create [Order purpose groups](../SETUP/VENDOR-SETUP/Order-purpose-group.md) - mapped to OrderPurpose on the document.
2. Create [Carrier mode](../SETUP/VENDOR-SETUP/Carrier-mode.md) - mapped to CarrierMode on the document.
1. Create [Charges code](../SETUP/VENDOR-SETUP/Charges-code.md) - mapped to MiscCode on the document.
1. Create [Payment terms type group](../SETUP/VENDOR-SETUP/Payment-terms-type-group.md) - mapped to TermsTypeCode on the document.
1. Create [Misc charge/allowance indicator](../SETUP/VENDOR-SETUP/Misc-charge-allowance-indicator.md) - mapped to MiscIndicator on the document.

### Document type setup
EDI > Setup > Document types: Vendor purchase order
1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING-PROFILES/Vendor-purchase-order.md) for the document.
3. Create [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.

### Trading partners
EDI > Setup > Trading partners
1. If the vendor [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
1. Assign the **Vendor setup** to the vendor trading partner's options.
1. Add and enable the **vendor purchase order** document to the [Vendor trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

> Note: If the vendor setup mappings are not assigned to the vendor trading partner for an outbound document, the D365/EDI value will be sent, example Order instead of a mapped value. <br>
> If certain fields are not sent on a purchase order, these are not mandatory setup to create and assign to the vendor trading partner; examples carrier mode, charges code etc.

## Processing

### Create purchase order staging
An outbound vendor purchase order can be triggered via the following methods: 
-	**Purchase order**: Accounts payable > Purchase orders > All purchase orders - Select **Confirm** or **Confirmation** on the Purchase tab on the Action Pane. 
-	**Purchase agreements**: Accounts payable > Purchase orders > Purchase agreement - Select **Confirmation** on the Purchase agreement tab on the Action Pane.
-	**Release order**: Accounts payable > Purchase orders > All purchase orders - Select **Confirm** or **Confirmation** on the Purchase tab on the Action Pane; and the purchase order is linked to a purchase agreement

### Purchase order vs. Purchase order change
When an outbound purchase order is created and sent to EDI for the first time, the order purpose is original and falls under EDI document Purchase order.
Subsequent changes, cancellations or confirmations for purchase order acknowledgements falls under EDI document Purchase order change.

A vendor purchase order change can be triggered via the following methods:
-	**Change**: Edit a purchase order header and/or lines and triggering the EDI document via **Confirm** or **Confirmation** on the Purchase tab on the Action Pane.
-	**Cancel**: Accounts payable > Purchase orders > All purchase orders - Select **Cancel** on the Purchase order tab on the Action Pane.
-	**Confirmation**: When confirming a purchase order acknowledgement (POA), automatically or manually via **Confirmation** on the EDI tab on the Action Pane. Purchase order confirmation needs to match to purchase order acknowledgement details, else it will create a change instead of a confirmation order purpose.

### Order type
There are various order types that is determined by the method the purchase order document was created. The mapped value that needs to be sent to each trading partner for each order type can be specified in **Order type group** and assigned to the Trading partner. Options:
- Order
- Agreement
- Release order

### Order purpose
Each purchase order document will also have an order purpose which is specified in **Order purpose group** and assigned to the Trading partner. Options:
- Original
- Change
- Cancellation
- Confirmation

### Summary
#### Purchase order

Description	            | Order type    | Order purpose | EDI Staging / Doc type
|-                      |-              |-              |-     
**Confirm 1st time**    | Order	        | Original	    | Vendor purchase order
**Change and confirm**  | Order	        | Change	    | Vendor purchase order change
**Cancel**              | Order	        | Cancellation	| Vendor prchase order change
**Confirm POA and details match**  | Order	        | Confirmation	| Vendor purchase order change

#### Purchase agreement

Description	            | Order type    | Order purpose | EDI Staging / Doc type
|-                      |-              |-              |-     
**Confirm 1st time**    | Agreement     | Original	    | Vendor purchase order
**Change and confirm**  | Agreement     | Change	    | Vendor purchase order change

#### Release order

Description	            | Order type    | Order purpose | EDI Staging / Doc type
|-                      |-              |-              |-     
**Confirm 1st time**    | Release order	| Original	    | Vendor purchase order
**Change and confirm**  | Release order	| Change	    | Vendor purchase order change
**Cancel**              | Release order	| Cancellation	| Vendor prchase order change
**Confirm POA and details match**  | Release order	| Confirmation	| Vendor purchase order change

## View staging table records
To view the Vendor purchase order staging records, go to **EDI > Documents > Vendor documents > Vendor purchase order**. 
Use this page to review staging and process EDI Vendor purchase order documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Vendor account assigned to the staging record.
**Trading partner GLN**         | The Vendor’s global location number is shown here.
**Purchase order**              | The D365 purchase order number
**PO version number**           | The version of the D365 purchase order number
**Purchase agreement**          | The D365 purchase agreement number for the release order (where applicable)
**Purchase order date**         | The original purchase order date from the purchase order is shown here
**EDI order type**              | The EDI order type is shown here
**EDI order purpose**           | The EDI order purpose is shown here
**Created Date and Time**       | The date and time the selected record was created in the staging table
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record

### Buttons
The following buttons are available on the **Vendor purchase order** Action Pane, tab **Purchase order export**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_
**Outbound files**              | View the outbound file record created by the selected staging record
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page
**Purchase order**              | View the originating purchase order; enabled where the record was created from a purchase order
**Purchase agreement**          | View the originating purchase agreement; enabled where the record was created from a purchase agreement
**Vendor**                      | View the vendor account
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Vendor purchase order**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                      | **PO > EDI tab**
:---                    |:---                                                     |:---
<ins>**Identification FastTab**</ins>		|
<ins>**Identification**</ins>		|
**EDI number**          | EDI Staging table record id                             | Original EDI number
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here      | Company GLN
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	           
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>		|
**Purchase order**          | The D365 purchase order number	
**Purchase order date**     | The original purchase order date from the purchase order is shown here	| Original order date
**EDI order type**          | The EDI order type is shown here. <br> Mapped value from [Order type group](../SETUP/VENDOR-SETUP/Order-type-group.md)  | Order type
**EDI order purpose**       | The EDI order purpose is shown here. <br> Mapped value from [Order purpose group](../SETUP/VENDOR-SETUP/Order-purpose-group.md)  | Order purpose code
<ins>**Status**</ins>	|
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.
<ins>**General FastTab**</ins>  |
<ins>**Details**</ins>  |
**Vendor reference**        | Vendor’s order reference	
**Vendor account**          | Vendor assigned to the purchase order	
**Vendor name**             | Vendor name	
**Trading partner GLN**     | The vendor’s global location number is shown here.	                    | Trading partner GLN
**Company GLN**             | The company’s global location number is shown here.	
**Buyer group**             | The Purchase Order’s Buyer group is shown here.	                        | Buyer group
**Buyer name**              | Buyer name	
**Buyer email**             | Buyer email	
**Buyer phone**             | Buyer phone	
**Company phone**           | Company phone	
**Company name**            | Company name	
**Tax registration number** | Company tax registration number	
<ins>**Vendor invoicing**</ins>		|
**Vendor name**             | Vendor name	
**Vendor primary street number**    | Vendor primary address - street number	
**Vendor primary street**           | Vendor primary address - street	
**Vendor primary city**             | Vendor primary address - city	
**Vendor primary county**           | Vendor primary address - county	
**Vendor primary state**            | Vendor primary address - state	
**Vendor primary ZIP/postal code**  | Vendor primary address - ZIP/postal code	
**Vendor primary country/region**   | Vendor primary address – country/region	
**Tax exempt number**               | Vendor tax exempt number	
<ins>**Customer invoicing**</ins>	|
**Our account number**              | Bill to - Our account number in the vendor’s system. As per ‘Our account number’ loaded on Vendor’s Invoice account	| Bill to
**Name**                            | Bill to - Name	
**Name or description**             | Bill to - Invoice address name	
**Street number**                   | Bill to - Street number	
**Street**                          | Bill to - Street	
**City**                            | Bill to - City	
**County**                          | Bill to - County	
**State**                           | Bill to - State	
**ZIP/postal code**                 | Bill to - ZIP/postal code	
**Country/region**                  | Bill to - Country/region	
<ins>**Version**</ins>		        |
**PO version number**               | The version of the D365 purchase order number	                    | Original version number
**Created date and time**           | The date and time the selected record was created in the staging table	
**Acknowledgement requested**       | Indicates if functional acknowledgement has been requested from the trading partner for the outbound document.	
<ins>**Agreement**</ins>		    |
**Purchase agreement**              | The D365 purchase agreement number (applicable for release orders)	
**Effective date**                  | Purchase agreement effective date	
**Expiration date**                 | Purchase agreement expiration date	
<ins>**Delivery**</ins>		        |
**Delivery name**                   | Ship to - Name	
**Our account number**              | Ship to - Our account number in the vendor’s system. As per ‘Our account number’ loaded on Vendor’s Order account	Ship to
**Store code**                      | Ship to - Store code	
**Street number**                   | Ship to - Street number	
**Street**                          | Ship to - Street	
**City**                            | Ship to - City	
**County**                          | Ship to - County	
**State**                           | Ship to - State	
**ZIP/postal code**                 | Ship to - ZIP/postal code	
**Country/region**                  | Ship to - Country/region	
**ISO**                             | Ship to - Country/region ISO	
**Latitude**                        | Ship to - Latitude	
**Longitude**                       | Ship to - Longitude	
**Delivery date**                   | Required delivery date	                                        | Delivery date
**Site**                            | Storage dimension - Site	                                        | Site
**Warehouse**                       | Storage dimension - Warehouse	                                    | Warehouse
**Delivery terms**                  | Delivery terms	
**Delivery mode**                   | Delivery mode	
**Text**                            | Header note to be sent with purchase order	
**Requester**                       | Requester	                                                        | Requester
**Attention information**           | Attention information	
<ins>**Transportation**</ins>		|
**Shipping carrier**                | Shipping carrier	
**Carrier qualifier**               | Code designating the system/method of code structure used for shipping carrier	
**EDI carrier mode**                | Code specifying the method or type of transportation for the shipment. <br> Mapped value from [Carrier mode](../SETUP/VENDOR-SETUP/Carrier-mode.md)
<ins>**Miscellaneous**</ins>		|
**Misc. indicator**                 | Code which indicates an allowance or charge for the service specified. <br> Mapped value from [Misc. charge/allowance indicator](../SETUP/VENDOR-SETUP/Misc-charge-allowance-indicator.md)	
**EDI charges code**                | Code identifying the service, promotion, allowance, or charge. <br> Mapped value from [Charges code](../SETUP/VENDOR-SETUP/Charges-code.md)
<ins>**Totals**</ins>	            |
**Subtotal amount**                 | Subtotal of all purchase order lines	
**Line discount**                   | Discount for all purchase order lines	
**Misc. amount**                    | Purchase order header Misc. charge/allowance amount	
**Tax amount**                      | Tax amount	
**Round-off**                       | Round-off	
**Total amount**                    | Total amount	
<ins>**Payment**</ins>		        |
**Currency**	                    | Currency	
**Terms code**                      | Payment terms. <br> Mapped value from [Payment terms type group](../SETUP/VENDOR-SETUP/Payment-terms-type-group.md)
**Terms net days**                  | Payment terms net due days calculated from delivery date. <br> Example with delivery date 16/04/2019 <br> •	Current month + 30 days = 44 <br> •	Current month + 2 months + 20 days and payment day = 15th = 90 <br> •	Current quarter + 15 days = 90 <br> •	Current year + 1 month = 290 <br> •	Current week + 7 days = 11 <br> •	Net + 1 month + 15 days = 45 <br> •	COD = 0
**Cash discount**                   | Settlement discount percentage	
**Days**                            | Settlement days	
**Discount amount**                 | Settlement discount amount if paid within settlement days	


### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	                | **Description**	                                        | **PO line > EDI tab**
:---                        |:---                                                       |:---
**Line number**             | The line within the EDI table/file	                    | Line number
**Our item number**         | The D365 item number
**External item number**    | Vendor’s item number	
**Bar code**                | Item’s barcode	
**GTIN**                    | Item’s GTIN	
**Description**             | Purchase order line text	
**Purchase quantity**       | Original purchase quantity	                            | Original ordered quantity
**Unit**                    | Unit of measure of purchase quantity	
**Price unit**              | The quantity of the product that is covered by the purchase price. Usually 1	
**Price multiplier**        | Value to be used to obtain a new value. NetUnitPrice/UnitPrice. Example price before discount $100 and after discount $90 has a price multiplier of 0.9	
**Includes GST**            | Unit prices and unit discounts includes GST	
**Unit Price**              | Unit price for the item	
**Unit discount**           | The amount of the line discount per price unit	
**Unit discount percentage**    | Discount percentage	
**Net unit price**          | Unit price net of all discounts	
**Charges on purchases**    | The purchase charge that is calculated as a charge that is independent of the quantity on the purchase order line	
**Misc charges**            | Miscellaneous charge/allowance allocated to purchase order line (Maintain charges)	
**Misc indicator**          | Code which indicates an allowance or charge for the service specified. <br> Mapped value from [Misc charge/allowance indicator](../SETUP/VENDOR-SETUP/Misc-charge-allowance-indicator.md)
**Line amount excluding tax**   | Net line amount excluding tax	                        | Original line amount
**Line amount tax**         | Line tax amount	
**Line amount including tax**   | Net line amount including tax	
**Minimum release amount**  | Purchase agreement line’s minimum release amount	
**Maximum release amount**  | Purchase agreement line’s maximum release amount	
**Effective date**          | Purchase agreement line effective date	                | Original effective date
**Expiration date**         | Purchase agreement line expiration date	                | Original expiration date
**Currency**                | Currency	
**Inners quantity**         | Unit conversion quantity of inners to outers <br> Example qty 12 ea (inner) per box (outer)	
**Inners unit**             | Inners unit of measure as setup on item’s [pack size](../../CORE/Setup/Item-pack-sizes.md)
**Pack quantity**           | Package quantity. Package (inner or outer) determined by purchase order / purchase order change’s setting profile **Package size – inner/outer**	
**Pack unit**               | Unit determined by purchase order / purchase order change’s setting profile **Package size – inner/outer** <br> Inner and Outer unit setup on Item
**Batch number**            | Batch number for the purchase line	
**Configuration**           | Product dimension - Configuration	
**Color**                   | Product dimension - Colour	
**Size**                    | Product dimension - Size	
**Style**                   | Product dimension - Style	
**Version**                 | Product dimension - Version
**Inventory status**        | Inventory dimension - Inventory status	
**Site**                    | Storage dimension - Site	
**Warehouse**               | Storage dimension - Warehouse	
**Requested receipt date**  | The requested receipt date
**Requester**               | Requester	
**Attention information**   | Attention information	
**Delivery name**           | Address for Delivery – Delivery name	
**Name or description**     | Ship to – Name or description	
**Street number**           | Ship to - Street number	
**Street**                  | Ship to - Street	
**City**                    | Ship to - City	
**County**                  | Ship to - County	
**State**                   | Ship to - State	
**ZIP/postal code**         | Ship to - ZIP/postal code	
**Country/region**          | Ship to - Country/region	
**Store code**              | Ship to - Store code	
**Latitude**                | Ship to - Latitude	
**Longitude**               | Ship to - Longitude	
