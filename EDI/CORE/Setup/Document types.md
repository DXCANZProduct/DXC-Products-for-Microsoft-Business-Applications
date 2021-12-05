---
# required metadata

title: [EDI Core]
description: [EDI Core - Setup document types]
author: [jdutoit2]
manager: Kym Parker
ms.date: 12/01/2020
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Document types

The EDI module is made up of two underlying parts: <br>
1. The data engine which imports and exports the data, and <br>
2. The specific document types which provide the business functionality. <br>

Each document type is made up of different configurations which are brought together to ultimately import or export an EDI document provided by the Trading partner.
The Document types are arranged in a logical hierarchy based on their purpose as well as their direction.

> Note: As new documents are added to the implementation (either through customer development, upgrades or the licensing of new modules) pressing the **Refresh module** button on **EDI > Setup > EDI parameters** will rebuild the tree with the new documents.

Document type setup are split into:
1. [File templates](DocumentTypes/File%20templates.md): applicable to all document types
2. [Setting profiles](DocumentTypes/Setting%20profiles.md): where applicable for the document type
3. [Validation profiles](DocumentTypes/Validation%20profiles.md): where applicable for the document type
4. [Outbound file names](DocumentTypes/Outbound%20filenames.md): applicable to all outbound document types
5. [Field metadata](DocumentTypes/Field%20metadata.md): optionally update staging form's display name and help text per field

The following Document types are available and depends on licensing and enabled features:
- **Core**
  - [Functional acknowledgement inbound](../DOCUMENTS/Functional%20acknowledgement%20inbound.md)
  - [Functional acknowledgement outbound](../DOCUMENTS/Functional%20acknowledgement%20outbound.md)
- **Customer**
  - [Customer purchase order](../../CUSTOMER/DOCUMENTS/Customer%20purchase%20order.md) (inbound)
  - [Customer purchase order change](../../CUSTOMER/DOCUMENTS/Customer%20purchase%20order%20change.md) (inbound)
  - [Customer purchase order acknowledgement](../../CUSTOMER/DOCUMENTS/Customer%20purchase%20order%20acknowledgement.md) (outbound)
  - [Customer advanced shipping notice](../../CUSTOMER/DOCUMENTS/Customer%20advanced%20shipping%20notice.md) (outbound)
  - [Sales invoice](../../CUSTOMER/DOCUMENTS/Sales%20invoice.md) (outbound)
- **Vendor**
  - [Vendor purchase order](../../VENDOR/DOCUMENTS/Vendor%20purchase%20order.md) (outbound)
  - [Vendor purchase order change](../../VENDOR/DOCUMENTS/Vendor%20purchase%20order%20change.md) (outbound)
  - [Vendor purchase order acknowledgement](../../VENDOR/DOCUMENTS/Vendor%20purchase%20order%20acknowledgement.md) (inbound)
  - [Vendor advanced shipping noticed](../../VENDOR/DOCUMENTS/Vendor%20advanced%20shipping%20notice.md) (inbound)
  - [Purchase inoice](../../VENDOR/DOCUMENTS/Purchase%20invoice.md) (inbound)
- **3PL**
  - [Picking list](../../3PL/DOCUMENTS/Picking%20list.md) (outbound)
  - [Picking list registration](../../3PL/DOCUMENTS/Picking%20list%20registration.md) (inbound)
  - [Shipment advice - Purchase order](../../3PL/DOCUMENTS/Shipment%20advice%20-%20Purchase%20order.md) (outbound)
  - [Shipment receipt - Purchase order](../../3PL/DOCUMENTS/Shipment%20receipt%20-%20Purchase%20order.md) (inbound)
  - [Shipment advice - Transfer order](../../3PL/DOCUMENTS/Shipment%20advice%20-%20Transfer%20order.md) (outbound)
  - [Shipment receipt - Transfer order](../../3PL/DOCUMENTS/Shipment%20receipt%20-%20Transfer%20order.md) (inbound)
  - [Shipment advice - Return order](../../3PL/DOCUMENTS/Shipment%20advice%20-%20Return%20order.md) (outbound)
  - [Shipment receipt - Return order](../../3PL/DOCUMENTS/Shipment%20receipt%20-%20Return%20order.md) (inbound)
  - [Shipment advice - Voyage](../../3PL/DOCUMENTS/Shipment%20advice%20-%20Voyage.md) (outbound)
  - [Shipment receipt - Voyage](../../3PL/DOCUMENTS/Shipment%20receipt%20-%20Voyage.md) (inbound)
  - [Inventory adjustment - Transfer](../../3PL/DOCUMENTS/Inventory%20adjustment%20-%20Transfer.md) (inbound)
  - [Inventory adjustment - Counting](../../3PL/DOCUMENTS/Inventory%20adjustment%20-%20Counting.md) (inbound)
  - [Inventory adjustment - Reconciliation](../../3PL/DOCUMENTS/Inventory%20adjustment%20-%20Reconciliation.md) (inbound)
  - [Inventory adjustment - Movement](../../3PL/DOCUMENTS/Inventory%20adjustment%20-%20Movement.md) (inbound)
- **Freight forwarder landed cost**
  - [Voyage creator](../../FREIGHT%20FORWARDER/DOCUMENTS/Voyage%20creator.md) (inbound)
  - [Voyage tracking](../../FREIGHT%20FORWARDER/DOCUMENTS/Voyage%20tracking.md) (inbound)
