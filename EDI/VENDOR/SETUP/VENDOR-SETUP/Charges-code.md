---
# required metadata

title: EDI Vendor
description: EDI Vendor setup - Charges code
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata
ms.search.form:  
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
## Setup charges code

Users can access the form by navigating to **EDI > Setup > Vendor setup > Charges code**

Code identifying the service, promotion, allowance, or charge. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the charges code
-	In the **Description** field, enter a description of the charges code
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Charges code**. Options are obtained from **Charges code** setup at **Procurement and sourcing > Setup > Charges > Charges code**, examples: <br>
    -	Fee
    -	Freight
    -	Handling
    -	Install
    -	Insurance
-	Specify the vendor's value used to identify the **EDI charges code**.

## Where used
Charges code is assigned on the [Vendor Trading partner's](../Trading-partner.md) Options field called **Charges code**. <br>
Used on field **MiscCode** on EDI documents:
- Vendor purchase order
- Vendor purchase order change
- Purchase invoice

## Data entities:
- Vendor EDI charges code group
- Vendor EDI charges code lines
