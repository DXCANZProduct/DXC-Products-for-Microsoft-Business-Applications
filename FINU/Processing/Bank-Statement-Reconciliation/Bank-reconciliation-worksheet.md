---
# required metadata

title: Finance Utilities 
description: Bank statement reconciliation processing - Bank reconciliation worksheet 
author: jdutoit2
manager: Kym Parker
ms.date: 2022-09-16
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankReconciliationHeader
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

## Bank reconciliation worksheet

The **Worksheet** page on the **Bank reconciliation** is used to match the bank transactions within your D365 environment and the bank statement files according to the matching rules that you have defined in the D365 environment.
Finance utilities includes improved reconciliation worksheet matching capability.

Select **Workheet** on the Action Pane, by navigating to **Cash and bank management > Bank statement reconciliation > Bank reconciliation**

### Run matching rules
The matching rule capability has been extended, and is activated when this process is executed from the Bank reconciliation. The Configuration section is where the facilities may be set up;
- The **Contains** and **Included in** capability
- The transaction **Group by document number** capability

### Marking and Matching Capability
Several changes have been implemented to improve the usability of the matching, including;
-	In standard you must highlight to match. This functionality allows the user to filter, check, filter again and check another record and match
-	Corrections (reversals) can be performed in line with the record

The changes required to support this functionality in the Bank reconciliation Worksheet are;
-	The addition of new buttons to facilitate Marking and Matching 
-	The additional Mark and Match Id columns
-	New checkboxes to keep the reconciled totals up to date, on the form
-	The standard click on Match re-sorts and removes filter; the filter is now retained.

#### New Buttons

| **Buttons**   |    **Description**   |
|-|-|
| **Match ID**                        | Users can manually select this button when the system does not automatically assign a match id on mark transactions.  |
| **Remove Match ID**                 | Once clicked this will remove the Match ID on both sides but will retain the mark on the ‘Mark’ checkbox column  |
| **Clear All**                       | This button will unmark all transactions marked with match id transactions on both sides from the open statement and open bank document sections. <br> This removes all the match IDs on both statement and bank transaction. They are marked for matching where match ids are already assigned          |
| **Mark filtered bank statement transactions** | This will allow the user to Mark All _filtered_ lines in the bank reconciliation worksheet for the **Bank statement transactions** grid  |
| **Mark filtered bank transactions** | This will allow the user to Mark All _filtered_ lines in the bank reconciliation worksheet for the **Bank transactions** grid  |
| **Maximise / Minimise**             | Maximise and Minimise the _unmatched_ transactions section  |

#### Mark and Match Id Columns
These columns provide more visibility of the matching process 

| **Columns** | **Description**   |
|-|-|
| **Mark** |  This checkbox allows the user to match statement lines against bank transactions. It validates the following: <br> <br> •	When all lines with same **Match ID** are unmarked on the Statement side, the system prompts a warning **“Unmatch all of match id”** When users click **Yes** on the warning message the corresponding lines with the equivalent **Match ID** on the bank transactions side are unmarked automatically by the system. If users click **No** on the message, users must manually unmark the corresponding entries. When the users unmark the corresponding entries, the Match id disappears. <br> <br> • When all lines with same **Match ID** are unmarked on bank transactions side, the system would prompt a warning **“Unmatch all of match id”** When users click Yes on the warning message the corresponding lines with equivalent **Match ID** on statement lines are unmarked automatically by the system. If users click **No** on the message, users must manually unmark the corresponding entries. When the users manually unmark the corresponding entries, the Match id disappears. <br> <br> • The new **Mark** checkbox will update the **Total amount**, **Open Amount** and **Matched amount** that appears on top of open statement lines and open bank documents from Bank reconciliation worksheet. <br> <br> •	The new **Mark** checkbox will also update the **Unmatched amount** and the **Total amount** that appears at the bottom of open statement lines and open bank documents from Bank reconciliation worksheet. <br> <br> • **Mark** column is also added on the **Matched document** section of bank reconciliation worksheet.  |
| **Match Id** |  This unique ID identifies which transactions are matching on both sides of the reconciliation worksheet. This is automatically assigned by the system based on the number sequence setup on [Financial utilities parameters](../../Setup/CASH-AND-BANK-MANAGEMENT/Finance-utilities-parameters.md#number-sequences) <br> <br> This button validates the following: <br> •	Matching is ONE TO ONE <br> •	Matching is ONE to MANY  <br> •	Matching is MANY to ONE <br> • Matching is MANY to MANY <br> • Matched transaction amounts on both sides are equal.  <br> <br> Match ID column is also added on the **Matched document** section of the bank reconciliation worksheet. Match ID can be auto assigned by using the Financial utilities parameter [Auto assign Match id](../../Setup/CASH-AND-BANK-MANAGEMENT/Finance-utilities-parameters.md) <br> Steps required when Financial utilities parameter **Auto assign Match id** is  <br> •	Enabled: <br> -	Mark bank statement and bank transactions <br> -	If balances: click Match. Match id is auto assigned <br> •	Disabled:  <br>   -	Mark bank statement and bank transactions <br> -	Click Match Id  <br> -	Click Match              |


#### Check boxes showing reconciled totals

These totals assist with balancing the in-progress Matching.

|   **Location of Totals**    |   **Check Box**   |   **Description**   |
|-|-|-|
|   **Top of Open Statement lines**  |   Total amount <br> Matched amount  <br> Unmatched amount   |  These totals are updated when the Mark checkbox is activated or deactivated on the Bank Statement transactions  |
|  **Top of Open Transaction lines**  |  Total amount <br>  Matched amount <br>  Unmatched amount |  These totals are updated when the Mark checkbox is activated or deactivated on the D365 Bank transactions |
|  **Bottom of Open Statement lines**  |  Number of Transactions Marked <br> Total Amount Marked <br>  Unmatched amount |  These totals are updated when the Mark checkbox is activated or deactivated on the Bank Statement transactions |

### Mark as new extended financial details

If the field **Extended financial details for new transactions** has been set on **Financial utilities parameter**, these Financial details are available from the Bank reconciliation, on new FastTabs (General and Financial dimensions), for the user to review or change
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
Account and Offset accounts (excluding ledger offet account type)'s financial dimensions. <br>
When user selects **Mark as new** and the records are moved to Matched transactions:  <br> • Account (Bank)'s financial dimensions will be populated from the Bank account. <br> • When user enters **Offset account number**, the offset account's financial dimension will be populated from their master accounts (for example customer's financial dimension), except ledger since it is populated in **Offset account number**. If this would result in a blank value it will be populated with Account (Bank)'s financial dimensions. <br> • If Account (Bank)'s financial dimensions are blank, Offset account's financial dimensions will be used to populate Account (Bank)'s financial dimensions. 

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

