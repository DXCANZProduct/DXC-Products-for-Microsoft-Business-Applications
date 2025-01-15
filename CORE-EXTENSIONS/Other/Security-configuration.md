---
# required metadata

title: Core extension
description: Core extension - Security configuration
author: HelenHo
manager: Kym Parker
ms.date: 2022-04-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Core-extension security
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: HelenHo
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Security configuration

## Core Extension
For Core extensions/Core Utilities there are no New Security roles as part of the ISV however we have extended standard security roles to allow for journal import menus to be displayed.  Additionally, you will require access to the required module and menu item to access the required enhanced feature.

The Import projects need to have security roles applied to them for non-administrator users to have permission to import files into the journals. 
It is recommended that the following roles be set to use the import features:

**Roles**         | **Import Feature**                    
:-----            |:------------------------        
Accounting Manager                | 	Import General Journal and Import ledger journal multi company
Materials Manager                 |   Import Inventory Adjustment Journal
Materials Manager                 |   Import Inventory Movement Journal


To run the User security audit details report, you must be assigned the “Security administrator” role.

**Data Anonymization**
 
the Data Anonymization feature can only be accessed by the System administrator security role
 
To  Import or Export Printer management settings you need access to the Data management Framework.  To View the results you require access to the relevant module and at minimum Data management operations user to view execution results 

