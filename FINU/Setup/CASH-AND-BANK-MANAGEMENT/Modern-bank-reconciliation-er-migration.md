---
# required metadata

title: Finance Utilities
description: Cash and bank management setup - Modern bank reconciliation rule migration
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-09-03
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

# Overview

Modern bank reconciliation includes major changes to Reconciliation matching rules. <br>
**Mark new transaction** rules have been replaced by new actions as described in more detail [here](Modern-bank-reconciliation.md) .

Currently the standard **Reconciliation matching rules** data entity doesn't support Modern bank reconciliation new actions. <br>
Interim option for migration is to either manually create/change the **Mark new transaction** rules to the new actions, or use Electronic reporting to create these new Reconciliation matching rules. <br>
The following sections will describe the Electronic reporting import option.

> Note: After enabling the **Modern bank reconciliation** feature, running the standard **Cash and bank management > Setup > Advanced bank reconciliation setup > Advanced bank reconciliation data upgrade** will **DELETE** all remaining **Mark new transaction** reconciliation matching rules. It is thus important to ensure all required rules have been migrated before running this upgrade.

> Note: The Electronic reporting import option is only provided as **interim** solution and clients would need to map any additional fields including financial dimensions. <br>
> Validation hasn't been built into the import. <br>
> The Electronic reporting configuration files will be published on the Finance Utilities LCS solution.

# Tables and Configurations

### Tables

Modern bank reconciliation rules are stored in the following tables:

1. BankReconciliationMatchRule - Shared across legal entities
1. BankReconciliationMatchRuleLine - Shared across legal entities
1. BankReconciliationMatchRule_PostingInfo - Legal entity specific offset details

### Electronic reporting configurations

Electronic reporting consists out of the following configurations: 

1. Bank reconciliation match rule model - related to BankReconciliationMatchRule table
1. Bank reconciliation match rule line model - related to BankReconciliationMatchRuleLine table
1. Bank reconciliation match rule posting Info model - related to BankReconciliationMatchRule_PostingInfo table

# Reconcilition matching rule Actions

### Generate voucher

Action **Generate voucher** is used for offsets to ledger and bank.

1. **File 1** - Bank Reconciliation match rule
1. **File 2** - Bank reconciliation match rule line (Step 1)
1. **File 3** - Bank reconciliation match rule posting Info (Step 2)

### Generate vendor payment

Action **Generate vendor payment** is used for offsets to vendors.

- File 1 - Bank Reconciliation match rule
- File 2 - Bank reconciliation match rule line (Step 1)
- File 3 - Bank reconciliation match rule posting Info (Step 2)

### Generate customer payment

Action **Generate customer payment** is used for offsets to customers.

- File 1 - Bank Reconciliation match rule
- File 2 - Bank reconciliation match rule line (Step 1 and 2)
- File 3 - Bank reconciliation match rule posting Info (Step 3)

### Settle customer invoice

Action **Settle customer invoice** is used for offsets to customers.

- File 1 - Bank Reconciliation match rule
- File 2 - Bank reconciliation match rule line (Step 1 and 2)
- File 3 - Bank reconciliation match rule posting Info (Step 3)

### Fields per table / configuration

**File 1 - Table : Bank Reconciliation  match rule** (BankReconciliationMatchRule)
1.	Rule Id
1.	Name
1.  IsActive
1.	MatchActionType
1.	Search Matching Entry 
1.	Matching Type
1.	Require Manual Matching

**File 2 - Table : Bank reconciliation match rule line (Step 1 & Step 2)** (BankReconciliationMatchRuleLine)
1.	Rule Id
1.	Compare Field String
1.	Compare Field ID
1.	Field ID
1. 	Line Num
1.	Line Type
1. 	Operator
1. 	Source Table ID
1.	Value
1. 	Offset Account Pattern

**File 3 - Table : Bank reconciliation match rule posting Info** (BankReconciliationMatchRule_PostingInfo)
1.	Rule ID
1.	Legal Entity
1.	Bank Transaction Type
1.	Transaction Text
1.	Offset Account Type
1.	Offset Company
1.	Customer Account
1.	Vendor Account
1.	Automatic Customer Account Matching
1.	Account date type
1.	Method of payment
1.	Sales Tax Group
1.	Item Sales Tax Group
1.	Prepayment Journal Voucher
1.	Posting Profile
1.	Post

### Import process

After creating the three csv files (without headers), the files can be imported via the **Run** option on the mapping configuration.

![ER import](../../Images/ER-import.png "Electronic reporting import")

Example import files: 

Excel file with headings and examples for each action: 

