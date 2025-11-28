---
layout: product-content
header: Core Extensions
toc: true
---

# Exchange Rate Import
## Exchange Rate Import Overview

Microsoft Dynamics 365 offers functionality to import exchange rates based on limited sources. The Exchange Rate Import leverages the same standard framework of Microsoft Dynamics 365 but extends functionality to support the following additional sources:
* Reserve Bank of Australia – Free service
* Open Exchange Rates – Paid Subscription

#### Assumptions
* The Core extensions supports only today's date unless otherwise specified. 
* Web Service availability is not guaranteed. The server or URL may be offline.
* Free services are not guaranteed as the service providers may no longer provide them for free.

## Setup
1. Navigate to **General ledger > Currencies > Configure Exchange Rate Providers**.
2. The Key and Value pair will be set by default. This is the RSS feed or the web service URL.

## Process
1. Navigate to **General ledger > Currencies > Import currency exchange rates**.
2. Set the relevant Exchange rate type and your desired Exchange rate provider.
   * The *Import as of* parameter is set to Today’s date by default.
3. If required adjust your parameters based on the supported conditions in the table below.
   * Set up the Batch recurrences for scheduled updates. It is recommended for a daily update.

The following table shows the supported parameters.

|  **Source**  | **Date range support** |  **Create necessary currency pairs** |  **Override existing exhange rates** |  **Prevent import on national holiday** | 
|:---|:---|:---|:---|:---|      
|  **Reserve Bank of Austalia**  | No | Yes | Yes | No |
|  **Open exchange rate**  | Yes | No | Yes | No |

## Data Entities
- General journal entity

## References

1. A white paper is available for extending the framework. [Creating Exchange Rate Providers for Microsoft Dynamics 365](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/financial/create-exchange-rate-providers).
2. [Reserve Bank of Australia](http://www.rba.gov.au/statistics/frequency/exchange-rates.html)
3. [Open Exchange Rates](https://openexchangerates.org/) 
