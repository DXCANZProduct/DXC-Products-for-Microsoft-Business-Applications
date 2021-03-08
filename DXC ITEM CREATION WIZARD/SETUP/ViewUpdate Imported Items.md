---
# required metadata

title: [DXC Item Creation Wizard ]
description: [Introduction to DXC Item Creation Wizard - View/Update Imported Items  ]
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

### 3.2.2	 View/Update Imported Items

**Item creation > Inquiries > Item creation import sessions**

Each time a bulk item import is processed, a record is created in the Item creation import sessions form.

1.	Select a relevant **session**.  Each import session is date/time stamped with the Start date/time that the import was processed.

2.	The **End date/time** identified the date/time that workflow was completed and the item created.

3.	**Status** indicates the workflow status. The workflow history can also be viewed via the **Action > view history** button.  For further information, please see standard Microsoft user guides.

4.	Click **Lines** button. 

5.	Each item imported is allocated an item creation # and allocated a status to **notify of any errors.**

6.	The **Log **button will detail further information about the error.

7.	To **view/rectify** validation errors, select the **Designer** button

8.	Once item has been updated, select the  **Validate** button.

*Note: When using a multi-step item creation template, all item information is imported at once, same way as in single step. However, data validation, update and correction must happen step by step.
All items loaded within a single session must pass validation before workflow can be processed and next step completed. A single item from the bulk upload cannot be separated, validated and processed through workflow independently.*
