---
# required metadata

title: EDI Vendor
description: EDI Vendor setup - Misc method of handling
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIVendMiscMethodHandlingMapping
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
## Setup misc. method of handling

Users can access the form by navigating to **EDI > Setup > Vendor setup > Misc method of handling**

Used to indicate if the charge / allowance on the vendor invoice should be paid by the customer. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the misc. method of handling
-	In the **Description** field, enter a description of the misc. method of handling
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Method of handling**. Options are: <br>
    - Off Invoice
    - Charge to be paid by customer
    - Charge to be paid by vendor
    - Optional
    - Allowance to be issued by vendor
    - Allowance to be issued by reseller
    - Charge denied by vendor
    - Information only
-	Specify the vendor's value used to identify the **EDI method of handling**
-	**Add to Invoice** - Indicates if charge/allowance should be added to D365 Purchase invoice

## Where used
Misc method of handling is assigned on the [Vendor Trading partner's](../Trading-partner.md) Options field called **Misc method of handling**. <br>
Used on field **MiscMethodHandling** on EDI documents:
- Purchase invoice

## Data entities:
- Vendor EDI misc method of handling group
- Vendor EDI misc method of handling lines
