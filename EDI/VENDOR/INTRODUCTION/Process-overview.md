---
# required metadata

title: EDI Vendor
description: Overview of the Vendor EDI module process
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-10
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
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Process Overview

## Purchase order, acknowledgement and confirmation process overview
The following image displays the process of sending the purchase order (PO) to the EDI vendor, and if required, receiving a purchase order acknowledgement (POA) and sending a purchase order confirmation. <br>

### Purchase order (PO)
When an Vendor EDI Trading partner has **Vendor purchase order** or **Vendor purchase order change** document(s) enabled, confirming the purchase order will create an original or change (after original) outbound staging records to the vendor.

### Purchase order acknowledgement (POA)
PO setting **Acknowledgement required** determines if a POA is required which affects the Purchase order's **Status** and **Acknowledgement required**.
If a purchase order acknowledgement (POA) is received, the validation's error tolerance determines if the D365 purchase order is updated.
If any of the validations error, the staging record will error.
For info and warning validations, the staging record will process to target and update the D365 purchase order where applicable.
Where the POA contains a **Header - Accept** response, the rest of the POA details are ignored as all has been accepted.

### Purchase order confirmation (POC)
POA document setting **Purchase order confirmation required** determines if a purchase order confirmation (POC) is required after receiving a POA, and if it will be sent automatically or manually by user.

If the confirmation details doesn't match the POA, for example didn't accept the price change, a purchase order change with purpose **Change** will be created to the vendor.

If the confirmation details does match the POA, a purchase order change with purpose **Confirmation** will be created to the vendor.
When the purpose is **Confirmation**, the following purchase order header fields are updated:
- **Status** will change to _Confirmed_ (if previously set to _In external review)_ and 
- **Acknowledgement required** will change to _Confirmation sent_


![alt text](../IMAGE/Vendor_PO_POA_POC_process.png "Vendor EDI process for order, acknowledgement and confirmation")

## Advanced shipping notice (ASN) and Purchase invoice process overview

### Advanced shipping notice (ASN)
Based on document settings, the incoming EDI ASN can either:
- Basic warehousing (Ship to warehouse is setup for basic warehousing):
    - Create arrival journal, but leave unposted
    - Create and post arrival journal
    - Create and post arrival journal, and post the product receipt for the registered stock
- Advanced warehousing (Ship to warehouse is setup for advanced warehousing):
    - Create an open load

### Purchase invoice
Based on document settings, the incoming EDI purchase invoice can either:
- Create a pending purchase order invoice where the match status fails
- Post the purchase order invoice if match status passes, or
- Submit pending purchase order invoice to workflow

## Purchase order
The processed EDI record(s) can be viewed for a purchase order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Purchase order page.<br>
The EDI module have also enhanced the purchase order page by adding EDI fields to:
- Purchase order header; available on the **EDI** FastTab
- Purchase order lines; available on **EDI** and **EDI acknowledgement** tabs

## Document errors
When an incoming staging record/document errors, it has not created/updated the target D365 transaction. <br>
When an outgoing staging record/document errors, it has not created the Outbound file. <br>

Staging/document errors can be viewed at: <br>
- **EDI > Documents** - On each document type, user can set filter **Staging to target status** to _Error_
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace.md) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.

### Fixing Staging-to-Target EDI errors 
See [FAQ](FAQ.md#fixing-staging-to-target-edi-errors) for example errors and possible method(s) of fixing.
