---
# required metadata

title: [EDI 3PL]
description: [Introduction to EDI 3PL]
author: [jdutoit2]
manager: Kym Parker
ms.date: 17/11/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [EDI]
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

# Introduction to 3PL EDI
This section will provide a quick overview of the 3PL EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- **Inbound**
	- **Functional Acknowledgement** – Receive functional acknowledgement that outbound document has been received by Trading partner.
- **Outbound**
	- **Functional Acknowledgement** – Send functional acknowledgement that inbound document has been received.

### 3PL EDI documents (3PL license only)

EDI contains the following documents pertaining to 3PL Trading partners.
- **Outbound**
	- **Picking list**: Send picking list registration information for sales and transfer orders (Ship from warehouse)
	- **Shipment advice - Purchase order**: Advise 3PL of incoming purchase orders (Ship to warehouse)
	- **Shipment advice - Transfer order**: Advise 3PL of incoming transfer orders (Ship to warehouse)
	- **Shipment advice - Return order**: Advise 3PL of customer orders being returned (Ship to warehouse)
	- **Shipment advice - Voyage**: Advise 3PL of incoming Landed cost voyage (Ship to warehouse)
- **Inbound** 
	- **Picking list registration**: 3PL informs company what has been shipped for a picking list (Ship from warehouse)
	- **Shipment receipt - Purchase order**: 3PL acknowledge receipt of incoming purchase orders (Ship to warehouse)
	- **Shipment receipt - Transfer order**: 3PL acknowledge receipt of incoming transfer orders (Ship to warehouse)
	- **Shipment receipt - Return order**: 3PL acknowledge receipt of customer orders being returned (Ship to warehouse)
	- **Shipment receipt - Voyage**: 3PL acknowledge receipt of incoming Landed cost voyage (Ship to warehouse)
	- **Inventory adjustment - Transfer**: Transfers stock between batches or inventory statues with a transfer journal
	- **Inventory adjustment - Counting**: Compares 3PL stock count to D365 current on hand and posts variances with a movement journal
	- **Inventory adjustment - Reconciliation**: Compares 3PL stock count to D365 on hand at end of a particular date with option to manually accept/reject variances and posts variances with a movement journal
	- **Inventory adjustment - Movement**: Adjust stock with a movement journal

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction.md#setup)

### 3PL setup

#### Mappings assigned on 3PL Trading partner
3PL setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > 3PL setup** <br>
- [Inventory journal name mapping](../SETUP/3PL-SETUP/Inventory-journal-name-mapping.md)
	- Inventory adjustment - Counting (InventJournalNameIdExternal)
	- Inventory adjustment - Movement (InventJournalNameIdExternal)
- [Disposition code mapping](../SETUP/3PL-SETUP/Disposition-code-mapping.md)
	- Shipment receipt - Return order (DispositionCodeExternal)
- [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md)
	- Picking list (InventStatusId)
	- Picking list registration (InventStatusId)
	- Shipment advice - Purchase order (InventStatusId)
	- Shipment advice - Transfer order (InventStatusId)
	- Shipment advice - Return order (InventStatusId)
	- Shipment advice - Voyage (InventStatusId)
	- Shipment receipt - Purchase order (InventStatusId)
	- Shipment receipt - Transfer order (InventStatusId)
	- Shipment receipt - Return order (InventStatusId)
	- Shipment receipt - Voyage (InventStatusId)
	- Inventory adjustment - Transfer (InventStatusIdFrom and InventStatusIdTo)
	- Inventory adjustment - Counting (InventStatusId)
	- Inventory adjustment - Reconciliation (InventStatusId)
	- Inventory adjustment - Movement (InventStatusId)
- [Transaction direction mapping](../SETUP/3PL-SETUP/Transaction-direction-mapping.md)
	- Inventory adjustment - Movement (TransactionDirection)
- [Order purpose group](../SETUP/3PL-SETUP/Order-purpose-group.md)
	- Picking list (OrderPurpose)

#### Journal names assigned on 3PL Trading partner
Journal name with **Journal type** set to _Item arrival_. To be used to register stock for incoming stock receipts: **Inventory management > Setup > Journal names > Warehouse management**:
- Inventory management journal:
	-  Shipment receipt - Purchase order
	-  Shipment receipt - Transfer order
	-  Shipment receipt - Return order
	-  Shipment receipt - Voyage

#### 3PL Document type setup
Setup Document types which will be assigned on 3PL Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Picking list](../SETUP/SETTING-PROFILES/Picking-list.md)
    - [Picking list registration](../SETUP/SETTING-PROFILES/Picking-list-registration.md)
    - [Shipment advice - Purchase order](../SETUP/SETTING-PROFILES/Shipment-advice-Purchase-order.md)
    - [Shipment advice - Return order](../SETUP/SETTING-PROFILES/Shipment-advice-Return-order.md)
    - [Shipment receipt - Purchase order](../SETUP/SETTING-PROFILES/Shipment-receipt-Purchase-order.md)
    - [Shipment receipt - Transfer order](../SETUP/SETTING-PROFILES/Shipment-receipt-Transfer-order.md)
    - [Shipment receipt - Return order](../SETUP/SETTING-PROFILES/Shipment-receipt-Return-order.md)
    - [Shipment receipt - Voyage](../SETUP/SETTING-PROFILES/Shipment-receipt-Voyage.md)
    - [Inventory adjustment advice - Transfer](../SETUP/SETTING-PROFILES/Inventory-adjustment-advice-Transfer.md)
    - [Inventory adjustment advice - Counting](../SETUP/SETTING-PROFILES/Inventory-adjustment-advice-Counting.md)
    - [Inventory adjustment advice - Reconciliation](../SETUP/SETTING-PROFILES/Inventory-adjustment-advice-Reconciliation.md)
    - [Inventory adjustment advice - Movement](../SETUP/SETTING-PROFILES/Inventory-adjustment-advice-Movement.md)
- Validation profiles: applicable to the following inbound document types
    - [Picking list registration](../SETUP/VALIDATION-PROFILES/Picking-list-registration.md)
    - [Shipment receipt - Purchase order](../SETUP/VALIDATION-PROFILES/Shipment-receipt-Purchase-order.md)
    - [Shipment receipt - Transfer order](../SETUP/VALIDATION-PROFILES/Shipment-receipt-Transfer-order.md)
    - [Shipment receipt - Return order](../SETUP/VALIDATION-PROFILES/Shipment-receipt-Return-order.md)
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

### 3PL documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > 3PL documents**
- [Picking list](../DOCUMENTS/Picking-list.md)
- [Picking list registration](../DOCUMENTS/Picking-list-registration.md)
- [Shipment advice - Purchase order](../DOCUMENTS/Shipment-advice-Purchase-order.md)
- [Shipment advice - Transfer order](../DOCUMENTS/Shipment-advice-Transfer-order.md)
- [Shipment advice - Return order](../DOCUMENTS/Shipment-advice-Return-order.md)
- [Shipment advice - Voyage](../DOCUMENTS/Shipment-advice-Voyage.md)
- [Shipment receipt - Purchase order](../DOCUMENTS/Shipment-receipt-Purchase-order.md)
- [Shipment receipt - Transfer order](../DOCUMENTS/Shipment-receipt-Transfer-order.md)
- [Shipment receipt - Return order](../DOCUMENTS/Shipment-receipt-Return-order.md)
- [Shipment receipt - Voyage](../DOCUMENTS/Shipment-receipt-Voyage.md)
- [Inventory adjustment advice - Transfer](../DOCUMENTS/Inventory-adjustment-Transfer.md)
- [Inventory adjustment advice - Counting](../DOCUMENTS/Inventory-adjustment-Counting.md)
- [Inventory adjustment advice - Reconciliation](../DOCUMENTS/Inventory-adjustment-Reconciliation.md)
- [Inventory adjustment advice - Movement](../DOCUMENTS/Inventory-adjustment-Movement.md)

[Process overview](Process-overview.md) for 3PL EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/Workspaces/EDI-Document-maintenance-workspace.md) - Manage file import and staging record errors. These records have not been successfully processed to a target D365 document
- [EDI Inventory adjustment](../WORKSPACES/EDI-Inventory-adjustment.md) - Manage open inventory reconciliations and unposted inventory journal targets created by succesfully processing Inventory adjustment documents

## Other
- [Data entities](../OTHER/Data-entities.md)
- [Security configuration](../../CORE/OTHER/Security-configuration.md)
- [Frequently asked questions](../OTHER/FAQ.md) - Includes example errors and recommended fixes
