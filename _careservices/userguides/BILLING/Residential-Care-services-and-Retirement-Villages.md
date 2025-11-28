
---
layout: product-content
header: Care Services
toc: true
---

# Residential Care Services and Retirement Villages
Manual journals can be entered or imported into the system.
-   Journals can be generated from the billing schedules by running the Billing journal proposal. The proposal utilises the Billing schedule to automatically generate transactions up to the selected end date.
-   Fees can be split to be paid by different parties, such as family members or third-party organisations.

### Billing journal proposals

Navigate to: **Care services >  Billing > Journals > Billing journal**

-   The billing journal proposal end date controls the billing being generated.
-   If the client has not been billed before, then the billing will be generated from the start day on the billing schedule to the end date on the billing proposal.
-   If the client has been billed before, then there will be a ‘Last run date’ on the billing schedule line. The billing proposal will generate fees from the day after the ‘Last run date’ to the end date on the billing proposal.

-   There are multiple billing proposal options:

|  **Propposal Type**  | **Description** | 
|:---|:---|   
| **Billing journal proposal**|used to generate billing up to a specified date for a specified client(s) or service(s) from the billing schedule lines.|
|    **Consolidate journal lines**|used to combine lines when there are multiple journal lines in the same journal for the same customer, billing code & service code.|
|    **Billing journal adjustment proposal**|used to propose adjustments where there has been a change, such as a Departure or a rate change, that requires billing to be reversed and re-charged.|
|    **Accommodation payment proposal**|used to charge unpaid interest and DAPs or DACs related to an accommodation payment.|
|    **Interest payable to client proposal**|used to calculate interest payable to a departed client with an accommodation payment that has not yet been refunded.|
|    **DMF/CRF proposal** |used to charge the deferred management and capital refurbishment fees for a retirement living lump sum payment.|
|    **Exceeded leave adjustment proposal**|used to calculate any fees due to leave taken exceeding the Department of Health caps.|


![Billing_Journal_proposal_options](../IMAGES/Billing_Journal_proposal_options.png)

*Billing Journal proposal options*

### Generate Billing journal proposal

Navigate to: **Care services >  Billing > Journals > Billing journal**

1.  Click on **New** to create a new billing journal.
2.  Select the relevant billing journal from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Go to Billing proposal options,  Billing journal proposal.
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
9.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
10. Click on **Filter**
11. Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
12. Click **OK**
13. *If required, set up the job to run in the background. Select Batch processing to Yes.*
14. *Click on Recurrence*
15. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
16. *Click OK to close the Recurrence form.*
17. *Click OK to add the job to the batch queue.*
18. The relevant lines will be proposed in the billing journal.

### Review and post the Billing journal

Navigate to: **Care services >  Billing > Journals > Billing journal**

1.  The billing journal list will show journals that have not been posted.
2.  Select ‘All’ or ‘Posted’ in the ‘Show’ drop-down menu to view posted journals.
3.  Select the ‘Show user-created only’ to show journals you have created.
4.  Select the relevant journal to review.
5.  Click on ‘Journal batch number’ or **Lines** to open the billing journal.
6.  Review the details and then click **Post** to post the journal.

### Third-party billing

Navigate to: **Care services >  All Customers >  Invoice >  Billing  schedule**

1.  Select the line for the fee paid by a third party.
2.  Click on **Billing invoicee**
3.  Click on **Edit**
4.  Select the relevant third party in the customer account (Refer to the Customer Management section for instructions on how to add customers)
5.  Propose the billing journal. The transactions will be posted to the third-party customer account.

**![Billing-Invoice–Third-Party](../IMAGES/Billing-Invoice–Third-Party.png)**

*Billing invoice – Third Party*

### Split billing

Navigate to: **Care services >  All Customers >  Invoice >  Billing  schedule**

1.  Select the line for the fee to be paid by multiple parties.
2.  Click on **Billing invoicee**
3.  Click on **Edit**
4.  Select the first customer account and the percentage rate.
5.  Click on **New** to create a new line, populate the second customer account, copy the accommodation payment reference from line 1 and the percentage rate.
6.  Note that the total percentage must be 100.

![Billing-Invoice–Split-Billing](../IMAGES/Billing-Invoice–Split-Billing.png)

*Billing invoice - Split billing*

### Consolidate journal lines

The consolidation process is used when there are multiple journal lines in the same journal for the same customer, billing code & service code to combine the lines.

Navigate to: **Care services >  Billing > Journals > Billing journal > Lines**

1.  Go to Billing proposal options,  Billing journal proposal.
2.  Select **Consolidate journal lines**
3.  Click **OK** to consolidate the relevant lines.

### Billing schedule and rate adjustments

-   Billing schedule adjustments, such as adding or ending fees and changing billing rates, are managed via the client billing schedule.
-   Global rate updates, such as the  Basic Daily Care fee, will not require a separate update for each client. The rate will be automatically updated for the relevant clients.

Navigate to: **Care services >  All Customers >  Invoice >  Billing  schedule**

1.  Select the line for the fee to be adjusted.
2.  Populate the end date if the fee is no longer billed. Leave it blank if the fee is still applicable.
3.  To update the billing rate, click on **Billing rates**
4.  Populate an end date on the existing rate.
5.  Click **New** to create a new line.
6.  Populate the new start date and new amount.
7.  Click **Save** and close the Billing rates form.
8.  The **‘Adjustment required’** flag will be set to Y when the fee has been billed in advance (‘Last run date’ is after the start date of the new rate)

![New-billing-rate](../IMAGES/New-billing-rate.png)

*New billing rate*

![Adjustment-required-flag](../IMAGES/Adjustment-required-flag.png)

*Adjustment required flag*

### Billing journal adjustment proposal

Billing adjustments are run whenever a client has billing that is required to be reversed and possibly re-billed. Examples of this are when a client:

-   has been billed in advance, and then the rate has been changed.
-   has been billed in advance and then departs.
-   has been billed in advance, and after payment of the accommodation payment lump sum, requests for fees to be drawn down instead.

Navigate to: **Care services >  Billing > Journals > Billing journal > Lines**

1.  Go to **Billing proposal options**.
2.  Select **Billing journal adjustment proposal**
3.  Populate the journal posting date.
4.  Populate the end date.
5.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
6.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
7.  Click on **Filter**
8.  Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
9.  Click **OK**
10. *If required, set up the job to run in the background. Select Batch processing to Yes*
11. *Click on Recurrence*
12. *The default value is for the job to run once (End after:1). If it is a requirement for the job to run at a regular interval, then set up the required recurrence pattern.*
13. *Click OK to close the Recurrence form.*
14. *Click OK to add the job to the batch queue.*
15. The total fee billed in advance will be reversed.
    There will be two new lines proposed.
    - One line will be for the relevant days on the old billing rate.
    - The second line will be for the relevant days on the new billing rate.

### Billing Capping Limits

-   Capping limits are the amounts specified by the government as the maximum annual or lifetime amount that can be charged of a particular type of fee, such as means-tested fees or income-tested fees.
-   If the *allow charge beyond capping limits* is set to yes, then the billing will continue even if the cap has been reached.
-   When the parameter is set to No, the billing will end when the capping limit has been reached.
-   Prior to generating the billing journal, ensure the capping limit setup has been completed for the client (Path: **Care services > All Customers > Set up > Capping limits setup** )
-   The client capping calculation periodic job updates the client capping limit setup after posting the journal.

Navigate to: **Care services >  Billing > Journals > Billing journal > Lines**

1.  Go to Billing proposal options and select **Billing journal proposal** from the drop-down menu
2.  Populate the journal posting date.
3.  Populate the end date.
4.  Select *Include departed clients* or *Departed clients only* if required.
5.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
6.  Click on **Filter**
7.  Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
8.  The capped amount will be proposed when the annual or lifetime cap has been reached.
9.  Validate and post the journal.

