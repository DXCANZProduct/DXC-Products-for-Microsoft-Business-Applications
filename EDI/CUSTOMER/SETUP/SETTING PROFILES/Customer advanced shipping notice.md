---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setting profiles - Customer advanced shipping notice]
author: [jdutoit2]
manager: Kym Parker
ms.date: 23/09/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
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

# Customer document type setting profiles - Advanced shipping notice (ASN)

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Customer advanced shipping notice**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Options**</ins>
**ASN strategy**    |	Select to send ASN based on delivery note or consignment note number	| •	**Single packing slip** – Send one ASN per packing slip <br> •	**Consolidated packing slip** – Send one ASN per consignment note (combination of one or more ASN)
**Warn when consignment note not assigned** |	Option to warn user when Posting packing slip and Send to EDI is enabled but Consignment note is blank	| •	**Yes** – Receive warning ‘You are about to post the document without a Consignment note number assigned. The EDI advanced shipping notice will not be sent. Select OK to continue.' <br> •	**No** – No warning will be provided.
<ins>**Shipment Type**</ins>	
**Part Shipment**   |	Specify the part shipment identifiers for ASN. Populates ShipmentStatus.	  | Example: PS
**Final Shipment**  |	Specify the final shipment identifiers for ASN.	Populates ShipmentStatus.   | Example: FS
<ins>**Dates**</ins>
**Scheduled delivery date source**  |	Select which delivery date to use in the ASN	              | •	Header <br> •	Lines
**Scheduled delivery date strategy**  |	Where multiple sources are identified, select the use the earliest or latest date	| •	Earliest <br> •	Latest

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Customer advanced shipping notice** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - ASN

