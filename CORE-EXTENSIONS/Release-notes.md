---
# required metadata

title: Core Extensions
description: DXC Core extensions - Release notes
author: PMusumeci
manager: Pontus, Ek
ms.date: 2025-01-15
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  Release notes
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# 	Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Version compatibility
The matrix shows the minimum DXC build versions compatible with Microsoft versions and builds. <br>
If blank: investigations are ongoing. <br>

D365 Version		  |Iissues found in testing?| Product version tested
:--       	 		 |:--           			  |:--
Product version: 10.0.40 <br> App build: 10.0.1935.5	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymization 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.41 <br> App build: 10.0.2015.16	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymization 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.42 <br> App build: 10.0.2095.13	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymization 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.43 <br> App build: 10.0.2177	  | Currently being tested | pending testing results 


Release notes for other models included in the product:
- [DXC License Manager](../LMG/Release-notes.md#dxc-license-manager)
- [DXC License](../LMG/Release-notes.md#dxc-license)

# Deprecated features

This section describes the features that have been removed or are planned to be removed from a Core Extensions version.

Deprecated in version 10.0.40.20241023
### Exchange Rate Import - Bank of Canada Version TBC
Reason for deprecation/removal  - no longer being used as a source of currency exchange rates

### Business Process links
Reason for deprecation/removal - Business Process links were originally designed for Mavim and SharePoint integration.  Both Mavim and Sharepoint have alternate connection capabilities with D365 Finance and operations and the product is no longer being utilised as part of the Core extension solutions 

# Current version

### Release 10.0.40.20241023

DXC Core extensions 10.0.40 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.40	  | [What’s new or changed in Dynamics 365 application version 10.0.40](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-40)
Microsoft Dynamics 365 application	| 10.0.41 	  | [What’s new or changed in Dynamics 365 application version 10.0.41](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-41)
Microsoft Dynamics 365 application	| 10.0.42 	  | [What’s new or changed in Dynamics 365 application version 10.0.42](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-42)
Microsoft Dynamics 365 application	| 10.0.43 	  | [What’s new or changed in Dynamics 365 application version 10.0.43](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-43)
Microsoft Dynamics 365 application	| 10.0.44 	  | Due April 2025 see [Targeted release schedule](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/get-started/public-preview-releases#targeted-release-schedule-dates-subject-to-change)

## Feature management
From 10.0.36.20231130 Core Extensions can be enabled via Feature management.
Enable the following feature in D365 Feature management:

- Core extensions

Press **Check for updates** to refresh the feature management list if the above feature is not visible.

#### Build 10.0.40.202410231

Release date: 23 October 2024

<ins>Bug fixes</ins>

Number	  	| Name	  | Description
:--       	|:--              |:--
18269|Cannot edit a record in Titles (HcmTitle). The record already exists.| A new Data Type of Title ID has been added to generate random unique titles that can be used  to fill this field
17084|Duplicate record exists when exporting print management settings | New field PRINTMGMTDOCINSTANCENAME has been introduced to the Data Entity to allow for the Title of the conditional setting to be saved
18737|Refine "edit" capability for Data anonymization Table| When a record(s) exist in the *Data anonymization fields Table*, allow "Run across all companies" and "Company" to be edited and hold the information/selection in the Data anonymization fields Table below (existing logic remains that if "Company" is active, "Run across all companies" cannot be ticked )
18180|Data anonymization Change of Legal entity| When switching "Run across all companies" and "Company" the legal entity selection in "company" will now clear 
17915|Data anonymization Support other Languages|Data anonymization Supports Languages other than en-AU, and en-US
16616| Add warning or confirmation message before Reset print management is actioned| A new warning message was added when selecting "reset print management" to confirm actions cannot be undone
19570|Change Feature Key description for Data Anonymization include (Preview)| Changes were made to the DXC License manager model (see [Release notes](../LMG/Release-notes.md) ) to highlight that Data anonymization is a preview product and still evolving 




# Previous version(s)

#### Build 10.0.36.202405301

Release date: 30 May 2024

<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
16778		| Separate Feature and License Key for Data Anonymization 	| Previously Data Anonymization was available as part of the Standard Core EXtensions Software piece.  From 10.0.36.20240530 this was corrected and Data Anonymization is licensed separately from the rest of the Core extension functions.

<ins>New features</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
17503|Ability to update records with Unique values|generates individual values per line as part of Data Anonymization functionality 
17475|Add user-friendly name (label) on table selection in the Data Anonymization Table|displays the "friendly" name of the table
17576|Create Data entities for Data anoymization|allows Data anonymization profiles and set up to be exported 
17474|Disable Initiate Data Anonymization button if no records exist on header or lines table| If no Tables exist on header or lines of Data Anonymisation you cannot perform the function 
17476|Remove Data entities, staging tables, and Read/View only Tables from the list of selectable tables on table selection in the Data Anonymization Table|Removal of fields that are not updateable
17472|Selected fields getting temporarily cleared|When adding fields to your table selection fields were being cleared
17477|Validate URL in Parameters table on Update| The URL must be in a WEB format
17473|Header Lines relationship between data anonymization table and fields|If Table fields have been added you can no longer remove the Header table from the list 









### Release 10.0.36.20231130

#### Build 10.0.36.202311301

Release date: 30 November 2023

<ins>New features</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
14998		| DMF Toolbox	| Exposes 2 new fields in DMF data entities
16043		| Scramble data in FinOps env to protect sensitive data	| Allows for information to be scrambled post a database copy or restore from a production into a sandbox environment.
16013		| Export/import of Print management settings	| New feature that allows the import/Export of Printer management settings
16514		| Reset Print Management | Resets Print management setting for the related module to Default, can be used in case of errors or query corruption. Available in the following Modules, Accounts receivable, Inventory management, Procurement and sourcing, Project management and accounting, Transportation Management, Warehouse management
16567		| Exchange Rate update	| When importing General Journals with no exchange rate the Journal is populated with the Default Exchange rate for that currency
13552		| Feature management	| Core extensions now available via Feature management



<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
15670		| User security details report not generating	| corrected error when User security details report is run with privileges set to Yes



#### Build 10.0.34.202306082

Release date: 8 June 2023

<ins>Bug fixes</ins>
Number	  	| Functionality	  | Description
:--       	|:--              |:--
14330		| Build fixes	| 10.0.34 build error fix for: <br> - Add missing reference to model FinTag <br> - Update register symbolic link script

#### Build 10.0.29.202304142

Release date: 14 April 2023

<ins>New features</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
N/A		| License manager	| License manager version 10.8.32.10171 <br> Enhanced Licensing capabilities to assist with licensing support and scaling. <br> **Note:** Required to upgrade all installed DXC products to at least the following versions: <br> • EDI 10.0.29.202305053 <br> • Finance utilities 10.0.29.202305051 <br> • SmartSend 10.0.29.202304142 <br> • Core extensions 10.0.29.202304142 <br> • DocuSign 10.0.29.202304211 <br> • Item creation 10.0.29.202304211 <br> •  PLM 10.0.29.202304211 <br> • Forex 10.0.29.202305101 <br> ![System parameters](../FINU/Images/ReleaseNotes_202304_2.png "System parameters")

### Release 10.0.29.20230223

#### Build 10.0.29.202302231

Release date: 23 February 2023

<ins>New features</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
10206		| Display reciprocal exchange rates	| New setting **Display reciprocal exchange rate** added to **Legal entities**. <br> When set to _Yes_, displays the reciprocal rate on: <br> - General journal lines <br> - Vendor invoice journal lines <br> - Vendor payment journal lines <br> - Purchase order totals <br> - Customer payment journal lines <br> - Free text invoice totals <br> - Sales order totals <br> [User guide](RECIPROCAL/Company-Reciprocal.md)
N/A		| License manager	| License manager version 10.8.32.10156. <br> **Help** includes links to applicable GitHub user guide page/s <br> ![Help](IMAGES/ReleaseNotes_20230222_1.png "Help")

<ins>Bug fixes</ins>

Number	| Name	          | Description
:--     |:--              |:--
9513	| User security audit details report	| Display **Privilege** information per Role and Duty.

### Release 10.0.22.20220331

#### Build 10.0.22.202203312

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
10016	    | Import ledger journal no longer displays export templates  | The import ledger journal class displayed both import and export data entities. This has been amended to only display import data entities.
10017	    | Support inventory movement journal data entity V4  | Support inventory movement journal data entity V3 has been replaced with the updated V4. Support for this new data entity has been added to the inventory journal import feature.

### Release 10.0.16.20210413

#### Build 10.0.16.202104131

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
8953	    | Company color removed on browser refresh 	| A change by Microsoft in 10.0.17 introduces a bug in the Core extensions where the company color is being reset to default when the browser is refreshed. It is only reinstated by opening the legal entities form where the company colour configuration is set. This has now been fixed.
	
### Release 10.14.38.10019

#### Build 10.14.38.10019

Number	  | Functionality	  | Reason
:--       |:--              |:--
5695	|	Inventory Movement Journal Headers and Lines entity marked as obsolete	| The Inventory Movement Journal Headers and Lines entity which is used in the Inventory Movement Import function has been marked as obsolete by Microsoft and is replaced by the Inventory Movement Journal Headers and Lines V3 entity. Core extensions has been updated to use the new data entity. Some changes in the configuration and setup of the import function is required. <br/> <br/> We note that the Inventory movement journal headers and lines V3 data entity which as standard loads the data based on the scenario where if an existing Inventory Movement Journal with less than 1,000 lines is “Not posted”, the imported lines will be appended to the existing journal, otherwise a new journal will be created.


  
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
