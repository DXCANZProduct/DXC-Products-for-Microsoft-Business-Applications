---
# required metadata

title: [EDI Freight forwarder]
description: [Introduction to EDI Freight forwarder for Landed cost]
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
This section will provide a quick overview of the Freight forwarder for Landed cost EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- **Inbound**
	- **Functional Acknowledgement** – Receive functional acknowledgement that outbound document has been received by Trading partner.
- **Outbound**
	- **Functional Acknowledgement** – Send functional acknowledgement that inbound document has been received.

### Freight forwarder EDI documents (Freight forwarder license only)

EDI contains the following documents pertaining to Freight forwarder Trading partners.
- **Inbound** 
	- **Voyage creator**: Allows Freight forwarder to send voyage details in order to create a Landed cost Voyage
	- **Voyage tracking**: Allows Freight forwarder to send tracking updates for an existing Landed cost Voyage

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Setup/Setup%20overview.md)

### Freight forwarder setup

#### Mappings assigned on Freight forwarder landed cost Trading partner
Freight forwarder setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > Freight forwarder landed cost setup** <br>
- [Shipping port mapping]()
	- Voyage creator (ShipFromPort)
	- Voyage creator (ShipToPort)
	- Voyage tracking (Port)
- [Modes of delivery mapping]()
	- Voyage creator (DlvModeId)
	- Voyage tracking (DlvModeId)
- [Customs broker mapping]()
	- Voyage creator (ShipCustomsBroker)
- [Shipping container types mapping]()
	- Voyage creator (ShipContainerTypeId) 
- [Activity mapping]()
	- Voyage tracking (Activity) 
- [Shipping port qualifier mapping]()
	- Voyage tracking (PortQualifier)
- [Shipping measurement unit mapping]()
	- Voyage creator (ShipMeasurementUnitExternal) 
	- Voyage creator (ShipLineMeasurementUnitExternal)

Core Setup: **EDI > Setup** <br>
- [Unit of measure mapping](../../CORE/Setup/UOM%20mapping.md)
	- Voyage creator (UnitId)

#### Freight forwarder Document type setup
Setup Document types which will be assigned on Freight forwarder landed cost Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File%20templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Voyage creator]()
    - [Voyage tracking]()
- [Field metadata](../../CORE/Setup/DocumentTypes/Field%20metadata.md): optionally update staging form's display name and help text per field

#### Trading partner setup
Create new trading partners and assign setup and incoming/outgoing documents. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading%20partner.md)

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../../CORE/Managing%20files/Inbound%20files.md)

### Freight forwarder documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Freight forwarder landed cost documents**
- [Voyage creator]()
- [Voyage tracking]()

[Process overview](Process%20overview.md) for Freight forwarder EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md) - Manage file import and staging record errors. These records have not been successfully processed to a target D365 document

## Other
- [Data entities](../OTHER/Data%20entities.md)
- [Frequently asked questions](../OTHER/FAQ.md) - Includes example errors and recommended fixes
