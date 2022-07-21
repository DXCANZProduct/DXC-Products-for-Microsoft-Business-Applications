---
# required metadata

title: EDI Core
description: EDI Core - EDI Document workspaces
author: jdutoit2
manager: Kym Parker
ms.date: 2022-03-31
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

# EDI Document workspace

Users can access the form by navigating to **EDI > EDI Document maintenance**.

The EDI document maintenance workspace provides a quick and easy way to view all errors relating to the processing of: <br>
- Inbound file imports – Inbound Files that could not create a staging table record.
- Document errors – Staging table records that could not create/update the target D365 transaction.
- Outbound file exports – Issue on exporting outbound records.

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
**Staging to target status**                |	The current status of the Inbound or Outbound staging record. <br> <ins>Outbound options include:</ins> <br> - **Not Started**: The outbound staging record has been created but no outbound file has yet been generated. <br> - **Error**: The outbound staging record has been processed, but no file has been created. There are errors with the record that needs to be reviewed. <br> - **Completed**: The outbound staging record file has been created and added to the outbound file queue. <br> <ins>Inbound options include:</ins> <br> - **Not Started** : The inbound file has successfully created the inbound staging record, but the staging record hasn't been processed to D365 target. <br> - **Error**: The inbound staging record has been processed, but no D365 target has yet been created/updated.  There are errors with the record that need to be reviewed. <br> - **Completed**: The inbound staging record has been processed and D365 target created/updated.
