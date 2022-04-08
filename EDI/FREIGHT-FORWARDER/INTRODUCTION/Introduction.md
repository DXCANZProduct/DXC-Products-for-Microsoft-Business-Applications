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
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction.md#setup)

### Freight forwarder setup

#### Mappings assigned on Freight forwarder landed cost Trading partner
Freight forwarder setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > Freight forwarder landed cost setup** <br>
- [Shipping port mapping](../SETUP/FF-SETUP/Shipping-port-mapping.md)
	- Voyage creator (ShipFromPort)
	- Voyage creator (ShipToPort)
	- Voyage tracking (Port)
- [Modes of delivery mapping](../SETUP/FF-SETUP/Modes-of-delivery-mapping.md)
	- Voyage creator (DlvModeId)
	- Voyage tracking (DlvModeId)
- [Customs broker mapping](../SETUP/FF-SETUP/Customs-broker-mapping.md)
	- Voyage creator (ShipCustomsBroker)
- [Shipping container types mapping](../SETUP/FF-SETUP/Shipping-container-types-mapping.md)
	- Voyage creator (ShipContainerTypeId) 
- [Activity mapping](../SETUP/FF-SETUP/Activity-mapping.md)
	- Voyage tracking (Activity) 
- [Shipping port qualifier mapping](../SETUP/FF-SETUP/Shipping-port-qualifier-mapping.md)
	- Voyage tracking (PortQualifier)
- [Shipping measurement unit mapping](../SETUP/FF-SETUP/Shipping-measurement-unit-mapping.md)
	- Voyage creator (ShipMeasurementUnitExternal) 
	- Voyage creator (ShipLineMeasurementUnitExternal)

Core Setup: **EDI > Setup** <br>
- [Unit of measure mapping](../../CORE/Setup/UOM-mapping.md)
	- Voyage creator (UnitId)

#### Freight forwarder Document type setup
Setup Document types which will be assigned on Freight forwarder landed cost Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Voyage creator](../SETUP/SETTING-PROFILES/Voyage-creator.md)
    - [Voyage tracking](../SETUP/SETTING-PROFILES/Voyage-tracking.md)
- [Field metadata](../../CORE/Setup/DocumentTypes/Field-metadata.md): optionally update staging form's display name and help text per field

#### Trading partner setup
Create new trading partners and assign setup and incoming/outgoing documents. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading-partner.md)

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../../CORE/Managing-files/Inbound-files.md)

### Freight forwarder documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Freight forwarder landed cost documents**
- [Voyage creator](../DOCUMENTS/Voyage-creator.md)
- [Voyage tracking](../DOCUMENTS/Voyage-tracking.md)

[Process overview](Process-overview.md) for Freight forwarder EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace.md) - Manage file import and staging record errors. These records have not been successfully processed to a target D365 document

## Other
- [Data entities](../OTHER/Data-entities.md)
- [Security configuration](../../CORE/OTHER/Security-configuration.md)
- [Frequently asked questions](../OTHER/FAQ.md) - Includes example errors and recommended fixes
