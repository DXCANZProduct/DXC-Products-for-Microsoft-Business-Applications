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
1	                | Organization email template  | Create new **BATCHGROUP**. System administration > Setup > Email > Email parameters  
2	                | Organization email template  | Create new **DEFAULTLANGUAGE**. System administration > Setup > Email > Email parameters
3	                | Organization email template  | Create new **DESCRIPTION**. System administration > Setup > Email > Email parameters
4	                | Organization email template  | Create new **EMAILID**. System administration > Setup > Email > Email parameters
5                 | Organization email template  | Create new **PRIORITY**. System administration > Setup > Email > Email parameters
6                 | Organization email template  | Create new **SENDERADDRESS**. System administration > Setup > Email > Email parameters
7	                | Organization email template  | Create new **SENDERNAME**. System administration > Setup > Email > Email parameters

Organization administration > Global address book > Global address book
**Order**        | **Entity**                      | **Description**	                                         | **Dependency**
:-----           |:------------------------        |:-------------------                                      |:------------------------
1	               | Address and contact information purpose  | Create new **CONTACTINFO**. Organization administration > Global address book > Global address book
2	               | Address and contact information purpose  | Create new **DESCRIPTION**. Organization administration > Global address book > Global address book
3	               | Address and contact information purpose  | Create new **DISABLEADDOREDITINEMPLOYEESELFSERVICE**. Organization administration > Global address book > Global address book
4	               | Address and contact information purpose  | Create new **LANGUAGE**. Organization administration > Global address book > Global address book
5	               | Address and contact information purpose  | Create new **POSTALADDRESS**. Organization administration > Global address book > Global address book
6                | Address and contact information purpose  | Create new **PURPOSE**. Organization administration > Global address book > Global address book
7                | Address and contact information purpose  | Create new **TYPE**. Organization administration > Global address book > Global address book

System administration > Setup > Email > Email parameters

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Organization email template message  | Create new **EMAIL**. System administration > Setup > Email > Email parameters  
2	                | Organization email template message  | Create new **EMAILID**. System administration > Setup > Email > Email parameters
3	                | Organization email template message  | Create new **EMAILTEMPLATESTRING**. System administration > Setup > Email > Email parameters
4	                | Organization email template message  | Create new **LANGUAGE**. System administration > Setup > Email > Email parameters
5                 | Organization email template message  | Create new **LAYOUT**. System administration > Setup > Email > Email parameters
6	                | Organization email template message  | Create new **SUBJECT**. System administration > Setup > Email > Email parameters
7                 | Organization email template message  | Create new **XSLTTRANSFORM**. System administration > Setup > Email > Email parameters

System administration > Setup > Email > Email parameters >Smart Send

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | SmartSend setup  | Create new **ALTERNATEEMAILADDRESS**. System administration > Setup > Email > Email parameters  
2	                | SmartSend setup  | Create new **ATTACHMENTNAME**. System administration > Setup > Email > Email parameters
3	                | SmartSend setup  | Create new **BLOBSTORAGECONNECTIONMETHOD**. System administration > Setup > Email > Email parameters
4	                | SmartSend setup  | Create new **BLOBSTORAGECONNECTIONSTRING**. System administration > Setup > Email > Email parameters
5                 | SmartSend setup  | Create new **BLOBSTORAGECONTAINERNAME**. System administration > Setup > Email > Email parameters
6	                | SmartSend setup  | Create new **DESCRIPTION**. System administration > Setup > Email > Email parameters
7                 | SmartSend setup  | Create new **DOCUFILETYPE**. System administration > Setup > Email > Email parameters
8	                | SmartSend setup  | Create new **EMAILID**. System administration > Setup > Email > Email parameters  
9	                | SmartSend setup  | Create new **FOLDERNAME**. System administration > Setup > Email > Email parameters
10	              | SmartSend setup  | Create new **HOLDEMAILINQUEUE**. System administration > Setup > Email > Email parameters
11                | SmartSend setup  | Create new **ISDEFAULT**. System administration > Setup > Email > Email parameters
12                | SmartSend setup  | Create new **KEYVAULTSECRETNAME**. System administration > Setup > Email > Email parameters
13                | SmartSend setup  | Create new **LOCATIONROLE**. System administration > Setup > Email > Email parameters
14                | SmartSend setup  | Create new **LOGISTICSLOCATIONROLE_ISCONTACTINFO**. System administration > Setup > Email > Email parameters
15	              | SmartSend setup  | Create new **OVERWRITEEXISTINGFILE**. System administration > Setup > Email > Email parameters  
16	              | SmartSend setup  | Create new **PURPOSE**. System administration > Setup > Email > Email parameters
17	              | SmartSend setup  | Create new **REPORT**. System administration > Setup > Email > Email parameters
18                | SmartSend setup  | Create new **REPORTFORMAT**. System administration > Setup > Email > Email parameters
19                | SmartSend setup  | Create new **SENDTOALTERNATEEMAIL**. System administration > Setup > Email > Email parameters
20	              | SmartSend setup  | Create new **SMARTSENDTYPE**. System administration > Setup > Email > Email parameters
21                | SmartSend setup  | Create new **STORAGEOPTIONS**. System administration > Setup > Email > Email parameters


