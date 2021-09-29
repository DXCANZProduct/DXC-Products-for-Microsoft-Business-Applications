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

## Core setup
Core setup is discussed in detail [here](../../CORE/Setup/Setup%20overview.md)

## Customer setup
Used to map D365/EDI value to Customer's value and assigned on Customer Trading partner: <br>
- **EDI > Setup > Customer setup**
	- [Purchase order types]
	- [Order purpose group]
	- [POA response code group]
	- [Order line change type group]

- **EDI > Setup**
	- [Unit of measure mapping]

Assigned on EDI parameters:
- **Sales and marketing > Setup > Sales orders > Order hold codes**
	- [Hold codes]

## Customer Document type setup
Setup Document types and assign on Customer Trading partner.
- **EDI > Setup > Document types**
Generic information with regards to all modules:
- [Document types](../../CORE/Setup/Document%20types.md)

Customer module specific document type setup:
- [Seting profiles]
	- [Customer purchase order]
	- [Customer purchase order change]
	- [Customer purchase order acknowledgement]
	- [Customer advanced shipping notice]
- [Validation profiles]
	- [Customer purchase order]
	- [Customer purchase order change]
	
- [Document type summary]

## Trading partner setup
**EDI > Setup > Trading partners**
- [Trading partner]

## Customer documents
**EDI > Documents > Customer documents**
- Staging forms
	- [Customer purchase order]
	- [Customer purchase order change]
	- [Review sales orders]
	- [Customer purchase order acknowledgement]
	- [Customer advanced shipping notice]
	- [Sales invoice]

## Workspaces
The following workspaces are available:
- EDI Document maintenance
	- [Applicable to all modules](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md)
	- [Customer specific]
- [EDI Sales order processing]

## Other
- [Data entities]
- [Frequently asked questions]
