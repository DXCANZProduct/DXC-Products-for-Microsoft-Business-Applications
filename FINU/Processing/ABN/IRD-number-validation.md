---
# required metadata

title: Finance Utilities 
description: Processing - IRD number validation
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-11-20
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  TaxVatNumTable
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom:: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# IRD number validation

When IRD number validation has been enabled for the legal entity, the new IRD numbers created with the allocated Country/region as setup in Legal entity goes through extra validation to ensure the length, format and check digit is correct. 

Supports format xxx-xxx-xxx and xxxxxxxxx.

## Prerequisites
The following setup are [prerequisites](../../Setup/ABN/IRD-number-validation.md) for IRD number validation:
- Assign New Zealand country in **Country/region** for each applicable legal entity


## Validation
The following validations will occur when creating new records for allocated country.

Example error messages for incorrect IRD numbers:
- **Modulus 11 digit check** - Expecting check digit 9, but found 8 for IRD no. 086689918
- **Not a number format/incorrect separator** - Invalid IRD number format. It should only contain digits having format xxx-xxx-xxx or xxxxxxxxx
- **Length** - Invalid IRD number length, IRD number should be 9 digits long

  
