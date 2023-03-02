---
# required metadata

title: EDI Core
description: Managing files in the EDI module
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFileExport, SAB_EDIExportBatchJobs
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

# Managing outbound files

## Outbound files
Users can access the form by navigating to **EDI > Files > Outbound files**. <br>
When an outbound file is created, a new record will be created in this table. In addition the document will be attached to the record via document handling. 
Once the file has been processed successfully it can be archived and the document deleted from document handling. 
Automatic archiving of the document handling attachment can be setup with **Archive file queue**.

*Note: Where the document's filename has an extension, the **Attachments** tab can be used for quick viewing of each outbound file record.*

- Select the **EDI Document** to review
- Select the **Status** of the document you wish to review. The options are:
  - **Pending** – File has not been processed
  - **Processed** – File processing is complete
  - **Error** – An error was identified during file processing.  The file has not been processed. Example issue: the outbound file path hasn't been setup on the connection.
  - **Processing** – File is currently processing
  - **Archived** – The file has been archived
- View the staging document by selecting **Staging document** from the ribbon.
- To view errors, select the **Log** button from the ribbon.
- Select **Reset Status** to update the status back to pending and reprocess the file.
- See Retry/Reset process for more details on **Edit reset status recurrence**.
- Select **Download attachment** to download the selected file/s attachment. When multiple files are selected a zip is created.
- The following fields are available on the **Overview** tab:
  - **EDI Document** – The inbound document type
  - **File Name** – Name of the file imported
  - **Company** – Company file is processing in
  - **Account Number** – Depending on the Document Type, this could be a Customer, Vendor account or Warehouse
  - **Name** – The Name of the Customer, Vendor or Warehouse
  - **Status** – The status of the file
  - **Created Date and Time** – Date/Time the outbound file was created (Process to outbound step)
- The following additional fields are available on the **General** tab:
  - **Template** - The template used when creating the outbound file. 
  - **File transfer type** - File transfer type the file will be sent to/has been sent to
  - **Original folder** - Outgoing path the file will be sent to/has been sent to
  - **Processed** - Date/Time the outbound file was processed and sent to outgoing connection (Export step)
  - **Reset status profile** - Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
  - **Reset status date/time**  - Next date/time automatic reset status will run	
  - **Reset status attempts**   - Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
  - **Recurrence**              - Recurrence text. Contains standard details of Recurrence, for example:
      - Interval (recurrence pattern)
      - How many times the period will run (End after)
      - From date/time the recurrence will start	

###	Send files manually
From the outbound files form, files can be sent in an ad-hoc manner separately to the batch control process.
- Select **Outbound Files > Send files** from the ribbon on the Outbound files form
- Optionally, select the records to include and select **Outbound Files > Send selected files**
- Select **OK**

###	Create Files manually 
Users can access the form by navigating to **EDI > Periodic tasks > Export batch jobs**. <br>
When EDI documents are posted within D365, a record is created in the staging table where it is then possible to prepare a file to be sent to the VAN or partner.

*Note: A **batch job** should be setup to create outgoing files and default **Connection profile** assigned in EDI parameters.*
- Select the **EDI Document** to be created
- Select the **Company**
- If required, set **Batch Processing** to *Yes* and set the recurrence
- Select **OK**

Once outbound files have been created, they must be sent to the applicable party. 
- Select the **File Transfer Type**.
- If required, set **Batch Processing** to *Yes* and set the recurrence
- Select **OK**

