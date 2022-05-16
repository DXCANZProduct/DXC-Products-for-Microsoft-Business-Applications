---
# required metadata

title: [DXC Solutions for DocuSign and Dynamics 365]
description: [DXC Solutions for DocuSign and Dynamics 365 - Release notes]
author: [lcoll]
manager: Kym Parker
ms.date: 16/05/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Release notes]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [lcoll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# 	Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Current version

### Release 10.0.22.20220321

DXC Smart Business Form Email Manager 10.0.22 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.22	  | [What’s new or changed in Dynamics 365 application version 10.0.22](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-22)
Microsoft Dynamics 365 application	| 10.0.23	  | [What’s new or changed in Dynamics 365 application version 10.0.23](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-23)
Microsoft Dynamics 365 application	| 10.0.24	  | [What’s new or changed in Dynamics 365 application version 10.0.24](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-24)
Microsoft Dynamics 365 application	| 10.0.25	  | [What’s new or changed in Dynamics 365 application version 10.0.25](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-25)
Microsoft Dynamics 365 application	| 10.0.26	  | [What’s new or changed in Dynamics 365 application version 10.0.26](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-26)

#### Build 10.0.22.202203211

Number	  | Functionality	  | Reason
:--       |:--              |:--
9154	    | Support for textbox type | The tag type of text is now supported for envelope creation. A text character limit can be defined for each use of this tag type.
9315	    | Send account name for placeholder emails	| Support for the sending of distinct values for SignerEmail and SignerName when using purpose controlled placeholders in document management. The value for the SignerName will be the account name for the party. Previously both values were communicated as the email address. This feature must be enabled on each document type by selecting the field Use document type.
9793	    | Mandatory page number for specific page	| When selecting to use a specific page for tag placement the page number field in now mandatory. This is to prevent an issue with envelope creation and tag assignment to page 0.

# Previous version(s)

### Release 10.0.12.20210701

#### Build 10.0.12.202107011

Functionality	  | Reason
:--              |:--
Update to 10.0.12 | Update release version to 10.0.12 in line with platform support.
License manager	| Update to license manager 10.8.32.10112.

### Release 10.0.9.20200820

#### Build 10.0.9.202008201

Functionality	  | Reason
:--              |:--
License manager	| Update to license manager 10.8.32.10092.

  
# Installation process
To align with MS best practice and to protect our IP the following changes have been made to the release process.
- The license models DXCLicense and Sable37License will only be released as binaries as part of a deployable package. 
- We will no longer be providing test models for the products, neither as binary or source code. 
- We will only publish the release as a deployable package. 
- Model source code can be provided on request if needed for extensions or debugging.
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
