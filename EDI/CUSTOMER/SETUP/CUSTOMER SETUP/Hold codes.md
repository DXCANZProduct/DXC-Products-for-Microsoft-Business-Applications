---
# required metadata

title: [EDI Customer]
description: [EDI Customer setup - Order hold codes]
author: [jdutoit2]
manager: Kym Parker
ms.date: 1/10/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
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

# Customer setup
## Order hold codes

During the sales process for EDI orders, there are times when a sales order must be placed on hold. When a sales order is placed on hold, an order hold code is assigned to the sales order to indicate the reason for the hold. <br>
Hold scenario examples:
-	**Validation error hold code**: Customer sales price is used when creating a sales order, but the customers price vs. system price difference is outside of the allowed positive/negative variance  as setup on the Trading partner's assigned document type's setting profile. And Sales price validation is setup as Error tolerance on the Trading partner's assigned document type's validation profile.
-	**POA pending hold code**: Customer purchase order acknowledgement (POA) document setting's **Lock order** is set to _Yes_, which means the sales order is put on hold till the purchase order acknowledgement has been sent to the Customer.
-	**POC pending hold code**: Customer purchase order acknowledgement (POA) document setting **PO confirmation required** is set to _Yes_, which means the sales order is put on hold till the Confirmation has been received from the Customer.

## Setup order hold codes
Users can access the form by navigating to **Sales and marketing > Setup > Sales orders > Order hold codes**. <br>

-	To create a new record, select **New**.
-	In the **Hold code** field, enter the name of the code.
-	In the **Description** field, enter a description or explanation of the code.
-	In the **Role** field, select the security role that can use the hold code.
-	If this hold code should be automatically placed on all new sales order holds, select the Default for sales order check box. <br>
< Note: This option should **not** be selected for EDI hold codes
-	If the inventory reservations on a sales order should be removed when the hold code is applied, select the Remove inventory reservations check box. <br>
< Note: This option should **not** be selected for EDI hold codes

## Where used
The created Order hold codes are assigned on EDI parameters. <br>
Users can access the form by navigating to **EDI > Setup > EDI parameters**

**Field** 	                    | **Description**
:-------------------------------| :--------------------------
**Validation error hold code**  |	Specify the hold code to be used for validation errors
**POA pending hold code**	      | Specify the hold code to be used for orders that require a POA must be sent
**POC pending hold code**	      | Specify the hold code to be used for orders that require a PO confirmation (POC) must be received
