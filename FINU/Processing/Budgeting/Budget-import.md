---
# required metadata

title: [Finance Utilities ]
description: [Budgeting processing - Importing the budget]
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
