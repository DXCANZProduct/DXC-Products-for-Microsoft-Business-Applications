---
# required metadata

title: [Finance Utilities ]
description: [Cash and bank management setup - Bank statement format ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

### Bank Statement format

To open the **Bank statement format** page, go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Bank statement format**.

#### Fields

When the **Financial utilities parameter**'s **Enable custom bank statement formats** is enabled, the following Finance utilities fields become active in the **Bank statement format** page.

| **Field**           | **Description** |
|-|-|
| **Custom format**   | Checkbox option which enables the **Custom format** buttons and following fields.
| **ABSR file type**  | Choose the file format of the bank statement – options include:  <br> •	Flat File <br> •	NAI File <br> •	BAI2 <br> •	Custom <br> •	BRS |
| **Field delimiter** | The type of field delimiter the file uses. E.g. a comma “,”  |
| **Record code field position** | This field is active only if the **ABSR file type** is set to BAI2, NAI or BRS file. This field captures the position of the **Line code** in each line of the file. E.g. if Field Number = 1, the first field of each line in the file determines the Line code (i.e. 01, 02, 03, 16, 49, 98, 99).
| **Record code field length** | Applicable to BRS files types as BRS files aren't delimited |

> Note: When creating a bank statement format, processing group is mandatory (including for Finance utilities custom bank statement formats). Before configuring a custom bank format, a processing group for entity **Bank statements** must be created as an Import project in **Data management**. See [standard setup](https://docs.microsoft.com/en-us/dynamics365/finance/cash-bank-management/set-up-advanced-bank-reconciliation-import-process) for steps on creating a new progressing group.

#### Custom Format

When field **Custom format** is set to _Yes_, the button **Custom format** is enabled on the Action Pane.

#### Buttons

| **Button** | **Description** |
|-|-|
| **Custom Format > Lines** | The **Lines** page stores the column definition to use whilst importing the custom bank statement. |
| **Custom Format > Line codes** | The **Line codes** page stores the **Custom line codes**. The button is only enabled when **ABSR file type** is set to _Custom_ or BRS|
| **Custom Format > Line codes format** | The **Type codes** stores the relation between statement code and transaction direction (debit/credit) for BAI2 or NAI file <br> Note: Type codes button is active only if the **ABSR file type** is set to _BAI2 file_, _NAI file_ or _Custom_. | 

##### **Custom Format - Line Codes**
The **Custom Format - Line codes** page is used to determine the line identifier for this bank statement. It is used in the **Custom Format - Lines** definition. It contains the following fields:

| **Field** | **Description** |
|-|-|
| **Line Code** | The field number corresponds to the **Custom line code** specified on the bank statement. |
| **Description** | Specify the format line code description. |
| **Is transaction line** | Specify if the line code is a transaction line. |

##### **Custom Format – Lines**

The **Custom Format - Lines** page defines the column definitions to use whilst importing the bank statement. It identifies which fields to use, and their position on the Bank Statement file, for the system to use when loading the detail into the system. It contains the following fields:

> Note: Not all columns in the statement need to be configured. 

| **Field** | **Description** |
|-|-|
| **Field number**| The field number corresponds to the **column number** on the bank statement.|
| **Line code** or **Custom line code**| The **Line code** option appears when the **ABSR file type** is either _BAI2 File_ or _NAI File_. <br> Line type of the file where the Bank Statement fields map to Dynamics 365 Bank Transactions: <br> **02**	– Group Header  <br> **03**	– Account Identifier <br> **16** – Transaction detail <br> **88** – Continuation Record <br>  The **Custom line code** option appears when the **ABSR file type** is either _BRS_ or _Custom_ and utilizes the **Line code** as setup on **Custom format - Line codes**
| **Field** | The corresponding bank account transaction field in Dynamics 365 that this bank statement field maps to - options include: <br> •	Date <br> • Bank statement transaction code <br> • Description <br> • Amount <br> • Reference no. <br> • Entry reference  <br> • Bank account number <br> • Currency <br> • Trading party <br> • Document number <br> • Related bank account |
| **Start position** | If no delimiter is selected on the header, the start position of the field will need to be entered. This field can also be used for files with delimiter where only a set number of characters need to be mapped, for example only map account number starting from 7 for a bank statement field containing bsb (6 characters) + account number (9 characters) |
| **Length** | If no delimiter is selected on the header, the length of the field will need to be entered. This field can also be used for files with delimiter where only a set number of characters need to be mapped, for example only map account number containing 9 characters for a bank statement field containing bsb (6 characters) + account number (9 characters)|
| **Strip leading zeroes** | Specifies whether any leading zeroes in this field should be removed. |
| **Date format** | This specifies the date format in the bank statement.  Note: This option appears when the **Field** is set to _Date_. |
| **Use Julian date format** | Where applicable, enter the bank statement format's date field in Julian format, for example BRS using YYYYDDD |
| **Decimal adjustment** | This specifies the Decimal adjustment required for the bank statement's **Amount**. For example bank statement amount is 20055, but last two charactes are decimal, thus amount to be mapped to D365 Bank statement is 200.55 <br> For this example enter 2 in **Decimal adjustment** field.| 
| **Position credit/debit** |	This specifies the position of the credit/debit indicator for BRS file’s Amount field. Only enabled where **ABSR file type** is _BRS_.|


##### **Custom Format - Line codes format**
The **Line codes format** page controls how transaction **amounts** are posted.

| Field | Description |
|-|-|
| **From type code** | Transaction type code range from the Bank Statement Transaction Types |
| **To type code** | 	Transaction type code range from the Bank Statement Transaction Types|
| **Debit/Credit** | 	Area to specify if transaction statement line amount is: <br> •	Debit in the system (i.e. positive) <br> • Credit in the system (i.e. negative) |
| **Description** |	Description of the particular rule |

> Note: The **Line codes format** page is available only when **ABSR file type** is set to either _BAI2 File_, _NAI File_, or _Custom_.
