---
# required metadata

title: [EDI 3PL]
description: [EDI 3PL Setup - Document type Setting profiles - Picking list registration]
author: [jdutoit2]
manager: Kym Parker
ms.date: 18/11/2021
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
