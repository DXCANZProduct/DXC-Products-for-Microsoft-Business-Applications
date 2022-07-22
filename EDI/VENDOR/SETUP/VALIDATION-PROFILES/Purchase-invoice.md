---
# required metadata

title: EDI Vendor
description: EDI Vendor Setup - Document type Validation profiles - Purchase invoice
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-21
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Vendor setup
## Vendor document type validation profiles - Purchase invoice

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
  - **Error** - An Infolog is displayed with an error. If the validation rule fails, the staging records will be set to error state and the target document note created/updated. 


**Validation instance**       | **Validation rule**           | **Description**       | **Info/Warning tolerance updates**
:-------                      |:-------                       |:----------            |:----------
**Purchase order header**     |	**Invoice account**           |	Where the vendor account for the EDI trading partner differs to the Invoice account on the Purchase order	| Create invoice against Trading partner’s vendor account and not the PO's invoice account

## Where used
The **Validation profile** can be assigned on the Incoming documents FastTab to document type **Vendor advanced shipping notice** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Validation profile
- EDI Validation profile line
