---
# required metadata

title: EDI 3PL
description: EDI 3PL Documents - Shipment receipt - Return order
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-15
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDI3PLDispositionCodeMapping, SAB_EDI3PLWHSInventStatusMapping, SAB_EDIStagingFormRun_StockTransferReceipt_RMA 
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: 
ms.search.region: IconEDI3PLDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Shipment receipt - Return order

The following subsections will describe how to view and process the Shipment receipt - Return order from the 3PL warehouse. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed.

Processing this document creates an arrival journal against the return order. <br>
Optional document settings also allows for:
- Posting the return order's arrival journal
- Posting the return order's delivery note for the registered stock.
- Cancelling the remaining return quantity.

## Prerequisites
The following setup is prerequisites for the Shipment receipt - Return order

### 3PL setup
EDI > Setup > 3PL setup
1. Create [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) to map the 3PL's values to D365 inventory statuses.
1. Create [Disposition code mapping](../SETUP/3PL-SETUP/Disposition-code-mapping.md) to map the 3PL's values to D365 disposition codes.

### Document type setup
EDI > Setup > Document types: Shipment receipt - Return order
1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
1. Create [Setting profile](../SETUP/SETTING-PROFILES/Shipment-receipt-Return-order.md) for the document.
1. Create [Validation profile](../SETUP/VALIDATION-PROFILES/Shipment-receipt-Return-order.md) for the document.

### Trading partners
EDI > Setup > Trading partners
1. If the warehouse [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
1. Assign the 3PL setup to the warehouse trading partner's options:
    -  Inventory status Id mapping: Options from **EDI > Setup > 3PL setup > Inventory status Id mapping**
    -  Item arrival: Select item arrival journal to use for processing inventory receipts. Options from **Inventory management > Setup > Journal names > Warehouse management**
    -  Disposition code mapping: Options from **EDI > Setup > 3PL setup > Disposition code mapping**
1. Add and enable the **Shipment receipt - Return order** document to the [Warehouse trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - Setting profile
    - Validation profile
    - Search mask

## Processing
Inbound files have the following three steps:
1. **Import** - Imported file can be viewed in **EDI > Files > Inbound files**.
2. **Import to staging** - Imported file is processed to staging record/s. The staging record/s can be viewed at **EDI > Documents > 3PL documents > Stock transfer receipt > Return order**.
3. **Staging to target** - The staging record/s is processed to target. If the EDI shipment receipt is succefully processed the D365 arrival journal will be created for the return order. And if the document setting **Post delivery note** is set to _Yes_, the return order's delivery note will also be posted.

### Create document
![alt text](../../CORE/Image/Create_Document.png "Create document")

### Header checks for Shipment receipt
Header checks are performed when:
1. Importing Shipment receipt file
2. Processing from import to staging
3. Processing from staging to target

### Step 1 - Import
When an EDI file is imported, the file name is key to identifying the trading partner and therefore the document template. See [Trading partners](../../CORE/Setup/Trading-partners.md) for further details.  It is based on this document template that the data within the file is identified and a record created in the EDI staging table in the next step.

> Note: The file mask is used to identify the trading partner and therefore template

### Step 2 - Import to staging - Inbound file validation
When the EDI file is retrieved and imported, there are various validations that are completed before the staging record is created in the EDI staging table.
If the processing of **Import to staging** errors, the Inbound file's **Status** will be set to _Error_ and no staging record created.

**Rule Id**         |	**Details**         
:--                 |:--                  
**Check Template**  |	Identify a template for the Trading partner/Document type. This will be used to identify the whereabouts of data within the file

#### Possible issues and fixes
**Import to staging** errors for EDI file can be viewed in:
- **EDI > Files > Inbound files** filtered to **Status** set to _Error_
- **EDI > Document maintenance**, tab **3PL documents**, tile **File import errors**

At this step the issues are usually around the file not matching the template.
- Does the file have the correct template assigned (General tab, field **Template**):
  - **No**: Use **Reset template** to assign a different template. If this should apply to future documents for the Trading partner, also update in **Trading partners**.
  - **Yes**: Review **Log** and fix the applicable template in **EDI > Setup > Document types**. Examples issues are date format, new field.

Example error for file not matching template: 'Segment '<xml' not found in EDI template mapping'

### Step 3 - Staging to target
If the processing of **Staging to target** errors, the staging record's **Staging to target status** will be set to _Error_ and the D365 stock won't be be picked for the picking list registration.

#### Possible issues and fixes
**Staging to target** errors for Picking list registrations can be viewed in:
- **EDI > Documents > 3PL documents > Stock transfer receipt > Return order** filtered to **Staging to target tatus** set to _Error_
- **EDI > Document maintenance**, tab **3PL documents**, tile **Shipment receipt - Return order errors**
- **EDI > Document maintenance**, tab **3PL documents**, **Documents** page, tab **Shipment receipt - Return order**

At this step the issues are usually around mapping/business logic issues. <br>
Review the **Log** or **Version log** for the applicable record to find the issue. Example errors and method to fix are discussed in below table. <br>
Example errors and possible fixes are discussed in [FAQ](../INTRODUCTION/FAQ.md#shipment-receipt-return-order).

### Validation

[Validation profiles](../SETUP/VALIDATION-PROFILES/Shipment-receipt-Return-order.md) can be specified and linked to the template along with a rule error tolerance which is used to determine how D365 will react.  Options are:
-	**Info** - An infolog is displayed with information only, it is not identified as a warning
-	**Warning** - An infolog is displayed with a warning. It is possible to carry on processing
-	**Error** - An infolog is displayed with an error. It is not possible to carry on processing until the error has been corrected. EDI Status = Error

The following table describes each validation option for the EDI document. It also describes if the validation rule is not met, but only has an info or warning error tolerance, how the D365 target will be created/updated.

Rule Id	                | Details	                            | Info/Warning tolerance updates
:--                     |:--                                    |:--
**Batch Id update**     | Where the batch id received is different to batch id (example ABC123 vs. 123ABC) in the shipment receipt. | Arrival journal posted with 3PL's batch

## View staging table records
To view the Shipment receipt - Return order staging records, go to **EDI > Documents > 3PL documents > Stock transfer receipt > Return order**. <br>
Use this page to review staging and process the EDI documents, post the Arrival journal and optionally post the Product receipt.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company account**     | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and posted the arrival journal and optional product receipt. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Warehouse account assigned to the staging record.
**Trading partner GLN**         | The 3PL’s global location number is shown here.
**RMA number**          | Return order number being received.
**Receipt date**        | Date the stock was received.
**Journal**                     | Arrival journal used to receive the stock.
**Created date and time**       | The date and time the selected record was created in the staging table.
**Sent**                        | Indicates if the **Functional acknowledgement outbound** has been sent to the trading partner for the inbound document record.

### Buttons
The following buttons are available on the **Shipment receipt - Return order**'s Action Pane, tab **Stock shipment receipt**.

**Button**	                    | **Description**
:---                            |:----
**Process stock receipt**   | Process stock receipt for the selected record in the staging table.
**Process all stock receipts**   | Process stock receipt for the staging records that have a **Staging to target status** set to _Not started_. 
**Inbound files**               | View the inbound file record the selected staging record.
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page.
**Return orders**               | If the EDI document has been completed it is possible to inquire on the return orders from this button.
**Item arrival**                | If the EDI document has been completed it is possible to inquire on the item arrival journal from this button.
**Show log**                    | If there are Errors within the document, it is possible to review them at any time using this button. Shows only the current version.
**Version log**                 | View all log versions. When a document’s status is reset and reprocessed, a new log version is created. Can view all log versions.
**Reset Status**                | You can reset the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Shipment receipt - Return order**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all incoming documents staging pages and enables the user to process or view the **Functional acknowledgement outbound** that has been created for the inbound document.

**Button**	                    | **Description**
:---                            |:----
**Send to EDI**                 | If the **Sent** field for the staging record is set to _No_, use this button to create the **Functional acknowledgement outbound** record and also update the **Sent** field to _Yes._
**Reset flag**                  | If the **Sent** field for the staging record has been set to _Yes_, use this button to reset **Sent** to _No_.
**Functional acknowledgement**  | Use this button to view the **Functional acknowledgement outbound** record created for the inbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                    | **D365 header target**
:---                    |:---                                                   |:---
<ins>**Identification FastTab**</ins>   |
<ins>**Identification**</ins>		|
**EDI number**          | EDI Staging table record id                           | 
**Company account**     | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here.   | 
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and posted the arrival journal and optional product receipt. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>	    |
**RMA number**              | Return order number being received.               | Used to find D365 source transaction
**Receipt date**            | Date the stock was received. If setting **Post delivery note** is enabled, this will also be used in posting the delivery note.	| • Arrival journal > Posted on <br> • Packing slip > Ship date
**Journal**                 | Arrival journal created once processing is completed	| • Arrival journal > Journal

### Line fields
The following EDI Line fields are available on the lines page. <br> 

**Field**                   | **Description**                                                           | **D365 line target**
:---                        |:---                                                                       |:---
**Item number**             | The D365 item number                                                      | Used for validation <br> Arrival journal line > Item number
**Lot Id**                  | Lot id for the return order line                                          | Used to find D365 source transaction line
**Quantity**                | Received quantity. This must be a positive quantity.                      | • Arrival journal line > Quantity <br> • Packing slip journal line > Received
**Disposition code**        | Specify how to process an item that is returned by a customer. Mapped value for [Disposition code mapping](../SETUP/3PL-SETUP/Disposition-code-mapping.md)	| Arrival journal line > Disposition code
**Colour**                  | Product dimensions – Colour	                                            | Used for validation
**Size**                    | Product dimensions – Size	                                                | Used for validation
**Style**                   | Product dimensions – Style	                                            | Used for validation
**Configuration**           | Product dimensions – Configuration	                                    | Used for validation
**Version**                 | Product dimensions – Version                                              | Used for validation
**Batch number**            | Tracking dimensions – Batch number <br> If D365 batch doesn’t exists, and document setting allows batch creation this will be used in creating the new D365 batch.                                       | • Arrival journal line > Batch number <br> • Packing slip journal line > Batch number
**Serial number**           | Tracking dimensions – Serial number	                                    | • Arrival journal line > Serial number <br> • Packing slip journal line > Serial number
**Inventory status**        | Storage dimensions – Inventory status. Mapped value for [Inventory status](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md)  | Used for validation

