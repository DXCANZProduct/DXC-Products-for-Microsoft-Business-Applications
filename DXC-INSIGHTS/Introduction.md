---
# required metadata

title: Insights for D365 FO
description: Introduction to Insights for D365 FO
author: Peter Musumeci
manager: Kym Parker
ms.date: 2023-10-03
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User/ Azure Administrators
# ms.devlang: 
ms.reviewer: Peter Musumeci
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: InsightsForD365FO
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2023-03-28
ms.dyn365.ops.version: 10.0.32
---

# Insights for D365 FO

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction

**Potential of Insights for D365 FO**

Insights will capture data such as user information, time to load, and menu item used. Telemetry is subsequently transmitted through to a logging application. It will record errors, saving error messages and call stacks.  Insights can monitor recurring events and exceptions, even those occurring during Dual-write sync.

Azure Application Insights has been incorporated as the default logging tool for the out of the box Insights for D365 FO package. Azure Application Insights collects the telemetry and helps analyze the operation and performance of the application. Organizations can use this information to identify problems that might be occurring or to identify improvements to the application that would most affect users.

Insights for D365 FO offers extensibility and seamless integration with additional telemetry logging applications. Utilising this functionality,  Insights for D365 FO can accommodate a range of logging sources including popular solutions such as Splunk, Dynatrace and Site24x7 through to custom logging tools developed in-house.

With Azure Application Insights, organizations can use the data sent from Insights to:
- Proactively understand how an application is performing.  
  
- Reactively review application execution data to determine the cause of an incident
Azure Application Insights provides other features including, but not limited to: <br>
    - [Alerts](https://learn.microsoft.com/en-us/azure/azure-monitor/alerts/alerts-overview) – help you detect and address issues before users notice them by proactively notifying you when Azure Monitor data indicates there might be a problem with your infrastructure or application.<br>
    - [Live Metrics](https://learn.microsoft.com/en-us/azure/azure-monitor/app/live-stream) – observe activity from your deployed application in real time.<br>
    - [Availability](https://learn.microsoft.com/en-us/azure/azure-monitor/app/availability-overview) - also known as “Synthetic Transaction Monitoring”, probe your application's external endpoint(s) to test the overall availability and responsiveness over time.<br>
    - [GitHub or Azure DevOps integration](https://learn.microsoft.com/en-us/azure/azure-monitor/app/work-item-integration) – create [GitHub](https://learn.microsoft.com/en-us/training/paths/github-administration-products/) or [Azure DevOps](https://learn.microsoft.com/en-us/azure/devops/) work items in context of Application Insights data.<br>
    - [Usage](https://learn.microsoft.com/en-us/azure/azure-monitor/app/usage-overview) – understand which features are popular with users and how users interact and use your application.<br>
  - [Smart Detection](https://learn.microsoft.com/en-us/azure/azure-monitor/app/proactive-diagnostics) – automatic failure and anomaly detection through proactive telemetry analysis.<br>


### Topics

- [How to Set up Insights](../DXC-INSIGHTS/setup.md)
- [Periodic monitoring](../DXC-INSIGHTS/Periodic-monitoring-configuration/Periodic_monitoring_configuration.md)
- [Review and set up data monitoring](../DXC-INSIGHTS/Review_and_set_up_monitored_data.md)
- [Dashboard for Application Insights](../DXC-INSIGHTS/Azure-application-insights/Dashboards.md)
- [FAQ](../DXC-INSIGHTS/FAQ.md)

### Demonstration

Watch DXC Technology’s short demonstration on Insights for D365 FO solution [here](https://dynamics.dxc.technology/webinars/analysis-tool-for-performance-of-microsoft-dynamics-365-finance-and-operations-by-dxc-technology-2)

## New ideas
Have a suggestion for a new product or a new feature for an existing product? [Suggest a New idea](https://forms.office.com/r/U9twpSt3in)
