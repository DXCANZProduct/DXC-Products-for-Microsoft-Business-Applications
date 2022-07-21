---
# required metadata

title: EDI Customer
description: EDI Customer Setup - Document type Validation profiles - Customer purchase order change
author: jdutoit2
manager: Kym Parker
ms.date: 2021-10-04
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIDocumentTypeTable, SAB_EDITradingPartner 
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer setup
## Customer document type validation profiles - Purchase order change

Users can access the form by navigating to **EDI > Setup > Document types**.

Validation profiles are groups of business validation rules that can be applied to a trading partner. They provide the ability to set variable tolerances on various different aspects of the documents business process. Once a validation profile is created it can be configured by adding validation rules to it and defining the error tolerance of the rule. <br>
Once setup for each document type, the validation profile can be assigned to each incoming document on the Trading partner setup in **EDI > Setup > Trading partners**.

> Note:  The validation profiles FastTab is only displayed from Document types that have valid validation options

- To create a new record, select the **New** button in the validation profiles FastTab.
- Specify the **Name** and **Description** of the profile.
- Select the **Name** hyperlink or the **Setup** button to update profile details.
- Select **Add** to add the validation rule.
- Select the **Validation rule**.
- Select the **Error tolerance** to specify the validation level.  If a validation rule fails, this will be used to determine how it reacts. The logs can be viewed on the staging record's **Show log** or **Version log**. Options:
  - **Info** - An Infolog is displayed with information only. If the validation rule fails a message will be written to the staging records log but the record will continue to process.
  - **Warning** - An Infolog is displayed with a warning. If the validation rule fails a message will be written to the staging records log but the record will continue to process. 
  - **Error** - An Infolog is displayed with an error. If the validation rule fails, the staging records will be set to error state and the target document note created/updated. Except for Customer module where an order hold will be applied to the sales order. The **Validation error hold code** that was assigned in EDI parameters will be applied to the Sales order.

**Validation instance**       | **Validation rule**           | **Description**
:-------                      |:-------                       |:----------
**Sales Order**               |	**Delivery Date**             |	The delivery date should not be a historical date. <br> Note: Delivery date control must be enabled
**Sales Order Line**          |	**Delivery Date**             |	The delivery date should not be a historical date. <br> Note: Delivery date control must be enabled
**Sales Order Line**          |	**Minimum/Maximum quantity**	| The sales line quantity should be devisable by the multiple specified on the Default/Site order settings table.
**Sales Order Line**	        | **Sales Price**	              | The unit price should be checked using the standard D365 pricing rules.  It must first convert the price to the standard method of input for that customer (CustTable.InclTax) , if the prices are slightly different it should check the tolerance before giving an error/warning.  It should also check the field on the customer table **Use customer price** before updating the sales line. <br> Example: <br> Item X trade agreement price 10.25 <br> Item Y trade agreement price 8.88 <br> Customer has a **Maximum negative price variance** and **Maximum positive price variance** of 0.05 assigned on the **Customer purchase order** setting profile. <br> Customer does not have their trade agreements entered including tax. <br> Customer sends their EDI orders including tax. <br> The setting use customer pricing is given <br> Item X EDI file price (before converting) 11.26 (after conversion) 10.24 <br> Item Y EDI file price (before converting) 9.70 (after conversion) 8.82 <br> Document's **Error tolerance** validation is set to _Warning_ <br> A warning is only given for Item Y because it is outside of the tolerance.  The warning message should show the price before and after conversion plus the price AX finds. 
**Sales Order Line**	        | **Sales Unit**	              | It should first check that this unit of measurement actually exists, a second check should be the measurement on the inventory table module for sales

## Where used
The **Validation profile** can be assigned on the Incoming documents FastTab to document type **Customer purchase order change** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Validation profile
- EDI Validation profile line
