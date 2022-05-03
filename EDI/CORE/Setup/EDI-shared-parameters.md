---
# required metadata

title: [EDI Core]
description: [EDI Core - Setup EDI shared parameters]
author: [jdutoi2]
manager: Kym Parker
ms.date: 12/01/2020
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

# EDI shared parameters
The **EDI shared parameters** page is used to define settings that apply across the **EDI** module. The setup on this page is shared across legal entities and can be modified by users with the appropriate security permissions.

To open the **EDI shared parameters** page, go to **EDI > Setup > EDI shared parameters**. Then set the fields as described in the following subsections.

## Prerequisites ##
* Setup [Cleanup profile](Cleanup-profile.md)
* Setup [Reset status profile](Reset-status.md#setup-reset-status-profile)

## Setup EDI shared parameters
The following table describes the fields that are available on the **General** tab on the **EDI shared parameters** page.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
<ins>**Cleanup**</ins>            |
**Cleanup profile**	              | Specify the default cleanup profile that will apply to all inbound and outbound staging records. <br> Can be overridden on Trading partner or Trading partner’s document level. <br> This field can also be left blank here and selected on only the specific Trading partner or Trading partner’s document level. <br> _Note: Setup the periodic job to run the cleanup/delete of staging records via **EDI > Periodic tasks > Cleanup documents**_
<ins>**Reset status**</ins>       | 
**Documents reset status**        |	Assign default Reset status profile for all staging documents. <br> Can be overridden on Trading partner’s document level. <br> This field can also be left blank here and selected on only the specific Trading partner’s document level. <br> _Note: Setup the periodic job to run the reset status of staging records via **EDI > Periodic tasks > Reset document status**_
**Files reset status**            |	Assign default Reset status profile for all inbound and outbound files. This field can't be specified/overridden on a Trading partner's document level. <br> _Note: Setup the periodic job to run the reset status of inbound and outbound files via **EDI > Periodic tasks > Reset document status**_
<ins>**Options**</ins>            |
**Enable XLST scripting**         |	Option to enable scripting for XLST. If not enabled and scripting is used on XLST document, it will error with _Execution of scripts was prohibited_
