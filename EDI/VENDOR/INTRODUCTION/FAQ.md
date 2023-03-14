---
# required metadata

title: EDI Vendor
description: EDI Vendor - FAQ
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-16
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIDocumentWorkspace
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

# Frequently asked questions

## Generic EDI queries

See [EDI Core FAQ](../../FAQ.md) for generic queries

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
Vendor % does not exist.  | Staging record's **Vendor account** doesn't exist in D365. Fix staging record or add vendor to D365.
