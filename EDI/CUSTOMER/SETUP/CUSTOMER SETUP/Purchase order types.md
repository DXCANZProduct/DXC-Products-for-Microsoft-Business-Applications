---
# required metadata

title: [EDI Customer]
description: [EDI Customer setup - Purchase order types]
author: [jdutoit2]
manager: Kym Parker
ms.date: 23/09/2021
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
## Setup purchase order types

Users can access the form by navigating to **EDI > Setup > Customer setup > Customer EDI order type group**

EDI purchase orders can be received from trading partners with many order types.  The type identifier received can change the way the order is processed within D365. <br>
> Note: Fields flagged with \* has been deprecated from **Customer EDI order type group**. Backwards compatibility option (EDI parameters > Allow historic PO types) allows companies to show these deprecated options in Customer EDI order type group. These \* options have been moved to **Order purpose group**

- Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order type group
-	In the **Description** field, enter a description of the order type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order Type**. Options are: <br>
    -	**Order** - When receiving a Purchase Order from a customer used to identify a "normal" order using these characters. Creates a standalone D365 sales order.
    -	\* **Confirmation** - When receiving a Purchase Order Confirmation (POC) from a customer used to identify a "confirmation". Confirms an existing D365 sales order. Usually receive in response to a Purchase Order Acknowledgement (POA) sent to the customer.
    -	**Agreement** - When receiving a Purchase Order from a customer used to identify a "blanket" order. Creates a D365 sales agreement.
    -	**Release order** - When receiving a Purchase Order from a customer used to identify a "release" order. Creates a D365 release order against a D365 sales agreement. Customer purchase order document setting 'Create release order without a blanket order' provides options No, Yes, Warning in cases where a release order is recieved without a matching D365 sales agreement.
    -	\* **Cancellation** - Specifies the sales order cancellation indicator. Cancels the D365 sales order or agreement.
-	Specify the **indicator**/Customer's value used to identify the EDI order type.

Examples: <br>
**Order type** 	                  | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Order**                         |	**SA** - Stand Alone Order <br> **KN** - Purchase Order	| **220** - Order 
**Agreement**                     |	**KA** - Agreement <br> **KB** - Blanket Purchase Agreement | **221** - Blanket order
**Release order**                 |	**RL** - Release or Delivery Order	  | **226** - Call off order

## Data entities:
- Customer EDI order type group
- Customer EDI order type lines

