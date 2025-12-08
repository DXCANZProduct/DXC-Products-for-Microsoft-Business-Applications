---
layout: product-content
header: Finance Utilities
toc: true
---

# Advanced bank reconciliation functionality
The fields as described in the following subsections are available to control the additional functionality for advanced bank reconciliation.

## Setup
### Financial utilities parameters

The **Financial utilities parameter** page within **Cash and bank management** is used to define settings that apply to Advanced bank statement functionality. These settings offer extended options on reconciliation matching rules, additional functionality on the bank reconciliation worksheet and other behavior. The settings also includes number sequence.
To open the **Financial utilities parameters** page, go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters**. <br>
Then set the fields as described in the following subsections.

#### General
**Reconciliation matching rule**

**Field** | **Description**
:--       |:--
**Extended matching rule operator** | This parameter activates a new operator **Included in** in the Reconciliation matching rules form. It supplements the **Contains** capability, and means that the field selected is a part of the nominated Bank statement field.
**Extended financial details for new transaction** | This parameter enables the capture of the following details automatically if the bank statement line is marked as 'New' <br> • Financial dimensions <br> • GST  <br> • Sub-Ledger offset account
**Reference type**  | Populate [Reference type](../ACCOUNTS-RECEIVABLE/Customer-reference#reference-number-type) where Customer references are used to find D365 customer account for mark as new Reconciliation matching rules using field **Offset account reference bank statement field**.

**Bank reconciliation**

**Field** | **Description**
:--       |:--
**Ability to reconcile unmatched statements** | If this parameter is not marked, the button **Mark as reconciled** is disabled in the Bank Reconciliation Worksheet when **Unmatched amount** is _NOT zero_.
**Ability to enter reconciliation balances** | This parameter allows the user to enter any amount to balance the difference between the statement line and bank transaction line, in a separate **Correction** column. <br> The correction balance is posted to the ledger account associated with the bank transaction type as setup in **Cash and bank management > Setup > Bank transaction type**
**Auto assign Match id** | Streamline **Match Id** and **Match Bank** reconciliation Worksheet functionality. When marked bank statement and bank transactions balances, the user can select the **Match** button and **Match id** will be auto assigned. The user is then not required to select **Match Id** before **Match**.

**Bank statement**

**Field** | **Description**
:--       |:--
**Enable custom bank statement formats** | This parameter enables a Customized format field in bank statement format in **Cash and bank management > Setup > Advanced bank reconciliation setup > Bank statement format**. <br> If the bank statement format is marked as a customised format, additional fields become active to configure the BAI2/NAI/Flat/BRS file statement upload
**Auto-post bank statement** | When Auto-post bank statement is to _Yes_, the bank statement will automatically be posted upon selecting **Mark as reconciled** from the **Bank Reconciliation Worksheet** page.
**File attachment document type** | Select applicable document type. When populated, the import file will be attached to the created bank statement(s). This applies to bank statements created with manual or periodic job import. <br> Ensure the file extension is setup in all applicable legal entities **File types** in **Document management parameters**.

**Setup for customer payment journal**
Required when using Bank reconciliation matching rules to create customer payment journals - see [here](Bank-reconciliation-matching-rules#customer-payment-and-settle-of-invoice-11) for more information.

**Field** | **Description**
:--       |:--
**Reconciliation customer payment journal name**  | Used to populate **Name** in the customer payment journal created when using bank reconciliation matching rules with **Offset account type** set to _Customer_.
**Method of payment**     | Used to populate **Method of payment** in the customer payment journal created when using bank reconciliation matching rules with **Offset account type** set to _Customer_.
**Populate unique voucher for each journal line** |	When customer payment journal is created using the additional Finance utilities fields on **Reconciliation  matching rules** (for mark as new transactions), this field provides options if the journal will be created with unique vouchers for each line. If new field is enabled, General ledger parameters’ **Allow multiple transactions within one voucher** doesn’t need to be enabled.
**Only match posted statement lines** | Select to match _only_ the **bank statement** lines posted as D365 **bank transactions** when running **Reconciliation matching rule** with action **Mark new transactions**. For example mark as new bank reconciliation rule finds three records in the bank statement, but only two of the customers exist and thus won't balance since only two lines were posted as customer payment journal lines. This option only applies to where the **Reconciliation matching rule** creates and posts new customer payment journals.

#### **Number sequences**
The following number sequences are available for advanced bank reconciliation.

**Field**     | **Description**
:--           |:--
**Match Id**  | The number sequence that defines the Match IDs on the bank reconciliation Worksheet
**Staging Id**  | The number sequence that defines AR Utilities Remittance format's Staging Id
**Template ID**  | The number sequence that defines AR Utilities Remittance format's Template Id
