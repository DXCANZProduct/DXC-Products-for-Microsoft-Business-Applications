---
# required metadata

title: EDI 3PL
description: EDI 3PL Setup - Document type Setting profiles - Inventory adjustment advice - Movement
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable, SAB_EDITradingPartner
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

# 3PL document type setting profiles - Inventory adjustment advice - Movement

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Inventory adjustment advice - Movement**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Auto post journal** |	When the movement journal is created, the journal should also be automatically posted	| • **No** – Movement journal created, but not posted <br> • **Yes** – Movement journal posted
**Posting date**    |	Select posting date for the movement journal	| • **EDI transaction date** - Use document's TransDate as posting date <br> • **Today** - Use Today's date as posting date
**Create batch**	  | If the 3PL’s batch doesn’t exist in D365, allow the batch to be created. Batch details from message will be used to create the D365 batch	| • **No** – Staging record will error if batch doesn't exist in D365 <br> • **Yes** - D365 batch created and used in Movement journal

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Inventory adjustment advice - Movement** for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI settings inventory adjustment - Movement
