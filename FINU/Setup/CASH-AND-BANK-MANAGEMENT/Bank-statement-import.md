---
# required metadata

title: Finance Utilities 
description: Cash and bank management setup - Periodic import Bank statement
author: jdutoit2
manager: Kym Parker
ms.date: 2022-06-17
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BankStatementTable, DFUConnection
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

## Bank statement periodic import
When the bank statements are to be imported via the periodic task **Import bank statements via financial utilities connection**, the following prerequisites are required.

### Prerequisites
1.	Setup [Financial utilities connection](Finance-utilities-connections.md)
1.	Setup [Bank accounts](Bank-accounts.md):
   - Select applicable **Posting date**
   - Select applicable **Financial utilities connection** - Optional (for info)

### Optional
1. Setup **File attachment document type** on [Financial utilities parameters](Finance-utilities-parameters.md) to attach the import file to the created D365 Bank statement(s).

### Batch job
After the prerequisites have been completed, setup required batch job(s) by using **Cash and bank management > Periodic tasks > Import bank statements via financial utilities connection**

Field         | Description                         | Mandatory
:--           |:--                                  |:--:
**Financial utilities connection**  |	Select the applicable Financial utilities connection  |	Y
**Statement format**  |	Select the applicable bank statement format	  | Y

### Bank statement
**Cash and bank management > Bank statement reconciliation > Bank statements**. <br>
Filter **Imported via financial utilities connection** on the **Bank statement** form, provides users with the ability to filter to bank statements imported via the batch job. <br>
If the file contains any bank accounts that can't be found in D365, no bank statements will be created, and the file will be moved from the Import to **Error path** as setup on the Financial connection.

Where the Statement format selected in the Batch job, is a **Custom format**, the created bank statement’s:
- **From date** - will be set to earliest date found in the file
- **To date** - will be set to latest date found in the file

