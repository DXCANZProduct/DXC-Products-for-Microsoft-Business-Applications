---
# required metadata

title: DXC Care services 
Description: Care services Accommodation Payments
author: Peter Musumeci 
Manager: Pontus Ek
ms.date: 2025-03-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci 

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-03-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accommodation Payments

Before generating Accommodation payment transactions, ensure the Accommodation payment setup has been completed for the client (Path: **Care services > All Customers > Invoice > Set up > Accommodation payment**)

### Accommodation payment lump sum invoice

Navigate to: **Care services > Billing > Journals > Billing journal **

1.  Click on **New** to create a new billing journal.
2.  Select the relevant *accommodation payment lump sum invoice* journal from the drop-down menu
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Populate the date for the lump sum invoice.
6.  Select the client account.
7.  Select the accommodation payment Billing account name.
8.  Select the relevant service code.
9.  Select the billing code for accommodation payment lump sum.
10. Select the client’s accommodation payment id.
11. Populate start date and end date.
12. Leave the Qty/Days as 1.00
13. Populate the lump sum amount in the Rate field.
14. Validate and post the journal.

### Daily Payments (DAP/DAC) or unpaid interest drawn down from RAD/RAC

Daily accommodation payments or unpaid interest amounts can be drawn down from the lump sum balance.

Navigate to: **Care services  All customers  Invoice Accommodation payment**

1.  Change the **Billing account name** on the accommodation payment line to the relevant accommodation payment billing account name.
2.  When the lump sum invoice has been fully or partially paid, the DAP/DAC and unpaid interest amounts will be drawn down from the lump sum, reducing the refundable balance.
3.  If the lump sum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.

### Fees drawn down from RAD/RAC

Fees can be drawn down from the lump sum balance.

Navigate to: **Care services  All customers  Invoice Billing Schedule**

1.  Select the fee to be drawn down from the accommodation payment lump sum.
2.  Click on **Billing invoicee**
3.  Change the **Billing account name** to the relevant accommodation payment billing account name.
4.  When the lump sum invoice has been fully or partially paid, the fee will be drawn down from the lump sum, reducing the refundable balance.
5.  If the lump sum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.
6.  Follow the steps in the **Billing journal proposal** section to generate the transactions.

![](media/3e511a525ae57fe6e9395bbdd31dbfa8.png)

*Change Billing account name for fee to be drawn down from the accommodation payment.*

### Adjustments to Fees drawn down from RAD/RAC

Clients may request fees billed in advance to be drawn down from the accommodation payment lump sum when it has been paid.

Navigate to: **Care services  All customers  Invoice Billing Schedule**

1.  Select the fee to be drawn down from the accommodation payment lump sum.
2.  Populate an **End date** and **Bill to date** for the day before the lump sum receipt.
3.  Create a new line for the same fee with a start date the day the lump sum was paid.
4.  Go to **Billing Invoicee**
5.  Change the Billing account name to the accommodation payment type.
6.  Follow the steps in the **Billing journal adjustment section** to propose the adjustments.
7.  The fees billed in advance will be reversed and two new lines generated, one for the fees billed up to the date of receipt and the second line for the drawn downs.

### Managing changes to the accommodation payments

-   Client’s DAC amount is regularly reviewed, and the amounts may require adjustments.
-   DAC assessed amounts will automatically reduce the amount of accommodation supplement in the Funding schedule.
-   The client may decide to change the payment method (e.g. from lump sum to Combination or from DAP/DAC to Combination etc)
-   These adjustments are managed by adding a new accommodation payment line with the effective date and new values.

Navigate to: **Care services  All customers  Invoice Accommodation payment**

1.  Populate the relevant **end date** on the current accommodation payment line.
2.  Click on **Add line** to add a new line.
3.  If the **payment method** is changed, select the relevant payment method.
4.  Update the **agreed lump sum** if required.
5.  If the **DAC amount** is changed, update the **Assessed amount.**
6.  Click on **Save** to save the changes on the new line.
7.  Click on **Accommodation Payment calculation** to update the accommodation payment form details.
8.  The adjustments will be proposed in the subsequent accommodation payment billing proposal.

### Accommodation payment billing proposal

Navigate to: **Care services  Billing  Journals  Billing Journals**

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
19. There will be separate lines generated for ongoing interest amounts (DAP/DAC) and interest on unpaid lump sum.
20. The interest rate used for the calculations is the agreed interest rate on the client’s accommodation payment setup.
21. If any adjustments are required, the original amount will be reversed, and new line(s) proposed with the relevant rates and amounts.
22. Validate and post the journal.

### Interest payable to client proposal

-   Interest payable will be proposed if the lump sum is not refunded within the legislative time frame following the departure of a client.
-   The base interest rate is used in the calculations for the first 14 days after departure.
-   The Max permissible interest rate (MPIR) will be applicable in the calculations 14 days after departure.
-   If the reason for leaving is deceased, then the base rate is used until the Probate/Admin letter is received. The Probate/Admin letter date is populated in the client service entry when the letter is received.
-   The MPIR will be applicable 14 days after the Probate/Admin letter date.

Navigate to: **Care services  Billing  Journals  Billing Journals**

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

Navigate to: **Care services  Billing  Journals  Billing Journals**

1.  Click on New to create a new billing journal.
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

# Collection letters

-   The collection letter sequence setup allows for a different setup for non-deceased vs deceased Residential Care services residents and Community care clients.
-   The required sequence for residential Care services vs community care clients is specified on each billing account name.
-   To generate the collection letter and email, ensure the client address or email has the purpose ‘Collection letter note’.
-   If required, the logo from another legal entity can be used when creating the collection letter.

### Collection letters – Residential Care services

Navigate to: Credit and collections Collection letter**

1.  Select **‘Create Residential care collection letters’**.
2.  Populate the collection letter date.
3.  Select the billing account name and legal entity for branding.
4.  Click on Filter to specify customer or other criteria if required.
5.  Click on Ok to create the residential care collection letters.
6.  Go to **‘Review and process collection letters’**.
7.  Filter on Collection letter type = Residential care.
8.  Validate the collection letter code.
9.  To print the selected letter, go to **PrintCollection letter note.**
10. Validate the details on the letter and email.
11. Go to ‘**Post collection letters’.**
12. Populate the posting date and click on Filter to specify any additional criteria if required.
13. Click OK to update the collection letter status to posted.
14. Repeat the process, the next collection letter code will be generated as per setup in the relevant collection letter sequence.

### Collection letters – Community care

Navigate to: Credit and collections Collection letter**

1.  Select **‘Create community care collection letters’**.
2.  Populate the collection letter date.
3.  Select the billing account name and legal entity for branding.
4.  Click on Filter to specify customer or other criteria if required.
5.  Click on Ok to create the community care collection letters.
6.  Go to **‘Review and process collection letters’**.
7.  Filter on Collection letter type = community care.
8.  Validate the collection letter code.
9.  To print the selected letter, go to **PrintCollection letter note.**
10. Validate the details on the letter and email.
11. Go to ‘**Post collection letters’.**
12. Populate the posting date and click on Filter to specify any additional criteria if required.
13. Click OK to update the collection letter status to posted.
14. Repeat the process, the next collection letter code will be generated as per setup in the relevant collection letter sequence.

# Receipts

-   Payments of agreed lump sum or other fees and charges are posted in Receipt journals.
-   Direct Debit payments can be proposed in receipt journals and the relevant bank file generated. Ensure the client bank account and method of payment is setup to be included in the Direct Debit proposals.
-   Clients may also have a direct debit limit or a Pre-set direct debit amount.

### Accommodation payment lump sum receipt

Navigate to: **Care services  Journals Receipt journal**

1.  Click on **New** to create a new receipt journal.
2.  Select the **relevant lump sum receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Populate the date of receipt.
6.  Select Client account.
7.  Click **Save**
8.  Click on **Settle transactions**
9.  Select the lump sum invoice and select the **Mark** check box
10. If the amount **is not paid in full**, then populate the relevant amount paid in the ‘**Amount to settle’.**
11. Click **OK**
12. Populate a Description
13. Select Billing account name for accommodation payment.
14. Ensure the client’s accommodation payment if is populated.
15. Ensure the Bank offset account is populated.
16. Validate and post the journal.

### Manual receipt

Navigate to: **Care services  Journals Receipt journal**

1.  Click on **New** to create a new receipt journal.
2.  Select the **relevant receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Populate the date of receipt.
6.  Select Client account.
7.  Click **Save**
8.  Click on **Settle transactions**
9.  Select the relevant invoice(s) and select the Mark check box.
10. Click **OK**
11. Populate a Description
12. Select Billing account name.
13. Ensure the Bank offset account is populated.
14. Validate and post the journal.

### Direct Debit limits and pre-set amounts

-   Clients can request a direct debit limit where the amount proposed will be no more than the limit setup or the total of their invoices if that amount is lower.
-   Clients can request pre-set direct debit amount where the pre-set amount is always proposed.
-   The bank account and method of payment must be setup.

Navigate to: **Care services  All customers**

1.  Click on **Account** to open the customer form.
2.  Click on **Edit**
3.  Navigate to Payment defaults.
4.  Populate the ‘**Direct debit limit’.**

    **OR**

5.  If the client has requested a pre-set amount, then set the ‘**Enable pre-set direct debit amount’** to Yes.
6.  Select the **Service code** for the direct debit.
7.  Populate the **Pre-set direct debit amount.**
8.  Click **Save** and close the form.

### Direct Debit Proposal

-   Ensure the clients’ method of payment and bank accounts have been setup.
-   Setup the direct debit limits or Pre-set direct debit amounts.

Navigate to: **Care services  Journals Receipt journal**

1.  Click on **New** to create a new receipt journal.
2.  Select the **relevant receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Go to payment proposal  **Create payment proposal.**
6.  Populate date range if required to exclude open invoices.
7.  Select the ‘Apply Direct debit limits’ **OR** ‘Apply pre-set direct debit amount and limit’.
8.  Click on **Filter** to select Customer account, service code, method of payment.
9.  Select the **Billing account name for billing** to exclude accommodation payment drawn downs.
10. Click **OK**
11. Populate a Description
12. Select Billing account name.
13. Ensure the Bank offset account is populated.
14. Click on **Functions  Generate payments.**
15. Select Method of payment, populate file name and select bank account.
16. Click **OK** and **OK** for the reporting form.
17. The bank file will be generated and can be uploaded to the bank.
18. Validate and post the journal when the bank file has been successfully uploaded to the bank.

# Funding

-   Funding is the most common income for Care services providers.
-   Transactions related to funding will not appear in the Customer transactions form because they are not related to the customer balance.
-   Funding claims for Community and Disability service providers can be imported via the data migration framework.
-   The funding claims for residential Care services providers will be generated from the residents’ funding schedules.
-   The Funding claim form will group all relevant funding claims to generate the funding claim file.

### Generate funding claims

Navigate to: **Care services  Funding  Generate Funding Claims**

1.  Populate the End date.
2.  Click on **Filter**
3.  Specify the required criteria for generating the funding claims (Service code or client account)
4.  Click **OK**
5.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
6.  *Click on Recurrence*
7.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
8.  *Click OK to close the Recurrence form.*
9.  *Click OK to add the job to the batch queue.*
10. The relevant funding claims will be generated with the Document status = Open

### Generate funding claim form

Navigate to: **Care services  Funding  Funding Claim form**

1.  Click on **New funding claim form**
2.  Select Billing account name.
3.  Click on **Filter**
4.  Specify the required criteria for generating the funding claim form (End date, client account)
5.  Click **OK**
6.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
7.  *Click on Recurrence*
8.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
9.  *Click OK to close the Recurrence form.*
10. *Click OK to add the job to the batch queue.*
11. The funding claim form will be generated with all the relevant funding claims.
12. Populate the description, claim year, and claim month.

### Generate funding claim form file

Navigate to: **Care services  Funding  Funding Claim form**

1.  Select the relevant funding claim form.
2.  Validate the data on the funding claim form lines.
3.  Click on **Generate funding claim form file**
4.  Click **OK**
5.  The file will be generated for the relevant billing account type.

### Generate funding journal

Navigate to: **Care services  Funding  Funding Claim form**

**OR**

****Care services  Funding  Generate funding journals**

1.  Select the relevant funding claim form.
2.  Validate the data on the funding claim form lines.
3.  Click on **Generate funding journal**
4.  Populate Transaction date.
5.  Click **OK**
6.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
7.  *Click on Recurrence*
8.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
9.  *Click OK to close the Recurrence form.*
10. *Click OK to add the job to the batch queue.*
11. The funding journal will be generated.

### Review and post funding journal

Navigate to: **Care services  Funding  Journals  Funding journal**

1.  Select the relevant funding journal.
2.  Click on **Lines**
3.  Validate the data on the funding journal lines.
4.  Click on **Post** to post the journal.

### Import funding claim payment statement

Payment statements must be downloaded from PRODA Care services Online Services (in a CSV format)

Navigate to: **Care services  Funding  Funding claim payment statement**

1.  Click on **New**
2.  Select **Billing account name**
3.  Click on **Import statement**
4.  Click on **Browse** to browse and select the required payment statement file for import.
5.  Click **Upload**
6.  Click **OK**
7.  Click on the **‘Refresh**’ button in the top right corner to refresh the form.
8.  The statement lines will display.

![](media/e906818ecc1787da4443d13436f84eea.png)

*Funding payment statement*

### Funding reconciliation

Navigate to: **Care services  Funding  Funding reconciliation**

1.  Click on **New**
2.  Select **Billing account name**
3.  Select **Funding payment statement id**
4.  Populate the **Department service ID.**
5.  Populate the **To date.**
6.  Click **OK**
7.  Select **Worksheet** to open the Funding Reconciliation worksheet.
8.  The worksheet is divided into three sections:
    -   **Unmatched transactions**

        The unmatched transactions are vertically split between ledger transactions originating from the Funding journals (left) and imported transactions from the imported statement (right).

    -   **Matched transactions**

        The matched transactions section displays all transactions that have been manually matched or matched via the matching rules.

    -   **Accepted transactions.**

        The accepted transactions section displays all transactions that have been accepted. These are payments on the payment statement that were not on the claim.

9.  Select **Run matching rules** to match Funding claims with the Statement line.
10. Transactions that were matched successfully will be transferred to the “Matched transactions” section.
11. Select **Match** to manually match funding claims with statement lines. Any variances in the amounts will automatically create adjustment transactions.
12. Select **Accept selected** on the **Funding claims** to accept that a funding claim will not be paid. There will be an automatic adjustment transaction created.
13. Select **Accept selected** on the **Statement lines** to accept a payment that was not on the Funding claim. There will be an automatic adjustment transaction created.
14. Select **Add Statement Line** to add an amount that has been paid but was not on the Funding Claim. There will be an automatic adjustment transaction created.
15. Any unmatched funding claims will carry across to the subsequent month’s funding claim and will be available for matching when the payment has been received on the payment statement.
16. Close the worksheet when all relevant transactions have been matched.
17. Select **Post and Reconcile** to generate a Funding Reconciliation Journal

![](media/9c540f859f9fe6de452d9872844a3b40.png)

*Funding reconciliation worksheet*

### Review and post Funding reconciliation journal

Navigate to: **Care services  Funding  Journals  Funding reconciliation journal**

1.  Select the relevant journal.
2.  Click on **Lines**
3.  The journal lines from the matched transactions in the Funding reconciliation worksheet will be generated.
4.  There will be journal lines for the adjustment transactions in the Funding reconciliation worksheet.
5.  Validate and post the journal.

# Refunds, transfers and departures

-   Residents can move from one room to another within the same facility in a Bed transfer.
-   Community Care Clients can transfer for respite or permanent care at an Care services facility.
-   Residents can transfer from one facility to another.
-   Residents can depart from one or multiple facilities or services.
-   Refunds of fees are processed for credits or on departure for fees that were paid in advance
-   Part refunds of accommodation payments are processed for movements to a room with a different price or as agreed with the resident
-   Full refunds are processed on departure or transfer to another facility

### Refund of fees

Navigate to: **Care services  All customers  Collect  Client refund proposal**

1.  Select ‘Partial refund’ in the Refund type and click Ok
2.  Select the credit invoice(s) by ticking the ‘Mark’ check box
3.  Click on Create journal
4.  Go to Journals Billing Journal and select the automatically created journal
5.  Validate and post the journal.
6.  The amount has now been transferred to the resident vendor account

### Bed transfer – transfer within the same facility (service)

Navigate to: **Care services  All customers  **Care services  Service entries**

1.  Open the service entry the resident is departing from.
2.  Navigate to the **Transfer** section.
3.  Click **Add**
4.  Select the new bed from the **‘Transfer to’** drop-down menu.
5.  Populate the ‘**Transfer date’**
6.  Populate a **‘Transfer description’**
7.  Click **OK**
8.  The transfer line will be generated.

    ![](media/379b33a7c29199e15166bc6614410731.png)

    *Transfer*

9.  If required, **process a refund** if the new bed price is less than the original one or another invoice if the bed price is more than the original (subject to reason for the bed move)
10. Go to **Invoice  Accommodation Payment**
11. Populate an **End date** on the line.
12. Click **Save** to save the details.
13. Click on **Add line** to add a new line.
14. Populate Effective date and new **‘Agreed amount’** and **‘Agreed lump sum’.**
15. **Process the difference in bed price:**
16. Go to Care services Billing  Billing journal.
17. Create a new accommodation payment lump sum invoice journal.
18. Populate the date and select the client account.
19. Select the billing account name for the accommodation payment refund
20. Select the Service code.
21. Select the Billing Code for the partial refund (as specified in care services parameters  journals  Partial refund billing code) OR the lump sum invoice billing code for the invoice
22. Populate the start and end dates.
23. Add the refund amount credit in the Rate (e.g., -100 000) or additional invoice amount in debit
24. Validate and post the journal.
25. **Refund via All Customers Collect Client refund proposal:**
26. Select ‘Partial refund’ in the Refund type and click Ok
27. Select the credit invoice by ticking the ‘Mark’ check box
28. Click on Create journal
29. Go to Journals Billing Journal and select the automatically created journal
30. Validate and post the journal.
31. The refund amount has now been transferred to the resident vendor account

### Transfer to another facility (service)

Navigate to: **Care services  All customers  **Care services  Service entries**

1.  Open the service entry the resident is departing from.
2.  Populate **Departure Date**
3.  Populate **Departure Notice Date**
4.  Select the Transfer **Departure Reason**
5.  Click **Save** and close the form.
6.  Click on **New** to add the new service entry.
7.  Populate the relevant details.
8.  Click **Save** and close the form.
9.  The previous facility home address purpose will be changed to ‘Other’
10. The new facility address details will automatically be created with the purpose = Home

    ![](media/0a1764a721f7f302833526fc38b39f05.png)

*Client addresses*

11. Go to Invoice Accommodation payment.
12. A new **accommodation payment header** has been created for the new facility.
13. Select the new header and click on **Add line**
14. Populate the Agreed amount and Agreed lump sum and other relevant details.
15. Click on **Save** and close the form.
16. **Refund via All Customers Collect Client refund proposal:**
17. Select the accommodation payment id for the service the resident is departing from
18. Select ‘Full refund’ in the refund type
19. Click OK
20. Validate details and then click on Create journal
21. Navigate to the automatically created billing journal
22. Review the details, then validate and post the journal
23. The balance has now been transferred to the resident vendor account
24. Go to ****Care services  Billing Billing Journals**
25. Create a new Accommodation Payment lump sum invoice billing journal.
26. Populate Date, Client account and Billing account name for the accommodation payment.
27. Populate Service code for the **new facility.**
28. Select the Billing code for the accommodation payment lump sum transfers.
29. Select the **new accommodation payment ID.**
30. Populate start and end dates.
31. Populate the agreed lump sum amount.
32. Validate and post the journal.
33. Go to ****Care services  Journals  Receipt journal** and create a new **lump sum receipt** journal.
34. Populate the date, client account and description.
35. Select the service code for the **new facility** and **billing account name** for the accommodation payment.
36. Select the **new accommodation payment ID.**
37. Click on Settle transactions to mark the invoice for the agreed lump sum in the new facility.
38. Select Offset account type = Vendor
39. Select Offset account = The resident vendor account
40. Validate and post the journal.

### Departures

Navigate to: **Care services  All customers  **Care services  Service entries**

1.  Open the service entry the resident is departing from.
2.  Populate **Departure Date**
3.  Populate **Departure Notice Date.** Departure notice date prior to the actual departure date will impact on the Interest Payable calculations.
4.  Select the **Departure Reason**
5.  Select the **Deceased** flag if the client is deceased.
6.  When the probate has been received, populate the **Probate/Admin letter** date.
7.  Click on **Save** and close the form.
8.  Propose the interest payable in the Billing journal (refer to the billing journal section for more information)
9.  Go to ****Care services  All Customers  Invoice  Accommodation Payments**
10. Run the **‘Accommodation payment calculation’** to ensure all balances are updated.
11. **Refund via All Customers Collect Client refund proposal:**
12. Select the accommodation payment id
13. Select ‘Full refund’ in the refund type
14. Click OK
15. Validate details and then click on Create journal
16. Navigate to the automatically created billing journal
17. Review the details, then validate and post the journal
18. The balance has now been transferred to the resident vendor account

### Process the refund in a Vendor payment journal

Navigate to:** **Accounts payable  Payments Vendor payment journal**

1.  Click on New to create a new journal, select the Name and click on Lines to open the journal
2.  Select the vendor account
3.  Click on Save and then Settle transactions
4.  Select the invoice(s) to refund
5.  Click on Generate Payments
6.  Select Method of payment
7.  Select the bank account.
8.  Click OK to generate the bank file
9.  Validate and post the journal.

### Reversing an accommodation payment refund

This process is used to reverse the full refund when a resident has been departed from the service entry. The full refund has been generated, to the point of the refund journal being posted to AP, but not yet paid to the client or their estate.

As the Accommodation Payment has already been fully refunded and cannot be refunded again there needs to be a new Accommodation payment header setup to enable the refund to be processed again later when it is ready

This process will:  
\- reset the accommodation payment record and the liability account  
\- allow the Interest payable to be generated on the new accommodation payment and   
\- allow the new accommodation payment to be refunded when ready.

Navigate to: **Care services  All customers  **Care services  Service entries**

1.  Click on New to create a new service entry
2.  Populate the same details as the original service entry, use the departure date from the original service entry to populate the entry, billing end date and departure date (overlaps are not allowed so the original entry date can’t be used for this purpose)

Navigate to:** ****Care services  All customers  Invoices  Accommodation payments**

1.  Select the new accommodation payment header
2.  Click on Add line
3.  Populate the End date
4.  Add the refundable balance in the agreed amount

Navigate to:** ****Care services Journals  Billing journal**

1.  Create a new lump sum billing journal then click on Lines
2.  Populate the departure date in the ‘Date’ , ‘Start date’ and ‘End date’ fields, select the customer and the **new** accommodation payment id
3.  Populate the refundable balance in the Rate field
4.  Validate and post the journal

Navigate to:** ****Care services Journals  Receipt journal**

1.  Create a new lump sum receipt journal then click on Lines
2.  Populate the departure date in the ‘Date’, ‘Start date’ and ‘End date’ fields, select the customer
3.  Click Save and then Settle transactions
4.  Select the invoice to settle by ticking the Mark checkbox
5.  Click Ok
6.  Change the offset account type to Vendor
7.  Select the resident vendor account
8.  Validate and post the journal

# Schedules, Inquiries and reports

### Daily client revenue

Navigate to: **Care services  inquiries and reports  Daily client revenue**

Generate the enquiry to view a summary of the total daily client revenue from the billing schedule, funding schedule, accommodation payment revenue and DMF revenue.

### In progress billing list

Navigate to: **Care services  inquiries and reports  In progress billing list**

Generate the enquiry for a list of customer billing transactions that have not yet been posted.

### Service concessional/supported daily ratio

Navigate to: **Care services  inquiries and reports  Service concessional/supported daily ratio**

The concessional supported ratios will be updated via the periodic Concessional/Supported ratio calculation job. The form displays the Service number, Threshold, discount (the % reduction of the accommodation supplement) and the actual ratio for each service (facility)

### 
