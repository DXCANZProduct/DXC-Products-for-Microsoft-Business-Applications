---
# required metadata

title: DXC Item Creation Wizard 
description: DXC Item Creation Wizard -Setting up for Item Status  
author: helenho
manager: Kym Parker
ms.date: 2023-03-24
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCICStatusTable 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Item Status

The item status form is used to create statuses that can be applied to released products. For each status the allowed transaction types can be set. If a status is not enabled for a transaction type, a released product with the status will not be able to be added to the transaction. This can be used to prevent the creation of inventory transactions through purchase or sales orders if a product is completely configured, or to prevent more inventory being ordered after the product has been retired. You can reach the form by navigating to **Item creation > Setup > Item Setup > Item Status**

The restriction of transactions can be enabled/disabled from the [parameters](../Item-creation-parameters.md) form. 

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

For information on transitioning between items statuses see [Managing item statuses](../../PROCESSES/Managing-item-statuses.md).

|  **Field**  | **Description** | 
|:---|:---|     
|  **To status**  | Status value a released product can be updated to, based on the current status value. |

*Note: Attempting to update a status to a value that has not been defined as an allowed status transition will return an error preventing the action from being completed.*
