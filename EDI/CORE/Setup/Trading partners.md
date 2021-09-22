---
# required metadata

title: [EDI Core]
description: [EDI Core - Setup Trading partners]
author: [jdutoi2]
manager: Kym Parker
ms.date: 22/09/2021
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

# Setup Trading partners

Users can access the form by navigating to **EDI > Setup > Trading partners**

EDI works on the basis that an external entity (trading partner) wants to send or receive information from us. To this end, the module is built to link the documents and their associated settings to those entities (trading partners). <br>
A trading partner can be created based on an existing D365 entity like a warehouse, vendor or a customer. Depending on the various modules installed, different trading partner types will be available for setup.

The Trading partner provides a centralized location to manage all trading partners.
- To create a new record, select **New**
- Select the trading partner **Type**. Available options depends on licensing and enabled features.
- Select the Trading partner **Company**
-	Select the **Account number**. Only account numbers that are not assigned to the specified trading partner type are available.
-	Enter the **Trading partner GLN**. This value will be used in the Import-to-staging step to create the incoming staging against the correct Trading partner GLN and should thus be provided in the Inbound file.
-	Select **Create**, then complete the remaining setup for the trading partner.

## Prerequisites ##
* Module setup/Mappings. This will be assigned to the Trading partner where their value doesn't match to D365 value.
* Document types. Template, setting profile , outbound filenames for each applicable document type will be assigned to the Trading partner.

## Trading partner list

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Trading partner GLN**           |	The GLN we know the trading partner as. <br> This field denotes the trading partner GLN. The module will use this field as a match to <br> - Customer trading partner: Customer account <br> -	Warehouse/3PL trading partner: Warehouse <br> -	Vendor trading partner: Vendor <br> - Freight forwarder landed cost: vendor account with Voyages' **Shipment type** set to _Shipping company_.
**Company**                       |	The D365 company this trading partner relates to 
**Type**	                        | The type of trading partner (i.e. Customer, Warehouse, Vendor, Freight forwarder landed cost)
**Trading partner account**       |	The primary identifier of the trading partner (i.e. Customer account, Warehouse number or Vendor account)
**Name**                          |	The trading partner account's name
**Company GLN**                   |	The GLN the trading partner knows ‘us’ as. This field denotes the trading ID - GLN (Global Location Number) - of your company to be sent on documents to this trading partner.

> Note: Selecting the trading partner GLN will display the detailed form relating to the trading partner
> It also provides the setup for trading partner level options as well as defining which incoming and outgoing document types are enabled for the trading partner.
