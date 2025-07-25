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
Introduced in Release 10.0.40.20250205

# General Journal Import for multiple Legal Entities 
## Overview
The **Import ledger journal multi-company** functionality provides a user-friendly method for importing general journal transaction data for multiple legal entities from one target sheet, incorporating the  company offset field.  The import supports both Excel and CSV formats. All the standard validation and defaulting occur in the same way as the Data Management Framework (DMF) currently does for the standard General journal entity.  The new menu item General ledger > Periodic tasks > Import ledger journal multi company has been created see [Process](https://dxcanzproduct.github.io/DXC-Products-for-Microsoft-Business-Applications/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.html#process) for further details

## Setup
### New General journal data entity
A new General journal Data Entity has been developed titled *Core ledger journal entity*.  This entity supports journals of type Daily. The allowed ledger types are Ledger, Bank, Vendor, and Customer. Once the data is run to target, the entity will automatically populate the Journal number with the next available in that legal entity.

The new entity introduces the below key fields (that are not part of the standard *General journal* entity)

|  **Field**  | **Description** |  **Mandatory** 
:---      |:---      |:---   
 **BATCHID** | When utilised, this is used to keep track of the actual values provided in the Excel template. When populating your Excel template, set this field to the same value as *JOURNALBATCHNUMBER*, which assigns the appropriate journal number. <br>When importing a journal, you can specify either *BATCHID*, *JOURNALBATCHNUMBER*, or both. When the journal batch number is populated after the import, it will be updated to the next available number in the target table. Still, the batch ID will keep the actual number specified in the template. If left blank, the field does not update on import. .| No|
**InterCo_Entity** |This populates the Intercompany/ Offset company for that line |No|
**TargetCompany** |This is the target Legal entity that the Journal is for.  The Target company will determine the required number sequence for *JOURNALBATCHNUMBER* |Yes|


### First-time use
Before use, the new entity needs to be configured as *set-based*, following the instructions below

1. Navigate to **Workspaces > Data management > Data entities** to display the list of available entities.<br>
2. Search for "Core ledger journal entity" in the *Entity* column <br>
3. Select *Edit* from the Action Pane and enable the *Set-based processing* tick box <br>
4. Click the *Save* icon.

### Map the security role for the data imports;
The Import project needs to have a security role applied to it for non-administrator users to have permission to import files into the journals and/or see the execution history resulting from the import. It is recommended that *Accounting Manager* be set to use the import features:

Navigate to **Workspace > Data management > Set up roles for data projects** <br>
Select New <br>
Add the *Accounting Manager* security role to the nominated processing group <br>


### Additional Instructions/References 

To create a  [Data Import template](https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/blob/master/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.md#create-data-entity-file-templates)<br>
To Create [Data Entity Import Project](https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/blob/master/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.md#create-data-entity-import-project)<br>
For [Security Roles](https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/edit/master/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.md#security-roles) and to Set up roles for data projects
For [Processing instructions](https://dxcanzproduct.github.io/DXC-Products-for-Microsoft-Business-Applications/CORE-EXTENSIONS/JOURNAL-IMPORTS/General-and-inventory-journal-import.html#process)

