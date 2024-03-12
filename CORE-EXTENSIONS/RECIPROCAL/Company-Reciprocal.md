---
# required metadata

title: Core Extensions
description: Display reciprocal exchange rates
author: jdutoit2
manager: Kym Parker
ms.date: 2023-02-22
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  OMLegalEntities
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Display reciprocal exchange rate

### Overview
**Display reciprocal exchange rate** allows companies to view the exchange rates in reciprocal format. <br>
For example, instead of showing 0.69, it displays a result of 1/0.69 relevant to the *home* currency set for the legal entity.  <br>
This applies to all users and all exchange rate types for the selected company.

 
### Setup
From the Legal Entity form, you can set this option for the current selected company.

1. Navigate to **Organization administration > Organizations > Legal Entity**. 
2. Click on Edit button and expand the **General** fast tab and set **Display reciprocal exchange rate** to _Yes_. 

### Display
The following forms will display the reciprocal exchange rate:
- General journal lines
- Vendor invoice journal lines
- Vendor payment journal lines
- Purchase order totals
- Customer payment journal lines
- Free text invoice totals
- Sales order totals

