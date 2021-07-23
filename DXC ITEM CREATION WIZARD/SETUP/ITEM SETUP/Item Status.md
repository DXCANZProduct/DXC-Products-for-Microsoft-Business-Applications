---
# required metadata

title: [DXC Item Creation Wizard ]
description: [DXC Item Creation Wizard -Setting up for Item Status  ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DXC Item Creation Wizard ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [helenho]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Item Status

The item status form is used to create statuses that can be applied to released products. For each status the allowed transaction types can be set. If a status is not enabled for a transaction type, a released product with the status will not be able to be added to the transaction. This can be used to prevent the creation of inventory transactions through purchase or sales orders if a product is completely configured, or to prevent more inventory being ordered after the product has been retired. You can reach the form by navigating to **Item creation > Setup > Item Setup > Item Status**

The restriction of transactions can be enabled/disabled from the [parameters](Item_creation_parameters.md) form. 

## Item status creation

The items status controls whether a product can be purchased, sales order (create a sales order), sales picking (create a pick list or output order) or sales return (allow sales returns).  

|  **Field**  | **Description** | 
|:---|:---|     
|  **Status**  | User defined, this should be easily recognised by the business users. |  
|  **Purchase order**  | Determines whether a product with this status can be added to a purchase order. |  
|  **Sales order**  | Determines whether a product with this status can be added to a sales order. |
|  **Sales picking**  | Determines whether a product with this status can be picked. |
|  **Sales delivery**  | Determines whether a product with this status can be delivered or invoiced. |
|  **Web sales**  |  |
|  **Sales return**  | Determines whether a product with this status can be purchased returned. |
|  **Status indicator**  | Select an icon which will appear with the status on the released product form. This will appear as a display field only.  |

## Allowed status transitions

Allowed status transitions prevent a change in status from the selected status to any value not listed in this form, allowing the organisation to control how the user changes the lifecycle of a product. This can be accessed from within the item status form by selecting **Allowed status transitions** from the action pane.

For information on transitioning between items statuses see [Managing item statuses](Managing_item_statuses).

|  **Field**  | **Description** | 
|:---|:---|     
|  **To status**  | Status value a released product can be updated to, based on the current status value. |

*Note: Attempting to update a status to a value that has not been defined as an allowe status transition will return an error preventing the action from being completed.*
