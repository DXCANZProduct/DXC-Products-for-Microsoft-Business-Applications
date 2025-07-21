---
# required metadata

title: Finance Utilities 
description: Electronic reporting - Save Electronic reporting file to secure location 
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-07-21
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  ERFormatDestination
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Electronic reporting
The features as described in the following subsections are available to control the additional functionality for exporting Electronic reporting files to a secure location.

## Prerequisites
Setup requirements are discussed in detail at:
1. Create the secure location in [Electronic reporting export connections](../../Setup/ELECTRONIC-REPORTING-EXPORT/Electronic-reporting-export-connections.md)
2. Assign to secure location created in step 1 to applicable [Document types](../../Setup/ELECTRONIC-REPORTING-EXPORT/Document-types.md)
3. Create the [Electronic reporting destination](../../Setup/ELECTRONIC-REPORTING-EXPORT/Electronic-reporting-destination.md) for the applicable Electronic reporting configuration and assign the Document type created in step 2


## Save electronic reporting file to secure location
Once the report is created using the Electronic reporting configuration, the file is archived to the secure location. <br>
A record is also created in **Electronic reporting archived jobs** if the Electronic reporting destination was set to save to archive.


