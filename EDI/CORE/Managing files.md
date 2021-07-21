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

# Managing files

## Inbound files
Users can access the form by navigating to **EDI > files > Inbound files**
When an incoming file is located, a new record will be created in this table.  In addition the document will be attached to the record via document handling to allow for easy review where an error has occurred.  Once the file has been processed successfully it can be archived and the document deleted from document handling. 
Automatic archiving of the document handling attachment can be setup with **Archive file queue**.

Filename uniqueness is validated by *Document type* and *Trading partner*. It thus allows same filename for different Trading partners.

Note: The document is also available via the **attachments** tab of the inbound file record. 
- Select the **EDI Document** to review
- Select the **Status** of the document you wish to review. The options are:
  - **Pending** – File has not been processed. Default option for the form.
  - **Processed** – File processing is complete
  - **Error** – An error was identified during file processing.  The file has not been processed
  - **Processing** – File is currently processing
  - **Archived** – The file has been archived
- Once a file is processed, it is possible to view the staging document by selecting **Staging document** from the ribbon.
- To view errors, select the **Log** button from the ribbon.
- Select **Reset Status** to update the status back to pending and reprocess the file.
- See Retry/Reset process for more details on **Edit reset status recurrence**
- Select **Reset template** to update the document template used for processing from import to staging.
- Select **Download attachment** to download the selected file/s attachment. When multiple files are selected a zip is created.
- The following fields are available for review on the Overview:
  - **EDI Document** – The inbound document type
  - **File Name** – Name of the file imported
  - **Company** – Company file is processing in
  - **Account Number** – Depending on the Document Type, this could be a Customer account, Warehouse or Vendor account
  - **Name** – The Name of the Customer, Warehouse or Vendor
  - **Status** – The status of the file
  - **Created Date and Time** – Date/Time file was received


