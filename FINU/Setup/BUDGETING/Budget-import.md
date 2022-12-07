---
# required metadata

title: Finance Utilities 
description: Budgeting setup - Budget Import 
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_FinBudgetParameters, BudgetTransactions
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

# Budgeting functionality
The following subsections describe the setup used to control the additional Finance utilities functionality for budgeting.

## Budget import
Finance utilities includes the ability to import a csv budget file with monthly columns.

### Setup budget import
The **Budget register entries** page is used to import your financial budget data into your D365 environment. 
Within the **Budget utilities parameters** page, you will set up the details regarding the format of the Budget import file.

#### Dimensions
First step is to select the **Dimensions** that should be available for selection in the  **Budget utilities parameters** page. <br>
Users can reach the **Dimensions for budgeting** page by navigating to **Budgeting > Setup > Basic budgeting > Dimensions for budgeting**. <br> 
Add the financial dimensions from **Chart of accounts dimension** to **Budget dimension** to set the **Dimension code**(s) that will be available in the **Budget utilities parameters**.

#### Budget utilities parameters
Second step is to set up the import file fomat in the **Budget utilities parameters** page. <br>
Users can reach the **Budget utilities parameters** page by navigating to **Budgeting > Setup > Basic budgeting > Budget utilities parameters**.

The following table describes the fields that are available on the **Budget import** tab of the **Budget utilities parameters** page.

|   Field    |   Description   | Example
|-                      |-     |-             
| **Field separator**   |  Specify the field separator for the CSV file  | , |
| **Number of months**  |  Specify the number of months that will be imported with the file  | 12 |
| **Skip rows**         |  If the file has a header row, you can specify 1 in this field.  With this setup, the 1st row will be skipped and the 2nd row will be the 1st row to be imported  | 1
| **Dimension code**    |  Select all the dimensions that will be included in the import file and press **Select**. If any dimensions are not visible, see [Dimensions](#dimensions). Note: Once the record is saved, this field will revert to blank as it is only used to populate the **Dimension format** field. | 
| **Dimension segment delimiter**  |  Select the delimiter used as the delimiter between the dimension elements in the import fields  | - |
| **Dimension format**  |  When the dimensions are selected in the **Dimension code** field, these will automatically populate the **Dimension format** field in financial dimension sort order.  To change the order of these fields, simply cut & paste dimensions into required order to match the import file. | BusinessUnit-CostCenter

### Budget import processing
Budget import processing is discussed in detail at [Budget import processing](../../Processing/Budgeting/Budget-import.md).
