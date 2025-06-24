---
# required metadata

title: DXC Care services 
Description: Community and Disability Care
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

-   Services provided for community and disability clients can be imported manually or via integration as billing transactions in Dynamics 365 Finance and Operations. Once they have been imported, they are available to view or edit on the billing transactions view in the same way as any manually entered or system-generated billing transactions
-   Billing invoices are generated for billing transactions with the same invoice number, or if invoice numbers are not allocated, then all of the transactions for a particular client and service code will be grouped into a single invoice
-   Billing transactions can also be generated from a billing schedule for recurring fees.
-   The total amount will be generated and posted in a Billing journal.
-   Customer accounts are set up for organisations paying for client service transactions.

### Generate billing transactions

Navigate to: **Care services \>  Billing \> Generate billing transaction**

1.  **Journal posting date –** Enter the posting date for the transaction
2.  **End date—** Enter the last date to be included in the scheduled billing run, i.e., the date you want to bill.
3.  Click on **Filter** - Use the filter options (Customer account, service code etc.) to select which clients or billing schedule lines will be included. The system will generate billing transactions for all clients where there are billing schedule lines that meet the filter requirements entered, so ensure that these filters allow the selection of only the billing schedule lines that you want to include.
4.  Click **OK** when the filters have all been entered
5.  Click **OK** to start the Generate billing transactions process unless you want to run it in batch processing or set up a recurrence – refer to steps 6 to 10 if this is required.
6.  *If required, set up the job to run in the background. Select Batch processing to Yes.*
7.  *Click on* **Recurrence** *The default value is for the job to run once (End after: 1). If it is a requirement for the job to run at a regular interval, then set up the required recurrence pattern.*
8.  *Click* **OK** *to close the Recurrence form.*
9. *Click* **OK** *to add the job to the batch queue.*

### Manually Enter billing transactions

Navigate to: **Care services >  Billing > Billing transactions**

1.  Select **New billing transaction,** and a pop-up window will be displayed
2.  **Customer account –** Enter the customer account that is responsible for paying the invoice; this may be the client or a third party.
3.  **Client account –** Enter the Customer account for the client who received the service or item
4.  **Billing code –** Enter the Billing code required for the service or item to be billed
5.  **Start date –** Enter the date the service being billed for started to be provided, or if it is an ongoing service, enter the first day to be billed, usually the next day after the last date that has previously been billed. eg. If it is overnight accommodation, enter the date of arrival here, or if it is ongoing accommodation, enter the first day to be billed. For items, enter the date the item(s) were provided.
6.  **End date –** Enter the date the service being billed for ceased to be provided or the last day to be billed if it is an ongoing service. Eg. if it is overnight accommodation, enter the departure date, or if it is ongoing accommodation, enter the last day to be billed. For items, enter the date the item(s) was provided.
7.  **Rate –** Enter the per quantity rate
8.  **Quantity –** Enter the quantity to be billed
9.  **Amount –** The system will calculate the amount based on the rate and quantity
10. **Description** – The system will auto-populate the description from the billing code, and it can then be edited. The description is what will appear as the description on the transactions line of the customer invoice.
11. Select **OK** then **Refresh**
12. Open the billing transaction by clicking on the **Billing transaction id**
13. **Invoice number –** If this transaction is to be added with other transactions that have a specific invoice number, add the invoice number. If this transaction will be invoiced on its own or other transactions to be included on an invoice, do not include an invoice number (ie. the invoice number will be system-generated); leave the invoice number blank.
14. **Transaction type** – Only Billing and Adjustment are relevant to Community or Disability care. Billing is used for standard transactions, however,r if a transaction is an adjustment that is related to previous transactions and the organisation policy is to identify these separately, the adjustment option can be selected.
15. **Provided by** – Enter the name of the person who provided the service if this is required
16. **Billing account name** – The system will default a Billing account name based on the settings; however, if this is not correct, select the correct Billing account name.
17. **External funding code** – Select the external funding code if there is a likelihood that this transaction may later be converted to a funding claim using the Funder switch function
18. **Service code** – if the client has a service entry this will default to the current service entry; however, if there is no service entry or the service was provided by a different service code then this should be entered or edited.
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
    2.  **Billing Invoice** – The billing transaction has been generated in a billing invoice. If the invoice is deleted, the billing transaction status will be set back to Open.
    3.  **Billing journal** - There has been A billing journal has been generated from the billing invoice. Once the billing journal has been posted, the billing invoice cannot be deleted.

### Edit billing transactions

Navigate to: **Care services >  Billing > Billing transactions**

1.  Only Billing transactions where the document status is **‘Open’** can be edited. Open status means they have not yet been included in a billing invoice.
2.  Open the billing transaction by clicking on the **Billing transaction id**
3.  **Billing transaction id –** is not editable
4.  **Invoice number –** If this transaction is to be added with other transactions that have a specific invoice number, add the invoice number. If this transaction will be invoiced on its own or other transactions to be included on an invoice, do not include an invoice number (ie. the invoice number will be system-generated), leave the invoice number blank.
5.  **Transaction type** – Only Billing and Adjustment are relevant to Community or Disability care. Billing is used for standard transactions, however,r if a transaction is an adjustment that is related to previous transactions and the organisation policy is to identify these separately, the adjustment option can be selected.
6.  **Customer account –** Is not editable. Customer is the customer account that is responsible for paying the invoice; if this is incorrect, the billing transaction should be deleted and a new transaction entered.
7.  **Client account –** Is not editable.  The client is the person who received the service or item; if this is incorrect, the billing transaction should be deleted and a new transaction entered.
8.  **Description** – Edit the description if required. The description is what will appear as the description on the transactions line of the customer invoice.
9.  **Provided by** – Enter the name of the person who provided the service if this is required
10. **Billing account name** – If the Billing account name is incorrect,t select the correct Billing account name.
11. **Billing code –** If the billing code is incorrect, select the correct Billing code for the service or item to be billed
12. **External funding code** – Select the external funding code if there is a likelihood that this transaction may later be converted to a funding claim using the Funder switch function
13. **Service code** – if the client has a service entry, this will default to the current service entry, however, if there is no service entry or the service was provided by a different service code then this should be entered or edited.
14. **Quantity –** If the Quantity is incorrect,t enter the correct quantity to be billed
15. **Rate –** If the Rate is incorrect, enter the correct per-quantity rate
16. **Amount –** The amount is not editable. The system will calculate the amount based on the rate and quantity
17. **Start date –** If the start date is incorrect, enter the correct start date. The Start date is the date the service being billed for started to be provided or if it is an ongoing service enter the first day to be billed, usually the next day after the last date that has previously been billed. eg. If it is overnight accommodation, enter the date of arrival here, or if it is ongoing accommodation,n enter the first day to be billed. For items, enter the date the item(s) were provided.
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
6.  *Click on* **Recurrence** *The default value is for the job to run once (End after: 1). If it is a requirement for the job to run at a regular interval, then set up the required recurrence pattern.*
7.  *Click* **OK** *to close the Recurrence form.*
8. *Click* **OK** *to add the job to the batch queue.*

### View billing invoices and generate a billing journal

Navigate to: **Care services >  Billing > Billing  invoices**

1.  Billing invoices that have not had a journal raised yet will be displayed on the billing invoice list.
2.  Select **Show all** to view all billing invoices if required.
3.  Click on the relevant **Billing invoice id** to view the billing invoice details.
4.  Click on **Generate billing journals** to generate a billing journal from the relevant invoice.
5.  Refer to the ‘Generate billing journals’ section to generate billing journals for all billing invoices yet to be processed.

### Generate billing journals

Navigate to: **Care services >  Billing > Generate Billing journals**

1.  Select the Billing journal type from the drop-down menu.
2.  Click on **Filter**
3.  Specify the required criteria for generating the billing journals (customer account, billing account). The system will generate billing journals for all clients where there are billing invoices that meet the filter requirements entered, so ensure that these filters allow the selection of only the invoices that you want to include.
4.  Click **OK**
5.  *If required, set up the job to run in the background. Select Batch processing to Yes.*
6.  *Click on* **Recurrence** *The default value is for the job to run once (End after: 1). If it is a requirement for the job to run at a regular interval, then set up the required recurrence pattern.*
7.  *Click* **OK** *to close the Recurrence form.*
8. *Click* **OK** *to add the job to the batch queue.*

### Review and post billing journals

Navigate to: **Care services >  Billing > Journals > Billing journal**

1.  The billing journal list will show journals that have not been posted.
2.  Select ‘All’ or ‘Posted’ in the ‘Show’ drop-down menu to view posted journals if required.
3.  Select the ‘Show user-created only’ to show journals you have created.
4.  Select the relevant journal to review.
5.  Click on ‘Journal batch number’ or **Lines** to open the billing journal.
6.  Review the details and then click **Post** to post the journal.
