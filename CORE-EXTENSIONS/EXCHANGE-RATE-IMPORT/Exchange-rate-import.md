---
# required metadata

title: Core Extensions
description: Core Extensions - Exchange rate import
author: Liam Coll
manager: Kym Parker
ms.date: 2021-08-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: ExchangeRateProviderConfiguration
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll
# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
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
