---
# required metadata

title: Finance Utilities 
description: Accounts payable setup - Vendor bank account changes workflow 
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
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
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: : 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## Vendor bank account changes workflow

When changes are made to specific vendor fields, standard D365 vendor workflow can be used for approval before the changes are applied to the vendor. 
Finance utilities has added additional vendor fields that can be managed by the same workflow.

### Setup vendor approval
Users can access the **Accounts payable parameters** page by navigating to **Accounts payable > Setup > Accounts payable parameters**. <br>
The below fields have been added to the existing Vendor approval fields. When enabled they will be submitted using the existing **Proposed vendor changes workflow.**

**Vendor bank account:**
-	Bank groups
-	BSB number
-	Bank account number
-	SWIFT code
-	Biller code (Finance utilities BPAY field)
-	Lodgement reference (Finance utilities BPAY field)
-	IBAN
-	Active date
-	Expiration date

**Vendor:**
-	Payment id (existing field used for Finance utilities BPAY)
