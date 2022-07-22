---
# required metadata

title: EDI Vendor
description: EDI Vendor setup - Order purpose group
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIVendOrderPurposeMapping  
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Vendor setup
## Setup order purpose groups

Users can access the form by navigating to **EDI > Setup > Vendor setup > Order purpose group**

EDI purchase orders can be sent to trading partners with many order purposes.  The type identifier sent can change the way the order is processed within the trading partner's system.
-	Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order purpose group
-	In the **Description** field, enter a description of the order purpose group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order purpose code**. Options are:
    -	**Original** - Indicates this the first/original order or agreement. Applies to document type **Vendor purchase order**. 
    -	**Change** - Specifies the order change indicator. Applies to document type **Vendor purchase order change**.
    -	**Cancellation** - Specifies the order cancellation indicator. Applies to document type **Vendor purchase order change**.
    -	**Confirmation** - When receiving a purchase order acknowledgement (POA) from a vendor used to identify a "confirmation" returned to the vendor. Applies to document type **Vendor purchase order change**.
-	Specify the vendor's value used to identify the **EDI order purpose**

Examples: <br>

**Order purpose** 	              | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Original**                      |	00	                                  | 9
**Change**                        |	04                                    | 4
**Cancellation**                  |	01	                                  | 1
**Confirmation**                  |	06	                                  | 6

## Where used
Order purpose group is assigned on the [Vendor Trading partner's](../Trading-partner.md) Options field called **Order purpose**. <br>
Used on field **OrderPurpose** on EDI documents:
- Vendor purchase order
- Vendor purchase order change

## Data entities:
-	Vendor EDI order purpose group
-	Vendor EDI order purpose lines
