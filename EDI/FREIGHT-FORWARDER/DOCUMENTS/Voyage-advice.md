---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder Documents - Voyage advice
author: jdutoit2
manager: Kym Parker
ms.date: 2024-04-04
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: Action:SAB_EDIStagingFormRun_FFLCVoyageAdvice
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: 
ms.search.region: IconEDIFreightForwarderDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Voyage advice

Voyage advice document can be used to send Purchase order details to the Freight forwarder. <br>
The following subsections will describe how to view and send the **Voyage advice**. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed.


## Prerequisites
The following setup is prerequisites for the **Voyage advice**

### Document type setup
EDI > Setup > Document types: Voyage creator
1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
2. Create [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.


### Trading partners
EDI > Setup > Trading partners
1. If the Freight forwarder landed cost [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
1. Add and enable the **Voyage advice** document to the [Freight forwarder landed cost trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - File name setup

## Processing

### Create Voyage advice staging
An outbound voyage advice can be triggered via the following method: 

Navigate to **Accounts payable > Purchase orders > All purchase orders**
- Assign applicable **Shipping company** on the Purchase order header Landed cost FastTab.
- To create the outbound staging record use either of the following: 
    - **Send to EDI** on the Purchase order's Action Pane, Purchase tab, Landed cost heading
 	- **Confirmation** or **Confirm** on the Purchase order's Action Pane, Purchase tab

## View staging table records
To view the Voyage advice staging records, go to **EDI > Documents > Freight forwarder landed cost documents > Voyage advice**. <br>
Use this page to review staging and process EDI Vendor purchase order documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company account**     | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and created/added to Landed cost voyage(s). <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Vendor account of **Shipping type** set to _Shipping company_ assigned to the staging record.
**Trading partner GLN**         | The Freight forwarder’s global location number is shown here.
**Created Date and Time**       | The date and time the selected record was created in the staging table
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record

### Buttons
The following buttons are available on the **Voyage creator**'s Action Pane, tab **Voyage creator**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_
**Outbound files**              | View the outbound file record created by the selected staging record
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Voyage advice**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.


### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                    
:---                    |:---                                                   
<ins>**Identification FastTab**</ins>		|
<ins>**Identification**</ins>		|
**EDI number**          | EDI Staging table record id                             
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here      
**Template Id**                 | The EDI template that will be used to create the outbound file               
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>		|
**Customer GLN**           | The Trading partner's GLN
**Purchase order**         | The D365 purchase order number	
**Purchase type**          | Reference type, for example Purchase order
**Vendor account**         | Vendor assigned to the purchase order	
**Vendor name**            | Vendor name	
**Customer reference**     | Vendor’s order reference
<ins>**Status**</ins>	|
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.
<ins>**General FastTab**</ins>  |
<ins>**Details**</ins>  |
**Vendor reference**        | Vendor’s order reference	

### Line fields
The following EDI Line fields are available on the lines page. <br> 

**Field**                   | **Description**                                                           
:---                        |:---                                                                       
**Line number**             | The line within the EDI table/file	
**Line number document**    | The sequential D365 purchase order line number
**Item number**             | The D365 item number
**Bar code**                | Item’s barcode	
**GTIN**                    | Item’s GTIN	
**External item number**    | Purchase order's external item number	
**Name**                    | Purchase order line text	
**Configuration**           | Product dimension - Configuration	
**Color**                   | Product dimension - Colour	
**Size**                    | Product dimension - Size	
**Style**                   | Product dimension - Style	
**Version**                 | Product dimension - Version
**Deliver remainder**       | Purchase line's Deliver remainder quantity                            
**Value**                   | Unit of measure of Deliver remainder
**Delivery date**           | Requested delivery date for the purchase order line
**Confirmed delivery date** | Confirmed delivery date for the purchase order line
**Delivery type**           | Delivery type for the purchase order line, example: Stock
**Country/region of origin**    | Item's Country/region of origin
**State of origin**         | Item's State of origin
**Overdelivery**            | Allowed over delivery % on the purchase order line
**Unit price**              | Unit price for the item on the purchase order line

