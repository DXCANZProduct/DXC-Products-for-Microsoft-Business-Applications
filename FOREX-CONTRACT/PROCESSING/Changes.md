---
# required metadata

title: [Forex contract]
description: [Changes]
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
