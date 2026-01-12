---
layout: product-content
header: Finance Utilities
toc: true
---

## Introduction
The DXC Finance Utilities module provides enhanced functionalities to Microsoft Dynamics 365 for the following:

# Accounts payable
## Sundry vendors

The Sundry Payment modification gives the user the ability to enter a supplier name and address on an individual invoice allowing these details to be used on a cheque payments, as well as one-off BSB and Account Number for EFT Payments. Therefore, many one- time vendor invoices can be stored on one sundry vendor record but allowing for separate payments without a change to the vendor record information.  This also makes it possible to pay all sundry invoices in one payment proposal.

- [Sundry setup]({{ '/financeutilities/ACCOUNTS-PAYABLE/Setup/Sundry-payment' | relative_url }})
- [Sundry processing]({{ '/financeutilities/ACCOUNTS-PAYABLE/Processing/Sundry-payment' | relative_url }})

## BPAY

The BPAY method of payment modification provides the ability to set BPAY required fields on the Vendor and Company bank account. Flagging the method of payment as BPAY, sets the BPAY fields as mandatory for invoice transactions. 

When invoice transactions are created for vendors with a BPAY method of payment, the BPAY fields are auto populated from the Vendor details. The BPAY fields can also be entered or edited at time of invoice entry. Posting validation confirms all mandatory BPAY fields are entered else the posting will fail. 

Within the Vendor payment proposal, grouping also occurs for the new BPAY field.

- [BPAY setup]({{ '/financeutilities/ACCOUNTS-PAYABLE/Setup/BPAY-payment' | relative_url }})
- [BPAY processing]({{ '/financeutilities/ACCOUNTS-PAYABLE/Processing/BPAY-payment' | relative_url }})

## Save Vendor payments file to secure location

Where the **Method of payment** file uses Generic electronic Export format, the **Generate payments** file can be sent to a secure location like ftp, ftps, sftp, azure blob or api endpoint.<br>
See [link]({{ '/financeutilities/ELECTRONIC-REPORTING-EXPORT/Introduction' | relative_url }}) for more details.

File can be PGP encrypted (optional).

## Payment advice report

A custom-built report has been developed to provide a Payment advice to vendors upon processing an EFT payment run. The report will show the vendor bank account details where the payment is deposited as well as the invoice numbers paid, what amount and what discount applied. This remittance advice report works in conjunction with the Smart Send function.

- [Vendor payments setup]({{ '/financeutilities/ACCOUNTS-PAYABLE/Setup/Vendor-payments' | relative_url }})

## Vendor bank account changes workflow

Finance utilities have added additional fields to **Vendor approval** and **Vendor bank account approval** on the **Accounts payable parameters**. <br>
This provides companies the option to submit changes to these fields to the standard vendor approval workflows.
- [Vendor bank account changes worklow setup]({{ '/financeutilities/ACCOUNTS-PAYABLE/Setup/Vendor-bank-account-changes-workflow' | relative_url }})


## Self billing invoicing / Recipient-Created Tax Invoice (RCTI)
Provides the ability to automatically create a Purchase invoice for Product receipt(s)
- [Setup]({{ '/financeutilities/ACCOUNTS-PAYABLE/Setup/Self-billing-invoicing' | relative_url }})
- [Processing]({{ '/financeutilities/ACCOUNTS-PAYABLE/Processing/Self-billing-invoicing' | relative_url }})


