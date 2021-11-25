---
# required metadata

title: [EDI Freight forwarder]
description: [EDI Freight forwarder setup - Shipping port qualifier mapping]
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
## Setup Shipping port qualifier mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping port qualifier mapping**

Used to map the Freight forwarder’s shipping port qualifier value to indicate if the port referred to in the message is the **From port** or **To port**.
If the voyage tracking leg, whose tracking is being updated, includes a From and To port (Example: Air or Sea legs), the **Shipping port mapping** and **Shipping port qualifier** will be used to find the applicable leg to update. This is especially useful for journeys with multiple sea and/or air legs.

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Shipping port qualifier mapping group
-	In the **Description** field, enter a description of the Shipping port qualifier mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Shipping port qualifier** from the available list. Options include: 
    - From port
    - To port	
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Shipping port qualifier mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading%20partner.md) Options field called **Port qualifier**.

Used on the following EDI documents (field):
- Voyage tracking (PortQualifier)

## Examples
EDI port qualifier	| Trading partner values
:--                 |:--
**From port**       | L (Port of Loading)
**From port**	    | R (Place of Receipt)
**To port**	        | D (Port of Discharge)
**To port**	        | E (Place of Delivery)

## Data entities:
- Shipping port qualifier mapping
- Shipping port qualifier mapping lines
