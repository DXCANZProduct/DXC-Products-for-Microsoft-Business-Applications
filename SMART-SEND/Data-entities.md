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

Organization administration > Global address book > Global address book
**Order**        | **Entity**                      | **Description**	                                         | **Dependency**
:-----           |:------------------------        |:-------------------                                      |:------------------------
1	               | LogisticsLocationRoleEntity  | Create new **CONTACTINFO**. Organization administration > Global address book > Global address book
2	               | LogisticsLocationRoleEntity  | Create new **DESCRIPTION**. Organization administration > Global address book > Global address book
3	               | LogisticsLocationRoleEntity  | Create new **DISABLEADDOREDITINEMPLOYEESELFSERVICE**. Organization administration > Global address book > Global address book
4	               | LogisticsLocationRoleEntity  | Create new **LANGUAGE**. Organization administration > Global address book > Global address book
5	               | LogisticsLocationRoleEntity  | Create new **POSTALADDRESS**. Organization administration > Global address book > Global address book
6                | LogisticsLocationRoleEntity  | Create new **PURPOSE**. Organization administration > Global address book > Global address book
7                | LogisticsLocationRoleEntity  | Create new **TYPE**. Organization administration > Global address book > Global address book

System administration > Setup > Email > Email parameters

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | EmailTemplateMessageOrganizationEntity  | Create new **EMAIL**. System administration > Setup > Email > Email parameters  
2	                | EmailTemplateMessageOrganizationEntity  | Create new **EMAILID**. System administration > Setup > Email > Email parameters
3	                | EmailTemplateMessageOrganizationEntity  | Create new **EMAILTEMPLATESTRING**. System administration > Setup > Email > Email parameters
4	                | EmailTemplateMessageOrganizationEntity  | Create new **LANGUAGE**. System administration > Setup > Email > Email parameters
5                 | EmailTemplateMessageOrganizationEntity  | Create new **LAYOUT**. System administration > Setup > Email > Email parameters
6	                | EmailTemplateMessageOrganizationEntity  | Create new **SUBJECT**. System administration > Setup > Email > Email parameters
7                 | EmailTemplateMessageOrganizationEntity  | Create new **XSLTTRANSFORM**. System administration > Setup > Email > Email parameters

System administration > Setup > Email > Email parameters >Smart Send

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | ECL_AutoPrintReportMgmtEntity  | Create new **ALTERNATEEMAILADDRESS**. System administration > Setup > Email > Email parameters  
2	                | ECL_AutoPrintReportMgmtEntity  | Create new **ATTACHMENTNAME**. System administration > Setup > Email > Email parameters
3	                | ECL_AutoPrintReportMgmtEntity  | Create new **BLOBSTORAGECONNECTIONMETHOD**. System administration > Setup > Email > Email parameters
4	                | ECL_AutoPrintReportMgmtEntity  | Create new **BLOBSTORAGECONNECTIONSTRING**. System administration > Setup > Email > Email parameters
5                 | ECL_AutoPrintReportMgmtEntity  | Create new **BLOBSTORAGECONTAINERNAME**. System administration > Setup > Email > Email parameters
6	                | ECL_AutoPrintReportMgmtEntity  | Create new **DESCRIPTION**. System administration > Setup > Email > Email parameters
7                 | ECL_AutoPrintReportMgmtEntity  | Create new **DOCUFILETYPE**. System administration > Setup > Email > Email parameters
8	                | ECL_AutoPrintReportMgmtEntity  | Create new **EMAILID**. System administration > Setup > Email > Email parameters  
9	                | ECL_AutoPrintReportMgmtEntity  | Create new **FOLDERNAME**. System administration > Setup > Email > Email parameters
10	              | ECL_AutoPrintReportMgmtEntity  | Create new **HOLDEMAILINQUEUE**. System administration > Setup > Email > Email parameters
11                | ECL_AutoPrintReportMgmtEntity  | Create new **ISDEFAULT**. System administration > Setup > Email > Email parameters
12                | ECL_AutoPrintReportMgmtEntity  | Create new **KEYVAULTSECRETNAME**. System administration > Setup > Email > Email parameters
13                | ECL_AutoPrintReportMgmtEntity  | Create new **LOCATIONROLE**. System administration > Setup > Email > Email parameters
14                | ECL_AutoPrintReportMgmtEntity  | Create new **LOGISTICSLOCATIONROLE_ISCONTACTINFO**. System administration > Setup > Email > Email parameters
15	              | ECL_AutoPrintReportMgmtEntity  | Create new **OVERWRITEEXISTINGFILE**. System administration > Setup > Email > Email parameters  
16	              | ECL_AutoPrintReportMgmtEntity  | Create new **PURPOSE**. System administration > Setup > Email > Email parameters
17	              | ECL_AutoPrintReportMgmtEntity  | Create new **REPORT**. System administration > Setup > Email > Email parameters
18                | ECL_AutoPrintReportMgmtEntity  | Create new **REPORTFORMAT**. System administration > Setup > Email > Email parameters
19                | ECL_AutoPrintReportMgmtEntity  | Create new **SENDTOALTERNATEEMAIL**. System administration > Setup > Email > Email parameters
20	              | ECL_AutoPrintReportMgmtEntity  | Create new **SMARTSENDTYPE**. System administration > Setup > Email > Email parameters
21                | ECL_AutoPrintReportMgmtEntity  | Create new **STORAGEOPTIONS**. System administration > Setup > Email > Email parameters


