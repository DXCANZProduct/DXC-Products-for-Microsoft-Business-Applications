---
# required metadata

title: EDI Vendor
description: EDI Vendor setup - Misc charge/allowance indicator
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIVendMiscChargeIndicatorMapping
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
## Setup misc. charge/allowance indicator

Users can access the form by navigating to **EDI > Setup > Vendor setup > Misc charge/allowance indicator**

Code which indicates an allowance or charge for the service specified. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the misc. charge/allowance indicator
-	In the **Description** field, enter a description of the misc. charge/allowance indicator
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Indicator**. Options are: <br>
    - **Allowance** - When charge value maintained on purchase order is less than zero
    - **Charge** - When charge value maintained on purchase order is more than zero
    - **No allowance or charge** - When charge value maintained on purchase order equal zero
-	Specify the vendor's value used to identify the **EDI indicator**.

## Where used
Misc. charge/allowance indicator is assigned on the [Vendor Trading partner's](../Trading-partner.md) Options field called **Misc charge/allowance indicator**. <br>
Used on field **MiscIndicator** on EDI documents:
- Vendor purchase order
- Vendor purchase order change
- Purchase invoice

## Data entities:
- Vendor EDI misc. charge/allowance indicator group
- Vendor EDI misc. charge/allowance indicator lines
