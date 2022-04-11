---
# required metadata

title: [Forex contract]
description: [Invoice posting]
author: [jdutoit2]
manager: Kym Parker
ms.date: 11/04/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Forex contract]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
