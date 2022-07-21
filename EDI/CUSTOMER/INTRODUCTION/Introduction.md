---
# required metadata

title: EDI Customer
description: Introduction to EDI Customer
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-29
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

# Introduction to Customer EDI
This section will provide a quick overview of the Customer EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- Inbound
	- Functional Acknowledgement – Receive functional acknowledgement that outbound document has been received by Trading partner.
- Outbound
	- Functional Acknowledgement – Send functional acknowledgement that inbound document has been received.

### Customer EDI documents (Customer license only)

EDI contains the following documents pertaining to Customer Trading partners.
- Inbound
	- Customer purchase order - Allows a customer to send a Purchase Order, which in turn creates a sales order, sales agreement or release order in D365.
	- Customer purchase order change - Allows a customer to send a change for an existing EDI purchase order, which in turn updates the applicable sales order in D365. Ability to update delivery address, store code, dates, delivery time, quantities, prices and/or adding additional lines
- Outbound
	- Customer purchase order acknowledgement (POA) - Allows D365 to send an Acknowledgement once a customer purchase order has been received and verified.
	- Customer advanced shipping notice (ASN) - Allows D365 to send delivery information to the customer with the packaging details.
	- Sales invoice - Allows D365 to send a tax invoice document to the customer.

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction.md#setup)

### Customer setup

#### Assigned on EDI parameters:
- Sales and marketing setup: **Sales and marketing > Setup > Sales orders > Order hold codes**<br>
	- [Hold codes](../SETUP/CUSTOMER-SETUP/Hold-codes.md)

#### Assigned on items:
- Required where the confirmed pack sizes within the Customer purchase order acknowledgement is set to use System pack and/or System inner. Setup at **Product information management > Products > Released products** and selecting FastTab Manage inventory.
	- [Item pack sizes](../../CORE/Setup/Item-pack-sizes.md)

#### Assigned on warehouses:
- Required where advanced shipping notice (ASN) will be sent to EDI customers and determines what information will be used when creating the ASN: 
	- [ASN line configurations](../SETUP/Warehouses.md#asn-line-configurations) 

#### Mappings assigned on Customer Trading partner
Used to map D365/EDI value to Customer's value and assigned on Customer Trading partner: <br>

- Customer setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > Customer setup** <br>
	- [Purchase order types](../SETUP/CUSTOMER-SETUP/Purchase-order-types.md)
		- Customer purchase order (OrderType)
	- [Order purpose group](../SETUP/CUSTOMER-SETUP/Order-purpose-group.md)
		- Customer purchase order (OrderPurpose)
		- Customer purchase order change (OrderPurpose)
	- [POA response code group](../SETUP/CUSTOMER-SETUP/POA-response-code-group.md)
		- Customer purchase order acknowledgement (POACustCode) 
		- Customer purchase order acknowledgement (POACustCodeItem)
		- Customer purchase order acknowledgement (POACustCodeShipment)
	- [Order line change type group](../SETUP/CUSTOMER-SETUP/Order-line-change-type-group.md)
		- Customer purchase order change (ChangeTypeValue)

- Core Setup: **EDI > Setup** <br>
	- [Unit of measure mapping](../../CORE/Setup/UOM-mapping.md)

#### Customer Document type setup
Setup Document types which will be assigned on Customer Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Customer purchase order](../SETUP/SETTING-PROFILES/Customer-purchase-order.md)
    - [Customer purchase order change](../SETUP/SETTING-PROFILES/Customer-purchase-order-change.md)
    - [Customer purchase order acknowledgement](../SETUP/SETTING-PROFILES/Customer-purchase-order-acknowledgement.md)
    - [Customer advanced shipping notice](../SETUP/SETTING-PROFILES/Customer-advanced-shipping-notice.md)
    - [Sales invoice](../SETUP/SETTING-PROFILES/Sales-invoice.md)
- Validation profiles: applicable to the following inbound document types
    - [Customer purchase order](../SETUP/VALIDATION-PROFILES/Customer-purchase-order.md)
    - [Customer purchase order change](../SETUP/VALIDATION-PROFILES/Customer-purchase-order-change.md)
- [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md): applicable to all outbound document types
- [Field metadata](../../CORE/Setup/DocumentTypes/Field-metadata.md): optionally update staging form's display name and help text per field

#### Trading partner setup
Create new trading partners and assign setup and incoming/outgoing documents. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading-partner.md)

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../../CORE/Managing-files/Inbound-files.md)

### Export files
Ability to manually export or review outbound files
- [Outbound files](../../CORE/Managing-files/Outbound-files.md)

### Customer documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Customer documents**
- [Customer purchase order](../DOCUMENTS/Customer-purchase-order.md)
- [Customer purchase order change](../DOCUMENTS/Customer-purchase-order-change.md)
- [Customer purchase order acknowledgement](../DOCUMENTS/Customer-purchase-order-acknowledgement.md)
- [Customer advanced shipping notice](../DOCUMENTS/Customer-advanced-shipping-notice.md)
- [Sales invoice](../DOCUMENTS/Sales-invoice.md)

### Review sales order
The following section describes the additional EDI functionality on Sales orders.
- [Review sales order](../DOCUMENTS/Review-sales-order.md)

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/Workspaces/EDI-Document-maintenance-workspace.md)
- [EDI Sales order processing](../WORKSPACES/EDI-Sales-order-processing.md)

## Other
- [Data entities](../OTHER/Data-entities.md)
- [Security configuration](../OTHER/Security-configuration.md)
- [Frequently asked questions](FAQ.md) - Includes example errors and recommended fixes
