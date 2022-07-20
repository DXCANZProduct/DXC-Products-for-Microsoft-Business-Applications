---
# required metadata

title: Smart Send
description: Smart Send - Parameters
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SysEmailParameters
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Smart Send Parameters

The parameters for Smart Send are contained within the standard Dynamics 365 email parameters form. Navigate to **System administration > Email > Email parameters > Smart send**

## Overview

On the Smart Send tab of the Email parameters form you can configure the type of business form or report which should be sent using the Smart Send functionality. 

|  **Field**  | **Description** | 
|:---|:---|     
|  **Default**  | Select a default business form or report per document type. When the Smart Send button is clicked on each of the document forms, the default business form or report is used. If none are selected, then the system default will be used. |   
|  **Report**  | Select from a list of business form or report types that are supported for Smart Send. <br/> * Customer account statement <br/> * Payment advice (Vendor payment advice) <br/> * Purchase order <br/> * Sales invoice <br/> * Free text invoice <br/> * Sales quotation <br/> * Project invoice <br/> * Sales order confirmation <br/> * Packing slip <br/> * Sales agreement confirmation <br/> * Project quotation <br/> * Collection letter <br/> * Customer payment advice <br/> * Request for quotation <br/> * Container contents <br/> * Bill of lading <br/> * Sales return <br/> * Transfer overview. |  
|  **Report format**  | Select the report name available in the system. |  
|  **Description**  | Basic description of the business form. |  
|  **Email ID**  | Email templates to use when emailing the business form. |  
|  **File name**  | File name that will be generated for the business form or report. Placeholder tags are supported. This helps with giving meaningful name to the files. Refer to [Email placeholder](Email-placeholder.md) for further detail on supported placeholder tags. |  
|  **Recipient**  | This field is enabled for the following document types.	<br/> * Sales agreement confirmation <br/> * Sales order confirmation <br/> * Sales invoice <br/> * 	Sales packing slip <br/> * Purchase order <br/> <br/> Each of these documents have an email address that can be entered on the header (Sales table and Purchase table). Note the Sales agreement confirmation allows a contact person to be nominated on header which the primary email address is derived. <br/> <br/> The following options are available: <br/> **Account** – use contact information from the customer or vendor. <br/> **Specific** – use the email address specified on the sales order header or purchase order header, or the Contact person (primary email address) specified on Sales agreement confirmation header. <br/>	**Both** – Both the specific and account contact information will be used. <br/> <br/> For the Transfer overview, only Account is selectable. Smart Send will find any Contacts with the relevant Purpose attached to the “To warehouse address” as specified on the Transfer order. |  
|  **Include account contacts**  | When this parameter is enabled, in addition to the defined Recipients, Smart Send will also search for and email the business form to any Contact person attached to the Customer or Vendor account that hold the same Account and Contact information purpose as defined for this business form. |  
|  **Hold email in the queue**  | By selecting to hold emails, the emails will be marked with status of “Suspended”. These will need to be released manually from the “Email sending status” form. | 
|  **Purpose**  | A purpose must be selected. The purpose is used to find an email address from the customer or vendor contact information. |  

## General

In the general section you can define for the current business form
* Additional attachments to be included in the email
* Alternative email to be used when and email address is not found.
* Azure Blob Storage to store copies of documents distributed.

### Additional attachments

Additional attachment feature allows you to specify a file type that can be used in document handling. When a Smart Send email is sent, any files attached to the primary record (e.g. sales order header, purchase order header) using the file type defined in this parameter (with restriction ‘External’) are included as additional attachments. For example, a sales order might have a file “Export Certificate.pdf” attached. When an invoice is emailed, it will add the “Export Certificate.pdf” as an additional attachment. 

In addition to the above, when a Smart Send email is sent, any files attached to the email template using the file type defined in this parameter (with restriction ‘External’) are included as additional attachments. For example, an email template used for the Sales invoice might have a file “Terms and Conditions.pdf” attached. When an invoice is emailed, the “Terms and Conditions.pdf” will be an additional attachment, to all Sales invoice emails sent using that template.

|  **Field**  | **Description** | 
|:---|:---|     
|  **File type**  | Select a file type to use for additional attachments when sending emails. <br/> Refer to Microsoft guide on [configuring document management](https://docs.microsoft.com/en-us/dynamics365/unified-operations/fin-and-ops/organization-administration/configure-document-management). |   

Smart Send also includes an extension hook to enable a customer to create an extension class to attach a document handling attached file from another source, for example Purchase/Sales order lines. Refer to the Smart Send [technical guide](../TECHNICAL-GUIDE/Technical-guide.md).

### Sending User
Sending user feature allows you add the sending user , i.e. the current logged on user (User options>Sender email see Figure 9. User options – Sender email) as an additional recipient, as either a To: Cc: or Bcc recipient. If the messages are sent in batch this will be based on the user that has set the batch process.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Email sending user**  | Choose either <br/> * **Blank** – no additional recipients <br/> * **To** – current system user will be added as a “To:” recipient <br/> * **Cc** – current system user will be added as a “Cc:” recipient <br/> * **Bcc** – current system user will be added as a “Bcc:” recipient |

### Alternate Email
Alternate email feature allows you to route business forms or reports to this email address when a customer or vendor does not have an email address. This would usually be an internal email address.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Send to alternate email**  | Enable or disable the feature. |
|  **Email address**  | Email address to send to. |

### Azure Blob Storage Setup
This feature allows for the printed business forms or reports to be saved to Azure blob storage. Business form or reports can be saved for all print outs or only those with no email address under the account.

Under the Smart Send tab, you can turn on Azure Blob Storage for each document type. 

|  **Field**  | **Description** | 
|:---|:---|     
|  **Storage option**  | Enable the feature by selection the “Storage option”. <br/> * **None** – Feature is disabled <br/> * **No email** – When a customer or a vendor record does not have an email to send, it will save the file to the blob storage <br/> * **All** – Printed business forms or reports will be saved to blob storage if configured, and also emailed if an email address is configured to do so. |
|  **Blob connection string**  | This is the connection or the SAS URL string that is set up in Azure Portal. <br/> There are a number of ways to generate the SAS URL. <br/> <br/> 1. From the Azure Portal, click on Share access signature and Generate SAS details with full permissions. Refer to Microsoft pages for additional information on [SAS](https://docs.microsoft.com/en-us/azure/storage/common/storage-dotnet-shared-access-signature-part-1). <br/> 2.	Another way to generate the SAS URL is through the [Azure storage explorer](https://blogs.msdn.microsoft.com/jpsanders/2017/10/12/easily-create-a-sas-to-download-a-file-from-azure-storage-using-azure-storage-explorer/). <br/> 3. An alternative is to also use the full [blob storage connection string](https://docs.microsoft.com/en-us/azure/storage/blobs/storage-quickstart-blobs-portal). <br/> <br/> Connection string can be copied from the Azure portal. Under the blob storage resource, click on Access keys.|
|  **Blob container**  | Container name which will be saved under. A container is created if it does not exist. This is a required field. |
|  **Folder name**  | Folder name to save the file. This field can be left blank if you want all files to be created under the primary blob container. Placeholder tags can be utilized in this field to dynamically create folders. <br/> <br/> For example, you can create a folder based on the created date using %CreatedDate%. A backslash can be used to nest folders. <br/> <br/> The following will create a folder with the created date and the customer number. <br/> E.g. %CreatedDate%\%AccountNum% <br/> 20180622\C12345 <br/>  <br/> Refer to [Email Placeholder](Email_placeholder.md) for further detail on supported placeholder tags. |
|  **Overwrite**  | If a file exists with the same name, it will be only overwritten if this field is ticked. |
