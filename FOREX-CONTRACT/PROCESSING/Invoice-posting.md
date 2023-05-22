---
# required metadata

title: Forex contract
description: Invoice posting
author: jdutoit2
manager: Kym Parker
ms.date: 2022-04-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_ForexContractTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: 
ms.search.region: ICONForex
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Invoice posting

At the time of posting an invoice in the purchase order form, a check will occur to ensure that there is enough cover by the Forex contract (This check will only be carried out if there is a Forex contract linked to one of the Documents).  If there isn’t enough to cover the amount the system post the shortfall at the current D365 exchange rate.

## Calculation
When creating an invoice, the weighted average Forex rate will be applied if there are multiple contracts attached to the document.

### Scenario:
 - Invoice amount = $1,000

- Forex contract 1's amount = $600 
- Forex contract 1's exchange rate = 0.8

- Forex contract 2's amount = $400
- Forex contract 2's exchange rate = 0.6

**Result:** <br> 
Exchange rate used to convert invoice amount in foreign currency into default currency will be 
 ((600 * 0.8) + (400 * 0.6))/1000 = 720/ 1000 = 0.72
 
If the invoice amount is not covered in full, D365 will use the invoice day's **spot rate** to calculate the residual amount. <br>
The invoice amount posted to vendor account will not be adjusted by periodic exchange adjustment function in D365. <br> 

> Note: If the full expected amount isn’t used it will leave it against the Forex contract and remove it from the attached document, this can only be done when the status of the Purchase order/Purchase order line is _Invoiced_.  If there is an expected decrease in amount, then this should be reflected.
