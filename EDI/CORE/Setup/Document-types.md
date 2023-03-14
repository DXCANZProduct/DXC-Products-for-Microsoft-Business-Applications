---
# required metadata

title: EDI Core
description: EDI Core - Setup document types
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-14
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIDocumentTypeTable
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

# Document types

The EDI module is made up of two underlying parts: <br>
1. The data engine which imports and exports the data, and <br>
2. The specific document types which provide the business functionality. <br>

Each document type is made up of different configurations which are brought together to ultimately import or export an EDI document provided by the Trading partner.
The Document types are arranged in a logical hierarchy based on their purpose as well as their direction.

> Note: As new documents are added to the implementation (either through customer development, upgrades or the licensing of new modules) pressing the **Refresh module** button on **EDI > Setup > EDI parameters** will rebuild the tree with the new documents.

Document type setup are split into:
1. [File templates](DocumentTypes/File-templates.md): applicable to all document types
2. [Setting profiles](DocumentTypes/Setting-profiles.md): where applicable for the document type
3. [Validation profiles](DocumentTypes/Validation-profiles.md): where applicable for the document type
4. [Outbound file names](DocumentTypes/Outbound-filenames.md): applicable to all outbound document types
5. [Staging metadata](DocumentTypes/Field-metadata.md): optionally update staging form's display name and help text per field

The following Document types are available and depends on licensing and enabled features:
- **Core**
  - [Functional acknowledgement inbound](../Documents/Functional-acknowledgement-inbound.md)
  - [Functional acknowledgement outbound](../Documents/Functional-acknowledgement-outbound.md)
- **Customer**
  - [Customer purchase order](../../CUSTOMER/DOCUMENTS/Customer-purchase-order.md) (inbound)
  - [Customer purchase order change](../../CUSTOMER/DOCUMENTS/Customer-purchase-order-change.md) (inbound)
  - [Customer purchase order acknowledgement](../../CUSTOMER/DOCUMENTS/Customer-purchase-order-acknowledgement.md) (outbound)
  - [Customer advanced shipping notice](../../CUSTOMER/DOCUMENTS/Customer-advanced-shipping-notice.md) (outbound)
  - [Sales invoice](../../CUSTOMER/DOCUMENTS/Sales-invoice.md) (outbound)
- **Vendor**
  - [Vendor purchase order](../../VENDOR/DOCUMENTS/Vendor-purchase-order.md) (outbound)
  - [Vendor purchase order change](../../VENDOR/DOCUMENTS/Vendor-purchase-order-change.md) (outbound)
  - [Vendor purchase order acknowledgement](../../VENDOR/DOCUMENTS/Vendor-purchase-order-acknowledgement.md) (inbound)
  - [Vendor advanced shipping noticed](../../VENDOR/DOCUMENTS/Vendor-advanced-shipping-notice.md) (inbound)
  - [Purchase inoice](../../VENDOR/DOCUMENTS/Purchase-invoice.md) (inbound)
- **3PL**
  - [Picking list](../../3PL/DOCUMENTS/Picking-list.md) (outbound)
  - [Picking list registration](../../3PL/DOCUMENTS/Picking-list-registration.md) (inbound)
  - [Shipment advice - Purchase order](../../3PL/DOCUMENTS/Shipment-advice-Purchase-order.md) (outbound)
  - [Shipment receipt - Purchase order](../../3PL/DOCUMENTS/Shipment-receipt-Purchase-order.md) (inbound)
  - [Shipment advice - Transfer order](../../3PL/DOCUMENTS/Shipment-advice-Transfer-order.md) (outbound)
  - [Shipment receipt - Transfer order](../../3PL/DOCUMENTS/Shipment-receipt-Transfer-order.md) (inbound)
  - [Shipment advice - Return order](../../3PL/DOCUMENTS/Shipment-advice-Return-order.md) (outbound)
  - [Shipment receipt - Return order](../../3PL/DOCUMENTS/Shipment-receipt-Return-order.md) (inbound)
  - [Shipment advice - Voyage](../../3PL/DOCUMENTS/Shipment-advice-Voyage.md) (outbound)
  - [Shipment receipt - Voyage](../../3PL/DOCUMENTS/Shipment-receipt-Voyage.md) (inbound)
  - [Inventory adjustment - Transfer](../../3PL/DOCUMENTS/Inventory-adjustment-Transfer.md) (inbound)
  - [Inventory adjustment - Counting](../../3PL/DOCUMENTS/Inventory-adjustment-Counting.md) (inbound)
  - [Inventory adjustment - Reconciliation](../../3PL/DOCUMENTS/Inventory-adjustment-Reconciliation.md) (inbound)
  - [Inventory adjustment - Movement](../../3PL/DOCUMENTS/Inventory-adjustment-Movement.md) (inbound)
- **Freight forwarder landed cost**
  - [Voyage creator](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-creator.md) (inbound)
  - [Voyage tracking](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-tracking.md) (inbound)
