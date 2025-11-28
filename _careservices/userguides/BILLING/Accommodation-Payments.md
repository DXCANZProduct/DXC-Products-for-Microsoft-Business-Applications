---
layout: product-content
header: Care Services
toc: true
---

# Accommodation Payments

Before generating Accommodation payment transactions, ensure the Accommodation payment setup has been completed for the client (Path: **Care services > All Customers > Invoice > Set up > Accommodation payment**)

### Accommodation payment lump sum invoice

Navigate to: **Care services > Billing > Journals > Billing journal**

1.  Click on **New** to create a new billing journal.
2.  Select the relevant *accommodation payment lump sum invoice* journal from the drop-down menu
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Populate the date for the lump sum invoice.
6.  Select the client account.
7.  Select the accommodation payment Billing account name.
8.  Select the relevant service code.
9.  Select the billing code for the accommodation payment lump sum.
10. Select the client’s accommodation payment id.
11. Populate start date and end date.
12. Leave the Qty/Days as 1.00
13. Populate the lump sum amount in the Rate field.
14. Validate and post the journal.

### Daily Payments (DAP/DAC) or unpaid interest drawn down from RAD/RAC

Daily accommodation payments or unpaid interest amounts can be drawn down from the lump sum balance.

Navigate to: **Care services > All Customers > Invoice > Set up> Accommodation payment**

1.  Change the **Billing account name** on the accommodation payment line to the relevant accommodation payment billing account name.
2.  When the lump sum invoice has been fully or partially paid, the DAP/DAC and unpaid interest amounts will be drawn down from the lump sum, reducing the refundable balance.
3.  If the lump sum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.

### Fees drawn down from RAD/RAC

Fees can be drawn down from the lump sum balance.

Navigate to: **Care services > All Customers > Invoice > Set up > Billing schedule**

1.  Select the fee to be drawn down from the accommodation payment lump sum.
2.  Click on **Billing invoicee**
3.  Change the **Billing account name** to the relevant accommodation payment billing account name.
4.  When the lump sum invoice has been fully or partially paid, the fee will be drawn down from the lump sum, reducing the refundable balance.
5.  If the lump sum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.
6.  Follow the steps in the **Billing journal proposal** section to generate the transactions.

![Change-Billing-account-name](../IMAGES/Change-Billing-account-name.png)

*Change Billing account name for fee to be drawn down from the accommodation payment.*

### Adjustments to Fees drawn down from RAD/RAC

Care services > All Customers > Invoice > Set up >

Navigate to: **Care services > All Customers > Invoice > Set up > Billing Schedule**

1.  Select the fee to be drawn down from the accommodation payment lump sum.
2.  Populate an **End date** and **Bill to date** for the day before the lump sum receipt.
3.  Create a new line for the same fee with a start date the day the lump sum was paid.
4.  Go to **Billing Invoicee**
5.  Change the Billing account name to the accommodation payment type.
6.  Follow the steps in the **Billing journal adjustment section** to propose the adjustments.
7.  The fees billed in advance will be reversed and two new lines generated, one for the fees billed up to the date of receipt and the second line for the drawdowns.

### Managing changes to the accommodation payments

-   Client’s DAC amount is regularly reviewed, and the amounts may require adjustments.
-   DAC assessed amounts will automatically reduce the amount of accommodation supplement in the Funding schedule.
-   The client may decide to change the payment method (e.g. from lump sum to Combination or from DAP/DAC to Combination etc)
-   These adjustments are managed by adding a new accommodation payment line with the effective date and new values.

Navigate to: **Care services > All Customers > Invoice > Set up > Accommodation payment**

1.  Populate the relevant **end date** on the current accommodation payment line.
2.  Click on **Add line** to add a new line.
3.  If the **payment method** is changed, select the relevant payment method.
4.  Update the **agreed lump sum** if required.
5.  If the **DAC amount** is changed, update the **Assessed amount.**
6.  Click on **Save** to save the changes on the new line.
7.  Click on **Accommodation Payment calculation** to update the accommodation payment form details.
8.  The adjustments will be proposed in the subsequent accommodation payment billing proposal.

### Accommodation payment billing proposal

Navigate to: **Care services > Billing > Journals > Billing journal**

1.  Click on **New** to create a new billing journal.
2.  Select the **relevant billing journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Go to Billing proposal options  **Accommodation Payment proposal.**
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
9.  Select ‘Include ongoing interest’ to include DAP/DAC/Periodic interest calculations.
10. Select ‘Include unpaid lump sum interest’ to include interest calculations on the unpaid lump sum (RAD/RAC)
11. Click on **Filter**
12. Specify the required criteria for generating the billing journals (customer account, Service code)
13. Click **OK**
14. *If required, set up the job to run in the background. Select Batch processing to Yes*
15. *Click on Recurrence*
16. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then set up the required recurrence pattern.*
17. *Click OK to close the Recurrence form.*
18. *Click OK to add the job to the batch queue.*
19. There will be separate lines generated for ongoing interest amounts (DAP/DAC) and interest on an unpaid lump sum.
20. The interest rate used for the calculations is the agreed interest rate on the client’s accommodation payment setup.
21. If any adjustments are required, the original amount will be reversed, and new line(s) proposed with the relevant rates and amounts.
22. Validate and post the journal.

### Interest payable to client proposal

-   Interest payable will be proposed if the lump sum is not refunded within the legislative time frame following the departure of a client.
-   The base interest rate is used in the calculations for the first 14 days after departure.
-   The Max permissible interest rate (MPIR) will be applicable in the calculations 14 days after departure.
-   If the reason for leaving is deceased, then the base rate is used until the Probate/Admin letter is received. The Probate/Admin letter date is populated in the client service entry when the letter is received.
-   The MPIR will be applicable 14 days after the Probate/Admin letter date.

Navigate to: **Care services > Billing > Journals > Billing journal**

1.  Click on New to create a new billing journal.
2.  Select the **relevant billing journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Go to Billing proposal options  **Interest payable to client proposal.**
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Click on **Filter**
9.  Specify the required criteria for generating the billing journals (customer account, Service code)
10. Click **OK**
11. *If required, setup the job to run in the background. Select Batch processing to Yes.*
12. *Click on Recurrence*
13. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
14. *Click OK to close the Recurrence form.*
15. *Click OK to add the job to the batch queue.*
16. The interest payable transactions will be calculated and proposed.
17. There will be two lines if the lump sum has not been refunded within 14 days.
18. The first line will be calculated and proposed using the base rate for 14 days.
19. The second line will be calculated with the Max permissible interest rate (MPIR)
20. Validate and post the journal.

### DMF/CRF proposal

-   In addition to the accommodation charges in retirement villages, the client can also be charged Deferred Management Fees (DMF) and Capital Refurbishment fees (CRF).
-   These can only be defined for the Accommodation payment status “Ingoing contribution”.

Navigate to: **Care services > Billing > Journals > Billing journal**

1.  Click on *New* to create a new billing journal.
2.  Select the relevant billing journal from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on Lines
5.  Go to Billing proposal options  DMF/CRF proposal.
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Select DMF Yes to include DMF transactions
9.  Select CRF Yes to include CRF transactions.
10. Click on **Filter**
11. Specify the required criteria for generating the billing journals (customer account, Service code)
12. Click **OK**
13. *If required, setup the job to run in the background. Select Batch processing to Yes.*
14. *Click on Recurrence*
15. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
16. *Click OK to close the Recurrence form.*
17. *Click OK to add the job to the batch queue.*
18. The relevant lines will be proposed in the journal.
19. The Rate in the journal is calculated based on the rates in Accommodation payment  DMF/CRF Applicable Rates for the applicable period.
20. Validate and post the journal.

