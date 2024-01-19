---
# required metadata

title: DocuSign
description: DocuSign - Data entities
author: HelenHo
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
ms.reviewer: HelenHo

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: DocuSign
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: HelenHo
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Data entities

The following is a summary of data entities available for the DocuSign module:

## DocuSign setup
Organisation administration > Setup > DocuSign > Document types

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | SAB_DSDocumentTypesEntity  | Create new **ALLOWCHANGERESP**. Organisation administration > Setup > DocuSign > Document types
2	                | SAB_DSDocumentTypesEntity   | Create new **ALLOWPAPERSIGN**. Organisation administration > Setup > DocuSign > Document types
3	                | SAB_DSDocumentTypesEntity  | Create new **AUTOSEND**. Organisation administration > Setup > DocuSign > Document types
4	                | SAB_DSDocumentTypesEntity  | Create new **DOCUMENTNAME**. Organisation administration > Setup > DocuSign > Document types
5	                | SAB_DSDocumentTypesEntity           | Create new **ENABLEADVANCEDSETUP**. Organisation administration > Setup > DocuSign > Document types
6	                | SAB_DSDocumentTypesEntity    | Create new **EXPIRYDAYS**. Organisation administration > Setup > DocuSign > Document types
7	                | SAB_DSDocumentTypesEntity       | Create new **EXPIRYWARNDAYS**. Organisation administration > Setup > DocuSign > Document types
8	                | SAB_DSDocumentTypesEntity | Create new **ISPRINTMANGEMENTREPORT**. Organisation administration > Setup > DocuSign > Document types
9	                | SAB_DSDocumentTypesEntity  | Create new **PRINTMGMTDOCUMENTTYPE**. Organisation administration > Setup > DocuSign > Document types
10	              | SAB_DSDocumentTypesEntity   | Create new **PRINTMGMTREPORTFORMAT**. Organisation administration > Setup > DocuSign > Document types
11	              | SAB_DSDocumentTypesEntity  | Create new **PRINTMGMTREPORTFORMAT_COUNTRYREGIONID**. Organisation administration > Setup > DocuSign > Document types
12                | SAB_DSDocumentTypesEntity  | Create new **PRINTMGMTREPORTFORMAT_DESCRIPTION**. Organisation administration > Setup > DocuSign > Document types
13                | SAB_DSDocumentTypesEntity           | Create new **PRINTMGMTREPORTFORMAT_DOCUMENTTYPE**. Organisation administration > Setup > DocuSign > Document types
14                | SAB_DSDocumentTypesEntity    | Create new **PRINTMGMTREPORTFORMATRECID**. Organisation administration > Setup > DocuSign > Document types
15	              | SAB_DSDocumentTypesEntityp       | Create new **REMINDERDAYS**. Organisation administration > Setup > DocuSign > Document types
16                | SAB_DSDocumentTypesEntity | Create new **REMINDERRESENDDAYS**. Organisation administration > Setup > DocuSign > Document types
17	              | SAB_DSDocumentTypesEntity           | Create new **REPORTNAME**. Organisation administration > Setup > DocuSign > Document types
18                | SAB_DSDocumentTypesEntity    | Create new **SAB_DSTEMPLATE_TEMPLATEID**. Organisation administration > Setup > DocuSign > Document types
19                | SAB_DSDocumentTypesEntity       | Create new **SENDAUTOREMINDER**. Organisation administration > Setup > DocuSign > Document types
20                | SAB_DSDocumentTypesEntity | Create new **TEMPLATE**. Organisation administration > Setup > DocuSign > Document types

Organisation administration > Setup > DocuSign > DocuSign parameters

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | SAB_DSParametersEntity  | Create new **ENABLEEXCEPTIONLOG**. Organisation administration > Setup > DocuSign > DocuSign parameters
2	                | SAB_DSParametersEntity   | Create new **INTEGRATORKEYSECRETNAME**. Organisation administration > Setup > DocuSign > DocuSign parameters
3	                | SAB_DSParametersEntity  | Create new **KEY**. Organisation administration > Setup > DocuSign > DocuSign parameters
4	                | SAB_DSParametersEntity  | Create new **OAUTHSERVERURL**. Organisation administration > Setup > DocuSign > DocuSign parameters
5	                | SAB_DSParametersEntity           | Create new **PLACEHOLDEREMAIL**. Organisation administration > Setup > DocuSign > DocuSign parameters
6	                | SAB_DSParametersEntity    | Create new **RSAPRIVATEKEYSECRETNAME**. Organisation administration > Setup > DocuSign > DocuSign parameters
7	                | SAB_DSParametersEntity       | Create new **STATUSUPDOVERLAPMINUTES**. Organisation administration > Setup > DocuSign > DocuSign parameters
8	                | SAB_DSParametersEntity | Create new **USERID**. Organisation administration > Setup > DocuSign > DocuSign parameters
9	                | SAB_DSParametersEntity  | Create new **WEBSERVICEURL**. Organisation administration > Setup > DocuSign > DocuSign parameters

Organisation administration > Setup > DocuSign > Templates

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | SAB_DSTemplateEntity  | Create new **SIGNINGSEQUENCE**. Organisation administration > Setup > DocuSign > Templates
2	                | SAB_DSTemplateEntity   | Create new **TEMPLATEID**. Organisation administration > Setup > DocuSign > Templates
3	                | SAB_DSTemplateEntity  | Create new **TEMPLATENAME**. Organisation administration > Setup > DocuSign > Templates


Organisation administration > Setup > DocuSign > Templates

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | SAB_DSTemplateSignerEntity  | Create new **DEPENDENTSORTING**. Organisation administration > Setup > DocuSign > Templates
2	                | SAB_DSTemplateSignerEntity   | Create new **DESCRIPTION**. Organisation administration > Setup > DocuSign > Templates
3	                | SAB_DSTemplateSignerEntity  | Create new **SAB_DSTEMPLATE_TEMPLATEID**. Organisation administration > Setup > DocuSign > Templates
4	                | SAB_DSTemplateSignerEntity   | Create new **SORTING**. Organisation administration > Setup > DocuSign > Templates
5	                | SAB_DSTemplateSignerEntity  | Create new **TYPE**. Organisation administration > Setup > DocuSign > Templates

Organisation administration > Setup > DocuSign > Templates

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | SAB_DSTemplateTabEntity  | Create new **ANCHORPOSITIONUOM**. Organisation administration > Setup > DocuSign > Templates
2	                | SAB_DSTemplateTabEntity   | Create new **ANCHORSTRING**. Organisation administration > Setup > DocuSign > Templates
3	                | SAB_DSTemplateTabEntity  | Create new **PAGENUMBER**. Organisation administration > Setup > DocuSign > Templates
4	                | SAB_DSTemplateTabEntity   | Create new **POSITIONX**. Organisation administration > Setup > DocuSign > Templates
5	                | SAB_DSTemplateTabEntity  | Create new **RADIOGROUPID**. Organisation administration > Setup > DocuSign > Templates
6	                | SAB_DSTemplateTabEntity  | Create new **SAB_DSTEMPLATE_TEMPLATEID**. Organisation administration > Setup > DocuSign > Templates
7	                | SAB_DSTemplateTabEntity   | Create new **SAB_DSTEMPLATESIGNER_SORTING**. Organisation administration > Setup > DocuSign > Templates
8	                | SAB_DSTemplateTabEntity  | Create new **SAB_DSTEMPLATESIGNER_TEMPLATE**. Organisation administration > Setup > DocuSign > Templates
9                 | SAB_DSTemplateTabEntity  | Create new **SIGNER**. Organisation administration > Setup > DocuSign > Templates
10	              | SAB_DSTemplateTabEntity  | Create new **TAB**. Organisation administration > Setup > DocuSign > Templates
11                | SAB_DSTemplateTabEntity   | Create new **TABPAGE**. Organisation administration > Setup > DocuSign > Templates
12	              | SAB_DSTemplateTabEntity  | Create new **TABPOSITION**. Organisation administration > Setup > DocuSign > Templates
13                | SAB_DSTemplateTabEntity  | Create new **TEXTCHARACTERLIMIT**. Organisation administration > Setup > DocuSign > Templates
