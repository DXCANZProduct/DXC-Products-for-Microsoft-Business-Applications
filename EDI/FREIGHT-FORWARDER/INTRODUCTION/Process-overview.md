---
# required metadata

title: EDI Freight forwarder
description: Overview of the Freight forwarder EDI module process
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-19
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
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

# Process overview

## Voyage creator
When a D365 Vendor of **Shipping type** set to _Shipping company_ has been loaded as a Freight forwarder landed cost Trading partner and has the incoming **Voyage creator** document setup and enabled, the freight forwarder can send the shipment details in order to create a Landed cost Voyage. 

## Voyage tracking
When a D365 Vendor of **Shipping type** set to _Shipping company_ has been loaded as a Freight forwarder landed cost Trading partner and has the inbound **Voyage tracking** document setup and enabled, the freight forwarder can send tracking detail(s) in order to update the Landed cost Voyage's tracking legs for all containers or for a particular container.

## Document errors
When an incoming staging record/document errors, it has not created/updated the target D365 transaction. <br>
When an outgoing staging record/document errors, it has not created the Outbound file. <br>

Staging/document errors can be viewed at: <br>
- **EDI > Documents** - On each document type, user can set filter **Staging to target status** to _Error_
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace.md) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.

### Fixing Staging-to-Target EDI errors 
See [FAQ](FAQ.md#fixing-staging-to-target-edi-errors) for example errors and possible method(s) of fixing.
