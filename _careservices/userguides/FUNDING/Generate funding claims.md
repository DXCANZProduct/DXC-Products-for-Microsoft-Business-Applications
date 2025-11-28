---
layout: product-content
header: Care Services
toc: true
---

# Funding

-   Funding is the most common income for Care services providers.
-   Transactions related to funding will not appear in the Customer transactions form because they are not related to the customer's balance.
-   Funding claims for Community and Disability service providers can be imported via the data migration framework.
-   The funding claims for residential Care services providers will be generated from the residents’ funding schedules.
-   The Funding claim form will group all relevant funding claims to generate the funding claim file.

### Generate funding claims

**Path: Care services > Funding > Generate Funding Claims**

1.  Populate the End date.
2.  Click on **<Filter>**
3.  Specify the required criteria for generating the funding claims (Service code or client account)
4.  Click **<OK>**
5.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
6.  *Click on <Recurrence>*
7.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
8.  *Click <OK> to close the Recurrence form.*
9.  *Click <OK> to add the job to the batch queue.*
10. The relevant funding claims will be generated with the Document status = Open
