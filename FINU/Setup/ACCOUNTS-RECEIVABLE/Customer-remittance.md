---
# required metadata

title: DXC Finance Utilities - AR utilities
description: Customer remittance setup
author: jdutoit2
manager: Kym Parker
ms.date: 2023-04-18
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
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Customer remittance setup
The fields as described in the following subsections are available to control the functionality for customer remittance import available in additional licensed feature **AR Utilities**.

## Accounts receivable parameters

The **Accounts receivable parameters** page contains additional fields used to define settings that apply to Customer remittance functionality.

To open the page, navigate to **Accounts receivable > Setup > Accounts receivable parameters** and select the **Settlement** tab.<br>
Then set the fields as described in the following subsections.

**Field** | **Description**   
:--       |:--
**Create prepayment**                   | When set to _Yes_ customer payment journal line(s) that aren't settled against a D365 invoice, will be created as a prepayment. 
**Auto post customer payment journal**  | When set to _Yes_ the created cusomer payment journal will be automatically posted.
**File attachment document type**       | Select applicable document type. When populated, the import file will be attached to the created customer payment journal. <br> Ensure the file extension is setup in all applicable legal entities File types in Document management parameters.

## Methods of payment
The **Methods of payment** page contains additional fields used to define settings that apply to Customer remittance functionality.

To open the page, navigate to **Accounts receivable > Payment setup > Methods of payment** and select the **General** FastTab.<br>
Then set the fields under **Import payments processing** as described in the following subsections.

**Field** | **Description**   
:--       |:--
**Error account customer**  | 
**Settle transaction**      | 
**Posting date**            | 
**Reference number type**   | 
**Remittance format**       | 

