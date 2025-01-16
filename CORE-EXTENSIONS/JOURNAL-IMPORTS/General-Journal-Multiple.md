---
# required metadata

title: Core Extensions
description: Core Extensions - Multiple Legal Entity General Journal
author: Peter Musumeci
manager: Pontus, Ek
ms.date: 2025-01-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: DM_DataManagementWorkspaceMenuItem
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci
# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-01-06
ms.dyn365.ops.version: AX 7.0.1
---

# General Journal Import for multiple Legal Entities 
## Overview
The **Import ledger journal multi company** functionality provides a user-friendly method to import general journal transaction data for multiple legal entities all from one target sheet while incorporating the  company offset field.  The import supports both Excel and CSV formats. All the standard validation and defaulting occur in the same way as the Data Management Framework (DMF) currently does for the standard General journal entity. 

##Set up 


|  **Field**  | **Description** |  **Mandatory** |
|:---|:---|:---|    



##Core ledger journal entity##
A new Data entry has been created titled *Core ledger journal entity* that incorporates additional fields and 

A new Data entity template can be created by following the standard [process](https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/blob/master/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.md#process)


The imports are based on Data Entities and allow for the configuration of [new templates](https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/blob/master/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.md#create-data-entity-file-templates) to be imported. Note: Standard DMF source formatting and field mapping limitations apply.

Benefits:
* User-friendly for importing rather than having to open and paste into Excel, adding or using the data management workspace.
* Reduces the risk of making mistakes.

https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/blob/master/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.md#create-data-entity-file-templates
