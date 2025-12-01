---
layout: product-content
header: Finance Utilities
toc: true
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
Tax group                      |  | Std has added to 'Generate voucher'. Where the offset company is intercompany, Finance utilities tax field is enabled and will provide intercompany tax options.
Item tax group                 |  | Std has added to 'Generate voucher'. Where the offset company is intercompany, Finance utilities tax field is enabled and will provide intercompany tax options.
Financial dimensions           |  | Replaced with std.

Following Finance utilities fields are still used with Modern bank reconciliation: 

**Finance utilities field**    | **Table.Field**  
:-------                       |:------- 
Offset type | BankReconciliationMatchRule.SAB_FinOffsetAccountType | 



### Offset type Bank

Following Finance utilities fields are replaced with Modern bank reconciliation:

**Finance utilities field**  | **Table.Field**  | **Modern bank reconciliation replacement**                
:-------    |:------- |:-------                         
<ins>**Reconciliation matching rules**</ins> | 
Action 'Mark new transactions'  | BankReconciliationMatchRule.MatchActionType              | Action 'Generate voucher'
Financial dimensions            |   | Replaced with std.

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
Offset account                                | For Fixed customer accounts use Step 3 - Automatic customer account matching set to _No_ and populate 'Customer account'
Offset account bank statement field           | For finding Customer account within a bank statement field: 'Step 2 (Optional): Identify customer account through invoice matching / Match open invoices' use 'Customer invoice field' set to **Customer account**.
Offset account reference bank statement field  | For finding Customer account using Finanance utilites 'Customer reference' within a bank statement field: In 'Step 2 (Optional): Identify customer account through invoice matching / Match open invoices' use 'Customer invoice field' set to **Reference number**. 
Settle transaction                            | Not required - utilise Action 'Settle customer invoice' where an invoice needs to be settled. Note: Settle customer invoice action will create one customer payment journal per bank statement line, so only use this action where an invoice will be settled.
Settle transaction bank statement field        | For finding Customer account based on Invoice/Invoice to settle within a bank statement field: In 'Step 2 (Optional): Identify customer account through invoice matching / Match open invoices' use 'Customer invoice field' set to **Invoice**.
Auto-post customer payment journal &  Auto-post and transfer customer payment journal  | Replaced with new Finance utilities field in Step 3 called **Post** with three drop-down options: <br> •	Do not post <br> •	Post <br> •	Post and transfer. <br> Advised to use one of the post options as this will also automatically match the newly posted bank transaction to the matching bank statement record. Where 'Do not post' is used, it will only create the customer payment journal, not post it and thus not match to the bank statement record.
Description mask                              | Enable feature 'Enable default descriptions for advanced bank reconciliation' and setup [Default descriptions](https://learn.microsoft.com/en-us/dynamics365/finance/cash-bank-management/apply-cash-adv-bank-rec#enable-default-descriptions-for-advanced-bank-reconciliation). Finance utilities will use the same default description on the intercompany transaction.
Financial dimensions                          | Replaced with std.

### Data entities

- Reconciliation matching rules

### Tables

- BankReconciliationMatchRule - Shared across legal entities
- BankReconciliationMatchRuleLine - Step 1 - Shared across legal entities
- BankReconciliationMatchRule_PostingInfo - Step 2 - Legal entity specific offset details
