---
# required metadata

title: [EDI Customer]
description: [EDI Customer setup - POA responde code group]
author: [jdutoit2]
manager: Kym Parker
ms.date: 30/09/2021
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

# Customer setup
## Setup POA responde codes

Users can access the form by navigating to **EDI > Setup > Customer setup > POA response code group**

POA Response codes are used to identify the status of information used in a Purchase Order Acknowledgement (POA) for each customer.
- Click **New** to create a new record. 
- In the **Name** field, enter the name of the POA response code group
- In the **Description** field, enter a description of the POA response code group
- In the **Mappings** FastTab, select **Add** to create a new record
- Specify the **POA code** to be used for each response code. The POA response codes are:

**Response code** 	              | **Description**                       | **Example**
:-------------------------------- |:------------------------------------- |:-------------------------------------
<ins>**Header response codes**</ins>
**Header – accept**               |	Order accepted	                      | A
**Header – accepted with reserve**|	Order accepted with reserve	          | AR
**Header – change**               |	Change to the Order header's dates    | C	
**Header – not accepted**         |	Order not accepted	                  | NA
<ins>**Line response codes**</ins>
**Line price – accept**           |	Item price accepted                   |	PO
**Line price – advise**           |	Advise of a price difference	        | PA
**Line item – accept**            |	Item quantity accepted	              | IA
**Line item – out of stock**      |	Advise of stock shortage	            | IS
**Line item – withdrawn**         |	Advise item is no longer available	  | LW
**Line shipment – partial**       |	Advise of partial shipment	          | SP
**Line shipment – full**          |	Advise of full shipment               |	SF
**Line item – pack accept**       |	Item pack accepted	                  | LPA
**Line item – pack difference**   |	Advise of pack difference	            | PD
**Line item – inner accept**      |	Item inner accepted	                  | LIA
**Line item – inner difference**  |	Advise of inner difference	          | ID

- In the **Allow auto trigger** field, select if the POA response can be triggered by **Auto set response codes**. <br> The following response codes can only be manually triggered and thus their Allow auto trigger is set to No and disabled:
    - Header – not accepted
    - Line item – withdrawn
- In the **Allow auto send** field, select if the POA response should be included in the periodic task **Send customer purchase order acknowledgement**

## Where used
POA response code group is assigned on the Customer Trading partner's Options field called **POA responde code group**.

## Scenarios
The following section decribes how the EDI module sets the POA auto response code. <br>
This applicable to Response codes where **Allow auto trigger** is set to Yes.

### Line price
- Line price - accept: The sales order line's unit price = Customer's EDI purchase order's unit price
- Line price - advise: The sales order line's unit price <> Customer's EDI purchase order's unit price.

### Line item quantity
- Line item - accept: Acknowledged quantity = Customer's EDI purchase order's quantity.
- Line item - out of stock: 
- line item - withdrawn: Can't be auto triggered.

## Data entities:
- POA response code group
- POA response code group lines
