---
# required metadata

title: Finance Utilities 
description: Budgeting processing - Importing the budget
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-07-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  BudgetTransactions
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

# Budgeting functionality
The following subsections describe the processing requirement for the additional Finance utilities functionality for budgeting.

## Budget import
Finance utilities includes the ability to import a csv budget file with monthly columns.

## Example file format
See [Example file format](Example-file-format.md) for example file.

### Setup budget import
Setup requirements are discussed in detail at [Budget import setup](../../Setup/BUDGETING/Budget-import.md). <br>
Importing the budget file will be discussed in the following subsections.

### Importing the budget file
The **Budget register entries** page is used to import the csv file into your D365 environment. 
Users can reach the **Budget register entries** page by navigating to **Budgeting > Budget register entries**.

-	Select **New** to create a new record.
-	Update the **Default Date** (if required).
-	Select the **Budget model** and **Budget code**.
-	Once the Budget entry header is complete, select **++Import Lines** from the Budget account entries FastTab.
-	Select **Browse** to search for the file to be imported.
-	Specify the **Number of Months** that will be imported - defaults from **Budget utilities parameters**.
-	Select **Update Existing** to update existing budget entries. When selected to update existing, the new value imported will be added to the value already in the budget lines.  To overwrite values previously imported, delete the budget lines and re-import. 
- Validate the imported data, then select **Update budget balances**.

### Security configuration

- **Import lines**
  - Privilege: Budget set up and import
  - Duty: Maintain budget import
