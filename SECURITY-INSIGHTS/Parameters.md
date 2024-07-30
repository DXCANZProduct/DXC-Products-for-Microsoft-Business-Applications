---
# required metadata

title: Security Insights for D365 FO
description: Setup for Security Insights for D365 FO
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-07-30
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
Start by creating a new Application Insights instance in Azure. See [MS doc](https://docs.microsoft.com/en-us/azure/azure-monitor/app/create-new-resource).
 
Navigate to Configure > API Access and copy the Application Id. Refer to [Application Id](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-resources-app-insights-keys?view=azure-bot-service-4.0#application-id)
The application id will be used to link Security Insights for D365 FO to your Azure Application Insights instance in [Step 4](./Parameters.md#41-configuration) later.

![AppInsights Application ID](IMAGES/AppInsightsApplicationID.png)

### 2. Azure Application Insights App registration
All requests made by the Security Insights for D365 FO ISV to Azure Application Insights using the Azure Monitor Application Insights endpoint https://api.applicationinsights.io. To access the endpoint, you must authenticate through Microsoft Entra ID. To access Azure REST APIs for fetching data, an authorization token will need to be generated based on a client ID and secret. The token will be received by Security Insights for D365 FO and passed in the REST API request. 

Follow the instructions in the below documents to register the Azure Application Insights in app registration and set up authentication:
- [Register an App to request authorization tokens and work with APIs](https://learn.microsoft.com/en-us/azure/azure-monitor/logs/api/register-app-for-token?tabs=portal#register-an-app)
- [Set up authentication](https://learn.microsoft.com/en-us/azure/azure-monitor/app/azure-ad-authentication?tabs=net#set-up-authentication)

Note: Copy the Tenant ID, Client ID and Client Secret values during this step. This will be used to link Security Insights for D365 FO to Azure Application Insights application in the next step ([Step 4](./Parameters.md#41-configuration)).

## 3.	Enable feature
Find and enable the feature **Security Insights for D365FO** to enable the product
 
## 4.	Parameters
The **Insights for user access and security parameters** page within Security admininstration is used to define the configuration required to connect to the app created for your **Azure application insights** in Step 2. <br>
Multiple Insights connections can be configured and the applicable one selected when running **Fetch interaction data from application Insights** on page **Insights for user access and security** which fetches accessed menu items withing the selected time period.

Navigate to **System administration > Insights for user access and security > Insights for user access and security parameters**

### 4.1 Configuration

- Click **New** to create a new record and enter the the following fields for the Azure Application Insights instance:
- **Description** - a description for your app 
- **Application Insights App ID** - the Application Id of your Azure Application Insights instance copied in Step 1 above.
- **Tenant ID** - this is the unique identifier of the Azure Active Directory instance
- **Client ID** - this identifier will be assigned when the Azure Application Insights instance is registered up as an application in Step 2.
- **Client secret** - the secret value (string) that the application uses to prove its identity when requesting a token. Enter the secret value generated in Step 2 when a New client secret was created.

Use the **Validate** button to validate the Insights instance.

### 4.2 Batch processes

The following batch process options can be used for batch performance improvement:
- **Batch jobs** - **Maximum batch tasks** - Enter the maximum number of tasks the batch should be split into
- **Throttling** - **Minimum users per task** - Enter the minimum number of users per task

Examples:

Number of enabled D365 users   | Maximum batch tasks  | Minimum users per task  | Result: Number of tasks
:--                            |:--                             |:--                                |:--
110                            | 2                              | 10                                | 2            
110                            | 20                             | 10                                | 11


Applies to the following two processes when run as batch:
- Fetch interaction data from application insights
- Calculate utilization rates

## Data entities

- **Configuration**: Azure application insights connection details
- **Batch processes**: Insights for user access and security parameters


