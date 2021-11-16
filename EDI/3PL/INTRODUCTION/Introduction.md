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
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [jdutoit2]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Introduction
This section will provide a quick overview of the 3PL EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- Inbound
	- Functional Acknowledgement – Receive functional acknowledgement that outbound document has been received by Trading partner.
- Outbound
	- Functional Acknowledgement – Send functional acknowledgement that inbound document has been received.

### 3PL EDI documents (3PL license only)

EDI contains the following documents pertaining to 3PL Trading partners.
- Outbound
	- Picking list - Send picking list registration information for sales and transfer orders (Ship from warehouse)
	- Shipment advice - Purchase order - Advise 3PL of incoming purchase orders (Ship to warehouse)
	- Shipment advice - Transfer order - Advise 3PL of incoming transfer orders (Ship to warehouse)
	- Shipment advice - Return order - Advise 3PL of customer orders being returned (Ship to warehouse)
	- Shipment advice - Voyage - Advise 3PL of incoming Landed cost voyage (Ship to warehouse)
- Inbound 
	- Picking list registration - 3PL informs company what has been shipped for a picking list (Ship from warehouse)
	- Shipment receipt - Purchase order - 3PL acknowledge receipt of incoming purchase orders (Ship to warehouse)
	- Shipment receipt - Transfer order - 3PL acknowledge receipt of incoming transfer orders (Ship to warehouse)
	- Shipment receipt - Return order - 3PL acknowledge receipt of customer orders being returned (Ship to warehouse)
	- Shipment receipt - Voyage - 3PL acknowledge receipt of incoming Landed cost voyage (Ship to warehouse)

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Setup/Setup%20overview.md)

### 3PL setup

#### Mappings assigned on 3PL Trading partner
Used to map D365/EDI value to 3PL's value and assigned on 3PL Trading partner: <br>

- 3PL setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > 3PL setup** <br>
	- [Inventory journal name mapping](../)
		- Inventory adjustment - Counting (InventJournalNameIdExternal)
		- Inventory adjustment - Movement (InventJournalNameIdExternal)
	- [Disposition code mapping](../)
		- Shipment receipt - Return order (DispositionCodeExternal)
	- [Inventory status Id mapping](../)
		- Picking list registration (InventStatusId)
		- Shipment receipt - Purchase order (InventStatusId)
		- Shipment receipt - Transfer order (InventStatusId)
		- Shipment receipt - Return order (InventStatusId)
		- Shipment receipt - Voyage (InventStatusId)
		- Inventory adjustment - Transfer (InventStatusIdFrom and InventStatusIdTo)
		- Inventory adjustment - Counting (InventStatusId)
		- Inventory adjustment - Reconciliation (InventStatusId)
		- Inventory adjustment - Movement (InventStatusId)
	- [Transaction direction mapping](../)
		- Inventory adjustment - Movement (TransactionDirection)
	- [Order purpose code](../)
		- Picking list registration (OrderPurpose)

#### Journal names assigned on 3PL Trading partner

	- Item arrival journal name to be used to register stock for incoming stock

#### 3PL Document type setup
Setup Document types which will be assigned on 3PL Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File%20templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Picking list]()
    - [Picking list registration]()
    - [Shipment advice - Purchase order]()
    - [Shipment advice - Return order]()
    - [Shipment receipt - Purchase order]()
    - [Shipment receipt - Transfer order]()
    - [Shipment receipt - Return order]()
    - [Shipment receipt - Voyage]()
    - [Inventory adjustment advice - Transfer]()
    - [Inventory adjustment advice - Counting]()
    - [Inventory adjustment advice - Reconciliation]()
    - [Inventory adjustment advice - Movement]()
- Validation profiles: applicable to the following inbound document types
    - [Picking list registration]()
    - [Shipment receipt]()
- [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound%20filenames.md): applicable to all outbound document types
- [Field metadata](../../CORE/Setup/DocumentTypes/Field%20metadata.md): optionally update staging form's display name and help text per field

#### Trading partner setup
Create new trading partners and assign setup and incoming/outgoing documents. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading%20partner.md)

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../../CORE/Managing%20files/Inbound%20files.md)

### Export files
Ability to manually export or review outbound files
- [Outbound files](../../CORE/Managing%20files/Outbound%20files.md)

### 3PL documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > 3PL documents**
- [Picking list]()
- [Picking list registration]()
- [Shipment advice - Purchase order]()
- [Shipment advice - Transfer order]()
- [Shipment advice - Return order]()
- [Shipment advice - Voyage]()
- [Shipment receipt - Purchase order]()
- [Shipment receipt - Transfer order]()
- [Shipment receipt - Return order]()
- [Shipment receipt - Voyage]()
- [Inventory adjustment advice - Transfer]()
- [Inventory adjustment advice - Counting]()
- [Inventory adjustment advice - Reconciliation]()
- [Inventory adjustment advice - Movement]()

[Process overview](Process%20overview.md) for 3PL EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md)
- [EDI Inventory adjustment](../WORKSPACES/EDI%20Inventory%20adjustment.md)

## Other
- [Data entities](../OTHER/Data%20entities.md)
- [Frequently asked questions](../OTHER/FAQ.md)
