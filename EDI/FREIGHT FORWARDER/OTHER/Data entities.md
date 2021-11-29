---
# required metadata

title: [EDI Freight forwarder]
description: [EDI Freight forwarder - Data entities]
author: [jdutoit2]
manager: Kym Parker
ms.date: 30/11/2021
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

# Data entities

The following is a summary of data entities available for the Freight forwarder landed cost EDI module:

## Freight forwarder landed cost setup
EDI > Setup > Freight forwarder landed cost setup

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Shipping port mapping           | Create new **Shipping port mapping**. EDI > Setup > Freight forwarder landed cost setup > Shipping port mapping |
2	                | Shipping port mapping lines     | Create new **Shipping port mapping lines**. EDI > Setup > Freight forwarder landed cost setup > Shipping port mapping | Shipping port mapping
3	                | Modes of delivery mapping       | Create new **Modes of delivery mapping**. EDI > Setup > Freight forwarder landed cost setup > Modes of delivery mapping | 
4	                | Modes of delivery mapping lines | Create new **Modes of delivery mapping lines**. EDI > Setup > Freight forwarder landed cost setup > Modes of delivery mapping | Modes of delivery mapping
5	                | Customs broker mapping          | Create new **Customs broker mapping**. EDI > Setup > Freight forwarder landed cost setup > Customs broker mapping |
6	                | Customs broker mapping lines    | Create new **Customs broker mapping lines**. EDI > Setup > Freight forwarder landed cost setup > Customs broker mapping | Customs broker mapping
7	                | Shipping container type mapping | Create new **Shipping container type mapping**. EDI > Setup > Freight forwarder landed cost setup > Shipping container type mapping |
8	                | Shipping container type mapping lines | Create new **Shipping container type mapping lines**. EDI > Setup > Freight forwarder landed cost setup > Shipping container type mapping | Shipping container type mapping
9	                | Activity mapping                | Create new **Activity mapping**. EDI > Setup > Freight forwarder landed cost setup > Activity mapping |
10	              | Activity mapping lines          | Create new **Activity mapping lines**. EDI > Setup > Freight forwarder landed cost setup > Activity mapping | Activity mapping
11	              | Shipping port qualifier mapping | Create new **Shipping port qualifier mapping**. EDI > Setup > Freight forwarder landed cost setup > Shipping port qualifier mapping |
12	              | Shipping port qualifier mapping lines | Create new **Shipping port qualifier mapping lines**. EDI > Setup > Freight forwarder landed cost setup > Shipping port qualifier mapping | Shipping port qualifier mapping
13	              | Shipping measurement unit mapping | Create new **Shipping measurement unit mapping**. EDI > Setup > Freight forwarder landed cost setup > Shipping measurement unit mapping |
14	              | Shipping measurement unit mapping lines | Create new **Shipping measurement unit mapping lines**. EDI > Setup > Freight forwarder landed cost setup > Shipping measurement unit mapping | Shipping measurement unit mapping

## Document setting profiles
EDI > Setup > Document types (Setting profiles for EDI 3PL documents)

**Order**         | **Entity**						| **Description**                             
:-----------------|:------------------------------------		|:------------------------- 
1	                | EDI Settings - Picking list	      | Create new document type **Settings profile** for Picking list
2	                | EDI Settings - Picking list registration	| Create new document type **Settings profile** for Picking list registration
3	                | EDI Settings Shipment Advice - Purchase order	| Create new document type **Settings profile** for Shipment Advice - Purchase order
4	                | EDI Settings Shipment Advice - Transfer order	| Create new document type **Settings profile** for Shipment Advice - Transfer order
5	                | EDI Settings Shipment Advice - Return order	  | Create new document type **Settings profile** for Shipment Advice - Return order
6	                | EDI Settings Shipment Advice - Voyage	        | Create new document type **Settings profile** for Shipment Advice - Voyage
7	                | EDI Settings Shipment Receipt - Purchase order	| Create new document type **Settings profile** for Shipment Receipt - Purchase order
8	                | EDI Shipment Receipt settings - Transfer order	| Create new document type **Settings profile** for Shipment Receipt - Transfer order
9	                | EDI Settings Shipment Receipt - Return order	| Create new document type **Settings profile** for Shipment Receipt - Return order
10	              | EDI Settings Shipment Receipt - Voyage	      | Create new document type **Settings profile** for Shipment Receipt - Voyage
11	              | EDI Settings Inventory adjustment - Transfer	| Create new document type **Settings profile** for Inventory adjustment - Transfer
12	              | EDI Settings Inventory adjustment - Count	    | Create new document type **Settings profile** for Inventory adjustment - Count
13	              | EDI Settings Inventory adjustment - Reconciliation	| Create new document type **Settings profile** for Inventory adjustment - Reconciliation
14	              | EDI settings inventory adjustment - Movement	| Create new document type **Settings profile** for inventory adjustment - Movement


## Document types
EDI > Setup > Document types (Template, Validation, Outbound file names and EDI Field metadata)

See [Core data entities](../../CORE/OTHER/Data%20entities.md#document-types)

## Trading partner
EDI > Setup > Trading partner

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1                 | EDI Warehouses                          | Create new Warehouse trading partner   | [3PL setup](#3pl-setup)
2                 | EDI Documents - Warehouse               | Add incoming and outgoing documents to Warehouse trading partner | EDI Warehouses, [3PL setting profiles](#document-setting-profiles)  and [Document types](../../CORE/OTHER/Data%20entities.md#document-types)
