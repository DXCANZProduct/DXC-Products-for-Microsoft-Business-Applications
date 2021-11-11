---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor setup - POA responde code group]
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

# Vendor setup
## Setup POA responde codes

Users can access the form by navigating to **EDI > Setup > Vendorr setup > POA response code group**

POA Response codes are used to identify the status of information used in a Purchase Order Acknowledgement (POA) for each vendor.
- Click **New** to create a new record. 
- In the **Name** field, enter the name of the POA response code group
- In the **Description** field, enter a description of the POA response code group
- In the **Mappings** FastTab, select **Add** to create a new record
- Specify the vendor's value for **POA code** that will be used for each response code. The POA response codes are:

**Response code** 	              | **Description**                       | **Applicable to**       | **Example**
:-------------------------------- |:------------------------------------- |:----------------------- |:------------------------
<ins>**Header response codes**</ins>
**Header – accept**               |	Order accepted	                      | POAVendCode / POA code  | A
**Header – accepted with reserve**|	Order accepted with reserve	          | POAVendCode / POA code  | AR
**Header – change**               |	Header: any change to Delivery Window <br> Line: any change to Quantity, Price or Pack Size    | POAVendCode / POA code  | C	
**Header – not accepted**         |	Order not accepted	                  | POAVendCode / POA code  | NA
<ins>**Line response codes**</ins>
**Line price – accept**           |	Item price accepted                   |	POAVendCodeItem / POA code item      | PO
**Line price – advise**           |	Advise of a price difference	      | POAVendCodeItem / POA code item      | PA
**Line item – accept**            |	Item quantity accepted	              | POAVendCodeItem / POA code item      | IA
**Line item – out of stock**      |	Advise of stock shortage	          | POAVendCodeItem / POA code item      | IS
**Line item – withdrawn**         |	Advise item is no longer available	  | POAVendCodeItem / POA code item      | LW
**Line shipment – partial**       |	Advise of partial shipment	          | POAVendCodeShipment / POA code shipment     | SP
**Line shipment – full**          |	Advise of full shipment               |	POAVendCodeShipment / POA code shipment     | SF
**Line item – pack accept**       |	Item pack accepted	                  | POAVendCodeItem / POA code item      | LPA
**Line item – pack difference**   |	Advise of pack difference	          | POAVendCodeItem / POA code item      | PD
**Line item – inner accept**      |	Item inner accepted	                  | POAVendCodeItem / POA code item      | LIA
**Line item – inner difference**  |	Advise of inner difference	          | POAVendCodeItem / POA code item      | ID

## Where used
POA response code group is assigned on the [Vendor Trading partner's](../Trading%20partner.md) Options field called **POA responde code group**. <br>
Used on fields **POAVendCode**, **POAVendCodeItem** and **POAVendCodeShipment** on EDI documents:
- Vendor purchase order acknowledgement

## Data entities:
- Vendor EDI POA response code group
- Vendor EDI POA response code group lines
