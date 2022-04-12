---
# required metadata

title: [DXC Item Creation Wizard ]
description: [Introduction to DXC Item Creation Wizard - All creation items ]
author: [Liam Coll]
manager: Kym Parker
ms.date: 28/07/2021
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

# All creation items

**Item creation > Item creation > All creation items**. 

|  **Field**  | **Description** | 
|:---|:---|     
|  **Creation number**  | Unique identification for the creation record. |   
|  **Import session**  | Reference to the [import session](../INQUIRIES/Creation-import-sessions.md). Only populated for imported products. |  
|  **Template version**  | The template name and version number used for this record |
|  **Product**  | Product identifier for created/updated item. |   
|  **Step**  | Step that next requires an action to be taken, either to enter information or action workflow approval. |   
|  **New item number**  | If the template is creating a new item number, this will be reference. Used for creation templates. |   
|  **Existing item number**  | If the template references an existing item number this will be referenced. Used for update templates. |   
|  **Company**  | Company the item will be created/updated in. |   
|  **Status**  | Represent the stage of processsing through the workflow. <br /> * **Not submitted** - Import session was not submitted to workflow. Can be caused by a validation error or difference in mask and number of import fields. <br /> * **Submitted** - Import session has been submitted to workflow and is awaiting processing. <br /> * **Approved** - Import session has been approved in workflow and is awaiting actions. <br /> * **Completed** - Import session has been processed through workflow and items created/udpated. <br /> * **Canceled** - Workflow has been recalled. |  

### Designer

The designer will be presented to the user as the [item creation process](../PROCESSES/Creating-a-new-item.md) is initiated. This form can subsequently be accessed from the All creation items form for users needing to update the record prior to submission to workflow, or resulting from feedback received on rejection of the workflow submission.

When opening the designer, only those [tabs](Item-creation-template-tabs) and fields for the step referenced can be updated. Previously approved steps are locked for editing.

## Open creation items

Presents a filtered list of records found in the All creation items list page. Records with an active status value of *Not submitted*, *Approved* and *Submitted* will be visible. 

## Creation items assigned to me

Presents a filtered list of records found in the All creation items list page. Records that require a workflow action be undertaken by the user will be visible.

## Creation import sessions assigned to me

Presents a filtered list of records found in the [Import sessions](../INQUIRIES/Creation-import-sessions.md) list page. Records that require a workflow action be undertaken by the user will be visible.
