---
# required metadata

title: [EDI Freight forwarder]
description: [EDI Freight forwarder - FAQ]
author: [jdutoit2]
manager: Kym Parker
ms.date: 26/11/2021
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

# Frequently asked questions

## Generic EDI queries

See [EDI Core FAQ](../../CORE/OTHER/FAQ.md) for generic queries

## Fixing Staging-to-Target EDI errors
The following table describes a few staging errors that could be experienced with Freight forwarder inbound documents at the staging to target step. Short description of possible fixes are discussed. After fix, reset status on the staging record and either manually process again or leave for batch to process.

> Note: % contains staging data for the record

### Voyage creator
Error message	                                      | Error type	            | Error level       | Method to fix    
:--                                                 |:--                      |:--                |:--  
Duplicate shipment reference found on shipment: %	  | Duplicate	              | Warning or Error  | Can be _Warning_ or _Error_ level based on [document setting](../SETUP/SETTING%20PROFILES/Voyage%20creator.md) **Duplicate tolerance**. <br> • _Warning_ will create a new Voyage with same booking reference. <br> • _Error_ level will not create a voyage, review field **Booking reference** in staging record. 
Item not found: %	                                  | Error	                  | Error             | Based on [document setting](../SETUP/SETTING%20PROFILES/Voyage%20creator.md) Item id source, review field: <br> • **Bar code** where Item id source is set to _GTIN_ or _Barcode_. <br> • **Item number** where Item id source is set to _Our item number_ or _External item number_
No mapping found for Customs broker %	              | Missing mapping	        | Error             | Staging record field **Customs broker** contains a vendor not setup in the [Customs broker mapping](../SETUP/FF%20SETUP/Customs%20broker%20mapping.md) assigned to the Trading partner.
Over delivery not allowed on EDI line %	            | Error	                  | Error             | Staging record's quantity in the staging record's unit is more than remaining on the purchase or transfer order line and [document setting](../SETUP/SETTING%20PROFILES/Voyage%20creator.md) **Allow purchase order over delivery** or **Allow transfer order over delivery** doesn't allow overdelivery. Review quantity and unit and either increase purchase or transfer order line's open quantity that can still be added to a voyage or if overdeliveries are allowed, update the document setting to allow.
Shipment status % indicates shipment cannot be modified	| Error	              | Error             | 
Unable to find journal template for line: %	Record not found	Error
Unable to locate source document lines	Error	Error
A voyage hasn't been created, as no lines could be found. |	Processing error	| Error

### Voyage tracking
Error	message                                       | How to fix              | Method to fix
:--                                                 |:--                      |:--
