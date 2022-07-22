---
# required metadata

title: EDI Vendor
description: EDI Vendor Setup - Trading partners
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
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

# Vendor setup
## Trading partners

EDI works on the basis that an external entity (trading partner) wants to send or receive information from us. To this end, the module is built to link the documents and their associated settings to those entities (trading partners).
A trading partner can be created based on an existing D365 entity like a warehouse, vendor or a customer. Depending on the various modules installed, different trading partner types will be available for setup.
It also provides the setup for trading partner level options as well as defining which incoming and outgoing document types are enabled for the trading partner.

To open the **Trading partners** page, go to **EDI > Setup > Trading partners**. Then set the fields as described in the following subsections.

### All trading partners
The [Core trading partner setup](../../CORE/Setup/Trading-partners.md) describes the setup applicable to **All** types of trading partners.

### Vendor trading partners details
This section describes the setup applicable to **Vendor** trading partners.

#### Options

The following table describes the vendor module fields that are available on the **Options** FastTab of the **Trading partners** page.

**Field**                          | **Description**               
:---------                         |:--------
<ins>**Order**</ins>	|
**Order type**                     | EDI purchase orders can be sent to trading partners with many order types.  The type identifier is determined by the method the order is processed within D365. <br> Note: For further information see [Setup order type groups](VENDOR-SETUP/Order-type-group.md)
**Order purpose**                  | Code identifying the purpose of the document. <br> Note: For further information see [Setup order purpose](VENDOR-SETUP/Order-purpose-group.md)
**Order line change type**        |	Code specifying the type of change to the line item. <br> Note: For further information see [Setup order line change type](VENDOR-SETUP/Order-line-change-type-group.md)
**Carrier mode**                  |	Code specifying the method or type of transportation for the shipment. <br> Note: For further information see [Setup carrier mode](VENDOR-SETUP/Carrier-mode.md)
**Charges code**                  |	Code identifying the service, promotion, allowance, or charge. <br> Note: For further information see [Setup charges code](VENDOR-SETUP/Charges-code.md)
**Payment terms type**            |	Code identifying the type of payment terms. <br> Note: For further information see [Setup payment terms type group](VENDOR-SETUP/Payment-terms-type-group.md)
**Misc charge/allowance indicator** |	Code which indicates an allowance or charge for the service specified. <br> Note: For further information see [Setup misc. charge/allowance indicator](VENDOR-SETUP/Misc-charge-allowance-indicator.md)
**Misc method of handling**       |	Code specifying if the misc. charge or allowance is required to be added to the D365 purchase invoice <br> Note: For further information see [Setup misc. method of handling](VENDOR-SETUP/Misc-method-of-handling.md)
<ins>**Acknowledgement**</ins>	|
**POA response code group**       |	POA Response codes are used to identify the status of information used in a purchase order acknowledgement for each vendor. <br> Note: For further information see [Setup POA response codes](VENDOR-SETUP/POA-response-code-group.md)
<ins>**Other**</ins>	|
**UOM**                           |	Unit of measure mappings. Ability to map a trading partner’s unit of measure (example kgs) to D365 unit of measure (example kg). <br> Note: For further information see [Setup unit of measure mapping](../../CORE/Setup/UOM-mapping.md)

- Data entity: EDI Vendors

#### Adresses
**Addresses** FastTab of the **Trading partners** page allows users with appropriate security permissions to edit and create address records within the **Trading partner** page.

#### Outgoing documents
The Outgoing documents FastTab defines the outgoing EDI document types that have been configured and enabled for the trading partner. It brings the document template and mappings together with the settings profile to enable the document for the trading partner.
Also specifies if an Inbound Functional Acknowledgement is required for each outgoing document.

The **Outgoing documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Outgoing documents](../../CORE/Setup/Trading-partners.md#outgoing-documents)

- Data entity: EDI Documents - Vendors

#### Incoming documents
The Incoming documents FastTab defines the incoming EDI document types that have been configured and enabled for the trading partner. It brings the document template, mappings, validation profile and setting profiles together along with a file mask for importing to enable the document for the trading partner.
Also specifies if the Trading partner requires an Outbound Functional Acknowledgement to be sent for each incoming document.

The **Incoming documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Incoming documents](../../CORE/Setup/Trading-partners.md#incoming-documents)

- Data entity: EDI Documents - Vendors

### Vendors
EDI trading partner information and Vendor documents can be viewed via FactBoxes available on the **All vendors** page. <br>
These can be accessed by navigating to **Accounts payable > Vendors > All vendors** and selecting the vendor.

### Data entities

- EDI Vendors
- EDI Documents - Vendors
