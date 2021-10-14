---
# required metadata

title: [Finance Utilities ]
description: [ Accounts payable setup - BPAY payment]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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

#### 	BPAY Vendor Invoices
Vendor payment invoices can be created in various different pages. <br>
The BPAY Finance utilities modification to capture BPAY details for your EFT payment have been added to:
- **Accounts payable > Invoices > Tax invoice journal**
- **Accounts payable > Invoices > Pending vendor invoices**
- **Accounts payable > Invoices > Tax invoice register**
- **General ledger > Journal entries > General journals**
- **Project management and accounting > Journals > Expense**

Payment id is currently on the vendor invoicing forms and will be utilized for BPAY. New BPAY field 
**Lodgement reference** has also been added.

- **Payment id** is populated by MS from the Vendor’s Payment id. The field can be manually edited on the vendor invoice entry prior to posting the invoice
- **Lodgement reference** is populated by DXC Finance Utilities by the vendor/third party bank account on the invoice. When changing to a different vendor bank account, the Lodgement reference will automatically update. The field can be manually edited on the vendor invoice entry prior to posting the invoice.
The BPAY modification uses the method of payment control settings to validate for mandatory fields Payment id and Lodgement reference (if also flagged as mandatory).

If these Payment control mandatory fields are blank the invoice posting will error.

### BPAY Vendor Payments
You can reach the VENDOR PAYMENT JOURNAL form by navigating to
**ACCOUNTS PAYABLE > PAYMENTS > VENDOR PAYMENT JOURNAL**

New BPAY field **Lodgement reference** has been added to Vendor payment proposal form. 
Payments are already being grouped by MS on Payment Id, and with the BPAY modification the **Lodgement reference** is also used in the grouping.

**Lodgement reference** can be viewed on the **Payment** tab. The field is editable.
