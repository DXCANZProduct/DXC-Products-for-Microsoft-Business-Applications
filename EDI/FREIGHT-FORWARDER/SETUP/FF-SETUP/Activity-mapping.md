---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder setup - Activity mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFFShipActivityTableMapping, ITMActivityTable
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
