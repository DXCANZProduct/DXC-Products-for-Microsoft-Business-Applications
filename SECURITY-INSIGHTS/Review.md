---
# required metadata

title: Security Insights for D365 FO
description: Review Security Insights for D365 FO
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-07-03
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: DXCSecurityInsights
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

**Insights for user access and security** is used to colate and review user access and security utilization.

# Processing
The following steps are available to initiate or update the required fields.

## 1. Synchronize user roles and access
Synchronizes the current user roles, privileges and accessible menu items. This can only be run as batch.

## 2. Initiate user security groups
Automatically creates groups of similar users by analyzing user roles and privileges. <br>

**Parameters:**
- Use **Select foundation data for user group creation** to create the user groups by either:
    - Security roles
    - Security privileges
- Enter the **Maximum number of groups** that should be created

## 3. Fetch interaction data from application Insights
Fetch user interation data from Azure applicable Insights

**Parameters:**
- Select the applicable **Azure application Insights connection** setup in [Insights for user access and security parameters](Parameters.md)
- Select the required start date in **Activities - start date time**
- Select the required end date in **Activities - end date time**

The records to include are automatically filtered to enabled users and can also be filtered to User Id(s).

> Note: User accessed menu items date/time data: starts when logging usage data to AppInsights with either DXC's Insights or Standard monitoring.

## 4. Calculate utilization rates
Calculate utilization rates of user roles and privileges based on accessing menu items.

The records to include are automatically filtered to enabled users and can also be filtered to User Id(s).

# Review

Next step is to review the utilization. Example actions that could be taken after review: 
- Where the user hasn't accessed any of the menu items in the specific role, it could be possible to remove the role from the user.
- Where the user only accessed "lower" licensed menu items in the role, it could be possible to assign the applicable privileges to a different/new duty and add those to a different/new role which will result in a "lower" license for the user.

After modifying security configuration, rerun the following to update the values on the form:
- Fetch interaction data from application Insights
- Calculate utilization rates

![Overview](IMAGES/Overview.png)
