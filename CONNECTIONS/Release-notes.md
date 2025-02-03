---
# required metadata

title: DXC Connections
description: DXC Connections - Release notes
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-01-09
ms.topic: article
ms.prod:
ms.service: dynamics-ax-applications
ms.technology:

# optional metadata

ms.search.form:
audience: Application User
# ms.devlang:
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm:
# ms.custom:
ms.search.region: DXCConnections
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Release notes

This document describes the features that are either new or changed in the release version mentioned.

Model is used in below products:

- Finance Utilities
- Smart Business Form Email Manager (Smart Send)
- Electronic Data Interchange (EDI)

# Version compatibility
The matrix shows the minimum DXC build versions compatible per Microsoft versions and builds. <br>
If blank: investigations are ongoing. <br>

D365 Version	  | Any issues found in testing?	  | Product version tested
:--       	  |:--           			  |:--
Product version: 10.0.42 <br> App build: 10.0.2095.13	  | No	          | 10.0.0.202411211

# Current version

### Release 10.0.40.202412041

DXC Connections 10.0.40.20412041 runs on the following Microsoft releases

| Base                               | Version | Release                                                                                                                                                         |
| :--------------------------------- | :------ | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Microsoft Dynamics 365 application | 10.0.40 | [What’s new or changed in Dynamics 365 application version 10.0.40](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-40) |
| Microsoft Dynamics 365 application | 10.0.41 | [What’s new or changed in Dynamics 365 application version 10.0.41](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-41) |
| Microsoft Dynamics 365 application | 10.0.42 | [What’s new or changed in Dynamics 365 application version 10.0.42](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-42) |

Build <b>7.0.7279.122 </b>  
DXCConnections.dll <b>1.0.2024.12043</b>  
DXCConnectionsAzureLib.dll <b>1.0.2024.12043</b>

Release date: 04 December 2024

<ins>New features</ins>

| Number | Name                                                              | Description                                                                                                                                                     |
| :----- | :---------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 20389  | New DXC Connections assembly file and DXC_AzureClient deprecation | DXC_AzureClient assembly DLL has been deprecated and replaced with DXCConnections for Core features and DXCConnectionsAzureLib for Azure related functionality. |

# Previous Version(s)

### Release 10.0.40.20241021

DXC License Manager 10.0.40 runs on the following Microsoft releases

| Base                               | Version | Release                                                                                                                                                         |
| :--------------------------------- | :------ | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Microsoft Dynamics 365 application | 10.0.40 | [What’s new or changed in Dynamics 365 application version 10.0.40](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-40) |
| Microsoft Dynamics 365 application | 10.0.41 | [What’s new or changed in Dynamics 365 application version 10.0.41](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-41) |
| Microsoft Dynamics 365 application | 10.0.42 | [What’s new or changed in Dynamics 365 application version 10.0.42](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-42) |

#### Build 10.0.40.202410211

Release date: 21 October 2024

<ins>New features</ins>

| Number | Name       | Description                                                                                                                |
| :----- | :--------- | :------------------------------------------------------------------------------------------------------------------------- |
| 19654  | uploadFile | Improved the uploadFile method to update metadata of file during upload instead of sending metadata as a separate request. |

### Release 10.0.40.20240919

#### Build 10.0.40.202409192

Release date: 19 September 2024

Moved Azure dll to new model called **DXC Connections**.

To be used in below products:

- Finance Utilities
- Smart Business Form Email Manager (Smart Send)
- Electronic Data Interchange (EDI)
