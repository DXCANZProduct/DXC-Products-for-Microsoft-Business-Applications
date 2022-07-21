---
# required metadata

title: EDI 3PL
description: EDI 3PL Setup - Document type Setting profiles - Picking list registration
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable, SAB_EDITradingPartner
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

# 3PL document type setting profiles - Picking list registration

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Picking list registration**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Picking list**</ins> |
**Batch Id update** | Where the batch id received is different to batch id in the original pick, select the validation type	| Pick list batch id = ABC123 <br> Pick list registration batch id – 123ABC <br> Options: <br> • **Allow** – Update allowed <br> • **Warning** - An infolog is displayed with a warning. It is possible to carry on processing <br> • **Error** - An infolog is displayed with an error. It is not possible to carry on processing until the error has been corrected.
**Line matching strategy**  | Determine strategy on finding matching picking list line	| • **Lot id** – Use Lot id to find matching line <br> • **Line number** – Use Picking list line number to find matching line. Lot id is not required in the file, but if provided it will use Lot id and Line number to find the matching line.
<ins>**Sales order**</ins>  |
**Post packing slip** |	When the pick list registration is received and processed, the packing slip can be automatically posted | • **No** – Only the picking list registration is posted. User will need to manually post the Sales order’s packing slip <br> • **Yes** – The picking list registration and Sales order’s packing slip will be posted. The Packing slip’s _Ship date_ will be set to Today’s date (as per user’s time zone). If you are licensed for Customer EDI and the Sales order’s Customer is setup to receive ASN, the **Customer advanced shipping notice** staging record will also automatically be created.
<ins>**Transfer order**</ins> |
**Ship transfer order** |	When the pick list registration is received and processed, the transfer order can be automatically shipped.	| • **No** – Only the picking list registration is posted. User will need to manually Ship transfer order <br> • **Yes** – The picking list registration is posted, and the Transfer order is automatically shipped. The posting date will be set to Today’s date (as per user’s time zone)

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Picking list registration** for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - Picking list registration
