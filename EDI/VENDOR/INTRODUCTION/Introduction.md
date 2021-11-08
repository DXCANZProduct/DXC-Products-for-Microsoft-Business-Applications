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

### Customer EDI documents (Vendor license only)

EDI contains the following documents pertaining to Vendor Trading partners.
- Outbound
	- Vendor purchase order - Allows D365 to send a purchase order to a Vendor.
	- Vendor purchase order change - Allows D365 to send changes to a purchase order to a Vendor. Also used to send purchase order confirmation where required.

- Inbound
	- Vendor purchase order acknowledgement (POA) - Allows Vendor to send an Acknowledgement once a purchase order has been received and verified, which in turn updates the D365 purchased based on EDI settings.
	- Vendor advanced shipping notice (ASN) - Allows Vendor to send delivery information to D365 with the delivery details, creating an arrival journal against the purchase order or a Load for Advanced Warehousing warehouses.
	- Purchase invoice - Allows Vendor to send a Tax Invoice document to D365, creating a pending or posting the Tax invoice for the Purchase order/s based on settings and validation.

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Setup/Setup%20overview.md)

### Vendor setup

#### Assigned on items:
- Required where the confirmed pack sizes within the Vendor purchase order acknowledgement is set to use System pack and/or System inner. Setup at **Product information management > Products > Released products and selecting FastTab Manage inventory**
	- [Item pack sizes](../../CORE/Setup/Item%20pack%20sizes.md)

#### Mappings assigned on Vendor Trading partner
Used to map D365/EDI value to Vendor's value and assigned on Vendor Trading partner: <br>

- Vendor setup: **EDI > Setup > Vendor setup** <br>
	- [Order type group](../SETUP/VENDOR%20SETUP/Order%20type%20group.md)
	- [Order purpose group](../SETUP/VENDOR%20SETUP/Order%20purpose%20group.md)
	- [Order line change type group](..SETUP/VENDOR%20SETUP/Order%20line%20change%20type%20group.md)
	- [Carrier mode]()
	- [Charges code]()
	- [POA response code group](../SETUP/VENDOR%20SETUP/POA%20response%20code%20group.md)
	- [Payment terms type group]()
	- [Misc charge/allowance indicator]()
	- [Misc method of handling]()

- Core Setup: **EDI > Setup** <br>
	- [Unit of measure mapping](../../CORE/Setup/UOM%20mapping.md)

#### Customer Document type setup
Setup Document types which will be assigned on Customer Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File%20templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Customer purchase order](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order.md)
    - [Customer purchase order change](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order%20change.md)
    - [Customer purchase order acknowledgement](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order%20acknowledgement.md)
    - [Customer advanced shipping notice](../SETUP/SETTING%20PROFILES/Customer%20advanced%20shipping%20notice.md)
    - [Sales invoice](../SETUP/SETTING%20PROFILES/Sales%20invoice.md)
- Validation profiles: applicable to the following inbound document types
    - [Customer purchase order](../SETUP/VALIDATION%20PROFILES/Customer%20purchase%20order.md)
    - [Customer purchase order change](../SETUP/VALIDATION%20PROFILES/Customer%20purchase%20order%20change.md)
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

### Customer documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Customer documents**
- [Customer purchase order](../DOCUMENTS/Customer%20purchase%20order.md)
- [Customer purchase order change](../DOCUMENTS/Customer%20purchase%20order%20change.md)
- [Customer purchase order acknowledgement](../DOCUMENTS/Customer%20purchase%20order%20acknowledgement.md)
- [Customer advanced shipping notice](../DOCUMENTS/Customer%20advanced%20shipping%20notice.md)
- [Sales invoice](../DOCUMENTS/Sales%20invoice.md)

### Review sales order
The following section describes the additional EDI functionality on Sales orders.
- [Review sales order](../DOCUMENTS/Review%20sales%20order.md)

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md)
- [EDI Sales order processing](../WORKSPACES/EDI%20Sales%20order%20processing.md)

## Other
- [Data entities](../OTHER/Data%20entities.md)
- [Frequently asked questions](../OTHER/FAQ.md)
