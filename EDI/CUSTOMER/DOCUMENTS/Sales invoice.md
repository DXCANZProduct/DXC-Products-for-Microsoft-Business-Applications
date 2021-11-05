---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Sales invoice]
author: [jdutoit2]
manager: Kym Parker
ms.date: 5/11/2021
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

# Sales invoice
EDI customers may require a Sales invoice for a sales order.

> Note: Sales invoices can also be sent for a sales order not created via EDI.

The following subsections will describe how to view, process and send Sales invoices to applicable Customer Trading partners. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed. <br>
The created sales invoice record(s) can be viewed for a sales order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Sales order page.<br>

## Prerequisites
The following setup is prerequisites for the sales invoice

1. Create [Template](../../CORE/Setup/DocumentTypes/File%20templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING%20PROFILES/Sales%20invoice.md) for the document.
3. Create [Outbound filenames](../../CORE/Setup/DocumentTypes/Outbound%20filenames.md) for the document.
4. If the customer [trading partner](../SETUP/Trading%20partner.md) doesn't exist, create the new trading partner.
5. Add and enable the sales invoice to the [Customer trading partner](../SETUP/Trading%20partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

## Processing
### Post sales invoice
When the document **Sales invoice** is enabled for the EDI customer, the post sales invoice page field **Send to EDI** will be set to _Yes._
The Sales invoice [Document setting profile](../SETUP/SETTING%20PROFILES/Sales%20invoice.md) provides the option to exclude credits notes from creating a sales invoice staging record by setting **Don't send credit note** to _Yes._

## View staging table records
To view the Sales invoice staging records, go to **EDI > Documents > Customer documents > Sales invoice**. 
Use this page to review staging and process EDI Sales invoice documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI%20parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – Th staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.
**Trading partner account**     | Customer account assigned to the staging record.
**Trading partner GLN**         | The Customer’s global location number is shown here.
**Tax invoice**                 | Tax invoice number
**Customer requisition**        | Sales order's Customer requisition
**Customer reference**          | Sales order's Customer reference
**Created Date and Time**       | The date and time the selected record was created in the staging table.
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.

### Buttons
The following buttons are available on the **Customer advanced shipping notice** Action Pane, tab **Advanced shipping notice**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_.
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_.
**Outbound files**              | View the outbound file record created by the selected staging record.
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading%20partner.md) page.
**Invoice journal**             | View the tax invoice for the staging record.
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.

The following buttons are available on the **Sales invoice**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                      | **Source D365 field**
:---                    |:---                                                     |:---
<ins>**Identification FastTab**</ins>		
<ins>**Identification**</ins>		
