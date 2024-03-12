---
# required metadata

title: Core Extensions
description: Display reciprocal exchange rates
author: jdutoit2
manager: Kym Parker
ms.date: 2023-02-22
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  OMLegalEntities
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.valid from: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Display reciprocal exchange rate

## Overview
**Display reciprocal exchange rate** allows companies to view the exchange rates in reciprocal format. <br>
For example, instead of showing 0.69, it displays a result of 1/0.69 relevant to the *home* currency set for the legal entity.  <br>
This applies to all users and all exchange rate types for the selected company.

 
## Setup
From the Legal Entity form, you can set this option for the current selected company.

1. Navigate to **Organization administration > Organizations > Legal Entity**. 
2. Click on Edit button and expand the **General** fast tab and set **Display reciprocal exchange rate** to _Yes_. 

## Display
The following forms will display the reciprocal exchange rate:<br>

- <ins>General journal lines<ins>
1. Navigate to **General ledger > Journal entries > General journals**
2. Select the required Journal from the list.
3. View the exchange rate fields per line under the *General* tab
- <ins>Vendor invoice journal lines<ins>
1. Navigate to **Accounts payable > Invoices > Tax invoice journal**
2. Select the required Journal from the list.
3. View the exchange rate fields per line under the *General* tab
- <ins>Vendor payment journal lines<ins>
1. Navigate to **Accounts payable > Payments > Vendor payment journal**
2. Select the required Journal from the list.
3. View the exchange rate fields per line under the *General* tab
- <ins>Purchase order totals<ins>
1. Navigate to **Accounts payable > Purchase orders > All purchase orders**
2. Click **Purchase**  from the Action Pane  and select *Totals* under the **View** tab (on the Action Pane)
3. The *Exchange rate*  field is located under the *Purchase order totals* fast tab located in Pane on the right of the screen
- <ins>Customer payment journal lines<ins>
1. Navigate to **Accounts receivable > Payments > Customer payment journal**
2. Select the required Journal from the list.
3. View the exchange rate fields per line under the *General* tab
- <ins>Free text invoice totals<ins>
1. Navigate to **Accounts receivable > Invoices > All free text invoices**
2. Select *Totals* from the Action pane to display the Totals Pane. The exchange rate is located at the bottom including the respective currency code
- <ins>Sales order totals<ins>
1. Navigate to **Accounts receivable > orders > All sales orders**
2. Click **Sales order**  from the Action Pane  and select *Totals* under the **View** tab (on the Action Pane)
3. The *Exchange rate*  field is located under the *Sales order totals* fast tab located in Pane on the right of the screen



