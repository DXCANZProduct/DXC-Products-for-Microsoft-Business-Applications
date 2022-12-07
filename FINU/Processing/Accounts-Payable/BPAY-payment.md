---
# required metadata

title: Finance Utilities 
description:  Accounts payable processing - BPAY payment
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: VendPaymMode
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accounts payable functionality
The features as described in the following subsections are available to control the additional functionality for accounts payable.

## BPAY Payment
Setup requirements are discussed in detail at [BPAY payment setup](../../Setup/ACCOUNTS-PAYABLE/BPAY-payment.md). <br>
Processing of the vendor invoices and payments are discussed in the following subsections.

### 	BPAY Vendor invoices
First step is to create and post the vendor invoices. <br>
Vendor payment invoices can be created in various different pages. <br>
The BPAY Finance utilities modification to capture BPAY details for your EFT payment have been added to:
- **Accounts payable > Invoices > Tax invoice journal**
- **Accounts payable > Invoices > Pending vendor invoices**
- **Accounts payable > Invoices > Tax invoice register**
- **General ledger > Journal entries > General journals**
- **Project management and accounting > Journals > Expense**

Payment id is currently on the vendor invoicing forms and will be utilized for BPAY. New BPAY field **Lodgement reference** has also been added.

- **Payment id** is populated by MS from the Vendor’s Payment id. The field can be manually edited on the vendor invoice entry prior to posting the invoice
- **Lodgement reference** is populated by Finance Utilities by the vendor/third party bank account on the invoice. When changing to a different vendor bank account, the Lodgement reference will automatically update. The field can also be manually edited on the vendor invoice entry prior to posting the invoice.

The BPAY modification uses the method of payment control settings to validate for mandatory fields Payment id and Lodgement reference (if also flagged as mandatory).
If these Payment control mandatory fields are blank the invoice posting will error.

### BPAY Vendor payments
Second step is to pay the vendor invoices posted in previous step. Users can go to the **Vendor payment journal** page by navigating to **Accounts payable > Payments > Vendor payment journal**. <br>

New Finance utilities BPAY field **Lodgement reference** has been added to Vendor payment proposal page. 
Standard D365 already groups payments by Payment ID, and with the BPAY modification the **Lodgement reference** is also used for additional grouping.

**Lodgement reference** can be viewed on the **Payment** tab. The field is editable.
