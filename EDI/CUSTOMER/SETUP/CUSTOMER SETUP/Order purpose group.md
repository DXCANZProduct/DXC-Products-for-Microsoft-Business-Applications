---
# required metadata

title: [EDI Customer]
description: [EDI Customer setup - Order purpose group]
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
## Setup order purpose groups

Users can access the form by navigating to **EDI > Setup > Customer setup > Order purpose group**

EDI purchase orders can be received from trading partners with many order purposes.  The type identifier received can change the way the order is processed within D365.
-	Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order purpose group
-	In the **Description** field, enter a description of the order purpose group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order purpose code**. Options are:
    -	**Original** - Indicates this the first/original order or agreement. Applies to document type **Customer purchase order**. 
    -	**Change** - Specifies the sales order change indicator. Applies to document type **Customer purchase order change**.
    -	**Cancellation** - Specifies the sales order cancellation indicator. Applies to document type **Customer purchase order** and **Customer purchase order change**.
    -	**Confirmation** - When receiving a Purchase Order Confirmation (POC) from a customer used to identify a "confirmation". Applies to document type **Customer purchase order**.
-	Specify the **indicator**/customer's value used to identify the **EDI order purpose**

Examples: <br>
**Order purpose** 	              | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Original**                      |	00	                                  | 9
**Change**                        |	04                                    | 4
**Cancellation**                  |	01	                                  | 1
**Confirmation**                  |	06	                                  | 6

## Where used
Order purpose group is assigned on the [Customer Trading partner's](../Trading%20partner.md) Options field called **Order purpose**.

## Data entities:
-	Customer EDI order purpose group
-	Customer EDI order purpose lines
