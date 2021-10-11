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

> **Note:** When creating a bank statement format, processing group is mandatory (including for Finance utilities custom bank statement formats). Before configuring a custom bank format, a processing group for entity **Bank statements** must be created as an Import project in **Data management**. See [standard setup](https://docs.microsoft.com/en-us/dynamics365/finance/cash-bank-management/set-up-advanced-bank-reconciliation-import-process) for steps on creating a new progressing group.

#### Custom Format

Only available when **Custom format** is ticked
#### *Buttons*

| **Button** | **Description** |
|-|-|
| **Custom Format > Lines** | The Lines form stores the column definition to use whilst importing the bank statement. |
| **Custom Format > Line Codes** | The Line codes form stores the format line type. |
| **Custom Format > Line codes format** | The **Type codes** stores the relation between statement code and transaction direction (debit/credit) for BAI2 or NAI file <br> Note: Type codes button is active only if the **ABSR file type** is BAI2 file, NAI file or Custom. | 


*Note: Line codes button is active only if the ABSR file type is Custom or BRS.*


**Custom Format - Line Codes**

**CASH AND BANK MANAGEMENT > SETUP > ADVANCED BANK RECONCILIATION SETUP > BANK STATEMENT FORMAT**

**Custom Format - Line codes button** is used to determine the line identifier for this bank statement. It is used in the **Custom Format - Lines** definition. It contains the following fields;

| **Field** | **Description** |
|-|-|
| **Line Code** | The field number corresponds to the format line type specified on the bank statement. |
| **Description** | Specifies the format line type description. |

**Custom Format – Lines**

***CASH AND BANK MANAGEMENT > SETUP > ADVANCED BANK RECONCILIATION SETUP > BANK STATEMENT FORMAT***

***Custom Format - Lines button***

The Lines form defines the column definitions to use whilst importing the bank statement. It identifies which fields to use, and their position on the Bank Statement file, for the system to use when loading the detail into the system. It contains the following fields;

| **Field** | **Description** |
|-|-|
| **Field number**| The field number corresponds to the column number on the bank statement.  Note: Not all columns in the statement need to be configured. |
| **Line code** | This option appears when the ABSR File Type is either BAI2 File, NAI File, BRS or Custom. <br> Line type of the file where the Bank Statement fields map to Dynamics 365 Bank Transactions: <br> 02	– Group Header  <br> 03	– Account Identifier <br> 16 – Transaction detail <br> 88 – Continuation Record <br>  Custom (This will use the codes specified on the Line Codes form)|
| **Field** | The corresponding bank account transaction field in Dynamics 365 that this bank statement field maps to - options include: <br> -	Date <br> - Bank statement transaction code <br> - Dbescription <br> - Amount <br> - Reference no. <br> - Entry reference  <br> - Bank account number <br> - Currency <br> - Trading party <br> - Document number <br> -Related bank account |
| **Start position** | If no delimiter is selected on the header, the start position of the field will need to be entered. |
| **Length** | If no delimiter is selected on the header, the length of the field will need to be entered. |
| **Strip leading zeros** | Specifies whether any leading zeroes in this field should be removed. |
| **Date format** | This specifies the date format in the bank statement.  Note: This option appears when the Bank Account Transaction Field is Date. |
| **Use Julian date format** | 	Y/N |
| **Decimal adjustment** | This specifies the Decimal format in the bank statement. <br> Note: This option appears when the File Type is **BAI2** File or **BRS** and Bank Account Transaction Field is **Amount**. | 
| **Position credit/debit** |	This specifies the position of the credit/debit indicator for BRS file’s Amount field|


***Custom Format - Line Codes Format
CASH AND BANK MANAGEMENT > SETUP > ADVANCED BANK RECONCILIATION SETUP > BANK STATEMENT FORMAT
Custom Format - Line codes format button.*** The line codes format form controls how transaction types are posted
| Field | Description |
|-|-|
| **From type code** | Transaction type code range from the Bank Statement Transaction Types |
| **To type code** | 	Transaction type code range from the Bank Statement Transaction Types|
| **Debit/Credit** | 	Area to specify if transaction statement line amount is: <br> -	Debit in the system (i.e. positive) <br> -	Credit in the system (i.e. negative) |
| **Description** |	Description of the particular rule |

The line codes format form is available only when either the **BAI2, NAI** File, or **Custom** format is selected.
