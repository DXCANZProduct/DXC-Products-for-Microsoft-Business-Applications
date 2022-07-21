---
# required metadata

title: EDI 3PL
description: EDI 3PL Setup - Document type Setting profiles - Shipment advice - Return order
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIDocumentTypeTable, SAB_EDITradingPartner
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

# 3PL document type setting profiles - Shipment advice - Return order

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Shipment advice - Return order**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Positive return quantity**  |	Specify whether the negative return quantity should be sent as positive quantity	| • **No** - Return order line quantity is sent as negative quantity <br> • **Yes** – Return order line quantity is converted to positive quantity

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Shipment advice - Return order** for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings Shipment Advice - Return order
