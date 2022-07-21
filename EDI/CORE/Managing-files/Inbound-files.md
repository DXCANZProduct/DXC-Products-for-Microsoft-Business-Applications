---
# required metadata

title: EDI Core
description: Managing files in the EDI module
author: jdutoit2
manager: Kym Parker
ms.date: 2022-07-15
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFileImport
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

# Managing inbound files

## Inbound files
Users can access the form by navigating to **EDI > Files > Inbound files**. <br>
When an incoming file is located, a new record will be created in this table.  In addition the document will be attached to the record via document handling to allow for easy review where an error has occurred.  Once the file has been processed successfully it can be archived and the document deleted from document handling. 
Automatic archiving of the document handling attachment can be setup with **Archive file queue**.

Filename uniqueness is validated by *Document type* and *Trading partner*. It thus allows same filename for different Trading partners.

*Note: Where the document's filename has an extension, the document can also be viewed via the **Attachments** tab of the inbound file record.*

- Select the **EDI Document** to review
- Select the **Status** of the document you wish to review. The options are:
  - **Pending** – File has not been processed. Default option for the form.
  - **Processed** – File processing is complete
  - **Error** – An error was identified during file processing.  The file has not been processed
  - **Processing** – File is currently processing
  - **Archived** – The file has been archived
  - **Canceled** - The file has been cancelled by using the **Cancel** button
- Once a file is processed, it is possible to view the staging document by selecting **Staging document** from the ribbon.
- To view errors, select the **Log** button from the ribbon.
- Select **Reset Status** to update the status back to pending and reprocess the file.
- See Retry/Reset process for more details on **Edit reset status recurrence**
- Select **Reset template** to update the document template used for processing from import to staging.
- Select **Duplicate** to create a duplicate inbound file record. This will create a new EDI Id when processing to staging. This is useful for testing.
- Select **Download attachment** to download the selected file/s attachment. When multiple files are selected a zip is created.
- Select **Cancel** to change to inbound file's **Status** to _Cancelled_. This button is enabled when the inbound file's status is _Pending_ or _Error_.
- The following fields are available for review on the Overview:
  - **EDI Document** – The inbound document type
  - **File Name** – Name of the file imported
  - **Company** – Company file is processing in
  - **Account Number** – Depending on the Document Type, this could be a Customer account, Warehouse or Vendor account
  - **Name** – The Name of the Customer, Warehouse or Vendor
  - **Status** – The status of the file
  - **Created Date and Time** – Date/Time file was received (Import step)
- The following additional fields are available on the **General** tab:
  - **Template** - The template that will be/were used when processing the inbound file to staging. This template can be changed to a different template by using the **Reset template** button. 
  - **File transfer type** - File transfer type the file was received from. If the file was manually imported via **Upload file**, this field will be set to _Manual_.
  - **Original folder** - Incoming path the file was received from
  - **Processed** - Date/Time the inbound file was processed to staging (Process to staging step)
  - **Reset status profile** - Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
  - **Reset status date/time**  - Next date/time automatic reset status will run	
  - **Reset status attempts**   - Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
  - **Recurrence**              - Recurrence text. Contains standard details of Recurrence, for example:
      - Interval (recurrence pattern)
      - How many times the period will run (End after)
      - From date/time the recurrence will start	

###	Upload files manually
The inbound files form has the option to manually upload files in an ad-hoc fashion.  It is intended that this option is only used during testing of the EDI module.
- Select **Inbound Files > Upload file** from the Import group on the Inbound files ribbon
- Select the parameters as required

**Dialog parameter** 	            | **Description**
:-------------------------------- |:------------------------------------- 
**File location**	                | Browse file locations to select the required file.
**Is a package?**	                | For use with web services – many files can be uploaded via a package (zip file with a manifest)
**Company**	                      | The company to filter the trading partners that will have documents retrieved. 
**EDI document type**	            | The document type you wish to upload.
**Trading Partner**	              | Select the trading partner associated with the file. Automatically filtered by the company and document type selected.
**File name pattern search mode**	| Similar to setup on connections, select the applicable search mode. <br>The mode and Search mask on the Trading partner’s Incoming documents are used to find the applicable match. <br>This has been introduced to support multiple incoming document feature.

Once the process has run, the inbound file records will appear in a pending status in the grid. Any errors with the process will be shown as an info log.

###	Retrieve files manually
The inbound files form has the option to retrieve files in an ad-hoc fashion on top of the batch control from all the licensed document types.
- Select **Inbound Files > Retrieve files** from the Import group on the Inbound files ribbon
- Select the parameters as required

**Dialog parameter** 	            | **Description**
:-------------------------------- |:------------------------------------- 
**EDI Document type**	            | The specific document type to retrieve. <br> *Note: If left blank, all document types will be retrieved.*
**Company**                       | The company to filter the trading partners that will have documents retrieved. <br> *Note: If left blank, all companies will be run.*
**File transfer type**            | The transfer method to use. <br> *Note: This field is Mandatory.*
**Connection profile**            |	Option to select a specific Connection profile. Filtered options based on File transfer type selected. <br> *Note: This field is not Mandatory*

- Optionally setup a recurrence to run this process as a batch.
- Select OK

Once the process has run, the inbound file records will appear in a pending status in the grid. Any errors with the process will be shown as an info log.

###	Process files manually
From the **Inbound files** form, files can be processed to their staging records in an ad-hoc manner separately to the batch control process.
- Select **Inbound Files > Process files** from the ribbon on the Inbound files form
- Optionally, select the records to include and select **Inbound Files > Process selected files**
- Select OK

### File types
Ensure file types/extensions that will be received from Trading partners, are included in **File types** at **Organization administration > Document management > Document management parameters**.
