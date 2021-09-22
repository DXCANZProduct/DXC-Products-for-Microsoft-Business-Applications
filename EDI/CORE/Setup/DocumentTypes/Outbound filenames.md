---
# required metadata

title: [EDI Core]
description: [EDI Core - Setup document types - Outbound filenames]
author: [jdutoit2]
manager: Kym Parker
ms.date: 12/01/2020
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

# Document types - Outbound filenames

## Setting up Outbound filenames

Users can access the form by navigating to **EDI > Setup > Document types**.

Outbound documents require a filename, so they can be created as files. The module allows per document type many different file name masks to be configured and one to be specified on the trading partners setup for each document type.

A file name mask can have information from fields within the document embedded so file name uniqueness and readability can be achieved.

- To create a new record, select the applicable outbound document type and select the **New** button in the **Outbound file names** FastTab.
- Specify the **Name** for the file mask
- Select **Single file per document** to create one or multiple files per customer/warehouse for each document
  - **No** – Create one file for all outgoing records for the specified customer/warehouse document combination. For example user can select multiple staging records and create one outbound file that contains all the records.
  - **Yes** – Create one file per outgoing record in the staging table for each document. For example if user selects multiple staging records, a file will be created per header staging record.
- Specify the **file name mask** to be used for each file, then select the **Editor** button. <br>
Various fields from the staging table are available as a placeholder. Add the file name mask text and insert placeholders from the documents available fields into the mask by selecting the placeholder and pressing the **Insert at end** button. Move the placeholder text that was just inserted (all the text between the $ and including the $ signs) to where it’s required in the file name mask. <br>
End the filename mask with the applicable file extension for outbound file's **Attachment** preview to work. If a file extenstion is not include in the filename, the outbound file will still be created, but the Attachment preview tab requires a file extension in order to read the file.
- Once the filename mask is complete save and close the editor.

> Note: Placeholders available for selection as file name mask depends on setting **Single file per document**

**Single file per document**      | **Trading partner **    | **Header staging**        
:-------------------------------- |:-----------------------:|:-----------------------:
**Yes**                           |	Yes                     | Yes
**No**                            | Yes                     | No

> Note: When assigning an Outbound filename to a Trading parner's document type. The Template assigned will also determine which filenames are available for selection.
> For example where the filename's Single file per document is set to No, it will only be available for selection on templates that support multiple headers, like Text, XML Collection and JSON Collection.
