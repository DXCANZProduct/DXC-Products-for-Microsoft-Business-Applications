---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL Documents - Shipment advice - Return order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 23/11/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [EDI]
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

# Shipment advice - Return order

The **Shipment advice - Return order** document enables companies to send inbound customer return order details to their 3PL warehouse. <br>
In return the 3PL will confirm receipt of the stock with document **Shipment receipt - Return order** which will create an arrival journal with optional document settings to automatically post the arrival journal, post the delivery note and/or cancel remaining return quantity.

## Prerequisites
The following setup is prerequisites for the Shipment advice - Return order

### 3PL setup
EDI > Setup > 3PL setup
1. Create [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) to map the 3PL's values to D365 inventory statuses.

### Document type setup
EDI > Setup > Document types: Shiment advice - Return order
1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING-PROFILES/Shipment-advice---Return-order.md) for the document.
3. Create [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.

### Trading partners
EDI > Setup > Trading partners
1. If the warehouse [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
1. Assign the **3PL setup** to the warehouse trading partner's options:
    - Inventory status Id mapping: Options from **EDI > Setup > 3PL setup > Inventory status Id mapping**
1. Add and enable the **Shipment advice - Return order** document to the [3PL trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

> Note: If the 3PL setup mappings are not assigned to the warehouse trading partner for an outbound document, the D365/EDI value will be sent, example inventory status of Available instead of a mapped value. <br>

## Processing

### Create shipment advice staging
An outbound shipment advice for return orders can be triggered via the following method: 
-	**Return order**: Accounts receivable > Orders > All return orders - Select **Return order** under the **Send** heading on the **Return order** tab on the Action Pane. 

## Inbound document
Once the shipment has been received by the 3PL, the shipment receipt information is sent back via the inbound **Shipment receipt - Return order** document.

## View staging table records
To view the shipment advice staging records, go to **EDI > Documents > 3PL documents > Stock transfer advice > Return order**. 
Use this page to review staging and process EDI Shipment advice - Return order documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | 3PL account assigned to the staging record
**Trading partner GLN**         | The 3PL’s global location number is shown here
**RMA number**                  | Return Order number
**Delivery terms**              | Delivery terms for the sales order
**Expected delivery date**      | Expected receipt date from the sales order
**Created date and time**       | The date and time the selected record was created in the staging table
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record

### Buttons
The following buttons are available on the **Stock transfer advice > Return order**'s Action Pane, tab **Stock shipment advice**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_
**Outbound files**              | View the outbound file record created by the selected staging record
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page
**All return orders**           | View the return order
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Stock transfer advice > Return order**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                      | **D365 source**
:---                    |:---                                                     |:---
<ins>**Identification FastTab**</ins>		
<ins>**Identification**</ins>		
**EDI number**          | EDI Staging table record id                             | Original EDI number
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here      | Company GLN
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	            
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.	<br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>		
**Delivery terms**          | Delivery terms for the return order	                    | Sales order > Delivery terms
**Expected delivery date**  | Expected receipt date from the return order	            | Return order > Deadline
<ins>**Status**</ins>		
**Group control number**    | Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.	
**Received**                | Indicates if the Functional acknowledgement inbound has been received from the trading partner for the outbound document record.	
<ins>**General FastTab**</ins>  
<ins>**Details**</ins>          
**Customer reference**      | Customers reference	                                    | Return order > Customer reference
**Customer requisition**    | Customers purchase order number	                        | Return order > Customer requisition
**Expected delivery date**  | Expected receipt date from the return order	            | Return order > Deadline
**Delivery terms**          | Delivery terms for the transfer order	                    | Sales Order > Delivery Terms
<ins>**Delivery**</ins>     | Return order > Warehouse’s address                        | Return order > Delivery Address
**Name**                    | Delivery name	                                            | Return order > Delivery Address
**Delivery address**        | Delivery/Warehouse address details	                    | Return order > Delivery Address
**Post box**                | Delivery address - Post box	                            | Return order > Delivery Address
**Building complement**     | Delivery address - Building complement	                | Return order > Delivery Address
**Street number**           | Delivery address - Street number	                        | Return order > Delivery Address
**Street**                  | Delivery address - Street	                                | Return order > Delivery Address
**State**                   | Delivery address - State	                                | Return order > Delivery Address
**ZIP/postal code**         | Delivery address - ZIP/postal code	                    | Return order > Delivery Address
**District**                | Delivery address - District	                            | Return order > Delivery Address
**City**                    | Delivery address - City	                                | Return order > Delivery Address
**County**                  | Delivery address - County	                                | Return order > Delivery Address
**Country/region**          | Delivery address - Country/region	                        | Return order > Delivery Address
**ISO**                     | Delivery address - ISO	                                | Return order > Delivery Address
<ins>**Sender address**</ins>   | Sender/Customer’s primary address details	            | Return order > Customer account’s Primary address details
**Post box**                | Sender address - Post box	                                | Return order > Customer account’s Primary address details
**Building complement**     | Sender address - Building complement	                    | Return order > Customer account’s Primary address details
**Street number**           | Sender address - Street number	                        | Return order > Customer account’s Primary address details
**Street**                  | Sender address - Street	                                | Return order > Customer account’s Primary address details
**State**                   | Sender address - State	                                | Return order > Customer account’s Primary address details
**ZIP/postal code**         | Sender address - ZIP/postal code	                        | Return order > Customer account’s Primary address details
**District**                | Sender address - District	                                | Return order > Customer account’s Primary address details
**City**                    | Sender address - City	                                    | Return order > Customer account’s Primary address details
**County**                  | Sender address - County	                                | Return order > Customer account’s Primary address details
**Country/region**          | Sender address - Country/region	                        | Return order > Customer account’s Primary address details
**ISO**                     | Sender address - ISO	                                    | Return order > Customer account’s Primary address details
**Store code**              | Sender address - Store code	                            | Return order > Customer account’s Primary address details
**Contact**                 | Contact	                                                | Return order > Contact
**Telephone**               | Customer’s telephone	                                    | Return order > Customer account’s Primary Phone
**Email**                   | Customer's primary email                                  | Return order > Customer account’s Primary email


### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	                | **Description**	                                        | **D365 source**
:---                        |:---                                                       |:---
**Item number**             | The D365 item number                                      | Return order lines > Item Number
**Bar code**                | D365 item number’s Bar code (based on unit)	            | Released products > Bar codes
**GTIN**                    | D365 item number’s GTIN (based on unit)	                | Released products > GTIN codes
**Description**             | D365 item number’s Description	                        | Released products > Product name
**Lot Id**                  | Lot id for the return order line	                        | Return order lines > Return lot id
**Quantity**                | Return order line quantity. By default this will be negative, but can be set to positive by utilizing the document setting **Positive return quantity**   | Return order lines > Quantity
**Unit**                    | Return order quantity’s unit	                            | Return order lines > Unit
**Colour**                  | Product dimensions – colour	                            | Return order lines > Colour
**Size**                    | Product dimensions – Size	                                | Return order lines > Size
**Style**                   | Product dimensions – Style	                            | Return order lines > Style
**Configuration**           | Product dimensions – Configuration	                    | Return order lines > Configuration
**Version**                 | Product dimensions – Version                              | Return order lines > Version
**Batch number**            | Tracking dimensions – Batch number	                    | Return order lines > Batch number
**Serial number**           | Tracking dimensions – Serial number	                    | Return order lines > Serial number
**Inventory status**        | Storage dimensions – Inventory status <br> Mapped value for [Inventory status](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md)    | 	Return order lines > Inventory status
