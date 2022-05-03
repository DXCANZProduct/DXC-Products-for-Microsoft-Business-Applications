---
# required metadata

title: [DXC Item Creation Wizard ]
description: [DXC Item Creation Wizard  - Item import]
author: [Liam Coll]
manager: Kym Parker
ms.date: 27/07/2021
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

# Item Import

Item import is a job that collects staged files imported into the *File management* workspace and creates an [import session](../../INQUIRIES/Creation-import-sessions.md) that will be automatically submitted to the active import [workflow](../../SETUP/Item-creation-workflows.md). A *template name* should be selected when run to refine the files included in the import session. You can reach the Item import job by navigating to **Item creation > Periodic Tasks > Creation > Item import**.

An infolog will be displayed that will notify the user of an error in processing of the import session. Additional details relating to the error can be accessed from the log on the import session line.

The function is able to be configured to run as a recurring job, preventing the need to create the import sessions manually.

*Note: To import files from a local folder to the cloud for staging in the File management workspace, please see the [File management user guide.](../../SETUP/File-management.md)
