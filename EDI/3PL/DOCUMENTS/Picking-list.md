---
# required metadata

title: EDI 3PL
description: EDI 3PL Documents - Picking list
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-08-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  Action:SAB_EDIStagingFormRun_Picklist, SAB_EDI3PLWHSInventStatusMapping, SAB_EDI3PLOrderPurposeMapping
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
ms.custom: 
ms.search.region: IconEDI3PLDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Picking list

## Prerequisites
The following setup is prerequisites for the picking list

### 3PL setup
EDI > Setup > 3PL setup
1. Create [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) to map the 3PL's values to D365 inventory statuses.
2. Create [Order purpose group](../SETUP/3PL-SETUP/Order-purpose-group.md) to map the 3PL's values to EDI order purpose groups.

### Document type setup
EDI > Setup > Document types: Picking list
1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING-PROFILES/Picking-list.md) for the document.
3. Create [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.

### Trading partners
EDI > Setup > Trading partners
1. If the warehouse [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
1. Assign the **3PL setup** to the warehouse trading partner's options.
1. Add and enable the **picking list** document to the [Warehouse trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

> Note: If the 3PL setup mappings are not assigned to the warehouse trading partner for an outbound document, the D365/EDI value will be sent, example Original instead of a mapped value. <br>

## Processing

### Create picking list staging
An outbound picking list can be triggered via the following methods: 
-	**Sales order**: Accounts receivable > Orders > All sales order - Select **Picking list** under the **Generate** heading on the **Pick and pack** tab on the Action Pane. 
-	**Transfer order**: Inventory management > Outbound orders > Transfer order - Select **Generate picking list** on the **Ship** tab on the Action Pane.

### Order purpose
Each picking list document will also have an order purpose which is specified in **Order purpose group** and assigned to the Trading partner. Options:
- Original
- Change
- Cancellation

## Inbound document
Once the order has been picked by the 3PL, the pick information is sent back via the inbound **Picking list registration** document.

## View staging table records
To view the picking list staging records, go to **EDI > Documents > 3PL documents > Picking list**. 
Use this page to review staging and process EDI Picking list documents to an Outbound file.

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
**Picking route**               | Picking route Id
**Reference**                   | Identification if pick route is related to a sales order or transfer order
**Order Id**                    | Sales or transfer order's identification
**Customer requisition**        | Customer's purchase order number (only where pick list is related to a sales order)
**Your ref.**                   | Customers reference (only where pick list is related to a sales order)
**EDI order purpose**           | The EDI order purpose is shown here
**Created date and time**       | The date and time the selected record was created in the staging table
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record

### Buttons
The following buttons are available on the **Picking list** Action Pane, tab **Picking list to 3PL**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_
**Outbound files**              | View the outbound file record created by the selected staging record
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page
**Picking list registration**   | View the picking list registration
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Picking list**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                      | **D365 source**
:---                    |:---                                                     |:---
<ins>**Identification FastTab**</ins>	|	
<ins>**Identification**</ins>		|
**EDI number**          | EDI Staging table record id                             | Original EDI number
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here      | Company GLN
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	           
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – Th staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.	<br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>		|
**Picking Route**           | Picking route Id	                    | Picking Route > Id
**Warehouse**               | Warehouse for the picking list record	| Picking Route > Warehouse
**Reference**               | Identification if pick route is related to a sales order or transfer order	| Picking route > Reference
**Order Id**                | Sales or transfer order's identification	                                    | Picking route > Number
**Customer requisition**    | Customers purchase order number	    | Sales Order > Customer requisition
**Your ref.**               | Customers reference	                | Sales Order > Customer reference
**EDI order purpose**       | The EDI order purpose is shown here. <br> Mapped value from [Order purpose group](../SETUP/3PL-SETUP/Order-purpose-group.md)  | Order purpose code
<ins>**Status**</ins>	    |
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.
<ins>**General FastTab**</ins>  |
<ins>**Delivery**</ins>	    |
**Name**                    | Address for Delivery	                    | Order > Delivery Address
**Delivery address**        | Address for Delivery	                    | Order > Delivery Address
**Post box**                | Address for Delivery	                    | Order > Delivery Address
**Building complement**     | Address for Delivery	                    | Order > Delivery Address
**Street number**           | Address for Delivery	                    | Order > Delivery Address
**Street**                  | Address for Delivery	                    | Order > Delivery Address
**City**                    | Address for Delivery	                    | Order > Delivery Address
**Suburb**	                | Address for Delivery	                    | Order > Delivery Address
**State**                   | Address for Delivery	                    | Order > Delivery Address
**City**		            | Address for Delivery	                    | Order > Delivery Address
**Postcode**	            | Address for Delivery	                    | Order > Delivery Address
**Country/region**          | Address for Delivery	                    | Order > Delivery Address	
<ins>**Note**</ins>			|
**Delivery note**		    |


### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	                | **Description**	                                        | **D365 source**
:---                        |:---                                                       |:---
**Line number**             | The line within the EDI table/file	                    | Created by EDI. Incremented per each picking list line
**Our item number**         | The D365 item number                                      | Pick route line > Item Number
**Bar code**                | D365 item id’s Bar code (based on unit)	                | Released products > Bar codes	                    
**GTIN**                    | D365 item id’s GTIN (based on unit)	                    | Released products > GTIN codes	
**Description**             | D365 item id’s Description	                            | Released products > Product name
**Lot Id**                  | Lot id for the transfer order line	                    | Order > Lot id
**Quantity** (InventQtyPick) | Picking list quantity	                                | Pick route line > Quantity
**Unit** (UnitId)           | Picking list quantity’s unit (Inventory unit)	            | Released products > Inventory unit
**Quantity** (SalesQty)     | Sales orders: Sales order quantity  <br> Transfer order: Inventory quantity   | Sales orders: Sales line > Quantity <br> Transfer order: Pick route line > Quantity
**Unit** (SalesUnit)        | Sales orders: Sales order unit  <br> Transfer order: Picking list quantity’s unit (Inventory unit)  | Sales orders: Sales line > Sales unit <br> Transfer order: Released products > Inventory unit
**Colour**                  | Product dimensions – colour	                            | Pick route line > Colour
**Size**                    | Product dimensions – Size	                                | Pick route line > Size
**Style**                   | Product dimensions – Style	                            | Pick route line > Style
**Configuration**           | Product dimensions – Configuration	                    | Pick route line > Configuration
**Version**                 | Product dimensions – Version                              | Pick route line > Version
**Batch number**            | Tracking dimensions – Batch number	                    | Pick route line > Batch number
**Serial number**           | Tracking dimensions – Serial number	                    | Pick route line > Serial number
**Inventory status**        | Storage dimensions – Inventory status <br> Mapped value for [Inventory status](..SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) | Pick route line > Inventory status

### EDI history
All the EDI staging records applicable to the Sales order and Transfer order can be viewed via the **History** button.

**Field**			| **Description**
:--				|:--
**EDI Document type**		| EDI document type of the staging record
**EDI number**			| EDI number and link to the staging record
**Reference**			| Additional information for the staging record
**Created date and time**	| Created date and time of the EDI staging record
