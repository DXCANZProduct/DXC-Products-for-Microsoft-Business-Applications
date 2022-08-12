---
# required metadata

title: EDI Integration
description: EDI Integration Documents - Customer
author: jdutoit2
manager: Kym Parker
ms.date: 20212-08-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer

Integration systems may require customer data.

The following subsections will describe how to view, process and send Customer to applicable Integration system Trading partners. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed. <br>

## Prerequisites
The following setup is prerequisites for the customer document:

1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
2. Create [Outbound filenames](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.
3. If the Integration systems [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
4. Add and enable the **Customer** document to the [Customer trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - File name setup
    - Change tracking
5. Create a new batch job for the trading partner and document in [Export batch jobs](../../CORE/Setup/EDI-Batches.md#export-batch-jobs)

## Processing

### Change tracking

Integration documents are created by enabling change tracking on the trading partner's outgoing document(s).
The document change tracking's **Full** can be set to _Yes_, in order to send all the records for the tracked table.
Once the staging record has been created for the full version, the Document change tracking's **Full** field will automatically update to _No_ in order to send changes with the next batch run.

If required to send full set of data again, the trading partner's document change tracking's **Full** can be set to _Yes_ again.

## View staging table records
To view the Customer staging records, go to **EDI > Documents > Integration systems documents > Master data > Out > Customer**. 
Use this page to review staging and process EDI Customer documents to an Outbound file.

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
**Line number**            | The line within the EDI table/file.	
**Item number**            | The D365 item number                                       | Packing Slip > Item id
**Text**                   | The D365 item name	                                        | Packing Slip > Item Name
**External item number**   | Customer external item number	                            | Sales Line > General > External
**Bar code**               | The GTIN or barcode                                        | Sales Line > EDI item number
**Store code**	           | Store code for the delivery line	                        | Sales Line > Store Code
**Delivery name**          | Delivery name and address information	                    | Consignment/Sales order > Delivery address information
**Quantity**               | Quantity to be delivered	                                | Packing Slip > Quantity
**Unit**                   | Unit of measure	                                        | Sales Line > Unit
**Sales price**            | Sales line unit price	                                    | Sales Line > Unit Price
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
**Department**             | The customer’s department from the EDI order is shown here    | Sales Order > EDI > Department
**Package characteristic code** | The code used to for the package contents	               | Sales Order > EDI > Package characteristic code
**End date/time**          | Date the order was picked	
**Customer requisition**   | Customers purchase order number to be populated in the Customer requisition field of the sales order header | Header > General > Customer requisition
**Customer reference**     | Customers purchase order reference to be populated in the Customer reference field of the sales order header |	Header > General > Customer reference
**Shipment type**          | Status of the shipment (Full/Partial)	
**SSCC**                   | SSCC #. Dependent on the [ASN line configuration](../SETUP/Warehouses.md#asn-line-configurations) set assigned to the sales order’s warehouse | **Picking List** – Pick List Registration SSCC on the pick lines <br> **WHSContainerization** – Container# <br> **WHSDeliveredLP** – License Plate# 
