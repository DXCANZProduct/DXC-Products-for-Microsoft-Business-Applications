---
# required metadata

title: Finance Utilities 
description: Bank statement reconciliation processing - Bank reconciliation worksheet 
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-06-26
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankReconciliationHeader
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

# Prerequisites

The following is a summary of the prerequisites for using Finance utilities extensions to Modern bank reconciliation

> ** Important note: Ensure there are no Action **Mark new transactions** Reconciliation matching rules left before running **Cash and bank management > Setup > Advanced bank reconciliation setup > Advanced bank reconciliation data upgrade**, as this will delete these rules. 

The following setup are prerequisites and is described in detail [here](../../Setup/CASH-AND-BANK-MANAGEMENT/Modern-bank-reconciliation.md) when switching to Modern bank reconciliation:
- Enable feature **Modern bank reconciliation**
- Set **Enable modern bank reconciliation extensions** to _Yes_ in **Financial utilities parameters**
- Assign **Customer payment journal** and **Vendor payment journal** on the company **Bank accounts** if actions 'Generate vendor payments', 'Generate customer payments' or 'Settle customer invoice' will be used
- ** Migrate Action **Mark new transactions** Reconciliation matching rules to the applicable replacements. Ensure there are no Action **Mark new transactions** left before running the next step, as this will delete them.
- Run **Cash and bank management > Setup > Advanced bank reconciliation setup > Advanced bank reconciliation data upgrade**

# Bank reconciliation worksheet

> Note: The following section describes the Bank reconciliation worksheet process specific to feature **Modern bank reconciliation**.

The **Worksheet** page on the **Bank reconciliation** is used to match the bank transactions within your D365 environment and the bank statement files according to the reconciliation matching rules that you have defined in the D365 environment. It also provides the ability to manually match the bank statement transactions not matched by your reconciliation matching rules.

With Modern bank reconciliation the FastTab **New transactions** is now longer applicable, and thus not available on the worksheet. <br>
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
- **Offset company** - defaults to current legal entity, but can be changed to an intercompany legal entity. The **Customer account** or **Vendor account** will show customers/vendors for the selected company. For intercompany offsets the customer or payment journal will still be created in the current legal entity, but using the applicable company account for the customer/vendor posting.

### Generate voucher




## Matched transactions

### Matching ID

Modern bank reconciliation includes new functionality **Matching ID**, which works similar to Finance Utilities **Match Id**

Finance Utilities adds the following functionality to below in **Matched transactions**:
- **Company** - For intercompany offsets, this will provide the offset company

### Mark as new extended financial details

If the field **Extended financial details for new transactions** has been set on **Financial utilities parameter**, these Financial details are available from the Bank reconciliation on **Matched transactions** tabs General and Financial dimensions, for the user to review or change.

If feature **Advanced bank reconciliation improvement: enable filtering and provide separate grid for new transactions** has been enabled, the fields are available in **Line details** on FastTab **New transactions**.

-	The additional detail can be populated when a transaction is selected from the **Mark as new** button
-	When a line is set as Mark as new’ the GL journal creation includes the additional default settings from the **Extended financial details** from the applicable **Reconciliation matching rules**

#### General tab

|   **Heading**    |   **Field**   |   **Description**   |
|-|-|-|
|   **Offset account**  |   Offset company   |  Required company selection  |
|  |  Offset account type  |   Usually set to  **Ledger**, other options include Customer, Vendor and Bank   |
|  |  Offset account number  |  Main account and dimensions  |
|  |  Description  |  Transaction description (optional)  |
|   **Bank**  |  Bank transaction type  |  Select bank transaction type (optional)  |
|   **Tax**   |  GST sales tax group  |  Sales tax group (optional)  |
|  |  Item sales tax group  |  Select Item tax group (optional)  |

#### Financial dimensions tab

Contains Account and Offset accounts (excluding ledger offet account type)'s financial dimensions. <br>
When the user selects **Mark as new** and the records are moved to Matched transactions:
- **Account** (Bank)'s financial dimensions will be populated from the Bank account.
- When user enters **Offset account number**, the offset account's financial dimension will be populated from their master accounts (for example customer's financial dimension), except ledger since it is populated in **Offset account number**. If this would result in a blank value it will be populated with **Account** (Bank)'s financial dimensions.
- If **Account** (Bank)'s financial dimensions are blank, **Offset account**'s financial dimensions will be used to populate **Account** (Bank)'s financial dimensions. 

### Mark as reconciled
#### Ability to reconcile unmatched statements
When **Ability to reconcile unmatched statements** is set to _No_ in the **Financial utilities parameters**, the button **Mark as reconciled** is disabled in the Bank Reconciliation Worksheet when Unmatched Amount is different from zero in the Bank Statement Transactions section. The statement cannot be reconciled until the unmatched value is zero.

#### Mark as new posting
When creating the journal for **Mark as new** transactions, if the **Extended financial details for new transactions** is activated in the **Financial utilities parameters**: <br>
- The **Extended financial details** is used to populate the journal line, and 
- The posting **date** nominated when the bank statement has been imported (_Statement date_ or _Today’s date_).

#### Automatic Posting
If the Financial Utilities parameter **Auto-post bank statement** is set to _Yes_, the bank statement and Mark as new transactions will automatically be posted when the **Mark as reconciled** button is selected. 

#### Reconciliation correction balance	
If the field **Ability to enter reconciliation balancing entry** on the **Financial utilities parameter** is set to _Yes_ and the new column **Correction Amount** has been used, the correct amount will be posted to the **Main account** associated with the correction line's **Bank transaction type** as found on **Cash and bank management > Setup > Bank transaction types**.

