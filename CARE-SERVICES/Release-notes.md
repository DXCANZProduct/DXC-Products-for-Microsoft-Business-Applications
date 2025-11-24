---
# required metadata

title: Care Services
Description: DXC Care Services/Aged Care - Release notes
author: PMusumeci
Manager: Pontus, Ek
ms.date: 2025-10-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Health, Care, Aged Care, Care Services
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-02-05
ms.dyn365.ops.version: 10.0.40
---

# 	Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Version compatibility
The matrix shows the minimum DXC build versions compatible with Microsoft versions and builds. <br>
If blank: investigations are ongoing. <br>

Microsoft Dynamics 365 Finance and Operations Version		  | Any issues found in testing?	  |Product version tested
:--      			 	  |:--           			  |:--
Microsoft Dynamics 365 Product version:    [10.0.41](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-41) <br> 	App build: 10.0.2015.16	  | No | 
Microsoft Dynamics 365 Product version:    [ 10.0.42](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-42) <br> 	App build: 10.0.2095	  | No | 
Microsoft Dynamics 365 Product version:    [10.0.43](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-43) <br>	 App build: 10.0.2177	  | No | 10.0.41.202502262
Microsoft Dynamics 365 Product version:    [10.0.44](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44) <br>	 App build: 10.0.2177	  | No | 10.0.41.202502262
Microsoft Dynamics 365 Product version:    [10.0.45](https://learn.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-45) <br>	 App build: 10.0.2345	  | No | 10.0.43.20250617

Release notes for other models included in the product:
- [DXC License Manager](../LMG/Release-notes.md#dxc-license-manager)
- [DXC License](../LMG/Release-notes.md#dxc-license)
- [Smart-Send](../SMART-SEND/Release-notes.md)



# Current version

### Release 10.0.44.20251120

DXC Care Services  10.0.44 runs on the following Microsoft releases


Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.44 	  | [What’s new or changed in Dynamics 365 application version 10.0.44](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44)

#### Build 10.0.44.202511201

Release date: 25 November 2025

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
24425|Billing Journal should search and populate the Vendor account when processing a client refund  for a customer account| Billing Journal should populate the "vendor" account for a customer when a refund is processed
24391|Client refund proposal function is  greyed out  for type organisation |allow client refund process to be initiated for customer type organisation
24424|GST duplication on Reversal transaction part of the Billing adjustment proposal|If a Billing Journal is set to "no" for includes GST in Journal Amounts, the Billing adjustment proposal will not add GST as an additional amount within the Journal


# Previous version(s)
### Release 10.0.44.20251119
#### Build 10.0.44.202511193

Release date: 19 November 2025

<ins>Features</ins>

Number	  | Name	          | Description
:--       |:--              |:--
24012     | Services Australia API integration core  | Includes the core infrastructure for Services Australia API integration in FinOps. The solution includes the PRODA authentication solution, setup forms for Services Australia integration parameters, an enhanced telemetry view, and an API raw response viewer.  
24013 | Services Australia API integration support at home | Includes Services Australia support at home APIs integration functionality. All supported APIs have been certified by Services Australia. Included APIs: Budgets, Care recipient individual contribution, Entry and departure events, Oxygen supplements, Enteral feeding supplements, Invoices, Claims and Payment statements. 

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
24391 | Client refund proposal function is  greyed out  for type organization | Enable client refund proposal for providers that use brokers that are set as type organisation





### Release 10.0.43.20251006

DXC Care Services  10.0.43 runs on the following Microsoft releases


Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.43 	  | [What’s new or changed in Dynamics 365 application version 10.0.43](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-43)
Microsoft Dynamics 365 application	| 10.0.44 	  | [What’s new or changed in Dynamics 365 application version 10.0.44](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44)
Microsoft Dynamics 365 application	| 10.0.45 	  | [What’s new or changed in Dynamics 365 application version 10.0.45](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-45)

#### Build 10.0.43.202510061

Release date: 6 October 2025

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
24232     | Billing statement  | Unable to generate and print **Billing Statement** for large number of customers in single batch

### Release 10.0.43.20250617

#### Build 10.0.43.202506173

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
23045|Funding Journal not filtering correct Funding Code|updated selection criteria so the correct description is pulled through when the same funding code is used 
22985|update to unique Key for funding code |Allows  the same funding code to be used with a different billing account name; previously, this was unavailable
23033|General Ledger Journal affected by Care Services deployment|corrected view issue in standard General Journal
23016|Service Entry Validations Enhancement|updated reference for a small group of statements
22986|Smart send requirements are not present for the Care Services billing Statement|updates to Smart Send extensions for Care Services
22653|Client refund proposal is not filtering transactions based on the selected accommodation payment ID|The form will filter on the accommodation payment ID and service code


<ins>New features</ins>

Number	  | Name	          | Description
:--       |:--              |:--
23016|Service Entry Validations Enhancement|removed limitations that would normally restrict service entry types, enhancing integration with third-party systems 
22989|Care Services Statement can display different  Organisation address|New functionality is added to the Care services parameters page ( Care services >Setup >Care services parameters) that allows an organisation to display a different organisational address on their statements
22763|Client Refund Proposal|added toggle to allow for all open transactions to be displayed 
23129|Client Refund Proposal Journal description field should populate from billing code| The source for the population of the description text for the refund journal will include the description on the billing code that has been used for the refund journal.

### Release 10.0.42.20250509
#### Build 10.0.42.202505091
