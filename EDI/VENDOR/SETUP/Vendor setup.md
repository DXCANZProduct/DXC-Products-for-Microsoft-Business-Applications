---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor Setup]
author: [jdutoit2]
manager: Kym Parker
ms.date: 9/11/2021
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

# Vendor setup
This section provides a short overview of the required prequisites for setting up EDI for Vendors. <br>

## Trading partner
The Trading partner fields are used to describe how the prequisites setups are allocated to an EDI vendor. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners** <br>

Vendor Trading Partner Setup - Quick Summary:
**Setup** 	                      | **Short description**                 | **Setup path**
:-------------------------------- |:------------------------------------- |:-------------------------------------
<ins>**Options**</ins>		
**Connection profile**            |	Ability to override the default EDI connection profile on Trading partner level. If blank, default EDI connection will be used. Default EDI connection is determined by: <br> • Outgoing documents: Connection profile setup on [EDI > Setup > EDI parameters](../../CORE/Setup/EDI%20parameters.md) <br> • Incoming documents: All active connection incoming paths as setup in [Connections](../../CORE/Setup/Connection%20setup.md). | [EDI > Setup > Connection setup](../../CORE/Setup/Connection%20setup.md)
**Cleanup profile**	              | Ability to override the default Cleanup profile (setup on Shared EDI parameters) on Trading partner level. If blank, default Cleanup profile will be used as setup on [EDI > Setup > EDI shared parameters](../../CORE/Setup/EDI%20shared%20parameters.md) | [EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup%20profile.md)
<ins>**Order**</ins>	
**Order type**                    |	Order type identifiers. Indicates if the order is a purchase order, agreement or release order.  | [EDI > Vendor setup > Order type group](VENDOR%20SETUP/Order%20type%20group.md)
**Order purpose**                 |	Order purpose identifiers. Indicates if the order is original, confirmation, change or cancellation.	  | [EDI > Vendor setup > Order purpose group]()
**Order line change type**        |	Order line change type identifiers. Indicates type of change to the order line, example 'Add additional item', 'Delete items' or 'Changes to line items'.	  | [EDI > Vendor setup > Order line change type group]()
**Carrier mode**                  |	Carrier mode mappings. Ability to send the trading partner's mapped value	per D365 Mode.         | [EDI > Vendor setup > Carrier mode]()
**Charges code**                  |	Charges code mappings. Ability to send the trading partner's mapped value	per D365 Charges code.      | [EDI > Vendor setup > Charges code]()
**Payment terms type**            |	Payment terms mappings. Ability to send the trading partner's mapped value	per D365 Terms of payment.	              | [EDI > Vendor setup > Payment terms type group]()
**Misc. charge/allowance indicator**  |	Misc. charge/allowance mappings. Indicates if the header charge is an allowance (charge < 0), charge (charge > 0) or no allowance or charge (charge = 0).	  | [EDI > Vendor setup > Misc charge/allowance indicator]()
**Misc. method of handling**      |	Misc. method of handling mappings. Indicates if the header charge received on the purchase invoice needs to be added to the D365 invoice.	    | [EDI > Vendor setup > Misc method of handling]()
<ins>**Acknowledgement**</ins>	
**POA response code group**       |	Status of information used in Purchase order acknowledgement	| [EDI > Setup > Vendor setup > POA response code group]()
**UOM**                           |	Unit of measure mappings for in- and outbound documents	                                                 | [EDI > Setup > UOM mapping](../../CORE/Setup/UOM%20mapping.md)
<ins>**Outgoing documents**</ins> |	It brings the document template, mappings, settings profile together to enable the document for the trading partner <br>
**EDI Document type**             |	Each applicable outbound document type	                                                                 | [EDI > Setup > Document types](../../CORE/Setup/Document%20types.md)
**Template**                      |	Document type template		                                                                               | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File%20templates.md)
**Setting profile**               |	Settings profile		                                                                                     | [Setting profiles on EDI > Setup > Document types](Setting%20profiles.md)
**File name setup**               |	Outbound file name		                                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document%20types.md)
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection%20setup.md) on document level. If blank, the trading partner’s Connection profile will be used. |	[EDI > Setup > Connection setup](../../CORE/Setup/Connection%20setup.md)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup%20profile.md) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI%20shared%20parameters.md) will be used.  |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup%20profile.md)
**Acknowledgement**	              | An Inbound Functional Acknowledgement is required from the trading partner for the outgoing document. Note: Also required to setup the Functional acknowledgement inbound document under Incoming documents.  |	Y/N
**Enabled**                       | Ability to enable/disable document type for Trading partner	| Y/N
<ins>**Incoming documents**</ins> |	It brings the document template, mappings, settings profile, validation and filename mask together to enable the document for the trading partner
**EDI Document type**             |	Each applicable inbound document type	                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document%20types.md)
**Template**                      |	Document type templates defined for the document type                                                    | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File%20templates.md)
**Setting profile**               |	Settings profiles defined for the document type                                                          | [Setting profiles on EDI > Setup > Document types](Setting%20profiles.md)
**Validation profile**            | Validation profiles defined for the document type		                                                     | [EDI > Setup > Document types](../../CORE/Setup/Document%20types.md)
**Search mask**                   |	A file mask is used to match files in the document type’s defined directories	
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection%20setup.md) on document level. If blank, the trading partner’s Connection profile will be used.   | [EDI > Setup > Document types](../../CORE/Setup/Connection%20setup.md)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup%20profile.md) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI%20shared%20parameters.md) will be used. |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup%20profile.md)
**Acknowledgement**	              | Trading partner requires an Outbound Functional Acknowledgement for the incoming document. Note: Also required to setup the Functional acknowledgement outbound document under Outgoing documents.  | Y/N
**Enabled**                       |	Ability to enable/disable document type for Trading partner	                                              | Y/N

## Item pack sizes
Where the **System pack** and **System inner** is used to review pack sizes on the **Vendor purchase order acknowledgement**, the following is required on each item:
1. Unit conversion between Inner unit and Outer unit
2. Inner unit
3. Outer unit

See [Setup item pack sizes](../../CORE/Setup/Item%20pack%20sizes.md) for more details.
