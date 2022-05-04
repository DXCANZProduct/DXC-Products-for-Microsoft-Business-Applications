---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL - FAQ]
author: [jdutoit2]
manager: Kym Parker
ms.date: 25/11/2021
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
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Frequently asked questions

## Generic EDI queries

See [EDI Core FAQ](../../CORE/OTHER/FAQ.md) for generic queries

## Fixing Staging-to-Target EDI errors
The following table describes a few staging errors that could be experienced with 3PL inbound documents at the staging to target step. Short description of possible fixes are discussed. After fix, reset status on the staging record and either manually process again or leave for batch to process.

> Note: % contains staging data for the record

### Picking list registration

Error	message                                       | Method to fix        
:--                                                 |:--                
Item %, dimensions: % Physical on-hand %=Available % cannot be picked because only % is/are available from the inventory  | Adjust D365 on-hand if staging record correct
Picking list % is in status Completed               | The D365 picking list registration has already been completed. Verify if duplication and either fix record's picking route id or cancel staging record if duplication.
Unable to locate an activated picking list line (Route Id - %, Lot - %, Item - %, Quantity - %, Size - %, Colour - %', Style - %, Configuration - %, Inventory status - %)  | Inbound document's line details don't match to picking list, compare staging details mentioned in the error. 
Picking list route % is in status Completed         | Staging's **Picking route** has already been completed. Verify if duplication. If 3PL is shipping the remainder of a previous pick list, a new D365 picking list needs to be posted and used in staging record. When a picking list registration is received all the quantities not shipped are cancelled and thus a D365 picking route can't be used for multiple shipments.
Posting	Sending document	Advanced shipping notice	Export to staging completed.  | Info message that the sales order's customer is setup to receive Advanced shipping notices (ASN) via EDI, and processing the 3PL's picking list registration has created the ASN staging record.
Shortpicked line - Item % Lot %     | Dependent on [validation](../SETUP/VALIDATION-PROFILES/Picking-list-registration.md)'s Error tolerance for **Short pick**


### Shipment receipt - Purchase order

Error	message                                       | Method to fix        
:--                                                 |:--                
Receipt list % does not exist for purchase order %  | The EDI record's purchase order and receipt combination doesn't match to D365. Verify and fix staging record.
Delivered batch Id %. Expected batch Id %           | Dependent on [validation](../SETUP/VALIDATION-PROFILES/Shipment-receipt---Purchase-order.md)'s Error tolerance for **Batch id update**
Line % Lot %	Product dimensions do not match source  | Staging record line's product dimensions don't match the original source D365 transaction that created the shipment advice. Verify and fix staging if required.
Posting - Journal	Journal: %	Line number: %	Item %	Cannot find location for item % at warehouse %. | Either fix staging's **Location** or add location in D365 for the 3PL's warehouse.
Posting - Journal	Journal: %	Line number: %	Item %	Inventory dimension Inventory status must be specified. | Inventory status is required for the transaction and hasn't been specified in the staging record. Edit staging record's **Inventory status** for the applicable line.


### Shipment receipt - Transfer order

Error	message                                       | Method to fix        
:--                                                 |:--          
Transfer order % does not exist                     | Staging record's **Transfer number** can't be found in D365. Fix staging record.
Line does not exist     | Staging record's **Transfer number** and **Lot Id** doesn't exist in D365 transfer orders. Verify and fix staging record.


### Shipment receipt - Return order

Error	message                                       | Method to fix        
:--                                                 |:--                
Return order % does not exist   | Verify if RMA number (ReturnItemNum) is correct in staging    
Line does not exist             | Verify if Lot ID (InventTransId) is correct in staging
Line % Lot %	Product dimensions do not match source  | Staging record line's product dimensions don't match the original source D365 transaction that created the shipment advice. Verify and fix staging if required.
Line quantity exceeds return amount | Either increase staging record line's **Quantity** or increase the D365 return order's **Return quantity**
Posting - Journal	Journal: %	Line number: %	Item %	Cannot find location for item % at warehouse %. | Either fix staging's **Location** or add location in D365 for the 3PL's warehouse.
Posting - Journal	Journal: %	Line number: %	Item %	Inventory dimension Inventory status must be specified. | Inventory status is required for the transaction and hasn't been specified in the staging record. Edit staging record's **Inventory status** for the applicable line.
Posting - Journal	Journal: %	Line number: %	Item %	The quantity that you have entered exceeds the quantity that it is possible to return.  | Verify if D365 Return order or Staging quantity is correct.


### Shipment receipt - Voyage

Error	message                                       | Method to fix        
:--                                                 |:--                 
Line does not exist             | Verify if **Lot ID** is correct in staging
Line % Lot %	Product dimensions do not match source | Staging record line's product dimensions don't match the original source D365 transaction that created the shipment advice. Verify and fix staging if required.
Line item number does not match | Staging record's **Item number** doesn't match to source transaction. Verify and fix staging record if required.
Shipment % does not exist       | Verify if **Voyage** is correct in staging       


### Inventory adjustment - Transfer

Error	message                                       | Method to fix        
:--                                                 |:--                
Batch Id % not found for item %                     | Verify if batch correct. If 3PL can create new batches, assign document setting to trading partner that allows creating new D365 batches. If staging incorrect, edit staging's **Batch number**.
Invalid inventory dimensions                        | Inventory dimension(s) specified in staging record is invalid. Verify and either fix staging record, or update D365.
Inventory Status % does not exist.                  | Verify and map staging's **Inventory status** to a D365 value in the [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) assigned to the trading partner.
Item not found: %                                   | Can't find staging's **Item number**. Verify which is correct, and either fix staging or D365
Line % Lot %	Product dimensions do not match source  | Staging record line's product dimensions don't match the original source D365 transaction that created the shipment advice. Verify and fix staging if required.
Location % does not exist in warehouse %.           | Verify staging's **Location** and either fix staging or add to D365
Blocking status cannot be set for Transfer transactions.  | Staging's **Inventory status to** is flagged as a blocking status, and transfer journal is thus not allowed.
No inventory journal setup in document settings profile   | Assign a transfer journal in **Journal name** on the [document setting profile](../SETUP/SETTING-PROFILES/Inventory-adjustment-advice---Transfer.md)
Posting - Journal	Journal: %	Line number: %	Item number: %	From inventory dimensions and To inventory dimensions must be different.  | Issue with staging as the **From batch number** and **To batch number** doesn't differ. Verify and fix staging.
Posting - Journal	Journal: %	Line number: %	Item number: %	Physical on-hand	Site=%,Warehouse=%,Batch number=%	% cannot be picked because only % is/are available from the inventory for item: %.  | Not enough on hand stock for required movement journal line, either fix staging or D365.
Posting - Journal	Journal: %	Line number: %	Item %	Inventory dimension Inventory status must be specified. | Inventory status is required for the transaction and hasn't been specified in the staging record. Edit staging record's **Inventory status** for the applicable line.


### Inventory adjustment - Counting

Error	message                                       | Method to fix        
:--                                                 |:--     
Batch Id % not found for item %                     | Verify if batch correct. If 3PL can create new batches, assign document setting to trading partner that allows creating new D365 batches. If staging incorrect, edit staging's **Batch number**.
Invalid inventory dimensions                        | Inventory dimension(s) specified in staging record is invalid. Verify and either fix staging record, or update D365.
Inventory Status % does not exist.                  | Verify and map staging's **Inventory status** to a D365 value in the [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) assigned to the trading partner.
Item not found: %                                   | Can't find staging's **Item number**. Verify which is correct, and either fix staging or D365
Location % does not exist in warehouse %.           | Verify staging's **Location** and either fix staging or add to D365


### Inventory adjustment - Reconciliation

Error	message                                       | Method to fix        
:--                                                 |:--     
Batch Id % not found for item %                     | Verify if batch correct. If 3PL can create new batches, assign document setting to trading partner that allows creating new D365 batches. If staging incorrect, edit staging's **Batch number**.
Invalid inventory dimensions                        | Inventory dimension(s) specified in staging record is invalid. Verify and either fix staging record, or update D365
Inventory Status % does not exist.                  | Verify and map staging's **Inventory status** to a D365 value in the [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) assigned to the trading partner.
Item not found: %                                   | Can't find staging's **Item number**. Verify which is correct, and either fix staging or D365
Location % does not exist in warehouse %.           | Verify staging's **Location** and either fix staging or add to D365


### Inventory adjustment - Movement

Error	message                                       | Method to fix        
:--                                                 |:--     
Batch Id % not found for item %                     | Verify if batch correct. If 3PL can create new batches, assign document setting to trading partner that allows creating new D365 batches. If staging incorrect, edit staging's **Batch number**.
Invalid inventory dimensions                        | Inventory dimension(s) specified in staging record is invalid. Verify and either fix staging record, or update D365
Inventory Status % does not exist.                  | Verify and map staging's **Inventory status** to a D365 value in the [Inventory status Id mapping](../SETUP/3PL-SETUP/Inventory-status-Id-mapping.md) assigned to the trading partner.
Item not found: %                                   | Can't find staging's **Item number**. Verify which is correct, and either fix staging or D365
Location % does not exist in warehouse %.           | Verify staging's **Location** and either fix staging or add to D365
Posting - Journal	Journal: %	Line number: %	Item number: %	Physical on-hand	Site=%,Warehouse=%,Location=%,Inventory status=%	% cannot be picked because only % is/are available from the inventory for item: %.  | Not enough on hand stock for required movement journal line, either fix staging or D365.

