---
# required metadata

title: Insights for D365 FO
description: Insights for D365 FO - Periodic monitoring
author: Patrick Sharma
manager: Kym Parker
ms.date: 2023-10-03
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: DXCInsights_MonitoringConfiguration
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

# Periodic Monitoring

Periodic monitoring helps organizations maintain a proactive approach to managing their operations. Specific business rules can be setup to continuously evaluate and track specific aspects of the organization's operations, or critical business areas. It will help provide timely insights, allowing them to make informed decisions, address issues promptly, and ensure that they are in alignment with their strategic goals and compliance requirements.

### 1. Periodic Monitoring Configuration 

To configure peridoic monitoring, navigate to **System Administration > Setup > Insights for D365 FO > Periodic monitoring > Periodic monitoring configuration**. If this is the first time you have opened the form, it will be empty. 
Click the menu button labeled ‘Refresh list’. This will scan the AOT and build a list of monitoring rules and their parameters. 
When you build a new monitoring rule, make sure to refresh so that it appears in the list.

![Configure_Periodic_monitoring](../IMAGES/Configure_Periodic_monitoring.png)

By default, each rule is disabled. You can use the menu buttons at the top of the form to *‘Enable’* or *‘Disable’* the rule. 

Additionally, you can change how frequently this rule should run by opening the form in edit mode, and updating the 'Refresh interval value', along with its corrsponding 'Refresh interval unit'. The fields 'Next scheduled run' and 'Last successful run' will help you keep track of the executions. You can also update the Parameter value to overwrite the default values with your custom value. A description of the parameter values is given in 'Description' field to provide context of the Parameter value.

### 2.Start the Periodic Monitoring Batch Job
The monitoring rules focus on polling the current system health. This is accomplished through a single batch job that executes the monitoring business rules. Navigate to **System administrators > Setup > Insights for D365 FO >Periodic monitoring > Periodic monitoring batch service**

Only one instance is required, and it does not need recurrence as this is set automatcially based on the refresh intervals set in [Periodic Monitoring Configuration](Periodic_monitoring_configuration.md#1-periodic-monitoring-configuration). The batch job will manage itself and sleep until the next time it needs to run. The **Batch processing** option is set to 'Yes' by default. Click *'OK'* to start the batch job.

![Monitoring_batch](../IMAGES/Monitoring_batch.png)

To ensure telemetry data is captured from periodic monitoring, verify that the "custom events" option is enabled within the Telemetry monitoring configuration in **System administrators > Setup > Insights for D365 FO > Insights for D365 FO parameters**.

Once running, the monitoring batch job will re-scan for changes in settings and business rules on the Periodic Monitoring Configuration form. You can disable the batch job from **System administrators > Setup > Insights for D365 FO > Insights for D365 FO parameters > Periodic monitoring** tab if needed. Refer to section [Enable the Periodic monitoring](../setup.md#6-enable-the-periodic-monitoring)

### 3.Create Performance View
The periodic monitoring for SQL performance may  result in default values being generated initially. This issue can be resolved by executing the 'Create performance view' job. This job is specifically designed to create the System SQL resource statistics view, which ensures accurate and meaningful performance data is captured. Navigate to **System administrators > Setup > Insights for D365 FO > Periodic monitoring > Create performance view**. 
