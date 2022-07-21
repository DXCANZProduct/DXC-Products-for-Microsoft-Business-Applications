---
# required metadata

title: EDI Customer
description: EDI Customer setup - Order purpose group
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-30
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDICustOrderPurposeMapping
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
## Setup order purpose groups

Users can access the form by navigating to **EDI > Setup > Customer setup > Order purpose group**

EDI purchase orders can be received from trading partners with many order purposes.  The type identifier received can change the way the order is processed within D365.
-	Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order purpose group
-	In the **Description** field, enter a description of the order purpose group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order purpose code**. Options are:
    -	**Original** - Indicates this the first/original order or agreement. Applies to document type **Customer purchase order**. 
    -	**Change** - Specifies the sales order change indicator. Applies to document type **Customer purchase order change**.
    -	**Cancellation** - Specifies the sales order cancellation indicator. Applies to document type **Customer purchase order** and **Customer purchase order change**.
    -	**Confirmation** - When receiving a Purchase Order Confirmation (POC) from a customer used to identify a "confirmation". Applies to document type **Customer purchase order**.
-	Specify the **indicator**/customer's value used to identify the **EDI order purpose**

Examples: <br>

**Order purpose** 	              | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Original**                      |	00	                                  | 9
**Change**                        |	04                                    | 4
**Cancellation**                  |	01	                                  | 1
**Confirmation**                  |	06	                                  | 6

## Where used
Order purpose group is assigned on the [Customer Trading partner's](../Trading-partner.md) Options field called **Order purpose**.

## Data entities:
-	Customer EDI order purpose group
-	Customer EDI order purpose lines
