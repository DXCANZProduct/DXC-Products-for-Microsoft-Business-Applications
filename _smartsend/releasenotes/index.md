---
layout: releasenotes-content
header: Smart Business Form Email Manager (SmartSend)
title: 10.0.43.20250730
release-version: 10.0.43.20250730
state: current
---

# Version compatibility
The matrix displays the minimal DXC product version and its compatibility with Microsoft versions/builds.
If it is blank or not listed, investigations are still underway. When upgrading Microsoft Dynamics 365 Finance and Operations, always use the most recent DXC release. <br>

Microsoft Dynamics 365 Finance and Operations Version		  | Any issues found in testing?	  |Product version tested
:--      			 	  |:--           			  |:--
Microsoft Dynamics 365 Product version:    [10.0.40](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-40) <br> 	App build: 10.0.1935.5	  | No | 10.0.37.202403263
Microsoft Dynamics 365 Product version:    [10.0.41](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-41) <br> 	App build: 10.0.2015.16	  | No | 10.0.37.202403263
Microsoft Dynamics 365 Product version:    [ 10.0.42](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-42) <br> 	App build: 10.0.2095	  | No | 10.0.40.202409113
Microsoft Dynamics 365 Product version:    [10.0.43](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-43) <br>	 App build: 10.0.2177	  | No | 10.0.40.202409113 
Microsoft Dynamics 365 Product version:    [10.0.44](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44) <br>	 App build: 10.0.2263	  | No | 10.0.42.20250304 
Microsoft Dynamics 365 Product version:    [10.0.45](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-45) <br>	 App build: 10.0.2345	  | No | 10.0.43.20250730

Release notes for other models included in the product:
- [DXC Connections](../CONNECTIONS/Release-notes.md)
- [DXC License Manager](../LMG/Release-notes.md#dxc-license-manager)
- [DXC License](../LMG/Release-notes.md#dxc-license)


# Current version

### Release {{page.release-version}}

DXC Smart Business Form Email Manager {{page.release-version}} runs on the following Microsoft releases


Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.43 	  | [What’s new or changed in Dynamics 365 application version 10.0.43](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-43)
Microsoft Dynamics 365 application	| 10.0.44 	  | [What’s new or changed in Dynamics 365 application version 10.0.44](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44)
Microsoft Dynamics 365 application	| 10.0.45 	  | [What’s new or changed in Dynamics 365 application version 10.0.45](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-45)

{% include_relative {{page.release-version}}.md %}

## Feature management
From 10.0.34.20231026, Smart Send can be enabled via Feature management
Enable the following feature in D365 Feature management:

- DXC Smart Send

If the above feature is not visible, press **Check for updates** to refresh the feature management list.

# Installation process
To align with MS best practice and to protect our IP the following applies to the release process.
- The license models DXCLicense and Sable37License will only be released as binaries as part of a deployable package. 
- We will not provide test models for the products as binary or source code. 
- We will only publish the release as a deployable package. 
We can provide model source code at our discretion. It can be requested to debug upgrade errors or if required for extensions.
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
