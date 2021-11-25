---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL - FAQ]
author: [jdutoit2]
manager: Kym Parker
ms.date: 25/11/2021
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

# Frequently asked questions

## Generic EDI queries

See [EDI Core FAQ](../../CORE/OTHER/FAQ.md) for generic queries

## Fixing 3PL EDI errors
The following table describes a few staging errors that could be experienced with 3PL inbound documents at the staging to target step. Short description of possible fixes are discussed. After fix, reset status on the staging record and either manually process again or leave for batch to process.

Document                          | Error	                                              | How to fix
:--                               | :--                                                 |:--
Picking list registration         | Item %, dimensions: % Physical on-hand %=Available % cannot be picked because only % is/are available from the inventory  | Adjust D365 on-hand if staging record correct
Picking list registration         | Picking list % is in status Completed               | The D365 picking list registration has already been completed. Verify if duplication and either fix record's picking route id or cancel staging record if duplication.
Shipment receipt - Purchase order | Receipt list % does not exist for purchase order %  | The EDI record's purchase order and receipt combination doesn't match to D365. Verify and fix staging record.
Shipment receipt - Transfer order | Transfer order % does not exist | Verify if Transfer number (InventTransferId) is correct in staging
Shipment receipt - Transfer order | Line does not exist             | Verify if Lot ID (InventTransId) is correct in staging
Shipment receipt - Return order   | Line does not exist             | Verify if Lot ID (InventTransId) is correct in staging


