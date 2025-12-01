---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
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
- **Outbound**
	- **Voyage advice** - Allows D365 to send a Purchase order document to the Freight forwarder.
- **Inbound** 
	- **Voyage creator**: Allows Freight forwarder to send voyage details in order to create a Landed cost Voyage
	- **Voyage tracking**: Allows Freight forwarder to send tracking updates for an existing Landed cost Voyage

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction#setup)

### Freight forwarder setup

#### Mappings assigned on Freight forwarder landed cost Trading partner
Freight forwarder setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > Freight forwarder landed cost setup** <br>
- [Shipping port mapping](../SETUP/FF-SETUP/Shipping-port-mapping)
	- Voyage creator (ShipFromPort)
	- Voyage creator (ShipToPort)
	- Voyage tracking (Port)
- [Modes of delivery mapping](../SETUP/FF-SETUP/Modes-of-delivery-mapping)
	- Voyage creator (DlvModeId)
	- Voyage tracking (DlvModeId)
- [Customs broker mapping](../SETUP/FF-SETUP/Customs-broker-mapping)
	- Voyage creator (ShipCustomsBroker)
- [Shipping container types mapping](../SETUP/FF-SETUP/Shipping-container-types-mapping)
	- Voyage creator (ShipContainerTypeId) 
- [Activity mapping](../SETUP/FF-SETUP/Activity-mapping)
	- Voyage tracking (Activity) 
- [Shipping port qualifier mapping](../SETUP/FF-SETUP/Shipping-port-qualifier-mapping)
	- Voyage tracking (PortQualifier)
- [Shipping measurement unit mapping](../SETUP/FF-SETUP/Shipping-measurement-unit-mapping)
	- Voyage creator (ShipMeasurementUnitExternal) 
	- Voyage creator (ShipLineMeasurementUnitExternal)

Core Setup: **EDI > Setup** <br>
- [Unit of measure mapping](../../CORE/Setup/UOM-mapping)
	- Voyage creator (UnitId)

#### Freight forwarder Document type setup
Setup Document types which will be assigned on Freight forwarder landed cost Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Voyage creator](../SETUP/SETTING-PROFILES/Voyage-creator)
    - [Voyage tracking](../SETUP/SETTING-PROFILES/Voyage-tracking)
- [Field metadata](../../CORE/Setup/DocumentTypes/Field-metadata): optionally update staging form's display name and help text per field

#### Trading partner setup
Create new trading partners and assign setup and incoming/outgoing documents. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading-partner)

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../../CORE/Managing-files/Inbound-files)

### Freight forwarder documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Freight forwarder landed cost documents**
- [Voyage advice](../DOCUMENTS/Voyage-advice)
- [Voyage creator](../DOCUMENTS/Voyage-creator)
- [Voyage tracking](../DOCUMENTS/Voyage-tracking)

[Process overview](Process-overview) for Freight forwarder EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/Workspaces/EDI-Document-maintenance-workspace) - Manage file import and staging record errors. These records have not been successfully processed to a target D365 document

## Other
- [Data entities](../OTHER/Data-entities)
- [Security configuration](../OTHER/Security-configuration)
- [Frequently asked questions](FAQ) - Includes example errors and recommended fixes
