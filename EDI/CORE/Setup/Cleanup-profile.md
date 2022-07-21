---
# required metadata

title: EDI Core
description: EDI Core - Setup cleanup profile
author: jdutoit2
manager: Kym Parker
ms.date: 2021-07-22
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
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Cleanup profile

## Setup Cleanup profile
Users can access the form by navigating to **EDI > Setup > Cleanup profile**. <br>
The cleanup profile is used to automatically delete staging record/s.

Create a new Cleanup profile by:
- Click **New** to create a new record. 
- In the **Name** field, enter the name of the Cleanup profile group
- In the **Description** field, enter a description of the Cleanup profile group
- In the **Mappings** fast tab, select **Add** to create a new record
- Select the **Staging to target status**. Options:
  - Not started
  - Completed
  - Error
  - Cancelled
- Specify the **Age days**. When the batch job is run, staging records older than this value will be deleted.

The configured Cleanup profiles can be used either in:
- EDI shared parameters, and/or
- Trading partner’s Options, and/or
- Trading partner’s Incoming and Outgoing documents

Also required to setup a period task to run the cleanup via  **EDI > Periodic tasks > Cleanup documents**.

