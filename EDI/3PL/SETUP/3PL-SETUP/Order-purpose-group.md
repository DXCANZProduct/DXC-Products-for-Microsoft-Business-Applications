---
# required metadata

title: EDI 3PL
description: EDI 3PL setup - Order purpose group
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDI3PLOrderPurposeMapping 
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
## Setup Order purpose group

Users can access the form by navigating to **EDI > Setup > 3PL setup > Order purpose group**

Code mapping the 3PL's value to a EDI order purposes. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the order purpose group
-	In the **Description** field, enter a description of the order purpose group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order purpose code** from the available list. Options are Original, Change and Cancellation
-	Specify the 3PL's value used to identify the **EDI order purpose**

## Where used
Order purpose group is assigned on the [3PL Trading partner's](../Trading-partner.md) Options field called **Order purpose**. <br>
Used on field **OrderPurpose** on EDI documents:
- Picking list

## Data entities:
- 3PL EDI order purpose group
- 3PL EDI order purpose lines
