---
# required metadata

title: EDI Core
description: EDI Core - Item pack sizes
author: jdutoit2
manager: Kym Parker
ms.date: 2021-10-01
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  EcoResProductDetailsExtendedGrid
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
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

