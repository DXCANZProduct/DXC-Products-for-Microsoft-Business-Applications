---
# required metadata

title: Forex contract
description: Link Forex contract
author: jdutoit2
manager: Kym Parker
ms.date: 2023-04-14
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_ForexContractTableListPage, PurchTableListPage, VendTrans
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: 
ms.search.region: ICONForex
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Link Forex contract

A Forex contract could be linked to a purchase order header, purchase order line or invoice journal. <br>
When the Invoice is created from a purchase order it will automatically store the exchange rate.  And when the Invoice is settled/paid it will use the Forex contract exchange rate. <br> 
Forex contract cannot be allocated to a purchase agreement. <br>
Forex contracts can be allocated via: <br>
-	Purchase order header
-	Purchase order line
-	Invoice journal line
-	Forex contract

Forex numbers displayed are filtered by:

<br>	             | Purchase order	| Forex contract
:--                  |:--               |:--
**Currency**         | Currency	        | Terms currency
**Date**             | Created date     | Expiration date


> Note: When allocations are being made, whether the currency, amount and due date between the Forex contracts and documents match with each other will be verified by D365. Corresponding actions will be taken according to parameter configurations.
Over allocation will not be permitted unless **Allow over allocation** field is ticked in the **Forex contract** form.

## Purchase order header

Go to **Accounts payable > Purchase orders > All purchase orders**

-	Select the applicable purchase order.
-	On the Action Pane, on the **Invoice** tab, in the **Forex contract** group, select **Link to forex contract**.
-	Select the applicable **Forex number(s)**. If the selected Forex number’s unallocated amount is less than the purchase order’s amount, the user will be able to select multiple forex contracts until the purchase order amount has been fully allocated.
-	Each selected Forex number’s **Allocate** field will automatically update to the amount it is able to allocate. The field can also be edited to a different amount, but needs to be:
    -	Less or equal to the purchase order’s unallocated amount.
    - Less or equal to the forex contract’s unallocated amount.
-	Select **OK**.

## Purchase order lines

Go to **Accounts payable > Purchase orders > All purchase orders**

-	Select the applicable purchase order line.
-	On the **Financials** FastTab, select **Link to forex contract**.
-	Select the applicable **Forex number(s)**. If the selected Forex number’s unallocated amount is less than the purchase order line’s amount, the user will be able to select multiple forex contracts until the purchase order line amount has been fully allocated.
-	Each selected Forex number’s **Allocate** field will automatically update to the amount it is able to allocate. The field can also be edited to a different amount, but needs to be:
    - Less or equal to the purchase order line’s unallocated amount.
    - Less or equal to the forex contract’s unallocated amount.
-	Select **OK**.

## Invoice journal

Go to **Accounts payable > Invoices > Invoice journal**

-	Select the applicable invoice journal line
-	On the Action Pane, in the **Functions** group, select **Link to forex contract**.
-	Select the applicable **Forex number(s)**. If the selected Forex number’s unallocated amount is less than the invoice journal line amount, the user will be able to select multiple forex contracts until the journal line amount has been fully allocated.
-	Each selected Forex number’s **Allocate** field will automatically update to the amount it is able to allocate. The field can also be edited to a different amount, but needs to be:
    - Less or equal to the invoice journal line’s unallocated amount.
    - Less or equal to the forex contract’s unallocated amount.
-	Select **OK**.

## Forex contracts

Go to **Forex contracts > Forex contracts > All forex contracts**

Purchase order headers can be allocated to forex contracts via:

-	Select the applicable forex contract.
-	On the Action Pane, on the **Forex contracts** tab, select **Link to document**.

<ins>Option 1 - Manually allocate amounts</ins>
-	Select the applicable **Purchase order(s)**. If the selected document’s unallocated amount is less than the forex contract’s amount, the user will be able to select multiple documents until the forex contract amount has been fully allocated.
-	Enter amount in **Allocate** field, amounts needs to be:
    - Less or equal to the document’s unallocated amount.
    - Less or equal to the forex contract’s unallocated amount.
-	Select **OK**.

<ins>Option 2 - Auto allocate amounts</ins> 
- Select the **Auto allocate** button to automatically allocate the forex contract's unallocated amount top-down to the documents.
- Select all the records that should be alloced and select **OK**.
