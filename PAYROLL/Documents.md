---
# required metadata

title: [Payroll param]
description: [Setup Parameters]
author: [ndavidson2]
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
ms.reviewer: [ndavidson2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
