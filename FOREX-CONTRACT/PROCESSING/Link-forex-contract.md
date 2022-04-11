---
# required metadata

title: [Forex contract]
description: [Link Forex contract]
author: [jdutoit2]
manager: Kym Parker
ms.date: 11/04/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Forex contract]
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

# Link Forex contract

A Forex contract could be linked to a purchase order header, purchase order line or invoice journal. <br>
When the Invoice is created from a purchase order it will automatically store the exchange rate.  And when the Invoice is settled/paid it will use the Forex contract exchange rate. <br> 
Forex contract cannot be allocated to a purchase agreement. <br>
Forex contracts can be allocated via: <br>
-	Purchase order header
-	Purchase order line
-	Invoice journal line

Forex numbers displayed are filtered by:

<br>	              | Purchase order	  | Forex contract
:--             |:--                |:--
**Currency**    |	Currency	        | Terms currency
**Date**        |                   | Expiration date


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

Go to **Accounts payable > Invoices > Invoice journal

-	Select the applicable invoice journal line
-	On the Action Pane, in the **Functions** group, select **Link to forex contract**.
-	Select the applicable **Forex number(s)**. If the selected Forex number’s unallocated amount is less than the invoice journal line amount, the user will be able to select multiple forex contracts until the journal line amount has been fully allocated.
-	Each selected Forex number’s **Allocate** field will automatically update to the amount it is able to allocate. The field can also be edited to a different amount, but needs to be:
    - Less or equal to the invoice journal line’s unallocated amount.
    - Less or equal to the forex contract’s unallocated amount.
-	Select **OK**.

