
---
# required metadata

title: [DXC Item Creation Wizard]
description: [DXC Item Creation Wizard - Create an Item ]
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

## Create an Item

Item creation extends on the standard AX functionality for creating/updating items.  It provides a streamlined way to create/update items, ensuring all required fields have been populated by different departments where necessary using workflow capabilities.  Once item information has been completed it is possible to approve item creation and release to multiple entities.

You can reach the All creation items form by navigating to
**Item creation > Item creation > All creation items**

Note: Also available for selection are the ‘Open creation items; and ‘Creation items assigned to me’. These forms work in the same manner as the ‘All creation items; however, they have been filtered to only show certain records.

Note: There is an assumption that workflow has been created. For information on how to create workflows please refer to the standard Dynamics 365 Finance and Operations, Enterprise Edition functionality

1.	Click New.
2.	Select Template name. 

Note: If it was a Copy or Update template then you will also need to select the item number.

3.	Click **OK**. 

4.	The **Designer** form will open, complete the fields as per your templates requirements and click **Validate**  and **Submit**  to submit the workflow.  Note: It is possible to Close at any time; your entries will be saved.     

5.	If this is the **last Step**  it will either generate the Product or request an Approval. 

6.	If there are **more Steps**  to complete then the next user(s) will need to complete their Steps.  Normally your workflow will be configured to email them or send them an alert to advise that there is a Workflow Product Creation for them to attend to.  To complete their step, they must: 

    1.	Navigate to **Item creation > Item creation > Open creation items.** 
    2.	Select the **relevant record.** 
    3.	Click on the **Designer**  icon from the Ribbon. 
    4.	Once the fields have been selected/entered click Validate and Submit to Item Status

The items status controls whether a product can be purchased, sales order (create a sales order), sales picking (create a pick list or output order) or sales return (allow sales returns).  In addition, the status can be used by the business to determine where in its lifecycle the product is.  This functionality replaces the Stopped flag against the Product if the Parameter to use Item status is switched on.  If the flag is not switched on, then the status is for informational purposes only.

*Note: Item status can be held at the item level or down at the item dimension level.*

