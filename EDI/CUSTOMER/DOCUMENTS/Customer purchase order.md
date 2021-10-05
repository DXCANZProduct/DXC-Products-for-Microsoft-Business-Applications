---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Customer purchase order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 5/10/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
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

# Customer purchase order
The following [**Customer EDI order types**](../SETUP/CUSTOMER%20SETUP/Purchase%20order%20types.md) and [**Order purposes**](../SETUP/CUSTOMER%20SETUP/Order%20purpose%20group.md) are supported by each Customer inbound document:
**Document type**		                  | **Order type**	| **Order purpose**
:----                                 |:----            |:----
**Customer purchase order**	          | Order		        | Original <br> Confirmation <br> Cancellation
**Customer purchase order**	          | Agreement		    | Original
**Customer purchase order**	          | Release order	  | Original
**Customer purchase order change**	  | Order		        | Change <br> Cancellation

Inbound files have the following three steps:
1. **Import** - Imported file can be viewed in **EDI > Files > Inbound files**
2. **Import to staging** - Imported file is processed to staging record/s. The staging record/s can be viewed at **EDI > Documents > Customer documents > Customer purchase order**
3. **Staging to target** - The staging record/s is processed to target. Based on the **Order type**, the target will be either a:
    - Sales order (**Accounts receivable > Orders > All sales orders**)
    - Sales agreement (**Accounts receivable > Orders > Sales agreements**

### Create document
![alt text](../../CORE/Image/Create_Document.png "Create document")

### Header checks for Customer purchase order
Header checks performed when:
1. Importing Customer purchase order, 
2. Processing from import to staging and 
3. Processing from staging to target.
![alt text](../IMAGE/HeaderChecks_CustomerPO.png "Header checks for Customer purchase order")

## Step 1 - Import
When a purchase order file is imported, the file name is key to identifying the customer and therefore the document template. See [Trading partners](../../CORE/Setup/Trading%20partners.md) for further details.  It is based on this document template that the data within the file is identified and a record created in the EDI staging table in the next step.

> Note: The file mask is used to identify the trading partner and therefore template

## Step 2 - Import to staging - Inbound file validation
When the purchase order file is retrieved and imported, there are various validations that are completed before the staging record is created in the EDI staging table.

**Rule Id**         |	**Details**         |	**Possible error at this step**
:--                 |:--                  |:---
**Check Template**  |	Identify a template for the Customer/Document type. This will be used to identify the whereabouts of data within the file 	| If the file doesn't match the template's format, the Inbound file will error and not create the staging record.

### Possible issues and fixes
**Import to staging** errors can be viewed in:
- **EDI > Files > Inbound files** filtered to **Status** set to _Error_
- **EDI > Document maintenance**, tab **Customer documents**, tile **File import errors**

At this step the issues are usually around the file not matching the template.
- Does the file have the correct template assigned (General tab, field **Template**):
  - **No**: Use **Reset template** to assign a different template. If this should apply to future documents for the Trading partner, also update in **Trading partners**.
  - **Yes**: Review **Log** and fix the applicable template in **EDI > Setup > Document types**. Examples issues are date format, new field.

## Step 3 - Staging to target - Staging table validation
There are various **Order types** that can be processed via the purchase order document. These order types can be specified in **Trading partners** Options and will change the way the record is processed.

> Note: Expectation is the customer sends price _inclusive of discounts_. 
