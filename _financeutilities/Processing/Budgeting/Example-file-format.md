---
# required metadata

title: Finance Utilities 
description: Budgeting processing - Example file format
author: jdutoit2
manager: Pontus Ek
ms.date: 2024-06-26
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_FinBudgetParameters, BudgetTransactions
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version:: AX 7.0.1
---

# Budgeting functionality
The following subsections describe the processing requirement for the additional Finance utilities functionality for budgeting.

## Example file format

The example below is an example of a budget file to be imported.  <br>
The file must be .csv format and column order needs to match below sequence. <br>
From column (A), the column details are:

-	Main Account 
-	Dimension 1 - Setup in Budget utilities parameters's Dimension format
-	Dimension 2 - Setup in Budget utilities parameters's Dimension format
-	Account type - Revenue or Expense
-	Currency
-	Comment
-	Include in - Yes or No
-	GST group
-	Start Date - for the 1st period of the register entry (i.e. 01/01/2017)
-	Monthly values for each budget register entry

[Example file](https://dxcanzproduct.github.io/DXC-Products-for-Microsoft-Business-Applications/FINU/ExampleFiles/BudgetImportExample.csv)

## Generate template

Users can navigate to **Budgeting > Setup > Basic budgeting > Budget utilities parameters** and use button **Generate template** to download csv template based on the following setup:
- Number of months
- Dimension format


