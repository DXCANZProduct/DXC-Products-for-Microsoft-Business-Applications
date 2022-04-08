---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL Setup - Document type Setting profiles - Inventory adjustment advice - Transfer]
author: [jdutoit2]
manager: Kym Parker
ms.date: 18/11/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [EDI]
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

# 3PL document type setting profiles - Inventory adjustment advice - Transfer

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Inventory adjustment advice - Transfer**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Journal name**    |	Specify the transfer journal name for transfer adjustments	| Journal names of **Journal type** set to _Transfer_ from **Inventory management > Setup > Journal names > Inventory**
**Auto post journal** |	When the transfer journal is created, the journal should also be automatically posted	| • **No** – Transfer journal created, but not posted <br> • **Yes** – Transfer journal posted
**Create batch**	  | If the 3PL’s batch doesn’t exist in D365, allow the batch to be created. Batch details from message will be used to create the D365 batch	| • **No** – Staging record will error if batch doesn't exist in D365 <br> • **Yes** - D365 batch created and used in Transfer journal

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Inventory adjustment advice - Transfer** for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings Inventory adjustment - Transfer
