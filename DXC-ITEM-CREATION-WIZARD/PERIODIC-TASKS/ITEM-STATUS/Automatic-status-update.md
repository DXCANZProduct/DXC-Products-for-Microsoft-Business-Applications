---
# required metadata

title: DXC Item Creation Wizard 
description: DXC Item Creation Wizard - Automatic status update
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-23
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: liamcoll

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Automatic status update

[Automatic status change rules](../../SETUP/ITEM-SETUP/Automatic-status-change-rules.md) can be setup to update the item status based on certain events. For example, a status that indicates a low level of inventory can be updated to a discontinued status once the stock on hand becomes zero. The periodic job can be accessed from **Item creation > Periodic tasks > Item status > Automatic status update**.

1.	Using the filter, select the *status* being updated from and the *event* being used
    * To run for all events, leave blank
2.	Select OK.

*Note: Optionally select the Run in the background tab to run in batch processing. Please see [Microsoft User Guides](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/sysadmin/batch-processing-overview) for further information*
