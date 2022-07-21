---
# required metadata

title: EDI 3PL
description: EDI 3PL setup - Transaction direction mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-17
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDI3PLTransactionDirectionMapping
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
## Setup Transaction direction mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Transaction direction mapping**

Code mapping the 3PL's value to a EDI Transaction direction. <br>
With some EDI standards quantities are always positive. The transaction direction code indicates if the movement is **out** or **into** inventory. When direction mapping indicates an **out** value, the quantity is converted to **negative**. All in direction quantities are used as-is. A blank in mapping is also acceptable. If no mapping is assigned to the 3PL, the qty’s will be used as-is (not converted).

- Click **New** to create a new record
-	In the **Name** field, enter the name of the transaction direction mapping group
-	In the **Description** field, enter a description of the transaction direction mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Transaction direction**. Options are In or Out.
-	Specify the 3PL's value used to identify the **EDI code**

## Where used
Transaction direction mapping is assigned on the [3PL Trading partner's](../Trading-partner.md) Options field called **Transaction direction mapping**. <br>
Used on field **TransactionDirection** on EDI documents:
- Inventory adjustment - Movement

## Data entities:
- Transaction direction mapping
- Transaction direction mapping lines
