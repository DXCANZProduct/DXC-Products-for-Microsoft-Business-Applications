---
# required metadata

title: DXC Item Creation Wizard
description: DXC Item Creation Wizard - Releasing an existing item to another company
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCICCreationTableListPageOpen 
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

## Releasing an existing item to another company

Item creation extends on the standard AX functionality for releasing a product into a new company by also populating the values present on the released product. Fields included in the release template can also be updated, this allows for fields with values that are not consistant between companies to reflect the value required in the new company. Release templates are then submitted to the *Item creation workflow* for approval prior to the the released product being created. 

Release templates can be initiated from the All creation items form by selecting an active template with a template type of *release to a new company*. All creation items can be accessed by navigating to **Item creation > Item creation > All creation items**.

1.	Click *New*.
2.	Select *Template name* with a template type of *release to a new company*.
3.	Select the *Item number* the update will be applied to.
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
