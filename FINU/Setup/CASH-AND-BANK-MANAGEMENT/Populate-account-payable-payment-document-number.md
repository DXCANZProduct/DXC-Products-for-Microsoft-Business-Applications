---
# required metadata

title: Finance Utilities 
description: Cash and bank management setup - Accounts payable payment document number
author: jdutoit2
manager: Kym Parker
ms.date: 2022-03-04
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankReconciliationMatchRule, SAB_FinUtilParameters, VendParameters
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

# Advanced bank reconciliation functionality
The fields as described in the following subsections are available to control the additional functionality for advanced bank reconciliation.

## Setup
### Populate Accounts Payable Payment Document Number 

The enhancement to support the Finance utilities Reconciliation matching rule's **Group by document number** feature is to display the Journal id or Cheque number under **Document number** field on the bank reconciliation screen. Document field on the payment journal line is not updated. Reconciliation matching rules can then be used to automatically match the _sum_ of the D365 transactions having the _same document number_ as that on the Bank statement.
To activate the Document number:
- Go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters**, set **Populate bank transaction document number** to _Yes_.
- Go to **Accounts Payable > Setup > Accounts payable parameters**, select the **Number sequences** tab and set the **Payment reference** number sequence.
