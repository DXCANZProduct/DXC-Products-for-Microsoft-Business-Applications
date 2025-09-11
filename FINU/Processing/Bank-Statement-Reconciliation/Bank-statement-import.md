---
# required metadata

title: Finance Utilities 
description: Bank statement reconciliation processing - Bank statement import 
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-09-10
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankStatementTable
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Bank statement import 

# Manual import
The **Bank statement** page  is used to manually import the bank statement into your D365 environment. 
Users can navigate to the page by going to **Cash and bank management > Bank statement reconciliation > Bank statements**

> Note: Setup **File attachment document type** on [Financial utilities parameters](../../Setup/CASH-AND-BANK-MANAGEMENT/Finance-utilities-parameters.md) to attach the import file to the created D365 Bank statement(s).

Select **Import statement**.
Where the selected statement format is marked as **Customised format** the following additional fields are available on the import:

Field  	          | Description	                                                | Options
:--               |:--                                                          |:--
**From date**     | Select transactions >= this date                            | Calendar
**To date**       | Select transactions <= this date                            | Calendar
**Date**          | Select which date to use when **Mark as new** <br> transactions are posted | •	Today’s date <br> •	Statement Transaction Date <br> (_To date_ of the Bank statement header)

> Note: Where the bank statement file contains transactions related to multiple dates and multiple bank accounts (i.e. the file is imported using the option **Import statement for multiple bank accounts in all legal entities**, separate bank statement records get created in D365 for each bank account. 

The **Statement ID** number sequence in Cash and bank management parameters is used to generate the Statement identifier. 

When a bank statement (BAI2/NAI/BRS/Flat file) is imported, statement lines will only be imported where the following matching rules are validated:  
1.	If Bank statement format is setup as **Customised format**, bank statement lines has to be between the **From date** and **To date** specified in the **Import bank statement**.  
2.	If **Import statement for multiple bank accounts in all legal entities** is NOT enabled in the import bank statement screen, the bank account number in the bank statement line has to match the bank account number of the bank account selected in the import bank statement screen. 
3.	If **Import statement for multiple bank accounts in all legal entities** is enabled in the import bank statement screen, the **Bank account number** in the bank statement line has to match the bank account number of one of the bank accounts in bank master in any of the legal entities. <br>

In addition, where Import statement for multiple bank accounts in all legal entities is enabled, and if D365 finds multiple bank accounts in same/different legal entities with the same bank account number while importing the statement, following order of priority is applied: 
1.	Bank accounts with the same Bank account number in the same D365 entity in which user is importing the bank statement, system imports the bank statement to the first identified bank account record. 
2.	If the bank account exists within multiple D365 entities, the bank statement is imported into the bank account in the D365 entity from which user is importing the bank statement. If this bank account is not in the entity in which user is importing the bank statement, system imports the bank statement to the first identified bank account record 

# Periodic import

The bank statement can also automatically be imported by using periodic task [Import bank statements via financial utilities connection](../../Setup/CASH-AND-BANK-MANAGEMENT/Bank-statement-import.md).

Filter **Imported via financial utilities connection** on the Bank statement import, can be used to filter to bank statements imported using above periodic task.

### Error processing
Error process if there are issues with creating all the bank statement(s) for the file using the periodic task: 

If the Bank statement format is:
- **Custom format** - No bank statements will be created and the file will be moved to the Financial utilities connection's **Error path**.
- **Generic electronic import format** - Std. will create the bank statements that can be created, and the file will be moved to the Financial utilities connection's **Archive path**.

Example error that will result in not all bank statement(s) being created: An unique bank account was not found for a Bank account number within the file

### File states for bank statement import

View and manage Bank statement files imported via the periodic task. <br>
It allows users to easily view logs and applicable files state for each bank statement file. 

#### Fields

Field  	          | Description	                                                | Options / Examples
:--               |:--                                                          |:--
**Name**              | Name of the Financial utilities connection                  | SFTP
**File name**         | Name if the bank statement file                             | xxx.txt
**Statement format**  | Name for the bank statement format used on the periodic task  | BAI2
Status            | File state                                                  | • **Completed** - Succesfully created bank statement/s <br> • **Error** - Bank statement wasn't created, for example 'No matching bank account found' <br> • **Cancelled** - Option to cancel, which changes the status from Error to Cancelled.
**Created date and time**  | Date and time the file was imported

#### Buttons

The following buttons are available on the Action Pane.

Button 	          | Description	                                               
:--               |:--    
<ins> **Import** <ins>
**Retrieve files**    | Opens periodic task 'Import bank statements via financial utilities connection'
<ins> **Process** <ins>
**Log**                | View info, warning or error logs
**Process**            | Ability to reprocess error files
<ins> **Process** <ins>
**Bank statement**     | Opens Bank statement form, filtered to bank statement/s created for the file
<ins> **Maintain** <ins>
**Reset format**      | Ability to change error files to a different bank statement format
**Cancel**            | Ability to change error files to cancelled status



