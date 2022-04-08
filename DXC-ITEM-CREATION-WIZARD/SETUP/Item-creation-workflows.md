---
# required metadata

title: [DXC Item Creation Wizard  ]
description: [DXC Item Creation Wizard - Set up Workflow  ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DXC Item Creation Wizard ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [helenho]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Item creation workflows

Workflows are used in item creation to manage the approval of created, released or updated products. You can reach the item creation workflow form by navigating to **Item creation > Setup > Item creation workflows**

## Workflow types

A default workflow must be created for each of the creation methods in use.

|  **Workflow type**  | **Description** | 
|:---|:---|     
|  **Item creation workflow**  | Workflow applied to item creation records initiated manually from within the *All creation items* form |  
|  **Item creation import workflow**  | Workflow applied to imported records visible from the *Item creation import sessions* form |  

## Workflow elements

Additional elements have been created for use with item creation workflow.

|  **Workflow element**  | **Description** | 
|:---|:---|     
|  **Approve item creation step**  | Use this element to approve an item creation step. |  
|  **Change item status**  | This element will update the item status based on the template configuration. |  
|  **Create/update item**  | Will create or update the item that has been submitted to the workflow. Applicable to *Item creation workflow* |  
|  **Run creation**  | Will create or update all items in the import session that has been submitted to the workflow. Applicable to *Item creation import workflow* | 
|  **Set next step**  | Will update the item creation record to the next step in the template. | 
|  **Edit step**  | Allows for editing of the record that has been submitted. | 

Note: For information on how to create a workflow please refer to the [standard Dynamics 365 Finance and Operations, Enterprise Edition functionality.](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/organization-administration/create-workflow?toc=/dynamics365/finance/toc.json)
