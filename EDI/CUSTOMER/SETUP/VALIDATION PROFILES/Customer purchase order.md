---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setup - Document type Validation profiles - Customer purchase order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 4/10/2021
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

# Customer setup
## Customer document type validation profiles - Purchase order

Users can access the form by navigating to **EDI > Setup > Document types**.

Validation profiles are groups of business validation rules that can be applied to a trading partner. They provide the ability to set variable tolerances on various different aspects of the documents business process. Once a validation profile is created it can be configured by adding validation rules to it and defining the error tolerance of the rule. <br>
Once setup for each document type, the validation profile can be assigned to each incoming document on the Trading partner setup in **EDI > Setup > Trading partners**.

> Note:  The validation profiles FastTab is only displayed from Document types that have valid validation options

- To create a new record, select the **New** button in the validation profiles FastTab.
- Specify the **Name** and **Description** of the profile.
- Select the **Name** hyperlink or the **Setup** button to update profile details.
- Select **Add** to add the validation rule.
- Select the **Validation rule**.
- Select the **Error tolerance** to specify the validation level.  If a validation rule fails, this will be used to determine how it reacts. Options:
  - **Info** - An Infolog is displayed with information only. If the validation rule fails a message will be written to the staging records log but the record will continue to process.
  - **Warning** - An Infolog is displayed with a warning. If the validation rule fails a message will be written to the staging records log but the record will continue to process. 
  - **Error** - An Infolog is displayed with an error. If the validation rule fails, the staging records will be set to error state and the target document note created/updated. Except for Customer module where an order hold will be applied to the sales order. The **Validation error hold code** that was assigned in EDI parameters will be applied to the Sales order.

**Validation instance**       | **Validation rule**     | **Description**
:-------                      |:-------                 |:----------
**Sales Order**               |	**Delivery Date**       |	The delivery date should not be a historical date. <br> > Note: Delivery date control must be enabled
**Sales Order Line**          |	**Delivery Date**       |	The delivery date should not be a historical date. <br> > Note: Delivery date control must be enabled
**Sales Order Line**          |	**Minimum/Maximum quantity**	The quantity should be devisable by the multiple specified on the Default/Site order settings table.
**Sales Order Line**	        | **Sales Price**	The unit price should be checked using the standard D365 pricing rules.  It must first convert the price to the standard method of input for that customer (CustTable.InclTax) , if the prices are slightly different it should check the tolerance before giving an error/warning.  It should also check the new field on the customer table Use customer price before updating the sales line. <br> Example: <br> Item X trade agreement price 10.25 <br> Item Y trade agreement price 8.88 <br>
Customer has a min and max tolerance setting of 0.05 <br> Customer does not have their trade agreements entered including tax. <Br> Customer sends their EDI orders including tax
The setting use customer pricing is given <br> Item X EDI file price (before converting) 11.26 (after conversion) 10.24 <br> Item Y EDI file price (before converting) 9.70 (after conversion) 8.82 <br> Template setting against this field is warning <br> A warning is only given for Item Y because it is outside of the tolerance.  The warning message should show the price before and after conversion plus the price AX finds
**Sales Order Line**	        | **Sales Unit**	It should first check that this unit of measurement actually exists, a second check should be the measurement on the inventory table module for sales
