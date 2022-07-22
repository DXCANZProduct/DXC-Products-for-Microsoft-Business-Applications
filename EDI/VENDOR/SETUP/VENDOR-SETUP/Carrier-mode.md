---
# required metadata

title: EDI Vendor
description: EDI Vendor setup - Carrier mode
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIVendCarrierModeMapping
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Vendor setup
## Setup carrier mode

Users can access the form by navigating to **EDI > Setup > Vendor setup > Carrier mode**

Code specifying the method or type of transportation for the shipment. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the carrier mode
-	In the **Description** field, enter a description of the carrier mode
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Mode**. Options are obtained from **Modes** setup at **Transportation > Setup > Carriers > Mode**, examples: <br>
    - Air
    - Rail
-	Specify the vendor's value used to identify the **EDI carrier mode**.

## Where used
Carrier mode is assigned on the [Vendor Trading partner's](../Trading-partner.md) Options field called **Carrier mode**. <br>
Used on field **CarrierMode** on EDI documents:
- Vendor purchase order
- Vendor purchase order change

## Data entities:
- Vendor EDI carrier mode group
- Vendor EDI carrier mode lines
