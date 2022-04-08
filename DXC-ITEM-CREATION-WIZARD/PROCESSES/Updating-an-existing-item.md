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
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

## Update an existing item

Item creation extends on the standard AX functionality for updating items.  It provides a streamlined way to update already populated fields on an item, or enter values against other fields not entered at the time of item creation. Updates are then submitted to the *Item creation workflow* for approval prior to the update being actioned. 

All updates can be initiated from the All creation items form by selecting an active template with a template type of *update*. All creation items can be accessed by navigating to **Item creation > Item creation > All creation items**.

1.	Click *New*.
2.	Select *Template name* with a template type of *update*.
3.	Select the *Item number* the update will be applied to.
    * If the item number is a field being updated by the template the new number should be entered as the *Product number*. This is only available where the item has not been transacted.  
3.	Click *OK* to open the *Designer* form.
4.	Complete the fields as per your [templates](Item-creation-templates) requirements.
5.	Click *Validate* to confirm fields and display the workflow menu.
6.	Under workflow, click *Submit* to commence the [Item creation workflow](Item-creation-workflows).       
7.	If this is the **last Step**  it will either update the released product or request an Approval. This will be determined by the workflow configuration.

If there are **more Steps**  to complete then the next user(s) will need to complete their Steps.  Normally your workflow will be configured to email them or send them an alert to advise that there is a workflow action for them to attend to.  To complete their step, they must: 

1.	Navigate to **Item creation > Item creation > Open creation items.** 
2.	Select the *relevant record.* 
3.	Click on the *Designer*  icon in the action pane. 
4.	Complete the fields as per your templates requirements.
5.	Click *Validate* to display workflow menu.
6.	Click *Submit* to continue the Item creation workflow.

*Note: It is possible to Close at any time; your entries will be saved.*
