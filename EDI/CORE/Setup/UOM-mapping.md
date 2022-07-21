---
# required metadata

title: EDI Core
description: EDI Core - UOM mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2022-03-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIUOMMapping
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

# Unit of measure mapping

Ability to map a trading partner’s unit of measure (example kgs) to D365 unit of measure (example kg). <br>
Users can access the form by navigating to **EDI > Setup > UOM mapping**

- Click **New** to create a new record. 
-	In the **Name** field, enter the name of the unit of measure mapping
-	In the **Description** field, enter a description of the unit of measure mapping
-	In the **Company accounts ID** field, select a company if the mapping applies only to a specific company. Also a requirement if **Item code** _Group_ or _Table_ is used. Blank Company is allowed where all the mapping lines’ **Item code** is set to _All_.
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the D365 **Unit**. Options are obtained from Units setup at Organization administration > Setup > Units, examples:
    - box
    - pcs
- Specify the **indicator**/trading partner's value used to identify the Trading partner's **Value**
- Select **Item code** - All, Group or Table
- Where applicable, select the **Item relation**
- **Inventory dimensions** are also available to limit the unit of mapping to a specific inventory dimension combination

## Customer EDI module
For **Customer** Trading partners, the Unit of measure mapping is utilized on **Sales unit**:
- Inbound – receive and ability to use Customer’s unit of measure
    - Customer purchase order and 
    - Customer purchase order change
-	Outbound - sent with Customer’s unit of measure
    - Customer purchase order acknowledgement
    - Customer advanced shipping notice
    - Sales invoice

## Vendor EDI module
For **Vendor** Trading partners, the Unit of measure mapping is utilized on **Purchase unit**:
-	Outbound - sent with Vendor’s unit of measure
    - Vendor purchase order and 
    - Vendor purchase order change
- Inbound – receive and ability to use Vendor’s unit of measure
    - Vendor purchase order acknowledgement
    - Vendor advanced shipping notice
    - Sales invoice

## Freight forwarder landed cost EDI module
For **Freight forwarder** Trading partners, the Unit of measure mapping is utilized on **Purchase unit** and **Inventory unit**
- Inbound – receive and ability to use Freight forwarder’s unit of measure
    - Voyage creator

## Where used
UOM mapping is assigned on the Customer, Vendor and Freight forwarder Trading partner's Options field called **UOM**.

## Data entities:
-	UOM mapping
-	UOM mapping lines

