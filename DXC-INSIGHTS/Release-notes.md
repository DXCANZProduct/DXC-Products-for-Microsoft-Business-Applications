---
# required metadata

title: Insights for D365 FO
description: Insights for D365 FO - Release notes
author: Patrick Sharma
manager: Kym Parker
ms.date: 2023-11-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User/ Azure Administrators
# ms.devlang: 
ms.reviewer: Patrick Sharma

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: InsightsForD365FO
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Patrick Sharma
ms.search.validFrom:  2023-03-28
ms.dyn365.ops.version: 10.0.31
---

# 	Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Current version

### Release 10.0.37.20240429

Insights for D365 FO 10.0.37 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.37	  | [What’s new or changed in Dynamics 365 application version 10.0.37](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-37)
Microsoft Dynamics 365 application	| 10.0.38	  | [What’s new or changed in Dynamics 365 application version 10.0.38](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-38)
Microsoft Dynamics 365 application	| 10.0.39	  | [What’s new or changed in Dynamics 365 application version 10.0.39](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-39)
Microsoft Dynamics 365 application	| 10.0.40	  | [What’s new or changed in Dynamics 365 application version 10.0.40](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-40)

#### Build 10.0.37.202404292
Release date: 15 May 2024

<ins>Bug fix</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
17937	| Periodic monitoring configuration batch job	| Fix an issue with the periodic monitoring batch job where the automatically set recurrennce of the batch job creeps down to zero.

#### Build 10.0.37.202404291
Release date: 29 April 2024

<ins>New features</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
17544	| Data management framework (DMF) monitoring with Insights for D365 FO	| Add Telemetry logging support for all Data management framework (DMF) events and exceptions. Refer to [Insights for D365 FO Parameters](./setup.md#3-insights-for-d365-fo-parameters) 
17464	| Feature state monitoring with Insights for D365 FO	| Add Telemetry logging support for logging feature state changes. Refer to [Insights for D365 FO Parameters](./setup.md#3-insights-for-d365-fo-parameters)
17025	| Capture feature name within Page views monitoring | Add a custom dimension capturing the feature name within page views monitoring

# Previous Version(s)

### Release 10.0.36.202403261

#### Build 10.0.36.202403261
Release date: 02 April 2024

<ins>New features</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
17151	| OData Event logging with Insights for D365 FO	| Add Telemetry logging support for all OData CRUD (Create, Read, Update, Delete) events. Refer to [Insights for D365 FO Parameters](./setup.md#3-insights-for-d365-fo-parameters)
17456	| Batch Task monitoring with Insights for D365 FO	| Add Telemetry logging support for batch tasks. Refer to [Insights for D365 FO Parameters](./setup.md#3-insights-for-d365-fo-parameters)
17414	| Application Insights Dashboard template | A new version of Application Insights Dashboard template


<ins>Bug fixes</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
16598	| Periodic monitoring configuration batch job	| Update periodic monitoring batch to ensure it is run in batch processing
16932	| Business event logging with Insights for D365 FO	| Fix issues with logging of Business events resulting in empty "n/a" records getting logged into Azure App Insights.
17016	| Business event logging with Insights for D365 FO	| Log Telemetry on active Business events only.
17455	| Batch job monitoring with Insights for D365 FO	| Fix issues with RunBaseBatch based batch jobs not getting monitored with Insights for D365 FO. Refer to [Batch job limitations](./Limitations.md#product-limitations)

### Release 10.0.36.202311291

#### Build 10.0.36.202311291
Release date: 29 November 2023

<ins>Bug fixes</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
16609	| Telemetry logging with Insights for D365 FO	| Fix issues with telemetry logging when users are removed from the system.

### Release 10.0.34.202310031

#### Build 10.0.34.202310031
Release date: 03 October 2023

<ins>**Manual actions required**</ins>

Due to the model source code restructuring in 15921, the Commerce Essentials - Telemetry [CET] and Commerce Essentials - Telemetry DXC Extra [DXCCETExtra] models have been removed. It is required to create an uninstall package to remove the Commerce Essentials - Telemetry [CET] and Commerce Essentials - Telemetry DXC Extra [DXCCETExtra] models. <br>
Otherwise you will receive duplicate object errors. <br>
See [MS instructions](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/deployment/uninstall-deployable-package).

<ins>New features</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
15921	| Model source code restructure	| The model source code has undergone restructuring to enhance our ability to effectively manage the codebase. The code logic from the Commerce Essentials - Telemetry [CET] and Commerce Essentials - Telemetry DXC Extra [DXCCETExtra] models have now been moved to a single DXC Insights model. See 'Manual actions required'.
12176	| Periodic monitoring configuration	| - Automate periodic telemetry monitoring batch job recurrence setup to ensure monitoring batch job restarts automatically on batch server crash or restart. <br> - Support extensibility for additional continuous/periodic monitoring events. <br> - Enable users to set custom refresh intervals on the periodic monitoring configuration form for monitoring events. <br> - Periodic monitoring parameters setup on Insights for D365 FO parameters is now more flexible, with no limit on maximum refresh frequency. <br> - Updated refresh interval unit from milliseconds to minutes for better readability and comprehension.
15789	| Periodic monitoring configuration	| - Add number sequence monitoring with continuous periodic monitoring. Users can enable monitoring and setup threshold values on the Number sequence code that will trigger an event to be logged with Insights for D365 FO when the utilization aligns with the threshold value of remaining days or remaining percentage of number sequence codes. <br> - Supports extensibility for developers to add more sophisticated custom logic for number sequence monitoring. <br> - Default threshold values for number sequence monitoring can be modified on the Periodic monitoring configuration form.
15932	| Telemetry logging with Insights for D365 FO	| Support basic batch job monitoring. Users can enable monitoring and set values for minimum/maximum number of minutes that a batch job is expected to take to complete. Telemetry will be logged with Insights for D365 FO at the start and end of each batch job execution. A summary of batch jobs that finish behind schedule or too early is available on Azure Application Insights with the Insights for D365 FO Dashboard provided by DXC.
15788	| Telemetry logging with Insights for D365 FO	| Support telemetry logging on unexpected session shutdown / termination causing an interrupt in the system. Session shutdown telemetry logging can be switched on from the Insights for D365 FO parameters form.
12178	| Telemetry logging with Insights for D365 FO	| - Support telemetry logging when users are added or removed from the system. User management telemetry logging can be switched on from the Insights for D365 FO parameters form. <br> - Support telemetry logging when changes are made to user access levels and roles.
15790	| Insights for D365 FO parameters	| Added help text on the Insights for D365 FO parameters form to improve the user experience.


### Release 10.0.31.202306231

#### Build 10.0.31.202306231
Release date: 23 June 2023

<ins>New features</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
13938	| Associate failing batch jobs and its exceptions	| Exceptions arising out of System run batch jobs will now have additional information "Batch Job Id" and "Batch Name" listed under custom dimensions of Azure Application Insights exceptions table. This will help link failing batch jobs to its related exceptions. 
14897	| New menu item to create performance view	| The periodic monitoring for SQL performance sometimes resulted in default values being generated initially. This issue can be resolved by executing the ‘Create performance view’ job. 

<ins>Bug fixes</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
14556	| SQL Performance telemetry logging issues with multiple loggers	| Where there were more than one instances of AppInsights (loggers) setup, customMetrics for SQL Performance telemetry was not getting logged via Insights For D365FO to the telemetry logger. This has now been fixed.

### Release 10.0.31.20230609

#### Build 10.0.31.202306091
Release date: 9 June 2023

<ins>New features</ins>

Number	| Name		 | Description
:--	|:--		  	|:--	
14607	| New Feature - Insights for D365 FO Dual Write	| Insights for D365 FO Dual Write provides additional event monitoring during Dual write sync

### Release 10.0.31.20230522

#### Build 10.0.31.202305222
Release date: 22 May 2023

# Installation process
To align with MS best practice and to protect our IP the following applies to the release process.
- The license models DXCLicense and Sable37License will only be released as binaries as part of a deployable package. 
- We will not provide test models for the products, neither as binary or source code. 
- We will only publish the release as a deployable package. 
- Model source code can be provided at our discretion. It can be requested for debugging upgrade errors, or if required for extensions.
	- If you have been given the source code to our model for extension or debugging purpose, never make modifications directly to our models! 
	- If you need an extension point, please send an email to ECLANZProductSupport@dxc.com and request it to be implemented. 


Depending on the installation history follow one of these guides to install the new release. 
## Installation without existing installed product
1. Apply the deployable package to your environment. 
2. If you have requested any model for extension or debugging purposes. Install the model source code. 
a.	Note, once the model source code is compiled it will overwrite the binaries installed when the deployable package was applied. 


## Installation with existing installed product
If you’re installing the new release in an installation that already has a previous version of the product installed and you’re not using it for debugging or extension. We recommend that you;  
1. Remove the release product model source code from your source control, if source control is used. 
2. Apply the deployable package, installing the latest version of the product models as binaries.  
3. Check in the binaries for the models to source control, if source control is used. 

If you’re using our model source code for extension or debugging and would like to continue using it, please do the following to apply the new release with the source code. 

1. Remove product license model from your source control that is applicable to the release. You’ll find the license model in the deployable package. It will either be called DXCLicense and Sable37License. 
2. Apply the deployable package to your environment to install the latest binaries. Check in the binaries for the license model that was removed in step 1 to source control. Note, this step will also install the binaries for all the models in the new release. 
3. Install the product release model source code and check into source control. 

If you don’t follow these instructions and continue building your installation deployable package using the license model source code, the installation will continue using the same license model as before applying the release. 

## Feature management

Enable the following features in D365 Feature management:
- **Insights for D365 FO**
- **Insights for D365 FO Dual Write** (additional license option)

If above feature is not visible, press **Check for updates** to refresh the feature management list.

