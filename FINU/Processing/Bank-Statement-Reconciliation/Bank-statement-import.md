---
# required metadata

title: [Finance Utilities ]
description: [Bank statement reconciliation processing - Bank statement import ]
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
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

## Bank statement import 

The **Bank statement** page  is used to import the bank statement into your D365 environment. 
Users can navigate to the page by going to **Cash and bank management > Bank statement reconciliation > Bank statements**

Select **Import statement**.
Where the selected statement format is marked as **Customised format** the following additional fields are available on the import:

| **Field**        | **Description**                                               | Options
|-                 |-                                                              |-
| **From date**    | Select transactions >= this date                              | Calendar
| **To date**      | Select transactions <= this date                              | Calendar
| **Date**         | Select which date to use when **Mark as new** <br> transactions are posted | •	Today’s date <br> •	Statement Transaction Date <br> (_To date_ of the Bank statement header)

> Note: Where the bank statement file contains transactions related to multiple dates and multiple bank accounts (i.e. the file is imported using the option **Import statement for multiple bank accounts in all legal entities**, separate bank statement records get created in D365 for each bank account. 
 
The **Statement ID** number sequence in Cash and bank management parameters is used to generate the Statement identifier. 

When a bank statement (BAI2/NAI/BRS/Flat file) is imported, statement lines will only be imported where the following matching rules are validated:  
1.	If Bank statement format is setup as **Customised format**, bank statement lines has to be between the **From date** and **To date** specified in the **Import bank statement**.  
2.	If **Import statement for multiple bank accounts in all legal entities** is NOT enabled in the import bank statement screen, the bank account number in the bank statement line has to match the bank account number of the bank account selected in the import bank statement screen. 
3.	If **Import statement for multiple bank accounts in all legal entities** is enabled in the import bank statement screen, the **Bank account number** in the bank statement line has to match the bank account number of one of the bank accounts in bank master in any of the legal entities. <br>

In addition, where Import statement for multiple bank accounts in all legal entities is enabled, and if D365 finds multiple bank accounts in same/different legal entities with the same bank account number while importing the statement, following order of priority is applied: 
1.	Bank accounts with the same Bank account number in the same D365 entity in which user is importing the bank statement, system imports the bank statement to the first identified bank account record. 
2.	If the bank account exists within multiple D365 entities, the bank statement is imported into the bank account in the D365 entity from which user is importing the bank statement. If this bank account is not in the entity in which user is importing the bank statement, system imports the bank statement to the first identified bank account record 

