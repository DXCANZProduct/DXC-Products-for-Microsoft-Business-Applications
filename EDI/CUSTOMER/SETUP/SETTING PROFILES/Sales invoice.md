---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setting profiles - Sales invoice]
author: [jdutoit2]
manager: Kym Parker
ms.date: 23/09/2021
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

# Customer document type setting profiles - Sales invoice

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Sales invoice**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Invoice type**</ins>
**Invoice**         | Specify mapping for Invoice               | • EDIFACT example: 388 = Tax invoice or 380 = Commercial invoice <br> X12 example: VJ = Commercial invoice
**Credit adjustment note**  | Specify mapping for Credit note   | • EDIFACT example: 381 = Credit note <br> • X12 example: CR = Credit memo
**Don't send credit note**  | Specify if credit notes should be sent to the customer  | •	**No** - When posting a credit note, the **Send to EDI** will be disabled and won't create a Sales invoice staging record. <br> •	**Yes** - When posting a credit note, the **Send to EDI** will be enabled and will create a Sales invoice staging record.

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Sales invoice** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - Sales invoice

