---
# required metadata

title: Smart Send 
description: Smart Send- Data Entities
author: Helen Ho
manager: Pontus Ek
ms.date: 2023-03-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: peter Musumeci

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: SmartSendDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci 
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Data entities

The following is a summary of data entities available for the Smart Send module:
## Email setup


**Order**| **Entity**                      | **Description**	                                                                                        | **Dependency**
:-----   |:------------------------        |:-------------------                                                                                      |:------------------------
1	| Address and contact information purpose  | Create new **Contaact Purpose/s**. Organization administration > Global address book > Address and contact information purpose| Customer/Vendor contacts
2	| Organization email template  | Create new **Organization email template/s**. Organisation administration > Setup > Organisation email templates
3	| Organization email template message  | Assign new **Email message content** to a specified email template. Organisation administration > Setup > Organisation email templates| Organization email template 
4	| SmartSend setup  | Create/Load  new **Smart Send Report/s** . System administration > Setup > Email > Email parameters | Organisational email templates, Report Format,  contact information purposes 


**Note: The fields XSLTTRANSFORM and EMAILTEMPLATESTRING in the template *Organization email template message*  have character limitations that can lead to email body content being truncated.  It is recommended that dynamic templates used with Smart Send are stored as html files and then loaded individually not using the standard DMF entity 

