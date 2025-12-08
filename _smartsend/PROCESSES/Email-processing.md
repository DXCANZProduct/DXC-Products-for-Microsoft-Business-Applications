---
layout: product-content
header: Smart Business Form Email Manager (SmartSend)
toc: true
---

# Email Processing
There are a few ways of sending business forms or reports to Smart Send. 
* Configure print management setup to route to Smart Send as the default print destination.
* Some business forms or reports open printing dialogue, select Smart Send as the print destination.
* A number of forms have a Smart Send button, when clicked it will email the business form or report using Smart Send set-up.
* Set print management to use an electronic report format and include Smart Send within the electronic reporting destinations.

## Print management setup
Defaulting to Smart send can be achieved using the standard Dynamics 365 for finance and operations form setup, print management configuration.  Open the relevant module form setup menu and select the print management option. Select the relevant business form or report and specify Smart Send in the destination field. For further details on the configuration for use with electronic reports, see [Electronic Reporting](../PROCESSES/Electronic_Reporting)
 
## Printer destination Smart Send
To use the Smart send functionality, select it under the Print *destination* settings when printing the given business form or report. If no recipient is found the selected printer setting will be used instead. 
 
## Override Email Template and Filename
The Override email ID and Override file name allow the user to specify in print management an email template and file name different to that specified in Smart Send parameters. The user can choose to override either the Email ID,  File Name or both. If one or both options are not set to override, Smart Send will revert to that specified in Smart Send Parameters.
The overrides can be set in runtime when selecting Smart Send as the Print destination, or in Print management setup under *Form setup* in respective Dynamics 365 modules. 

### Print management conditions
These override settings are particularly useful when used in conjunction with print management conditions defined in form setup. Print management conditions are a standard Dynamics 365 option, which allows a user to define a criteria/query (a condition) to apply different print settings. 
When using a condition, the override of either Email ID or File Name will allow a different email to be sent for each condition set. For example, an organization may wish to send different email layouts to their commercial/organization customers compared to their retail/individual customers.
To set the overrides, navigate to the print management setup and in the Smart Send printer destination dialogue, select either or both the Override email id or Override file name.<br/> Note: For Forms that can select the "customer account" as part of the Recipient set up in Email Parameters, Smart Send will use this setting when accessing print management set up

In addition to the Email ID and Filename override, the print management conditions can also determine that a different report design is used. 

*Note: If a report design is specified in a print management condition, the report design must also be set up in Email parameters in the Smart Send tab. This is so Smart Send can resolve other Smart Send settings to be used for that report design such as Email Id, Filename, Contact/Purpose, Attachment File types, and Azure Storage settings.*

## Reprint to Smart Send
Several forms have a Smart Send button added. This is a quick way of emailing a pdf copy of the business form or report to the account. Simply highlight the lines and click on the Smart Send button at the top of each of these forms.

#### Customer
* Sales quotation journal
*	Sales confirmation journal
*	Sales packing slip journal
*	Sales invoice journal
*	Sales return order
*	Sales return acknowledgement
*	Free text invoice
*	Collection letter journal
*	Customer payments (Customer payment journal lines)

#### Vendor
*	Request for quotation journals
*	Purchase order journal
*	Vendor payment history
*	Vendor payments (Vendor payment journal lines)

#### Project
*	Project quotation journal
*	Project invoice journal
*	Project invoice list

#### Inventory management
*	Transfer (order) overview

#### Warehouse management
*	Bill of lading
*	Container contents

#### Transportation Management
* Commercial invoice
*	Packing list

This can be used as a reprint feature or can be used as a manual way of emailing. This feature will email the business forms or reports based on your highlighted records. Only accounts with email addresses will be sent to Smart Send. Any accounts that do not have an email address will not be sent to Smart Send; a message will show indicating which accounts do not have email addresses, eg. *Email does not exist for customer DE-001 Contoso Europe.*

## Business form records
Two fields have been added to each business form processed by Smart Send:

|  **Field**  | **Description** | 
|:---|:---|     
|  **Emailed via Smart Send**  | This is set when a business form or report is routed to the account. | 
|  **Saved to Azure blob storage**  | This is set when the business form or report has been saved to blob storage. This feature can be enabled or disabled. | 

## Additional attachments
Additional attachments can be added to the Smart Send email by selecting the document handling file type specified in the email parameters against the selected business form, and the attached document file restriction field is *External*.

Smart Send uses the *primary table* and the *email template* to look for additional attachments. 
When attaching documents take care to attach to the header record (e.g. Sales header rather than the Sales lines), and that the restriction field is set to *External*. 
Standard functionality copies attachments from the unposted tables to the posted tables (e.g. SalesTable attachments are copied to the CustInvoiceJour.)
For audit reasons, these posted tables are sometimes non-editable. Causing the document handling to be non-editable.
You may wish to attach a document to the email template which enables you to send the same attachment to all emails (e.g. Terms and Conditions, or promotional material).

### Custom attachments
Smart Send also includes an extension hook to enable a customer to create an extension class to attach a document handling attached file from another source, for example, Purchase/Sales order lines. Refer to the Smart Send technical guide.
 
## Azure blob storage
Azure Blob storage can be utilized to save copies of printed business forms or reports. The setup allows for routing all printed business forms or reports or for those without an email address. Refer to [Azure Blob Storage Setup](../CONFIGURATION/Parameters#azure-blob-storage-setup) for further details on the set-up.
 
Every file that is saved has metadata based on the fixed list placeholder tags. Refer to 3.6.1 Fixed List Placeholder Tokens section in this document for further detail. These can be useful for identifying further details or using other Azure tools such as Azure Logic Apps to trigger conditions.

A common error you may receive while printing a business form or report *Error occurred while saving to Azure blob storage. See event viewer in LCS for more detail*. This usually happens if the container does not exist. This can be resolved by going to the [Smart Send Parameters](../CONFIGURATION/Parameters) and clicking on the Test Azure blob storage connection button. This will create the container or at least give you further error details. 
 
## Email processing and management
This Smart send feature uses the standard Dynamics 365 for operations email engine. As such when a business form or report is sent via Smart Send it is inserted into the Email queue. The email queue can be accessed from **System administration > Periodic tasks > Email processing > Email sending status**.

Within the Email sending status form, users can view the status of the email, Suspend the sending of an email by using the ‘Hold,’ function or release suspended emails using the ‘Release,’ function. 

Additionally, it is possible to view an email using the ‘Show message,’ button and download the attachment.
 
