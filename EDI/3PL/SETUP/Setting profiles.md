---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL Setup - Document type Setting profiles]
author: [jdutoit2]
manager: Kym Parker
ms.date: 18/11/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# 3PL setup
## Document types - Setting profiles

Users can access the form by navigating to **EDI > Setup > Document types**.
Setting profiles can be created to specify the handling of specific scenarios. Once setup for each document type, the setting profile can be assigned to each document on the Trading partner setup in **EDI > Setup > Trading partners**

> Note:  The settings profiles FastTab is only displayed from Document types that have valid setting profile options

- To create a new record, select the applicable document type and select the **New** button in the settings profiles FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details. 

The following 3PL documents have setting profiles:
- [Vendor purchase order](SETTING%20PROFILES/Vendor%20purchase%20order.md)


## Document errors
When an incoming staging record/document errors, it has not created/updated the target D365 transaction. <br>
When an outgoing staging record/document errors, it has not created the Outbound file. <br>

Staging/document errors can be viewed at: <br>
- **EDI > Documents** - On each document type, user can set filter **Staging to target status** to _Error_
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.
