---
# required metadata

title: Security Insights for D365 FO
description: Security Insights for D365 FO - Release notes
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-09-10
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
ms.search.validFrom:  2023-03-28
ms.dyn365.ops.version: 10.0.31
---

# 	Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Version compatibility
The matrix shows the DXC build versions compatiable for Microsoft versions and builds. <br>
If blank: investigations are ongoing. <br>

D365 Version	  | Any issues found in testing?	  | Product version tested
:--       	  |:--           			  |:--
Product version: 10.0.40 <br> App build: 10.0.1935.92	  | No		  | 
Product version: 10.0.41 <br> App build: 10.0.2015.16	  | No	          | 10.0.37.202407311

# Current version

### Release 10.0.40.20240910

Security Insights for D365 FO 10.0.40 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.40	  | [What’s new or changed in Dynamics 365 application version 10.0.40](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-40)
Microsoft Dynamics 365 application	| 10.0.41	  | [What’s new or changed in Dynamics 365 application version 10.0.41](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-41)

#### Build 10.0.40.202409101
Release date: 10 September 2024

<ins>New features</ins>

Number	| Name		 | Description
:--	|:--		  	|:--
18830	| Initiate user security groups	| Ability to use **Microsoft Entra ID security groups** when initiating user security groups on the **Security insights by user** view. <br> Option controlled by the MSFT config key for AAD.
18764	| HR tables	| Ability to insert columns from HR tables. For example can insert Title for users, where person is assigned to users.
18756	| Filter by Group	| Ability to filter by **User security group** on following steps: <br> • Fetch interaction data from application insights <br> • Calculate utilization rates

# Previous Version(s)

### Release 10.0.37.20240731

#### Build 10.0.37.202407311
Release date: 31 July 2024

First release

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

Enable the following feature in D365 Feature management:
- **Security Insights for D365FO**

If above feature is not visible, press **Check for updates** to refresh the feature management list.

