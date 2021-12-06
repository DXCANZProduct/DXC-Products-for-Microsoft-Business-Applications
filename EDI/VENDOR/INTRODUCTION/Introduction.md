---
# required metadata

title: [EDI Vendor]
description: [Introduction to EDI Vendor]
author: [jdutoit2]
manager: Kym Parker
ms.date: 8/11/2021
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
This section will provide a quick overview of the Vendor EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- Inbound
	- Functional Acknowledgement – Receive functional acknowledgement that outbound document has been received by Trading partner.
- Outbound
	- Functional Acknowledgement – Send functional acknowledgement that inbound document has been received.

### Vendor EDI documents (Vendor license only)

EDI contains the following documents pertaining to Vendor Trading partners.
- Outbound
	- Vendor purchase order - Allows D365 to send a purchase order to a Vendor.
	- Vendor purchase order change - Allows D365 to send changes to a purchase order to a Vendor. Also used to send purchase order confirmation where required for a purchase order acknowledgement.

- Inbound
	- Vendor purchase order acknowledgement (POA) - Allows Vendor to send an Acknowledgement once a purchase order has been received and verified, which in turn updates the D365 purchase order based on EDI settings.
	- Vendor advanced shipping notice (ASN) - Allows Vendor to send delivery information to D365 with the delivery details, creating an arrival journal against the purchase order or a Load for Advanced Warehousing warehouses.
	- Purchase invoice - Allows Vendor to send a Tax Invoice document to D365, creating a pending or posting the Tax invoice for the Purchase order/s based on settings and validation.

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction.md#setup)

### Vendor setup

#### Assigned on items:
- Required where the confirmed pack sizes within the Vendor purchase order acknowledgement is set to use System pack and/or System inner. Setup at **Product information management > Products > Released products and selecting FastTab Manage inventory**
	- [Item pack sizes](../../CORE/Setup/Item%20pack%20sizes.md)

#### Mappings assigned on Vendor Trading partner
Used to map D365/EDI value to Vendor's value and assigned on Vendor Trading partner: <br>

- Vendor setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > Vendor setup** <br>
	- [Order type group](../SETUP/VENDOR%20SETUP/Order%20type%20group.md)
		- Vendor purchase order (OrderType)
		- Vendor purchase order change (OrderType)
	- [Order purpose group](../SETUP/VENDOR%20SETUP/Order%20purpose%20group.md)
		- Vendor purchase order (OrderPurpose)
		- Vendor purchase order change (OrderPurpose)
	- [Order line change type group](../SETUP/VENDOR%20SETUP/Order%20line%20change%20type%20group.md)
		- Vendor purchase order change (LineChangeType)
	- [Carrier mode](../SETUP/VENDOR%20SETUP/Carrier%20mode.md)
		- Vendor purchase order (CarrierMode)
		- Vendor purchase order change (CarrierMode)
	- [Charges code](../SETUP/VENDOR%20SETUP/Charges%20code.md)
		- Vendor purchase order (MiscCode)
		- Vendor purchase order change (MiscCode)
		- Purchase invoice (MiscCode)
	- [POA response code group](../SETUP/VENDOR%20SETUP/POA%20response%20code%20group.md)
		- Vendor purchase order acknowledgement (POAVendCode, POAVendCodeItem and POAVendCodeShipment)
	- [Payment terms type group](../SETUP/VENDOR%20SETUP/Payment%20terms%20type%20group.md)
		- Vendor purchase order (TermsTypeCode) 
		- Vendor purchase order change (TermsTypeCode)
		- Purchase invoice (TermsTypeCode)
	- [Misc charge/allowance indicator](../SETUP/VENDOR%20SETUP/Misc%20charge%20allowance%20indicator.md)
		- Vendor purchase order (MiscIndicator) 
		- Vendor purchase order change (MiscIndicator)
		- Purchase invoice (MiscIndicator)
	- [Misc method of handling](../SETUP/VENDOR%20SETUP/Misc%20method%20of%20handling.md)
		- Purchase invoice (MiscMethodHandling)

- Core Setup: **EDI > Setup** <br>
	- [Unit of measure mapping](../../CORE/Setup/UOM%20mapping.md)

#### Vendor Document type setup
Setup Document types which will be assigned on Vendor Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File%20templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Vendor purchase order](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order.md)
    - [Vendor purchase order change](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order%20change.md)
    - [Vendor purchase order acknowledgement](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md)
    - [Vendor advanced shipping notice](../SETUP/SETTING%20PROFILES/Vendor%20advanced%20shipping%20notice.md)
    - [Purchase invoice](../SETUP/SETTING%20PROFILES/Purchase%20invoice.md)
- Validation profiles: applicable to the following inbound document types
    - [Vendor purchase order acknowledgement](../SETUP/VALIDATION%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md)
    - [Vendor advanced shipping notice](../SETUP/VALIDATION%20PROFILES/Vendor%20advanced%20shipping%20notice.md)
    - [Purchase invoice](../SETUP/VALIDATION%20PROFILES/Purchase%20invoice.md)
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

### Vendor documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Vendor documents**
- [Vendor purchase order](../DOCUMENTS/Vendor%20purchase%20order.md)
- [Vendor purchase order change](../DOCUMENTS/Vendor%20purchase%20order%20change.md)
- [Vendor purchase order acknowledgement](../DOCUMENTS/Vendor%20purchase%20order%20acknowledgement.md)
- [Vendor advanced shipping notice](../DOCUMENTS/Vendor%20advanced%20shipping%20notice.md)
- [Purchase invoice](../DOCUMENTS/Purchase%20invoice.md)

[Process overview](Process%20overview.md) for Vendor EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md)
- [EDI Purchase order processing](../WORKSPACES/EDI%20Purchase%20order%20processing.md)

## Other
- [Data entities](../OTHER/Data%20entities.md)
- [Security configuration](../../CORE/OTHER/Security%20configuration.md)
- [Frequently asked questions](../OTHER/FAQ.md)
