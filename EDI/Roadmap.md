---
# required metadata

title: EDI
description: EDI - Roadmap
author: jdutoit2
manager: Kym Parker
ms.date: 2022-06-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: [["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
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
