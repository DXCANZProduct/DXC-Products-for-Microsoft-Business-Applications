---
# required metadata

title: EDI Core
description: EDI Core - Setup document types - Setting profiles
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-14
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: 
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Document types - Setting profiles

Users can access the form by navigating to **EDI > Setup > Document types**.
Setting profiles can be created to specify the handling of specific scenarios. Once setup for each document type, the setting profile can be assigned to each document on the Trading partner setup in **EDI > Setup > Trading partners**

> Note:  The settings profiles FastTab is only displayed from Document types that have valid setting profile options

Create new setting profile:
- To create a new record, select the applicable document type and select the **New** button in the settings profiles FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details. 

Copy existing setting profile:
- To create a new record by copying an existing record, select the applicable document type, select the existing record to copy and select the **Copy** button in the settings profiles FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select **Copy**.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details. 

Each document's Setting profile will be discussed in more detail with each document's details.

Document setting profiles available per module:
- [3PL](../../../3PL/SETUP/Setting-profiles.md)
- [Customer](../../../CUSTOMER/SETUP/Setting-profiles.md)
- [Vendor](../../../VENDOR/SETUP/Setting-profiles.md)
- [Freight forwarder for Landed cost](../../../FREIGHT-FORWARDER/SETUP/Setting-profiles.md)
