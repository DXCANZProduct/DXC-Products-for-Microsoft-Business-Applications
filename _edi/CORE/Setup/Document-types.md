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
1. [File templates](DocumentTypes/File-templates): applicable to all document types
2. [Setting profiles](DocumentTypes/Setting-profiles): where applicable for the document type
3. [Validation profiles](DocumentTypes/Validation-profiles): where applicable for the document type
4. [Outbound file names](DocumentTypes/Outbound-filenames): applicable to all outbound document types
5. [Staging metadata](DocumentTypes/Field-metadata): optionally update staging form's display name and help text per field

The following Document types are available per module and depends on licensing and enabled features:
- **Core**
  - [Functional acknowledgement inbound](../Documents/Functional-acknowledgement-inbound)
  - [Functional acknowledgement outbound](../Documents/Functional-acknowledgement-outbound)
- **Customer module**
  - [Customer purchase order](../../CUSTOMER/DOCUMENTS/Customer-purchase-order) (inbound)
  - [Customer purchase order change](../../CUSTOMER/DOCUMENTS/Customer-purchase-order-change) (inbound)
  - [Customer purchase order acknowledgement](../../CUSTOMER/DOCUMENTS/Customer-purchase-order-acknowledgement) (outbound)
  - [Customer advanced shipping notice](../../CUSTOMER/DOCUMENTS/Customer-advanced-shipping-notice) (outbound)
  - [Sales invoice](../../CUSTOMER/DOCUMENTS/Sales-invoice) (outbound)
- **Vendor module**
  - [Vendor purchase order](../../VENDOR/DOCUMENTS/Vendor-purchase-order) (outbound)
  - [Vendor purchase order change](../../VENDOR/DOCUMENTS/Vendor-purchase-order-change) (outbound)
  - [Vendor purchase order acknowledgement](../../VENDOR/DOCUMENTS/Vendor-purchase-order-acknowledgement) (inbound)
  - [Vendor advanced shipping noticed](../../VENDOR/DOCUMENTS/Vendor-advanced-shipping-notice) (inbound)
  - [Purchase inoice](../../VENDOR/DOCUMENTS/Purchase-invoice) (inbound)
- **3PL module**
  - [Picking list](../../3PL/DOCUMENTS/Picking-list) (outbound)
  - [Picking list registration](../../3PL/DOCUMENTS/Picking-list-registration) (inbound)
  - [Shipment advice - Purchase order](../../3PL/DOCUMENTS/Shipment-advice-Purchase-order) (outbound)
  - [Shipment receipt - Purchase order](../../3PL/DOCUMENTS/Shipment-receipt-Purchase-order) (inbound)
  - [Shipment advice - Transfer order](../../3PL/DOCUMENTS/Shipment-advice-Transfer-order) (outbound)
  - [Shipment receipt - Transfer order](../../3PL/DOCUMENTS/Shipment-receipt-Transfer-order) (inbound)
  - [Shipment advice - Return order](../../3PL/DOCUMENTS/Shipment-advice-Return-order) (outbound)
  - [Shipment receipt - Return order](../../3PL/DOCUMENTS/Shipment-receipt-Return-order) (inbound)
  - [Shipment advice - Voyage](../../3PL/DOCUMENTS/Shipment-advice-Voyage) (outbound)
  - [Shipment receipt - Voyage](../../3PL/DOCUMENTS/Shipment-receipt-Voyage) (inbound)
  - [Inventory adjustment - Transfer](../../3PL/DOCUMENTS/Inventory-adjustment-Transfer) (inbound)
  - [Inventory adjustment - Counting](../../3PL/DOCUMENTS/Inventory-adjustment-Counting) (inbound)
  - [Inventory adjustment - Reconciliation](../../3PL/DOCUMENTS/Inventory-adjustment-Reconciliation) (inbound)
  - [Inventory adjustment - Movement](../../3PL/DOCUMENTS/Inventory-adjustment-Movement) (inbound)
  - [Product master](../../3PL/DOCUMENTS/Product-master) (outbound)
- **Freight forwarder landed cost module**
  - [Voyage advice](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-advice) (outbound)
  - [Voyage creator](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-creator) (inbound)
  - [Voyage tracking](../../FREIGHT-FORWARDER/DOCUMENTS/Voyage-tracking) (inbound)
