---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor Setup - Document type Setting profiles - Vendor purchase order change]
author: [jdutoit2]
manager: Kym Parker
ms.date: 9/11/2021
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

# Vendor document type setting profiles - Purchase order change

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Vendor purchase order change**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Purchase order**</ins> |
**Package size – inner/outer**  |	Specify if the inner or outer pack quantity is sent on the purchase order	  | •	Inner <br> •	Outer
**Form note**       |	Header note to send on all purchase orders to the vendor	| •	**Default** - uses Form notes from Procurement and sourcing > Purchase order <br> •	**EDI note** - EDI note becomes available <br> •	**Blank** - blank header note is sent
**EDI note**        |	Memo field	                              | Greyed out if **Form note** is not set to _EDI note_
<ins>**Acknowledgement**</ins>	|
**Acknowledgement required**  |	Specify if the order should receive a purchase order acknowledgement from the Vendor. Affects PO status and POA status. | • **Yes** - Purchase order **status** is updated to _In external review_ (similar to Vendor collaboration) when sending the purchase order to the Vendor (via clicking Confirm/Confirmation on PO), until an **Header - Accept** POA is received back from the Vendor OR updated Purchase order values match to vendor’s Purchase order acknowledgement. The **Acknowledgement status** on the purchase order header is set to _Acknowledgement pending_. <br> • **No** - Purchase order **status** is set to _Confirmed_ and the **Acknowledgement status** on the purchase order header is _blank_. Also see following [summary](Vendor-purchase-order-acknowledgement.md#acknowledgement-and-purchase-order-confirmation-required).

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Vendor purchase order change** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI settings - Vendor documents purchase order changes
