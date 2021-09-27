---
# required metadata

title: [EDI Core]
description: [EDI Core - EDI Document workspaces]
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

# EDI Document workspace

Users can access the form by navigating to **EDI > EDI Document maintenance**.

The EDI document maintenance workspace provides a quick and easy way to view all errors relating to the processing of: <br>
- Inbound file imports – Inbound Files that could not create a staging table record.
- Document errors – Staging table records that could not create/update the target D365 transaction.

In addition, from within the workspace it is possible to view and even process information relating to the selected records.

Each module also displays the outstanding inbound functional acknowledgements. <br> The staging record/s that still requires the inbound functional acknowledgement is determined by:
- Acknowledgement is set to Yes on the Trading partner’s outgoing documents
- The outbound document’s status = Processed, i.e. the outbound document has been sent to the Trading partner.
-	An inbound functional acknowledgement referring to the outgoing document’s Group control number hasn’t been received.

**Option** 	                                | **Description**
:--------------------------------           |:------------------------------------- 
**Process**                                 | Process the selected record in the staging table.
**Reset status**                            |	Reset the staging transfer status to enable reprocessing document errors.
**Show log**                                |	If there are Errors within the staging table, it is possible to review them at any time using this button.
**Version log**                             |	View all defined errors for the record. When a document’s status is reset and reprocessed a new log version is created. If the log is not defined, more information can be viewed via Execution log.
**Staging to target status**                |	The current status of the Inbound or Outbound staging record. <br> Outbound options include: <br> 
- **Not Started** - The record has been created but no outbound file has yet been generated. <br> 
- **Error** – The record has been processed but no file has been created. There are errors with the record that needs to be reviewed. <br> 
- **Completed** – The record file has been created and added to the outbound file queue. <br> Inbound options include: <br>
- **Not Started** – the inbound file has successfully created the staging record, but the staging record hasn't been processed to D365 target. <br> 
- **Error** – The inbound staging record has been processed, but no D365 target has yet been created/updated.  There are errors with the record that need to be reviewed. <br>
- **Completed** – The inbound staging record has been processed and D365 target created/updated.
