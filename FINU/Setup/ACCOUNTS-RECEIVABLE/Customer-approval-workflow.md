---
# required metadata

title: Finance Utilities 
description: Accounts receivable setup - Customer approval workflow 
author: jdutoit2
manager: Kym Parker
ms.date: 2022-09-08
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  CustParameters
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accounts receivable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts receivable.

## Customer approval workflow

When changes are made to specific customer fields, standard D365 customer workflow can be used for approval before the changes are applied to the customer. 
Finance utilities has added additional **Customer bank account** and **Customer** fields that can be managed by the same workflow.

Users can access the **Accounts receivable parameters** page by navigating to **Accounts receivable > Setup > Accounts receivable parameters**. <br>
The below fields have been added to the existing Customer approval fields. When enabled they will be submitted using the existing **Proposed customer changes workflow.**

### Customer bank account
-	Bank groups
-	BSB number
-	Bank account number
-	SWIFT code
-	IBAN

### Customer
-	Allow on account
-	Unlimited credit limit
-	Exclude from credit management
-	Invoicing and delivery on hold
-	Charges group
-	Customer rebate group
-	Commission group
-	Payment schedule
