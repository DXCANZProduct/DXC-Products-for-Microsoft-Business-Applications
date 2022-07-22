---
# required metadata

title: EDI Vendor
description: EDI Vendor Setup - Document type Setting profiles
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
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

# Vendor setup
## Document types - Setting profiles

Users can access the form by navigating to **EDI > Setup > Document types**.
Setting profiles can be created to specify the handling of specific scenarios. Once setup for each document type, the setting profile can be assigned to each document on the Trading partner setup in **EDI > Setup > Trading partners**

> Note:  The settings profiles FastTab is only displayed from Document types that have valid setting profile options

- To create a new record, select the applicable document type and select the **New** button in the settings profiles FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details. 

The following vendor documents have setting profiles:
- [Vendor purchase order](SETTING-PROFILES/Vendor-purchase-order.md)
- [Vendor purchase order change](SETTING-PROFILES/Vendor-purchase-order-change.md)
- [Vendor purchase order acknowledgement](SETTING-PROFILES/Vendor-purchase-order-acknowledgement.md)
- [Vendor advanced shipping notice](SETTING-PROFILES/Vendor-advanced-shipping-notice.md)
- [Purchase invoice](SETTING-PROFILES/Purchase-invoice.md)

## Document errors
When an incoming staging record/document errors, it has not created/updated the target D365 transaction. <br>
When an outgoing staging record/document errors, it has not created the Outbound file. <br>

Staging/document errors can be viewed at: <br>
- **EDI > Documents** - On each document type, user can set filter **Staging to target status** to _Error_
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace.md) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.
