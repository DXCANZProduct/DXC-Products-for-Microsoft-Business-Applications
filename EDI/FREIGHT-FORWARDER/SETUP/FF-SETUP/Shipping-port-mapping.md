---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder setup - Shipping port mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFFLCShipPortTableMapping
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

# Freight forwarder setup
## Setup Shipping port mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping port mapping**

Code mapping the Freight forwarders's value to a D365 Landed cost shipping port. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the shipping port mapping group
-	In the **Description** field, enter a description of the shipping port mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Shipping port** from the available list. Options are obtained from **Shipping port** setup at **Landed cost > Delivery information setup > Shipping ports**
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Shipping port mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner.md) Options field called **Port**.

Used on the following EDI documents (field):
- Voyage creator (ShipFromPort)
- Voyage creator (ShipToPort)
- Voyage tracking (Port)

## Data entities:
- Shipping port mapping
- Shipping port mapping lines
