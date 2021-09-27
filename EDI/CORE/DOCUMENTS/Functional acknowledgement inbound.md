---
# required metadata

title: [EDI Core]
description: [EDI Core Documents - Functional acknowledgement inbound]
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

# Functional acknowledgement inbound

When the Company requires the Trading partner to send a Functional Acknowledgement for outbound EDI files, the following is required:
1.	Create document [Template](../Setup/DocumentTypes/File%20templates.md) Functional acknowledgement inbound.
1.	Add the Functional acknowledgement inbound document type to [Trading Partner’s](../Setup/Trading%20partners.md) Incoming documents and Enable.
1.	For each [Trading partner's](../Setup/Trading%20partners.md) outgoing documents that requires to receive a Functional acknowledgement, set **Acknowledgement** to _Yes_.

## Setting profiles

Users can access the form by navigating to **EDI > Setup > Document types** and filtering/selecting the **Functional acknowledgement inbound** document. <br>
See [Setting profiles](../Setup/DocumentTypes/Setting%20profiles.md) for more details on how to create a Setting profile.

**Field** 	                                | **Description**                     | **Options/example**
:--------------------------------           |:------------------------------------|:------------------------------------
**Document type mapping**                   | Assign applicable document type mapping to setting	| Mappings setup at [**EDI > Setup > Document type mapping**](../Setup/Document%20type%20mapping.md)

## View Staging table records

### Functional acknowledgement inbound staging records

Users can access the form by navigating to **EDI > Documents > Functional acknowledgement inbound**. <br>
Use this form to review staging records and optionally manually process the staging record.

#### List page

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**EDI number**                    |	EDI Staging table record id.
**Company account**               |	Company account for the staging record.
**Template Id**                   |	Document type template used to process the document.
**Staging to target status**      |	The current status of the staging. Options include: <br> •	**Not Started**: The staging record has been created but not processed. <br> •	**Error**: The staging record has been processed but there are errors with the record that need to be reviewed. <br> •	**Completed**: The staging record has been successfully processed.
**Trading partner account**       |	Trading partner account for the staging record.
**Trading partner GLN**           |	The trading partners’ global location number is shown here.
**Company GLN**                   |	The company’s global location number is shown here.
**Group control number**          |	Company’s Group control number being acknowledged.
**Created date and time**         |	The date and time the staging record was created
**Sent**                          |	Indicates if an Outbound Functional Acknowledgement has been sent.

#### Buttons

**Button** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Process selected**              |	Process selected records in the staging table. Button is only enabled for records with **Staging to target status** set to _Not Started_.
**Process all**                   |	Process all records with **Staging to target status** set to _Not Started_.
**Inbound files**                 |	View the inbound file record that created the functional acknowledgement staging record.
**Trading partner**               |	View staging record’s Trading partner details.
**Show log**                      |	If there are Errors within the staging record, it is possible to review them at any time using this button. Shows only current version.
**Version log**                   |	View all defined errors. When a document’s status reset and reprocessed a new log version is created. If the log is not defined, more information can be viewed via Execution log.
**Reset status**                  |	Reset the staging's **Staging to target status** to enable reprocessing of the staging record. Enabled where the record's **Staging to target status** is not set to _Not Started_.
**Edit reset status recurrence**  | Option to edit the reset status recurrence for the record. Enabled where the **Staging to target status** is set to _Error_.

#### Header fields

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**EDI number**	                  | EDI Staging table record id.
**Company**                       |	Company account for the staging record.
**Template Id**                   |	Document type template used to process the document.
**Staging to target status**      |	The current status of the staging record. <br> Options include: <br> •	**Not Started**: The EDI file has been successfully processed from the inbound file to the staging table. <br> •	**Error**: The EDI file has been processed from the staging table but errored on processing to target. There are errors with the record that needs to be reviewed. <br> •	**Completed**: The EDI file has been processed to target which updates the original outgoing document with info that functional acknowledgement has been received.

#### Line fields

The Functional Acknowledgement only has header fields. Header details are repeated.
