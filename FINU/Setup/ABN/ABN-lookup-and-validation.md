---
# required metadata

title:[Finance Utilities 
description: Setup - ABN lookup and validation 
author: jdutoit2
manager: Kym Parker
ms.date: 2022-03-04
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXC_ABNValidationProviderTypeTable
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# ABN lookup and validation
The fields as described in the following subsections are available to control the additional functionality for ABN lookup and validation.
> Note: Only applicable to Australia.

## Register for Web API
Companies must register with the Australian Government to use their ABN Lookup Web API - [link](https://abr.business.gov.au/Tools/AbnLookup). <br>
After successful registration, the company will be provided with a security token which will be used in setting up the **Validation providers**.

## Setup ABN validation providers
1. Go to **Organization administration > Setup > Validation providers**.
2. On the Action Pane, select **New** and enter the following details.
   - **Name** - Enter name for ABN validation provider	
   - **Description** - Enter a description for the ABN validation provider
   - **Provider** - Select _Australian Business Number (ABN)_	
   - **Token GUID** - Enter the security token received from the provider	
   - **Max search results** - Enter the applicable result, example 0
   - **Active only** - ABN validation can create Tax exempt numbers. Setting this option to only allow active, will limit the ability to create only Tax exempt numbers that are active

## Setup legal entity
1. Go to **Organization administration > Organizations > Legal entities** and select the applicable legal entity.
2. Use the setup available under **ABN Validation** FastTab to enable and add the security token received from Australian Government to each D365 legal entity.
    - Set **Enabled** to _Yes_.
    - Select the applicable **Provider** from the drop-down as setup in the previous section **ABN validation providers**.
