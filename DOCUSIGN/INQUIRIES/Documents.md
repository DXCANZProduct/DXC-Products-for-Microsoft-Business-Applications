---
# required metadata

title: DXC Solutions for DocuSign and Dynamics 365
description: Inquiries - Documents
author: ndavidson2
manager: Kym Parker
ms.date: 2023-02-22
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_DSDocument
audience: Application User
# ms.devlang: 
ms.reviewer: ndavidson2
# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconDocuSign 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: ndavidson2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---


# Documents

A new inquiry form has been created to provide users with the ability to view the status and signatories associated with a document htat has been sent for signatures via Docusign.  Users will additionally be able to see the status of the document and whether the signatories have reviewed or signed the Document.  The inquiries form is refreshed at the interval designated on the **Parameters** form for Docusign.
The inquiries page can be viewed by navigating to **Organization Administration > Inquiries and Reports > Docusign > Documents**.



| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Document name**          | The Document name that was processed. This will be the Document name that was set up in the **Document types** page. |
| **Document number**                |   The D365 document number that is associated to the document.  |
| **Envelope Id**                     | The reference to the Envelope Id that is associated to each document as it is sent to Docusign.  This is the Envelope Id in Docusign and will identify how the record updates in D365.   | 
| **Date sent**                      | The date the document was sent via Docusign to the recipient.     | 
| **Envelope status**                 | The status of the Envelope in Docusign.  When a document has been created and sent via Docusign but not opened, it will have a status of *created*.  If the document has been signed by the signatory, the status will update to *complete*.     | 
|  **Expiry date**                 |   The expiration date of the document.                      |
| **Created date and time**    |   The time and date the document was created in D365.  This is the system date and is automatically created.                               |
| **Modified date and time**   |   When there are updates on the Documents record, this is the last date the document as last updated.                                   | 
