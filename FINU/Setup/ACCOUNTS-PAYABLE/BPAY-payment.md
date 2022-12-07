---
# required metadata

title: Finance Utilities 
description:  Accounts payable setup - BPAY payment
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
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## BPAY Payment
The BPAY pages are used to setup additional fields needed to capture BPAY details for your EFT payment. 

### Setup BPAY payment
The following is required to setup BPAY payment:
1. Method of payment: Create a BPAY method of payment
2. Company bank: Add BPAY details
3. Vendor bank account: Add default BPAY details, but these can be edited or entered when processing the vendor invoice as well.

#### 	Method of payment
Users can access the form by navigating to **Accounts payable > Payment setup > Methods of payment**.

Enabling field **BPAY method of payment** updates the following:
-	**Generic electronic format** is enabled and locked. Since Eclipse EFT formats will be deprecated in future, the BPAY method of payment only supports Generic electronic formats. 
-	**Payment control > Payment ID is mandatory** is enabled and locked
-	**Payment attributes > Payment ID** is enabled and locked

The following fields have been added as part of the BPAY modification, but are _optional_ since not mandatory for all ANZ banks:
-	**Payment control > Lodgement reference is mandatory**
-	**Payment attributes > Lodgement reference** 

#### Company bank
Users can access the Company's **Bank accounts** page by navigating to **Cash and bank management > Bank accounts > Bank accounts**.
The following field have been added as part of the BPAY modification and can be used for mapping in the GER:
-	**BPAY batch ID**. Available under **Additional identification** FastTab.

#### 	Vendor bank account
Users can access the Vendor's **Bank accounts** page by navigating to **Accounts payable > Vendors > All vendors**.
Select the applicable vendor and select the button **Bank accounts**.
The following fields have been added as part of the BPAY modification:
- Biller code (length 10)
-	Lodgement reference (length 18)

#### Data entities
The new BPAY fields have been added to the applicable data entities:

| Field                                         | Data entity            | DFU field   |
|-|-|-|
| **BPAY Batch id**                             | Bank accounts          | BankAccountTable.DFUBPAYBatchId  |
| **Biller code**                               | Vendor bank accounts   | VendBankAccount.DFUBillerCode  |
| **Lodgement reference**                       | Vendor bank accounts   | VendBankAccount.DFULodgementRef  |
| **Validate lodgement reference is mandatory** | Vendor payment method  | VendPaymModeTable.DFUValidateLodgementRefIsMandatory  |
| **Lodgement reference attribute**             | Vendor payment method  | VendPaymModeTable.DFUAtrributeLodgementRefEnabled  |

### BPAY payment processing
BPAY payment processing is discussed in detail at [BPAY payment processing](../../Processing/Accounts-Payable/BPAY-payment.md).
