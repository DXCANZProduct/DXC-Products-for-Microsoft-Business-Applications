---
# required metadata

title: [DXC Item Creation Wizard ]
description: [DXC Item Creation Wizard - Creation import files]
author: [Liam Coll]
manager: Kym Parker
ms.date: 23/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DXC Item Creation Wizard ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [liamcoll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Creation import files

The creation import files form allows for the manual upload of one or more local files into D365. Imported files are staged in this form, visible as a tile with the *template name* and *import file mask* as a reference. On running the final stage of the process, *Creation item import*, a [creation import session](Creation_import_sessions) is created.

## Importing a file

1. Select the *template name* the imported file will apply to. This will be the current version of the template and will only be visible if the version has been activated.
2. Select the *import file mask* the imported file will be marked with.
3. Select *upload* to browse and select a local file.
4. From the action pane, select *Creation item import*
5. Select the *template name* and confirm to submit all staged files of this type for creation. 

*Note: Steps 2 and 3 can be repeated if a template containers multiple file masks.*

## Deleting a file

The delete icon can be located directly above the staged records, along side the filter field. 

1. Mark the file/s.
2. Select the delete icon.
