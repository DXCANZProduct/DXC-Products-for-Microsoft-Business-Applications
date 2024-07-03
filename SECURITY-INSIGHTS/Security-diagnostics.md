---
# required metadata

title: Security Insights for D365 FO
description: Setup for Security Insights for D365 FO
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-07-03
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: DXCSecurityInsightsParameters
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

###	1. Azure Application Insights instance
Start by creating a new Application Insights instance in Azure. See [MS doc](https://docs.microsoft.com/en-us/azure/azure-monitor/app/create-new-resource)

Copy the Instrumentation Key. This will be used when configuring the Azure Application Insights instance in **Insights for user access and security parameters**.
![Instrument Key](IMAGES/Instrument_key.png)

### 2.	Enable feature
Find and enable the feature **Security Insights for D365FO** to enable the product
 
### 3.	Parameters
The **Insights for user access and security parameters** page within Security admininstration is used to define the configuration required to connect to **Azure application insights**. <br>
Multiple Insights connections can be configured and the applicable one selected when running **Fetch interaction data from application Insights** on page **Insights for user access and security** which fetches accessed menu items withing the selected time period.

Navigate to **System administration > Security > Insights for user access and security parameters**

- Click **New** to create a new record and enter the the following fields for the Azure Application Insights instance:
- **Description** 
- **Application Insights App ID** 
- **Tenant ID** 
- **Client ID** 
- **Client secret** 

Use the **Validate** button to validate the Insights instance.

