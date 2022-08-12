---
# required metadata

title: EDI Customer
description: EDI Customer Setup - Warehouses
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-05
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIASNLineConfigurationTable, InventLocations 
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

## ASN line configurations
Required where advanced shipping notice (ASN) will be sent to EDI customers and determines what information will be used when creating the ASN.
There are currently three **ASN line configurations** available and can be viewed at **EDI > Setup > Configurations > ASN line configurations**.

Config option       |	Description	            | Warehouse management	    | Containerization	    | Note
:--                 |:--                      |:--                        |:--                    |:--
**Picking list**    |	The ASN will be generated based on information in the pick list registration and consignments table	| Not enabled	 | N/A	| The SSCC should be populated for each line of the picking list registration
**WHSContainerization** |	The ASN will be generated based on the information in the WHS container and consignments table | WHS enabled <br> Not 3PL	| Used	| The container number will be used as the SSCC Id and therefore should be configured based on SSCC number requirements
**WHSDeliveredLP**      |	The ASN will be generated based on the information in the WHS license plate and consignments table.	| WHS enabled <br> Not 3PL	| Not used	| The target license plate number will be used as the SSCC Id and therefore should be configured based on SSCC number requirements


> Note: Additional options can be created as a customer specific requirement and added to this list for selection on the warehouse form.

To assign the **ASN line configuration** to a warehouse, the user can navigate to **Inventory management > Setup > Inventory breakdown > Warehouses**
-	Select the applicable warehouse to be used for ASN generation (Ship from warehouse)
-	Select the ASN line configuration in the **ASN line configuration** field in the EDI FastTab


Data entity: Warehouses, staging field SAB_EDICUSTASNLINECONFIGURATIONNAME

