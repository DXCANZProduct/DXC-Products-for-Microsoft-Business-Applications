---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor Documents - Vendor purchase order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 11/11/2021
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

# Picking list

## Prerequisites
The following setup is prerequisites for the picking list

### 3PL setup
EDI > Setup > 3PL setup
1. Create [Order purpose group](../SETUP/3PL%20SETUP/Order%20purpose%20group.md) - mapped to OrderPurpose on the document.

### Document type setup
EDI > Setup > Document types: Picking list
1. Create [Template](../../CORE/Setup/DocumentTypes/File%20templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING%20PROFILES/Picking%20list.md) for the document.
3. Create [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound%20filenames.md) for the document.

### Trading partners
EDI > Setup > Trading partners
1. If the warehouse [trading partner](../SETUP/Trading%20partner.md) doesn't exist, create the new trading partner.
1. Assign the **3PL setup** to the warehouse trading partner's options.
1. Add and enable the **picking list** document to the [3PL trading partner](../SETUP/Trading%20partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

> Note: If the vendor setup mappings are not assigned to the warehouse trading partner for an outbound document, the D365/EDI value will be sent, example Original instead of a mapped value. <br>

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
Once the order has been picked, this information is sent back via the inbound **Picking list registration** document 

## View staging table records
To view the picking list staging records, go to **EDI > Documents > 3PL documents > Picking list**. 
Use this page to review staging and process EDI Picking list documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI%20parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – Th staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Vendor account assigned to the staging record
**Trading partner GLN**         | The Vendor’s global location number is shown here
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
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading%20partner.md) page
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
<ins>**Identification FastTab**</ins>		
<ins>**Identification**</ins>		
**EDI number**          | EDI Staging table record id                             | Original EDI number
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here      | Company GLN
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	            
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – Th staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.	<br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>		

**EDI order purpose**       | The EDI order purpose is shown here. <br> Mapped value from [Order purpose group](../SETUP/VENDOR%20SETUP/Order%20purpose%20group.md)  | Order purpose code
<ins>**Status**</ins>	
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.
<ins>**General FastTab**</ins>
<ins>**Details**</ins>
Identification		
Picking Route	Picking route Id	Picking Route > Id
Warehouse	Warehouse for the picking list record	Picking Route > Warehouse
Overview		
Reference	Identification of sales order or transfer order pick route	Picking route > Reference
Order Id	Order identification	Picking Route > Number
Customer requisition	Customers purchase order number	Sales Order > Requisition
Your ref.	Customers reference	Sales Order > Requisition
General		
Delivery Name	Address for Delivery	Order > Delivery Address
Delivery address	Address for Delivery	Order > Delivery Address
Post box	Address for Delivery	Order > Delivery Address
Building complement	Address for Delivery	Order > Delivery Address
Street number	Address for Delivery	Order > Delivery Address
Street	Address for Delivery	Order > Delivery Address
City	Address for Delivery	Order > Delivery Address
Suburb	Address for Delivery	Order > Delivery Address
State	Address for Delivery	Order > Delivery Address
City		Order > Delivery Address
Postcode	Address for Delivery	Order > Delivery Address
Country/region	Address for Delivery	Order > Delivery Address
Note		
Delivery note		



### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	                | **Description**	                                        | **D365 source**
:---                        |:---                                                       |:---
**Line number**             | The line within the EDI table/file	                    | Line number
**Our item number**         | The D365 item number
**External item number**    | Vendor’s item number	
**Bar code**                | Item’s barcode	
**GTIN**                    | Item’s GTIN	

