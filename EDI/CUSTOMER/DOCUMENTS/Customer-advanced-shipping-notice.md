---
# required metadata

title: EDI Customer
description: EDI Customer Documents - Customer advanced shipping notice
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-14
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIConsignmentNoteTable, SAB_EDIStagingFormRun_ASN
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: 
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer advanced shipping notice (ASN)

EDI customers may require an advanced shipping notice (ASN) for a sales order.

> Note: Customer advanced shipping notice can also be sent for a sales order not created via EDI, where document setting 'Send only for EDI orders' allows it.

The following subsections will describe how to view, process and send Customer advanced shipping notice to applicable Customer Trading partners. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed. <br>
The created ASN record(s) can be viewed for a sales order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Sales order page.<br>

## Prerequisites
The following setup is prerequisites for the customer advanced shipping notice

1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING-PROFILES/Customer-advanced-shipping-notice.md) for the document.
3. Create [Outbound filenames](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.
4. If the customer [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
5. Add and enable the customer advanced shipping notice to the [Customer trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup
6. Assign [ASN line configuration](../SETUP/Warehouses.md) to all the 'ship from' warehouses.

## Processing

### Post packing slip
When posting a packing slip for a sales order, it is possible to add consignment information.
-	From the packing slip posting form, select the **Assign consignment note** button
-	To create a new consignment note record, select **New**
    - Update the **Consignment note number**
    - Select the **Shipping carrier** and **Carrier service**
-	To select a previously created consignment note, select the record
> Note: Consignment notes will be matched to the delivery based on the Delivery Name, Delivery address, Customer account and warehouse.
-	Click **Assign** to attach the consignment note number to the packing slip
-	**Send to EDI**: Where the **ASN strategy** has been configured to:
    - **Single packing slip**, the Send to EDI flag will be set to _Yes_.  Once the packing slip is posted, a Customer advanced shipping notice record will be created in the staging table.
    - **Consolidated packing slip**, the Send to EDI flag will be set to _No_. Users still need to assign the Consignment note, but the ASN must be sent to EDI from the [Consignment notes](#consignment-notes) page before a Customer advanced shipping notice staging record will be created.

> Note: **ASN strategy** is setup on the [Customer advanced shipping notice setting profile](../SETUP/SETTING-PROFILES/Customer-advanced-shipping-notice.md)
and assigned to the Trading partner when setting up the document on their outgoing documents. 

> Note: If the packing slip was posted without assigning a consignment note, it is possible to [add the packing slip](#add-packing-slips-to-a-consignment-note) to a consignment note afterwards.
> The Customer advanced shipping notice setting profile, has the option to **Warn when consignment note not assigned**.

### Consignment notes
EDI requires the delivery to be assigned to a consignment note. The consignment note can contain one or multiple deliveries.
The consignment note can be created when posting the packing slip, or by following the steps as per following subsection.

#### Create a consignment note
To open the **Consignment notes** page, go to **EDI > Inquiries and reports > Consignment notes**.
-	To create a new consignment note, select **New**
-	Select the **Customer account** for the consignment
-	Enter the **Consignment note number**
-	Select the **Shipping carrier** and **Carrier service**
-	Select the **Delivery address information**

#### Add packing slips to a consignment note
To open the **Consignment notes** page, go to **EDI > Inquiries and reports > Consignment notes**. 
-	Select the applicable consignment note
-	To add packing slips, select **Add** from the consignment lines
-	A list of unassigned packing slips for the customer and delivery address will be displayed
-	Select valid record(s) to be assigned to the consignment note
-	Select **Add lines**

#### Create ASN staging record from consignment notes
To open the **Consignment notes** page, go to **EDI > Inquiries and reports > Consignment notes**. 
-	Select the applicable consignment note
-	Select **Send to EDI** to send all consignment information to the Customer advanced shipping notice staging (ASN) table
-	If required, select **Reset flag** to update the consignment and resend the ASN. The ASN record should be deleted in the staging page and outbound files before the flag is reset.


#### Auto generate a consignment note number
The shipping carriers page has an additional option located on the EDI FastTab to enable users to **Auto generate consignment note Id**.  Where this parameter is set to Yes, the **Pro number sequence** must also be set.

To enable the consignment note to be auto generated, the following criteria must be met:
-	**Carrier** must be specified on the sales order
-	**Carrier** must be specified on the Picklist or WHS shipment
-	**ASN strategy** must be _Single packing slip_
-	The packing slip must be posted from the **Pick list registration** or the **WHS Shipment**


## View staging table records
To view the Customer advanced shipping notice staging records, go to **EDI > Documents > Customer documents > Customer advanced shipping notice**. 
Use this page to review staging and process EDI Customer advanced shipping notice documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Customer account assigned to the staging record.
**Trading partner GLN**         | The Customer’s global location number is shown here.
**ASN Number**                  | ASN number record id. The number sequence is determined by [ASN number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Consignment note number**     | Consignment note identification for the delivery
**Delivery note**               | Packing slip number
**Created Date and Time**       | The date and time the selected record was created in the staging table.
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.

### Buttons
The following buttons are available on the **Customer advanced shipping notice** Action Pane, tab **Advanced shipping notice**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_.
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_.
**Outbound files**              | View the outbound file record created by the selected staging record.
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page.
**Consignment notes**           | View the consignment note relating to the packing slip record.
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Customer advanced shipping notice**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                      | **Source D365 field**
:---                    |:---                                                     |:---
<ins>**Identification FastTab**</ins>		|   |
<ins>**Identification**</ins>		|   |
**EDI number**          | ASN number                                              | EDI parameters > Number sequences > ASN number
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here      | 
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	           
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.	• **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|   |
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>	    |   |
**Packing slip**            | Where **ASN strategy** is set to: <br> • **Single** -  the delivery note number will be populated <br> • **Consolidated** - field will be blank. | Consignments > Packing slip
<ins>**Details**</ins>	|   |
**Customer GLN**            | The Customer’s global location number is shown here.	| Sales Order > EDI > Customer GLN
**Carrier**                 | Shipping carrier for the consignment	                | Consignment > Carrier
**Carrier service**         | Carrier service for the consignment	                | Consignment > Carrier service
**Our account number**	    | Our account number in the customers system	        | Customers > Account number
**Customer account**	    | Customer account for the ASN record	
**Document date**		    | Document date for the record
**Name**                    | Customer name	                                        | Consignment > Customer account (Name)
**Ship date**               | Date the goods were shipped	                        | Consignment > Ship date
**Scheduled delivery date** | Scheduled date for delivery	                        | Consignment > Scheduled delivery date
**Sales quantity**          | Total quantity within the consignment	
**Weight**                  | Total weight within the consignment	
**Volume**                  | Total volume within the consignment	
**Shipment count**	        | Total number of packing slips within the consignment	
**Shipment pallet count**	| Total number of lines within the consignment	
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.
<ins>**General FastTab**</ins>	|   |
**Delivery address information**    | Delivery address details
**Warehouse address information**   | Warehouse (ship from) address details


### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	               | **Description**	                                        | **Source D365 field**
:---                       |:---                                                        |:---
**Line number**            | The line withing the D365 packing slip                     | Packing slip > Line number
**Line number document**   | The line within the EDI table/file 
**Item number**            | The D365 item number                                       | Packing slip > Item id
**Text**                   | The D365 item name	                                        | Packing slip > Item Name
**External item number**   | Customer external item number	                            | Sales line > General > External
**Bar code**               | The GTIN or barcode                                        | Sales line > EDI item number
**Store code**	           | Store code for the delivery line	                        | Sales line > Store Code
**Delivery name**          | Delivery name and address information	                    | Consignment/Sales order > Delivery address information
**Quantity**               | Quantity to be delivered	                                | Packing slip > Quantity
**Unit**                   | Unit of measure	                                        | Sales line > Unit
**Sales price**            | Sales line unit price	                                    | Sales line > Unit Price
**Amount**                 | Line amount	
**Weight**                 | Line weight	
**Serial number**		|   |
**Batch number**		|   |
**Configuration**       |	Product dimension - Configuration	                      | Sales line > Product dimension
**Colour**	            |   Product dimension - Colour	                              | Sales line > Product dimension
**Size**                |	Product dimension - Size	                              | Sales line > Product dimension
**Style**               |	Product dimension - Style	                              | Sales line > Product dimension
**Version**             |   Product dimension - Version                               | Sales line > Product dimension
**Expiration date**        | Batch expiration date	
**Manufacturing date**     | Batch manufacturing date	
**Purchase order date**    | The purchase order date from the EDI order is shown here	   | Header > EDI > Purchase order date
**Department**             | The customer’s department from the EDI order is shown here    | Sales order > EDI > Department
**Package characteristic code** | The code used to for the package contents	               | Sales order > EDI > Package characteristic code
**End date/time**          | Date the order was picked	
**Customer requisition**   | Customers purchase order number to be populated in the Customer requisition field of the sales order header | Header > General > Customer requisition
**Customer reference**     | Customers purchase order reference to be populated in the Customer reference field of the sales order header |	Header > General > Customer reference
**Shipment type**          | Status of the shipment (Full/Partial)	
**SSCC**                   | SSCC #. Dependent on the [ASN line configuration](../SETUP/Warehouses.md#asn-line-configurations) set assigned to the sales order’s warehouse | **Picking List** – Pick List Registration SSCC on the pick lines <br> **WHSContainerization** – Container# <br> **WHSDeliveredLP** – License Plate# 
**Packing slip**            | Packing slip ID                                           | Packing slip > Packing slip ID
**Email**                   | Email from the sales order                                     | Sales order > Email
**Telephone**               | Telephone from the sales order                                 | Sales order > Telephone
**Mode of delivery**        |   Mode of delivery from the sales order                        | Sales order > Mode of delivery
**Mode of delivery description**    | Description for the Mode of delivery                   | Mode of delivery > Description
**Country/region**          | Country of origina for the product                             | Product > Origin > Country/region
**Way bill number**         | Way bill number from the Shipment                               | Shipment > Way bill number              
