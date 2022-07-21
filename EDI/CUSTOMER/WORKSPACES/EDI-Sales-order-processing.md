---
# required metadata

title: EDI Customer
description: EDI Customer workspaces - EDI Sales order processing
author: jdutoit2
manager: Kym Parker
ms.date: 2022-06-28
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

# Workspaces

## EDI Sales order processing

The EDI sales order processing workspace provides a quick and easy way to view the status of all EDI sales orders. <br>
Users can also obtain outbound customer transactions that are setup for the trading partner, but **Sent to EDI** is set to _No_. <br>
Users can access the **EDI Sales order processing workspace** by navigating to **EDI > Customer workspaces > EDI Sales order processing**. <br> 
The workspace is also used for manually approving Customer purchase order changes where the **Processing method** is set to _Manual_.

The following subsections will discuss the various tabs available on the workspace.

### Warning/Error
Sales order warnings and errors are identified based on the validation profiles setup for the Customer purchase order document at **EDI > Setup > Document types** and assigned to the incoming document when setting up the customer trading partner.
> Note: For further information relating to validation refer to the [validation setup](../SETUP/Validation-profiles.md) and [validation processing](../DOCUMENTS/Customer-purchase-order.md#step-3---staging-to-target) sections.

> Note: If a sales order has both errors and warning validations, it will be displayed in the error list only.

In addition, from within the workspace it is possible to view and even process information relating to the selected records
Field	            | Description
:--               |:--
**Log**           | Select the **Log** button to view the validation errors that have occurred for the order. 
**Validate**      | Select the **Validate** button to check validation rules for a sales order. 

### Pending PO changes
Customer purchase order changes that are set to be processed manually (**Processing method** on [Document setting profile](../SETUP/SETTING-PROFILES/Customer-purchase-order-change.md) is set to _Manual_), will be available here for manual approval. Whether a POA is required can be set via the Customer purchase order change’s Document setting **Don’t send POA for changes**.

Field	            | Description
:--               |:--
**Approve**       | Approve the Customer purchase order change EDI record. The applicable sales order will be updated with all the changes. If a Purchase order acknowledgement is required, an **Accept** POA staging record will be created as well.
**Reject**        | Reject the Customer purchase order change EDI record. The applicable sales order will not be updated with any of the changes. If a Purchase order acknowledgement is required, a **Reject** staging record will be created as well. The Reject POA will contain the Sales order as-is, with a POA header response of Reject.

### Pending POA
EDI orders will be placed on hold when a purchase order acknowledgement (POA) is required for the customer. 
> Note: Where a POA is required for a Customer, the Customer purchase order acknowledgment document must be setup on the Trading partner record and the **Lock order** field in the [POA document settings profile](../SETUP/SETTING-PROFILES/Customer-purchase-order-acknowledgement.md) must be active. This hold will be released once the POA has been sent to the Customer.

From within the workspace it is possible to view and even process information relating to the selected records

Field	                | Description
:--                   |:--
**Acknowledgement**   |	Select the **Acknowledgement** button to review order details for the POA.
**Send to EDI**       | Select the **Send to EDI** button to create Customer purchase order acknowledgment staging table record.

### Pending POA confirm
EDI orders will be placed on hold when a Purchase order confirmation must be received from the customer following receipt of a POA. 
Note: Purchase order confirmation requirements are setup via **PO confirmation required** field on the Customer [POA document settings profiles](../SETUP/SETTING-PROFILES/Customer-purchase-order-acknowledgement.md).

### Open consignment notes
Open consignments will be available where the [Customer advanced shipping notice document setting profile](../SETUP/SETTING-PROFILES/Customer-advanced-shipping-notice.md)'s **ASN strategy** is set to _consolidated_ packing slips. Where this is the case, a consolidated consignment should be sent at the end of each day to coincide with the dispatch of the goods.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create an ASN staging table record and update the record as Sent to EDI = Yes
**Reset flag**    |	Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include** |	Ability to exclude/include records from open list

### Open invoice
**Open invoice** can be used in scenarios where an EDI customer has sales invoices posted but not yet sent to EDI (staging record created) and has the **Sales invoice** document enabled on the trading partner.

Filters           | Description
:--               |:--
**Sent to EDI**   |	•	No (default)- Display records that haven’t been sent to EDI <br> •	Yes – Display records that have been sent to EDI
**Excluded**      |	•	No (default) – Display record that hasn’t been marked as excluded from open list <br> •	Yes – Display records that has been marked as excluded from open list


Buttons	          | Description
:--               |:--
**Send to EDI**   |	Select the **Send to EDI** button to create a Sales invoice staging table record and update the record as Sent to EDI = Yes
**Reset flag**    |	Select the **Reset flag** to update **Sent to EDI** to _No_
**Exclude / Include** |	Ability to exclude/include records from open list
