---
# required metadata

title: Core Extensions
description: Core Extensions - General and inventory journal imports
author: Liam Coll
manager: Kym Parker
ms.date: 2021-08-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: DM_DataManagementWorkspaceMenuItem
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll
# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# General and Inventory Journal Import
## Overview
The Import Journal functionality provides a user-friendly method to import general journal and inventory journal transaction data from Excel or CSV files. All the standard validation and defaulting occurs in the same way as the Data Management Framework (DMF). Both General Journals and Inventory Journals are supported. The imports are based on Data Entities and allow for the configuration of new templates to be imported. Note: Standard DMF source formatting and field mapping limitations apply.

Benefits:
* User-friendly for importing rather than having to open and paste into Excel, adding or using the data management workspace.
* Reduces the risk of making mistakes.

## Setup
### General journal data entities
For the General journal import, use the *General journal* entity. This entity supports journals of type Daily. The allowed ledger types are Ledger, Bank, Vendor, and Customer.

### Inventory journal data entities
For inventory journals, the *Inventory adjustment journal headers and lines V2* and the *Inventory movement journal headers and lines V3* can be used.

### Create data entity file templates
Data entity templates must be established to enable the importing of files into Dynamics 365. To create a data entity template:
1. Navigate to **Workspaces > Data management > Export**.
2. Create a new Group.
* **Group name** - Enter a unique and meaningful name for the processing group, e.g. CREX-EXP or Multi-Entity.
* **Description**	- Enter a meaningful description for the processing group, e.g. Core Extensions Template Export.
* **Data project operation type**	- Export.
3.	Select Add Entity.
4.	Complete the dialogue, for example:
    * **Entity name**	- General Journal
    * **Target data format** - Excel
    * **Use sample file**	- No
    * **Skip staging** - No
    * **Default refresh type** - All fields
5.	Select Add
6.	Repeat 3 - 5 for each data entity that requires a template to be created.
    * Inventory adjustment journal headers and lines V2
    * Inventory movement journal headers and lines V3
    * Core ledger journal entity
7.	Select Close
8.	Select Export options > Export now from the action pane
9.	Select each entity and select Download file from the menu bar
10.	This downloads a CSV template file which will be used in the Import project setup
 
 
### Create Data Entity Import Project
An Import Project (processing group) must be established to enable the importing of files. To create an Import project; 
1. Navigate to **Workspaces > Data management > Import**
2. Create a new Group
    * **Group name** - Enter a name e.g. GLJ-Import
    * **Description**	- Enter a description e.g. General Journal Import
    * **Data project operation type**	- Import
3. Select Add file
4. Complete the dialogue with the following information
    * **Entity name** -	General journal
    * **Source data format** - CSV
    * **Use sample file** -	No
    * **Default refresh type** - Full push only
    * **Upload data file** - e.g. CREX-EXP-General journal.csv
5. Select Upload and add and browse to the template file created in the previous step e.g. CREX-EXP-General journal.csv
    * *Note some templates will require some manual cleansing, for example, the General Journal entity includes the field ISPOSTED, and this column must be removed prior to Upload and Add*
6. Select Close
7. Repeat the setup for
    * Inventory adjustment journal (Inventory adjustment journal headers and lines V2)
    * Inventory movement journal (Inventory movement journal headers and lines V3)
 
### Security Roles
The Import project needs to have security roles applied to it for non-administrator users to have permission to import files into the journals and/or see the execution history resulting from the import. It is recommended that the following roles are set to use the import features:

|  **Role**  | **Import Feature** | 
|:---|:---|     
|  **Accounting Manager**  | Import General Journal |   
|  **Data management operations userr**  | View Execution History | 
|  **Materials Manager**  | Import Inventory Adjustment Journal |   
|  **Materials Manager**  | Import Inventory Movement Journal |   


To create the security roles for the data imports;
1. Navigate to **Workspace > Data management > Set up roles for data projects**
2. Select New
3. Add the security roles for each processing group

## Process
To import the journals; 
1. Navigate to to appropriate form for the journal type
    * **General ledger** - General ledger > Periodic tasks > Import ledger journal
    * **Inventory adjustment** - Inventory management > Periodic tasks > Import inventory adjustment journal
    * **Inventory movement** - Inventory management > Periodic tasks > Import inventory movement journal
2. Select the import processing group created, upload a file and click OK.

When you click OK, the system will run the process in asynchronous mode (background). You will be redirected to the execution history. Click on the refresh button at the top to see the latest status. 

*Note: The inventory movement journal import uses the Inventory movement journal headers and lines V4 data entity which as standard loads the data based on the scenario where if an existing Inventory Movement Journal with less than 1,000 lines is “Not posted”, the imported lines will be appended to the existing journal, otherwise a new journal will be created.*

## Data entities
- Inventory adjustment journal headers and lines V2 entity
- Inventory movement journal headers and lines V4 entity
