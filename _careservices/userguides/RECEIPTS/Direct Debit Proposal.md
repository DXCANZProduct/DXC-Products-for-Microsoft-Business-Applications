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

### Direct Debit Proposal

-   Ensure the clients’ method of payment and bank accounts have been setup.
-   Setup the direct debit limits or Pre-set direct debit amounts.

**Navigate to: Care services> Journals> Receipt journal**

1.  Click on \<**New**\> to create a new receipt journal.
2.  Select the **relevant receipt journal** from the drop-down menu.
3.  Populate a meaningful description.
4.  Click on \<**Lines**\>
5.  Go to payment proposal> **Create payment proposal.**
6.  Populate date range if required to exclude open invoices.
7.  Select the ‘Apply Direct debit limits’ **OR** ‘Apply pre-set direct debit amount and limit’.
8.  Click on \<**Filter**\> to select Customer account, service code, method of payment.
9.  Select the **Billing account name for billing** to exclude accommodation payment drawdowns.
10. Click \<**OK**\>
11. Populate a Description
12. Select Billing account name.
13. Ensure the Bank offset account is populated.
14. Click on **Functions> Generate payments.**
15. Select Method of payment, populate file name and select bank account.
16. Click \<**OK**\> and \<**OK**\> for the reporting form.
17. The bank file will be generated and can be uploaded to the bank.
18. Validate and post the journal when the bank file has been successfully uploaded to the bank.
