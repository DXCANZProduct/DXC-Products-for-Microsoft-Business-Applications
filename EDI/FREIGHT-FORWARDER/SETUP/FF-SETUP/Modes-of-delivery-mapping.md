---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder setup - Modes of delivery mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-14
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFFLCVendDlvModeMapping, DeliveryMode
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
## Setup Modes of delivery mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Modes of delivery mapping**

Code mapping the Freight forwarders's value to a D365 Modes of delivery. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Modes of delivery mapping group
-	In the **Description** field, enter a description of the Modes of delivery mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Mode of delivery** from the available list. Options are obtained from **Mode of delivery** setup at **Procurement and sourcing > Setup > Distribution > Modes of delivery**
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Modes of delivery mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner.md) Options field called **Mode of delivery**.

Used on the following EDI documents (field):
- Voyage creator (DlvModeId)
- Voyage tracking (DlvModeId)

## Data entities:
- Modes of delivery mapping
- Modes of delivery mapping lines
