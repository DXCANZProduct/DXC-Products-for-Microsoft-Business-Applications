---
# required metadata

title: License manager
description: License manager - Release notes
author: hho34
manager: Kym Parker
ms.date: 2023-07-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: 
ms.search.region: ICONForex
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# D365 Finance and Operations - Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Current version

## Release 10.8.32.10171 

License Manager 10.8.32.10171 runs on the following Microsoft releases 

Base | Version | Release 
:--       |:--  |:--
Microsoft Dynamics 365 application	| 10.0.29	  | [What’s new or changed in Dynamics 365 application version 10.0.29](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-29)
Microsoft Dynamics 365 application	| 10.0.30	  | [What’s new or changed in Dynamics 365 application version 10.0.30](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-30)
Microsoft Dynamics 365 application	| 10.0.31	  | [What’s new or changed in Dynamics 365 application version 10.0.31](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-31)
Microsoft Dynamics 365 application	| 10.0.32	  | [What’s new or changed in Dynamics 365 application version 10.0.32](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-32)
Microsoft Dynamics 365 application	| 10.0.33	  | [What’s new or changed in Dynamics 365 application version 10.0.33](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-changed-10-0-33)
Microsoft Dynamics 365 application	| 10.0.34	  | [What’s new or changed in Dynamics 365 application version 10.0.34](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-34)
Microsoft Dynamics 365 application	| 10.0.35	  | [What’s new or changed in Dynamics 365 application version 10.0.35](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-35)

<b>Build 7.0.5493.35497 </b>

<ins>New features</ins>

Number | Functionality | Description 
:--       |:--  |:--
13085  | Multi-tenant | Enabled multi-tenant support for license manager. <br> - Added support for tenant GUID for license server product validations. <br> - All licensed products now require a unique tenant GUID specific to the organization for license validation. <br> - Added multi-tenancy support to the existing license validation API. <br> - Added ability to host separate database and application insights instances for specific to each tenant. <br> - Added capability to forward tenant specific telemetry. <br> - Added ability to resolve product license validation based on the tenant GUID configured <br> - Updated product publisher to be based off the tenant. 

# Previous version(s)

## Release 10.8.32.10156 

<b> Build 7.0.5493.35497 </b>

<ins>New features</ins>

Number | Functionality | Description
:--    |:--   |:--
10625 | Product help in D365 | Users can access applicable product’s GitHub user guides from within D365 help pane. 

## Release 10.8.32.10141 

<b> Build 7.0.5493.35497 </b>

<ins>New features</ins> 

Number | Functionality | Description 
:--  |:-- |:--
10341 | D365 - Product documentation | Added ability to view user guides, release notes and contact information for each product within D365 <br>   - New workspace under organization administration called Product support <br>   - These fields can be updated as part of the license manager Power App front end and are synced within D365 when the license check is executed. 

##  Release 10.8.32.10131 
<b> Build 7.0.5493.35497 </b>

<ins>Bug fixes</ins>

Number | Functionality | Description 
:--    |:--   |:--
68 | Fix load time delay due to license check | A fix has been implemented to address the load time delay on the default page. The license check used to lock the process and users would experience a delay of approximately a minute. 

## Release 10.8.32.10123 
<b> Build 7.0.5493.35497 </b>

<ins>New features</ins>

Number | Functionality | Description 
:--    |:--   |:--
54 | Configure custom DNS for license manager | - Previous versions used azure hosted connection which can encounter down time and delay. <br> - Added custom DNS to ensure licensing team have full access to DNS propagation and can handle redirection to alternative service during downtimes. 

<ins>Bug fixes</ins>

Number | Functionality | Description 
:--    |:--   |:--
63 | Set find and exist method accessibility to public in license manager table | Users were unable to access these methods in extends due to its accessibility set to private 

## Release 10.8.32.10101 

<b> Build 7.0.5493.35497 </b>

<ins>Bug fixes</ins>

Number | Functionality | Description 
:--    |:--   |:--
40 | Fixed synchronisation issues when performing license checks | Users experienced info logs stating the product is enabled but not licensed even though the product is licensed. This issues persisted intermittently.  

# Microsoft Power Apps - Release notes

# Current version

## Release 2023060511 
DXC version – 1.0.0.6 <br>
Cepheo version – 1.0.0.5 

<ins>Bug fixes</ins>

Number | Functionality | Description |
|--    |--   |-- |
14592 | Disable add button when customer edit view is enabled | A fix has been applied to disable users from trying to create a new button while in edit mode.|
|14593|Customer list is not refreshed after adding/updating a customer record| A fix has been made to resolve the refresh issue for customer record not appearing in the customer details list pane after add or update |
|14594|Blank customer name is accepted| Customer name has been set to mandatory. In previous versions, the customer name could be reset to blank during update|
|14595|Same name product can be created multiple times| Product name has been set to unique |
|14596|Blank tenant is saved successfully|In previous versions, the tenant name could be left blank. Validation has been added for missing tenant name|
|14597|Environment count does not update|A fix has been applied for the environment count refresh within the customer products list. In previous version, the environment count was not updated when the back button was pressed from the environments view |
|14598|Product record still visible after delete| A fix has been made to the product list refresh. This will now reflect the delete of all product records |
|14600|Blank product name is accepted|Product name is set to mandatory. The app will prompt for missing product name during creation and deletion |
|14601|New product not visible under product list in the customer products view|A fix has been made to refresh the product list after a product record is created.| 

## Release 202306051 
DXC version – 1.0.0.5 <br>
Cepheo version – 1.0.0.4 

<ins>Bug fixes</ins>

Number | Functionality | Description 
:--    |:--   |:--
14138 | Edit product - JSON error | Fix has been applied for an issue with json error promp when a product is modified.

<ins>Deprecation</ins>

Number | Functionality | Description 
:--    |:--   |:--
13682 | Deprecate DAXEAM Mobile | Daxeam mobile is no longer supported. As part of this change, the environments API endpoint and the product type Daxeam Mobile has been deprecated. 

# Previous version(s)  
## Release 202304281 
DXC version – 1.0.0.4 <br>
Cepheo version – 1.0.0.3 

<ins>Bug fixes</ins>

Number | Functionality | Description 
:--    |:--   |:--
13692 | Fixed customer description update issue | In previous version, when the customer description was modified an error used to be prompted to the user and the value was not saved. 
13696 | Fixed issue when trying to update dates on customer products | In previous version, the date was not updated correctly when modifying the customer product record. 

<ins>Known issues</ins>

Number | Name | Description | Rectified Release 
:--    |:--   |:-- |:--
14138 | Edit product – JSON error | When modifying products, a json error is prompted |

## Release 202303311 

DXC version – 1.0.0.1 <br>
Cepheo version – 1.0.0.2 

<ins>New features</ins>

Number | Functionality | Description 
:--    |:--   |:--
13085 | Enable multi-tenant support for license manager | - Enabled multi-tenant-based license manager views to display tenant specific data in correlation to the database instance for each unique tenant GUID <br> - Updated framework for data processing within Power Apps to use APIM using OAuth credentials. 

 
