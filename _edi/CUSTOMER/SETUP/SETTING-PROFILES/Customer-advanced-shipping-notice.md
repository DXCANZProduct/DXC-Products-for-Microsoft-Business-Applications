---
# required metadata

title: EDI Customer
description: EDI Customer Setting profiles - Customer advanced shipping notice
author: jdutoit2
manager: Kym Parker
ms.date: 2023-07-13
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable, SAB_EDITradingPartner
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconEDICustomerDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer document type setting profiles - Advanced shipping notice (ASN)

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Customer advanced shipping notice**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Options**</ins>  | |
**ASN strategy**    |	Select to send ASN based on delivery note or consignment note number	| •	**Single packing slip** – Send one ASN per packing slip <br> •	**Consolidated packing slip** – Send one ASN per consignment note (combination of one or more ASN)
**Warn when consignment note not assigned** |	Option to warn user when Posting packing slip and Send to EDI is enabled but Consignment note is blank	| •	**Yes** – Receive warning ‘You are about to post the document without a Consignment note number assigned. The EDI advanced shipping notice will not be sent. Select OK to continue.' <br> •	**No** – No warning will be provided.
**Auto assign consignment note number**  |  Ability to auto generate consignment numbers for **Single** and **Consolidated** packing slips. Where Shipping carrier is set to auto generate consignment numbers, the Shipping carrier's **Pro number sequence** will still be used. This new document setting option applies to sales orders where no shipping carrier is assigned, or the shipping carrier doesn't auto generate consignment notes. <br> Where the document setting's ASN strategy is set to **Consolidated** packing slips and Auto assign consignment note number is set to _Yes_, the packing slip will automatically be assigned to latest open (not sent to EDI) consignment that matches the packing slip (for example shipping carrier, customer, address). If an open consignment note is not found, a new consignment note will be created and the packing slip assigned. <br> Users can still manually create and assign consignment note numbers as well.     | •	**Yes** – Where applicable, the EDI parameters **Consignment note number** number sequence will be used to create the new Consignment note. And for Consolidated packing slips, the packing slip will be automatically assigned to latest open (not sent to EDI) consignment that matches the packing slip.  <br> •	**No** – Consignment note numbers are manually assigned 
**Send only for EDI orders**  | Option to only create an ASN staging record where the sales order was created via EDI. <br> Only applies to customers that have this document type enabled.  |  •	**Yes** – ASN staging record will only be created when the sales order was created via EDI <br> •	**No** – ASN staging record will be created for all sales orders.
<ins>**Shipment Type**</ins>	  | |
**Part Shipment**   |	Specify the part shipment identifiers for ASN. Populates ShipmentStatus.	  | Example: PS
**Final Shipment**  |	Specify the final shipment identifiers for ASN.	Populates ShipmentStatus.   | Example: FS
<ins>**Dates**</ins>  | |
**Scheduled delivery date source**  |	Select which delivery date to use in the ASN	              | •	Header <br> •	Lines
**Scheduled delivery date strategy**  |	Where multiple sources are identified, select the use the earliest or latest date	| •	Earliest <br> •	Latest

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Customer advanced shipping notice** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - ASN

