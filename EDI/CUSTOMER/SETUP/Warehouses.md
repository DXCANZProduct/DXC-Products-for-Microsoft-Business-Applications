---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setup - Warehouses]
author: [jdutoit2]
manager: Kym Parker
ms.date: 5/11/2021
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

