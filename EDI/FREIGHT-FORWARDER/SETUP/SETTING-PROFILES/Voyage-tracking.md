---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder Setup - Document type Setting profiles - Voyage tracking
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDITradingPartner, SAB_EDIDocumentTypeTable
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

# Freight forwarder document type setting profiles - Voyage tracking

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Voyage tracking**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Voyage Id source**  |	Determine the method of voyage identification used	| •	**Internal Id** – Landed cost Voyage <br> •	**External Id** – Freight forwarder’s booking reference = Landed cost Booking reference
<ins>**Date qualifiers**</ins>  |
**Actual**          | Date in file is an actual date	          | X12 example = 140
**Estimated**       | Date in file is an estimated date	          | X12 example = 139
    
## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Voyage tracking** for the Freight forwarder landed cost Trading partner at **EDI > Setup > Trading partners**.

**Actual** and **Estimated** date qaulifier mappings are used on the following EDI documents (field):
- Voyage tracking (DateQualifierValue)

### Date qualifiers and Activity example
When a Voyage tracking document is imported, the following fields determine with date field is updated on the Voyage's tracking leg:
- **Date qualifier** - Actual or Estimated
- [Activity mappings](../FF-SETUP/Activity-mapping.md)'s **Date selection** - Start date or End date

Date qualifier      | Activity mapping's Date selection   | Tracking leg field updated 
:-------            |:----------                          |:----    
Actual              | Start date                          | Start date    
Actual              | End date                            | Actual end date 
Estimated           | Start date                          | N/A                    
Estimated           | End date                            | Estimated end date 

## Data entity
- EDI setting voyage tracking
