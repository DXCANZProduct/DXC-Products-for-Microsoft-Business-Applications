---
# required metadata

title: EDI 3PL
description: EDI 3PL Setup - Document type Setting profiles - Picking list
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

# 3PL document type setting profiles - Picking list

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Picking list**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Prevent cancel picking route**  |	When the warehouse is a 3PL EDI trading partner and has the **Picking list** document enabled, should the option of cancelling a picking route be prevented. 	| •	**Yes** - When a user attempts to cancel a picking route for the EDI trading partner, they will receive a warning ‘Cancel picking route is prevented for the EDI warehouse based on Picking list document settings.’ They won’t be able to cancel the picking route. This is used where the EDI trading partner doesn’t have the capabilities to process cancels via EDI. <br> •	**No** - The EDI trading partner has the capability to process cancelled picking lists via EDI. The picking list will be sent with an **Order purpose** of _Cancellation_

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Picking list** for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - Picking list
