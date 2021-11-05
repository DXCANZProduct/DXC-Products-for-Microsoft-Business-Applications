---
# required metadata

title: [EDI Customer]
description: [Introduction to EDI Customer]
author: [jdutoit2]
manager: Kym Parker
ms.date: 29/09/2021
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
This section will provide a quick overview of the Customer EDI module.

Customer module includes the following documents:
1. Customer purchase order (inbound): Creates a D365 sales order, sales agreement or release order.
2. Customer purchase order change (inbound): Updates an existing D365 sales order by changing any of the following: delivery address, store code, dates, delivery time, quantities, prices and/or adding additional lines.
3. Customer purchase acknowledgement (outbound): Send an acknowledgement comparing the D365 sales order to customers EDI purchase order.
4. Customer advanced shipping notice (outbound): Send packing slip information with packing details.
5. Sales invoice (outbound): Send the sales order tax invoice.

## Core setup
Core setup is discussed in detail [here](../../CORE/Setup/Setup%20overview.md)

## Customer setup
### Assigned on Customer Trading partner
Used to map D365/EDI value to Customer's value and assigned on Customer Trading partner: <br>

- Customer setup: **EDI > Setup > Customer setup** <br>
	- [Purchase order types](../SETUP/CUSTOMER%20SETUP/Purchase%20order%20types.md)
	- [Order purpose group](../SETUP/CUSTOMER%20SETUP/Order%20purpose%20group.md)
	- [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md)
	- [Order line change type group](..SETUP/CUSTOMER%20SETUP/Order%20line%20change%20type%20group.md)

- Core Setup: **EDI > Setup** <br>
	- [Unit of measure mapping](../../CORE/Setup/UOM%20mapping.md)

### Assigned on EDI parameters:
- Sales and marketing setup: **Sales and marketing > Setup > Sales orders > Order hold codes**<br>
	- [Hold codes](../SETUP/CUSTOMER%20SETUP/Hold%20codes.md)

### Assigned on items:
- Required where the confirmed pack sizes within the Customer purchase order acknowledgement is set to use System pack and/or System inner. Setup at **Product information management > Products > Released products and selecting FastTab Manage inventory**
	- [Item pack sizes](../../CORE/Setup/Item%20pack%20sizes.md)

### Assigned on warehouses:
- Required where advanced shipping notice (ASN) will be sent to EDI customers and determines what information will be used when creating the ASN: 
	- [ASN line configurations](../SETUP/Warehouses.md#asn-line-configurations) 

## Customer Document type setup
Setup Document types and assign on Customer Trading partner. <br>
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

## Trading partner setup
Assign setup and incoming/outgoing documents on the Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading%20partner.md)

## Customer documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Customer documents**
- [Customer purchase order](../DOCUMENTS/Customer%20purchase%20order.md)
- [Customer purchase order change](../DOCUMENTS/Customer%20purchase%20order%20change.md)
- [Customer purchase order acknowledgement](../DOCUMENTS/Customer%20purchase%20order%20acknowledgement.md)
- [Customer advanced shipping notice](../DOCUMENTS/Customer%20advanced%20shipping%20notice.md)
- [Sales invoice](../DOCUMENTS/Sales%20invoice.md)

## Review sales order
The following section describes the additional EDI functionality on Sales orders.
- [Review sales order](../DOCUMENTS/Review%20sales%20order.md)

## Workspaces
The following workspaces are available:
- EDI Document maintenance
	- [Applicable to all modules](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md)
	- [Customer specific]
- [EDI Sales order processing](../WORKSPACES/EDI%20Sales%20order%20processing.md)

## Other
- [Data entities](../OTHER/Data%20entities.md)
- [Frequently asked questions](../OTHER/FAQ.md)
