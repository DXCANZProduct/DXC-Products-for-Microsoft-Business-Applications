---
# required metadata

title: Finance Utilities
description: Cash and bank management setup - Modern bank reconciliation
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-06-26
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

### Offset type Ledger

Following Finance utilities fields are replaced with Modern bank reconciliation:

**Finance utilities field**    | **Table.Field**   | **Modern bank reconciliation replacement**                
:-------                       |:-------           |:-------                 
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions' | BankReconciliationMatchRule.MatchActionType               | Action 'Generate voucher'
Offset account   | BankReconciliationMatchRule.SAB_FinOffsetLedgerDimension  |
Financial dimensions                          | Replaced with std.

Following Finance utilities fields are still used with Modern bank reconciliation: 

**Finance utilities field**    | **Table.Field**  
:-------                       |:------- 
Offset type | BankReconciliationMatchRule.SAB_FinOffsetAccountType | 



Tax group                                   | Std has added to 'Generate voucher'. Where the offset company is intercompany, Finance utilities tax field is enabled and will provide intercompany tax options.
Item tax group                              | Std has added to 'Generate voucher'. Where the offset company is intercompany, Finance utilities tax field is enabled and will provide intercompany tax options.


### Offset type Bank

Following Finance utilities fields are replaced with Modern bank reconciliation:

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'  | BankReconciliationMatchRule.MatchActionType              | Action 'Generate voucher'
Financial dimensions                          | Replaced with std.

Following Finance utilities fields are still used with Modern bank reconciliation: 


**Finance utilities field**    | **Table.Field**  
:-------                       |:------- 
Offset type (BankReconciliationMatchRule.SAB_FinOffsetAccountType)



### Offset type Vendor

Following Finance utilities fields are replaced with Modern bank reconciliation:

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'  | BankReconciliationMatchRule.MatchActionType              | Action 'Generate vendor payment'
Offset account type 'Vendor'                  | Not required
Financial dimensions                          | Replaced with std.


### Offset type Customer

Following Finance utilities fields are replaced with Modern bank reconciliation:

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Financial utilities parameters**</ins> | 
Reconciliation customer payment journal       | Bank accounts - Customer payment journal            
Method of payment                             | Reconciliation matching rules - Step 3 Default method of payment
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'   | BankReconciliationMatchRule.MatchActionType             | Action 'Generate customer payment' or 'Settle customer invoice'
Offset account type 'Customer'                | Not required
Offset account                                | Step 3 - Automatic customer account matching set to _No_ and populate 'Customer account'
Offset account bank statement field           | Not required
Offset account reference bank statement field  | Replaced with using'Reference number' in 'Step 2 (Optional): Identify customer account through invoice matching'
Settle transaction                            | Not required - utilise Action 'Settle customer invoice' where an invoice needs to be settled. Note: Settle customer invoice action will create one customer payment journal per bank statement line, so only use this action where an invoice will be settled.
Settle transaction bank statement field        | Not required - utilise Action 'Settle customer invoice' and add required setup on 'Step 2 (Optional): Identify customer account through invoice matching'
Field format                                    | Not required, replaced with Operator in 'Step 2 (Optional): Identify customer account through invoice matching'
Auto-post customer payment journal &  Auto-post and transfer customer payment journal  | Replaced with new Finance utilities field Post with three drop-down options: <br> •	Do not post <br> •	Post <br> •	Post and transfer
Description mask                              | Enable feature 'Enable default descriptions for advanced bank reconciliation' and setup [Default descriptions](https://learn.microsoft.com/en-us/dynamics365/finance/cash-bank-management/apply-cash-adv-bank-rec#enable-default-descriptions-for-advanced-bank-reconciliation). Finance utilities will use the same default description on the intercompany transaction.
Financial dimensions                          | Replaced with std.

### Data entities

- Reconciliation matching rules

### Tables:

- BankReconciliationMatchRule - Shared across legal entities
- BankReconciliationMatchRuleLine - Step 1 - Shared across legal entities
- BankReconciliationMatchRule_PostingInfo - Step 2 - Legal entity specific offset details
