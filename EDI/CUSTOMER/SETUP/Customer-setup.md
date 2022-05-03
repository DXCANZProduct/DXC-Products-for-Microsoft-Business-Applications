---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setup]
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

# Customer setup
This section provides a short overview of the required prequisites for setting up EDI for Customers. <br>

## Trading partner
The Trading partner fields are used to describe how the prequisites setups are allocated to an EDI customer. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners** <br>

Customer Trading Partner Setup - Quick Summary:
**Setup** 	                      | **Short description**                 | **Setup path**
:-------------------------------- |:------------------------------------- |:-------------------------------------
<ins>**Options**</ins>		        |   |
**Connection profile**            |	Ability to override the default EDI connection profile on Trading partner level. If blank, default EDI connection will be used. Default EDI connection is determined by: <br> • Outgoing documents: Connection profile setup on [EDI > Setup > EDI parameters](../../CORE/Setup/EDI-parameters.md) <br> • Incoming documents: All active connection incoming paths as setup in [Connections](../../CORE/Setup/Connection-setup.md). | [EDI > Setup > Connection setup](../../CORE/Setup/Connection-setup.md)
**Cleanup profile**	              | Ability to override the default Cleanup profile (setup on Shared EDI parameters) on Trading partner level. If blank, default Cleanup profile will be used as setup on [EDI > Setup > EDI shared parameters](../../CORE/Setup/EDI-shared-parameters.md) | [EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile.md)
**Customer EDI order types**      |	Order type identifiers. Determines if the Customer purchase order record will create a Sales order, Agreement, or Release order  |	[EDI > Customer setup > Customer EDI order type group](CUSTOMER-SETUP/Purchase-order-types.md)
**Order purpose**                 |	Order purpose identifiers. Determines if the order is original, confirmation, change or cancellation     | 	[EDI > Customer setup > Order purpose group](CUSTOMER-SETUP/Order-purpose-group.md)
**Order line change type group**  |	Order line change type identifiers. Determines the update tolerance for each EDI order change type       | [EDI > Customer setup > Order line change type group](CUSTOMER-SETUP/Order-line-change-type-group.md)
**POA response code group**       |	Status of information used in Purchase order acknowledgement	                                           | [EDI > Customer setup > POA response code group](CUSTOMER-SETUP/POA-response-code-group.md)
**No backorders**                 |	Identify if the trading partner accepts backorders.                                                      | Y/N
**UOM**                           |	Unit of measure mappings for in- and outbound documents	                                                 | [EDI > Setup > UOM mapping](../../CORE/Setup/UOM-mapping.md)
<ins>**Outgoing documents**</ins> |	It brings the document template, mappings, settings profile together to enable the document for the trading partner <br>
**EDI Document type**             |	Each applicable outbound document type	                                                                 | [EDI > Setup > Document types](../../CORE/Setup/Document-types.md)
**Template**                      |	Document type template		                                                                               | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File-templates.md)
**Setting profile**               |	Settings profile		                                                                                     | [Setting profiles on EDI > Setup > Document types](Setting-profiles.md)
**File name setup**               |	Outbound file name		                                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document-types.md)
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection-setup.md) on document level. If blank, the trading partner’s Connection profile will be used. |	[EDI > Setup > Connection setup](../../CORE/Setup/Connection-setup.md)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup-profile.md) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI-shared-parameters.md) will be used.  |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile.md)
**Acknowledgement**	              | An Inbound Functional Acknowledgement is required from the trading partner for the outgoing document. Note: Also required to setup the Functional acknowledgement inbound document under Incoming documents.  |	Y/N
**Enabled**                       | Ability to enable/disable document type for Trading partner	| Y/N
<ins>**Incoming documents**</ins> |	It brings the document template, mappings, settings profile, validation and filename mask together to enable the document for the trading partner
**EDI Document type**             |	Each applicable inbound document type	                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document-types.md)
**Template**                      |	Document type templates defined for the document type                                                    | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File-templates.md)
**Setting profile**               |	Settings profiles defined for the document type                                                          | [Setting profiles on EDI > Setup > Document types](Setting-profiles.md)
**Validation profile**            | Validation profiles defined for the document type		                                                     | [EDI > Setup > Document types](Validation-profiles.md)
**Search mask**                   |	A file mask is used to match files in the document type’s defined directories	
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection-setup.md) on document level. If blank, the trading partner’s Connection profile will be used.   | [EDI > Setup > Document types](../../CORE/Setup/Connection-setup.md)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup-profile.md) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI-shared-parameters.md) will be used. |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile.md)
**Acknowledgement**	              | Trading partner requires an Outbound Functional Acknowledgement for the incoming document. Note: Also required to setup the Functional acknowledgement outbound document under Outgoing documents.  | Y/N
**Enabled**                       |	Ability to enable/disable document type for Trading partner	                                              | Y/N

## Order hold codes
During the sales process for EDI orders, there are times when a sales order must be placed on hold. When a sales order is placed on hold, an order hold code is assigned to the sales order to indicate the reason for the hold. <br>
The following Customer setup is required on EDI parameters. <br>
Users can access the form by navigating to tab **Hold codes** on **EDI > Setup > EDI parameters**.

**Setup** 	                      | **Short description**                 | **Setup path**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Validation error hold code**    |	Specify the hold code to be used for validation errors                      |[ Sales and marketing > Setup > Sales orders > Order hold codes](CUSTOMER-SETUP/Hold-codes.md)
**POA pending hold code**         |	Specify the hold code to be used for orders that require a POA must be sent | [Sales and marketing > Setup > Sales orders > Order hold codes](CUSTOMER-SETUP/Hold-codes.md)
**POC pending hold code**         |	Specify the hold code to be used for orders that require a PO confirmation (POC) must be received | [Sales and marketing > Setup > Sales orders > Order hold codes](CUSTOMER-SETUP/Hold-codes.md)

## Item pack sizes
Where the **System pack** and **System inner** is used to confirm pack sizes on the **Customer purchase order acknowledgement**, the following is required on each item:
1. Unit conversion between Inner unit and Outer unit
2. Inner unit
3. Outer unit

See [Setup item pack sizes](../../CORE/Setup/Item-pack-sizes.md) for more details.

## ASN line configuration
Where advanced shipping notice (ASN) will be sent to EDI customers it is required to assign [ASN line configuration](../SETUP/Warehouses.md#asn-line-configurations)  on the 'Ship from' warehouses. Determines what information will be used when creating the ASN: 
