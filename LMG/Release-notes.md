---
# required metadata

title: License manager
description: License manager - Release notes
author: hho34
manager: Kym Parker
ms.date: 2023-06-07
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

# Dynamics 365 Finance and Operations 

## Release notes
This document describes the features that are either new or changed in the release version mentioned.

## What’s new or changed  

## Release 10.8.32.10171 

### Build 7.0.5493.35497 
This document describes the features that are either new or changed in the release version mentioned. 

DXC License Manager 10.8.32.10171 runs on the following Microsoft releases 


Base | Version | Release 
:--       |:--  |:--
Microsoft Dynamics 365 platform | 10.0.29 | What’s new or changed in Dynamics 365 application version 10.0.29 
Microsoft Dynamics 365 platform | 10.0.30 | What’s new or changed in Dynamics 365 application version 10.0.30 
Microsoft Dynamics 365 platform | 10.0.31 | What’s new or changed in Dynamics 365 application version 10.0.31 
Microsoft Dynamics 365 platform | 10.0.32 | What’s new or changed in Dynamics 365 application version 10.0.32 
Microsoft Dynamics 365 platform | 10.0.33 |What’s new or changed in Dynamics 365 application version 10.0.33 

**New Features** <br>
Features that are either new or changed in the release version mentioned. 



Number | Functionality | Reason 
:--       |:--  |:--
13085  | Multi-tenant | Enabled multi-tenant support for license manager. <br> - Added support for tenant GUID for license server product validations. <br> - All licensed products now require a unique tenant GUID specific to the organization for license validation. <br> - Added multi-tenancy support to the existing license validation API. <br> - Added ability to host separate database and application insights instances for specific to each tenant. <br> - Added capability to forward tenant specific telemetry. <br> - Added ability to resolve product license validation based on the tenant GUID configured <br> - Updated product publisher to be based off the tenant. 

## Release 10.8.32.10156 

### Build 7.0.5493.35497 

This document describes the features that are either new or changed in the release version mentioned. 

DXC License Manager 10.8.32.10156 runs on the following Microsoft releases


Base | Version | Release 
:--  |:-- |:--
Microsoft Dynamics 365 platform | 10.0.29 | What’s new or changed in Dynamics 365 application version 10.0.29 
Microsoft Dynamics 365 platform | 10.0.30 | What’s new or changed in Dynamics 365 application version 10.0.30 
Microsoft Dynamics 365 platform | 10.0.31 | What’s new or changed in Dynamics 365 application version 10.0.31 
Microsoft Dynamics 365 platform | 10.0.32 | What’s new or changed in Dynamics 365 application version 10.0.32 
Microsoft Dynamics 365 platform | 10.0.33 | What’s new or changed in Dynamics 365 application version 10.0.33 

### New Features 

Features that are either new or changed in the release version mentioned. 

Number | Functionality |Reason 
:--    |:--   |:--
10625 |DXC product help in D365 | Users can access applicable product’s GitHub user guides from within D365 help pane. 

## Release 10.8.32.10141 

### Build 7.0.5493.35497 

#### New Features 

Features that are either new or changed in the release version mentioned. 

Number | Functionality | Reason 
:--  |:-- |:--
10341 | D365 - Product documentation | Added ability to view user guides, release notes and contact information for each product within D365 <br>   - New workspace under organization administration called DXC support <br>   - These fields can be updated as part of the license manager Power App front end and are synced within D365 when the license check is executed. 

## Release 10.8.32.10131 
### Build 7.0.5493.35497 
#### Bug fixes 
This release includes the following fixes 

Number | Functionality |Reason 
:--    |:--   |:--
68 |Fix load time delay due to license check | A fix has been implemented to address the load time delay on the default page. The license check used to lock the process and users would experience a delay of approximately a minute. 

## Release 10.8.32.10123 
### Build 7.0.5493.35497 
### New Features 

Features that are either new or changed in the release version mentioned. 

Number | Functionality | Reason 
:--    |:--   |:--
54 |Configure custom DNS for license manager | - Previous versions used azure hosted connection which can encounter down time and delay. <br> - Added custom DNS to ensure licensing team have full access to DNS propagation and can handle redirection to alternative service during downtimes. 

#### Bug fixes 
This release includes the following fixes 

Number | Functionality | Reason 
:--    |:--   |:--
63 | Set find and exist method accessibility to public in license manager table | Users were unable to access these methods in extends due to its accessibility set to private 

## Release 10.8.32.10101 

### Build 7.0.5493.35497 

### Bug fixes 

This release includes the following fixes 

Number | Functionality | Reason 
:--    |:--   |:--
40 | Fixed synchronisation issues when performing license checks | Users experienced info logs stating the product is enabled but not licensed even though the product is licensed. This issues persisted intermittently.  

# Microsoft Power Apps 

## What’s new or changed  

## Release 202304281 
DXC version – 1.0.0.4 <br>
Cepheo version – 1.0.0.3 

### Bug fixes 

This release includes the following fixes 

Number | Functionality | Reason 
:--    |:--   |:--
13692 | Fixed customer description update issue | In previous version, when the customer description was modified an error used to be prompted to the user and the value was not saved. 
13696 | Fixed issue when trying to update dates on customer products | In previous version, the date was not updated correctly when modifying the customer product record. 

### Known Issues 

Number | Name | Description | Rectified Release 
:--    |:--   |:-- |:--
14138 | Edit product – JSON error | When modifying products, a json error is prompted |

 

## Release 202303311 

DXC version – 1.0.0.1 
Cepheo version – 1.0.0.2 

### New Features 

Features that are either new or changed in the release version mentioned. 

Number | Functionality | Reason 
:--    |:--   |:--
13085 | Enable multi-tenant support for license manager | - Enabled multi-tenant-based license manager views to display tenant specific data in correlation to the database instance for each unique tenant GUID <br> - Updated framework for data processing within Power Apps to use APIM using OAuth credentials. 

 
