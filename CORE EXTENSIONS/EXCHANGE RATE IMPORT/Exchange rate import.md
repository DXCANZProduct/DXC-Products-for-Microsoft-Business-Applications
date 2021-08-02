---
# required metadata

title: [Core Extensions]
description: [Core Extensions - Exchange rate import]
author: [Liam Coll]
manager: Kym Parker
ms.date: 02/08/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Core Extensions]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Exchange Rate Import
## Exchange Rate Import Overview

Microsoft Dynamics 365 offers functionality to import exchange rates based on limited sources. The Exchange Rate Import leverages the same standard framework of Microsoft Dynamics 365 but extends functionality to support the following additional sources:
* Reserve Bank of Australia – Free service
* Bank of Canada – Free service
* Open Exchange Rates – Paid Subscription

#### Assumptions
* The Core extensions supports only todays date, unless otherwise specified. 
* Web Service availability is not guaranteed. Server or URL may be offline.
* Free services are not guaranteed as the service providers may no longer provide it for free.

## Setup
1. Navigate to **General ledger > Currencies > Configure Exchange Rate Providers**.
2. The Key and Value pair will be set by default. This is the RSS feed or the web service URL.

## Process
1. Navigate to **General ledger > Currencies > Import currency exchange rates**.
2. Set the Exchange rate type and Exchange rate provider set up.
   * The Import as of parameter is set to Today’s date by default.
   * Setup the Batch recurrences for scheduled updates. It is recommended for a daily update.

The following table shows the supported parameters.

|  **Source**  | **Date range support** |  **Create necessary currency pairs** |  **Override existing exhange rates** |  **Prevent import on national holiday** | 
|:---|:---|:---|:---|:---|      
|  **Reserve Bank of Austalia**  | No | Yes | Yes | No |
|  **Bank of Canada**  | No | Yes | Yes | No |
|  **Open exchange rate**  | Yes | Yes | Yes | No |


## References

1. A white paper is available for extending the framework. [Creating Exchange Rate Providers for Microsoft Dynamics 365](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/financial/create-exchange-rate-providers).
2. [Reserve Bank of Australia](http://www.rba.gov.au/statistics/frequency/exchange-rates.html)
3. [Bank of Canada](https://www.bankofcanada.ca/rates/exchange/)
4. [Open Exchange Rates](https://openexchangerates.org/) 
