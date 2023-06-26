---
# required metadata

title: Insights for D365 FO
description: Insights for D365 FO - Release notes
author: Patrick Sharma
manager: Kym Parker
ms.date: 2023-06-13
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

### Release 10.0.31.202306231

Insights for D365 FO 10.0.31 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.31	  | [What’s new or changed in Dynamics 365 application version 10.0.31](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-31)
Microsoft Dynamics 365 application	| 10.0.32	  | [What’s new or changed in Dynamics 365 application version 10.0.32](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-32)
Microsoft Dynamics 365 application	| 10.0.33	  | [What’s new or changed in Dynamics 365 application version 10.0.33](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-changed-10-0-33)
Microsoft Dynamics 365 application	| 10.0.34	  | [What’s new or changed in Dynamics 365 application version 10.0.34](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-34)

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

# Previous Version(s)

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

