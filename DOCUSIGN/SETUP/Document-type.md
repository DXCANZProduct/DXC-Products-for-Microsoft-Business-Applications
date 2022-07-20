---
# required metadata

title: Docusign
description: Setup Parameters
author: ndavidson2
manager: Kym Parker
ms.date: 2020-01-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: ndavidson2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: lcoll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Document Types

The **Document Types** page allows users to configure which documents will use the Docusign integration when processing.  When a document is set on this page, the document will be sent via Docusign for review and approval. The selected document will use the linked template to determine the details of the signature required and send the detail of the signatory along with the design of the report output.

The Docusign integration will work with any report that has an SSRS report type output, and will send all of the details regarding the report design to Docusign at the time the document is processed.  The **Document types** page is found by navigating to **Organization administration > Setup > Docusign > Document types**.

The following fields are available on the **Document types** page. It is defined in three sections: 
- **Document type**
- **General**
- **Advanced**


## Document type 

The **Document type** FastTab identifies the report name details of the document at processing time.


| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Document Name**                 | Enter the name of the Document type.  The **Document name** field often identifies the type of document that will be created, such as *Sales Invoice* or *Purchase order*. |
| **Template**                      | Select the template that will be applied to the document.  This field will be a drop-down of the templates that have been set up in the **Templates** page.    |
| **Print Management**              | Select whether print management will be used for the document.  Two options are available <br> <br>  *Yes* -  If selected, then the **Document type** and **Report format** fields are enabled.  A user will be able to select from the standard Print management documents list that are enabled.  <br> *No* - If selected,  then the **Report name** field will be enabled.  This option is used where a custom report is built that the business wished to send via Docusign   |



## General 

The **General** FastTab will identify the SSRS report version that will be used at the time of document processing.

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Document Type**                 | Select the document type from the the available document types in the Print Management setup.  The options available for documents are defined in the **Print management** section.|
| **Report format**                 | When the **Document type** is selected, the default report format of this report is displayed here.  If there is more than one available report format for a report, you will be able to select the report format used.    |
| **Report name**                   | If *no* has been selected in the **Print management** field, enter the SSRS report name here.  |
| **Auto send**                     | Select the value in the **Auto send** field.  Two options are available:  <br>  <br>  *yes* - If selected, then at the confirmation of the document, the document will be automatically sent to the relevant signatories for review and approval. <br> *no* - If selected, then upon the confirmation of the document, the user will be able to review the document before it is sent via Docusign.  The user will be able to add/edit/remove signatories, add additional informaiton that signatories must provide, or discard the document.  Once ready, the user will select to send the document to Docusign.           |


## Advance setting

The **Advance setting** FastTab will identify any advanced settings how to handle the document inside of Docusign after it has been sent to the signatory for review and signature.


| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Activate advanced setting**                 | Determine if the document will use advanced settings for processing. If set to no, the other fields in this section of the form will be greyed out.  If set to yes, the fields will be available for entry.|
| **Allow signature on paper**                 |  Docusign allows recipients to sign a document on paper.  When this is set to yes, the recipient will be able to print and sign the document.  The recipient can choose to submit the completed document by fax, or by scanning it and uploading the file.   |
| **Allow change of signing responsibility**                   | This option allows recipients the option to assign signing responsibility to another person.  The recipient can select to **change signer**.  The recipient will provied the new signer's contact informaiton, and the document is reassigned and sent to the new recipient.  The original user will be notified of the change of recipient.  |
| **Send auto reminders**                     |   When set to yes, email reminders are sent to signers automatically.  When enabled, the **reminder days** and *resend reminder days** will be used to identify the time lapse between the original document and the reminders.      |
|  **Send reminder days**                 |   Set the number of days for when the first reminder will be sent to signatories, based on the initial receipt date.                  |
| **Reminder resend days**             |   Set the number of days when the additional reminders are sent, based on the initial receipt date.              |
| **Expiry days**                     |  Set the number of days until the document will no longer be valid and will expire.                   |
| **Warn for expiry days**              |  Set the number of days when the warning that the document will expire will be sent.  If not set, the document signing requests will have a warning 6 days from expiration.                     |

