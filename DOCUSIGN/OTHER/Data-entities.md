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
Organisation administration > Setup > DocuSign

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1                | DocuSign parameters  | set/update **DocuSign parameters**.  |
2                | Template  | Create new **DocuSign Templates**.   |
3                | Signatories  | Create new **DocuSign Signatories** for a specified Template.   | Templates 
4                | Tags  | Create new **DocuSign Tags** for a specified Temaplate.   | Templates
5	               | DocuSign document types  | Create new **Document Type**.  | Templates

