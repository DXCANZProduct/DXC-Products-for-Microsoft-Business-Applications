---
# required metadata

title: EDI Customer
description: EDI Customer setup - Order hold codes
author: jdutoit2
manager: Kym Parker
ms.date: 2021-10-01
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
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
The created Order hold codes are assigned on [EDI parameters](../../../CORE/Setup/EDI-parameters.md). <br>
Users can access the form by navigating to **EDI > Setup > EDI parameters**

**Field** 	                    | **Description**
:-------------------------------| :--------------------------
**Validation error hold code**  |	Specify the hold code to be used for validation errors
**POA pending hold code**	      | Specify the hold code to be used for orders that require a POA must be sent
**POC pending hold code**	      | Specify the hold code to be used for orders that require a PO confirmation (POC) must be received
