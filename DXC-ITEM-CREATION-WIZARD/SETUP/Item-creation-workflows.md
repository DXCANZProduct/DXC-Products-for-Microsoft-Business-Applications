---
# required metadata

title: DXC Item Creation Wizard  
description: DXC Item Creation Wizard - Set up Workflow  
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form: DXCICWorkflowConfiguration 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
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
