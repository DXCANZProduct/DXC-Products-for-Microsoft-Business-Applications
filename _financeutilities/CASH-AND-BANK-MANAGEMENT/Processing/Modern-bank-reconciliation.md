---
layout: product-content
header: Finance Utilities
toc: true
---

# Modern bank reconciliation

# Prerequisites

The following is a summary of the prerequisites for using Finance utilities extensions to Modern bank reconciliation

> ** Important note: Ensure there are no Action **Mark new transactions** Reconciliation matching rules left before running **Cash and bank management > Setup > Advanced bank reconciliation setup > Advanced bank reconciliation data upgrade**, as this will delete these rules. 

The following setup are prerequisites and is described in detail [here](../../Setup/CASH-AND-BANK-MANAGEMENT/Modern-bank-reconciliation) when switching to Modern bank reconciliation:
- Enable feature **Modern bank reconciliation**
- Set **Enable modern bank reconciliation extensions** to _Yes_ in **Financial utilities parameters**.
- Assign **Customer payment journal** and **Vendor payment journal** on the company **Bank accounts** if actions 'Generate vendor payments', 'Generate customer payments' or 'Settle customer invoice' will be used
- ** Export data entity 'Reconciliation matching rules' (backup). Migrate Action **Mark new transactions** Reconciliation matching rules to the applicable replacements. Ensure there are no Action **Mark new transactions** left before running the next step, as this will delete them.
- Run **Cash and bank management > Setup > Advanced bank reconciliation setup > Advanced bank reconciliation data upgrade**

# Bank reconciliation worksheet

> Note: The following section describes the Bank reconciliation worksheet process specific to feature **Modern bank reconciliation**.

The **Worksheet** page on the **Bank reconciliation** is used to match the bank transactions within your D365 environment and the bank statement files according to the reconciliation matching rules that you have defined in the D365 environment. It also provides the ability to manually match the bank statement transactions not matched by your reconciliation matching rules.

With Modern bank reconciliation the FastTab **New transactions** is no longer applicable, and thus not available on the worksheet. <br>
Posting Bank statements are also not available anymore.

Select **Workheet** on the Action Pane, by navigating to **Cash and bank management > Bank statement reconciliation > Bank reconciliation**

The Modern bank reconciliation version of **Bank reconciliation worksheet** page is split into:
- Unmatched transactions
- Matched transactions

## Unmatched transactions

Finance Utilities adds the following functionality to below in **Unmatched transactions**:

### Generate payment journal

After selecting **Payment type** (Customer payment, or Vendor payment), additional input fields are provided. <br> 

Finance Utilities adds:
- **Offset company** - defaults to current legal entity, but can be changed to an intercompany legal entity. For intercompany offsets the customer or payment journal will still be created in the current legal entity, but using the applicable company account for the customer/vendor posting.
- **Customer account** or **Vendor account** - will display customers/vendors for the selected company. 

### Generate voucher

Finance Utilities adds:
- **Offset company** - defaults to current legal entity, but can be changed to an intercompany legal entity.
- **Offset account type** - defaults to ledger for offsetting to an expense or income ledger account. Can also select **Bank** for bank transfers.
- **Offset account number** - drop-down options determined by **Offset company** and **Offset account type**.
- **Sales tax** - only enabled for Offset account type **Ledger**. Drop-down options determined by **Offset company**.

### Correction amounts

Ability to manually enter a Correction amount on the Bank transaction where the manual matching Bank statement record amount is different. <br>
The Correction amount will be posted to the **Main account** associated with the correction line’s Bank transaction type as found on **Cash and bank management > Setup > Bank transaction types**.

Applies to where the following Finance utilities parameter settings are _Yes_: 
- Ability to enter reconciliation balancing entry
- Enable modern bank reconciliation extensions

Applies to the following Document types:
- Others
- BankClearing
- CustPayment
- VendPayment


## Matched transactions

Matched transactions displays all the matched bank statement transactions and their matching Bank transactions.

Finance Utilities adds the following functionality to below in **Matched transactions**:
- **Company** - For intercompany offsets, this will provide the offset company.
- **Journals** - Where the offset was to an intercompany legal entity, the intercompany voucher can be accessed in the journal via **Related vouchers**.


> Note: Modern bank reconciliation includes new field **Matching ID**, which replaces Finance Utilities **Match Id**.

