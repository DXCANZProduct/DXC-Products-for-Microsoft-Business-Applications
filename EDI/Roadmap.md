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
2022-09			| 30 September 2022
2023-01		 	| 31 January 2023
2023-03			| 31 March 2023
2023-06			| 30 June 2023


## Next release
ETA: 30 September 2022

The planned features are grouped by module. Core is included for all modules.

#### Core
- **Electronic reporting** document type template

#### Customer
- **EDI history** on D365 source/target. 
    - Sales agreement:
        - Customer purchase order

#### Vendor

#### 3PL
- **EDI history** on D365 source/target.
    - Sales order:
        - Picking list registration
    - Purchase order:
        - Shipment advice - Purchase order
        - Shipment receipt - Purchase order
    - Transfer order:
        - Picking list
        - Picking list registration
        - Shipment advice - Transfer order
        - Shipment receipt - Transfer order
    - Return order:
        - Shipment advice - Return order
        - Shipment receipt - Return order
    - Voyage:
        - Shipment advice - Voyage
        - Shipment receipt - Voyage

#### Freight forwarder Landed cost
- **EDI history** on D365 source/target.
    - Voyage:
        - Voyage creator
        - Voyage tracking

## Future releases
The following features are planned for a future release


## Deprecate
The following is planned to be deprecated

#### September release
- MS has deprecated scripting. We will therefor remove setting **Enable scripting** from **EDI shared parameters** in the September release.
