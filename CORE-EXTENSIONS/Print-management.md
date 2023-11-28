---
# required metadata

title: Core Extensions
description: Core Extensions - Import/Export Print management settings
author: Peter Musumeci
manager: Kym Parker
ms.date: 2023-10-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  Print management document settings
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2023-10-31
ms.dyn365.ops.version: 10.0.34
---

# Import/Export Printer management settings

### Overview

A new data entity titled “Print management document settings” has been developed to allow for the export and subsequent import of document settings within the printer management forms including conditional settings to a CSV Format file where they can be subsequently imported into another environment or legal entity.  This new data entity is capable of exporting settings related to other DXC products including Smart Send and DocuSign.   The entity only exports Printer settings that have been set up and will not export settings in “default” status.
Print Management settings are available in the following Modules-<br>
•	Accounts receivable<br>
•	Inventory management<br>
•	Procurement and sourcing<br>
•	Project management and accounting<br>
•	Transportation management<br>
•	Warehouse management<br>


### Print management document settings Data Entity Overview

To Export Print management settings 
1. Navigate to **Workspaces > Data management > Export**
2. Create a new Group
    * **Group name** - Enter a name for the processing group e.g. Printer setup
    * **Description**	- Enter a description for the processing group e.g. Print management Settings Date 
    * **Data project operation type**	- Export
3.	Select Add entity
4.	Complete the dialog, 
    * **Entity name**	- Print management document settings
    * **Target data format** - CSV (due to complex string data format Excel is not recommended if import is required at a later date
    * **Use sample file**	- No
    * **Skip staging** - No (the entity will override the default value of Yes once added)
    * **Default refresh type** - All fields
5.	Select Add
7.	Select Close
8.	Select Export options > Export now from the action pane
9.	Once completed  select Download file from the menu bar
10.	This downloads a CSV file which can  be used in the Import process or stored as a backup in case of user error

Below is a brief outline of the availabel fields 

|  **Field**  | **Description** | 
|:---|:---|     
|  **NODETYPEt**  | Finance and Operation area that the print settings relate to.  For Example, Sales, Purchase, Project etc. <br> The node does not represent the Module, for example Accounts receivable module holds settings for Sales and some Inventory related tasks such as picking list |   
|  **PRIORITYID**  | Name of the form within Print management setup.  Eg. SalesOrderConfirmation. |  
|  **DESCRIPTION**  | Select the report name available in the system. |  
|  **DESTINATIONEMAILCC**  | Basic description of the business form. |  
|  **Email ID**  | Email templates to use when emailing the business form. |  
|  **File name**  | File name that will be generated for the business form or report. Placeholder tags are supported. This helps with giving meaningful name to the files. Refer to [Email placeholder](Email-placeholder.md) for further detail on supported placeholder tags. |  
