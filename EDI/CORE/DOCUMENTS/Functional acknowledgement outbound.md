---
# required metadata

title: [EDI Core]
description: [EDI Core Documents - Functional acknowledgement outbound]
author: [jdutoit2]
manager: Kym Parker
ms.date: 23/09/2021
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

# Functional acknowledgement outbound

When a Trading partner requires a Functional Acknowledgement for sent EDI files, the following is required:
1.	Create document [Template](../Setup/DocumentTypes/File%20templates.md) for Functional acknowledgement outbound.
2.	If required, create [Setting profile](../Setup/DocumentTypes/Setting%20profiles.md) for the Functional acknowledgement outbound. See below.
3.	Add the Functional acknowledgement outbound document type to [Trading Partner’s](../Setup/Trading%20partners.md) Outgoing documents and Enable.
4.	On each applicable incoming documents for the [Trading partner](../Setup/Trading%20partners.md), set **Acknowledgement** to _Yes_.

## Setting profiles

Users can access the form by navigating to **EDI > Setup > Document types** and filtering/selecting the **Functional acknowledgement outbound** document. <br>
See [Setting profiles](../Setup/DocumentTypes/Setting%20profiles.md) for more details on how to create a Setting profile.

**Field** 	                                | **Description**                     | **Options/example**
:--------------------------------           |:------------------------------------|:------------------------------------
**Document type mapping**                   | Assign applicable document type mapping to setting	| Mappings setup at [**EDI > Setup > Document type mapping**](../Setup/Document%20type%20mapping.md)

## View Staging table records

### Incoming staging records

Users can access the form by navigating to **EDI > Documents**.
All Inbound EDI staging forms has a field **Sent** indicating if a Functional acknowledgement outbound has been sent to the trading partner for each incoming document.

### Functional acknowledgement outbound staging records

Users can access the form by navigating to **EDI > Documents > Functional acknowledgement outbound**. <br>
Use this form to review staging records and optionally manually process the staging record.

#### List page

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**EDI number**                    |	EDI Staging table record id.
**Company**                       |	Company account for the staging record.
**Template Id**                   |	Document type template that will be used to create the outbound file to the staging record.
**Staging to target status**      |	The current status of the staging record. Options include: <br> •	**Not Started**: The Functional Acknowledgement has been created but no file has yet been generated. <br> •	**Error**: The Functional Acknowledgement has been processed but no file has been created.  There are errors with the record that need to be reviewed. <br> •	**Completed**: The Functional Acknowledgement file has been created and added to the outbound file queue.
**Trading partner account**       |	Trading partner account for the staging record.
**Trading partner GLN**           |	The trading partners’ global location number is shown here.
**Company GLN**                   |	The company’s global location number is shown here.
**Group control number**          |	Trading partner’s original document that is being acknowledged's group control number.
**Document type**                 |	Trading partner’s original document type being acknowledged. [Document type mapping](../Setup/Document%20type%20mapping.md)
**Created date and time**         |	The date and time the staging record was created.

#### Buttons

**Button** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Create selected files**         |	Create the file for export for the selected records. Button is only enabled for records with **Staging to target status** set to _Not Started_.
**Create files**                  |	Create the files for export. Creates outbound files for all records with **Staging to target status** set to _Not Started_
**Outbound files**                |	View the outbound file record created for the staging record.
**Trading partner**               |	View the staging record's Trading partner details
**Show log**                      |	If there are Errors within the staging record, it is possible to review them at any time using this button.
**Reset status**                  |	Reset the staging's **Staging to target status** to enable resending of the staging record. Enabled where the record's **Staging to target status** is not set to _Not Started_.
**Edit reset status recurrence**  | Option to edit the reset status recurrence for the record. Enabled where the **Staging to target status** is set to _Error_.
**Reset template**	              | Reset the template that will be used to create the outbound file for the selected record. Enabled where the record's **Staging to target status** is not set to _Completed_.

#### Header fields

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**EDI number**	                  | EDI Staging table record id.
**Company**                       |	Company account for the staging record.
**Template Id**                   |	Document type template that will be used to create the outbound file to the staging record.
**Staging to target status**      |	The current status of the staging record. <br> Options include: <br> •	**Not Started**: The Functional Acknowledgement has been created but no file has yet been generated. <br> •	**Error**: The Functional Acknowledgement has been processed but no file has been created.  There are errors with the record that need to be reviewed. <br> •	**Completed**: The Functional Acknowledgement file has been created and added to the outbound file queue.

#### Line fields

The Functional Acknowledgement only has header fields. Header details are repeated.
