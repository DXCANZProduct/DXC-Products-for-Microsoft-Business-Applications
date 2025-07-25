---
# required metadata

title: Finance Utilities 
description: Accounts payable processing - Sundry payment
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-07-22
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  VendPaymMode, LedgerJournalTable5, LedgerJournalTable9
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accounts payable functionality
The features as described in the following subsections are available to control the additional functionality for accounts payable.

## Sundry Payment

The functionality gives the ability to enter a supplier name and address on an individual invoice allowing these details to be used on cheque payments, as well as one-off BSB and Account Number for EFT Payments. Therefore, many one-time vendor invoices can be stored on a single sundry vendor record but allowing for separate payments without a change to the vendor record information.  This also makes it possible to pay all sundry invoices in one payment proposal.

Setup requirements are discussed in detail at [Sundry payment setup](../../Setup/ACCOUNTS-PAYABLE/Sundry-payment.md). <br>
Processing of the sundry vendor invoices and payments are discussed in the following subsections.

### Sundry Vendor invoices

To create a new sundry vendor invoice journal, go to **Accounts payable > Invoices > Invoice journal**, create the new invoice journal header as per standard D365 and press the Lines button to begin entering the invoice/s. Selection of the [**Sundry Vendor**](../../Setup/ACCOUNTS-PAYABLE/Sundry-payment.md#sundry-vendor) created in the sundry payment setup will require the addition of details associated with the Payment of each Vendor (on each Invoice line):

|    Field  |    Description   |
|-|-|
|  **Sundry vendor name** |  Sundry vendor name is required  |
|  **Sundry address** |  Sundry vendor address is required  |
|  **Sundry BSB\routing number** |  If payment is via EFT, the sundry vendor's bank routing number is required |
|  **Sundry bank account** |  If payment is via EFT, the sundry vendor's bank account number is required |

The Sundry Vendor detail can be changed, prior to posting. <br>
If any of the above fields are not entered for a sundry vendor invoice line, an error will stop the user from saving the journal line. <br>
The error will specify which sundry field must be filled in.

#### Duplicate invoice check

Accounts payable parameter **Check the invoice number used** will now use the combination of the following to determine uniqueness of sundry invoices:
- Invoice
- Sundry BSB\routing number
- Sundry bank account

For example where two invoices with same id are processed for the one Sundry vendor account, but the sundry bank details differ between the two invoices, they will not be seen as duplicates.


### Sundry Vendor Payments

To create a new sundry vendor payment, go to **Accounts payable > Payments > Vendor payment journal**. <br>
The Sundry invoices can now be paid using cheques or EFT, depending on the payment method entered on the invoice.

Enter the journal header, select **Lines** button and select button **Payment proposal > Create payment proposal** on the Action Pane. <br>
The **Payment proposal** function should be used to pay more than one sundry invoice; it breaks down the sundry invoices into separate lines. If due dates and EFT bank details match the sundry invoices will be grouped into one payment.
> Note: Do not use manual settlement for Sundry vendors, as this function doesn't group/split by sundry bank details.

From the **General** tab it is possible to review the Sundry Vendor Name, Address, BSB and Account Number to be paid. <br>
Selection of the **Generate payments** button will create a payment for each payment journal line using the sundry bank details. <br>

The Finance utilities **Payment advice** report also uses the Bank account number and BSB from the sundry fields, and not from the Vendor. <br>
> Note: Setup the [**Payment advice**](../../Setup/ACCOUNTS-PAYABLE/Vendor-payments.md#payment-advice-report) report to use the applicable Finance utilities report.
