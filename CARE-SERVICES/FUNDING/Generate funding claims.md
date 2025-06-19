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

# Funding

-   Funding is the most common income for Care services providers.
-   Transactions related to funding will not appear in the Customer transactions form because they are not related to the customer balance.
-   Funding claims for Community and Disability service providers can be imported via the data migration framework.
-   The funding claims for residential Care services providers will be generated from the residents’ funding schedules.
-   The Funding claim form will group all relevant funding claims to generate the funding claim file.

### Generate funding claims

**Path: Care services \> Funding \> Generate Funding Claims**

1.  Populate the End date.
2.  Click on **\<Filter\>**
3.  Specify the required criteria for generating the funding claims (Service code or client account)
4.  Click **\<OK\>**
5.  *If required, setup the job to run in the background. Select Batch processing to Yes.*
6.  *Click on \<Recurrence\>*
7.  *The default value is for the job to run once (End after:1) If it is a requirement for the job to run at a regular interval, then setup up the required recurrence pattern.*
8.  *Click \<OK\> to close the Recurrence form.*
9.  *Click \<OK\> to add the job to the batch queue.*
10. The relevant funding claims will be generated with the Document status = Open
