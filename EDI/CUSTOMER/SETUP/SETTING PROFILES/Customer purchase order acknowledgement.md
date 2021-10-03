---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setup - Document type Setting profiles - Customer purchase order acknowledgement]
author: [jdutoit2]
manager: Kym Parker
ms.date: 1/10/2021
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

# Customer document type setting profiles - Purchase order acknowledgement (POA)

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Customer purchase order acknowledgement**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Purchase Order**</ins>
**Lock Order**      |	Specify if the order should be locked once a Purchase order acknowledgement (POA) has been sent. Also affects the POA status and if record will be included in **Send customer purchase order acknowledgement** periodic task	| •	**Yes** – Order is locked with **POA pending hold code** and **POA status = Pending** (included in **Send customer purchase order acknowledgement** periodic task) <br> •	**No** – Order isn’t locked with POA pending hold code and **POA status = Blank** (not included in Send customer purchase order acknowledgement periodic task)
**Safety level if POA sent**  |	Specify the level to which the sales order should be locked once the POA has been sent	| •	**None** – Sales order can be edited when a POA has been sent <br> •	**Warning** – a warning will be received if a sales order is edited after the POA has been sent <br> •	**Locked** – Sales order cannot be edited once the POA has been sent
**PO confirmation required**  |	If POA has been sent and a POC is required in return	| •	**Yes** – Sales order cannot be actioned until POC has been received. The sales order locked with **POC pending hold code**. **POA status = Confirm pending** until confirmation is received <br> •	**No** – Sales order can be actioned without receiving a POC
<ins>**Acknowledgement**</ins>
**Quantity type**	  | Specify if the customer or system reserved quantity is used	    | •	**Customer quantity** – Acknowledge customer qty <br> •	**Reserved quantity** – Acknowledge D365 reserved qty. If reserving is set to manual, the stock needs to be reserved first, or auto reserving setup depending on Business rules.
**Packaging size – inner/outer**  |	Specify if the inner or outer pack quantity is sent by the customer	| Inner / Outer
**Pack type**       |	Specify if the customer or system pack should be used as the default	| This option will be used to automatically set the **acknowledged pack quantity**.
**Inner type**      |	Specify if the customer or system inner should be used as the default	| This option will be used to automatically set the **acknowledged inner quantity**.
**Field delimiter** |	Specify the field delimiter to use for the POA response codes. Line item status is a combination of the following: Price code + Qty code + Pack code + Inner Code. The field delimiter is used inbetween the codes.
<ins>**Response codes**</ins> | Ability to default the POA response codes sent to Customer on the POA. <br> For **None** a blank POA response code needs to be set up with Allow auto send set to Yes. <br> **Auto-triggered** option uses automatic POA response codes as calculated by **Auto set response codes**
**Header acknowledgement default**  |	Specify the default header acknowledgement response code	| •	Auto-triggered (default) <br> •	None <br> •	Header – accept <br> •	Header – accepted with reserve <br> •	Header – change <br> •	Header – not accepted
**Line item status price default**	| Specify the default line item status price acknowledgement response code	| •	Auto-triggered (default) <br> •	None <br> •	Line price – accept <br> •	Line price – advise
**Line item status quantity default** |	Specify the default line item status quantity acknowledgement response code	| •	Auto-triggered (default) <br> •	None <br> •	Line item – accept <br> •	Line item – out of stock <br> •	Line item – withdrawn
**Line item status pack default**     |	Specify the default line item status pack acknowledgement response code	    | •	Auto-triggered (default) <br> •	None <br> •	Line item – pack accept <br> •	Line item – pack difference
**Line item status inner default**    |	Specify the default line item status inner acknowledgement response code	  | •	Auto-triggered (default) <br> •	None <br> •	Line item – inner accept <br> •	Line item – inner difference
**Line shipment status default**      |	Specify the default line shipment status acknowledgement response code	    | •	Auto-triggered (default) <br> •	None <br> •	Line shipment – full <br> •	Line shipment – partial

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Customer purchase order acknowledgement** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - POA
