---
# required metadata

title: EDI Vendor
description: EDI Vendor setup - Order type group
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIVendOrderTypeMapping
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
## Setup purchase order types

Users can access the form by navigating to **EDI > Setup > Vendor setup > Order type group**

EDI purchase orders can be sent to trading partners with many order types.  The type identifier sent can change the way the order is processed within the trading partner's system. <br>

- Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order type group
-	In the **Description** field, enter a description of the order type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order Type**. Options are: <br>
    -	**Order** - When creating a purchase order to the vendor; used to identify a "normal" order using these characters 
    -	**Agreement** - When sending a purchase agreement to a vendor; used to identify a "blanket" order
    -	**Release order** - When the purchase order was created by releasing from a purchase agreement
-	Specify the vendor's value used to identify the **EDI order type**

Examples: <br>

**Order type** 	                  | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Order**                         |	**SA** - Stand Alone Order <br> **KN** - Purchase Order	| **220** - Order 
**Agreement**                     |	**KA** - Agreement <br> **KB** - Blanket Purchase Agreement | **221** - Blanket order
**Release order**                 |	**RL** - Release or Delivery Order	  | **226** - Call off order

## Where used
Order type group is assigned on the [Vendor Trading partner's](../Trading-partner.md) Options field called **Order type**. <br>
Used on field **OrderType** on EDI documents:
- Vendor purchase order
- Vendor purchase order change

## Data entities:
- Vendor EDI order type group
- Vendor EDI order type lines
