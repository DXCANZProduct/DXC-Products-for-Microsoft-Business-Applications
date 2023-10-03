---
# required metadata

title: Insights for D365 FO
description: Insights for D365 FO - Batch job monitoring
author: Patrick Sharma
manager: Kym Parker
ms.date: 2023-10-03
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: BatchJob, BatchJobEnhanced 
audience: Application User/ Azure Administrators
# ms.devlang: 
ms.reviewer: Patrick Sharma
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: InsightsForD365FO
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Patrick Sharma
ms.search.validFrom: 2023-03-28
ms.dyn365.ops.version: 10.0.32
---

# BatchJob Monitoring
Batch job monitoring with Insights for D365 FO allows users to monitor batch job execution and detect if batch jobs are completing earlier than expected or if they are finishing later than anticipated (which might suggest performance issues or delays).
### 1. Enable batch job monitoring with Insights for D365 FO
To setup monitoring, navigate to **System administration > Inquiries > Batch jobs** and open the enhanced batch job details view in edit mode. Users will  need to :
1. Enable monitoring with Insights for D365 FO
2. Enter the estimated minimum number of minutes that the batch job is expected to take to complete execution in the 'Minimum completion time' field.
3. Enter the estimated maximum number of minutes that the batch job is expected to take to complete execution in the 'Maximum completion time' field.
4. Click **Save**

![BatchJobMonitoring_LineLevel](IMAGES/BatchJobMonitoring_LineLevel.png)

Telemetry will be logged with Insights for D365 FO at the start and end of each batch job execution. A summary of batch jobs that finish behind schedule or too early is available on Azure Application Insights with the Insights for D365 FO Dashboard provided by DXC. You can also set up Alerts on Azure Application Insights to send a notification to a chosen destination, such as an email, SMS message, web hook, or it can even execute an action with Azure Logic App. Refer to [Setup alerts on continuous monitoring business rules](./Azure-application-insights/Azure_alerts.md#1-setup-alerts-on-continuous-monitoring-business-rules) to setup alerts  for critical batch jobs that are completing earlier than expected or if they are finishing later than anticipated.


