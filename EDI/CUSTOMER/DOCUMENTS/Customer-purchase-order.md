---
# required metadata

title: EDI Customer
description: EDI Customer Documents - Customer purchase order
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-05-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SalesTableListPage, SalesAgreementListPage, SAB_EDIStagingFormRun_PO, SAB_EDICustOrderTypeMapping, SAB_EDICustOrderPurposeMapping
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconEDICustomerDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer purchase order

## Prerequisites
The following setup is prerequisites for the customer purchase order

1. If required to put sales orders on hold till the purchase order confirmation has been received, assign the applicable hold code to [POC pending hold code](../SETUP/CUSTOMER-SETUP/Hold-codes.md) in EDI parameters.
2. Create [Purchase order types](../SETUP/CUSTOMER-SETUP/Purchase-order-types.md) to map the customer's values to EDI purchase order types.
3. Create [Order purpose groups](../SETUP/CUSTOMER-SETUP/Order-purpose-group.md) to map the customer's values to EDI order purpose groups.
4. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
5. Create [Setting profile](../SETUP/SETTING-PROFILES/Customer-purchase-order.md) for the document.
6. Create [Validation profile](../SETUP/VALIDATION-PROFILES/Customer-purchase-order.md) for the document.
7. If the customer [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
8. Assign the Purchase order type and Order purpose group to the customer trading partner.
9. Add and enable the customer purchase order document to the [Customer trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - Setting profile
    - Validation profile
    - Search mask

## Target D365 transactions
The following [**Customer EDI order types**](../SETUP/CUSTOMER-SETUP/Purchase-order-types.md) and [**Order purposes**](../SETUP/CUSTOMER-SETUP/Order-purpose-group.md) are supported by each Customer inbound document:

**Document type**		                  | **Order type**	| **Order purpose**
:----                                 |:----            |:----
**Customer purchase order**	          | Order		        | Original <br> Confirmation <br> Cancellation
**Customer purchase order**	          | Agreement		    | Original
**Customer purchase order**	          | Release order	  | Original
**Customer purchase order change**	  | Order		        | Change <br> Cancellation

Inbound files have the following three steps:
1. **Import** - Imported file can be viewed in **EDI > Files > Inbound files**
2. **Import to staging** - Imported file is processed to staging record/s. The staging record/s can be viewed at **EDI > Documents > Customer documents > Customer purchase order**
3. **Staging to target** - The staging record/s is processed to target. Based on the **Order type**, the target will be either a:
    - Sales order (**Accounts receivable > Orders > All sales orders**)
    - Sales agreement (**Accounts receivable > Orders > Sales agreements**

### Create document
![alt text](../../CORE/Image/Create_Document.png "Create document")

### Header checks for Customer purchase order
Header checks are performed when:
1. Importing Customer purchase order file
2. Processing from import to staging
3. Processing from staging to target.


![alt text](../IMAGE/HeaderChecks_CustomerPO.png "Header checks for Customer purchase order")

## Step 1 - Import
When a purchase order file is imported, the file name is key to identifying the customer and therefore the document template. See [Trading partners](../../CORE/Setup/Trading-partners.md) for further details.  It is based on this document template that the data within the file is identified and a record created in the EDI staging table in the next step.

> Note: The file mask is used to identify the trading partner and therefore template

## Step 2 - Import to staging - Inbound file validation
When the purchase order file is retrieved and imported, there are various validations that are completed before the staging record is created in the EDI staging table.
If the processing of **Import to staging** errors, the Inbound file's **Status** will be set to _Error_ and no staging record created.

**Rule Id**         |	**Details**         
:--                 |:--                  
**Check Template**  |	Identify a template for the Customer/Document type. This will be used to identify the whereabouts of data within the file

#### Possible issues and fixes
**Import to staging** errors for Customer purchase orders can be viewed in:
- **EDI > Files > Inbound files** filtered to **Status** set to _Error_
- **EDI > Document maintenance**, tab **Customer documents**, tile **File import errors**

At this step the issues are usually around the file not matching the template.
- Does the file have the correct template assigned (General tab, field **Template**):
  - **No**: Use **Reset template** to assign a different template. If this should apply to future documents for the Trading partner, also update in **Trading partners**.
  - **Yes**: Review **Log** and fix the applicable template in **EDI > Setup > Document types**. Examples issues are date format, new field.

Example error for file not matching template: 'Segment '<xml' not found in EDI template mapping'

## Step 3 - Staging to target
If the processing of **Staging to target** errors, the staging record's **Staging to target status** will be set to _Error_ and no D365 target created i.e. sales order, sales agreement or release order is created. <br>
If setting profile **Skip error lines** are set to _Yes_, the lines that can't be created as sales lines (example item is stopped for sales, or item can't be found) will be skipped and only sales lines created for the non error lines.

### Staging header validation - Sales order
There are various **Order types** that can be processed via the purchase order document. These order types can be specified in **Trading partners** Options and will change the way the record is processed. <br>

> Note: Expectation is the customer sends price _inclusive of discounts_. 

**Rule Id**                 | **Details**               
:---                        |:---                       
**Check Order type**	    | Check the **EDI order type** field on the staging record, which indicates whether the record should create a sales order, sales agreement (blanket order) or release order.
**Duplicate PO number**     | Check the customer purchase order rules to validate the purchase order is valid. If document setting **Duplicate tolerance** doesn’t allow duplicates. If duplicates are allowed, a new D365 Sales order will be created with the same Customer requisition.

### Staging line validation - Sales order

![alt text](../IMAGE/LineChecks_CustomerPO.png "Line checks for Customer purchase order")

**Rule Id**                 | **Details**               
:---                        |:---                 
**No Valid Item**           | No valid item based on the different options available


### Sales order header checks

![alt text](../IMAGE/SalesOrderHeaderChecks_CustomerPO.png "Sales order header checks")

**Rule Id**             | **Details**
:---                    |:---
**Deadline date**       | A check of this date against the standard rules is required. (i.e. Dates are not historical)

### Staging line validation - Release order
An EDI sales order and release order will usually be separated per Distribution Centre (DC) with a breakdown per store.  If it is received per DC, one sales order will be created with each sales order line having a ‘store code’ which is used to identify the final delivery destination. 

![alt text](../IMAGE/LineChecks_CustomerReleaseOrder.png "Line checks for Customer release order")

#### Settings
Settings profiles can be specified and linked to the template which is used to determine how D365 will react.  Options are:

**Setting**                                 | **Details**
:---                                        |:---
Create release order without blanket order	| The action taken when a release order is received without a D365 blanket order

### Sales order line checks

![alt text](../IMAGE/SalesOrderLineChecks_CustomerPO.png "Sales order line checks")

**Rule Id**                                 | **Details**
:---                                        |:---
**Unit of measurement**                     | It should first check that this unit of measurement actually exists, a second check should be the measurement on the inventory table module for sales. If the Customer has a **UOM** mapping assigned, this will also be used to map their value to D365 value.
**Unit price**                              | The unit price should be checked using the standard D365 pricing rules.  If the prices are slightly different it should check both the **Maximum positive and negative tolerance** and **Use customer price** flag on document's setting before giving an error/warning. Example: <br> Item X trade agreement price 10.25 <br> Item Y trade agreement price 8.88 <br> Customer has a min and max tolerance setting of 0.05 <br> Customer does not have their trade agreements entered including tax <br> Customer sends their EDI orders including tax <br> The setting use customer pricing is given <br> Item X EDI file price (before converting) 11.26 (after conversion) 10.24 <br> Item Y EDI file price (before converting) 9.70 (after conversion) 8.82 <br> Template setting against this field is warning. <br> A warning is only given for Item Y because it is outside of the tolerance. 
**Check multiple**                          | The quantity should be devisable by the multiple specified on the customer multiple table, if there isn’t one then it check the sales multiple on the item table.  

### Possible issues and fixes
**Staging to target** errors for Customer purchase order can be viewed in:
- **EDI > Documents > Customer documents > Customer purchase order** filtered to **Staging to target tatus** set to _Error_
- **EDI > Document maintenance**, tab **Customer documents**, tile **Purchase order errors**
- **EDI > Document maintenance**, tab **Customer documents**, **Documents** page, tab **PO**

At this step the issues are usually around mapping/business logic issues. <br>
Review the **Log** or **Version log** for the applicable record to find the issue. <br>
Example errors and possible fixes are discussed in [FAQ](../INTRODUCTION/FAQ.md#customer-purchase-order).

## View staging table records
To view the Customer purchase order's staging records, go to **EDI > Documents > Customer documents > Customer purchase order**. 
Use this page to review staging and process EDI Customer purchase order documents and convert into D365 Sales order, Sales agreement or Release order.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company account**     | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and created a D365 Sales order, Sales agreement or Release order. • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Customer account assigned to the staging record.
**Trading partner GLN**         | The Customer’s global location number is shown here.
**Customer Requisition**        | Customer's purchase order number to be populated in the Customer requisition field of the D365 Sales order header.
**Purchase order date**         | The purchase order date from the EDI record is shown here.
**EDI order type**              | The EDI order type is shown here.
**EDI order purpose**           | The EDI order purpose is shown here. Receiving an Order purpose **Change** will error the staging record, since these should be sent as **Customer purchase order change** document. Only **Original**, **Confirmation** and **Cancellation** order purposes are allowed for **Customer purchase order** document.
**Store code**                  | The store code from the EDI record is shown here.
**Store zone**                  | The store zone from the EDI record is shown here.
**Created Date and Time**       | The date and time the selected record was created in the staging table.
**Sent**                        | Indicates if the **Functional acknowledgement outbound** has been sent to the trading partner for the inbound document record.

### Buttons
The following buttons are available on the **Customer purchase order** Action Pane, tab **Purchase order import**.

**Button**	                    | **Description**
:---                            |:----
**Process selected purchase orders** | Create D365 Sales order, Sales agreement or Release order for the selected record in the staging table.
**Process all purchase order**	| Create all D365 Sales order, Sales agreement or Release order for the staging records that have a **Staging to target status** set to _Not started_. 
**Inbound files**               | View the inbound file record the selected staging record.
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page.
**Sales Order**	                | If the staging record has been completed it is possible to inquire on the **Sales order** or **Release order** it created from this button.
**Sales agreement**             | If the EDI blanket order staging record has been completed it is possible to inquire on the **Sales agreement** it created from this button.
**Customers**                   | Inquire on the Customer for the selected record.
**Show log**                    | If there are Errors within the document, it is possible to review them at any time using this button. Shows only the current version.
**Version log**                 | View all log versions. When a document’s status is reset and reprocessed, a new log version is created. Can view all log versions.
**Reset Status**                | You can reset the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Customer purchase order**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all incoming documents staging pages and enables the user to process or view the **Functional acknowledgement outbound** that has been created for the inbound document.

**Button**	                    | **Description**
:---                            |:----
**Send to EDI**                 | If the **Sent** field for the staging record is set to _No_, use this button to create the **Functional acknowledgement outbound** record and also update the **Sent** field to _Yes._
**Reset flag**                  | If the **Sent** field for the staging record has been set to _Yes_, use this button to reset **Sent** to _No_.
**Functional acknowledgement**  | Use this button to view the **Functional acknowledgement outbound** record created for the inbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                    | **Target D365 field**
:---                    |:---                                                   |:---
<ins>**Identification**</ins>		|   |
**EDI number**          | EDI Staging table record id                           | Sales order > EDI > Original EDI number
**Company account**     | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here.   | Sales order > EDI > Company GLN <br> If the **Company GLN** staging field is blank, the Company GLN on the Trading partner will be used to populate the **Company GLN** on the Sales order header.
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and created a D365 Sales order, Sales agreement or Release order. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|   |
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>	    |   |
**Customer Requisition**    | Customers purchase order number to be populated in the Customer requisition field of the sales order header.	| Sales order > General > Customer requisition
**Purchase order date**     | The purchase order date from the EDI record is shown here.    | Sales order > EDI > Original order date
**EDI order type**          | The EDI order type is shown here.	                            | Sales order > EDI > EDI order type
**EDI order purpose**       | The EDI order purpose is shown here. Receiving an Order purpose **Change** will error the staging record, since these should be sent as **Customer purchase order change** document. Only **Original**, **Confirmation** and **Cancellation** order purposes are allowed for **Customer purchase order** document.	
**Store code**              | The store code from the EDI record is shown here.	            | Sales order > EDI > Store code. <br> And used to populate Sales order delivery address
**Store zone**              | The store zone from the EDI PO is shown here.	                | Sales order > EDI > Store zone
<ins>**General**</ins>	    |   |
**Customer Requisition**    | Customers purchase order number to be populated in the Customer requisition field of the sales order header.	| Sales order > General > Customer requisition
**Customer Reference**      | Customers purchase order reference to be populated in the Customer Reference field of the sales order header.	| Sales order > General > Customer reference
**Purchase order date**     | The purchase order date from the EDI record is shown here.    | Sales order > EDI > Original order date
**Currency**                | The currency of the order	                                    | Sales order > Price and discount > Currency
**Company GLN**             | The company’s global location number is shown here. 	        | Sales order > EDI > Company GLN <br> If the **Company GLN** staging field is blank, the Company GLN on the Trading partner will be used to populate the **Company GLN** on the Sales order header.
**Customer GLN**            | The Customer’s global location number is shown here.  | Sales order > EDI > Customer GLN <br> If the **Trading partner GLN** staging field is blank, the Trading partner GLN on the Trading partner will be used to populate the **Customer GLN** on the Sales order header.
**Buyer code**              | The customer’s buyer code from the EDI record is shown here.	| Sales order > EDI > Buyer code
**Retail buyer location**   | The customer’s retail buyer location from the EDI record is shown here.	| Sales order > EDI > Retail buyer location code
**Purpose code**            | The customer’s purpose code from the EDI record is shown here.	        | Sales order > EDI > Purpose code
**Department**              | The customer’s department from the EDI PO is shown here.	                | Sales order > EDI > Department
**Package characteristic code** | The code used to for the package contents.	                        | Sales order > EDI > Package characteristic code
**Package label code**      | The code used for the label.	                                            | Sales order > EDI > Package label code
**Advertisement date**	    | The advertisement date applicable for the order.	                        | Sales order > EDI > Advertisement date
**Comments**                | Header comments for the order.                                            | Sales order > EDI > Comments
**Sales origin**            | The customer's sales origin from the EDI PO is shown here.                | Sales order > Sales origin
**Template Id**             | The EDI templates used to create the staging table record	                
**PO version number**       | The PO version number from the EDI record.	                                | Sales order > EDI > Original version number
<ins>**Delivery**</ins>	    |   |
**Delivery Name**           | Address for Delivery	                                                    | Sales order > Delivery Address. If the store code wasn't used to populate sales order address.
**Store zone**              | The store zone from the EDI record is shown here.	                        | Sales order > EDI > Store zone
**Store code**              | The store code from the EDI record is shown here.	                        | Sales order > EDI > Store code
**Name or description** <br> **Street number** <br> **Street** <br> **City** <br> **Suburb** <br> **State** <br> **Postcode** <br> **Country/region** |Address for delivery	 | Sales order > Delivery Address <br> Store code populate in staging record: <br> •	**Y** – Determines Delivery address <br> •	**N** – EDI delivery address
**Requested ship date**     | The requested ship date (delivery window) from the EDI record is shown here.	| Sales order > EDI > Requested ship date and <br> Sales order > Requested ship date: If staging blank will be populated by Transport days
**Requested receipt date**  | The requested receipt date (delivery window) from the EDI record is shown here.	| Sales order > EDI > Requested receipt date <br> Sales order > Requested receipt date
**Delivery time**           | The delivery time from the EDI record is shown here.                      | Sales order > EDI > Delivery time
**Reserved**                | Ten **Reserved** fields available. These fields will populate the same reserved fields on all the outbound customer documents

### Line fields
The following EDI Line fields are available on the lines page.

**Field**                   | **Description**                                                           | **Target D365 field**
:---                        |:---                                                                       |:---
**Line number**             | The line within the EDI table/file. Supports integer values 1, 10         | Sales line > EDI > General > Line number
**Line number** (LineNumText)    | The line within the EDI table/file. Use this field if the line number format requires field type String. Supports 001, 1, 10  | Sales line > EDI > General > Line number (LineNumText)
**Item number**             | The item identifier as sent by the trading partner. 	| Sales line > EDI > General > EDI Item number <br> When document type setting **Item Id source** is: <br> • **Our item number** or <br> • **External item number** <br> used to determine: Sales line > Item number
**Bar code**                | The item identifier as sent by the trading partner. 	| When document type setting **Item Id source** is: <br> • **GTIN** or <br> • **Barcode** <br> used to determine: Sales line > Item number
**SKU**                     | SKU for item	
**Unit Price**              | Customer unit price inclusive of discounts (net price)	                | Sales line > Unit price <br> If document setting **Use customer price** is set to _Yes_
**Customer sales quantity** | The customer order quantity for this line.	                            | Sales line > EDI > POA response > Customer > Quantity
**Unit**                    | The customer unit of measure for this line.
**Line amount excluding tax**   | The total line amount excluding tax.	                                | Sales line > Unit price <br> If document setting's **Use customer price** is set to _Yes_ AND <br> Staging **Unit price** is blank AND <br> document setting's **Prices include GST** is set to _No_: <br> Sales line **Unit price** is calculated by **Line amount excluding tax** / **Customer sales quantity**
**Line amount including tax**   | The total line amount including tax (if provided else 0)	            | Sales line > Unit price <br> If document setting's **Use customer price** is set to _Yes_ AND <br> Staging **Unit price** is blank AND <br> Document setting's **Prices include GST** is set to _Yes_: <br> Sales line unit price is calculated by **Line amount including tax** / **Customer sales quantity**
**Customer inners**         | The customer’s inners per outer quantity	                                | Sales line > EDI > POA response > Customer > Inner
**Customer pack**           | The customer’s pack quantity	                                            | Sales line > EDI > POA response > Customer > Pack
**Configuration** <br> **Colour**  <br> **Size** <br> **Style** <br> **Version**  | Product dimension - Configuration <br> Product dimension - Colour <br> Product dimension - Size <br> Product dimension - Style  <br> Product dimension - Version | Sales line > Product dimension <br> If Item id Source <> Our item number and the External item number/ GTIN/Barcode is unique per variant, the customer doesn’t have to provide Variant details and EDI will find and populate the inventory dimensions on the sales line. <br> Where the product variant isn't provided by Staging, GTIN, Barcode or External item number, the default product variant will default to the sales order line.
**Site**                    | Storage dimension - Site	                                                | Sales line > Site <br> If staging blank will be populated by Sales order Header. If the customer has no default to populate the Sales order Header, the default site/warehouse on the item’s sales order default order settings will be used.
**Warehouse**               | Storage dimension - Warehouse	                                            | Sales line > Warehouse <br> If staging blank will be populated by Sales order Header. If the customer has no default to populate the Sales order Header, the default site/warehouse on the item’s sales order default order settings will be used.
**Store code**              | The store code from the EDI saging line is shown here.	                | Sales line > EDI > Store code <br> EDI supports different store codes on line level
**Delivery name**           | Address for Delivery – Delivery name	
**Requested ship date**     | The requested ship date (delivery window) from the EDI line record is shown here.	| Sales line > Delivery > Requested ship date <br> If staging blank will be populated by Sales order Header
**Requested receipt date**  | The requested receipt date (delivery window) from the EDI line record is shown here.	| Sales line > Delivery > Requested receipt date <br> If staging blank will be populated by Sales order Header
**Comments**                | Line comments for the order line.                                            | Sales line > EDI > Comments
**Item description**        | Item description for the order line.                                         | Sales line > EDI > Item description
**Created**                 | Added to staging lines to view which lines were not created as sales order lines with **Skip order lines** functionality |

