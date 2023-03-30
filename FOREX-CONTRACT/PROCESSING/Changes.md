---
# required metadata

title: Forex contract
description: Changes
author: jdutoit2
manager: Kym Parker
ms.date: 2022-04-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_ForexContractTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: 
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

## Changes
The following section describes the process of changes to purchase orders and forex contracts after they have been allocated/linked to each other.

## Changes on purchase orders
It is possible that purchase orders are modified after having Forex contracts allocated. <br>
But after a purchase order or purchase order line has been received, the allocation of Forex contracts to them cannot be cancelled or changed. <br>

Changes on purchase orders and shipments will have following effects:
-	Reducing the line amount of the purchase order will automatically reduce the allocated amount on the linked Forex contract.
-	If the amount of the purchase order is increased, the action taken will be based on the parameters.  If the increase means the value is greater than the remaining amount of the Forex contract and the parameter Increase to a PO warning is set to:
    -	**Error** - **Line could not be fully allocated** error will be issued, and user will not be able to save the purchase order line.
    - **Warning** - **Line could not be fully allocated** warning will be issued, but user will be able to save the purchase order line. The user needs to link additional forex contract(s) the purchase order by using the **Link to forex contract** button.
-	If the delivery date or confirmed date is changed, D365 will check the expiry date of the Forex contract to verify whether they still match. A Warning will occur when the attached Forex expiry date is greater than document’s delivery/confirmed date.

## Changes on forex contracts
The following changes to forex contracts will warn if the contract has documents attached and confirm if the change should be applied to the contract. <br>
- **Amount** - If the forex contract’s amount is reduced and the updated amount results in over allocation, the **Allow over allocation** field on the contract will be validated to see if over allocation is allowed. If not allowed, the user will be issued with warning ‘Over allocation is not allowed’ and the user will be unable to save the change.
-	**Expiration date** – The link between the forex contract and purchase order will not automatically be removed. The user can unlink by using **Delete** button on **Allocated documents** on the purchase order.
