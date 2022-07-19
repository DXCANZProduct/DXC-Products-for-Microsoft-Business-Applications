---
# required metadata

title: DXC Item Creation Wizard 
description: DXC Item Creation Wizard - Update item status  
author: Liam Coll
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

## Update item status

A periodic job is available that can update the item status with a specified effective date, this can be run for a range of items. Category hierarchy can be used to help select these products to be included. This allows for item status to be planned and updated prior to the effective date. The periodic job can be accessed from **Item creation > Periodic tasks > Update item status**.

1.	Select the *From Status*, only the selected items matching this status will be updated.
2.	Select the *To Status*.
3.	Enter an *Effective date* if required.  
    * To make effective immediately, leave blank.
4.	Select a *Category hierarchy* if required to filter down to a group of products.
5.	Select the items to be updated. 
6.	Select OK.

*Note: Optionally select the Run in the background tab to run in batch processing. Please see [Microsoft User Guides](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/sysadmin/batch-processing-overview) for further information*
