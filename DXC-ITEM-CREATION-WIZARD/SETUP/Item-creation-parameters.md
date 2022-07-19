---
# required metadata

title: DXC Item Creation Wizard  
description: Introduction to DXC Item Creation Wizard - Setting Parameter  
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCICParameters 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Item creation parameters 

The Item creation parameters form is used to manage the item status behaviour and ensure that all products receive a status.  
You can reach the parameters form by navigating to **Item creation > Setup > Item creation parameters**

## General

|  **Field**  | **Description** | 
|:---|:---|     
|  **Delete product dimension value with a variant**  | What should happen when a product dimension value with an existing variant is deleted |   

## Item status

|  **Field**  | **Description** | 
|:---|:---|     
|  **Status control enabled**  | Controls the allowed transaction types as configured on the [item status](ITEM-SETUP/Item-Status.md). When enabled, only allowed transactions for items with the item status can occur. If this is disabled all transaction will be available regardless of item status configuration  | 
|  **Default item status**  | Item status value applied to new items created without using an item creation template |  

Note: The *Default item status* will be setup at the item level.
