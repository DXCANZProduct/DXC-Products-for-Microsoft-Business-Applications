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

### Generate funding claim form

**Path: Care services > Funding > Funding Claim form**

1.  Click on **<New funding claim form>**
2.  Select Billing account name.
3.  Click on **<Filter>**
4.  Specify the required criteria for generating the funding claim form (End date, client account)
5.  Click **<OK>**
6.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
7.  *Click on <Recurrence>*
8.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
9.  *Click <OK> to close the Recurrence form.*
10. *Click <OK> to add the job to the batch queue.*
11. The funding claim form will be generated with all the relevant funding claims.
12. Populate the description, claim year, and claim month.
