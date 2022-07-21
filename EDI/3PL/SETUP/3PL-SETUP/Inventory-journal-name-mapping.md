---
# required metadata

title: EDI 3PL
description: EDI 3PL setup - Inventory journal name mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11.17
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDI3PLInventJournalNameMapping
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
## Setup Inventory journal name mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Inventory journal name mapping**

Code mapping the 3PL's value to a D365 Inventory journal name. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the inventory journal name group
-	In the **Description** field, enter a description of the inventory journal name group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Movement** journal name. Options are obtained from **Name** setup at **Inventory management > Setup > Journal names > Inventory**
-	Specify the 3PL's value used to identify the **External type Id**
-	Select **Default** to identify the default journal name to be used when not supplied by the 3PL's incoming document

## Where used
Inventory journal name is assigned on the [3PL Trading partner's](../Trading-partner.md) Options field called **Inventory journal name mapping**. <br>
Used on field **InventJournalNameIdExternal** on EDI documents:
- Inventory adjustment - Counting
- Inventory adjustment - Movement

## Data entities:
- Inventory journal name mapping
- Inventory journal name mapping lines
