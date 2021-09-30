---
# required metadata

title: [EDI Core]
description: [EDI Core - Item pack sizes]
author: [jdutoit2]
manager: Kym Parker
ms.date: 1/10/2021
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

# Item pack sizes
## Setup item pack sizes

Users can access the form by navigating to **Product information management > Products > Released products** and selecting FastTab **Manage inventory.**

Specify the **Inner unit** and **Outer unit** that should be used to identify an inner and outer quantity for the item. <br>
Example: Item has a unit conversion of 1 Case = 4 Six packs. **Outer unit** is set to _Case_, and **Inner unit** is set to _Six pack_.
> Note: Only those units that have a valid unit of conversion are available for selection. 

## Customer EDI module
These units and their unit conversion will be used to compare values received on the **Customer purchase order**. <br>
And confirm pack sizes within the **Customer purchase order acknowledgement** if **Customer purchase order acknowledgement** document settings:
- **Pack type** is set to _System pack_ and/or
- **Inner type** is set to _System inner_.

## Vendor EDI module
These units are sent on the **Vendor purchase order** and **Vendor purchase order change**. <br>
And will be used to compare pack sizes received within the **Vendor purchase order acknowledgement** if **Vendor purchase order acknoweledgement** document settings:
- **Confirmed pack** is set to _System pack_ and/or 
- **Confirmed inner** is set to _System inner_.

