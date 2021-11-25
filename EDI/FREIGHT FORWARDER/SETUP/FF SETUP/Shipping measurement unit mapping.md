---
# required metadata

title: [EDI Freight forwarder]
description: [EDI Freight forwarder setup - Shipping measurement unit mapping]
author: [jdutoit2]
manager: Kym Parker
ms.date: 25/11/2021
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

# Freight forwarder setup
## Setup Shipping measurement unit mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping measurement unit mapping**

Code mapping the Freight forwarders's value to a D365 Landed cost measurement unit. <br>
Used where the Freight forwarder’s shipping measurement units value differs to Landed cost’s shipping measurement units. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Shipping measurement unit mapping group
-	In the **Description** field, enter a description of the Shipping measurement unit mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the applicable Landed cost **Measurement unit** from the available list
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Shipping port mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading%20partner.md) Options field called **Port**.

Used on the following EDI documents (field):
- Voyage creator (ShipMeasurementUnitExternal) 
- Voyage creator (ShipLineMeasurementUnitExternal)

When the Voyage is created, the measurement and measurement unit are optional header and line fields.

## Examples
D365 Landed cost Measurement unit	  | Trading partner values
:--                                 |:--
**kgs**                             |	KG
**CBM**                             |	CR

## Data entities:
- Shipping measurement unit mapping
- Shipping measurement unit mapping lines
