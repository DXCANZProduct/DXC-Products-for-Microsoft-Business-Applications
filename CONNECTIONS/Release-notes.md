---
# required metadata

title: DXC Connections
description: DXC Connections - Release notes
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-11-25
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
- DXC Insights for D365FO

# Version compatibility
The matrix shows the minimum DXC build versions compatible per Microsoft versions and builds. <br>
If blank: investigations are ongoing. <br>

D365 Version	  | Any issues found in testing?	  | Product version tested
:--       	  |:--           			  |:--
Product version: 10.0.44 <br> App build: 10.0.2263.11	  | No	          | 10.0.42.202504042
Product version: 10.0.45 <br> App build: 10.0.2345.13	  | No	          | 10.0.43.202508012
Product version: 10.0.46 <br> App build: 10.0.2428.15	  | No	          | 10.0.43.202510302


# Current version
### Release 10.0.44.202511252

DXC Connections 10.0.44 runs on the following Microsoft releases

Base                                | Version | Release                                                                                                                                                         
:---------------------------------  | :------ | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- 
Microsoft Dynamics 365 application  | 10.0.44 | [What’s new or changed in Dynamics 365 application version 10.0.44](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44)
Microsoft Dynamics 365 application	| 10.0.45 | [What’s new or changed in Dynamics 365 application version 10.0.45](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-45)
Microsoft Dynamics 365 application	| 10.0.46 | [What’s new or changed in Dynamics 365 application version 10.0.46](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-46)

Release date: 25 November 2025

<ins>New features</ins>

Number	| Name		 | Description
:--		  |:--		   |:--
24591  	| Added ability to use Container level Account key shared access signature URI | Azure blob connection has been modified to support Container level Account key SAS URI to be utlized for authentication.  |


# Previous Version(s)

### Release 10.0.43.202510021

Release date: 2 October 2025

<ins>New features</ins>

Number	| Name		 | Description
:--		  |:--		   |:--
24071  	| SFTP	   | Specified the Renci.SSHNET dll version in DXC Connections referencing, to avoid conflicts with different versions of the dll file in the environment.

### Release 10.0.43.202508012

Build <b>7.0.7279.122 </b>  
DXCConnections.dll <b>1.0.2025.08013</b>  
DXCConnectionsAzureLib.dll <b>1.0.2025.08013</b>
DXCConnectionsSFTPClientLib.dll <b>1.0.2025.08013</b>

Release date: 1 August 2025

<ins>New features</ins>

| Number | Name                                                              | Description                                                                                                                                                     |
| :----- | :---------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 22980 | Upgrade SFTP library to latest 2025.0.0 | Upgraded SSH.NET to latest, 2025.0.0|

### Release 10.0.42.202504042

Build <b>7.0.7279.122 </b>  
DXCConnections.dll <b>1.0.2025.04046</b>  
DXCConnectionsAzureLib.dll <b>1.0.2025.04046</b>
DXCConnectionsSFTPClientLib.dll <b>1.0.2025.04046</b>

Release date: 4 April 2025

<ins>New features</ins>

| Number | Name                                                              | Description                                                                                                                                                     |
| :----- | :---------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 20515  | Added support for SFTP | SFTP connection has been migrated for DXC Connection to enhance re-usability across multiple products. This is currently used in Finance Utilities and Electronic Data Interchange (EDI) |
| 21690 | Added ability to use container level shared access signature URI| Azure blob connection has been modified to allow container level SAS URI to be utlized for authentication. This is useful when storage account access key is disabled |
|21735|Upgraded SFTP to latest| Upgraded to version 2024.2.0|

### Release 10.0.40.2024120441


Build <b>7.0.7279.122 </b>  
DXCConnections.dll <b>1.0.2024.12044</b>  
DXCConnectionsAzureLib.dll <b>1.0.2024.12044</b>

Release date: 26 February 2025

<ins>New features</ins>

| Number | Name                                                              | Description                                                                                                                                                     |
| :----- | :---------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 21561  | Get Blob Properties Information | Add a method that gets list of blobs along with properties information from Azure blob storage container. |

### Release 10.0.40.202412041

#### Build 10.0.40.202412041

Release date: 04 December 2024

<ins>New features</ins>

| Number | Name                                                              | Description                                                                                                                                                     |
| :----- | :---------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 20389  | New DXC Connections assembly file and DXC_AzureClient deprecation | DXC_AzureClient assembly DLL has been deprecated and replaced with DXCConnections for Core features and DXCConnectionsAzureLib for Azure related functionality. |

### Release 10.0.40.20241021

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
