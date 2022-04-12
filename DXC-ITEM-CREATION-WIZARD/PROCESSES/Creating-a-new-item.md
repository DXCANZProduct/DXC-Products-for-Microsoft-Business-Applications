---
# required metadata

title: [DXC Item Creation Wizard]
description: [DXC Item Creation Wizard - Creating an item]
author: [Liam Coll]
manager: Kym Parker
ms.date: 29/07/2021
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

## Create a new Item

Item creation extends on the standard AX functionality for creating/updating items.  It provides a streamlined way to create/update items, ensuring all required fields have been populated by different departments where necessary using workflow capabilities.  Once item information has been completed it is possible to approve item creation and release to multiple entities. 

You can reach the All creation items form by navigating to **Item creation > Item creation > All creation items**.

1.	Click *New*.
2.	Select *Template name* with a template type of *create*.
    * If a number sequence is not defined on the template, or is set to manual a *Product number* must be entered.  
3.	Click *OK* to open the *Designer* form.
4.	Complete the fields as per your [templates](SETUP/ITEM-CREATION/Item-creation-templates) requirements.
5.	Click *Validate* to confirm fields and display the workflow menu.
6.	Under workflow, click *Submit* to commence the [Item creation workflow](Item-creation-workflows).       
7.	If this is the **last Step**  it will either generate the Product or request an Approval. This will be determined by the workflow configuration.

If there are **more Steps**  to complete then the next user(s) will need to complete their Steps.  Normally your workflow will be configured to email them or send them an alert to advise that there is a Workflow Product Creation for them to attend to.  To complete their step, they must: 

1.	Navigate to **Item creation > Item creation > Open creation items.** 
2.	Select the *relevant record.* 
3.	Click on the *Designer*  icon in the action pane. 
4.	Complete the fields as per your templates requirements.
5.	Click *Validate* to display workflow menu.
6.	Click *Submit* to continue the Item creation workflow.

*Note: It is possible to Close at any time; your entries will be saved.*
