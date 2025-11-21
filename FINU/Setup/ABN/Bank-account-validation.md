---
# required metadata

title: Finance Utilities 
description: Setup - Bank account validation 
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-11-21
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  OMLegalEntities
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Bank account validation
The fields as described in the following subsections are available to control optional validation when creating new **Vendor** and **Customer bank accounts**. <br> 
Also applies to importing data entities:
- Vendor bank accounts
- Customer bank accounts


## Setup legal entity
1. Go to **Organization administration > Organizations > Legal entities** and select the applicable legal entity.
2. Use the setup available under **Validation** FastTab, heading **Bank account format validation**:
    - **Country/region** - Validation will only apply to bank accounts for this country. Once this field is populated, address becomes mandatory on vendor and customer bank accounts.
    - **Bank account format validation** - No validation (default), Warning, Error
    - **Routing / bsb number format** - example ###-###
    - **Bank account minimum number of digits** - example 6 for Australia, 15 for New Zealand
    - **Bank account maximum number of digits** - example 9 for Australia, 17 for New Zealand
  
## Processing
See [link](../../Processing/ABN/Bank-account-validation.md) for details on processing.
