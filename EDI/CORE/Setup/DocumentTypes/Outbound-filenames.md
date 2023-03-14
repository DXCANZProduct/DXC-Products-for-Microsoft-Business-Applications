---
# required metadata

title: EDI Core
description: EDI Core - Setup document types - Outbound filenames
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable
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

# Document types - Outbound filenames

## Setting up Outbound filenames

Users can access the form by navigating to **EDI > Setup > Document types**.

Outbound documents require a filename, so they can be created as files. The module allows per document type many different file name masks to be configured and one to be specified on the trading partners setup for each document type.

A file name mask can have information from fields within the document embedded so file name uniqueness and readability can be achieved.

- To create a new record, select the applicable outbound document type and select the **New** button in the **Outbound file names** FastTab.
- Specify the **Name** for the file mask
- Select **Single file per document** to create one or multiple files per Trading partner for each document
  - **No** – Create one file for all outgoing records for the specified Trading partner document combination. For example user/batch can select multiple staging records and create one outbound file per Trading partner for the document type.
  - **Yes** – Create one file per outgoing record in the staging table for each document. For example user/batch can select multiple staging records, but a file will be created per record.

  **Placeholders** fields available for selection as file name mask depends on setting **Single file per document**:

  **Single file per document**      | **Trading partner**    | **Header staging**        
  :-------------------------------- |:-----------------------:|:-----------------------:
  **Yes**                           |	Yes                     | Yes
  **No**                            | Yes                     | No

- Select the **Editor** button.
- Add the file name mask text either by entering **Text** or via **File name mask**.
- Insert placeholders from the documents available fields into the mask by selecting from the **Name** dropdown, or using **Placeholders picker**.
- Use the **Up** or **Down** buttons to move fields.
- **Set data** can be used to view an example using an existing outbound record.
- End the filename mask with the applicable file extension for outbound file's **Attachment** preview to work. If a file extenstion is not included in the filename, the outbound file will still be created, but the Attachment preview tab requires a file extension in order to read the file.
- Once the filename mask is complete save and close the editor.

> Note: When assigning an Outbound filename to a Trading parner's document type. The Template assigned will also determine which filenames are available for selection.
> For example filenames with **Single file per document** set to No will only be available for selection on templates that support multiple headers like Text, XML Collection and JSON Collection.
