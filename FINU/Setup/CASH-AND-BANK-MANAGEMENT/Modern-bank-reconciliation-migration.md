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

### Offset type Ledger

Following Finance utilities fields are replaced with Modern bank reconciliation:

**Finance utilities field**    | **Table.Field**   | **Modern bank reconciliation replacement**                
:-------                       |:-------           |:-------                 
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions' | BankReconciliationMatchRule.MatchActionType               | Action 'Generate voucher'
Offset account   | BankReconciliationMatchRule.SAB_FinOffsetLedgerDimension  |

Following Finance utilities fields are still used with Modern bank reconciliation: 

**Finance utilities field**    | **Table.Field**  
:-------                       |:------- 
Offset type | BankReconciliationMatchRule.SAB_FinOffsetAccountType | 


### Offset type Bank

Following Finance utilities fields are replaced with Modern bank reconciliation:

**Finance utilities field**    | **Modern bank reconciliation replacement**                
:-------    |:-------                         
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'  | BankReconciliationMatchRule.MatchActionType              | Action 'Generate voucher'

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
Offset account bank statement field
Offset account reference bank statement field
Settle transaction
Settle transaction bank statement field
Field format
Auto-post customer payment journal
Auto-post and transfer customer payment journal
Tax group                                   | 
Item tax group
Description mask                              | Enable feature 'Enable default descriptions for advanced bank reconciliation' and setup [Default descriptions](https://learn.microsoft.com/en-us/dynamics365/finance/cash-bank-management/apply-cash-adv-bank-rec#enable-default-descriptions-for-advanced-bank-reconciliation). Finance utilities will use the same default description on the intercompany transaction.
Financial dimensions                          | 

### Data entities

- Reconciliation matching rules

### Tables:

- BankReconciliationMatchRule - Shared across legal entities
- BankReconciliationMatchRuleLine - Step 1 - Shared across legal entities
- BankReconciliationMatchRule_PostingInfo - Step 2 - Legal entity specific offset details
