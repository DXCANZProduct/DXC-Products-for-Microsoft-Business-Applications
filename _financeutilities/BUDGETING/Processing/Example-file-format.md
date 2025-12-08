---
layout: product-content
header: Finance Utilities
toc: true
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


