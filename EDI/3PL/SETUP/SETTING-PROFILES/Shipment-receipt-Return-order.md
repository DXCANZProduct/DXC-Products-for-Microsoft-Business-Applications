---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL Setup - Document type Setting profiles - Shipment receipt - Return order]
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
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# 3PL document type setting profiles - Shipment receipt - Return order

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Shipment receipt - Return order**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Auto post journal** |	When the return order receipt is received and arrival journal created, the journal should also be automatically posted	| • **No** – Arrival journal is created, but not posted <br> • **Yes** –  Arrival journal is automatically posted
**Post delivery note**  |	Enabled when **Auto post journal** is set to _Yes_. <br> Only posts the delivery note if none of the lines contains a _Replace_ Action since this requires manual action on the return order before a delivery note can be posted.	| • **No** – Return order’s delivery note is not posted <br> • **Yes** – Return order’s delivery note is automatically posted
**Cancel return quantity remainder**  | When the receipt qty < Return order line’s qty, the return order line’s qty is updated to match receipt. i.e. not split line created for 'remainder'	| If receipt qty < return qty: <br> • **No** – Return order line is split for the 'remainder' <br> • **Yes** – Return order line isn’t split for the 'remainder' and the existing line’s qty is updated to match receipt qty

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Shipment receipt - Return order** for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings Shipment Receipt - Return order
