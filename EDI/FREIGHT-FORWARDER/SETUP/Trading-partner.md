---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder Setup - Trading partners
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-26
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

# Freight forwarder landed cost setup
## Trading partners

EDI works on the basis that an external entity (trading partner) wants to send or receive information from us. To this end, the module is built to link the documents and their associated settings to those entities (trading partners).
A trading partner can be created based on an existing D365 entity like a warehouse, vendor or a customer. Depending on the various modules installed, different trading partner types will be available for setup.
It also provides the setup for trading partner level options as well as defining which incoming and outgoing document types are enabled for the trading partner.

To open the **Trading partners** page, go to **EDI > Setup > Trading partners**. Then set the fields as described in the following subsections.

### All trading partners
The [Core trading partner setup](../../CORE/Setup/Trading-partners.md) describes the setup applicable to **All** types of trading partners.

### Freight forwarder landed cost trading partners details
This section describes the setup applicable to **Freight forwarder landed cost** trading partners.

#### Options
The following table describes the Freight forwarder module fields that are available on the **Options** FastTab of the **Trading partners** page.

**Field**                             | **Description**               
:---------                            |:--------
<ins>**Container mapping**</ins>      |
**Container type**                    |	Container type identifiers <br> Note: For further information see [Setup shipping container types mapping](FF-SETUP/Shipping-container-types-mapping.md)
**Measurement unit**                  |	Shipping measurement unit mapping <br> Note: For further information see [Setup shipping measurement unit mapping](FF-SETUP/Shipping-measurement-unit-mapping.md)
<ins>**Journey mapping**</ins>	      |
**Port**                              |	Shipping port mapping <br> Note: For further information see [Setup shipping port mapping](FF-SETUP/Shipping-port-mapping.md)
**Port qualifier**                    |	Shipping port qualifier mapping <br> Note: For further information see [Setup shipping port qualifier mapping](FF-SETUP/Shipping-port-qualifier-mapping.md)
**Mode of delivery**                  |	Mode of delivery mapping <br> Note: For further information see [Setup modes of delivery mapping](FF-SETUP/Modes-of-delivery-mapping.md)
**Activity**                          |	Activity mapping <br> Note: For further information see [Setup activity mapping](FF-SETUP/Activity-mapping.md)
<ins>**Other mappings**</ins>	        |
**Customs broker**                    |	Customs broker mapping <br> Note: For further information see [Setup customs broker mapping](FF-SETUP/Customs-broker-mapping.md)
**UOM**                               |	Unit of measure mappings. Ability to map a trading partner’s unit of measure (example kgs) to D365 unit of measure (example kg). <br> Note: For further information see [Setup unit of measure mapping](../../CORE/Setup/UOM-mapping.md)

- Data entity: EDI Freight forwarders

#### Outgoing documents
The Outgoing documents FastTab defines the outgoing EDI document types that have been configured and enabled for the trading partner. It brings the document template and mappings together with the settings profile to enable the document for the trading partner.
Also specifies if an Inbound Functional Acknowledgement is required for each outgoing document.

The **Outgoing documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Outgoing documents](../../CORE/Setup/Trading-partners.md#outgoing-documents)

- Data entity: EDI - Documents freight forwarder landed cost

#### Incoming documents
The Incoming documents FastTab defines the incoming EDI document types that have been configured and enabled for the trading partner. It brings the document template, mappings, validation profile and setting profiles together along with a file mask for importing to enable the document for the trading partner.
Also specifies if the Trading partner requires an Outbound Functional Acknowledgement to be sent for each incoming document.

The **Incoming documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Incoming documents](../../CORE/Setup/Trading-partners.md#incoming-documents)

- Data entity: EDI - Documents freight forwarder landed cost

### Vendor
**EDI trading partner** and **EDI Documents** can be viewed via FactBoxes available on the **All vendors** page. <br>
These can be accessed by navigating to **Accounts payable > Vendors > All vendors** and selecting the shipping company vendor.

### Data entities

- EDI Freight forwarders
- EDI - Documents freight forwarder landed cost
