---
# required metadata

title: [Core Extensions]
description: [Core Extensions - Import budgets]
author: [Liam Coll]
manager: Kym Parker
ms.date: 02/08/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Core Extensions]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Import Budgets
## Overview
The Import Budgets extension allows importing budget from Microsoft Excel templates where period budgets are presented in a traditional columnar format including dynamically adding financial dimensions and financial period across columns.

## Setup
### Budget Models
Navigate to **Budgeting > Setup > Basic budgeting > Budget models**

This form is used to create the budget models and sub models that are the basis for the structure of the ledger budgets. The budget model id is a required column in the budget file template.
 
### Budget Code
Navigate to **Budgeting > Setup > Basic budgeting > Budget codes**

Budget codes form is used to set up budget codes for budget register entries. You can use budget codes to categorize budget types.

### Budgeting Dimensions
Navigate to **Budgeting > Setup > Basic budgeting > Dimensions for budgeting**

Budgeting dimensions form is used to specify which financial dimensions in the account structures that are associated with the chart of accounts are available for Budgeting. Dimensions inserted in this form will be included when generating template from the Import draft budget register entries form.
 
### Budget Import Format
The file for import can be Microsoft Excel (xlsx) format. Dynamics 365 will detect the type of file during import.

The following table outlines the fields available for Budget Import, whether they are mandatory, and some information about the field. If a field is not required to be imported by the user, it can be left blank, unless it is mandatory field.

|  **Field**  | **Mandatory** | **Details** | 
|:---|:---|:---|     
|  **Entry number**  | Yes | The document number for the budget register entry. <br/><br/> The import will respect the systems number sequence and generate a new entry number. The number entered in this field will be ignored. It is used for grouping. <br/><br/> If the entry number is found in the system, the process will update based on the parameter selected in the dialog to Overwrite or Append. |  
|  **Budget model**  | Yes | The Dynamics 365 Budget model that the budget register entry will be posted to. |  
|  **Budget code**  | Yes | The Dynamics 365 budget code to categorize values for the budget registry entry. |  
|  **Amount type**  | Yes | Either Expense or Revenue amount type for the budget account entry. |  
|  **Currency**  | Yes | The currency code for the budget account entry. |  
|  **Comment**  | No | Comment about the budget account entry. |  
|  **Cash flow forecast**  | No | If this budget record is to be included in the cash flow forecast enter *Yes*, otherwise *No*. |  
|  **GST group**  | No | The relevant GST group relating to the budget record. Typically, this would be left blank. |  
|  **Account Structure**  | No | The account structure to use to resolve the main account. |  
|  **Main Account**  | No | The GL Ledger Account for this budget record. |  
|  **Dimensions**  | No | Dimension included in the Budgeting Dimension setup and value assigned here must exist in Dynamics 365. |  
|  **Dates**  | No | Dates for the current period will be generated at the top. |  

*Note: Columns will be expanded for each Dimension and Date.*

### Preparing the Import File
The file to import should be generated using the Generate template button. This ensures the correct financial dimensions and country region is respected. English Australia and English US will generate different headings. E.g. Sales tax group vs GST group

1. Navigate to **Budgeting > Periodic > Import budget register entries** 
2. Click on Generate Template
    * A budget excel template would open in excel with a header row.
    * Dimensions included on the template as highlighted below is based on the budgeting dimension setup.
3. The default date headers can be changed to different dates. This is designed to make template flexible to cater for many different budget periods.
4. Save the file as Excel to a desired location.

## Process
To import the Microsoft Excel file
1. Navigate to **Budgeting > Periodic > Import budget register entries**
2. Select a file to upload – Click Browse to select the appropriate file for importing.
3. Overwrite– Select one of the following
    * **Overwrite** - This will delete the lines on the draft budget for the same entry number being imported.
    * **Append** – This will leave all budgets lines on the draft budget for the same entry number being imported.
4. Click OK. The import process will begin. If any errors arise during import, a message will display a message. Fix all errors and re-import.
5. Upon successful import, a message will display import complete and created budget register entry number.
6. The imported budgets will be in the All Budget Register entries list with a status of Draft

7. Navigate to **Budgeting > Common > Budget register entries > All budget register entries**
8. Highlight and click edit to view the budget. The budget can be altered manually if required. If no changes are required, complete the budget by clicking on Updated budget balances to move the budget from Draft to Approved. 
