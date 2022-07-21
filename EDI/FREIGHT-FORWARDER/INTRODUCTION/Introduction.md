---
# required metadata

title: EDI Freight forwarder
description: Introduction to EDI Freight forwarder for Landed cost
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-17
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable
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

# Introduction to Freight forwarder for Landed cost EDI
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
- [EDI Document maintenance](../../CORE/Workspaces/EDI-Document-maintenance-workspace.md) - Manage file import and staging record errors. These records have not been successfully processed to a target D365 document

## Other
- [Data entities](../OTHER/Data-entities.md)
- [Security configuration](../OTHER/Security-configuration.md)
- [Frequently asked questions](FAQ.md) - Includes example errors and recommended fixes
