---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Customer purchase order acknowledgement]
author: [jdutoit2]
manager: Kym Parker
ms.date: 1/11/2021
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

# Customer purchase order acknowledgement

EDI customers may require a purchase order acknowledgement (POA) for an order and can be one of the reasons a sales order is being put on hold. Where the [Customer purchase order acknowledgement document setting profile](../SETUP/SETTING%20PROFILES/Customer%20purchase%20order%20acknowledgement.md) **Lock order** is set to _Yes_, the sales order will be put on hold till the the POA has been sent. The Hold code that will be used is determined by the **POA pending hold code** assigned on **EDI > Setup > EDI parameters** tab **Hold codes**.

> Note: Customer purchase order acknowledgement (POA) can only be sent for a sales order created via EDI.

## Sales order
Users can access **All sales orders** page by navigating to **Sales and marketing > Orders > All sales orders** and manage the EDI order's Acknowledgement's details by using the below buttons that have been added to the **EDI** tab on the Action Pane.

Field	                  | Description
:--                     |:--
**Acknowledgement**     |	Select the **Acknowledgement** button to review order details for the POA. The details of this page will be discussed in below.
**Send to EDI**         |	Select the **Send to EDI** button to create the **Customer purchase order acknowledgement** staging table record.
**Reset flag**          |	Select the **Reset flag** button to reset the **EDI status** to allow for re-sending of the POA to the staging table. Note: The POA record on the staging table should be deleted manually before the sales order flag is reset.

## Processing
The POA can be sent [manually] or [automatically] to the customer.
Both of these options will be discussed in the following subsections.

### Manually processing Purchase order acknowledgement
The **Acknowledgement** page is accessed by navigating to **Sales and marketing > Orders > All sales orders**, and selecting **Acknowledgement** on the **EDI** tab on the Action Pane.

The Acknowledgement page is split into five tabs:
1. [Header](#header) - Manage the POA header's response for ship and receipt dates. 
3. [Line price]() - Manage the POA line' price response, example Customer's sales price vs. Net system price. 
4. [Line quantity]() - Manage the POA line' quantity response, example Customer sales quantity vs. Reserved sales quantity.
5. [Line pack]() - Manage the POA line' pack response, example Customer pack vs. System pack
6. [Line inner]() - Manage the POA line' inner response, example Customer inner vs. System inner

Customer mapped values for POA response codes are setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) and assigned to the Customer trading partner's **POA response code group**.

#### Header
##### Fields
Field	              | Description
:--                 |:--
<ins>**Delivery Date**</ins>
**Customer**        |	Customer requested ship date (start of delivery window)
**Acknowledged**    |	Acknowledged receipt date. Updates Sales order header's **Confirmed ship date**.
<ins>**Deadline**</ins>
**Customer**        |	Customer requested receipt date (end of delivery window)
**Acknowledged**    |	Acknowledged delivery date. Updates Sales order header's **Confirmed receipt date**.
<ins>**POA**</ins>
**POA code**        |	POA header code to be sent to the Customer. Displays the mapped value as setup in [POA response code group](../SETUP/CUSTOMER%20SETUP/POA%20response%20code%20group.md) for the following header respones: <br> •	**Header – accept** – Where all response codes are _Accept_ <br> •	**Header - change** - Where the customer and acknowledged dates are different <br> •	**Header - accepted with reserved** - Where the customer and acknowledged dates are the same, however one or more lines have an _Advise_ POA difference code.
**Auto triggered**  |	Indicates if the **POA code** was auto triggered

##### Buttons
It is possible to update the POA response codes by using the available buttons:
Field	              | Description
:--                 |:--
**Order POA**       |	Automatically set the response codes. <br> Note: When selected the response codes for all the tabs will be set.  Where auto generated codes are overwritten, the header code should be manually set.
**POA response**    |	Manually set the response code to either of the following: <br> • Change <br> • Accepted <br> • Not accepted - only available for manual selection <br> • Accepted with reserve. If the auto triggered POA code has been manually overridden using this button, the field **Auto triggered** will be set to _No_.


