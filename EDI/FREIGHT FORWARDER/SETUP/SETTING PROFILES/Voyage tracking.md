---
# required metadata

title: [EDI Freight forwarder]
description: [EDI Freight forwarder Setup - Document type Setting profiles - Voyage tracking]
author: [jdutoit2]
manager: Kym Parker
ms.date: 25/11/2021
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

# Freight forwarder document type setting profiles - Voyage tracking

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Voyage tracking**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Voyage Id source**  |	Determine the method of voyage identification used	| •	**Internal Id** – Landed cost Voyage <br> •	**External Id** – Freight forwarder’s booking reference = Landed cost Booking reference
<ins>**Date qualifiers**</ins>
**Actual**          |	Date in file is an actual date, and will update the tracking leg's **Start date** or **Actual end date**. Dependent on Activity mappings's **Date selection**   | X12 example = 140
**Estimated**       |	Date in file is an estimated date, and will update the tracking leg's **Estimated end date** if the Activity mappings's **Date selection** is related to _End date_   | X12 example = 139

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Voyage tracking** for the Freight forwarder landed cost Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI setting voyage tracking
