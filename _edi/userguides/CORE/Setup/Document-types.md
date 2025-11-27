---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
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

The following Document types are available per module and depends on licensing and enabled features:

- **Core**
  - [Functional acknowledgement inbound](../Documents/Functional-acknowledgement-inbound.md)
  - [Functional acknowledgement outbound](../Documents/Functional-acknowledgement-outbound.md)
- **Customer module**
  - [Customer purchase order](../../CUSTOMER/DOCUMENTS/Customer-purchase-order.md) (inbound)
  - [Customer purchase order change](../../CUSTOMER/DOCUMENTS/Customer-purchase-order-change.md) (inbound)
  - [Customer purchase order acknowledgement](../../CUSTOMER/DOCUMENTS/Customer-purchase-order-acknowledgement.md) (outbound)
  - [Customer advanced shipping notice](../../CUSTOMER/DOCUMENTS/Customer-advanced-shipping-notice.md) (outbound)
  - [Sales invoice](../../CUSTOMER/DOCUMENTS/Sales-invoice.md) (outbound)
- **Vendor module**
  - [Vendor purchase order](../../VENDOR/DOCUMENTS/Vendor-purchase-order.md) (outbound)
  - [Vendor purchase order change](../../VENDOR/DOCUMENTS/Vendor-purchase-order-change.md) (outbound)
  - [Vendor purchase order acknowledgement](../../VENDOR/DOCUMENTS/Vendor-purchase-order-acknowledgement.md) (inbound)
  - [Vendor advanced shipping noticed](../../VENDOR/DOCUMENTS/Vendor-advanced-shipping-notice.md) (inbound)
  - [Purchase inoice](../../VENDOR/DOCUMENTS/Purchase-invoice.md) (inbound)
- **3PL module**
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
  - [Product master](../../3PL/DOCUMENTS/Product-master.md) (outbound)
- **Freight forwarder landed cost module**
  - [Voyage advice](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-advice.md) (outbound)
  - [Voyage creator](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-creator.md) (inbound)
  - [Voyage tracking](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-tracking.md) (inbound)
