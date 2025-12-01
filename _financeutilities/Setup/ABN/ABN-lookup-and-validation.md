---
layout: product-content
header: Finance Utilities
toc: true
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
   - **Max search results** - Enter the applicable result, example using 0 doesn't limit the search
   - **Active only** - ABN validation can create Tax exempt numbers. Setting this option to only allow active, will limit the ability to create only Tax exempt numbers that are active. Enabling this option doesn't limit the update functionality, for example where a previously Active ABN changed to Cancelled.

## Setup legal entity
1. Go to **Organization administration > Organizations > Legal entities** and select the applicable legal entity.
2. Use the setup available under **Validation** FastTab, heading **Australia validation** to enable and add the security token received from Australian Government to each D365 legal entity.
    - Set **Enable ABN validation** to _Yes_.
    - Select the applicable **ABN provider** from the drop-down as setup in the previous section **ABN validation providers**.
  
## Processing
See [link](../../Processing/ABN/ABN-lookup-and-validation) for details on processing.
