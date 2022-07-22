---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder setup - Shipping measurement unit mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFFLCShipMeasurementUnitMapping
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
## Setup Shipping measurement unit mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping measurement unit mapping**

Code mapping the Freight forwarders's value to a D365 Landed cost measurement unit. <br>
Used where the Freight forwarder’s shipping measurement units value differs to Landed cost’s shipping measurement units. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Shipping measurement unit mapping group
-	In the **Description** field, enter a description of the Shipping measurement unit mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the applicable Landed cost **Measurement unit** from the available list
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Shipping measurement unit mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner.md) Options field called **Measurement unit**.

Used on the following EDI documents (field):
- Voyage creator (ShipMeasurementUnitExternal) 
- Voyage creator (ShipLineMeasurementUnitExternal)

When the Voyage is created, the measurement and measurement unit are optional header and line fields.

## Examples

D365 Landed cost Measurement unit	  | Trading partner values
:--                                 |:--
**kgs**                             |	KG
**CBM**                             |	CR

## Data entities:
- Shipping measurement unit mapping
- Shipping measurement unit mapping lines
