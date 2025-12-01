---
layout: releasenotes-content
header: Core Extensions
title: 10.0.44.202510171
release-version: 10.0.44.202510171
markAsPrevious: false
toc: true
---
# Version compatibility
The matrix shows the minimum DXC build versions that are compatible with Microsoft versions and builds. <br>
If blank, investigations are ongoing. <br>

D365 Version		  |Iissues found in testing?| Product version tested
:--       	 		 |:--           			  |:--
Product version: 10.0.40 <br> App build: 10.0.1935.5	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymisation 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.41 <br> App build: 10.0.2015.16	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymisation 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.42 <br> App build: 10.0.2095.13	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymisation 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.43 <br> App build: 10.0.2177	  | No | DXC Core Extensions 10.0.40.202502051 <br> DXC Data Anonymisation 10.0.40.202502051 <br> DXC DMF Toolbox 10.0.40.202502051
Product version: 10.0.44 <br> App build: 10.0.2263	  | yes only build errors 22878 | DXC Core Extensions 10.0.40.202502051 <br> DXC Data Anonymisation 10.0.40.202502051 <br> DXC DMF Toolbox 10.0.40.202502051 <br> build errors fixed in 10.0.44.202506171
Product version: 10.0.45 <br> App build: 10.0.2345.13	  | No | DXC Core Extensions 10.0.44.20250625 <br> DXC Data Anonymisation 10.0.44.20250625 <br> DXC DMF Toolbox 10.0.44.20250625 
Product version: 10.0.46 <br> App build: 10.0.2428	  |  | DXC Core Extensions 10.0.44.202510171 <br> DXC Data Anonymisation 10.0.44.202510171 <br> DXC DMF Toolbox 10.0.44.202510171 

Release notes for other models included in the product:
- [DXC License Manager](../LMG/Release-notes.md#dxc-license-manager)
- [DXC License](../LMG/Release-notes.md#dxc-license)

# Deprecated features

This section describes the features that have been removed or are planned to be removed from a Core Extensions version.

Deprecated in version 10.0.40.20241023
### Exchange Rate Import - Bank of Canada
Reason for deprecation/removal: no longer being used as a source of currency exchange rates

### Business Process links
Reason for deprecation/removal - Business Process links (also referred to as Business Process Suite) were originally designed for Mavim and SharePoint integration.  Both Mavim and SharePoint have alternate connection capabilities with D365 Finance and Operations, and the product is no longer being utilised as part of the Core extension solutions. The Model was removed in version 10.0.40.202502051

# Current version

### Release {{page.release-version}}

DXC Core extensions {{page.release-version}} run on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.44 	  | [What’s new or changed in Dynamics 365 application version 10.0.44](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44)
Microsoft Dynamics 365 application	| 10.0.45 	  | [What’s new or changed in Dynamics 365 application version 10.0.45](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-45)
Microsoft Dynamics 365 application	| 10.0.46 	  | [What’s new or changed in Dynamics 365 application version 10.0.46](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-46)

{% include_relative {{page.release-version}}.md %}

# Installation process
To align with MS best practice and to protect our IP the following applies to the release process.
- The license models DXCLicense and Sable37License will only be released as binaries as part of a deployable package. 
- We will not provide test models for the products as binary or source code. 
- We will only publish the release as a deployable package. 
- Model source code can be provided at our discretion. It can be requested for debugging upgrade errors, or if required for extensions.
	- If you have been given the source code to our model for extension or debugging purposes, never modify our models directly! 
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

1. Remove the product license model from your source control that applies to the release. You’ll find the license model in the deployable package. It will either be called DXCLicense or Sable37License. 
2. Apply the deployable package to your environment to install the latest binaries. Check in the binaries for the license model that was removed in step 1 to source control. Note, that this step will also install the binaries for all the models in the new release. 
3. Install the product release model source code and check into source control. 

If you don’t follow these instructions and continue building your installation deployable package using the license model source code, the installation will continue using the same license model as before applying the release. 
