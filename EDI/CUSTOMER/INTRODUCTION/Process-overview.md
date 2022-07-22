---
# required metadata

title: EDI Customer
description: Overview of the Customer EDI module process
author: jdutoit2
manager: Kym Parker
ms.date: 2021-12-06
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
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Process Overview

## Documents
### Purchase order and Purchase order change
#### Original (new) orders
EDI customers setup for inbound **Customer purchase order** can send purchase order files creating either of the following in D365:
- Sales order
- Sales agreement
- Release order

The created sales order can be put on hold if certain validation (like unit price) is outside allowed variances. <br>
The sales order can also be put on hold if a Purchase order acknowledgement or Purchase order confirmation is required.

#### Change
EDI customers setup for inbound **Customer purchase order change** can make changes to existing D365 sales orders created via EDI, if within the allowed parameters. 

#### Cancellation
EDI customers can also cancel the order by using the **Cancellation** order purpose and using either document **Customer purchase order** or **Customer purchase order change**

#### Confirmation
EDI customers can use **Customer purchase order** document with an order purpose of **Confirmation** to confirm the **Customer purchase order acknowledgement** they received.

### Purchase order acknowledgement
The **Customer purchase order acknowledgement** can be used to accept or change the details for a sales order created via EDI. <br>
It can be manually processed or setup as a periodic job for allowed scenarios.

### Advanced shipping notice (ASN)
Packing slip details for a sales order can be sent to EDI customers setup with **Customer advanced shipping notice**.
If the packing slip is automatically posted via EDI 3PL picking list registration, the document will also be generated.

### Sales invoice
Sales invoice details can be sent to EDI customers setup with **Sales invoice**. <br>
Where a customer can't process credit notes received via EDI, these can be disabled via document settings.

## Sales order
The processed EDI record(s) can be viewed for a sales order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Sales order page.<br>
The EDI module have also enhanced the sales order page by adding EDI fields to:
- Sales order header; available on the **EDI** FastTab
- Sales order lines; available on **EDI** and **POA response** tabs

## Document errors
When an incoming staging record/document errors, it has not created/updated the target D365 transaction. <br>
When an outgoing staging record/document errors, it has not created the Outbound file. <br>

Staging/document errors can be viewed at: <br>
- **EDI > Documents** - On each document type, user can set filter **Staging to target status** to _Error_
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace.md) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.

### Fixing Staging-to-Target EDI errors 
See [FAQ](FAQ.md#fixing-staging-to-target-edi-errors) for example errors and possible method(s) of fixing.
