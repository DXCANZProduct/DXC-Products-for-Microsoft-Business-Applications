---
# required metadata

title: DXC Item Creation Wizard 
description: DXC Item Creation Wizard - Creation import files
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-23
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  DXC Item Creation Wizard 
audience: Application User
# ms.devlang: 
ms.reviewer: liamcoll

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Creation import files

The creation import files form allows for the manual upload of one or more local files into D365. Imported files are staged in this form, visible as a tile with the *template name* and *import file mask* as a reference. On running the final stage of the process, *Creation item import*, a [creation import session](../../INQUIRIES/Creation-import-sessions) is created.

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
