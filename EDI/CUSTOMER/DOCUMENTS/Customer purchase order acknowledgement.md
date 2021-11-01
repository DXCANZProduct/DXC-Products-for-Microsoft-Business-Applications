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
**Acknowledgement**     |	Select the **Acknowledgement** button to review order details for the POA. The details of this page will be discussed in XXX
**Send to EDI**         |	Select the **Send to EDI** button to create the **Customer purchase order acknowledgement** staging table record.
**Reset flag**          |	Select the **Reset flag** button to reset the **EDI status** to allow for re-sending of the POA to the staging table. Note: The POA record on the staging table should be deleted manually before the sales order flag is reset.

## Processing
The POA can be sent manually or automatically via the EDI periodic job **Send customer purhase order acknowledgement**.
Both of these options will be discussed in the following subsections.

