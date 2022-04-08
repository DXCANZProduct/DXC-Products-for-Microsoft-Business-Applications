---
# required metadata

title: [Finance Utilities ]
description: [Accounts payable setup - Sundry payment ]
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
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [jdutoit2]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
