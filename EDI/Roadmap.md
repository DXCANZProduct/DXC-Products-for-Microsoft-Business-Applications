---
# required metadata

title: [EDI]
description: [EDI - Roadmap]
author: [jdutoit2]
manager: Kym Parker
ms.date: 9/06/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Release notes]
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

# 	Roadmap / Release schedule

This page describes the features planned for future releases and planned release dates.

> Note: Dates and features are subject to change.


## Release schedule

Release			| ETA
:--			|:--
June release		| 30 June 2022
September release	| 30 September 2022
December release 	| 13 January 2023

## Next release
ETA: 30 June 2022

The planned features are grouped by module. Core is included for all modules.

#### Core
- Allow **empty date** value
- **Copy** functionality on:
	- Document type:
		- Template setup
		- Template mapping
		- Setting profiles
		- Validation
	- Trading partner
- **Outbound filename Editor** improvement 
- XML document template mapping - **Attributes**
- **Functional acknowledgement received** - Add company to record (for filter)
- **Outbound files** - File transfer type and path file has been exported to

#### Customer
- **Customer purchase order** and **Customer purchase order change** (add new item) - New document setting **Blank sales unit**. If customer doesn't send a sales unit in the file, the document setting can be used to use either of the following when processing to target:
	-  Sales unit
	-  Sales trade agreement unit
	-  Inventory unit
	-  Error
- **Customer purchase order** - New field **Comments** on header and lines

#### Vendor
- **Vendor purchase order change** - Add **Line change type** to D365 Purchase order line (EDI tab)
- **Purchase invoice** - Support partial invoice (doesn't match to 100% of product receipt) for. If Invoice quantity < Shipped quantity then set 'Product receipt quantity to match' = Invoice quantity

## Future releases
The following features are planned for a future release

- **Electronic reporting** document type template
- **EDI history** on D365 source/target. Currently only a few documents included on Sales order and Purchase order

## Deprecate
The following is planned to be deprecated

### September release
- MS has deprecated scripting. We will therefor remove setting **Enable scripting** from **EDI shared parameters** in the September release.
