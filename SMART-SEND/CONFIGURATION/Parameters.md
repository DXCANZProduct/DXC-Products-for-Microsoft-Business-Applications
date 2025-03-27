---
# required metadata

title: Smart Send
description: Smart Send - Parameters
author: Peter Musumeci
manager: Pontus Ek
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SysEmailParameters
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
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
|  **Report**  | Select from a list of business forms or report types that are supported for Smart Send, below are supported out of the box. <br/> * Customer account statement <br/> * Payment advice (Vendor payment advice) <br/> * Purchase order <br/> * Sales invoice <br/> * Free text invoice <br/> * Sales quotation <br/> * Project invoice <br/> * Sales order confirmation <br/> * Packing slip <br/> * Sales agreement confirmation <br/> * Project quotation <br/> * Collection letter <br/> * Customer payment advice <br/> * Request for quotation <br/> * Container contents <br/> * Bill of lading <br/> * Sales return <br/> * Transfer overview. |  
|  **Report format**  | Select the report name available in the system. |  
|  **Description**  | Basic description of the business form. |  
|  **Email ID**  | Email templates to use when emailing the business form. <br/> Templates are sourced from  *Organisation administration>Setup>Organisation email templates* |  
|  **File name**  | File name that will be generated for the business form or report. Placeholder tags are supported. This helps with giving meaningful names to the files. Refer to [Email placeholder](Email_placeholder.md) for further details on supported placeholder tags. |  
|  **Recipient**  | This field is only enabled for the following document types.	<br/> * Sales agreement confirmation <br/> * Sales order confirmation <br/> * Sales invoice <br/> * 	Sales packing slip/Delivery Note <br/> * Purchase order <br/> * Free Text Invoice<br/>* Request for Quotation <br/>* Sales Return <br/> <br/>  The following options are available: <br/> **Account** – use contact information from the customer or vendor Invoice account. <br/> **Specific** – use the email address specified on the sales order header, purchase order header, Free Text Invoice or the Contact person (primary email address) specified on the Sales agreement confirmation header. <br/>	**Both** – Both the specific and account contact information will be used. <br/>	*New* **Customer account** – For the nominated form, Smart Send will source the Address and contact information purpose from the "customer account"- Currently only available for Sales order Confirmation and Sales order Invoice.<br/>*New* **All** - Smart Send will include Specific as well as Account, and Customer account providing a matching purpose is available  <br/> Note: When using Both as your existing set up this will remain in place until a user goes to edit the "Recipient" field at which point it will be disabled and users will need to select All, or their new relevant setting  <br/>  <br/> - For the Transfer overview, where only "Account" is selectable. Smart Send will find any contacts with the relevant purpose attached to the “To warehouse address” specified on the transfer order. <br/> - The Sales agreement confirmation allows a contact person to be nominated on the header from which the primary email address is derived. <br/> <br/>  |  
|  **Include account contacts**  | When this parameter is enabled, Smart Send will search the Customer or Vendor account "Contacts" form and email the business form to any Contact person attached to the relevant account who holds the same Address and contact information purpose as defined for this business form. |  
|  **Hold email in the queue**  | By selecting to hold emails, the emails will be marked with the " Suspended " status. These must be released manually from the “Email sending status” form. | 
|  **Convert to PDF**  | This feature is only for documents created when using the smart send button. This will convert an electronic report from its base format to PDF.  <br/> <br/> When using print management, the electronic reporting destination is used to determine if the document is converted to PDF. | 
|  **Purpose**  | A purpose must be selected. The purpose is used to find an email address from the customer or vendor contact information.  You can assign multiple purposes to a contact, allowing one or multiple contact/s to be used for multiple SmartSend forms |  

## General

In the general section, you can define for the current business form
* Additional attachments to be included in the email
* Alternative email to be used when an email address is not found.
* Azure Blob Storage to store copies of documents distributed.
* Activate Batch Processing of the selected form - New Feature Coming soon

### Additional attachments

An additional attachment feature allows you to specify a file type that can be used in document handling. When a Smart Send email is sent, any files attached to the primary record (e.g. sales order header, purchase order header) using the file type defined in this parameter (with restriction ‘External’) are included as additional attachments. For example, a sales order might have a file “Export Certificate.pdf” attached. When an invoice is emailed, it will add the “Export Certificate.pdf” as an additional attachment. 

In addition to the above, when a Smart Send email is sent, any files attached to the email template using the file type defined in this parameter (with the restriction ‘External’) are included as additional attachments. For example, an email template used for the Sales invoice might have a file “Terms and Conditions.pdf” attached. When an invoice is emailed, the “Terms and Conditions.pdf” will be an additional attachment, to all Sales invoice emails sent using that template.

|  **Field**  | **Description** | 
|:---|:---|     
|  **File type**  | Select a file type to use for additional attachments when sending emails. <br/> Refer to Microsoft guide on [configuring document management](https://docs.microsoft.com/en-us/dynamics365/unified-operations/fin-and-ops/organization-administration/configure-document-management). |   

Smart Send also includes an extension hook to enable a customer to create an extension class to attach a document handling attached file from another source, for example, Purchase/Sales order lines. Refer to the Smart Send [technical guide](../TECHNICAL-GUIDE/Technical-guide.md).

### Sending User
The sending user feature allows you to add the sending user, i.e. the currently logged-on user (User options>Sender email see Figure 9. User options – Sender email) as an additional recipient, as either a To: Cc: or Bcc recipient. If the messages are sent in batch, this will be based on the user that has set the batch process.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Email sending user**  | Choose either <br/> * **Blank** – no additional recipients <br/> * **To** – current system user will be added as a “To:” recipient <br/> * **Cc** – current system user will be added as a “Cc:” recipient <br/> * **Bcc** – current system user will be added as a “Bcc:” recipient |

### Alternate Email
The Alternate Email feature allows you to route business forms or reports to this email address when a customer or vendor does not have an email address. This would usually be an internal email address.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Send to alternate email**  | Enable or disable the feature. |
|  **Email address**  | Email address to send to. |

### Azure Blob Storage Setup
This feature allows the printed business forms or reports to be saved to Azure blob storage. Business forms or reports can be saved for all printouts or only for those with no email address under the account.

Under the Smart Send tab, you can turn on Azure Blob Storage for each document type. 

|  **Field**  | **Description** | 
|:---|:---|     
|  **Storage option**  | Enable the feature by selecting the “Storage option”. <br/> * **None** – Feature is disabled <br/> * **No email** – When a customer or a vendor record does not have an email to send, it will save the file to the blob storage <br/> * **All** – Printed business forms or reports will be saved to blob storage if configured, and also emailed if an email address is configured to do so. |
|  **Connection methods**  | Choose either Blob connection string or Key Vault as your connection type. |
|  **Key Vault**  | If you're using Key Vault, pick your preferred Key Vault Name from the "Blob connection string" drop-down.  Note that the Folder and Container Name must exist in your Azure storage for the connection to be validated. See[Set up the Azure Key Vault client](https://learn.microsoft.com/en-us/dynamics365/finance/localizations/global/setting-up-azure-key-vault-client) for more information on setting up Key Vault.  |
|  **Blob connection string**  | This is the connection or the SAS URL string set up in Azure Portal. <br/> There are several ways to generate the SAS URL. <br/> <br/> 1. From the Azure Portal, click on Share access signature and Generate SAS details with full permissions. Refer to Microsoft pages for additional information on [SAS](https://docs.microsoft.com/en-us/azure/storage/common/storage-dotnet-shared-access-signature-part-1). <br/> 2.	Another way to generate the SAS URL is through the [Azure storage explorer](https://blogs.msdn.microsoft.com/jpsanders/2017/10/12/easily-create-a-sas-to-download-a-file-from-azure-storage-using-azure-storage-explorer/). <br/> 3. An alternative is also to use the full [blob storage connection string](https://docs.microsoft.com/en-us/azure/storage/blobs/storage-quickstart-blobs-portal). <br/> <br/> Connection string can be copied from the Azure portal. Under the blob storage resource, click on Access keys. "blob storage connection string" is considered the least secure method and does not natively contain authentication information.  It is expected to be deprecated by Microsoft in the future in favour of SAS |
|  **Blob container**  | The Container name that the document/report will be saved under.  This is a required field. <br> *Connection String* If a blob storage connection string is used (begins with DefaultEndpointProtocol), the value entered in this field will be used to build the container if it doesn't already exist. <br> *SAS Token* As the Shared Access Token is created at the container level, Smart Send assumes that the container has already been built and this will auto-populate to prevent errors.  An error is raised if the container is not present in the Storage account. <br> *SAS URL* A shared access signature is created at the Storage account level and thus requires the container to be specified, similarly,  the value entered in this field will be used to build the container if it doesn't already exist.
|  **Folder name**  | Folder name to save the file. This field can be left blank if you want all files to be created under the primary blob container. Placeholder tags can be utilized in this field to create folders dynamically. <br/> <br/> For example, you can create a folder based on the created date using %CreatedDate%. A backslash can be used to nest folders. <br/> <br/> The following will create a folder with the created date and the customer number. <br/> E.g. %CreatedDate%\%AccountNum% <br/> 20180622\C12345 <br/>  <br/> Refer to [Email Placeholder](Email_placeholder.md) for further detail on supported placeholder tags.|
|  **Overwrite**  | If a file exists with the same name, it will be only overwritten if this field is ticked. |
|**Batch Processing. (selected forms only)**  | Activate Batch Processing of the selected form.<br>The option to process forms in batches will be enabled by setting the Radio Button under Allow batch processing to *Yes*.  This can enable the processing of several selections in the background without interfering with the user's ongoing interaction.  The "Smart Send" button initiates the batch process. The user is then presented with the batch processing form, which they must fill out with the relevant information in order for the job to be queued for the batch run as part of standard Batch processing functionality |
