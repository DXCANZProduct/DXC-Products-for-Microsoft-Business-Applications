---
# required metadata

title: Finance Utilities
description: Cash and bank management setup - Modern bank reconciliation
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-06-13
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankReconciliationMatchRule, SAB_FinUtilParameters
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Modern bank reconciliation migration

The following sections describe the requirements to migrate previous **Mark new transaction** Finance utilities fields to **Modern bank reconciliation** functionality. <br>
These can either be done manually or using data entities.

Following Finance utilities fields are replaced with Modern bank reconciliation:

### Offset type Ledger

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'                | Action 'Generate voucher'

### Offset type Bank

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'                | Action 'Generate voucher'


### Offset type Vendor

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'                | Action 'Generate vendor payment'


### Offset type Customer

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Financial utilities parameters**</ins> | 
Reconciliation customer payment journal       | Bank accounts - Customer payment journal            
Method of payment                             | Reconciliation matching rules - Method of payment
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'                | Action 'Generate customer payment' or 'Settle customer invoice'
Tax fields                                    | 
Financial dimensions                          | 

