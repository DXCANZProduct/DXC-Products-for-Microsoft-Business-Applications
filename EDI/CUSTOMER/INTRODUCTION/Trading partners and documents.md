---
# required metadata

title: [EDI Customer]
description: [Introduction to EDI Customer trading partners]
author: [jdutoit2]
manager: Kym Parker
ms.date: 29/07/2021
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

# Trading partners
This section will provide a quick overview of Trading partners and Documents available per EDI license

## Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- Inbound
	- Functional Acknowledgement – Receive functional acknowledgement that outbound document has been received by Trading partner.
- Outbound
	- Functional Acknowledgement – Send functional acknowledgement that inbound document has been received.

## Customer EDI documents (Customer license only)

EDI contains the following documents pertaining to Customer Trading partners.
- Inbound
	- Customer purchase order - Allows a customer to send a Purchase Order, which in turn creates a Sales Order in D365
	- Customer purchase order change - Allows a customer to send a change for an existing EDI Purchase Order, which in turn updates the applicable Sales Order in D365.
- Outbound
	- Customer purchase order acknowledgement (POA) - Allows D365 to send an Acknowledgement once a PO has been received and verified.
	- Customer advanced shipping notice (ASN) - Allows D365 to send delivery information to the customer with the packaging details.
	- Sales Invoice - Allows D365 to send a Tax Invoice document to the customer.

## Vendor EDI documents (Vendor license only)

EDI contains the following documents pertaining to Vendor Trading partners.
- Outbound
	- Vendor purchase order - Allows D365 to send a Purchase order document to the vendor.
	- Vendor purchase order change - Allows D365 to send changes to a Purchase order document to the vendor.
- Inbound
	- Vendor purchase order acknowledgement (POA) - Allows a vendor to send a purchase order acknowledgement for a purchase order, which in turn can update the purchase order in D365.
	- Vendor advanced shipping notice (ASN) - Allows a vendor to send an advanced shipping notice for one or multiple purchase orders, which in turn creates an arrival journal or creates a load for the purchase order. The arrival journal can be set to automatically post and have the option to automatically post the product receipt.
	- Purchase invoice – Allows a vendor to send a purchase invoice for one or multiple purchase orders, which in turns posts the invoice, creates a pending invoice where validation is not met, or submits to workflow.

## 3PL EDI documents (3PL license only)

EDI contains the following documents pertaining to 3PL Trading partners.
- Outbound
	- Picking List – Allows D365 to send picking list information to the 3PL, triggered by posting picking list in either:
		- Sales Order
		- Transfer Order
	- Shipment Advice – Allows D365 to send shipment advice to the 3PL advising them of stock arriving at the 3PL, trigger points for each document:
		- Purchase Order – Generate Receipt list
		- Transfer Order – Ship transfer order
		- Return Order – Send return order
		- Voyage (Landed cost) – Send to EDI
- Inbound
	- Picking list Registration – Allows a 3PL to send picking list registration which in turns posts the picking list registration in D365
		- Sales Order
		- Transfer Order
	- Shipment Receipt - Allows a 3PL to send shipment receipt information which in turns creates the Arrival journal for below in D365
		- Purchase Order
		- Transfer Order
		- Return Order
		- Voyage (Landed cost)
	- Inventory Adjustment – Allows a 3PL to send inventory adjustment information which in turns adjust the stock in D365
		- Transfer – Creates a transfer journal which can be set to automatically post
		- Counting – Creates a movement journal for the calculated variances, which can be set to automatically post
		- Reconciliation – Creates an inventory adjustment journal which creates a movement journal for the variances. Provides more control over reconciling all on-hand stock and accepting/rejecting specific lines.
		- Movement Creates a movement journal for the provided variances, which can be set to automatically post

## Freight forwarder Landed cost EDI documents (Freight forwarder license only)

EDI contains the following documents pertaining to Freight forwarder Landed cost Trading partners.
- Inbound
	- Voyage creator – Creates Landed cost voyage/s with relevant auto costs and tracking legs and update Purchase orders and/or Transfers orders with shipment details.
	- Voyage tracking – Updates tracking on Landed cost voyage

