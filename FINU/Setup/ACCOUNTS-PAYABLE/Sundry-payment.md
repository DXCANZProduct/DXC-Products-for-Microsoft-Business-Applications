---
# required metadata

title: Finance Utilities 
description: Accounts payable setup - Sundry payment 
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  VendPaymMode
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version:: AX 7.0.1
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## Sundry payment

The functionality gives the ability to enter a supplier name and address on an individual invoice allowing these details to be used on cheque payments, as well as one-off BSB and Account Number for EFT Payments. Therefore, many one-time vendor invoices can be stored on a single sundry vendor record but allowing for separate payments without a change to the vendor record information.  This also makes it possible to pay all sundry invoices in one payment proposal.

### Setup Sundry payment
#### Method of Payment

Users can access the **Method of payment** page by navigating to **Accounts payable > Payment setup > Methods of payment**. <br>
A Sundry vendor needs its own method of payment. This is what differentiates the Sundry vendor from other vendors. A new **Method of payment** field called _Sundry method of payment_ has been added to record this.

|    Field	  |    Description   |
|-|-|
|  **Sundry method of payment**  | Select _Yes_ for Sundry payment processing  |
	
#### Sundry Vendor

Users can access the **All vendors** page by navigating to **Accounts payable > Vendors > All vendors**. <br>
Define the Vendor to be used for Sundry payments, and set the vendor's **Method of payment** to the Sundry method of payment setup in previous step.

### Sundry payment processing
Sundry payment processing is discussed in detail at [Sundry payment processing](../../Processing/Accounts-Payable/Sundry-payment.md).
