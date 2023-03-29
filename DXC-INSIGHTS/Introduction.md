---
# required metadata

title: DXC Insights
description: Introduction to DXC Insights
author: Peter Musumeci
manager: Kym Parker
ms.date: 2023-03-28
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
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2023-03-28
ms.dyn365.ops.version: 10.0.32
---

# DXC Insights

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction

**Potential of DXC Insights for Microsoft Dynamics 365**

DXC Insights will send telemetry recording which user, time to load, and what menu item was used to an Azure Application Insights instance. It will record any errors that occur, saving error messages and call stacks along with reoccurring monitoring data. DXC Insights is also able to record exceptions caught during Dual-write sync.
Application Insights collects the telemetry and helps analyze operation and performance of the application. You can use this information to identify problems that might be occurring or to identify improvements to the application that would most affect users.


With the data sent from DXC Insights, you can use Azure Application Insights to:
  - Proactively understand how an application is performing.
  - Reactively review application execution data to determine the cause of an incident
Application Insights provides other features including, but not limited to: <br>
	  -[Live Metrics](https://learn.microsoft.com/en-us/azure/azure-monitor/app/live-stream) – observe activity from your deployed application in real time.
    -[Availability](https://learn.microsoft.com/en-us/azure/azure-monitor/app/availability-overview) - also known as “Synthetic Transaction Monitoring”, probe your applications external endpoint(s) to test the overall availability and responsiveness over time.
    -[GitHub or Azure DevOps integration](https://learn.microsoft.com/en-us/azure/azure-monitor/app/work-item-integration) – create [GitHub](https://learn.microsoft.com/en-us/training/paths/github-administration-products/) or [Azure DevOps](https://learn.microsoft.com/en-us/azure/devops/) work items in context of Application Insights data.
    -[Usage](https://learn.microsoft.com/en-us/azure/azure-monitor/app/usage-overview) – understand which features are popular with users and how users interact and use your application.
    -[Smart Detection](https://learn.microsoft.com/en-us/azure/azure-monitor/app/proactive-diagnostics) – automatic failure and anomaly detection through proactive telemetry analysis.
Topics: <br>
- [Set up Insights](../DXC-INSIGHTS/setup.md)
- [Reoccurring monitoring](.../DXC-INSIGHTS/Reoccurring monitoring.md)
- [Reoccurring monitoring](../DXC-INSIGHTS/Reoccurring monitoring.md)
- [EDI 3PL module](../EDI/3PL/INTRODUCTION/Introduction.md)
- [EDI Freight forwarder for Landed cost](../EDI/FREIGHT-FORWARDER/INTRODUCTION/Introduction.md)
- [EDI Integration systems module](../EDI/INTEGRATION/INTRODUCTION/Introduction.md)

## New ideas
Have a suggestion for new product or new feature for existing product? [Suggest a New idea](https://forms.office.com/r/U9twpSt3in)
