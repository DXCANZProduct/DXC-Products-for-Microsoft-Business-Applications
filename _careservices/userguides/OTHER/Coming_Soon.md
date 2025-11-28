---
# required metadata

title: Care Services
description: DXC Care Services - Coming Soon
author: PMusumeci
manager: Pontus Ek
ms.date: 2025-11-05
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  Pending Release, Coming Soon, Updates, New
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Care Services
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-11-05
ms.dyn365.ops.version: D365
---

# 	Coming Soon
This document describes the features that are either pending or planned in upcoming releases

# Current version

<ins>Bug fixes</ins>

Number	  	| Name	  | Description
:--       	|:--              |:--
24425|Billing Journal should search and populate the Vendor account when processing a client refund  for a customer account| Billing Journal should populate the "vendor" account for a customer when a refund is processed
24391|Client refund proposal function is  greyed out  for type organisation |allow client refund process to be initiated for customer type organisation
24424|GST duplication on Reversal transaction part of the Billing adjustment proposal|If a Billing Journal is set to "no" for includes GST in Journal Amounts, the Billing adjustment proposal will not add GST as an additional amount within the Journal


<ins>New features</ins>

Number	  	| Name	  | Description
:--       	|:--              |:--
23179|exception report for billing analysis|Introduction of Billing exception report.
23180|Remove Automatically Populating Bill To Dates, allow Varied Dates|Allows varied dates to be populated  as the "Bill To date", instead of the end date of the billing schedule.  Caters for different types of fees that can be charged beyond the resident’s departure date.
23181|Report on vacant units and their service charges|Addition of fields and new Billing Proposal option for Vacant units
23176|Default the customer method of payment|Add ability to set a Default  method of payment as a parameter that is mapped back to a customer 
23187|Modifications to Service Entries|Additional fields added to Service entries to manage departure of resident villages
23186|Increase information available on the aged debtors report|Additional field and filters added to the Aged Debtors Report
23185|Resident leave recording and billing adjustments|
23184|Billing Schedule Workflow|Added ability for Workflow on the Billing Schedule 
23183|Automate billing journal generation|Allow for Automatic billing journal generation under varied selectable circumstances
23182|Add Workflow to Billing journal|Added ability for Workflow on the Billing journal

