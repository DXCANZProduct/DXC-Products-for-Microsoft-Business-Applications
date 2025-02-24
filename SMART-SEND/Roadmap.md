---
# required metadata

title: Smart Send
description: Smart Send - Roadmap
author: pmusumeci
Manager: Pontus Ek
ms.date: 2023-07-27
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: pmusumeci
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: pmusumeci
ms.search.validFrom: 2023-07-27
ms.dyn365.ops.version: AX 7.0.1
---

# 	Roadmap 

This page describes the features planned for future releases.

> Note: Dates and features are subject to change.

## Roadmap

Coming Soon, currently in private preview 




#### Build 10.0.40.202410021

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
17452	    | Smart Send Architectural enhancements and optimization| As part of the architectural changes required to enable Smart Send to process forms in batch processing, outdated and inefficient methods were removed.  During this phase, the code structure was changed to simplify and enhance the overall performance of the product. Old, outdated methods were removed, and multiple-form outputs were consolidated to use a common structure. streamlining the procedure for upcoming upgrades and/or extensions 

<ins>New features</ins>

Number	  | Name	          | Description
:--       |:--              |:--
17451	    | Batch Process for Smart Send Forms| For Forms that contain a "Smart Send" button you can now enable the ability to process these forms via Batch. This feature can be controlled from the Email parameters screen.
21356	    | Incorporate Use of "Customer" Account | For Sales Order Invoices and Sales Order Confirmations Smart Send now incorporates the ability to use  the "customer" account number to find the matching purpose and not just the "Invoice" account.

 
