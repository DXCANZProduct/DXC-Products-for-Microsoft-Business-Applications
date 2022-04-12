---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor workspaces - EDI Purchase order processing]
author: [jdutoit2]
manager: Kym Parker
ms.date: 31/03/2022
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

# Workspaces

## EDI Purchase order processing

The EDI purchase order processing workspace provides a quick and easy way to view the pending actions for EDI purchase orders, as well as validation warning and errors for EDI incoming documents. <br>
Users can access the **EDI Purchase order processing workspace** by navigating to **EDI > Vendor workspaces > EDI Purchase order processing**. <br> 

The workspace is split into two tabs:
- Pending
    - Pending POA
    - Pending POA confirm
- Validation
    - Inbound staging records that has error or warning validation on their latest version log

The following subsections will discuss the various tabs available on the workspace.

### Pending
The following is available on the **Pending** tab as tiles and tabs.

#### Pending POA
Filters to D365 purchase orders where **Acknowledgement status** is set to _Acknowledgement pending_. <br>
> Note: Where a Purchase Order Acknowledgement is required for a Vendor:
> - Purchase order acknowledgement document must be setup on the Vendor Trading partner. 
> - Set **Vendor purchase order** document setting **Acknowledgement required** to _Yes_

This page is for information only, awaiting document from Vendor.

#### Pending POA confirm
Filters to D365 purchase orders where **Acknowledgement status** is set to _Confirmation pending_. <br>
> Note: Where a manual Purchase order confirmation is required for a Vendor:
> - Purchase order acknowledgement document must be setup on the Trading partner
> - Set **Vendor purchase order acknowledgement** document setting _Purchase order confirmation required_ to _Yes (PO is manual-confirmed)_ 

The **Acknowledgement status** will update once the purchase order confirmation has been sent to the Vendor. See [link](../DOCUMENTS/Vendor-purchase-order-acknowledgement.md#processing-purchase-order-confirmation-poc) for more details on how to send a confirmation to the vendor.

In addition, from within the workspace it is possible to view and even process information relating to the selected records. <br>
The following buttons are available in the Workspace and is similar to the buttons found to manually process the confirmation on the purchase order.

Field	              | Description
|:--                |:--
**Confirmation**    |	Select the **Confirmation** button to compare Vendor’s POA values to D365 Purchase order values. The confirmed values will default as per document settings but can be overridden on this form.
**Send to EDI**	    | Select the **Send to EDI** button to create Purchase Order Confirmation staging table record. This will also create another version in D365 Purchase order confirmation journal for the purchase order. If the updated order values don’t match to the Vendor’s POA, a purchase order change is created. An order purpose of Confirmation is sent when the order matches the Vendor’s POA.

### Validation
Warnings and errors are identified based on the validation profiles setup for the incoming vendor documents at **EDI > Setup > Document types** and assigned to the incoming document when setting up the vendor trading partner.

> Note: For further information relating to validation refer to the [validation setup](../SETUP/Validation-profiles.md). <br>
> If a document has both Errors and warnings, it will be displayed in the Error list only.

Documents in **Error** status will be managed in the [Document maintenance Workspace](../../CORE/Workspaces/EDI-Document-maintenance-workspace.md. <br> 

Field	            | Description
|:--                |:--
**Version log**     | View all log versions for the document. When a document’s status is reset and reprocessed a new log version is created.

### Open confirmation
**Open confirmation** can be used in scenarios where an EDI vendor has Purchase order confirmation posted but not yet sent to EDI (staging record created) and has the Vendor purchase order document enabled on the trading partner.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create a Vendor purchase order staging table record and update the record as Sent to EDI = Yes
**Reset flag**    |	Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include** |	Ability to exclude/include records from open list
