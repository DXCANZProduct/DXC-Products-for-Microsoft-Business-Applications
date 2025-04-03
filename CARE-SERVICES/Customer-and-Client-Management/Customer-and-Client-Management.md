---
# required metadata

title: DXC Care services 
description: Care Services Customer and Client Management
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


# Care services - Customer and Client Management
-   Client admissions, departures, and transfers are managed using the client service entry details.
-   Clients can have multiple contacts including address, contact details and relationship type(s).
-   The financial setup includes Customer bank account, the preferred payment method, billing, accommodation payment and funding.
-   Customer organisations such as NDIS Plan Manager or DVA (Department of Veteran’s Affairs) are set up for third-party billing.



## New Organisation Customer (for third-party billing)
Customer organisations such as an NDIS Plan Manager or DVA (Department of Veteran’s Affairs) are set up for third-party billing. Organisations cannot have a service entry.<br>

Navigate to: **Care services > All customers**
1.  Click on **New**
2.  **Type** - Select **Organisation** from the Type
3.  Name - Populate the organisation name.
4.  **Customer group** - Select the relevant customer group.
5.  **Terms of payment** – Enter the organisation’s payment terms
6.  **ABN** – Enter the ABN,  if an ABN record has been created in D365 for this organisation otherwise it can be entered later  
    **Address Tab**
7.  **Add or Edit addresses**—Select Add or Edit as required, and a pop-up window will be displayed. Multiple addresses can be stored for each organisation's customer for different purposes.
8.  **Name or Description** – This does not print when an address is used in reports, invoices, statements etc. Enter a name to be associated with this address or a description of the type of address it is such as Office address, Postal address etc. The purpose can also be used for this type of function
9.  **Purpose** – Select the purpose(s) for the address. The purpose is a field that can be customised by any organisation so that tailored purposes can be created to suit the organisation’s needs so ensure you select the purpose based on what that address should be used for. Eg. Invoice is the purpose that is usually used for the address that should appear on the invoice, Statement might also be used if this has a separate address
10. **Address fields** – Enter the address into the appropriate fields. City and postcode verification is available.
11. **Primary** – Select if this is to be the main address for the organisation customer, only can be the 1 Primary address  
    **Contact information tab**
12. **Add Phone or Email address** – select **Add** and a new line will appear in the grid  
    **Description** - Enter a description of the contact such as Care Co-ordinator, Accounts payable or anything useful/recognisable.   
    **Type** - Select the Type, phone or email etc.  
    **Contact number/address** - Enter the phone number or email address etc.  
    **Primary** – Tick if this is the primary record for that Contact Type. There can only be one Primary for each Type of contact, ie. You can add multiple phone numbers however only 1 can be primary, but a customer can have both a primary email and a primary phone etc.
13. **Add Purpose to contact information** – Select the record the purpose is to be added to, then select **Advanced** and a popup window will be displayed. Select the required Purpose(s) and select **\<OK\>**  
    **Payment defaults tab**
14. **Terms of payment** – Select the terms of payment for this customer record
15. **Method of payment** – Select the method of payment. If the method of payment is a direct debit method ensure that the bank account is also setup.
16. Click **Save** to add the new customer.

## Add a new client

Navigate to: **Care services > All customers**

1.  Click on **New** and a pop-up window will be displayed for entering the customer details
2.  **Type** - Select **‘Person’** for anyone who will be receiving services
3.  **First name** - Enter the first name.
4.  **Middle name** – Optional to enter the Middle name
5.  **Last name** – Enter the surname or family name
6.  **Customer group** - Select the relevant customer group for this client. This can be edited later if a customer’s service provision changes
7.  **Terms of payment** – Enter the client’s payment terms
8.  **Address** – Enter the address for the client’s invoices to be sent to if they are responsible for paying any bills. Other Addresses can be added after the customer account has been created.
9.  **Contact information** – Enter the contact information, telephone and email, for the client or the nominated account receiver. Other Contact information can be added after the customer account has been created.
10. Click **Save** to add the new client.
11. Click on the new **Customer account id** to open the customer account record.  
    **General Tab**
12. **Name details** – Add any titles and Known as (Preferred name)
13. **Personal information** - Enter any other details such as gender, birth date and marital status.
14. **Care services** – Select the customer’s statement preference (Mail or Email) and  
    if they prefer a different name on their statements, eg. Instead of James Smith it might be preferred to have Mr & Mrs Smith, enter this in the Customer statement name. This is most commonly used for independent living and   
    Select the Carer status if that is relevant to the client
15. **HCP** - Set to yes if the client has a home care package and requires the Home care unspent amount to be calculated by the system  
    **Address Tab**
16. **Add or Edit addresses** – Select Add or Edit as required and a pop-up window will be displayed. Multiple addresses can be stored for each client with different purposes.
17. **Name or Description** – This does not print when an address is used in reports, invoices, statements etc. Enter a name to be associated with this address or a description of the type of address it is such as Home address, service delivery address, carer address etc. The purpose can also be used for this type of function
18. **Purpose** – Select the purpose(s) for the address. The purpose is a field that can be customised by any organisation so that tailored purposes can be created to suit the organisation’s needs so ensure you select the purpose based on what that address should be used for. Eg. Invoice is the purpose that is usually used for the address that should appear on the invoice, Service or Home might be used for clients who receive home care services to show which address is used by the client when they receive services
19. **Address fields** – Enter the address into the appropriate fields. City and postcode verification is available.
20. **Primary** – Select if this is expected to be the main address for the client. Each client can have only 1 Primary address  
    **Contact information**
21. **Add Phone or Email address** – select **Add** and a new line will appear in the grid  
    **Description** - Enter a description of the contact such as Care Co-ordinator, Accounts payable or anything useful/recognisable.  
    **Type** - Select the Type, phone or email etc.  
    **Contact number/address** - Enter the phone number or email address etc.  
    **Primary** – Tick if this is the primary record for that Contact Type. There can only be one Primary for each Type of contact, ie. You can add multiple phone numbers however only 1 can be primary, but a customer can have both a primary email and a primary phone etc.
22. **Add Purpose to contact information** – Select the record the purpose is to be added to, then select **Advanced** and a popup window will be displayed. Select the required Purpose(s) and select **OK**  
    **Payment defaults**
23. **Terms of payment** – Select the terms of payment for this customer record
24. **Method of payment** – Select the method of payment. If the method of payment is a direct debit method ensure that the bank account is also setup.
25. **Direct debit limit** – If there is a maximum amount for the customer to have debited from their account enter that amount in here.
26. **Enable Pre-set direct debit amount** – Set to Yes if a set amount is to be debited from the customer’s account even if they don’t owe that much. This functionality is generally used for clients who want a set amount taken out of their account every pension day so it is a consistent amount every fortnight throughout the year. If this functionality is to be used also enter the set amount in the **Pre-set direct debit amount.**

## Client Bank account and method of payment

Navigate to: **Care services > All customers > Customer**

-   Customers can have multiple bank accounts however only one can be set up as a direct debit bank account at a time.
-   When transactions are generated, they are tagged with the method of payment and bank account selected on the customer account at the time.
-   If a customer changes their bank account, then the existing bank account record can be edited. The bank account record name will remain the same, so the new BSB and account number will be used when generating the ABA file. Note that using this method, historical bank records will not be available for the customer
-   If a new bank account record is created and then selected on the customer record, then only new transactions will be tagged with that bank account. Any existing transactions will still be tagged with the original bank account and payment method. There is a process in the direct debit processing to update the bank account and the payment method for the existing transactions, however, these differences in the updating of the bank account records should be considered when deciding which update method to use.


1.  Select the client the bank account is being set up for
2.  Select **Setup > Bank accounts** from the ribbon at the top.
3.  Click **New**
4.  **Bank account**  - Enter a code for the bank account eg. BANK, MAIN, FIRST etc.
5.  **Name** – Enter the bank account name
6.  **Bank account number** – Enter the bank account number
7.  **BSB number** – Enter the BSB number
8.  Click on **Save** to save the bank account details.
9.  Open the client details to select the relevant bank account in **Customer > Payment defaults > Bank account**
10. Select the preferred method of payment in **Customer > Payment defaults > Method of payment**

## Client Contacts

Navigate to: **Care services > All customers > Customer > Contacts**

1.  Select **View contacts** if you want to view or edit the existing contacts
2.  To add a new contact select **Add contacts**
3.  Populate the relevant name details and any other details under the General tab  
    **Contact additional information tab**
4.  **Contact type** - Select all of the relevant contact types (e.g., wife, next-of-kin)
5.  **Contact Priority** - Select Contact Priority - Primary, Secondary or Do not contact
6.  Relationship type - Select Relationship type – None, Personal or Non-personal
7.  Account receiver – If the contact is to receive a copy of the customer statement set this to Yes
8.  Statement preference - If the Account receiver is set to yes select the statement preference to Email or Mail. Email is recommended as the statement generated will be a copy of the statement sent to the customer and will have the same mailing address on it so the copy cannot be sent in a window face envelope.  
    **Address Tab**
9.  **Add or Edit addresses** – Select Add or Edit as required and a pop-up window will be displayed. Multiple addresses can be stored for each client with different purposes.
10. **Name or Description** – This does not print when an address is used in reports, invoices or statements etc. Enter a name to be associated with this address or a description of the type of address it is such as Home address, service delivery address, carer address etc. The purpose can also be used for this type of function
11. **Purpose** – Select the purpose(s) for the address. The purpose is a field that can be customised by any organisation so that tailored purposes can be created to suit the organisation’s needs so ensure you select the purpose based on what that address should be used for. Eg. Invoice is the purpose that is usually used for the address that should appear on the invoice, Service or Home might be used for clients who receive home care services to show which address is used by the client when they receive services
12. **Address fields** – Enter the address into the appropriate fields. City and postcode verification is available.
13. **Primary** – Select if this is expected to be the main address for the client. Each client can have only 1 Primary address  
    **Contact information**
14. **Add Phone or Email address** – select **Add** and a new line will appear in the grid  
    **Description** - Enter a description of the contact such as Daughter – Susan or anything useful  
    **Type** - Select the Type, phone or email etc.  
    **Contact number/address** - Enter the phone number or email address etc.  
    **Primary** – Tick if this is the primary record for that Contact Type. There can only be one Primary for each Type of contact, ie. You can add multiple phone numbers however only 1 can be primary, but a customer can have both a primary email and a primary phone etc.
15. **Add Purpose to contact information** – Select the record the purpose is to be added to, then select **Advanced** and a popup window will be displayed. Select the required Purpose(s) and select **\<OK\>**
16. Save and close.
17. Click on the **\<New\>** button to add additional contacts.

### Client Reference numbers

Clients can have multiple reference numbers such as Pension number or Care services client record

Navigate to: **Care services \> All customers \> Customer\> Setup \> Client reference number**

1.  Select **\<New\>**
2.  **Reference number type** - Select the Reference number type.
3.  **Reference number** - Populate the number.
4.  Select the **‘Active’** check box.
5.  Repeat the process to add additional reference numbers.

![Client reference number](IMAGES/Client-reference-number.png)

*Client reference number*

### Admit the client to a service

Navigate to: **Care services \> All customers \> Care services**

-   A client’s service entry tells us about the client’s journey within the organisation and when they were receiving care.
-   The service entry will show which areas of the organisation were providing that care and whether they are continuing to receive that care.
-   A client may have only 1 service entry, or they may have several as they have utilised different service offerings of the organisation. Eg. A client may have a service entry for a retirement village, then they add a home care package to that, and they might also require respite care after an incident.
-   They may have all three of these service entries active at the same time.
1.  Click on **New \> Service entry**
2.  Care type – Select the type of care or service being provided, eg. Permanent residential care, Home care etc.
3.  Service - Select the service that will be the main provider of that care type
4.  Place – The place is room, apartment, unit etc. where the client will be residing. Place is usually not required for community-based care, though this is optional
5.  Funded – This toggle will default to the setting on the service, however, it can be edited as required. Eg. A service may usually provide funded care so the default is funded, however, there may also be some private, unfunded clients at this service, so the flag should be set to No for these clients.
6.  Supported/accommodation payment status - Select the relevant Supported/accommodation payment status for this client. This can be edited at any time so if you’re not sure of the status you can select the most likely one at this stage and edit it later if necessary.
7.  Entry date – Enter the actual date of arrival or the commencement of the service agreement.
8.  Billing start date – The billing start date will default to the entry date, however, this can be edited if a different start date is agreed to. Eg if a room has been held for a client they may be billed for a few days before their entry date
9.  ‘Care prior to 01/07/2014 - Defaults to No, however, select ‘Care prior to 01/07/2014?’ if the client’s original admission to Care services is before 1st July 2014
10. Subject to new means testing – Defaults to Yes, however, this should be set to no for clients who were first admitted to Care services prior to 01/07/2014 and have not opted into the post 1/7/2014 means tested fee system
11. Initial & Departure capacity – This is for STRC clients, enter the initial capacity score at the time of entry
12. Acer required – set to yes if an Care services entry record is required to be generated for uploading to the Care Services portal
13. Departure event required - set to yes if an Care Services departure event record is required to be generated for uploading to the Care Services portal when the client departs
14. Click on **\<Save\>** to admit the client.  
    Place address transfer – if the prospect options in D365 are used for waitlist purposes prior to a client entering the service and the service record has place address transfer enabled this feature will automatically update the client address on their customer record to the address of the place they are now entering.
15. The room (place) address will automatically be generated as the primary address for the resident with the purpose = Home. This purpose is setup in the Care services parameters so will default to whatever the organisation has selected there. This default can be edited.
16. The previous home address from when they were on the waitlist will be retained, however the purpose type will be changed to ‘Other’. This purpose is setup in the Care services parameters so will default to whatever the organisation has selected there. This default can be edited.

![](media/f3519b846896d737cfd16358e709079f.png)

*Client addresses*

### Admit partners in Independent Living

Navigate to: **Care services \> All customers**

-   Independent living often includes multiple clients residing in the same place, eg apartment, unit, townhouse etc
-   The system allows for any number of clients in the same place, and they share a service entry providing the service has the “Allow Partnered” toggle set to Yes on the service record.
-   The partnered tab on the service entry records the partner client(s).
-   If the partner client leaves the service, the departure can also be recorded there.
-   If the Primary client leaves the partner client can be switched to the Primary and all the setup and history is retained.
1.  Create a new client account for the Partner as per previous instructions for client accounts (do not add a service entry)
2.  Go to ****Care services \> Customers \> All customers**
3.  Select the Primary client from the client list
4.  Click on ****Care services \> Related information \> Service entries**
5.  If the Primary client does not already have a service entry for the shared place add a service entry as per above instructions
6.  Open the Primary client service entry  
    **Identification tab**
7.  **Partnered toggle** – Set to Yes to enable the partner ta
8.  **Partnered tab –** Click on Add line
9.  **Customer account** - Select the Partner client
10. The remaining fields will default from the General tab
11. **Entry date** – this will default from the General tab however it can be edited if the partner did not arrive on the same date as the Primary client.
12. Click on **\<Save\>**
13. Repeat from the Partnered tab onwards to add any further clients residing in the same place

### Client billing schedule

-   The billing schedule allows the user to set a list of fees and charges that occur on a regular basis.
-   Fees applicable for most clients are set up in a schedule template and attached to the relevant care types. Upon entry, the client’s billing schedule lines will automatically be generated
-   Client-specific fees and rates are added to the client billing schedule and any lines that are not applicable to a client can be removed
-   Fees setup with a funding offset amount (such as Means Tested Fee Clawback) will automatically generate the funding reduction in the Funding schedule.

Navigate to: **Care services \> All customers \> Invoice\> Setup \> Billing schedule/Funding Schedule**

1.  **Review** the automatically generated lines
2.  **Delete a line** – If there are any lines that do not apply to this client select the line to be deleted then click \<Mark as created in error\>. When all unwanted lines have been marked as created in error, tick the view marked in error. The lines that were marked created in error will be displayed, select all lines and click \<Delete\>. Untick the View marked in error to return to the billing schedule
3.  **Add a Billing schedule line** - Select **\<New\>** to add a new line. A new line is created.
4.  **Service group** - Select relevant Service group. Service groups are setup by the organisation and are designed so that users will see only the billing codes that relate to a particular client. Eg. If an organisation offers a package of services at some of their location only, a service group would be created that included the package and the users would select that service group here.
5.  **Billing Code** – select the relevant billing code, only billing codes listed on that service group will be visible.
6.  **Service code** – Select the service code where the services will be provided from. Eg At a co-located site any fees related to a retirement village would have th retirement village service code, however if the care facility provided Allied Health services on a weekly basis then the service code for that line would be the care facility service code.
7.  **Start date** – Enter first date that should be billed as the start date.
8.  **End date** – If the fee is to be charged for a limited time enter the last date to be charged. Eg Special promotion for first 2 weeks get a 50% discount, the discount line would have an end date 2 weeks after the start date.  
    **Billing rates**
9.  **Review** the rates shown on the billing schedule lines, If all of the rates are correct, nothing further is required, however if any lines show \$0.00 or another incorrect rate, select the line that needs the rate altered.
10. Click on **\<Billing rates\>** and a new view will be displayed  
    **Add a new billing rate line**
11. If there are no lines displayed or if there is only a line with the Valid for is All (this means it is a global rate) but that rate is not what this client is to be charged a new billing rate line will be required
12. Select **\<New\>** to add a client specific rate.
13. **Valid for** – Valid for should default to Table, this means that this billing rate applies to this client only. If creating a new global rate, a rate that will apply to everyone who doesn’t have their own client specific rate, set the Valid for to All.
14. **Client account** – Will default to the client’s account code. This will be blank for global rates so if the ‘Valid for’ is changed to All the client code will be removed..
15. **Start date** – Enter the Start date for this rate to apply
16. **End date** – If the rate is to apply for a limited time, enter the last date that this rate will apply. If there is a new rate to be applied after that time then enter a new line with the new rate with the start date 1 day after the end date on the ended line.
17. **Rate model** – This defaults to Amount and is only changed to Percentage if this rate is to be based on the rate for another billing code. Eg Special promotion for first 12 weeks get a 50% discount on the billing code ‘Extra’. The rate model would be changed to Percentage, the base billing code would be Extra, Rate percent would be -50%. The system will generate a credit for half of the ‘Extra’ billing code rate even if the rate changes during the 12 weeks the system will calculate the correct rate.
18. **Rate** – When the rate model is ‘Amount’ enter the rate that applies to this client for this billing code.
19. Click **\<Save\>** and close the billing rates view when done.
20. **Review** the rates shown on the billing schedule lines, and adjust the billing rates as per above for any that are not as required. Once all of the rates are correct, Click **\<Save\>** and close the Billing Schedule form.
21. If the client has any billing schedule lines that affect the funding such as means tested fees or Hardship, open the Funding Schedule to confirm that the clawback line has been automatically created and the rates are correct.

22. 
![](media/73fdc47cbf8d77da7d62b8e12e29d173.png)

*Billing Schedule*

![](media/045553ab62e8b43194cde2abafdc884e.png)

*Billing Rates*

![](media/4d7ed0c550dfde71c67677944025998f.png)

*Funding Schedule*

### Client capping

-   Certain fees such as Means Tested Fees have an annual and lifetime cap.
-   The capping limit thresholds are indexed bi-annually.
-   The values are updated via the periodic client capping calculation job.
-   The First entry date refers to the date the client first began receiving Commonwealth funded Care services, including home care or care with another provider. This is the day that is used as the anniversary date for the annual capped amounts

Navigate to: **Care services \> All customers \> Customer\> Set up \> Capping limits setup**

1.  Click **\<Edit\>**
2.  **Annual capping limits -** select the annual capping limit type that relates to the type of care the client is currently receiving
3.  **Lifetime capping limits –** Select the lifetime limits cap. The Lifetime limit applies to all care types
4.  **First entry date –** This defaults to the entry date on the oldest funded service entry for ongoing care, respite is not included in determining this date. If the client has been receiving Commonwealth funded ongoing Care services previously, then populate the original date of entry. This date can be edited and will affect the anniversary date and the dates used to calculate the Annual balances.
5.  The **first entry date** remains editable, so if the first entry date is not known when the record is originally created, it can be updated at any time. If the date is edited, when the Save button is selected, the dates on the capping lines will be updated. The calculations won’t be updated until the capping calculator is run.
6.  Click on **\<Save\>**
7.  **Opening balance** - If the client has previously been receiving Commonwealth funded ongoing care and the amount previously paid as been provided enter this amount in the **Opening balance** on the Lifetime line. If the amount is known for how much of that relates to the current Annual lines enter this in the Opening balance for the Annual line.

![](media/aa882ea4604403101a8038e0f4f347e7.png)

*Client capping*

### Client funding schedule

-   The funding schedule allows the user to set a list of fees and charges that occur on a regular basis.
-   Funding claims applicable for all admissions are setup in global schedules and attached to the relevant care types. Upon admission the client’s funding schedule lines will automatically be generated
-   Client specific funding claims such as Oxygen are added to the client funding schedule.
-   Billing codes that have been setup with a funding offset (such as Means Tested Care Fee or Hardship) will automatically generate the funding schedule claw back line or Hardship funding line when the fee is setup. The funding rate is associated with the billing rate with a negative of the rate on the billing schedule. Eg. Means test care fees will have a positive value on the billing schedule and a negative value on the funding schedule line and Hardship will have a negative value on the billing schedule line and a positive value on the funding schedule line.
-   Funding codes that have been setup as Accommodation payment associated (such as Accommodation supplement) will automatically have the rate reduced by the Assessed amount from the Accommodation payment line.

Navigate to: **Care services \> All customers \> Invoice\> Funding schedule**

1.  **Review** the automatically generated lines
2.  **Delete a line** – If there are any lines that do not apply to this client select the line to be deleted then click \<Mark as created in error\>. When all unwanted lines have been marked as created in error, tick the view marked in error. The lines that were marked created in error will be displayed, select all lines and click \<Delete\>. Untick the View marked in error to return to the billing schedule
3.  **Add a Billing schedule line** - Select **\<New\>** to add a client specific funding schedule line. A new line is created.
4.  **Service Group** - Select the Service group that relates to this client and care type
5.  **Funding code** – Select the required funding code
6.  **Service code** – Select the Service code for the service the client is related to and this line will be included on their funding claim.
7.  **Start date** - Enter the start date or first day that the funding will be paid for
8.  **End date** – Leave this blank unless there is a known End date. If the funding for this funding line ceases at any time, enter the last day the funding should be paid.
9.  **Amount** – System field – this will display the rate that applies on the current day
10. **Last calculated date** – System field – this will display the last date that has been generated in a funding claim

![](media/4c1a73bd9be32cc72ff0e0781fcbfa39.png)

*Funding Schedule*

### Client accommodation payment setup

-   All service entries generate an accommodation payment header.
-   The Supported/Accommodation payment status determines whether there is an accommodation payment required for this service entry. When an accommodation payment is not required, no accommodation payment line will be able to be created.

The available accommodation payment methods of payment options are the following:

-   **Lumpsum** (a refundable accommodation amount or contribution)
    -   If the government is helping with the costs, this is called a Refundable Accommodation Contribution (**RAC**).
    -   If the client is paying the full amount themselves, it’s called a Refundable Accommodation Deposit (**RAD**).
-   **DAP/DAC or Periodic** rental-style daily payments (**a** **daily accommodation payment or contribution**)
    -   If the government is helping with the costs, this is called a Daily Accommodation Contribution (**DAC**).
    -   If the client is paying the full amount themselves, it’s called a Daily Accommodation Payment (**DAP**).
-   or a **Combination** of both (for instance, the agreed amount is \$400,000 the client could choose to pay \$100,000 as a refundable lump sum, and the rest through non-refundable daily payments).

Navigate to: **Care services \> All customers \> Invoice\> Accommodation payment**

1.  Select **\<Add line\>** to add a new line.
2.  The **Effective date** will automatically populate from the client entry start date.
3.  Select **Payment method.**
4.  The **Accommodation cost** will automatically populate from the bed price in the place setup.
5.  The **Max DAP/DAC** is automatically calculated.
6.  Populate the **Assessed amount** for DAC.
7.  Populate the **Agreed amount.**
8.  The **Interest rate (MPIR)** will be automatically populated from the Accommodation Payment interest rates setup.
9.  The **Agreed interest rate** will be automatically populated but can be changed if a different rate has been negotiated. Note that the rate can’t be higher than the MPIR.
10. Populate the **Agreed Lumpsum** if the client is paying a lumpsum.
11. The **Ongoing interest forecast** (DAP/DAC amount) will be calculated when running the \<Accommodation Payment calculation\>.
12. The **Billing account name** defaults to the billing account type. Change to the Accommodation Payment account name if the DAP/DAC or unpaid interest is going to be draw down from the lumpsum. If the lumpsum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.

![](media/ad21799005be19dc4ca0bcdc67188875.png)

*Accommodation Payment*

### Client ingoing contribution setup

Accommodation payments where the supported/accommodation payment status is Ingoing contribution, will require setup for DMF/CRF

Navigate to: **Care services \> All customers \> Invoice\> Accommodation payment**

1.  Select the DMF/CRF tab and populate the DMF/CRF capital gain or capital loss percentage share
2.  Populate the Agreed amount and select the Billing account name
3.  Select the DMF/CRF Applicable rates tab
4.  Add a line and populate From and to Dates, the applicable DMF and CRF rates and codes
5.  Return to the Overview tab
6.  Select **\<Add line\>** to add a new line.
7.  Select Payment method, add agreed amount, agreed lumpsum and select the billing account anme
1.  Billing – Community and Disability Care
-   Services provided for community and disability clients can be imported manually or via integration as billing transactions in Dynamics 365 FO. Once they have been imported they are available to view or edit on the billing transactions view in the same way as any manually entered or system generated billing transactions
-   Billing invoices are generated for billing transactions with the same invoice number or if invoice numbers are not allocated then all of the transactions for a particular client and service code will be grouped into a single invoice
-   Billing transactions can also be generated from a billing schedule for any regular recurring fees.
-   The total amount will be generated and posted in a Billing journal.
-   Customer accounts are setup for organisations paying for the client service transactions.

### Generate billing transactions

Navigate to: Care services\> Billing\> Generate billing transaction**

1.  **Journal posting date –** Enter the posting date for the transaction
2.  **End date –** Enter the last date to be included in the scheduled billing run, ie. The date you want to bill to.
3.  Click on **\<Filter\>** - Use the filter options (Customer account, service code etc.) to select which clients or billing schedule lines will be included. The system will generate billing transactions for all clients where there are billing schedule lines that meet the filter requirements entered, so ensure that these filters allow the selection of only the billing schedule lines that you want to include.
4.  Click **\<OK\>** when the filters have all been entered
5.  Click **\<OK\>** to start the Generate billing transactions process unless you want to run it in batch processing or setup a recurrence – refer to steps 6 to 10 if this is required.
6.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
7.  *Click on* **\<Recurrence\>**
8.  *The default value is for the job to run once (End after: 1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
9.  *Click* **\<OK\>** *to close the Recurrence form.*
10. *Click* **\<OK\>** *to add the job to the batch queue.*

### Enter billing transactions

Navigate to: Care services\> Billing\> Billing transactions**

1.  Select **New billing transaction,** a pop up window will be displayed
2.  **Customer account –** Enter the customer account that is responsible for paying the invoice, this may be the client or a third party.
3.  **Client account –** Enter the Customer account for the client who received the service or item
4.  **Billing code –** Enter the Billing code required for the service or item to be billed
5.  **Start date –** Enter the date the service being billed for started to be provided or if it is an ongoing service enter the first day to be billed, usually the next day after the last date that has previously been billed. eg. If it is overnight accommodation enter the date of arrival here or if it is ongoing accommodation enter the first day to be billed. For items enter the date the item(s) was provided.
6.  **End date –** Enter the date the service being billed for ceased to be provided or the last day to be billed if it is an ongoing service. Eg. If it is overnight accommodation enter the departure date or if it is ongoing accommodation enter the last day to be billed. For items enter the date the item(s) was provided.
7.  **Rate –** Enter the per quantity rate
8.  **Quantity –** Enter the quantity to be billed
9.  **Amount –** The system will calculate the amount based on the rate and quantity
10. **Description** – The system will auto populate the description from the billing code, it can then be edited. The description is what will appear as the description on the transactions line of the customer invoice.
11. Select **\<OK\>** then **Refresh**
12. Open the billing transaction by clicking on the **Billing transaction id**
13. **Invoice number –** If this transaction is to be added with other transactions that have a specific invoice number add the invoice number. If this transaction will be invoice on its own or other transactions to be included on an invoice do not include an invoice number (ie. The invoice number will be system generated) leave the invoice number blank.
14. **Transaction type** – Only Billing and Adjustment are relevant to Community or Disability care. Billing is used for standard transactions, however if a transaction is an adjustment that is related to previous transactions and organisation policy is to identify these separately, the adjustment option can be selected.
15. **Provided by** – Enter the name of the person who provided the service if this is required
16. **Billing account name** – The system will default a Billing account name based on the settings, however if this is not correct select the correct Billing account name.
17. **External funding code** – Select the external funding code if there is a likelihood that this transaction may later be converted to a funding claim using the Funder switch function
18. **Service code** – if the client has a service entry this will default to the current service entry, however if there is no service entry or the service was provided by a different service code then this should be entered or edited.
19. **Client Reference** – Enter if a client reference number is required for the invoice or other reasons
20. **Method of payment** – Enter the method of payment only if it is required to be different from any other billing transactions for the customer or from their customer account. Any billing transactions with different Methods of payment will generate separate invoices
21. **Financial dimensions** – Enter the financial dimensions (cost centres etc.) for the control or debtor account part of the transaction. These do not have to be the same as the Offset dimensions but usually are.
22. **Offset dimensions** – Enter the financial dimensions (cost centres etc.) for the revenue account part of the transaction. These do not have to be the same as the Financial dimension but usually are.

### View billing transactions

Navigate to: Care services\> Billing\> Billing transactions**

1.  Billing transactions where the document status is **‘Open’** will display. Open status means they have not yet been included in a billing invoice.
2.  Select **\<Show all\>** to view all billing transactions if required.
3.  Ensure the correct customer number is selected if there is a customer organisation paying for the services provided. The client account is selected for the client who received the services.
4.  The following document status determines the status of the billing transactions.
    1.  **Open** – New Billing transaction
    2.  **Billing Invoice** – The billing transaction has been generated in a billing invoice. If the invoice is deleted the billing transaction status will be set back to Open.
    3.  **Billing journal** - There has been a billing journal generated from the billing invoice. Once the billing journal has been posted the billing invoice cannot be deleted.

### Edit billing transactions

Navigate to: Care services\> Billing\> Billing transactions**

1.  Only Billing transactions where the document status is **‘Open’** can be edited. Open status means they have not yet been included in a billing invoice.
2.  Open the billing transaction by clicking on the **Billing transaction id**
3.  **Billing transaction id –** is not editable
4.  **Invoice number –** If this transaction is to be added with other transactions that have a specific invoice number add the invoice number. If this transaction will be invoice on its own or other transactions to be included on an invoice do not include an invoice number (ie. The invoice number will be system generated) leave the invoice number blank.
5.  **Transaction type** – Only Billing and Adjustment are relevant to Community or Disability care. Billing is used for standard transactions, however if a transaction is an adjustment that is related to previous transactions and organisation policy is to identify these separately, the adjustment option can be selected.
6.  **Customer account –** Is not editable. Customer is the customer account that is responsible for paying the invoice, if this is incorrect the billing transaction should be deleted and a new transaction entered.
7.  **Client account –** Is not editable.  The client is the person who received the service or item, if this is incorrect the billing transaction should be deleted and a new transaction entered.
8.  **Description** – Edit the description if required. The description is what will appear as the description on the transactions line of the customer invoice.
9.  **Provided by** – Enter the name of the person who provided the service if this is required
10. **Billing account name** – If the Billing account name is incorrect select the correct Billing account name.
11. **Billing code –** If the billing code is incorrect select the correct Billing code for the service or item to be billed
12. **External funding code** – Select the external funding code if there is a likelihood that this transaction may later be converted to a funding claim using the Funder switch function
13. **Service code** – if the client has a service entry this will default to the current service entry, however if there is no service entry or the service was provided by a different service code then this should be entered or edited.
14. **Quantity –** If the Quantity is incorrect enter the correct quantity to be billed
15. **Rate –** If the Rate is incorrect enter the correct per quantity rate
16. **Amount –** The amount is not editable. The system will calculate the amount based on the rate and quantity
17. **Start date –** If the start date is incorrect enter the correct start date. The Start date is the date the service being billed for started to be provided or if it is an ongoing service enter the first day to be billed, usually the next day after the last date that has previously been billed. eg. If it is overnight accommodation enter the date of arrival here or if it is ongoing accommodation enter the first day to be billed. For items enter the date the item(s) was provided.
18. **End date –** If the End date is incorrect enter the correct End date. The end date is the date the service being billed for ceased to be provided or the last day to be billed if it is an ongoing service. Eg. If it is overnight accommodation enter the departure date or if it is ongoing accommodation enter the last day to be billed. For items enter the date the item(s) was provided.
19. **Client Reference** – If the Client reference number is incorrect or blank enter a client reference number
20. **Method of payment** – If the method of payment is incorrect or blank you can enter the method of payment. This is only required if it is to be different from any other billing transactions for the customer or from their customer account. Any billing transactions with different Methods of payment will generate separate invoices
21. **Financial dimensions** – Enter the financial dimensions (cost centres etc.) for the control or debtor account part of the transaction. These do not have to be the same as the Offset dimensions but usually are.
22. **Offset dimensions** – Enter the financial dimensions (cost centres etc.) for the revenue account part of the transaction. These do not have to be the same as the Financial dimension but usually are.

### Delete billing transactions

Navigate to: Care services\> Billing\> Billing transactions**

1.  Only Billing transactions where the document status is **‘Open’** can be deleted. Open status means they have not yet been included in a billing invoice.
2.  Select the billing transaction to be deleted and confirm that it is the only billing transaction that you have selected or if there are multiples check only Billing transactions that you want to delete are highlighted.
3.  Select **\<Delete\>**

### Generate billing invoices

Navigate to: Care services\> Billing\> Generate Billing invoices**

1.  **Invoice date –** Enter the required invoice date, usually the date the invoice is being generated or may be based on the day or month the services were provided.
2.  Click on **\<Filter\>**
3.  Specify the required criteria for generating the billing invoice (customer account, service code). The system will generate billing invoices for all clients where there are billing transactions that meet the filter requirements entered, so ensure that these filters allow the selection of only the transactions that you want to include.
4.  Click **\<OK\>**
5.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
6.  *Click on* **\<Recurrence\>**
7.  *The default value is for the job to run once (End after: 1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
8.  *Click* **\<OK\>** *to close the Recurrence form.*
9.  *Click* **\<OK\>** *to add the job to the batch queue.*

### View billing invoices and generate billing journal

Navigate to: Care services\> Billing\> Billing invoices**

1.  Billing invoices that have not had a journal raised yet will display on the billing invoice list.
2.  Select **\<Show all\>** to view all billing invoices if required.
3.  Click on the relevant **Billing invoice id** to view the billing invoice details.
4.  Click on **\<Generate billing journals\>** to generate a billing journal from the relevant invoice.
5.  Refer to the ‘Generate billing journals’ section to generate billing journals for all billing invoices yet to be processed.

### Generate billing journals

Navigate to: Care services\> Billing\>Generate Billing journals**

1.  Select the Billing journal type from the drop-down menu.
2.  Click on **\<Filter\>**
3.  Specify the required criteria for generating the billing journals (customer account, billing account). The system will generate billing journals for all clients where there are billing invoices that meet the filter requirements entered, so ensure that these filters allow the selection of only the invoices that you want to include.
4.  Click **\<OK\>**
5.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
6.  *Click on* **\<Recurrence\>**
7.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
8.  *Click* **\<OK\>** *to close the Recurrence form.*
9.  *Click* **\<OK\>** *to add the job to the batch queue.*

### Review and post billing journals

Navigate to: Care services\> Billing\>Journals\> Billing journal**

1.  The billing journal list will show journals that have not been posted.
2.  Select ‘All’ or ‘Posted’ in the ‘Show’ drop down menu to view posted journals if required.
3.  Select the ‘Show user-created only’ to show journals you have created.
4.  Select the relevant journal to review.
5.  Click on ‘Journal batch number’ or **\<Lines\>** to open the billing journal.
6.  Review the details and then click **\<Post\>** to post the journal.
2.  Billing – Residential Care services and Retirement Villages
-   Manual journals can be entered or imported into the system.
-   Journals can be generated from the billing schedules by running the Billing journal proposal. The proposal utilises the Billing schedule to automatically generate transactions up to the selected end date.
-   Fees can be split to be paid by different parties such as family members or third-party organisations.

### Billing journal proposals

Navigate to: Care services\> Billing\>Journals\> Billing journal**

-   The billing journal proposal end date controls the billing being generated.
-   If the client has not been billed before, then the billing will be generated from the start day on the billing schedule to the end date on the billing proposal.
-   If the client has been billed before, then there will be a ‘Last run date’ om the billing schedule line. The billing proposal will generate fees from the day after the ‘Last run date’ to the end date on the billing proposal.
-   There are multiple billing proposal options:

    **Billing journal proposal** – used to generate billing up to a specified date for a specified client(s) or service(s) from the billing schedule lines.

    **Consolidate journal lines** – used to combine lines when there are multiple journal lines in the same journal for the same customer, billing code & service code.

    **Billing journal adjustment proposal** – used to propose adjustments where there has been a change, such as a Departure or a rate change, that requires billing to be reversed and re-charged.

    **Accommodation payment proposal** – used to charge unpaid interest and DAPs or DACs related to an accommodation payment.

    **Interest payable to client proposal** – used to calculate interest payable to a departed client with an accommodation payment that has not yet been refunded.

    **DMF/CRF proposal** – used to charge the deferred management and capital refurbishment fees for a retirement living lump sum payment.

    **Exceeded leave adjustment proposal** – used to calculate any fees due to leave taken exceeding the Department of Health caps.

![](media/81e1f10f898bc8b79e2100e2a039aabd.png)

*Billing Journal proposal options*

### Generate Billing journal proposal

Navigate to: **Care services \> Billing \> Journals \> Billing Journals**

1.  Click on **\<New\>** to create a new billing journal.
2.  Select the relevant billing journal from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **\<Lines\>**
5.  Go to Billing proposal options \> Billing journal proposal.
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
9.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
10. Click on **\<Filter\>**
11. Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
12. Click **\<OK\>**
13. *If required, setup the job to run in the background. Select Batch processing to Yes.*
14. *Click on \<Recurrence\>*
15. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
16. *Click \<OK\> to close the Recurrence form.*
17. *Click \<OK\> to add the job to the batch queue.*
18. The relevant lines will propose in the billing journal.

### Review and post Billing journal

Navigate to: **Care services \> Billing \> Journals \> Billing Journals**

1.  The billing journal list will show journals that have not been posted.
2.  Select ‘All’ or ‘Posted’ in the ‘Show’ drop down menu to view posted journals.
3.  Select the ‘Show user-created only’ to show journals you have created.
4.  Select the relevant journal to review.
5.  Click on ‘Journal batch number’ or **\<Lines\>** to open the billing journal.
6.  Review the details and then click **\<Post\>** to post the journal.

### Third party billing

Navigate to: **Care services \> All Customers \>Invoice \> Billing journal schedule**

1.  Select the line for the fee paid by a third party.
2.  Click on **\<Billing invoicee\>**
3.  Click on **\<Edit\>**
4.  Select the relevant third party in the customer account (Refer to the Customer Management section for instructions on how to add customers)
5.  Propose the billing journal. The transactions will be posted to the third-party customer account.

**![](media/a65aa7248ec832cae480a4ec911280fc.png)**

*Billing invoice – Third Party*

### Split billing

Navigate to: **Care services \> All Customers \>Invoice \> Billing journal schedule**

1.  Select the line for the fee to be paid by multiple parties.
2.  Click on **\<Billing invoicee\>**
3.  Click on **\<Edit\>**
4.  Select the first customer account and the percentage rate.
5.  Click on **\<New\>** to create a new line, populate the second customer account, copy the accommodation payment reference from line 1 and the percentage rate.
6.  Note that the total percentage must be 100.

*![](media/56d97c501f855e5c7deb847ae33735e5.png)*

*Billing invoice - Split billing*

### Consolidate journal lines

The consolidation process is used when there are multiple journal lines in the same journal for the same customer, billing code & service code to combine the lines.

Navigate to: **Care services \> Billing \> Journals \> Billing Journals\> Lines**

1.  Go to Billing proposal options \> Billing journal proposal.
2.  Select **\<Consolidate journal lines\>**
3.  Click **\<OK\>** to consolidate the relevant lines.

### Billing schedule and rate adjustments

-   Billing schedule adjustments such as adding or ending fees and changes to the billing rates are managed via the client billing schedule.
-   Global rate updates such as Basic Daily Care fee will not require a separate update for each client. The rate will be automatically updated for the relevant clients.

Navigate to: **Care services \> All Customers \>Invoice \> Billing journal schedule**

1.  Select the line for the fee to be adjusted.
2.  Populate the end date if the fee is no longer billed. Leave it blank if the fee is still applicable.
3.  To update the billing rate, Click on **\<Billing rates\>**
4.  Populate an end date on the existing rate.
5.  Click **\<New\>** to create a new line.
6.  Populate the new start date and new amount.
7.  Click **\<Save\>** and close the Billing rates form.
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

Navigate to: **Care services \> Billing \> Journals \> Billing Journals\> Lines**

1.  Go to Billing proposal options \> Billing journal proposal.
2.  Select **\<Billing journal adjustment proposal\>**
3.  Populate the journal posting date.
4.  Populate the end date.
5.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
6.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
7.  Click on **\<Filter\>**
8.  Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
9.  Click **\<OK\>**
10. *If required, setup the job to run in the background. Select Batch processing to Yes*
11. *Click on \<Recurrence\>*
12. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
13. *Click \<OK\> to close the Recurrence form.*
14. *Click \<OK\> to add the job to the batch queue.*
15. The total fee billed in advance will be reversed.
16. There will be two new lines proposed.
17. One line will be for the relevant days on the old billing rate.
18. The second line will be for the relevant days on the new billing rate.

### Billing Capping limits

-   Capping limits are the amounts specified by the government as the maximum annual or lifetime amount that can be charged of a particular type of fee such as means tested fees or income tested fees.
-   If the ‘allow charge beyond capping limits’ is set to yes, then the billing will continue even if the cap has been reached.
-   When the parameter is set to No, the billing will end when the capping limit has been reached.
-   Prior to generating the billing journal, ensure the capping limit setup has been completed for the client (Path: **Care services \> All Customers \> Set up \> Capping limits setup)
-   The client capping calculation periodic job updates the client capping limit setup after posting the journal.

Navigate to: **Care services \> Billing \> Journals \> Billing Journals\> Lines**

1.  Go to Billing proposal options \> **Billing journal proposal**
2.  Populate the journal posting date.
3.  Populate the end date.
4.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
5.  If required, filter on Advance or Arrears so that billing can be generated only for billing codes with advance or arrears selected on the billing code configuration.
6.  Click on **\<Filter\>**
7.  Specify the required criteria for generating the billing journals (customer account, Service code, billing code)
8.  The capped amount will propose when the annual or lifetime cap has been reached.
9.  Validate and post the journal.

# Accommodation Payments

Prior to generating Accommodation payment transactions, ensure the Accommodation payment setup has been completed for the client (Path: **Care services \> All Customers \> Invoice \> Set up \> Accommodation payment)

### Accommodation payment lumpsum invoice

Navigate to: **Care services \> Billing \> Journals \> Billing Journals**

1.  Click on **\<New\>** to create a new billing journal.
2.  Select the **relevant accommodation payment lumpsum invoice** journal from the drop-down menu
3.  Populate a meaningful description.
4.  Click on **\<Lines\>**
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

Navigate to: **Care services \> All customers \> Invoice\> Accommodation payment**

1.  Change the **Billing account name** on the accommodation payment line to the relevant accommodation payment billing account name.
2.  When the lumpsum invoice has been fully or partially paid, the DAP/DAC and unpaid interest amounts will be drawn down from the lumpsum reducing the refundable balance.
3.  If the lumpsum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.

### Fees drawn down from RAD/RAC

Fees can be drawn down from the lumpsum balance.

Navigate to: **Care services \> All customers \> Invoice\> Billing Schedule**

1.  Select the fee to be drawn down from the accommodation payment lumpsum.
2.  Click on **\<Billing invoicee\>**
3.  Change the **Billing account name** to the relevant accommodation payment billing account name.
4.  When the lumpsum invoice has been fully or partially paid, the fee will be drawn down from the lumpsum reducing the refundable balance.
5.  If the lumpsum has not been fully or partially paid, the DAP/DAC and unpaid interest will be billed to the client.
6.  Follow the steps in the **Billing journal proposal** section to generate the transactions.

![](media/3e511a525ae57fe6e9395bbdd31dbfa8.png)

*Change Billing account name for fee to be drawdown from the accommodation payment.*

### Adjustments to Fees drawn down from RAD/RAC

Clients may request fees billed in advance to be drawn down from the accommodation payment lumpsum when it has been paid.

Navigate to: **Care services \> All customers \> Invoice\> Billing Schedule**

1.  Select the fee to be drawn down from the accommodation payment lumpsum.
2.  Populate an **\<End date\>** and **\<Bill to date\>** for the day before the lumpsum receipt.
3.  Create a new line for the same fee with a start date the day the lumpsum was paid.
4.  Go to **\<Billing Invoicee\>**
5.  Change the Billing account name to the accommodation payment type.
6.  Follow the steps in the **Billing journal adjustment section** to propose the adjustments.
7.  The fees billed in advance will be reversed and two new lines generated, one for the fees billed up to the date of receipt and the second line for the drawdowns.

### Managing changes to the accommodation payments

-   Client’s DAC amount is regularly reviewed, and the amounts may require adjustments.
-   DAC assessed amounts will automatically reduce the amount of accommodation supplement in the Funding schedule.
-   The client may decide to change the payment method (e.g. from Lumpsum to Combination or from DAP/DAC to Combination etc)
-   These adjustments are managed by adding a new accommodation payment line with the effective date and new values.

Navigate to: **Care services \> All customers \> Invoice\> Accommodation payment**

1.  Populate the relevant **end date** on the current accommodation payment line.
2.  Click on **\<Add line\>** to add a new line.
3.  If the **payment method** is changed, the select the relevant payment method.
4.  Update the **agreed lumpsum** if required.
5.  If the **DAC amount** is changed, update the **Assessed amount.**
6.  Click on **\<Save\>** to save the changes on the new line.
7.  Click on **\<Accommodation Payment calculation\>** to update the accommodation payment form details.
8.  The adjustments will be proposed in the subsequent accommodation payment billing proposal.

### Accommodation payment billing proposal

Navigate to: **Care services \> Billing \> Journals \> Billing Journals**

1.  Click on **\<New\>** to create a new billing journal.
2.  Select the **relevant billing journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **\<Lines\>**
5.  Go to Billing proposal options \> **Accommodation Payment proposal.**
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Select ‘Include departed clients’ or ‘Departed clients only’ if required.
9.  Select ‘Include ongoing interest’ to include DAP/DAC/Periodic interest calculations.
10. Select ‘Include unpaid lumpsum interest’ to include interest calculations on unpaid lumpsum (RAD/RAC)
11. Click on **\<Filter\>**
12. Specify the required criteria for generating the billing journals (customer account, Service code)
13. Click **\<OK\>**
14. *If required, setup the job to run in the background. Select Batch processing to Yes*
15. *Click on \<Recurrence\>*
16. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
17. *Click \<OK\> to close the Recurrence form.*
18. *Click \<OK\> to add the job to the batch queue.*
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

Navigate to: **Care services \> Billing \> Journals \> Billing Journals**

1.  Click on \<New\> to create a new billing journal.
2.  Select the **relevant billing journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **\<Lines\>**
5.  Go to Billing proposal options \> **Interest payable to client proposal.**
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Click on **\<Filter\>**
9.  Specify the required criteria for generating the billing journals (customer account, Service code)
10. Click **\<OK\>**
11. *If required, setup the job to run in the background. Select Batch processing to Yes.*
12. *Click on \<Recurrence\>*
13. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
14. *Click \<OK\> to close the Recurrence form.*
15. *Click \<OK\> to add the job to the batch queue.*
16. The interest payable transactions will be calculated and proposed.
17. There will be two lines if the lumpsum has not been refunded within 14 days.
18. The first line will be calculated and proposed using the base rate for 14 days.
19. The second line will be calculated with the Max permissible interest rate (MPIR)
20. Validate and post the journal.

### DMF/CRF proposal

-   In addition to the accommodation charges in retirement villages, the client can also be charged Deferred Management Fees (DMF) and Capital Refurbishment fees (CRF).
-   These can only be defined for the Accommodation payment status “Ingoing contribution”.

Navigate to: **Care services \> Billing \> Journals \> Billing Journals**

1.  Click on \<New\> to create a new billing journal.
2.  Select the relevant billing journal from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on \<Lines\>
5.  Go to Billing proposal options \> DMF/CRF proposal.
6.  Populate the journal posting date.
7.  Populate the end date.
8.  Select DMF Yes to include DMF transactions
9.  Select CRF Yes to include CRF transactions.
10. Click on **\<Filter\>**
11. Specify the required criteria for generating the billing journals (customer account, Service code)
12. Click **\<OK\>**
13. *If required, setup the job to run in the background. Select Batch processing to Yes.*
14. *Click on \<Recurrence\>*
15. *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
16. *Click \<OK\> to close the Recurrence form.*
17. *Click \<OK\> to add the job to the batch queue.*
18. The relevant lines will be proposed in the journal.
19. The Rate in the journal is calculated based on the rates in Accommodation payment \> DMF/CRF Applicable Rates for the applicable period.
20. Validate and post the journal.

# Collection letters

-   The collection letter sequence setup allows for a different setup for non-deceased vs deceased Residential Care services residents and Community care clients.
-   The required sequence for residential Care services vs community care clients is specified on each billing account name.
-   To generate the collection letter and email, ensure the client address or email has the purpose ‘Collection letter note’.
-   If required, the logo from another legal entity can be used when creating the collection letter.

### Collection letters – Residential Care services

Navigate to: Credit and collections\> Collection letter**

1.  Select **‘Create Residential care collection letters’**.
2.  Populate the collection letter date.
3.  Select the billing account name and legal entity for branding.
4.  Click on \<Filter\> to specify customer or other criteria if required.
5.  Click on \<Ok\> to create the residential care collection letters.
6.  Go to **‘Review and process collection letters’**.
7.  Filter on Collection letter type = Residential care.
8.  Validate the collection letter code.
9.  To print the selected letter, go to **Print\>Collection letter note.**
10. Validate the details on the letter and email.
11. Go to ‘**Post collection letters’.**
12. Populate the posting date and click on Filter to specify any additional criteria if required.
13. Click \<OK\> to update the collection letter status to posted.
14. Repeat the process, the next collection letter code will be generated as per setup in the relevant collection letter sequence.

### Collection letters – Community care

Navigate to: Credit and collections\> Collection letter**

1.  Select **‘Create community care collection letters’**.
2.  Populate the collection letter date.
3.  Select the billing account name and legal entity for branding.
4.  Click on \<Filter\> to specify customer or other criteria if required.
5.  Click on \<Ok\> to create the community care collection letters.
6.  Go to **‘Review and process collection letters’**.
7.  Filter on Collection letter type = community care.
8.  Validate the collection letter code.
9.  To print the selected letter, go to **Print\>Collection letter note.**
10. Validate the details on the letter and email.
11. Go to ‘**Post collection letters’.**
12. Populate the posting date and click on Filter to specify any additional criteria if required.
13. Click \<OK\> to update the collection letter status to posted.
14. Repeat the process, the next collection letter code will be generated as per setup in the relevant collection letter sequence.

# Receipts

-   Payments of agreed lumpsum or other fees and charges are posted in Receipt journals.
-   Direct Debit payments can be proposed in receipt journals and the relevant bank file generated. Ensure the client bank account and method of payment is setup to be included in the Direct Debit proposals.
-   Clients may also have a direct debit limit or a Pre-set direct debit amount.

### Accommodation payment lumpsum receipt

Navigate to: **Care services \> Journals\> Receipt journal**

1.  Click on **\<New\>** to create a new receipt journal.
2.  Select the **relevant lumpsum receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **\<Lines\>**
5.  Populate the date of receipt.
6.  Select Client account.
7.  Click **\<Save\>**
8.  Click on **\<Settle transactions\>**
9.  Select the Lumpsum invoice and select the **\<Mark\>** check box
10. If the amount **is not paid in full**, then populate the relevant amount paid in the ‘**Amount to settle’.**
11. Click **\<OK\>**
12. Populate a Description
13. Select Billing account name for accommodation payment.
14. Ensure the client’s accommodation payment if is populated.
15. Ensure the Bank offset account is populated.
16. Validate and post the journal.

### Manual receipt

Navigate to: **Care services \> Journals\> Receipt journal**

1.  Click on **\<New\>** to create a new receipt journal.
2.  Select the **relevant receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **\<Lines\>**
5.  Populate the date of receipt.
6.  Select Client account.
7.  Click **\<Save\>**
8.  Click on **\<Settle transactions\>**
9.  Select the relevant invoice(s) and select the \<Mark\> check box.
10. Click **\<OK\>**
11. Populate a Description
12. Select Billing account name.
13. Ensure the Bank offset account is populated.
14. Validate and post the journal.

### Direct Debit limits and pre-set amounts

-   Clients can request a direct debit limit where the amount proposed will be no more than the limit setup or the total of their invoices if that amount is lower.
-   Clients can request pre-set direct debit amount where the pre-set amount is always proposed.
-   The bank account and method of payment must be setup.

Navigate to: **Care services \> All customers**

1.  Click on **\<Account\>** to open the customer form.
2.  Click on **\<Edit\>**
3.  Navigate to Payment defaults.
4.  Populate the ‘**Direct debit limit’.**

    **OR**

5.  If the client has requested a pre-set amount, then set the ‘**Enable pre-set direct debit amount’** to Yes.
6.  Select the **Service code** for the direct debit.
7.  Populate the **Pre-set direct debit amount.**
8.  Click **\<Save\>** and close the form.

### Direct Debit Proposal

-   Ensure the clients’ method of payment and bank accounts have been setup.
-   Setup the direct debit limits or Pre-set direct debit amounts.

Navigate to: **Care services \> Journals\> Receipt journal**

1.  Click on **\<New\>** to create a new receipt journal.
2.  Select the **relevant receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on **\<Lines\>**
5.  Go to payment proposal \> **Create payment proposal.**
6.  Populate date range if required to exclude open invoices.
7.  Select the ‘Apply Direct debit limits’ **OR** ‘Apply pre-set direct debit amount and limit’.
8.  Click on **\<Filter\>** to select Customer account, service code, method of payment.
9.  Select the **Billing account name for billing** to exclude accommodation payment drawdowns.
10. Click **\<OK\>**
11. Populate a Description
12. Select Billing account name.
13. Ensure the Bank offset account is populated.
14. Click on **Functions \> Generate payments.**
15. Select Method of payment, populate file name and select bank account.
16. Click **\<OK\>** and **\<OK\>** for the reporting form.
17. The bank file will be generated and can be uploaded to the bank.
18. Validate and post the journal when the bank file has been successfully uploaded to the bank.

# Funding

-   Funding is the most common income for Care services providers.
-   Transactions related to funding will not appear in the Customer transactions form because they are not related to the customer balance.
-   Funding claims for Community and Disability service providers can be imported via the data migration framework.
-   The funding claims for residential Care services providers will be generated from the residents’ funding schedules.
-   The Funding claim form will group all relevant funding claims to generate the funding claim file.

### Generate funding claims

Navigate to: **Care services \> Funding \> Generate Funding Claims**

1.  Populate the End date.
2.  Click on **\<Filter\>**
3.  Specify the required criteria for generating the funding claims (Service code or client account)
4.  Click **\<OK\>**
5.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
6.  *Click on \<Recurrence\>*
7.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
8.  *Click \<OK\> to close the Recurrence form.*
9.  *Click \<OK\> to add the job to the batch queue.*
10. The relevant funding claims will be generated with the Document status = Open

### Generate funding claim form

Navigate to: **Care services \> Funding \> Funding Claim form**

1.  Click on **\<New funding claim form\>**
2.  Select Billing account name.
3.  Click on **\<Filter\>**
4.  Specify the required criteria for generating the funding claim form (End date, client account)
5.  Click **\<OK\>**
6.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
7.  *Click on \<Recurrence\>*
8.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
9.  *Click \<OK\> to close the Recurrence form.*
10. *Click \<OK\> to add the job to the batch queue.*
11. The funding claim form will be generated with all the relevant funding claims.
12. Populate the description, claim year, and claim month.

### Generate funding claim form file

Navigate to: **Care services \> Funding \> Funding Claim form**

1.  Select the relevant funding claim form.
2.  Validate the data on the funding claim form lines.
3.  Click on **\<Generate funding claim form file\>**
4.  Click **\<OK\>**
5.  The file will be generated for the relevant billing account type.

### Generate funding journal

Navigate to: **Care services \> Funding \> Funding Claim form**

**OR**

****Care services \> Funding \> Generate funding journals**

1.  Select the relevant funding claim form.
2.  Validate the data on the funding claim form lines.
3.  Click on **\<Generate funding journal\>**
4.  Populate Transaction date.
5.  Click **\<OK\>**
6.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
7.  *Click on \<Recurrence\>*
8.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
9.  *Click \<OK\> to close the Recurrence form.*
10. *Click \<OK\> to add the job to the batch queue.*
11. The funding journal will be generated.

### Review and post funding journal

Navigate to: **Care services \> Funding \> Journals \> Funding journal**

1.  Select the relevant funding journal.
2.  Click on **\<Lines\>**
3.  Validate the data on the funding journal lines.
4.  Click on **\<Post\>** to post the journal.

### Import funding claim payment statement

Payment statements must be downloaded from PRODA Care services Online Services (in a CSV format)

Navigate to: **Care services \> Funding \> Funding claim payment statement**

1.  Click on **\<New\>**
2.  Select **\<Billing account name\>**
3.  Click on **\<Import statement\>**
4.  Click on **\<Browse\>** to browse and select the required payment statement file for import.
5.  Click **\<Upload\>**
6.  Click **\<OK\>**
7.  Click on the **‘Refresh**’ button in the top right corner to refresh the form.
8.  The statement lines will display.

![](media/e906818ecc1787da4443d13436f84eea.png)

*Funding payment statement*

### Funding reconciliation

Navigate to: **Care services \> Funding \> Funding reconciliation**

1.  Click on **\<New\>**
2.  Select **\<Billing account name\>**
3.  Select **\<Funding payment statement id\>**
4.  Populate the **Department service ID.**
5.  Populate the **To date.**
6.  Click **\<OK\>**
7.  Select **\<Worksheet\>** to open the Funding Reconciliation worksheet.
8.  The worksheet is divided into three sections:
    -   **Unmatched transactions**

        The unmatched transactions are vertically split between ledger transactions originating from the Funding journals (left) and imported transactions from the imported statement (right).

    -   **Matched transactions**

        The matched transactions section displays all transactions that have been manually matched or matched via the matching rules.

    -   **Accepted transactions.**

        The accepted transactions section displays all transactions that have been accepted. These are payments on the payment statement that were not on the claim.

9.  Select \<**Run matching rules**\> to match Funding claims with the Statement line.
10. Transactions that were matched successfully will be transferred to the “Matched transactions” section.
11. Select \<**Match**\> to manually match funding claims with statement lines. Any variances in the amounts will automatically create adjustment transactions.
12. Select \<**Accept selected**\> on the **Funding claims** to accept that a funding claim will not be paid. There will be an automatic adjustment transaction created.
13. Select \<**Accept selected**\> on the **Statement lines** to accept a payment that was not on the Funding claim. There will be an automatic adjustment transaction created.
14. Select \<**Add Statement Line**\> to add an amount that has been paid but was not on the Funding Claim. There will be an automatic adjustment transaction created.
15. Any unmatched funding claims will carry across to the subsequent month’s funding claim and will be available for matching when the payment has been received on the payment statement.
16. Close the worksheet when all relevant transactions have been matched.
17. Select \<**Post and Reconcile**\> to generate a Funding Reconciliation Journal

![](media/9c540f859f9fe6de452d9872844a3b40.png)

*Funding reconciliation worksheet*

### Review and post Funding reconciliation journal

Navigate to: **Care services \> Funding \> Journals \> Funding reconciliation journal**

1.  Select the relevant journal.
2.  Click on **\<Lines\>**
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

Navigate to: **Care services \> All customers \> Collect \> Client refund proposal**

1.  Select ‘Partial refund’ in the Refund type and click \<Ok\>
2.  Select the credit invoice(s) by ticking the ‘Mark’ check box
3.  Click on \<Create journal\>
4.  Go to Journals\> Billing Journal and select the automatically created journal
5.  Validate and post the journal.
6.  The amount has now been transferred to the resident vendor account

### Bed transfer – transfer within the same facility (service)

Navigate to: **Care services \> All customers \> **Care services \> Service entries**

1.  Open the service entry the resident is departing from.
2.  Navigate to the **Transfer** section.
3.  Click **\<Add\>**
4.  Select the new bed from the **‘Transfer to’** drop-down menu.
5.  Populate the ‘**Transfer date’**
6.  Populate a **‘Transfer description’**
7.  Click **\<OK\>**
8.  The transfer line will be generated.

    ![](media/379b33a7c29199e15166bc6614410731.png)

    *Transfer*

9.  If required, **process a refund** if the new bed price is less than the original one or another invoice if the bed price is more than the original (subject to reason for the bed move)
10. Go to **Invoice \> Accommodation Payment**
11. Populate an **\<End date\>** on the line.
12. Click **\<Save\>** to save the details.
13. Click on **\<Add line\>** to add a new line.
14. Populate Effective date and new **‘Agreed amount’** and **‘Agreed lumpsum’.**
15. **Process the difference in bed price:**
16. Go to Care services\> Billing \> Billing journal.
17. Create a new accommodation payment lumpsum invoice journal.
18. Populate the date and select the client account.
19. Select the billing account name for the accommodation payment refund
20. Select the Service code.
21. Select the Billing Code for the partial refund (as specified in care services parameters \> journals \> Partial refund billing code) OR the lumpsum invoice billing code for the invoice
22. Populate the start and end dates.
23. Add the refund amount credit in the Rate (e.g., -100 000) or additional invoice amount in debit
24. Validate and post the journal.
25. **Refund via All Customers\> Collect\> Client refund proposal:**
26. Select ‘Partial refund’ in the Refund type and click \<Ok\>
27. Select the credit invoice by ticking the ‘Mark’ check box
28. Click on \<Create journal\>
29. Go to Journals\> Billing Journal and select the automatically created journal
30. Validate and post the journal.
31. The refund amount has now been transferred to the resident vendor account

### Transfer to another facility (service)

Navigate to: **Care services \> All customers \> **Care services \> Service entries**

1.  Open the service entry the resident is departing from.
2.  Populate **\<Departure Date\>**
3.  Populate **\<Departure Notice Date\>**
4.  Select the Transfer **\<Departure Reason\>**
5.  Click **\<Save\>** and close the form.
6.  Click on **\<New\>** to add the new service entry.
7.  Populate the relevant details.
8.  Click **\<Save\>** and close the form.
9.  The previous facility home address purpose will be changed to ‘Other’
10. The new facility address details will automatically be created with the purpose = Home

    ![](media/0a1764a721f7f302833526fc38b39f05.png)

*Client addresses*

11. Go to Invoice\> Accommodation payment.
12. A new **accommodation payment header** has been created for the new facility.
13. Select the new header and click on **\<Add line\>**
14. Populate the Agreed amount and Agreed Lumpsum and other relevant details.
15. Click on **\<Save\>** and close the form.
16. **Refund via All Customers\> Collect\> Client refund proposal:**
17. Select the accommodation payment id for the service the resident is departing from
18. Select ‘Full refund’ in the refund type
19. Click \<OK\>
20. Validate details and then click on \<Create journal\>
21. Navigate to the automatically created billing journal
22. Review the details, then validate and post the journal
23. The balance has now been transferred to the resident vendor account
24. Go to ****Care services \> Billing\> Billing Journals**
25. Create a new Accommodation Payment Lumpsum invoice billing journal.
26. Populate Date, Client account and Billing account name for the accommodation payment.
27. Populate Service code for the **new facility.**
28. Select the Billing code for the accommodation payment lumpsum transfers.
29. Select the **new accommodation payment ID.**
30. Populate start and end dates.
31. Populate the agreed lumpsum amount.
32. Validate and post the journal.
33. Go to ****Care services \> Journals \> Receipt journal** and create a new **Lumpsum receipt** journal.
34. Populate the date, client account and description.
35. Select the service code for the **new facility** and **billing account name** for the accommodation payment.
36. Select the **new accommodation payment ID.**
37. Click on \<Settle transactions\> to mark the invoice for the agreed lumpsum in the new facility.
38. Select Offset account type = Vendor
39. Select Offset account = The resident vendor account
40. Validate and post the journal.

### Departures

Navigate to: **Care services \> All customers \> **Care services \> Service entries**

1.  Open the service entry the resident is departing from.
2.  Populate **\<Departure Date\>**
3.  Populate **\<Departure Notice Date\>.** Departure notice date prior to the actual departure date will impact on the Interest Payable calculations.
4.  Select the **\<Departure Reason\>**
5.  Select the **\<Deceased\>** flag if the client is deceased.
6.  When the probate has been received, populate the **Probate/Admin letter** date.
7.  Click on **\<Save\>** and close the form.
8.  Propose the interest payable in the Billing journal (refer to the billing journal section for more information)
9.  Go to ****Care services \> All Customers \> Invoice \> Accommodation Payments**
10. Run the **‘Accommodation payment calculation’** to ensure all balances are updated.
11. **Refund via All Customers\> Collect\> Client refund proposal:**
12. Select the accommodation payment id
13. Select ‘Full refund’ in the refund type
14. Click \<OK\>
15. Validate details and then click on \<Create journal\>
16. Navigate to the automatically created billing journal
17. Review the details, then validate and post the journal
18. The balance has now been transferred to the resident vendor account

### Process the refund in a Vendor payment journal

Navigate to:** **Accounts payable \> Payments\> Vendor payment journal**

1.  Click on \<New\> to create a new journal, select the Name and click on Lines to open the journal
2.  Select the vendor account
3.  Click on \<Save\> and then \<Settle transactions\>
4.  Select the invoice(s) to refund
5.  Click on \<Generate Payments\>
6.  Select Method of payment
7.  Select the bank account.
8.  Click \<OK\> to generate the bank file
9.  Validate and post the journal.

### Reversing an accommodation payment refund

This process is used to reverse the full refund when a resident has been departed from the service entry. The full refund has been generated, to the point of the refund journal being posted to AP, but not yet paid to the client or their estate.

As the Accommodation Payment has already been fully refunded and cannot be refunded again there needs to be a new Accommodation payment header setup to enable the refund to be processed again later when it is ready

This process will:  
\- reset the accommodation payment record and the liability account  
\- allow the Interest payable to be generated on the new accommodation payment and   
\- allow the new accommodation payment to be refunded when ready.

Navigate to: **Care services \> All customers \> **Care services \> Service entries**

1.  Click on \<New\> to create a new service entry
2.  Populate the same details as the original service entry, use the departure date from the original service entry to populate the entry, billing end date and departure date (overlaps are not allowed so the original entry date can’t be used for this purpose)

Navigate to:** ****Care services \> All customers \> Invoices \> Accommodation payments**

1.  Select the new accommodation payment header
2.  Click on \<Add line\>
3.  Populate the End date
4.  Add the refundable balance in the agreed amount

Navigate to:** ****Care services \>Journals \> Billing journal**

1.  Create a new lumpsum billing journal then click on \<Lines\>
2.  Populate the departure date in the ‘Date’ , ‘Start date’ and ‘End date’ fields, select the customer and the **new** accommodation payment id
3.  Populate the refundable balance in the Rate field
4.  Validate and post the journal

Navigate to:** ****Care services \>Journals \> Receipt journal**

1.  Create a new lumpsum receipt journal then click on \<Lines\>
2.  Populate the departure date in the ‘Date’, ‘Start date’ and ‘End date’ fields, select the customer
3.  Click \<Save\> and then \<Settle transactions\>
4.  Select the invoice to settle by ticking the Mark checkbox
5.  Click \<Ok\>
6.  Change the offset account type to Vendor
7.  Select the resident vendor account
8.  Validate and post the journal

# Schedules, Inquiries and reports

### Daily client revenue

Navigate to: **Care services \> inquiries and reports \> Daily client revenue**

Generate the enquiry to view a summary of the total daily client revenue from the billing schedule, funding schedule, accommodation payment revenue and DMF revenue.

### In progress billing list

Navigate to: **Care services \> inquiries and reports \> In progress billing list**

Generate the enquiry for a list of customer billing transactions that have not yet been posted.

### Service concessional/supported daily ratio

Navigate to: **Care services \> inquiries and reports \> Service concessional/supported daily ratio**

The concessional supported ratios will be updated via the periodic Concessional/Supported ratio calculation job. The form displays the Service number, Threshold, discount (the % reduction of the accommodation supplement) and the actual ratio for each service (facility)

### 

