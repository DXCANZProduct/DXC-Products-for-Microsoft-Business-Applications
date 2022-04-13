---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL - Data entities]
author: [jdutoit2]
manager: Kym Parker
ms.date: 19/11/2021
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
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Data entities

The following is a summary of data entities available for the 3PL EDI module:

## 3PL setup
EDI > Setup > 3PL setup

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Inventory journal name mapping      | Create new **Inventory journal name mapping group**. EDI > Setup > 3PL setup > Inventory journal name mapping |
2	                | Inventory journal name mapping line | Create new **Inventory journal name mapping lines**. EDI > Setup > 3PL setup > Inventory journal name mapping | Inventory journal name mapping
3	                | Disposition code mapping            | Create new **Disposition code mapping group**. EDI > Setup > 3PL setup > Disposition code mapping | 
4	                | Disposition code mapping lines      | Create new **Disposition code mapping lines**. EDI > Setup > 3PL setup > Disposition code mapping | Disposition code mapping
5	                | Inventory status Id mapping         | Create new **Inventory status Id mapping group**. EDI > Setup > 3PL setup > Inventory status Id mapping |
6	                | Inventory status Id mapping lines   | Create new **Inventory status Id mapping lines**. EDI > Setup > 3PL setup > Inventory status Id mapping | Inventory status Id mapping
7	                | Transaction direction mapping       | Create new **Transaction direction mapping group**. EDI > Setup > 3PL setup > Transaction direction mapping |
8	                | Transaction direction mapping lines | Create new **Transaction direction mapping lines**. EDI > Setup > 3PL setup > Transaction direction mapping | Transaction direction mapping
9	                | 3PL EDI order purpose group         | Create new **3PL order purpose group**. EDI > Setup > 3PL setup > Order purpose group |
10	              | 3PL EDI order purpose lines         | Create new **3PL order purpose lines**. EDI > Setup > 3PL setup > Order purpose group | 3PL EDI order purpose group

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

See [Core data entities](../../CORE/Other/Data-entities.md#document-types)

## Trading partner
EDI > Setup > Trading partner

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1                 | EDI Warehouses                          | Create new Warehouse trading partner   | [3PL setup](#3pl-setup)
2                 | EDI Documents - Warehouse               | Add incoming and outgoing documents to Warehouse trading partner | EDI Warehouses, [3PL setting profiles](#document-setting-profiles)  and [Document types](../../CORE/OTHER/Data-entities.md#document-types)
