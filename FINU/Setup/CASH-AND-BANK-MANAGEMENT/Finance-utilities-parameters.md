---
# required metadata

title: [Finance Utilities ]
description: [Cash and bank management setup - Finance utilities parameters]
author: [jdutoit2]
manager: Kym Parker
ms.date: 12/05/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [SAB_FinUtilParameters]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Advanced bank reconciliation functionality
The fields as described in the following subsections are available to control the additional functionality for advanced bank reconciliation.

## Setup
### Finance utilities parameters

The **Financial utilities parameter** page within **Cash and bank management** is used to define settings that apply to Advanced bank statement functionality. These settings offer extended options on reconciliation matching rules, additional functionality on the bank reconciliation worksheet and other behavior. The settings also includes number sequence.
To open the **Financial utilities parameters** page, go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters**. <br>
Then set the fields as described in the following subsections.

#### General
**Reconciliation matching rule**

**Field** | **Description**
:--       |:--
**Extended matching rule operator** | This parameter activates a new operator **Included in** in the Reconciliation matching rules form. It supplements the **Contains** capability, and means that the field selected is a part of the nominated Bank statement field.
**Extended financial details for new transaction** | This parameter enables the capture of the following details automatically if the bank statement line is marked as 'New' <br> • Financial dimensions <br> • GST  <br> • Sub-Ledger offset account

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

**Setup for customer payment journal**
Required when using Bank reconciliation matching rules to create customer payment journals - see [here](Bank-reconciliation-matching-rules.md#customer-payment-and-settle-of-invoice-11) for more information.

**Field** | **Description**
:--       |:--
**Reconciliation customer payment journal name**  | Used to populate **Name** in the customer payment journal created when using bank reconciliation matching rules with **Offset account type** set to _Customer_.
**Method of payment**     | Used to populate **Method of payment** in the customer payment journal created when using bank reconciliation matching rules with **Offset account type** set to _Customer_.
**Populate unique voucher for each journal line** |	When customer payment journal is created using the additional Finance utilities fields on **Reconciliation  matching rules** (for mark as new transactions), this field provides options if the journal will be created with unique vouchers for each line. If new field is enabled, General ledger parameters’ **Allow multiple transactions within one voucher** doesn’t need to be enabled.

#### **Number sequences**
The following number sequences are available for advanced bank reconciliation.

**Field**     | **Description**
:--           |:--
**Match Id**  | The number sequence that defines the Match IDs on the bank reconciliation Worksheet
