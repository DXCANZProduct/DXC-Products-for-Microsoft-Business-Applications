---
# required metadata

title: Smart Send 
description: Smart Send- Data entities
author: Helen Ho
manager: Kym Parker
ms.date: 2023-03-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: Helen Ho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: SmartSendDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: HelenHo
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Data entities

The following is a summary of data entities available for the Smart Send module:

## Email setup
System administration > Setup > Email > Email parameters

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | EmailTemplateOrganizationEntity  | Create new **BATCHGROUP**. System administration > Setup > Email > Email parameters  
2	                | EmailTemplateOrganizationEntity  | Create new **DEFAULTLANGUAGE**. System administration > Setup > Email > Email parameters
3	                | EmailTemplateOrganizationEntity  | Create new **DESCRIPTION**. System administration > Setup > Email > Email parameters
4	                | EmailTemplateOrganizationEntity  | Create new **EMAILID**. System administration > Setup > Email > Email parameters
5                 | EmailTemplateOrganizationEntity  | Create new **PRIORITY**. System administration > Setup > Email > Email parameters
6                 | EmailTemplateOrganizationEntity  | Create new **SENDERADDRESS**. System administration > Setup > Email > Email parameters
7	                | EmailTemplateOrganizationEntity  | Create new **SENDERNAME**. System administration > Setup > Email > Email parameters


System administration > Setup > Email > System email templates
**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | LogisticsLocationRoleEntity  | Create new **CONTACTINFO**. System administration > Setup > Email > System email templates  
2	                | LogisticsLocationRoleEntity  | Create new **DESCRIPTION**. System administration > Setup > Email > System email templates
3	                | LogisticsLocationRoleEntity  | Create new **DISABLEADDOREDITINEMPLOYEESELFSERVICE**. System administration > Setup > Email > System email templates
4	                | LogisticsLocationRoleEntity  | Create new **LANGUAGE**. System administration > Setup > Email > System email templates
5	                | LogisticsLocationRoleEntity  | Create new **POSTALADDRESS**. System administration > Setup > Email > System email templates
6                | LogisticsLocationRoleEntity  | Create new **PURPOSE**. System administration > Setup > Email > System email templates
7                | LogisticsLocationRoleEntity  | Create new **TYPE**. System administration > Setup > Email > System email templates
