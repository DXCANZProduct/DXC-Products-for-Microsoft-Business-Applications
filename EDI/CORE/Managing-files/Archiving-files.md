---
# required metadata

title: [EDI Core]
description: [Managing files in the EDI module]
author: [jdutoit2]
manager: Kym Parker
ms.date: 21/07/2021
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

# Managing archiving files

## Archiving files
Users can access the form by navigating to **EDI > Periodic tasks > Archive file queue**.
Inbound and outbound files will need to be deleted periodically to make room in storage.  When a file is deleted, it will be marked as archived. The periodic **Archive file queue** also has the option to upload the file to one of the EDI connections. If the upload details have been set and the upload is unsuccessful (example path incorrect), the file will not be archived, and the batch will contain an error log.

-	Select the **EDI document type** to archive. <br> *Note: If no document is selected, all documents will be archived.*
- Specify **Age days** of files you wish to archive.  All records with a **Processed** status and a creation date older than that specified age will be archived. 
- Select the **Archiving type**:
  - **Empty** – both import and export files should be archived
  - **Import** – only import files should be archived
  - **Export** – only outbound files should be archived
- Option to select an **Upload connection profile**. This is useful where an archive path hasn’t been setup on the Connection type and the company would still like to keep a copy of the original files.
- **Path** is enabled once an **Upload connection profile** has been selected. Set path where the files need to be uploaded.

Archiving of inbound and/or outbound filess attachments can be processed as a recurring batch.

This process removes the document attachment record and marks the EDI import/export record as archived.
The document removal option is managed by **Organization administration > Document management > Document types**

**Field** 	                                | **Description**
:--------------------------------           |:------------------------------------- 
<ins>**Document removal options**</ins>     |
**Remove**	                                | - **Document only** - deletes the attachment record from database. <br> - **Document and physical file** - deletes the file from Azure storage or SharePoint

See topic [Configure document management](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/organization-administration/configure-document-management)
for more details on how to configure document management (document handling) so that it stores file attachments and notes for records.

Users can access the form by navigating to **Organization administration > Document management > Document management parameters**.

**Field** 	                                | **Description**
:--------------------------------           |:------------------------------------- 
<ins>**Deferred deletion**</ins>            |
**Deferred deletion enabled**               |	Yes/No
**Number of days to defer deletion**	      | Specify the number of days to defer permanent deletion of attachments
**Deleted attachments**                     |	Opens deleted attachments form
