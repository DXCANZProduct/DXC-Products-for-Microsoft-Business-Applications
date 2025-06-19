---
# required metadata

title: Care Services
Description: DXC Care Services/Aged Care - Release notes
author: HelenHo
Manager: Pontus, Ek
ms.date: 2025-06-19
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Health, Care, Aged Care, Care Services
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-06-19
ms.dyn365.ops.version: 10.0.40
---
### Generate funding journal

**Path: Care services \> Funding \> Funding Claim form**

**OR**

**Care services \> Funding \> Generate funding journals**

1.  Select the relevant funding claim form.
2.  Validate the data on the funding claim form lines.
3.  Click on **\<Generate funding journal\>**
4.  Populate Transaction date.
5.  Click **\<OK\>**
6.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
7.  *Click on \<Recurrence\>*
8.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
9.  *Click \<OK\> to close the Recurrence form.*
10. *Click \<OK\> to add the job to the batch queue.*
11. The funding journal will be generated.
