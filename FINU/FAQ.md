---
# required metadata

title: Finance Utilities 
description: Finance Utilities - FAQ 
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-22
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  Finance Utilities 
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

# 	Frequently Asked Questions

### Where can I find contact information for support?
   
Support contact details can be located on the **Contact** tab at **Organization admininstration > Workspaces > DXC support**
  
### Where can I identify the installed version of the Finance utilities module

On the Navigation bar, select **Help & support > About**. <br>
A list of installed models will be displayed on the **Version** tab.  Scroll to **DXC Finance Utilities**. The version information will be displayed on the right (i.e. DXC Finance Utilities **10.0.240.2019443** (isv))


## 	Troubleshooting
### 	Bank statement doesn’t import

#### Issue
Bank statement doesn't import.
 
#### Resolution
To check bank account mapping, navigate to Cash and bank management > Setup > Advanced bank reconciliation setup > Bank statement format
Things to check:
1.	**Field delimiter** and **Record code field position** (if applicable). Else the fields can't be extracted and matched.
2.	**Custom format > Lines: Bank account number**. Compare:
- Import file's bank account: Does it contain bsb+account or just account?
- Company bank accounts: Bank account number field only (not bsb): Does it match to import file's bank account number? If import file contains bsb+account and your bank setup is split into bsb and bank account number fields, set up appropriate start position on **Custom format > Lines**.

### 	Generating AP payment - AuthenticationFailed
#### Error
AP > Payments > Vendor receipt journal
When Generating AP payment:
<br>
```
<Error>

<Code>AuthenticationFailed\</Code> <br>
<Message> <br>
Server failed to authenticate the request. Make sure the value of Authorization header is formed correctly including the signature. <br>
</Message> <br>
<AuthenticationErrorDetail> <br>
Signature did not match. String to sign used was <br>
</AuthenticationErrorDetail> <br>
</Error> 
```

#### Resolution
AP > Payment setup > Methods of payment <br>
If **Enable file parameters** is set to _Yes_ on your Method of Payment, the **File format** requires a value.

### 	Generating AP payment - Total line order
#### Error
Bank sends an error for the Vendor EFT payment for issues with the total debit or credit amounts.

#### Resolution
Cash and bank management > Bank statement reconciliation > Bank accounts <br>
Select the applicable bank account and select the applicable order in field **Total line order**. <br> 
Options are:
- Total net, total credit, total debit
- Total net, total debit, total credit
- Total credit, total debit, total net
- Total debit, total credit, total net

[User guide](Setup/ACCOUNTS-PAYABLE/Vendor-payments.md)

### 	Payment advice report – Vendor bank details missing
#### Issue
AP Payment advice doesn't show Vendor bank details:

#### Resolution
Select the Finance utilities report on [Payment advice](Setup/ACCOUNTS-PAYABLE/Vendor-payments.md#payment-advice-report) report's Print management.

### 	Saving to secure location

If there is an error saving the file to secure location and **Stop processing on failure** was enabled on **Electronic reporting destination**, the processing will error and **Payment status** remains _None_. Example error: The process stopped because the delivery of file ‘%’ to the destination failed. The payments cannot be generated. <br>
Check setup on the applicable [Electronic reporting export connections](Setup/ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md)

### 	Number sequences are not available to setup

To load all new number sequence references click the button **Reset** on: <br>
Organization administration > Number sequences. Select **Manual cleanup > Reset** on the Action Pane.

### Bank statement import - Posting date
#### Issue
When importing a Bank statement with Posting **Date** set to _Statement transaction date_ the **Posting date** on the created Bank statement is set to _Today's date_

#### Resolution
Prior to Finance utilities 10.0.9.202006101 selecting _Statement transaction date_ in **Posting date** only worked for Bank statement format's **Custom format** is set to _Yes_. <br> 
_Today's date_ is the default value, and thus defaulted for non custom bank statements.
If you have a version higher or equal above, verify that **Bank statement entity** child entity **Bank statements_BankStatementEntity** contains field **SAB_FINUTILPOSTINGDATETYPE**.

If it doesn't contain above field:
- Select **Modify target mapping** on Bank statements_BankStatementEntity
- Delete all the lines
- **Refresh entity list** in **Framework parameters**
- After refresh has been completed, check **Bank statements_BankStatementEntity** again and retest import with **Date** set to _Statement transaction date_

### Vendor bank account changes
From 10.0.32 MS has added a preview feature called 'Vendor bank account change proposal workflow'. If this feature is enabled it will use std's functionality for approving changes to Vendor bank accounts and the following needs to be manually configured: <br> 
-  Vendor bank account approval in Accounts payable parameters - Enable the fields that requires approval
-  Workflow approval for proposed vendor change. Workflow to approve the proposed vendor bank account changes

If Finance utilities vendor bank account approval have stopped working, check if above feature has been enabled and ensure the std. configuration has been completed.
