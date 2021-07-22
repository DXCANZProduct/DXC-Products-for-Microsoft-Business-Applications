---
# required metadata

title: [EDI Core]
description: [EDI Inquiries - Functional acknowledgement received]
author: [jdutoit2]
manager: Kym Parker
ms.date: 22/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---


# Functional acknowledgement received

## Functional acknowledgement received inquiry
Users can access the form by navigating to **EDI > Inquiries and reports > Functional acknowledgement received**. <br>
When assigning outbound documents for a trading partner, the user has an option to set that an Inbound functional acknowledgement is required.
This is achieved by setting **Acknowledgement** to *Yes* on the Trading partner's Outgoing documents.

This inqury form provides a view of outgoing documents that that requires an Inbound functional acknowledgement.
**Outbound files** on the Action pane opens the Outbound file for the staging record.

Filter pane options:
- **Type** - Filter records to a Trading partner type.
- **EDI Document type** - Filter records to a specific EDI document type.
- **Company** - Filter records to a specific company.


Available fields for the outgoing staging records:
- **EDI number**
- **Company**
- **Type** - Customer, Vendor or Warehouse
- **Trading partner account** - Customer account, Vendor account or Warehouse
- **Name** - Trading partner's name
- **EDI Document type**
- **Group control number** - Used for matching the Inbound functional acknowledgement to the correct outgoing staging record.
- **Sent timestamp** - Date stamp of when the record was sent
- **Received** - Indicates if an Inbound functional acknowledgement has been received for the Group control number
- **Received timestamp** - Date/time when the Inbound functional acknowledgement has been receibed for the Group control number
