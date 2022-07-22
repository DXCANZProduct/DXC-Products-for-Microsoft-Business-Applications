---
# required metadata

title: EDI Vendor
description: EDI Vendor setup - Payment terms type group
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIVendPaymentTermsMapping
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
## Setup payment terms type group

Users can access the form by navigating to **EDI > Setup > Vendor setup > Payment terms type group**

Code identifying the type of payment terms. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the payment terms type group
-	In the **Description** field, enter a description of the payment terms type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Terms of payment**. Options are obtained from Terms of payment setup at **Accounts payable > Setup > Payment setup > Terms of payment**, examples: <br>
    - COD
    - Month+15
    - Net30
-	Specify the vendor's value used to identify the **EDI payment terms**.

## Where used
Payment terms type group is assigned on the [Vendor Trading partner's](../Trading-partner.md) Options field called **Payment terms type**. <br>
Used on field **TermsTypeCode** on EDI documents:
- Vendor purchase order
- Vendor purchase order change
- Purchase invoice

## Data entities:
- Vendor EDI payment terms type group
- Vendor EDI payment terms type lines
