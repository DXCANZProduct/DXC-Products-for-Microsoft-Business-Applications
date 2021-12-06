---
# required metadata

title: [EDI Customer]
description: [Overview of the Customer EDI module process]
author: [jdutoit2]
manager: Kym Parker
ms.date: 6/12/2021
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
The **Customer purchase order acknowledgement** can be used to accept or change the details within the for a sales order created via EDI. <br>
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
- [**EDI > EDI Document maintenance**](../../CORE/WORKSPACES/EDI%20Document%20maintenance%20workspace.md) - The workspace contains a tile and tab for each document type.

Users can use **Show log** and **Version log** to review the issues. And after the issue has been fixed, reset the status of the record. The next processing batch will pick up the _Not started_ status record.

### Fixing Staging-to-Target EDI errors 
See [FAQ](../OTHER/FAQ.md#fixing-staging-to-target-edi-errors) for example errors and possible method(s) of fixing.
