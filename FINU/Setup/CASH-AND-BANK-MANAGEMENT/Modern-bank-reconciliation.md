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

# Advanced bank reconciliation functionality
The fields as described in the following subsections are available to control the additional functionality for advanced bank reconciliation with **Modern bank reconciliation** feature.

## Overview
Modern bank reconciliation feature contains exciting changes to Advanced bank reconciliation. 
The biggest change is the removal of Action **Mark new transactions**. This is replaced in std with:
- **Generate voucher** - offset type ledger
- **Generate vendor payment** - offset type vendor without settlement
- **Generate customer payment** - offset type customer without settlement
- **Settle customer invoice** - offset type customer with settlement

Finance Utilities extensions to Modern bank reconciliation:
- **Offset company** - Ability to post the offset to intercompany ledger, bank, vendor or customer.
- **Offset type Bank** - Modern bank reconciliation doesn't include an option for offset type Bank, we've added this option to **Generate voucher**.
- **Offset type Customer** - 

## Migration
See the following [link](Modern-bank-reconciliation-migration.md) for migration details.


## Setup

### Financial utilities parameters
Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters

In order to utilise Finance utilities extensions to Modern bank reconciliation:
- Enable feature **Modern bank reconciliation** and
- Set **Enable modern bank reconciliation extensions** to _Yes_

### Bank account
Cash and bank management > Bank statement reconciliation > Bank accounts

The following standard setup is required on each applicable bank account if customer/vendor payments will be created either by running Reconciliation matching rules, or within the Bank reconciliation Worksheet:

- Customer payment journal
- Vendor payment journal

### Bank reconciliation matching rules

Finance utilities extensions to Modern bank reconciliation adds the following functionality to each action that replaces **Mark new transactions**:

- **Generate voucher**
    - **Offset company** - ability to offset to a different legal entity (intercompany).
    - **Offset account type** - ability to offset to ledger or bank.
    - **Sales tax group** - only enabled for offset type ledger. If an intercompany offset company is selected, our field will provide tax drop-down options from the applicable intercompany legal entity.
    - **Item sales tax group** - only enabled for offset type ledger. If an intercompany offset company is selected, our field will provide tax drop-down options from the applicable intercompany legal entity.
 
- **Generate vendor payment**
    - **Offset company** - ability to offset to a different legal entity (intercompany).
 
- **Generate customer payment**
    - **Offset company** - ability to offset to a different legal entity (intercompany).
 
- **Settle customer invoice**
    - **Offset company** - ability to offset to a different legal entity (intercompany).



### Mark as New - Additional defaults

If the **Financial utilities parameter**'s **Extended financial details for new transaction** parameter is set to _Yes_, the option to capture the following details automatically for **Mark as new** bank statement lines can be selected.
-	Offset account type (Ledger, Customer, Vendor or Bank) and details
-	Financial dimensions - For Account (Bank) and/or Offset account 
-	GST


More detail for ** fields are discussed [here](#customer-payment-and-settle-of-invoice-11).

|    Field / Button   |    Description   |
|-|-|
| **Financial Dimensions > Offset account**  |  Financial dimensions that have to be used to post the _new_ transactions. <br> If the dimensions are filled in, it will override the financial dimensions set by default on the selected Offset account (Ledger, Customer, Vendor or Bank). <br> Else, financial dimensions set by default on the selected main account will apply with the new transaction. <br> ![Posting logic - Offset account](../../Images/PostingLogic_OffsetAccount.png "Posting logic - Offset account")|
| **Financial Dimensions > Account**  |  Financial dimensions that have to be used to post the _new_ transactions. <br> If the dimensions are filled in, it will override the financial dimensions set by default on the selected Account (Bank). <br> Else, financial dimensions set by default on the selected main account will apply with the new transaction. <br> ![Posting logic - Account](../../Images/PostingLogic_Bank.png "Posting logic - Account")|
| **Offset Company Account**  | Defaults to the current legal entity. <br> Populates the new field Offset Company Account in the Bank Statement Line Details form when a **Mark as new** line is created.           |
| **Offset Account type**   | Populates the new field Offset Account Type in the Bank Statement Line Details form when a **Mark as new** line is created. <br> Note: This field defaults to Ledger; Extended financial details only support offset account type _Ledger_, _Customer_ and _Vendor_.          |
**Offset Account**   |  Populates the new field Offset Account in the Bank Statement Line Details form when a **Mark as new** line is created.   |
**Offset account bank statement field** **	| Enabled when **Offset account type** is set to _Customer_. Option to map a field from the bank statement for Offset account. <br> **Offset account** and **Offset account reference bank statement field** needs to be _blank_, will receive error if try to populate multiple fields when setting up a rule.
**Offset account reference bank statement field** **  | Enabled when **Offset account type** is set to _Customer_. Option to map a field from the bank statement for finding the D365 customer account using [Customer references](../ACCOUNTS-RECEIVABLE/Customer-reference.md) <br> Ensure [Reference type](../ACCOUNTS-RECEIVABLE/Customer-reference.md#reference-number-type) has been populated in [Financial utilities parameters](Finance-utilities-parameters.md). <br> **Offset account** and **Offset account bank statement field** needs to be _blank_, will receive error if try to populate multiple fields when setting up a rule.
**Settle transaction** **	| Enabled when **Offset account type** is set to _Customer_. When creating the customer payment journal for the customer, should it attempt to settle the invoice. 
**Settle transaction bank statement field** **	| Enabled when **Offset account type** is set to _Customer_. Option to map a field from the bank statement for the transaction (D365 invoice) to be settled in the Customer receipt journal line. <br> If **Offset account**, **Offset account bank statement field** and **Offset account reference bank statement field** are blank, this field will be used to find the D365 customer account to create the Customer payment journal line.
**Auto-post customer payment journal** **	| Enabled when **Offset account type** is set to _Customer_. Indicates if the created (and settled if applicable) customer receipt journal should automatically be posted. If automatically posted, the newly created bank transaction(s) will also automatically be matched to the applicable bank statement lines. 
**Auto-post and transfer customer payment journal** **	| Enabled when **Offset account type** is set to _Customer_. Indicates if the created (and settled if applicable) customer receipt journal should automatically be posted. If any errors found (example stopped customer), the error lines will be moved to a new journal. Both customer payment journals' **Document** will refer to the Bank reconciliation. If automatically posted, the newly created bank transaction(s) will also automatically be matched to the applicable bank statement lines. 
| **GST Group**   |  Populates the field GST group in the Bank Statement Line Details form when a **Mark as new** line is created.   |
| **Item GST Group**    |  Populates the field Item GST group in the Bank Statement Line Details form when a **Mark as new** line is created   |
| **Description mask**    | Ability to set a Description mask for Mark new transactions. <br> **Editor** provides the ability to set a combination of static fields and placeholders: <br> • Currency <br> • Description <br> • Amount <br> • Document number <br> • Entry reference <br> • Bank statement transaction code <br> • Reference No. <br> • Related bank account <br> • Name (Trading party) <br> • Bank account <br> • Bank account number <br> • Bank groups <br> Note: If File name mask is not populated, the Bank statement line's Description will be written to new transaction's Description.

### Customer payment and settle of invoice (1:1)
#### Reconciliation matching rules
This section will provide more details for ** fields from above section.
Finance utilities allows for creating and optional settling of one invoice and optional posting of customer payment journal. One customer payment journal is created for all the bank statement lines matched with the mark as new rule. For improved traceability the Reconcile ID is populated in the Customer receipt’s journal Document on the journal’s setup tab. The customer payment journal's **Date** is set by the bank statement's **Booking date**.

The following subsection will discuss scenarios when running a Mark as new rule with **Offset account type** set to _Customer_
-	D365 customer account can be found by either of the following options. Target is **Account** in Customer payment journal line:
    -	**Offset account** is set to a specific customer account, or 
    -	**Offset account bank statement field** is set to use a field from the bank statement field (example Trading partner), or 
    -	**Offset account reference bank statement field** is set to use a field from the bank statement field. The bank statement value is used to find the applicable D365 customer account in [Customer references](../ACCOUNTS-RECEIVABLE/Customer-reference.md), or 
    -	If all of these fields are blank **Settle transaction bank statement field** (D365 invoice) will be used to find the D365 customer account
-	**Settle transaction** determines if the created/posted customer receipt journal should attempt to settle an invoice:
    - **Yes** - Uses **Settle transaction bank statement field**’s mapping to find the D365 invoice number in the bank statement line and populate the **Invoice** field in the Customer payment journal line. If the invoice can’t be settled in the journal line, the infolog will provide a warning which invoices couldn’t be settled.
    - **No** - The customer payment journal line will not attempt to settle an invoice; **Invoice** field will be blank in the Customer payment journal line. 
-	**Settle transaction bank statement field** - Set which field from the bank statement will contain the D365 invoice (example Document number or Reference No.)
    - Target: **Invoice** in Customer payment journal line, if **Settle transaction** is set to _Yes_.	
- **Auto-post customer payment journal**: 
    - **Yes** - The customer receipt journal will be posted and automatically matched with the bank statement lines. A Match Id will be assigned for all the transactions and moved to matched on the Bank reconciliation worksheet when running the rule.
    - **No**: The customer receipt journal will only be created. Once the user has reviewed and posted the customer payment journal, refresh the bank reconciliation’s worksheet to bring in the new bank transactions. User has to either use a match with bank statement rule or manually match the applicable bank statement lines with these new bank transactions.
 

##### Field format
The ability to set field format is available for the following fields:
- Offset account bank statement field
- Offset account reference bank statement field
- Settle transaction bank statement field

Select the **Field format** for the applicable field and set one of the following options:
- **No format** - The bank statement field will be used as-is.
- **Fixed field position** - Set **Start position** and **Length**.
- **Delimited field position** - Set **Delimiter** (default is space) and **Field position**.
- **Custom format** - Ability to use a [regex](https://regex101.com/) format

The **Example** and **Value** field is automatically updated based on above selection.
The user can also paste/type their own example into Example to view the resulted Value from their setup.

Example result for each option:

Option	  	| Setup             | Example <br> Bank statement field's original data	  | Value
:--       	|:--                |:--                                                  |:--
**No format**  |                 | xxUS-001xx                      | xxUS-001xx
**Fixed field position**        | Start position: 2 <br> Length: 6  | xxUS-001xx        | US-001
**Delimited field position**    | Delimiter:  <br> Field position: 0   | US-001 extra description  | US-001
**Custom format**               | `\*(.+)\*`                         | \**US-001\**         | US-001

#### Financial utilities parameters
Additional setup is also required on [Financial utilities parameters](Finance-utilities-parameters.md) to assign the following:
- Reconciliation customer payment journal name
- Method of payment
- Reference type - if using Customer references to find the D365 customer account

#### General ledger parameters
If Financial utilities parameter **Populate unique voucher for each journal line** is set to _No_, it is also required to configure General ledger parameters.
When the system creates a customer payment journal for the bank statement transaction, the one voucher could contain lines for multiple customers. Therefore, you must set up your system so that a single voucher can have multiple customer lines.

To enable a single voucher to have multiple customer lines, follow these steps.
1.	Go to **General ledger > Ledger setup > General ledger parameters**.
2.	On the Ledger tab, on the General FastTab, set the Allow multiple transactions within one voucher option to Yes.
3.	If you receive a warning message, select Close to accept the change.

#### Customer payment journal
<ins>Bank reconciliation</ins> <br>
When the rule is run, a customer payment journal is created and the **Journal id** will be provided in the **Message details**

<ins>Customer payment journal</ins> <br>
The following fields are populated in the created customer payment journal:
- Header fields
     -  **Document** - Populated from **Reconciliation ID**
     -  **Posted** - Determined by rule's **Auto-post customer payment journal**
 - Line fields
     - **Date** - Populated from Bank statement line's Booking date
     - **Account** - Determined by offset details in rule
     - **Invoice** - If rule is set to settle and invoice is provided in bank statement
     - **Description** - Populated from Reconciliation matching rule's Description mask. If Description mask is blank, it is populated with only the Bank statement line's Description
     - **Credit** - Bank statement line's amount
     - **Offset account** - Bank statement's Bank account
     - **Method of payment** - Set in Financial utilities parameters

#### Possible processing issues:
-	Warning log: ‘Account % does not exist’
If the customer account can’t be found in D365, the bank statement line will be excluded from the customer receipt journal and the transactions won’t automatically match in the bank recon since the total values don’t match. 
-	Warning log: ‘Invoice % doesn’t exist’
If the recon matching rule is set to settle the invoice and the invoice can’t be found in D365, the customer receipt journal line will still be created without field Invoice being populated.
