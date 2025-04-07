---
# required metadata

title: DXC Care services 
description: Community and Disability Care
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
ms.author: Liam Coll
ms.search.validFrom: 2025-03-31
ms.dyn365.ops.version: AX 7.0.1
---

# Community and Disability Care

-   Services provided for community and disability clients can be imported manually or via integration as billing transactions in Dynamics 365 FO. Once they have been imported they are available to view or edit on the billing transactions view in the same way as any manually entered or system-generated billing transactions
-   Billing invoices are generated for billing transactions with the same invoice number or if invoice numbers are not allocated then all of the transactions for a particular client and service code will be grouped into a single invoice
-   Billing transactions can also be generated from a billing schedule for any regular recurring fees.
-   The total amount will be generated and posted in a Billing journal.
-   Customer accounts are set up for organisations paying for client service transactions.

### Generate billing transactions

Navigate to: **Care services >  Billing > Generate billing transaction**

1.  **Journal posting date –** Enter the posting date for the transaction
2.  **End date –** Enter the last date to be included in the scheduled billing run, ie. The date you want to bill to.
3.  Click on **Filter** - Use the filter options (Customer account, service code etc.) to select which clients or billing schedule lines will be included. The system will generate billing transactions for all clients where there are billing schedule lines that meet the filter requirements entered, so ensure that these filters allow the selection of only the billing schedule lines that you want to include.
4.  Click **OK** when the filters have all been entered
5.  Click **OK** to start the Generate billing transactions process unless you want to run it in batch processing or set up a recurrence – refer to steps 6 to 10 if this is required.
6.  *If required, set up the job to run in the background. Select Batch processing to Yes.*
7.  *Click on* **Recurrence**
8.  *The default value is for the job to run once (End after: 1) If it is a requirement for the job to run at a regular interval, then set up the required recurrence pattern.*
9.  *Click* **OK** *to close the Recurrence form.*
10. *Click* **OK** *to add the job to the batch queue.*

### Manually Enter billing transactions

Navigate to: **Care services >  Billing > Billing transactions**

1.  Select **New billing transaction,** a pop-up window will be displayed
2.  **Customer account –** Enter the customer account that is responsible for paying the invoice, this may be the client or a third party.
3.  **Client account –** Enter the Customer account for the client who received the service or item
4.  **Billing code –** Enter the Billing code required for the service or item to be billed
5.  **Start date –** Enter the date the service being billed for started to be provided or if it is an ongoing service enter the first day to be billed, usually the next day after the last date that has previously been billed. eg. If it is overnight accommodation enter the date of arrival here or if it is ongoing accommodation enter the first day to be billed. For items enter the date the item(s) was provided.
6.  **End date –** Enter the date the service being billed for ceased to be provided or the last day to be billed if it is an ongoing service. Eg. If it is overnight accommodation enter the departure date or if it is ongoing accommodation enter the last day to be billed. For items enter the date the item(s) was provided.
7.  **Rate –** Enter the per quantity rate
8.  **Quantity –** Enter the quantity to be billed
9.  **Amount –** The system will calculate the amount based on the rate and quantity
10. **Description** – The system will auto-populate the description from the billing code, it can then be edited. The description is what will appear as the description on the transactions line of the customer invoice.
11. Select **OK** then **Refresh**
12. Open the billing transaction by clicking on the **Billing transaction id**
13. **Invoice number –** If this transaction is to be added with other transactions that have a specific invoice number add the invoice number. If this transaction will be invoiced on its own or other transactions to be included on an invoice do not include an invoice number (ie. The invoice number will be system generated) leave the invoice number blank.
14. **Transaction type** – Only Billing and Adjustment are relevant to Community or Disability care. Billing is used for standard transactions, however,r if a transaction is an adjustment that is related to previous transactions and organisation policy is to identify these separately, the adjustment option can be selected.
15. **Provided by** – Enter the name of the person who provided the service if this is required
16. **Billing account name** – The system will default a Billing account name based on the settings, however, if this is not correct select the correct Billing account name.
17. **External funding code** – Select the external funding code if there is a likelihood that this transaction may later be converted to a funding claim using the Funder switch function
18. **Service code** – if the client has a service entry this will default to the current service entry, however, if there is no service entry or the service was provided by a different service code then this should be entered or edited.
19. **Client Reference** – Enter if a client reference number is required for the invoice or other reasons
20. **Method of payment** – Enter the method of payment only if it is required to be different from any other billing transactions for the customer or from their customer account. Any billing transactions with different Methods of payment will generate separate invoices
21. **Financial dimensions** – Enter the financial dimensions (cost centres etc.) for the control or debtor account part of the transaction. These do not have to be the same as the Offset dimensions but usually are.
22. **Offset dimensions** – Enter the financial dimensions (cost centres etc.) for the revenue account part of the transaction. These do not have to be the same as the Financial dimension but usually are.

### View billing transactions

Navigate to: ** **Care services >  Billing > Billing transactions**

1.  Billing transactions where the document status is **‘Open’** will display. Open status means they have not yet been included in a billing invoice.
2.  Select **Show all** to view all billing transactions if required.
3.  Ensure the correct customer number is selected if there is a customer organisation paying for the services provided. The client account is selected for the client who received the services.
4.  The following document status determines the status of the billing transactions.
    1.  **Open** – New Billing transaction
    2.  **Billing Invoice** – The billing transaction has been generated in a billing invoice. If the invoice is deleted the billing transaction status will be set back to Open.
    3.  **Billing journal** - There has been a billing journal generated from the billing invoice. Once the billing journal has been posted the billing invoice cannot be deleted.

### Edit billing transactions

Navigate to: **Care services >  Billing > Billing transactions**

1.  Only Billing transactions where the document status is **‘Open’** can be edited. Open status means they have not yet been included in a billing invoice.
2.  Open the billing transaction by clicking on the **Billing transaction id**
3.  **Billing transaction id –** is not editable
4.  **Invoice number –** If this transaction is to be added with other transactions that have a specific invoice number add the invoice number. If this transaction will be invoiced on its own or other transactions to be included on an invoice do not include an invoice number (ie. The invoice number will be system generated) leave the invoice number blank.
5.  **Transaction type** – Only Billing and Adjustment are relevant to Community or Disability care. Billing is used for standard transactions, however,r if a transaction is an adjustment that is related to previous transactions and organisation policy is to identify these separately, the adjustment option can be selected.
6.  **Customer account –** Is not editable. Customer is the customer account that is responsible for paying the invoice, if this is incorrect the billing transaction should be deleted and a new transaction entered.
7.  **Client account –** Is not editable.  The client is the person who received the service or item, if this is incorrect the billing transaction should be deleted and a new transaction entered.
8.  **Description** – Edit the description if required. The description is what will appear as the description on the transactions line of the customer invoice.
9.  **Provided by** – Enter the name of the person who provided the service if this is required
10. **Billing account name** – If the Billing account name is incorrect select the correct Billing account name.
11. **Billing code –** If the billing code is incorrect select the correct Billing code for the service or item to be billed
12. **External funding code** – Select the external funding code if there is a likelihood that this transaction may later be converted to a funding claim using the Funder switch function
13. **Service code** – if the client has a service entry this will default to the current service entry, however, if there is no service entry or the service was provided by a different service code then this should be entered or edited.
14. **Quantity –** If the Quantity is incorrect enter the correct quantity to be billed
15. **Rate –** If the Rate is incorrect enter the correct per-quantity rate
16. **Amount –** The amount is not editable. The system will calculate the amount based on the rate and quantity
17. **Start date –** If the start date is incorrect enter the correct start date. The Start date is the date the service being billed for started to be provided or if it is an ongoing service enter the first day to be billed, usually the next day after the last date that has previously been billed. eg. If it is overnight accommodation enter the date of arrival here or if it is ongoing accommodation enter the first day to be billed. For items enter the date the item(s) was provided.
18. **End date –** If the End date is incorrect enter the correct End date. The end date is the date the service being billed for ceased to be provided or the last day to be billed if it is an ongoing service. Eg. If it is overnight accommodation enter the departure date or if it is ongoing accommodation enter the last day to be billed. For items enter the date the item(s) was provided.
19. **Client Reference** – If the Client reference number is incorrect or blank enter a client reference number
20. **Method of payment** – If the method of payment is incorrect or blank you can enter the method of payment. This is only required if it is to be different from any other billing transactions for the customer or from their customer account. Any billing transactions with different Methods of payment will generate separate invoices
21. **Financial dimensions** – Enter the financial dimensions (cost centres etc.) for the control or debtor account part of the transaction. These do not have to be the same as the Offset dimensions but usually are.
22. **Offset dimensions** – Enter the financial dimensions (cost centres etc.) for the revenue account part of the transaction. These do not have to be the same as the Financial dimension but usually are.

### Delete billing transactions

Navigate to: **Care services >  Billing > Billing transactions**

1.  Only Billing transactions where the document status is **‘Open’** can be deleted. Open status means they have not yet been included in a billing invoice.
2.  Select the billing transaction to be deleted and confirm that it is the only billing transaction that you have selected or if there are multiples check only Billing transactions that you want to delete are highlighted.
3.  Select **Delete**

### Generate billing invoices

Navigate to: Care services Billing Generate Billing invoices**

1.  **Invoice date –** Enter the required invoice date, usually the date the invoice is being generated or may be based on the day or month the services were provided.
2.  Click on **Filter**
3.  Specify the required criteria for generating the billing invoice (customer account, service code). The system will generate billing invoices for all clients where there are billing transactions that meet the filter requirements entered, so ensure that these filters allow the selection of only the transactions that you want to include.
4.  Click **OK**
5.  *If required, set up the job to run in the background. Select Batch processing to Yes.*
6.  *Click on* **Recurrence**
7.  *The default value is for the job to run once (End after: 1) If it is a requirement for the job to run at a regular interval, then set up the required recurrence pattern.*
8.  *Click* **OK** *to close the Recurrence form.*
9.  *Click* **OK** *to add the job to the batch queue.*

### View billing invoices and generate billing journal

Navigate to: Care services Billing Billing invoices**

1.  Billing invoices that have not had a journal raised yet will be displayed on the billing invoice list.
2.  Select **Show all** to view all billing invoices if required.
3.  Click on the relevant **Billing invoice id** to view the billing invoice details.
4.  Click on **Generate billing journals** to generate a billing journal from the relevant invoice.
5.  Refer to the ‘Generate billing journals’ section to generate billing journals for all billing invoices yet to be processed.

### Generate billing journals

Navigate to: Care Services BillingGenerate Billing journals**

1.  Select the Billing journal type from the drop-down menu.
2.  Click on **Filter**
3.  Specify the required criteria for generating the billing journals (customer account, billing account). The system will generate billing journals for all clients where there are billing invoices that meet the filter requirements entered, so ensure that these filters allow the selection of only the invoices that you want to include.
4.  Click **OK**
5.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
6.  *Click on* **Recurrence**
7.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
8.  *Click* **OK** *to close the Recurrence form.*
9.  *Click* **OK** *to add the job to the batch queue.*

### Review and post billing journals

Navigate to: Care services BillingJournals Billing journal**

1.  The billing journal list will show journals that have not been posted.
2.  Select ‘All’ or ‘Posted’ in the ‘Show’ drop-down menu to view posted journals if required.
3.  Select the ‘Show user-created only’ to show journals you have created.
4.  Select the relevant journal to review.
5.  Click on ‘Journal batch number’ or **Lines** to open the billing journal.
6.  Review the details and then click **Post** to post the journal.
2.  Billing – Residential Care services and Retirement Villages
-   Manual journals can be entered or imported into the system.
-   Journals can be generated from the billing schedules by running the Billing journal proposal. The proposal utilises the Billing schedule to automatically generate transactions up to the selected end date.
-   Fees can be split to be paid by different parties such as family members or third-party organisations.

### Billing journal proposals

Navigate to: Care services BillingJournals Billing journal**

-   The billing journal proposal end date controls the billing being generated.
-   If the client has not been billed before, then the billing will be generated from the start day on the billing schedule to the end date on the billing proposal.
-   If the client has been billed before, then there will be a ‘Last run date’ on the billing schedule line. The billing proposal will generate fees from the day after the ‘Last run date’ to the end date on the billing proposal.
-   There are multiple billing proposal options:

    **Billing journal proposal** – used to generate billing up to a specified date for a specified client(s) or service(s) from the billing schedule lines.

    **Consolidate journal lines** – used to combine lines when there are multiple journal lines in the same journal for the same customer, billing code & service code.

    **Billing journal adjustment proposal** – used to propose adjustments where there has been a change, such as a Departure or a rate change, that requires billing to be reversed and re-charged.

    **Accommodation payment proposal** – used to charge unpaid interest and DAPs or DACs related to an accommodation payment.

    **Interest payable to client proposal** – used to calculate interest payable to a departed client with an accommodation payment that has not yet been refunded.

    **DMF/CRF proposal** – used to charge the deferred management and capital refurbishment fees for a retirement living lump sum payment.

    **Exceeded leave adjustment proposal** – used to calculate any fees due to leave taken exceeding the Department of Health caps.

![Billing_Journal_proposal_options](../IMAGES/Billing_Journal_proposal_options.png)

*Billing Journal proposal options*

### Generate Billing journal proposal

Navigate to: **Care services  Billing  Journals  Billing Journals**

1.  Click on **New** to create a new billing journal.
2.  Select the relevant billing journal from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Go to Billing proposal options  Billing journal proposal.
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

Navigate to: **Care services  Billing  Journals  Billing Journals**

1.  The billing journal list will show journals that have not been posted.
2.  Select ‘All’ or ‘Posted’ in the ‘Show’ drop-down menu to view posted journals.
3.  Select the ‘Show user-created only’ to show journals you have created.
4.  Select the relevant journal to review.
5.  Click on ‘Journal batch number’ or **Lines** to open the billing journal.
6.  Review the details and then click **Post** to post the journal.

### Third-party billing

Navigate to: **Care services  All Customers Invoice  Billing journal schedule**

1.  Select the line for the fee paid by a third party.
2.  Click on **Billing invoice**
3.  Click on **Edit**
4.  Select the relevant third party in the customer account (Refer to the Customer Management section for instructions on how to add customers)
5.  Propose the billing journal. The transactions will be posted to the third-party customer account.

**![Billing-Invoice–Third-Party](../IMAGES/Billing-Invoice–Third-Party.png)**

*Billing invoice – Third Party*

### Split billing

Navigate to: **Care services  All Customers Invoice  Billing journal schedule**

1.  Select the line for the fee to be paid by multiple parties.
2.  Click on **Billing invoicee**
3.  Click on **Edit**
4.  Select the first customer account and the percentage rate.
5.  Click on **New** to create a new line, populate the second customer account, copy the accommodation payment reference from line 1 and the percentage rate.
6.  Note that the total percentage must be 100.

*![](media/56d97c501f855e5c7deb847ae33735e5.png)*

*Billing invoice - Split billing*

### Consolidate journal lines

The consolidation process is used when there are multiple journal lines in the same journal for the same customer, billing code & service code to combine the lines.

Navigate to: **Care services  Billing  Journals  Billing Journals Lines**

1.  Go to Billing proposal options  Billing journal proposal.
2.  Select **Consolidate journal lines**
3.  Click **OK** to consolidate the relevant lines.

### Billing schedule and rate adjustments

-   Billing schedule adjustments such as adding or ending fees and changes to the billing rates are managed via the client billing schedule.
-   Global rate updates such as Basic Daily Care fee will not require a separate update for each client. The rate will be automatically updated for the relevant clients.

Navigate to: **Care services  All Customers Invoice  Billing journal schedule**

1.  Select the line for the fee to be adjusted.
2.  Populate the end date if the fee is no longer billed. Leave it blank if the fee is still applicable.
3.  To update the billing rate, Click on **Billing rates**
4.  Populate an end date on the existing rate.
5.  Click **New** to create a new line.
6.  Populate the new start date and new amount.
7.  Click **Save** and close the Billing rates form.
8.  The **‘Adjustment required’** flag will be set to Y when the fee has been billed in advanced (‘Last run date’ is after the start date of the new rate)

![](media/af92b80784d128b74de7060d5b6a9a37.png)

*New billing rate*

![](media/3805792af743cb333a868176c41eb79a.png)

*Adjustment required flag*

### Billing journal adjustment proposal

Billing adjustments are run whenever a client has billing that is required to be reversed and possibly re-billed. Examples of this are when a client:

-   has been billed in advance and then the rate has been changed.
-   has been billed in advance and then departs.
-   has been billed in advance and after payment of the accommodation payment lumpsum, requests for fees to be drawn down instead.

Navigate to: **Care services  Billing  Journals  Billing Journals Lines**

1.  Go to Billing proposal options  Billing journal proposal.
2.  Select **Billing journal adjustment proposal**
3.  Populate the journal posting date.
4.  Populate the end date.
5.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
6.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
7.  Click on **Filter**
8.  Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
9.  Click **OK**
10. *If required, setup the job to run in the background. Select Batch processing to Yes*
11. *Click on Recurrence*
12. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
13. *Click OK to close the Recurrence form.*
14. *Click OK to add the job to the batch queue.*
15. The total fee billed in advance will be reversed.
16. There will be two new lines proposed.
17. One line will be for the relevant days on the old billing rate.
18. The second line will be for the relevant days on the new billing rate.

### Billing Capping limits

-   Capping limits are the amounts specified by the government as the maximum annual or lifetime amount that can be charged of a particular type of fee such as means tested fees or income tested fees.
-   If the ‘allow charge beyond capping limits’ is set to yes, then the billing will continue even if the cap has been reached.
-   When the parameter is set to No, the billing will end when the capping limit has been reached.
-   Prior to generating the billing journal, ensure the capping limit setup has been completed for the client (Path: **Care services  All Customers  Set up  Capping limits setup)
-   The client capping calculation periodic job updates the client capping limit setup after posting the journal.

Navigate to: **Care services  Billing  Journals  Billing Journals Lines**

1.  Go to Billing proposal options  **Billing journal proposal**
2.  Populate the journal posting date.
3.  Populate the end date.
4.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
5.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
6.  Click on **Filter**
7.  Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
8.  The capped amount will propose when the annual or lifetime cap has been reached.
9.  Validate and post the journal.

# Accommodation Payments

Prior to generating Accommodation payment transactions, ensure the Accommodation payment setup has been completed for the client (Path: **Care services  All Customers  Invoice  Set up  Accommodation payment)

### Accommodation payment lumpsum invoice

Navigate to: **Care services  Billing  Journals  Billing Journals**

1.  Click on **New** to create a new billing journal.
2.  Select the **relevant accommodation payment lumpsum invoice** journal from the drop-down menu
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Populate the date for the lumpsum invoice.
6.  Select the client account.
7.  Select the accommodation payment Billing account name.
8.  Select the relevant service code.
9.  Select the billing code for accommodation payment lumpsum.
10. Select the client’s accommodation payment id.
11. Populate start date and end date.
12. Leave the Qty/Days as 1.00
13. Populate the lumpsum amount in the Rate field.
14. Validate and post the journal.

### Daily Payments (DAP/DAC) or unpaid interest drawn down from RAD/RAC

Daily accommodation payments or unpaid interest amounts can be drawn down from the lumpsum balance.

Navigate to: **Care services  All customers  Invoice Accommodation payment**

1.  Change the **Billing account name** on the accommodation payment line to the relevant accommodation payment billing account name.
2.  When the lumpsum invoice has been fully or partially paid, the DAP/DAC and unpaid interest amounts will be drawn down from the lumpsum reducing the refundable balance.
3.  If the lumpsum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.

### Fees drawn down from RAD/RAC

Fees can be drawn down from the lumpsum balance.

Navigate to: **Care services  All customers  Invoice Billing Schedule**

1.  Select the fee to be drawn down from the accommodation payment lumpsum.
2.  Click on **Billing invoicee**
3.  Change the **Billing account name** to the relevant accommodation payment billing account name.
4.  When the lumpsum invoice has been fully or partially paid, the fee will be drawn down from the lumpsum reducing the refundable balance.
5.  If the lumpsum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.
6.  Follow the steps in the **Billing journal proposal** section to generate the transactions.

![](media/3e511a525ae57fe6e9395bbdd31dbfa8.png)

*Change Billing account name for fee to be drawdown from the accommodation payment.*

### Adjustments to Fees drawn down from RAD/RAC

Clients may request fees billed in advance to be drawn down from the accommodation payment lumpsum when it has been paid.

Navigate to: **Care services  All customers  Invoice Billing Schedule**

1.  Select the fee to be drawn down from the accommodation payment lumpsum.
2.  Populate an **End date** and **Bill to date** for the day before the lumpsum receipt.
3.  Create a new line for the same fee with a start date the day the lumpsum was paid.
4.  Go to **Billing Invoicee**
5.  Change the Billing account name to the accommodation payment type.
6.  Follow the steps in the **Billing journal adjustment section** to propose the adjustments.
7.  The fees billed in advance will be reversed and two new lines generated, one for the fees billed up to the date of receipt and the second line for the drawdowns.

### Managing changes to the accommodation payments

-   Client’s DAC amount is regularly reviewed, and the amounts may require adjustments.
-   DAC assessed amounts will automatically reduce the amount of accommodation supplement in the Funding schedule.
-   The client may decide to change the payment method (e.g. from Lumpsum to Combination or from DAP/DAC to Combination etc)
-   These adjustments are managed by adding a new accommodation payment line with the effective date and new values.

Navigate to: **Care services  All customers  Invoice Accommodation payment**

1.  Populate the relevant **end date** on the current accommodation payment line.
2.  Click on **Add line** to add a new line.
3.  If the **payment method** is changed, the select the relevant payment method.
4.  Update the **agreed lumpsum** if required.
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
10. Select ‘Include unpaid lumpsum interest’ to include interest calculations on unpaid lumpsum (RAD/RAC)
11. Click on **Filter**
12. Specify the required criteria for generating the billing journals (customer account, Service code)
13. Click **OK**
14. *If required, setup the job to run in the background. Select Batch processing to Yes*
15. *Click on Recurrence*
16. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
17. *Click OK to close the Recurrence form.*
18. *Click OK to add the job to the batch queue.*
19. There will be separate lines generated for ongoing interest amounts (DAP/DAC) and interest on unpaid lumpsum.
20. The interest rate used for the calculations is the agreed interest rate on the client’s accommodation payment setup.
21. If any adjustments are required, the original amount will be reversed, and new line(s) proposed with the relevant rates and amounts.
22. Validate and post the journal.

### Interest payable to client proposal

-   Interest payable will be proposed if the lumpsum is not refunded within the legislative time frame following the departure of a client.
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
17. There will be two lines if the lumpsum has not been refunded within 14 days.
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

-   Payments of agreed lumpsum or other fees and charges are posted in Receipt journals.
-   Direct Debit payments can be proposed in receipt journals and the relevant bank file generated. Ensure the client bank account and method of payment is setup to be included in the Direct Debit proposals.
-   Clients may also have a direct debit limit or a Pre-set direct debit amount.

### Accommodation payment lumpsum receipt

Navigate to: **Care services  Journals Receipt journal**

1.  Click on **New** to create a new receipt journal.
2.  Select the **relevant lumpsum receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **Lines**
5.  Populate the date of receipt.
6.  Select Client account.
7.  Click **Save**
8.  Click on **Settle transactions**
9.  Select the Lumpsum invoice and select the **Mark** check box
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
9.  Select the **Billing account name for billing** to exclude accommodation payment drawdowns.
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
14. Populate Effective date and new **‘Agreed amount’** and **‘Agreed lumpsum’.**
15. **Process the difference in bed price:**
16. Go to Care services Billing  Billing journal.
17. Create a new accommodation payment lumpsum invoice journal.
18. Populate the date and select the client account.
19. Select the billing account name for the accommodation payment refund
20. Select the Service code.
21. Select the Billing Code for the partial refund (as specified in care services parameters  journals  Partial refund billing code) OR the lumpsum invoice billing code for the invoice
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
14. Populate the Agreed amount and Agreed Lumpsum and other relevant details.
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
25. Create a new Accommodation Payment Lumpsum invoice billing journal.
26. Populate Date, Client account and Billing account name for the accommodation payment.
27. Populate Service code for the **new facility.**
28. Select the Billing code for the accommodation payment lumpsum transfers.
29. Select the **new accommodation payment ID.**
30. Populate start and end dates.
31. Populate the agreed lumpsum amount.
32. Validate and post the journal.
33. Go to ****Care services  Journals  Receipt journal** and create a new **Lumpsum receipt** journal.
34. Populate the date, client account and description.
35. Select the service code for the **new facility** and **billing account name** for the accommodation payment.
36. Select the **new accommodation payment ID.**
37. Click on Settle transactions to mark the invoice for the agreed lumpsum in the new facility.
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

1.  Create a new lumpsum billing journal then click on Lines
2.  Populate the departure date in the ‘Date’ , ‘Start date’ and ‘End date’ fields, select the customer and the **new** accommodation payment id
3.  Populate the refundable balance in the Rate field
4.  Validate and post the journal

Navigate to:** ****Care services Journals  Receipt journal**

1.  Create a new lumpsum receipt journal then click on Lines
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

