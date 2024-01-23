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
1	                | DocuSign document types  | Create new **DOCUMENTNAME**. Organisation administration > Setup > DocuSign > Document types
2	                | DocuSign document types  | Create new **ALLOWCHANGERESP**. Organisation administration > Setup > DocuSign > Document types
3	                | DocuSign document types   | Create new **ALLOWPAPERSIGN**. Organisation administration > Setup > DocuSign > Document types
4	                | DocuSign document types  | Create new **AUTOSEND**. Organisation administration > Setup > DocuSign > Document types
5	                | DocuSign document types           | Create new **ENABLEADVANCEDSETUP**. Organisation administration > Setup > DocuSign > Document types
6	                | DocuSign document types    | Create new **EXPIRYDAYS**. Organisation administration > Setup > DocuSign > Document types
7	                | DocuSign document types       | Create new **EXPIRYWARNDAYS**. Organisation administration > Setup > DocuSign > Document types
8	                | DocuSign document types | Create new **ISPRINTMANGEMENTREPORT**. Organisation administration > Setup > DocuSign > Document types
9	                | DocuSign document types  | Create new **PRINTMGMTDOCUMENTTYPE**. Organisation administration > Setup > DocuSign > Document types
10	              | DocuSign document types   | Create new **PRINTMGMTREPORTFORMAT**. Organisation administration > Setup > DocuSign > Document types
11	              | DocuSign document types  | Create new **PRINTMGMTREPORTFORMAT_COUNTRYREGIONID**. Organisation administration > Setup > DocuSign > Document types
12                | DocuSign document types  | Create new **PRINTMGMTREPORTFORMAT_DESCRIPTION**. Organisation administration > Setup > DocuSign > Document types
13                | DocuSign document types           | Create new **PRINTMGMTREPORTFORMAT_DOCUMENTTYPE**. Organisation administration > Setup > DocuSign > Document types
14                | DocuSign document types    | Create new **PRINTMGMTREPORTFORMATRECID**. Organisation administration > Setup > DocuSign > Document types
15	              | DocuSign document types       | Create new **REMINDERDAYS**. Organisation administration > Setup > DocuSign > Document types
16                | DocuSign document types | Create new **REMINDERRESENDDAYS**. Organisation administration > Setup > DocuSign > Document types
17	              | DocuSign document types           | Create new **REPORTNAME**. Organisation administration > Setup > DocuSign > Document types
18                | DocuSign document types    | Create new **SAB_DSTEMPLATE_TEMPLATEID**. Organisation administration > Setup > DocuSign > Document types
19                | DocuSign document types       | Create new **SENDAUTOREMINDER**. Organisation administration > Setup > DocuSign > Document types


Organisation administration > Setup > DocuSign > DocuSign parameters

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | DocuSign parameters  | Create new **ENABLEEXCEPTIONLOG**. Organisation administration > Setup > DocuSign > DocuSign parameters
2	                | DocuSign parameters   | Create new **INTEGRATORKEYSECRETNAME**. Organisation administration > Setup > DocuSign > DocuSign parameters
3	                | DocuSign parameters  | Create new **KEY**. Organisation administration > Setup > DocuSign > DocuSign parameters
4	                | DocuSign parameters  | Create new **OAUTHSERVERURL**. Organisation administration > Setup > DocuSign > DocuSign parameters
5	                | DocuSign parameters           | Create new **PLACEHOLDEREMAIL**. Organisation administration > Setup > DocuSign > DocuSign parameters
6	                | DocuSign parameters    | Create new **RSAPRIVATEKEYSECRETNAME**. Organisation administration > Setup > DocuSign > DocuSign parameters
7	                | DocuSign parameters       | Create new **STATUSUPDOVERLAPMINUTES**. Organisation administration > Setup > DocuSign > DocuSign parameters
8	                | DocuSign parameters | Create new **USERID**. Organisation administration > Setup > DocuSign > DocuSign parameters
9	                | DocuSign parameters  | Create new **WEBSERVICEURL**. Organisation administration > Setup > DocuSign > DocuSign parameters

Organisation administration > Setup > DocuSign > Templates

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Template  | Create new **SIGNINGSEQUENCE**. Organisation administration > Setup > DocuSign > Templates
2	                | Template   | Create new **TEMPLATEID**. Organisation administration > Setup > DocuSign > Templates
3	                | Template  | Create new **TEMPLATENAME**. Organisation administration > Setup > DocuSign > Templates


Organisation administration > Setup > DocuSign > Templates

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Signatories  | Create new **DEPENDENTSORTING**. Organisation administration > Setup > DocuSign > Templates
2	                | Signatories   | Create new **DESCRIPTION**. Organisation administration > Setup > DocuSign > Templates
3	                | Signatories  | Create new **SAB_DSTEMPLATE_TEMPLATEID**. Organisation administration > Setup > DocuSign > Templates
4	                | Signatories   | Create new **SORTING**. Organisation administration > Setup > DocuSign > Templates
5	                | Signatories  | Create new **TYPE**. Organisation administration > Setup > DocuSign > Templates

Organisation administration > Setup > DocuSign > Templates

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Tags  | Create new **SAB_DSTEMPLATE_TEMPLATEID**. Organisation administration > Setup > DocuSign > Templates
2	                | Tags   | Create new **SAB_DSTEMPLATESIGNER_SORTING**. Organisation administration > Setup > DocuSign > Templates
3	                | Tags  | Create new **TAB**. Organisation administration > Setup > DocuSign > Templates
4	                | Tags  | Create new **TABPOSITION**. Organisation administration > Setup > DocuSign > Templates
5	                | Tags   | Create new **ANCHORSTRING**. Organisation administration > Setup > DocuSign > Templates
6	                | Tags  | Create new **ANCHORPOSITIONUOM**. Organisation administration > Setup > DocuSign > Templates
7	                | Tags  | Create new **PAGENUMBER**. Organisation administration > Setup > DocuSign > Templates
8	                | Tags   | Create new **POSITIONX**. Organisation administration > Setup > DocuSign > Templates
9	                | Tags   | Create new **POSITIONY**. Organisation administration > Setup > DocuSign > Templates
10	                | Tags  | Create new **RADIOGROUPID**. Organisation administration > Setup > DocuSign > Templates
111                | Tags   | Create new **TABPAGE**. Organisation administration > Setup > DocuSign > Templates
12                | Tags  | Create new **TEXTCHARACTERLIMIT**. Organisation administration > Setup > DocuSign > Templates

