---
# required metadata

title: EDI Core
description: EDI Inquiries - Functional acknowledgement received
author: jdutoit2
manager: Kym Parker
ms.date: 2021-07-22
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFunctionalAckReceivedTable
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


# Functional acknowledgement received

## Functional acknowledgement received inquiry
Users can access the form by navigating to **EDI > Inquiries and reports > Functional acknowledgement received**. <br>
When assigning outbound documents to a trading partner, the user has an option to set that an Inbound functional acknowledgement is required to be received from the trading partner.
This is achieved by setting **Acknowledgement** to *Yes* on each of the applicable Trading partner's Outgoing documents.

This inqury form provides a view of outgoing documents that requires an Inbound functional acknowledgement. <br>
**Outbound files** on the Action pane opens the Outbound file for the staging record.

Filter pane options:
- **Type** - Filter records to a Trading partner type.
- **EDI Document type** - Filter records to a specific EDI document type.
- **Company** - Filter records to a specific company.


Available fields for the outgoing staging records:
- **EDI number** - EDI number for the record
- **Company** - Company for the record
- **Type** - Customer, Vendor or Warehouse
- **Trading partner account** - Customer account, Vendor account or Warehouse
- **Name** - Trading partner's name
- **EDI document type** - EDI document type for the record
- **Group control number** - Used for matching the Inbound functional acknowledgement to the correct outgoing staging record.
- **Sent timestamp** - Date stamp of when the record was sent
- **Received** - Indicates if an Inbound functional acknowledgement has been received for the Group control number
- **Received timestamp** - Date/time when the Inbound functional acknowledgement has been receibed for the Group control number
