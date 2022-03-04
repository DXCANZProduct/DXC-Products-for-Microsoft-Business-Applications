---
# required metadata

title: [Finance Utilities ]
description: [Setup - ABN lookup and validation ]
author: [jdutoit2]
manager: Kym Parker
ms.date: 04/03/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [jdutoit2]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
