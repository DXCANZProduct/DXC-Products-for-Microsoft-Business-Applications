---
# required metadata

title: DXC Item Creation Wizard
description: DXC Item Creation Wizard - Creating an item
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  DXCICCreationTableListPage 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

## Create a new Item

Item creation extends on the standard AX functionality for creating/updating items.  It provides a streamlined way to create/update items, ensuring all required fields have been populated by different departments where necessary using workflow capabilities.  Once item information has been completed it is possible to approve item creation and release to multiple entities. 

You can reach the All creation items form by navigating to **Item creation > Item creation > All creation items**.

1.	Click *New*.
2.	Select *Template name* with a template type of *create*.
    * If a number sequence is not defined on the template, or is set to manual a *Product number* must be entered.  
3.	Click *OK* to open the *Designer* form.
4.	Complete the fields as per your [templates](../SETUP/ITEM-CREATION/Item-creation-templates.md) requirements.
5.	Click *Validate* to confirm fields and display the workflow menu.
6.	Under workflow, click *Submit* to commence the [Item creation workflow](../SETUP/Item-creation-workflows.md).       
7.	If this is the **last Step**  it will either generate the Product or request an Approval. This will be determined by the workflow configuration.

If there are **more Steps**  to complete then the next user(s) will need to complete their Steps.  Normally your workflow will be configured to email them or send them an alert to advise that there is a Workflow Product Creation for them to attend to.  To complete their step, they must: 

1.	Navigate to **Item creation > Item creation > Open creation items.** 
2.	Select the *relevant record.* 
3.	Click on the *Designer*  icon in the action pane. 
4.	Complete the fields as per your templates requirements.
5.	Click *Validate* to display workflow menu.
6.	Click *Submit* to continue the Item creation workflow.

*Note: It is possible to Close at any time; your entries will be saved.*
