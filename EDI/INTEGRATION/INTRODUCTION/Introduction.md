---
# required metadata

title: EDI Integration
description: Introduction to EDI Integration
author: jdutoit2
manager: Kym Parker
ms.date: 2022-08-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  
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

# Introduction to Integrations EDI
This section will provide a quick overview of the Integrations EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- Inbound
	- Functional Acknowledgement – Receive functional acknowledgement that outbound document has been received by Trading partner.
- Outbound
	- Functional Acknowledgement – Send functional acknowledgement that inbound document has been received.

### Integrations EDI documents (Integrations license only)

EDI contains the following documents pertaining to Integrations Trading partners.
- **Outbound**
	- **Customer** - Allows D365 to send customer information using change tracking on tracked tables
	- **Customer group** - Allows D365 to send customer group information using change tracking on tracked tables

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction.md#setup)

### Integration setup

#### Integration Document type setup
Setup Document types which will be assigned on Integrations Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates.md): applicable to all document types
- [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md): applicable to all outbound document types
- [Field metadata](../../CORE/Setup/DocumentTypes/Field-metadata.md): optionally update staging form's display name and help text per field

#### Integration systems
Integrations trading partner isn't linked to D365 customer, vendor or warehouse. <br> 
This form allows the ability to create the Integration systems account that will be used when creating the Integrations Trading partner.
 - [Integration systems](../SETUP/Integration-systems.md)

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

### Integrations documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Integration systems documents**
- [Customer](../DOCUMENTS/Customer.md)
- [Customer group](../DOCUMENTS/Customer-group.md)

## Other
- [Data entities](../OTHER/Data-entities.md)
- [Security configuration](../OTHER/Security-configuration.md)
