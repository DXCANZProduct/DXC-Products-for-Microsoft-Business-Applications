---
# required metadata

title: Security Insights for D365 FO
description: Review Security Insights for D365 FO
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-09-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: DXCSecurityInsightsUserView, DXCSecurityInsightsLicenseView
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

The following views are available to colate and review user access and security utilization:
- **Security insights by user**
- **Security insights by license**


These views are available by navigating to **System administration > Insights for user access and security**

# Processing
The following steps are available to initiate or update the required fields.

## 1. Synchronize user roles and access
Synchronizes the current user roles, privileges and accessible menu items. This can only be run as batch. <br>
Subsequent runs only required if menu item privileges change.

## 2. Initiate user security groups
Ability to automaticall group similar users by: 
- **User groups** - Linked to 'System administration > Users > User groups'
- **Microsoft Entra ID security groups** - Linked to 'System administration > Users > Groups'. Option controlled by the MSFT config key for AAD
- **Security roles** - Machine learning used to group users by similar security roles. Ability to limit number of groups created with 'Maximum number of groups'
- **Security privileges** - Machine learning used to group users by similar security privileges. Ability to limit number of groups created with 'Maximum number of groups'
 
> Note: This step is only available on **Security insights by user**. <br>

**Parameters:**
- Use **Select foundation data for user group creation** to create the user groups by either:
    - User groups - utilizes D365 user groups setup in **System administration > Users > User groups**. For this option it is not required to rerun the initiate step if more users are added or roles/privilegs change for a user.
    - Security roles - machine learning is used to group users with similar security roles.
    - Security privileges - machine learning is used to group users with similar security privileges.
- Enter the **Maximum number of groups** that should be created. Disabled when 'User groups' are selected.

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

Next step is to review the utilization by using either of the following two views
- **Security insights by user**
- **Security insights by license**
These views are available by navigating to **System administration > Insights for user access and security**

Example actions that could be taken after review: 
- Where the user hasn't accessed any of the menu items in the specific role, it could be possible to remove the role from the user.
- Where the user only accessed "lower" licensed menu items in the role, it could be possible to assign the applicable privileges to a different/new duty and add those to a different/new role which will result in a "lower" license for the user.

After modifying security configuration, rerun the following to update the values on the form:
- Fetch interaction data from application Insights
- Calculate utilization rates

#### Buttons

The following buttons are available on the views:
- Assign privilege to duty - Security configuration is opended for the selected privilege with the ability to assign to multiple duties
- Assign privilege to role - Security configuration is opended for the selected privilege with the ability to assign to multiple roles
- Manage privilege assignments - Security configuration is opended for the selected privilege(s) 

#### Security insights by user
![Security insights by user](IMAGES/Overview.png)


#### Security insights by license
![Security insights by ulicense](IMAGES/ByLicense.png)
