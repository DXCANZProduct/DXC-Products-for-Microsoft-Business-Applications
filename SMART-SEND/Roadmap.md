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

Coming Soon




#### Build 10.0.41.2024xxxxx

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
18765	    | Field Label states "Blog Container Name" instead of "Blob Container Name"| Corrected spelling for Blob Container field.
18979	    | Error "Unable to update metadata of the uploaded file" | When the Packing List is issued for a shipment "/n" was passed as part of the address string, which signifies a new line.  This string is considered invalid by the blob storage client and has been removed from the metadata being passed to the blob storage to prevent errors.

<ins>New features</ins>
