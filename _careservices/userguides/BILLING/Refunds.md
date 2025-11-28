
---
layout: product-content
header: Care Services
toc: true
---

# Refunds, transfers and departures

-   Residents can move from one room to another within the same facility in a Bed transfer.
-   Community Care Clients can transfer for respite or permanent care at an Care services facility.
-   Residents can transfer from one facility to another.
-   Residents can depart from one or multiple facilities or services.
-   Refunds of fees are processed for credits or on departure for fees that were paid in advance
-   Part refunds of accommodation payments are processed for movements to a room with a different price or as agreed with the resident
-   Full refunds are processed on departure or transfer to another facility

### Refund of fees

**Navigate to: Care services \> All customers \> Collect \> Client refund proposal**

1.  Select ‘Partial refund’ in the Refund type and click \<Ok\>
2.  Select the credit invoice(s) by ticking the ‘Mark’ check box
3.  Click on \<Create journal\>
4.  Go to Journals\> Billing Journal and select the automatically created journal
5.  Validate and post the journal.
6.  The amount has now been transferred to the resident vendor account

### Process the refund in a Vendor payment journal

**Navigate to:** **Accounts payable \> Payments\> Vendor payment journal**

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

**Navigate to: Care services \> All customers \> Care services \> Service entries**

1.  Click on \<New\> to create a new service entry
2.  Populate the same details as the original service entry, use the departure date from the original service entry to populate the entry, billing end date and departure date (overlaps are not allowed so the original entry date can’t be used for this purpose)

**Navigate to:** **Care services \> All customers \> Invoices \> Accommodation payments**

1.  Select the new accommodation payment header
2.  Click on \<Add line\>
3.  Populate the End date
4.  Add the refundable balance in the agreed amount

**Navigate to:** **Care services \>Journals \> Billing journal**

1.  Create a new lumpsum billing journal then click on \<Lines\>
2.  Populate the departure date in the ‘Date’ , ‘Start date’ and ‘End date’ fields, select the customer and the **new** accommodation payment id
3.  Populate the refundable balance in the Rate field
4.  Validate and post the journal

**Navigate to:** **Care services \>Journals \> Receipt journal**

1.  Create a new lumpsum receipt journal then click on \<Lines\>
2.  Populate the departure date in the ‘Date’, ‘Start date’ and ‘End date’ fields, select the customer
3.  Click \<Save\> and then \<Settle transactions\>
4.  Select the invoice to settle by ticking the Mark checkbox
5.  Click \<Ok\>
6.  Change the offset account type to Vendor
7.  Select the resident vendor account
8.  Validate and post the journal
