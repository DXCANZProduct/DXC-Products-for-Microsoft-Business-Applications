---
# required metadata

title: DXC Item Creation Wizard 
description: DXC Item Creation Wizard  - Item import
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-27
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  DXC Item Creation Wizard 
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

# Item Import

Item import is a job that collects staged files imported into the *File management* workspace and creates an [import session](../../INQUIRIES/Creation-import-sessions.md) that will be automatically submitted to the active import [workflow](../../SETUP/Item-creation-workflows.md). A *template name* should be selected when run to refine the files included in the import session. You can reach the Item import job by navigating to **Item creation > Periodic Tasks > Creation > Item import**.

An infolog will be displayed that will notify the user of an error in processing of the import session. Additional details relating to the error can be accessed from the log on the import session line.

The function is able to be configured to run as a recurring job, preventing the need to create the import sessions manually.

*Note: To import files from a local folder to the cloud for staging in the File management workspace, please see the [File management user guide.](../../SETUP/File-management.md)
