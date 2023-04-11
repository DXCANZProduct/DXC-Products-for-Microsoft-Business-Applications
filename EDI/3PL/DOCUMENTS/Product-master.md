---
# required metadata

title: EDI 3PL
description: EDI 3PL Documents - Product master
author: jdutoit2
manager: Kym Parker
ms.date: 2023-04-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDI3PLProductConfiguration, EcoResProductDetailsExtendedGrid, SAB_EDIStagingFormRun_ProductMaster
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

# Product master

3PL warehouses may require product data.

The following subsections will describe how to view, process and send Product data to applicable 3PL Trading partners. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed. <br>

## Prerequisites
The following setup is prerequisites for the 3PL document:

### Document type setup
EDI > Setup > Document types: Product master
1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
1. Create [Setting profile](../SETUP/SETTING-PROFILES/Product-master.md) for the document.
1. Create [Outbound filenames](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.

### Trading partners
EDI > Setup > Trading partners
1. If the warehouse [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
1. Add and enable the **Product master** document to the [Warehouse trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup
    - Change tracking
1. Create a new batch job for the trading partner and document in [Export batch jobs](../../CORE/Setup/EDI-Batches.md#export-batch-jobs)

## Processing

### Change tracking

Master data documents are created by enabling change tracking on the trading partner's outgoing document(s).
The document change tracking's **Full** can be set to _Yes_, in order to send all the records for the tracked table.
Once the staging record has been created for the full version, the Document change tracking's **Full** field will automatically update to _No_ in order to send changes with the next batch run. <br> 
Document change tracking's **Update version** is also updated each time a staging record is created. Only changes after the **Update version** are added in the staging record.

If required to send full set of data again, the trading partner's document change tracking's **Full** can be set to _Yes_ again.

The following tables are tracked for the **Product master** document:
- InventTable
- InventDim

## View staging table records
To view the staging records, go to **EDI > Documents > 3PL documents > Master data > Product master**. 
Use this page to review staging and process EDI Product master documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Template Id**                 | The EDI template that will be used to create the outbound file
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | 3PL account assigned to the staging record.
**Trading partner GLN**         | The 3PL’s global location number is shown here.
**Update version**              | Change tracking's Update version for the staging record.
**Created Date and Time**       | The date and time the selected record was created in the staging table.
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.

### Buttons
The following buttons are available on the **Product master**'s Action Pane, tab **Product master to 3PL**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_.
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_.
**Outbound files**              | View the outbound file record created by the selected staging record.
**Trading partner**             | View the trading partner details in the [Trading partners](../SETUP/Trading-partner.md) page.
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Product master**'s Action Pane, tab **Acknowledgement**.
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
**EDI number**          | EDI Staging table record id.                            |
**Company**             | Legal entity of the document                            |
**Company GLN**         | The company’s global location number is shown here      | 
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	           
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|   |
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>	    |   |
**Update version**            | Change tracking's Update version for the staging record.    | Change tracking
<ins>**Status**</ins>	    |   |
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.


### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	                | **Description**	                                        | **Source D365 table and field**
:---                        |:---                                                       |:---
Status                      | Product status indicator. <br> New product: Mapped value for **New indicator**. <br> Change to product: Mapped value for **Change indicator**                    | Product master setting profile
Item number                 | D365 item number                                          | Released products > Item number
Product name                | D365 item number's Product name                           | Released products > Product name
Description                 | D365 item number's Description                            | Released products > Description
Dimension number            | Inventory dimension number                                | Inventory dimension > Dimension number
Configuration               | Product dimenion's Configuration                          | Inventory dimension > Configuration
Color                       | Product dimenion's Color                                  | Inventory dimension > Color
Size                        | Product dimenion's Size                                   | Inventory dimension > Size
Style                       | Product dimenion's Style                                  | Inventory dimension > Style
Bar code                    | D365 item number's Bar code                               | Inventory item bar code
Unit                        | D365 item number's Inventory unit                         | Released products > Inventory unit
Gross depth                 | D365 item number's Gross depth                            | Released products > Gross depth
Gross height                | D365 item number's Gross height                           | Released products > Gross height
Gross width                 | D365 item number's Gross width                            | Released products > Gross width
GTIN                        | D365 item number's GTIN                                   | Inventory item GTIN
Net weight                  | D365 item number's Net weight                             | Released products > Net weight
Tare weight                 | D365 item number's Tare weight                            | Released products > Tare weight
Volume                      | D365 item number's Volume                                 | Released products > Volume
Country/region              | D365 item number's Foreign trade origin Country/region    | Released products > Country/region
Inventory stopped           | Indicates if the item has been flagged as stopped for inventory on Default order settings | Inventory item setup > Stopped
Commodity                   | D365 item number's Commodity                              | Released products > Intrastat commodity
