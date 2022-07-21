---
# required metadata

title: EDI Customer
description: EDI Customer - FAQ
author: jdutoit2
manager: Kym Parker
ms.date: 2021-07-20
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Frequently asked questions

## Generic EDI queries

See [EDI Core FAQ](../../FAQ.md) for generic queries

## Fixing Staging-to-Target EDI errors
The following table describes a few staging errors that could be experienced with customer inbound documents at the staging to target step. Short description of possible fixes are discussed. After fix, reset status on the staging record and either manually process again or leave for batch to process.

> Note: % contains staging data for the record

### Customer purchase order

Error	message           | Method to fix
:--                     |:--
Could not find address for store code %	  | Navigate to **EDI > Setup > Trading partner**, filter to applicable customer and add/update address with store code
Field 'Agreement classification' must be filled in    | Navigate to **EDI > Setup > Document types**. Select document **Customer purchase order** and the applicable Settings profile used for the staging record (assigned to Trading partner). Select the applicable **Agreement classification**.
Inventory dimension Site is mandatory and must consequently be specified    |	Setup default site or warehouse on the customer or if no default, original EDI file needs to include these details.
The entered receipt date % is not valid because it is before today  | Edit 'Requested receipt date' to an appropriate date for the staging record at **EDI > Documents > Customer documents > Customer purchase order**
Item not found: %	| Dependent on **Item Id source** in the Setting profile and assigned to Trading partner’s Incoming document, EDI couldn’t find the applicable D365 item number. Either fix staging or setup on the Item.
Sales Agreement for customer %, purchase number % not found	  | Received a Release order referring to Sales agreement that could not be found for the Customer. <br> 1. If sales agreement is not required, update document setting **Create release order without blanket order** to _Yes_. <br> 2. Create/import D365 sales agreement or <br> 3. Fix **Customer requisition** on existing sales agreement (if D365 incorrect)
Missing ASN line configuration on warehouse: %	| Delivery note has posted, but no ASN created. Assign applicable **ASN line configuration** on the 3PL warehouse at **Inventory management > Setup > Inventory breakdown > Warehouses**
Duplicate line number % | The staging record contains duplicate data in field **Line number**. Fix numbering.
Invalid order type      | The order type can't be found in the **Customer EDI order types** mapping assigned to the customer trading partner. If order type is correct, add to the applicable [Customer EDI order type group](../SETUP/CUSTOMER-SETUP/Purchase-order-types.md) or fix the staging record to the correct order type.
Purchase order % already exists on sales order %  | Customer requisition duplication. Review **Duplicate tolerance** on document setting profile assigned to the trading partner. If accept on flagged orders, set the **Bypass duplicate check** to _Yes_ on the existing D365 sales order.

### Customer purchase order change

Error	message           | Method to fix
:--                     |:--
Change line not found for % | Staging field **EDI order change type**'s value can't be found in [Order line change type group](../SETUP/CUSTOMER-SETUP/Order-line-change-type-group.md) assigned to the trading partner. Add to the mapping if correct, or fix staging.
Order purpose 'Original' not valid for change document | Order purpose 'Original' can only be imported using document **Customer purchase order**. Not allowed for **Customer purchase order change**. Fix settings in order for document to be imported under correct document (example filename mask on Trading partner, or the connection setup filepath).
Price is outside of tolerance (Price = %, agreed price = %) | The unit price change is outside the allowed variance as set in the [document setting profile](../SETUP/SETTING-PROFILES/Customer-purchase-order-change.md).
Sales order for PO % and customer % doesn't exist.  | EDI can't find the D365 based on staging field **Customer requisition**. Either the sales order hasn't been created or the values don't match to D365. Fix staging or D365 sales order.

