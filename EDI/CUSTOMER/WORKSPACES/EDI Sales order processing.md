---
# required metadata

title: [EDI Customer]
description: [EDI Customer workspaces - EDI Sales order processing]
author: [jdutoit2]
manager: Kym Parker
ms.date: 5/11/2021
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

## EDI Sales order processing

The EDI sales order processing workspace provides a quick and easy way to view the status of all EDI sales orders. <br>
Users can access the **EDI Sales order processing workspace** by navigating to **EDI > Customer workspaces > EDI Sales order processing**. <br> 
The workspace is also used for manually approving Customer purchase order changes where the **Processing method** is set to _Manual_.

The following subsections will discuss the various tabs available on the workspace.

### Warning/Error
Sales order warnings and errors are identified based on the validation profiles setup for the Customer purchase order document at **EDI > Setup > Document types**. <br> 
The validation is assigned to the incoming document when setting up the customer trading partner.
> Note: For further information relating to validation refer to the [validation setup](../SETUP/Validation%20profiles.md) and [validation processing](../DOCUMENTS/Customer%20purchase%20order.md#step-3---staging-to-target) sections.

> Note: If a sales order has both errors and warning validations, it will be displayed in the error list only.

In addition, from within the workspace it is possible to view and even process information relating to the selected records
Field	            | Description
:--               |:--
**Log**           | Select the **Log** button to view the validation errors that have occurred for the order. 
**Validate**      | Select the **Validate** button to check validation rules for a sales order. 

### Pending PO changes
Customer purchase order changes that are set to be processed manually (**Processing method** on Document setting profile is set to _Manual_), will be available here for manual approval. Whether a POA is required can be set via the Customer purchase order change’s Document setting **Don’t send POA for changes**.

Field	            | Description
:--               |:--
**Approve**       | Approve the Customer purchase order change EDI record. The applicable sales order will be updated with all the changes. If a Purchase order acknowledgement is required, an **Accept** POA staging record will be created as well.
**Reject**        | Reject the Customer purchase order change EDI record. The applicable sales order will not be updated with any of the changes. If a Purchase order acknowledgement is required, a **Reject** staging record will be created as well. The Reject POA will contain the Sales order as-is, with a POA header response of Reject.

### Pending POA
EDI orders will be placed on hold when a purchase order acknowledgement (POA) is required for the customer. 
> Note: Where a POA is required for a Customer, the Customer purchase order acknowledgment document must be setup on the Trading partner record and the **Lock order** field in the POA settings profile must be active. This hold will be released once the POA has been sent to the Customer.

From within the workspace it is possible to view and even process information relating to the selected records

Field	                | Description
:--                   |:--
**Acknowledgement**   |	Select the **Acknowledgement** button to review order details for the POA.
**Send to EDI**       | Select the **Send to EDI** button to create Customer purchase order acknowledgment staging table record.

### Pending POA confirm
EDI orders will be placed on hold when a Purchase order confirmation must be received from the customer following receipt of a POA. 
Note: Purchase order confirmation requirements are setup via **PO confirmation required** field on the Customer purchase order acknowledgement settings profiles.

### Open consignment notes
Open consignments will be available where the Customer advanced shippiong notice's setting profile's **ASN strategy** is set to _consolidated_ packing slips. Where this is the case, a consolidated consignment should be sent at the end of each day to coincide with the dispatch of the goods.

Field	            | Description
:--               |:--
**Send to EDI**   | Select the **Send to EDI** button to create a Customer advanced shipping notice staging table record for the consignment.

