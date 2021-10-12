---
# required metadata

title: [Finance Utilities ]
description: [Accounts Payable Processing - Sundry payment processing]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [helenho]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

## Sundry Payment Processing

The functionality gives the ability to enter a supplier name and address on an individual invoice allowing these details to be used on cheque payments, as well as one-off BSB and Account Number for EFT Payments. Therefore, many one-time vendor invoices can be stored on a single sundry vendor record but allowing for separate payments without a change to the vendor record information.  This also makes it possible to pay all sundry invoices in one payment proposal.



### Sundry Vendor Invoices

To create a new sundry vendor invoice journal, go to **Accounts payable > Invoices > Invoice journal**, create the new invoice journal header as per standard D365 and press the Lines button to begin entering the invoice/s. Selection of the **Sundry Vendor** created in the setup will require the addition of details associated with the Payment of each Vendor (on each Invoice line); 

|    Field  |    Description   |
|-|-|
|   SUNDRY VENDOR  |  |
|  Sundry vendor name |  Sundry Vendor name is required  |
|  Sundry address |  Sundry Vendor address is required  |
|  Sundry BSB routing number |  If payment is via EFT Sundry Vendor, bank routing number is required |
|  Sundry bank account |  If payment is via EFT Sundry Vendor, bank account number is required |

The Sundry Vendor detail can be changed, prior to posting.

#### Sundry Vendor Payments

**ACCOUNTS PAYABLE > PAYMENTS > RECEIPT JOURNAL** 

The Sundry invoices can now be paid using cheques or by EFT, depending on the payment method entered on the invoice.

Enter the journal header, and from the **Lines tab** click on **Payment proposal - Create payment proposal** . This function can be used to pay more than one sundry invoice; it breaks down the sundry invoices into separate lines. If due dates and EFT bank details match the sundry invoices will be grouped into one payment.

From the **General tab** it is possible to review the Sundry Vendor Name, Address, BSB and Account Number to be paid.

Selection of the **Create payments** button will create the journal lines (one for each Sundry payment), so that there will be a payment generated for each invoice/grouped invoices. The Vendor Payment Advice generated, uses the Bank account number and BSB from the sundry fields, and not from the Vendor.

