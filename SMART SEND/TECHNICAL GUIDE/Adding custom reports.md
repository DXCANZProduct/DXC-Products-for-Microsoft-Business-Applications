---
# required metadata

title: [Smart Send]
description: [Smart Send - Adding custom reports]
author: [Liam Coll]
manager: Kym Parker
ms.date: 29/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Smart Send]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Adding Custom Reports
## Overview
While out of the box functionality is for the business forms listed [here](Overview), the solution can be extended on further business forms or reports. This technical guide describes how the DXC Smart Business Form Email Manager solution can be extended by adding custom report.
Refer to the attached sample model that demonstrates how to extend SmartSend to support Request for Quote report (note the Request for Quote is now supported by DXC Smart Business Form Email Manager).
Refer to SmartSendExtensionSample.zip

## Prerequisite
Minimum solution required is DXC Smart Business Form Email Manager Version 10.0.0.10018.

## To extend a new Development - New report format
To extend a new report format, there are 4 elements that need to be developed. 
 
Figure 1. Elements required to extend a new report format

Object	Changes
Base enum	Extend ECL_AutoPrintReport enum by adding an enum value
Action menu item	Create a new action menu item.
Make sure the enum parameters are set to your newly created enum value.
 
Table extension	Create a table extension based on your primary table Add the following 3 fields.
 

Class	Create a new class that extends ESSReport class. Fill in the following methods.
 

•	getPrintMgmtDocumentType – if the report that you wish to implement is part of print management. Then ensure this method is updated.
•	getEmailAddress – Implement how to resolve the email address. 
•	getReference – Implement to return references that will be stamped on the email queue table.
•	updateBlobStorageFlag – Implement to update the fields on the primary table to indicate it has been saved to blob storage.
•	updateFlag – Implement to update the fields on the primary table to indicate it has been sent via smart send.
•	buildTokenMap – Implement to have custom tokens. This is an optional method as smart send supports dynamic tokens. Refer to the user guide. 
•	sendEmailFromForm – implement to allow the menu item on the form to work. Sample code is provided. If you have a report that is not part of print management, you may need to split the report accordingly.


Developer notes:
Remember to add the menu item to a security privilege. 
