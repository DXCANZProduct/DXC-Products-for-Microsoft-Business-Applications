---
# required metadata

title: Security Insights for D365 FO
description: Introduction to Security Insights for D365 FO
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-06-19
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User/ Azure Administrators
# ms.devlang: 
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: InsightsForD365FO
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2023-03-28
ms.dyn365.ops.version: 10.0.32
---

# Security Insights for D365 FO

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction

Security Insights for D365FO ingests user behavior data from Azure Application Insights for security analysis. <br>
Actively monitor user role assignments and utilization, thus enabling power users to optimize licensing and security of end users. <br>
Identify and maintain underutilized/unused roles, duties, privileges that have enterprise licenses attached. <br> 
<br>
Determine if users are utilising their assigned licenses effectively by fetching user menu access telemetry from Azure Applications Insights for selected time-period. Ability to view % utilisation on menu items, privileges, duties, user roles and overall user level. Can also view user’s menu item interaction type (viewed vs. edited), interaction count and last interaction date. To speed up the process of finding optimisation opportunities the solution is capable of grouping the users into logic groups based on a range of criteria like security access in Finance and operations.


### Topics
- [Setup](Parameters.md) - Setup Azure Application Insights and Security Insights in D365 FO
- [Monitor](Review.md) - Colate and review user access and security utilization
- [Security diagnostics](Security-diagnostics.md) - Licensing information added to Security diagnostics to assist in allocating new roles to users going forward

### Demonstration

Watch DXC Technology’s short demonstration on Security Insights for D365 FO solution here:
- [First release](https://dynamics.dxc.technology/microsoft-dynamics-365/security-insights-for-microsoft-dynamics-365-fo-solution-to-optimise-your-user-licensing)
- [Second release](https://dynamics.dxc.technology/webinars/security-insights-for-d365fo)

## New ideas
Have a suggestion for a new product or a new feature for an existing product? [Suggest a New idea](https://forms.office.com/r/U9twpSt3in)
