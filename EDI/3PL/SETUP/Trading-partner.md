---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL Setup - Trading partners]
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

# 3PL setup
## Trading partners

EDI works on the basis that an external entity (trading partner) wants to send or receive information from us. To this end, the module is built to link the documents and their associated settings to those entities (trading partners).
A trading partner can be created based on an existing D365 entity like a warehouse, vendor or a customer. Depending on the various modules installed, different trading partner types will be available for setup.
It also provides the setup for trading partner level options as well as defining which incoming and outgoing document types are enabled for the trading partner.

To open the **Trading partners** page, go to **EDI > Setup > Trading partners**. Then set the fields as described in the following subsections.

### All trading partners
The [Core trading partner setup](../../CORE/Setup/Trading-partners.md) describes the setup applicable to **All** types of trading partners.

### 3PL trading partners details
This section describes the setup applicable to **3PL** trading partners.

#### Options
The following table describes the 3PL module fields that are available on the **Options** FastTab of the **Trading partners** page.

**Field**                            | **Description**               
:---------                          |:--------
**Inventory journal name mapping**  |	Select inventory journal to use for inventory adjustments. <br> Note: For further information see [Setup inventory journal name mapping](3PL-SETUP/Inventory-journal-name-mapping.md)
**Inventory status Id mapping**     |	Inventory statuses are used within D365 to categorize inventory. <br> Note: For further information see [Setup inventory status id mapping](3PL-SETUP/Inventory-status-Id-mapping.md)
**Disposition code mapping**        |	Specify how to process an item that is returned by a customer. <br> Note: For further information see [Setup disposition code mapping](3PL-SETUP/Disposition-code-mapping.md)
**Item arrival**                    |	Select item arrival journal to use for processing inventory receipts. Options from **Inventory management > Setup > Journal names > Warehouse management**
**Transaction direction mapping**   |	Select transaction direction to use for processing inventory adjustment movement document. <br> Note: For further information see [Setup transaction direction mapping](3PL-SETUP/Transaction-direction-mapping.md)
**Order purpose**                   |	Select order purpose to use when sending picking list. If left blank/unmapped: the values Original, Change or Cancellation will be sent to the 3PL Trading partner. <br> Note: For further information see [Setup order purpose group](3PL-SETUP/Order-purpose-group.md)

- Data entity: EDI Warehouses

#### Outgoing documents
The Outgoing documents FastTab defines the outgoing EDI document types that have been configured and enabled for the trading partner. It brings the document template and mappings together with the settings profile to enable the document for the trading partner.
Also specifies if an Inbound Functional Acknowledgement is required for each outgoing document.

The **Outgoing documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Outgoing documents](../../CORE/Setup/Trading-partners.md#outgoing-documents)

- Data entity: EDI Documents - Warehouse

#### Incoming documents
The Incoming documents FastTab defines the incoming EDI document types that have been configured and enabled for the trading partner. It brings the document template, mappings, validation profile and setting profiles together along with a file mask for importing to enable the document for the trading partner.
Also specifies if the Trading partner requires an Outbound Functional Acknowledgement to be sent for each incoming document.

The **Incoming documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Incoming documents](../../CORE/Setup/Trading-partners.md#incoming-documents)

- Data entity: EDI Documents - Warehouse

### Warehouse
EDI trading partner information and 3PL documents can be viewed via FactBoxes available on the **Warehouses** form.
These can be accessed by navigating to **Inventory management > Setup > Inventory breakdown > Warehouses**.

### Data entities

- EDI Warehouses
- EDI Documents - Warehouse
