---
# required metadata

title: [EDI Freight forwarder]
description: [EDI Freight forwarder setup - Activity mapping]
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
## Setup Activity mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Activity mapping**

Code mapping the Freight forwarders's value to a D365 Landed cost Activity and if the mapped activity should update the Start or End date. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Activity mapping group
-	In the **Description** field, enter a description of the Activity mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Activity** from the available list. Options are obtained from **Activity** setup at **Landed cost > Mulit-leg journeys setup > Activities**
-	In the **Date** selection, select the applicable option:
    - Start date
    - End date
-	Specify the Freight forwarder's **Value**. Blank is not allowed.

## Where used
Activity mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner.md) Options field called **Activity**.

Used on the following EDI documents (field):
- Voyage tracking (Activity)

When the voyage's tracking leg(s) are updated, used to find the applicable Voyage inbound tracking’s leg and determines whether the start or end date is updated. 

## Examples
X12 example values are used in below table for **Trading partner values**.

Activity	| Date selection	    | Description	                          | Trading partner values
:--       |:--                  |:--                                    |:--
**Load**  | **Start date**	    |	Loading	                              | L
**Load**  | **End date**	      |	Loaded on Board at First Port of Load | AE
**Sail**	| **Start date**      | Vessel Departure                      |	VD
**Sail**  | **End date**	      |	Discharged from Vessel at Last Port of Discharge | UV
**Sail**  | **End date**        |	Vessel Arrival		                    | VA
**Customs** | **End date**      |	Customs Released		                  | CT
**Local** |	**Start date**      | Loaded on Truck		                    | AM
**Local** | **End date**	      | Actual Door Delivery		              | D

## Data entities:
- Activity mapping
- Activity mapping lines
