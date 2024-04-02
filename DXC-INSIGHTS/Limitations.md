---
# required metadata

title: Insights for D365 FO
description: Insights for D365 FO -Limitations
author: Patrick Sharma
manager: Kym Parker
ms.date: 2023-10-03
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCInsightsParameters
audience: Application User
# ms.devlang: 
ms.reviewer: Patrick Sharma

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: InsightsForD365FO
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Patrick Sharma
ms.search.validFrom: 2023-03-27
ms.dyn365.ops.version: 10.0.30
---

# Product limitations

The following limitations apply to monitoring and telemtry logging with Insights for D365FO

**Batch jobs / batch tasks**
1. Batch jobs developed on the RunBaseBatch framework (by extending the run method) and run in User session mode synchronously will not be monitored / logged to Azure app insights.
2. Batch jobs will not be monitored / logged to Azure app insights during the time in between the enablement of Batch job monitoring on the Insights for D365 parameters form and the next scheduled run of the 'Insights for D365 monitoring automation' task. To compensate for this time window, the repeat interval of the 'Insights for D365 monitoring automation' can be reduced

**OData Monitoring**
1. The monitoring of OData calls with Insights for D365 FO is reliant on the attachment of event handlers on the AOS instances. However, these handlers detach during application downtime (maintenance, upgrades) and need to be reattached loading any form after application restart. OData calls won't be monitored between application downtime and the first form load after restart.
  

