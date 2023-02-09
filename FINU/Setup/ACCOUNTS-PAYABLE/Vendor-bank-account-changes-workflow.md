---
# required metadata

title: Finance Utilities 
description: Accounts payable setup - Vendor bank account changes workflow 
author: helenho
manager: Kym Parker
ms.date: 2023-02-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  VendParameters
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## Vendor approval workflow

When changes are made to specific vendor fields, standard D365 vendor workflow can be used for approval before the changes are applied to the vendor. 
Finance utilities has added additional **Vendor bank account** and **Vendor** fields that can be managed by the same workflow.

Users can access the **Accounts payable parameters** page by navigating to **Accounts payable > Setup > Accounts payable parameters**. <br>
The below fields have been added to the existing Vendor approval fields. When enabled they will be submitted using the existing **Proposed vendor changes workflow.**

### Vendor bank account
-	Bank groups
-	BSB number
-	Bank account number
-	SWIFT code
-	Biller code (Finance utilities BPAY field)
-	Lodgement reference (Finance utilities BPAY field)
-	IBAN
-	Active date
-	Expiration date

### Vendor
-	Payment id (existing field used for Finance utilities BPAY)

> Note: From 10.0.32 MS has added a preview feature called 'Vendor bank account change proposal workflow'. If this feature is enabled it will use std's functionality for approving changes to Vendor bank accounts and the following needs to be manually configured: <br> 
>   -  Vendor bank account approval in Accounts payable parameters - Enable the fields that requires approval
>   -  Workflow approval for proposed vendor change. Workflow to approve the proposed vendor bank account changes
