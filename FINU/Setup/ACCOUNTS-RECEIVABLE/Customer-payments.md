---
# required metadata

title: Finance Utilities 
description: Accounts receivable setup - Customer Payments 
author: jdutoit2
manager: Kym Parker
ms.date: 2024-03-05
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  LedgerJournalTable5 
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

**Accounts receivable functionality**

The fields as described in the following subsections are available to control the additional functionality for accounts receivable.


# Methods of payment
The Method of payment form is used to set up and generate the EFT file from your Dynamics 365 environment. 


### EFT file name generation

This modification is to automatically populate EFT file name based on the number sequence pattern.

1. Set the **Number sequence** in the **Accounts reivable parameters**
    - On the Number sequence FastTab, set a sequence for **EFT file name**

2. Set whether the method of payment should automatically generate a filename for the EFT file. To open the the **Methods of payment** page, go to **Accounts payable > Setup > Payment setup > Methods of payment**.
    -	Highlight applicable method of payment
    -	Expand **EFT** FastTab and set **Enable file parameters** to _Yes_. If set to Yes, this will also override Electronic reporting's File name setup.
    -	File name mask - Use **Editor** to edit.
    -	Enter **File format**, example txt.

**Editor** button can be used to edit the file name mask. A combination of static values and placeholders can be assigned.


