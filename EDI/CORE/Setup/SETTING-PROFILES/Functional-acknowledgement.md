---
# required metadata

title: EDI Core
description: EDI Core Setup - Document type Setting profiles - Functional acknowledgement
author: jdutoit2
manager: Kym Parker
ms.date: /2021-03-21
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

# Core document type setting profiles - Functional acknowledgement

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Functional acknowledgement inbound** and/or **Functional acknowledgement outbound**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Document type mapping** |	Assign applicable [document type mapping](../Document-type-mapping.md) | Options as per **EDI > Setup > Document type mapping**

## Where used
The **Setting profile** can be assigned on the:
- Incoming documents FastTab to document type **Functional acknowledgement inbound** and 
- Outgoing documents FastTab to document type **Functional acknowledgement outbound**  

for all Trading partners at **EDI > Setup > Trading partners**.

## Data entity

