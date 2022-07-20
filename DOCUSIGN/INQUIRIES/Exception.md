---
# required metadata

title: DXC Solutions for DocuSign and Dynamics 365
description: DXC Solutions for DocuSign and Dynamics 365 - Exceptions
author: lcoll
manager: Kym Parker
ms.date: 2022-05-16
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_DSExceptions
audience: Application User
# ms.devlang: 
ms.reviewer: lcoll

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: lcoll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

#  Exceptions

The exceptions page provides the details of any Docusign documents that have had an error at the time of confirmation of the document.  The administrator will be able to review the errors associated.  From there, the administrator can update the details of the document so that it will be successfully processed in future transactions.  The **Exceptions** page is found by navigating to **Organization administration > Inquiries and Reports > Docusign > Exceptions.**


| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Created date and time**          | The time and date the error was created. This comes from the system date of D365.  |
| **Document number**                | The reference to the Document number that has been created.  This will be used to determine which document needs to be re-processed.    |
| **Error message**                     | The display of the error message that is received at the time of processing.  Additionally, users can select the **Error text** action button to review the full message of the error.  This field will be used to identify what changes need to be made to resolve the document process.    | 
| **Created by**                      | The user who processed the document.  This is identified by the system.    | 
