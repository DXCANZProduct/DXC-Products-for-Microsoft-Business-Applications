---
# required metadata

title: DXC Finance Utilities
description: Customer reference setup
author: jdutoit2
manager: Kym Parker
ms.date: 2023-10-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology:  

# optional metadata

ms.search.form:  CustParameters, CredManCustCreditCollectionsParameters, CustInterestNote
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Customer parameters setup
The fields as described in the following subsections are available to control additional functionality provided by Finance utilities.

## Use customer payment terms

To open the page, navigate to **Collections** tab on: 
- Accounts receivable > Setup > Accounts receivable parameters, or
- Credit and collections > Setup Credit and collections parameters

Set **Use customer payment terms** to _Yes_, to use the Customer's Payment terms when posting Interest notes.
<br>
**Data entity**: Customer parameters

### Where used

**Use customer payment terms** is used when posting interest notes at **Credit and collections > Interest > Review and process interest notes**

