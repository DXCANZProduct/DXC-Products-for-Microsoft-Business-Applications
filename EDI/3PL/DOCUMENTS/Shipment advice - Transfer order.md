---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL Documents - Shipment advice - Transfer order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 23/11/2021
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

# Shipment advice - Transfer order

## Prerequisites
The following setup is prerequisites for the Shipment advice - Transfer order

### 3PL setup
EDI > Setup > 3PL setup
1. Create [Inventory status Id mapping](../SETUP/3PL%20SETUP/Inventory%20status%20Id%20mapping.md) to map the 3PL's values to D365 inventory statuses.

### Document type setup
EDI > Setup > Document types: Shipment advice - Transfer order
1. Create [Template](../../CORE/Setup/DocumentTypes/File%20templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING%20PROFILES/Shipment%20advice%20-%20Transfer%20order.md) for the document.
3. Create [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound%20filenames.md) for the document.

### Trading partners
EDI > Setup > Trading partners
1. If the warehouse [trading partner](../SETUP/Trading%20partner.md) doesn't exist, create the new trading partner.
1. Assign the **3PL setup** to the warehouse trading partner's options:
    - Inventory status Id mapping: Options from **EDI > Setup > 3PL setup > Inventory status Id mapping**
1. Add and enable the **Shipment advice - Transfer order** document to the [3PL trading partner](../SETUP/Trading%20partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

> Note: If the 3PL setup mappings are not assigned to the warehouse trading partner for an outbound document, the D365/EDI value will be sent, example inventory status of Available instead of a mapped value. <br>

## Processing

### Create shipment advice staging
An outbound shipment advice for transfer orders can be triggered via the following method: 
-	**Transfer order**: Inventory management > Inbound orders > Transfer order - Select **Ship transfer order** under the **Operations** heading on the **Ship** tab on the Action Pane. 

## Inbound document
Once the shipment has been received by the 3PL, the shipment receipt information is sent back via the inbound **Shipment receipt - Transfer order** document.

## View staging table records
To view the picking list staging records, go to **EDI > Documents > 3PL documents > Stock transfer advice > Transfer order**. 
Use this page to review staging and process EDI Shipment advice - Transfer order documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI%20parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | 3PL account assigned to the staging record
**Trading partner GLN**         | The 3PL’s global location number is shown here
**Transfer number**             | Transfer order number
**Delivery terms**              | Delivery terms for the transfer order
**Expected delivery date**      | Expected receipt date from the transfer order
**Created date and time**       | The date and time the selected record was created in the staging table
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record

### Buttons
The following buttons are available on the **Stock transfer advice > Transfer order**'s Action Pane, tab **Stock shipment advice**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_
**Outbound files**              | View the outbound file record created by the selected staging record
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading%20partner.md) page
**Transfer order**              | View the transfer order
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Stock transfer advice > Transfer order**'s Action Pane, tab **Acknowledgement**.
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
**Transfer number**         | Transfer order number	                                    | Transfer order > Transfer number
**Delivery terms**          | Delivery terms for the transfer order	                    | Transfer order > Delivery terms
**Expected delivery date**  | Expected receipt date from the transfer order	            | Transfer order > Receipt date
<ins>*Status**</ins>		
**Group control number**    | Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.	
**Received**                | Indicates if the Functional acknowledgement inbound has been received from the trading partner for the outbound document record.	


### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	                | **Description**	                                        | **D365 source**
:---                        |:---                                                       |:---
**Item number**             | The D365 item number                                      | Transfer order lines > Item Number
**Bar code**                | D365 item number’s Bar code (based on unit)	            | Released products > Bar codes
**GTIN**                    | D365 item number’s GTIN (based on unit)	                | Released products > GTIN codes
**Description**             | D365 item number’s Description	                        | Released products > Product name
**Lot Id**                  | Lot id for the transfer order line	                    | Transfer order lines > Lot id
**Quantity**                | Transfer order quantity	                                | Transfer order lines > Quantity
**Unit**                    | Transfer order quantity’s unit	                        | Released products > Inventory unit
**Colour**                  | Product dimensions – colour	                            | Transfer order lines > Colour
**Size**                    | Product dimensions – Size	                                | Transfer order lines > Size
**Style**                   | Product dimensions – Style	                            | Transfer order lines > Style
**Configuration**           | Product dimensions – Configuration	                    | Transfer order lines > Configuration
**Batch number**            | Tracking dimensions – Batch number	                    | Transfer order lines > Batch number
**Serial number**           | Tracking dimensions – Serial number	                    | Transfer order lines > Serial number
**Inventory status**        | Storage dimensions – Inventory status <br> Mapped value for [Inventory status](SETUP/3PL%20SETUP/Inventory%20status%20Id%20mapping.md)    |	Transfer order lines > Inventory status
