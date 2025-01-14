---
# required metadata

title: Core Extensions
description: DXC Core extensions - Coming Soon
author: PMusumeci
manager: Pontus Ek
ms.date: 2024-07-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  Pending Release, Coming Soon, Updates, New
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2024-06-07
ms.dyn365.ops.version: AX 7.0.1
---

# 	Coming Soon
This document describes the features that are either pending or planned in upcoming releases

# Current version

<ins>Bug fixes</ins>

Number	  	| Name	  | Description
:--       	|:--              |:--
18101|Removal of references and model for Business Process Suite| Business Process links were originally designed for Mavim and SharePoint integration. Both Mavim and Sharepoint have alternate connection capabilities with D365 Finance and Operations and the product is no longer being utilised as part of Core Extensions.  References within the Core extension product have been removed and will no longer be included in releases.  Customers should remove the Model from existing environments. following the instructions outlined by Micorosft - [Uninstall a package](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/deployment/uninstall-deployable-package)
18908|Ability to create multiple General Ledger Journals in Multiple legal entities from a single uplaod| A new data entity and menu item has been created to facilitate this functionality |

