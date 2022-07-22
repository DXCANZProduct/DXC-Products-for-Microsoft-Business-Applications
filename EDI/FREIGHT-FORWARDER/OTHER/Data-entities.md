---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder - Data entities
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-30
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIFFLCShipPortTableMapping, SAB_EDIFFLCVendDlvModeMapping, SAB_EDIFFLCCustomsBrokerMapping, SAB_EDIFFLCShipContainerTypeMapping, SAB_EDIFFLCShipActivityTableMapping, SAB_EDIFFLCShipPortQualifierMapping, SAB_EDIFFLCShipMeasurementUnitMapping, SAB_EDITradingPartner,SAB_EDIDocumentTypeTable
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
EDI > Setup > Document types (Setting profiles for EDI Freight forwarder landed cost documents)

**Order**         | **Entity**						                  | **Description**                             
:-----------------|:------------------------------------		|:------------------------- 
1	                | EDI setting voyage creator              | Create new document type setting profile for **Voyage creator**
2	                | EDI Setting voyage tracking             | Create new document type setting profile for **Voyage tracking**


## Document types
EDI > Setup > Document types (Template, Validation, Outbound file names and EDI Field metadata)

See [Core data entities](../../CORE/OTHER/Data-entities.md#document-types)

## Trading partner
EDI > Setup > Trading partner

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1                 | EDI Freight forwarders                          | Create new Freight forwarder landed cost trading partner   | [Freight forwarder landed cost setup](#freight-forwarder-landed-cost-setup)
2                 | EDI Documents - Freight forwarder               | Add incoming and outgoing documents to Freight forwarder landed cost trading partner | EDI Freight forwarders, [Setting profiles](#document-setting-profiles) and [Document types](../../CORE/OTHER/Data-entities.md#document-types)
