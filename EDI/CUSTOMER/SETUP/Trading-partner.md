---
# required metadata

title: EDI Customer
description: EDI Customer Setup - Trading partners
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-14
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDITradingPartner, CustTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer setup
## Trading partners

EDI works on the basis that an external entity (trading partner) wants to send or receive information from us. To this end, the module is built to link the documents and their associated settings to those entities (trading partners).
A trading partner can be created based on an existing D365 entity like a warehouse, vendor or a customer. Depending on the various modules installed, different trading partner types will be available for setup.
It also provides the setup for trading partner level options as well as defining which incoming and outgoing document types are enabled for the trading partner.

To open the **Trading partners** page, go to **EDI > Setup > Trading partners**. Then set the fields as described in the following subsections.

### All trading partners
The [Core trading partner setup](../../CORE/Setup/Trading-partners.md) describes the setup applicable to **All** types of trading partners.

### Customer trading partners details
This section describes the setup applicable to **Customer** trading partners.

#### Options
The following table describes the customer module fields that are available on the **Options** FastTab of the **Trading partners** page.

**Field**                          | **Description**               
:---------                         |:--------
<ins>**Order**</ins>	             |
**Customer EDI order types**       |	EDI purchase orders can be received from trading partners with many order types.  The type identifier received can change the way the order is processed within D365. <br> Note: For further information see [Setup purchase order types](CUSTOMER-SETUP/Purchase-order-types.md)
**Order purpose**                  |	Code identifying the purpose of the document. <br> Note: For further information see [Setup order purpose](CUSTOMER-SETUP/Order-purpose-group.md)
**Order line change type group**   |	Code specifying the type of change to the line item. <br> Note: For further information see [Setup order line change type](CUSTOMER-SETUP/Order-line-change-type-group.md)
**POA response code group**       |	POA Response codes are used to identify the status of information used in a purchase order acknowledgement for each customer. Note: For further information see [Setup POA response codes](CUSTOMER-SETUP/POA-response-code-group.md)
**No Backorders**                 |	Identify if the trading partner accepts backorders - Y/N. <br> Where the **Customer purchase order acknowledgement's** document setting **Quantity type** is set to **Reserved quantity**, the sales line’s ordered quantity is adjusted to the quantity reserved for the sales line. <br> The setting is also used on the Customer purchase order acknowledgement to identify **full** or **partial** shipments.
**UOM**                           |	Unit of measure mappings. Ability to map a customer’s unit of measure (example kgs) to D365 unit of measure (example kg). Used on in- and outbound documents **Sales unit** <br> Note: For further information see [Setup unit of measure mapping](../../CORE/Setup/UOM-mapping.md)

- Data entity: EDI Customers

#### Adresses
The following table describes the customer module fields that are available on the **Addresses** FastTab of the **Trading partners** page.
Allows users with appropriate security permissions to edit and create address records within the **Trading partner** page.

##### Store Codes
Each delivery address for a customer must be specified in the addresses form for a customer.  In addition to the standard D365 address fields, the Store code can also be specified. EDI customers often send both the delivery address for the DC (Distribution Centres) and Store Codes (final store destination).  The DC address is used to notify the freight company of the delivery address and the store code will be used to group and pack stock based on its final destination.  This can be used to print SSCC labels.

> Note: If a store code is mapped to the sales order header, the address associated with the specified store code will be populated as the delivery address for the sales order.
If the Purchase order refers to a new store code which hasn’t been mapped to a delivery address, the staging record will error with ‘Could not find address for store code '%'. The store can then be mapped to an address and the staging record reprocessed.

- Data entity: Party postal address V2, staging field SAB_EDISTORECODE

#### Outgoing documents
The Outgoing documents FastTab defines the outgoing EDI document types that have been configured and enabled for the trading partner. It brings the document template and mappings together with the settings profile to enable the document for the trading partner.
Also specifies if an Inbound Functional Acknowledgement is required for each outgoing document.

The **Outgoing documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Outgoing documents](../../CORE/Setup/Trading-partners.md#outgoing-documents)

- Data entity: EDI Documents - Customers

#### Incoming documents
The Incoming documents FastTab defines the incoming EDI document types that have been configured and enabled for the trading partner. It brings the document template, mappings, validation profile and setting profiles together along with a file mask for importing to enable the document for the trading partner.
Also specifies if the Trading partner requires an Outbound Functional Acknowledgement to be sent for each incoming document.

The **Incoming documents** FastTab of the **Trading partners** page is discussed in detail in [Core trading partner setup - Incoming documents](../../CORE/Setup/Trading-partners.md#incoming-documents)

- Data entity: EDI Documents - Customers

### Customers
EDI trading partner information and Customer documents can be viewed via FactBoxes available on the **All customers** page. <br>
These can be accessed by navigating to **Accounts receivable > Customers > All customers** and selecting the customer.

### Data entities

- EDI Customers
- Party postal address V2, staging field SAB_EDISTORECODE
- EDI Documents - Customers
