---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor - FAQ]
author: [jdutoit2]
manager: Kym Parker
ms.date: 16/11/2021
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
The following table describes a few of the staging errors that could be experienced with vendor inbound documents at the staging to target step. Short description of possible fixes are discussed. After fix, reset status on the staging record and either manually process again or leave for batch to process.

> Note: % contains staging data for the record

### Vendor purchase order acknowledgement

Error	message             | Method to fix
:--                       |:--
Cannot find purchase order line for item: % | Staging's **Item number**, based on document setting profile's **Item id source**, doesn't match purchase order line. Check if **Item id source** is correct. Either assign a different document setting profile to trading partner or fix staging's item number.
EDI purchase % does not exist               | Staging's **Purchase order** doesn't exist in D365. Fix staging's **Purchase order**

### Vendor advanced shipping notice

Error	message             | Method to fix
:--                       |:--
Purchase order % is no longer confirmed | Confirm the D365 purchase order
Insufficient open deliver remainder in purchase order lines for item %  | If quantity is acceptable: increase the purchase order line's deliver remainder or over delivery %
Cannot find purchase order line for item: % | Review staging's **Line number** and **Purchase order** to D365
Posting - Journal	Journal: %	Line number: %	Item % Inventory dimension Serial number is inactive and may consequently not be specified. | Serial number specified for an item not setup for serial number tracking
Receipt list Serial number %. Expected Serial number %. | Staging's serial number doesn't match purchase order's serial number. Dependent on what level is allowed on the validation for serial number

### Purchase invoice

Error	message            | Method to fix
:--                      |:--
Cannot find purchase order %  | Staging record's **Purchase order** doesn't match D365. Fix staging
Cannot find purchase order line for item: % | Staging record's **Line number** and **Item number** doesn't match D365. Fix staging, or assign a different document setting if **Item id source** incorrect.
EDI trading partner's vendor account % does not match to purchase order's invoice account % | Depending on validation, is a different Vendor account in staging record allowed to Purchase order's invoice account.
Invoice % was already used on date %. | Invoice duplication is not allowed according to Accounts payable parameters. Review if duplication and cancel staging if applicable, or fix staging if invoice number incorrect.
Misc charge/allowance indicator must be 'Allowance' or 'Charge' | Staging record contains header charges, but the **Misc charge/allowance indicator** doesn't indicate if it is an allowance or charge which affects if the amount is used as-is or is converted to a negative. Review if staging record's indicator is mapped in [Misc charge/allowance indicator](../SETUP/VENDOR-SETUP/Misc-charge-allowance-indicator.md)
No mapping found for misc method of handling %  | Staging record's **Misc method of handling** isn't found in [Misc method of handling](../SETUP/VENDOR-SETUP/Misc-method-of-handling.md). Add to mapping if correct, else fix staging record.
The inventory quantity to match for product receipt % item % cannot be reserved.  | The staging record's invoice quantity doesn't match to the product receipt quantity
Unit conversion from % to % does not exist. | The staging record's unit doesn't match to purchase order's unit and therefor requires the item's unit conversion to be applied. EDI can't find the applicable unit conversion.
Vendor % does not exist.  | Staging record's **Vendor account** doesn't exist in D365. Fix staging record.
