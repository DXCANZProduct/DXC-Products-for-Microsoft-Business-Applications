---
# required metadata

title: Core extension 
description: Core extension - Data entities
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
ms.search.region: Core extension 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: HelenHo
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Data entities

The following is a summary of data entities available for the Core extension  module:

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | General journal entity  | Setup  **Currency exchange rate**. General ledger > Currencies > Configure exchange rate providers 
2	                | General journal entity  | Import  **Currency exchange rate**. General ledger > Currencies > Import Currency exchange rate 

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | General journal entity  | create new  **General journal**. General ledger > Periodic task > Import generak journal

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Inventory adjustment journal headers and lines V2 entity | Create new ** Inventory adjustment journal**. Inventory management > Periodic tasks > Import inventory adjustment journal
2	                | Inventory movement journal headers and lines V4 entity  | Create new **Inventory movement journal  **.Inventory management > Periodic tasks > Import inventory movement journal

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Print management document settings  | Setup  **Print management** Accounts payable > Setup > Forms > Form setup. 
