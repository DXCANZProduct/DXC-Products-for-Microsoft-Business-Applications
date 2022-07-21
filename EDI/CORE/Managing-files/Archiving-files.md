---
# required metadata

title: EDI Core
description: Managing files in the EDI module
author: jdutoit2
manager: Kym Parker
ms.date: 2021-07-21
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
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
