---
# required metadata

title: EDI Customer
description: EDI Customer Setting profiles - Sales invoice
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-23
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
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

# Customer document type setting profiles - Sales invoice

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Sales invoice**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Invoice type**</ins>   |   |
**Invoice**         | Specify mapping for Invoice               | • EDIFACT example: 388 = Tax invoice or 380 = Commercial invoice <br> • X12 example: VJ = Commercial invoice
**Credit adjustment note**  | Specify mapping for Credit note   | • EDIFACT example: 381 = Credit note <br> • X12 example: CR = Credit memo
**Don't send credit note**  | Specify if credit notes should be sent to the customer  | •	**No** - When posting a credit note, the **Send to EDI** will be set to _No_ and won't create a Sales invoice staging record. <br> •	**Yes** - When posting a credit note, the **Send to EDI** will be set to _Yes_ and will create a Sales invoice staging record.

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Sales invoice** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - Sales invoice

