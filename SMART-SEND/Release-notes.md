---
# required metadata

title: Smart-Send
description: DXC Smart Business Form Email Manager - Release notes
author: lcoll
manager: Kym Parker
ms.date: 13/05/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Release notes]
audience: Application User
# ms.devlang: 
ms.reviewer: lcoll

# ms.tgt_pltfrm: 
ms.custom: : "21901", "intro-internal"
ms.search.region: Global 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: lcoll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# 	Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Current version

### Release 10.0.25.20220630

DXC Smart Business Form Email Manager 10.0.25 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.25	  | [What’s new or changed in Dynamics 365 application version 10.0.25](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-25)
Microsoft Dynamics 365 application	| 10.0.26	  | [What’s new or changed in Dynamics 365 application version 10.0.26](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-26)
Microsoft Dynamics 365 application	| 10.0.27	  | [What’s new or changed in Dynamics 365 application version 10.0.27](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-27)

#### Build 10.0.25.202206302

Number	  | Functionality	  | Reason
:--       |:--              |:--
10231	    | Support Vendor Tax Invoice report formats | The report type *Vendor Invoice* and the standard report formats *VendInvoiceDocument.Report* and *VendInvoiceDocumentModern.Report* are now available in the Smart Send configuration form ECL_AutoPrintReportMgmt
10288	    | Legal entity name placeholder token | The token placeholder %CompanyName% can now be used to return the name of the legal entity from which the report was generated.

# Previous version(s)

### Release 10.0.22.20220413

#### Build 10.0.22.202204131

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
10230	    | Sales	invoice not dispatched using the Smart Send button  | Resolution for error message received when selecting the Smart Send button on a customer tax invoice.

### Release 10.0.22.20220331

#### Build 10.0.22.202203312

Number	  | Functionality	  | Reason
:--       |:--              |:--
9654	    | Override purpose | Override configurations for print management are currently supported by Smart Send when using different report versions. Where the same report format is used, the email purpose used to identify the email recipient is always sourced from the default report. Print management configuration for an override condition now allows for an override purpose to be defined against the Smart Send destination. If this is entered the override purpose will supersede the purpose configured under email parameters.
9713	    | Key vault added for Blob storage connection string	| As an alternative to the blob connection string field, users can now select to use a key vault value. This is configured on a record level under Azure blob storage setup.

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
9797	    | Intercompany payment advice 	| Smart Send did not support BankPaymAdviceVendV2.Report for the processing of a payment advice for one legal entity from within another legal entity. Support for this has been added, allowing the email address to be sourced from the account in the posting company
9866    | Custom versions of the updated payment advice report were not recognised by the Smart send button	| The Smart Send payment advice button processes the default smart send configuration outside of print management. Customized versions based of BankPaymAdviceVendV2.Report were not processed. This button now supports all SSRS payment advice reports.
9947	    | Sales return	| For a sales return report to send successfully the user needed to have previously run the report, creating usage data. Without this the report would error. The report will now run without the cached data.
	
### Release 10.0.18.20211109

#### Build 10.0.18.202111091

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
9266	  | Email fallback not triggered	| In the absence of an email with the appropriate purpose, the fall back options of an alternative email and/or saving to blob storage are available to be configured in email parameters. These were not being triggered. The absence of an email will still provide a warning, however the configured fallback option will now also be actioned.

### Release 10.0.18.20210929

#### Build 10.0.18.202109291

Number	  | Functionality	  | Reason
:--       |:--              |:--
5145	|	Payment Advice (Vend/Cust) - V2 introduced		| In D365 10.0.13 Microsoft introduced Payment advice V2. Payment advice V2 is now supported when using the Smart Send payment advice button within the vendor payment and customer payment journals.
9506	|	Payment Advice V2 Report – Payment history		| Payment advice V2 is now supported when using the Smart Send payment advice button within the payment history form, accessible from the vendor.

### Release 10.0.16.20210520

#### Build 10.0.16.202105201

<ins>Deprecation</ins>

Number	  | Name	          | Reason
:--       |:--              |:--
9161	  |Feature Removal: Email Destination fields removed from print destinations email tab	| Fields on the email tab of the print destinations page used in Email Destination Defaults remained following the deprecation of the feature. The field Email ID and File name have now been removed. Email destination defaults feature has been removed.  This feature provided the ability to specify an email template and filename using placeholder tokens for a business form has now been removed, and instead, Smart Send Override email ID (Template) and Override file name features, can be used in print management conditions. Email destination defaults feature had been marked as deprecated since 19 March 2020.

### Release 10.0.16.20210406

#### Build 10.0.16.202104063

Number	  | Functionality	  | Reason
:--       |:--              |:--
6019	|	Smart Send Purchase Order- Add Requestor's/ Orderer's email to Email Template Tokens		| The email template tokens list has been updated for the Purchase Order report being sent via Smart send. Four new tokens have been added which now include the Requestor’s and Orderer’s name and email address.

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
5999  | ‘Test azure blob storage connection' not working correctly	| The ‘Test azure blob storage connection’ button on the Email parameters>Smart Send form was not working correctly. It used to display ‘Test connection successful’ in most scenarios of the Blob connection string, even when an incorrect string was passed. This has now been resolved and appropriate errors will be displayed if the string is incorrect.
8785	  | Report title not visible	| The document title for customer invoice was not set and displayed as blank when the report was sent via Smart Send. This has now been fixed.
  
<ins>Deprecation</ins>

Number	  | Name	          | Reason
:--       |:--              |:--
6041	  |Feature Removal: Email Destination Defaults	| Email destination defaults feature has been removed.  This feature provided the ability to specify an email template and filename using placeholder tokens for a business form has now been removed, and instead, Smart Send Override email ID (Template) and Override file name features, can be used in print management conditions. Email destination defaults feature had been marked as deprecated since 19 March 2020.
  
  
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
