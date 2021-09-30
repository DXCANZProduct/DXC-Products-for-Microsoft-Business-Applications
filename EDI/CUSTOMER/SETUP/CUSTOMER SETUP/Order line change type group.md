---
# required metadata

title: [EDI Customer]
description: [EDI Customer setup - Order line change type group]
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
## Setup order line change type group

Users can access the form by navigating to **EDI > Setup > Customer setup > Order line change type group**

Order line change type codes are used to identify the type of line change received from the customer in the Customer purchase order change document.
Manual Processing method overrides below update tolerances. It is still required to setup the line change types for manual processed customers in order to map the Customer’s line change type to D365 line change type, and this determines what can be changed/added.

-	Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order line change type group
-	In the **Description** field, enter a description of the order line change type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Specify the **Order line change type**
-	Specify the **indicator**/Customer's value for the line change type in EDI order change type
-	In the **Update tolerance** field, select if the order line change type can update the existing D365 Sales order with the Automatic processing method. The update tolerance is bypassed for Processing method Manual. Options:
    - **Approve**: If all the line changes received are approved, the sales order will be updated.
    - **Approve with warning log**: If all the line changes received are approved, the sales order will be updated. Warning log created on EDI staging record.
    - **Reject with warning log**: If any of the line changes received are Reject, the sales order will not be updated. The Staging record will error, but change can still be viewed via Changes on the Sales order header – EDI ribbon.

The Order line change types are:
Examples: <br>
**Order type** 	                  | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Order**                         |	**SA** - Stand Alone Order <br> **KN** - Purchase Order	| **220** - Order 
**Agreement**                     |	**KA** - Agreement <br> **KB** - Blanket Purchase Agreement | **221** - Blanket order
**Release order**                 |	**RL** - Release or Delivery Order	  | **226** - Call off order

## Where used
Customer EDI order type group is assigned on the Customer Trading partner's Options field called **Customer EDI order types**.

## Data entities:
- Customer EDI order type group
- Customer EDI order type lines

