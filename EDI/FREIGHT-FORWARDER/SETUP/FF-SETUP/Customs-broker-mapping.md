---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder setup - Customs broker mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFFLCCustomsBrokerMapping, VendTableListPage
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconEDIFreightForwarderDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Freight forwarder setup
## Setup Customs broker mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Customs broker mapping**

Code mapping the Freight forwarders's value to a D365 Vendor of Shipping type set to Customs broker. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Customs broker mapping group
-	In the **Description** field, enter a description of the Customs broker mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Customs broker** from the available list. Options are obtained from **Vendor account** setup at **Accounts payable > Vendors > All vendors**, where the Voyage's **Shipping type** is set to _Customs broker_
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Customs broker mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner.md) Options field called **Customs broker**.

Used on the following EDI documents (field):
- Voyage creator (ShipCustomsBroker)

## Data entities:
- Customs broker mapping
- Customs broker mapping lines
