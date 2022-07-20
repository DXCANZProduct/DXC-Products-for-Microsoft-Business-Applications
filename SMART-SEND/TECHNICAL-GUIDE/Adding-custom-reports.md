---
# required metadata

title: Smart Send
description: Smart Send - Adding custom reports
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Adding Custom Reports
## Overview
While out of the box functionality is for the business forms listed [here](../Overview.md), the solution can be extended on further business forms or reports. This technical guide describes how the DXC Smart Business Form Email Manager solution can be extended by adding custom report.

Refer to the [sample model file](https://github.com/DXCANZProduct/ICOND365/blob/b6404a4f9acd53ba41d34b99e0462eac9fd29fbe/SMART%20SEND/TECHNICAL%20GUIDE/SmartSendExtensionSample.zip) that demonstrates how to extend SmartSend to support Request for Quote report (note the Request for Quote is now supported by DXC Smart Business Form Email Manager).

## Prerequisite
Minimum solution required is DXC Smart Business Form Email Manager Version 10.0.0.10018.

## To extend a new Development - New report format
To extend a new report format, there are 4 elements that need to be developed. 

|  **Object**  | **Changes** | 
|:---|:---|     
|  **Base enum**  | Extend ECL_AutoPrintReport enum by adding an enum value. | 
|  **Action menu item**  | Create a new action menu item. <br/> Make sure the enum parameters are set to your newly created enum value. | 
|  **Table extension**  | Create a table extension based on your primary table Add the following 3 fields. <br/> * ESS_EmailSent <br/> * ESS_SavedToBlobStorage <br/> * ESS_BlobStorage_URL | 
|  **Class**  | Create a new class that extends ESSReport class. Fill in the following methods. <br/> * **getPrintMgmtDocumentType** – if the report that you wish to implement is part of print management. Then ensure this method is updated. <br/> * **getEmailAddress** – Implement how to resolve the email address. <br/> * **getReference** – Implement to return references that will be stamped on the email queue table. <br/> * **updateBlobStorageFlag** – Implement to update the fields on the primary table to indicate it has been saved to blob storage. <br/> *	**updateFlag** – Implement to update the fields on the primary table to indicate it has been sent via smart send. <br/> *	**buildTokenMap** – Implement to have custom tokens. This is an optional method as smart send supports dynamic tokens. Refer to the user guide. Avoid the use of special characters when creating custom tokens.  <br/> * **sendEmailFromForm** – implement to allow the menu item on the form to work. Sample code is provided. If you have a report that is not part of print management, you may need to split the report accordingly. | 
