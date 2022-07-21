---
# required metadata

title: EDI 3PL
description: EDI 3PL setup - Disposition code mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-17
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDI3PLDispositionCodeMapping
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

# 3PL setup
## Setup Disposition code mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Disposition code mapping**

Code mapping the 3PL's value to a D365 Disposition code. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the disposition code mapping group
-	In the **Description** field, enter a description of the disposition code mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Disposition code** from the available list. Options are obtained from **Disposition code** setup at **Sales and marketing > Setup > Returns > Disposition codes**
-	Specify the 3PL's value used to identify the **Value**

## Where used
Disposition code mapping is assigned on the [3PL Trading partner's](../Trading-partner.md) Options field called **Disposition code mapping**. <br>
Used on field **DispositionCodeExternal** on EDI documents:
- Shipment receipt - Return order

## Data entities:
- Disposition code mapping
- Disposition code mapping lines
