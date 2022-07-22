---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder Setup - Document type Setting profiles
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDITradingPartner,SAB_EDIDocumentTypeTable
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
## Document types - Setting profiles

Users can access the form by navigating to **EDI > Setup > Document types**.
Setting profiles can be created to specify the handling of specific scenarios. Once setup for each document type, the setting profile can be assigned to each document on the Trading partner setup in **EDI > Setup > Trading partners**

> Note:  The settings profiles FastTab is only displayed from Document types that have valid setting profile options

- To create a new record, select the applicable document type and select the **New** button in the settings profiles FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details. 

The following Freight forwarder documents have setting profiles:
- [Voyage creator](SETTING-PROFILES/Voyage-creator.md)
- [Voyage tracking](SETTING-PROFILES/Voyage-tracking.md)
