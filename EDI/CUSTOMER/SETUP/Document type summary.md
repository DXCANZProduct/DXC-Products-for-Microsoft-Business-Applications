---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setup - Document type summary]
author: [jdutoit2]
manager: Kym Parker
ms.date: 23/09/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
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

# Customer setup - Document types summary

## Inbound

### Customer purchase order
- EDI standard formats: X12 850 and EDIFACT ORDERS

#### Customer purchase order Setting profile options
<ins>Purchase order</ins>
-	Item Id source: Our/Ext/GTIN/Barcode
-	Prices include sales tax: Y/N
-	Use Customer price: Y/N & Max negative & max positive price variance
-	Create release order without blanket order: No/Yes/Warning
-	Duplicate tolerance: Error/Accept/Accept on flagged orders
-	Update confirmed ship date: Y/N

<ins>Purchase agreement</ins>
-	Agreement classification
-	Strip field delimiter

<ins>Supplementary items</ins>
-	Add mandatory supplementary items: Y/N
-	Add optional free of charge supplementary items: Y/N
-	Add optional charged supplementary items: Y/N

<ins>Retail</ins>
-	Automatic complete retail order
-	Channel
-	Payment method

#### Customer purchase order Validation profile options
<ins>Sales order</ins>
-	Delivery date

<ins>Sales order line</ins>
-	Delivery date
-	Min/Max qty
-	Sales price
-	Sales unit

### D365 max status
- Sales order = Open order

### Customer purchase order change
- EDI standard formats: X12 860 and EDIFACT ORDCHG

#### Customer purchase order change Setting profile options
<ins>Document</ins>
•	Processing method: Automatic/Manual
  
<ins>Purchase order</ins>
-	Item Id source: Our/Ext/GTIN/Barcode
-	Document status: None, Confirmation, Picking list / Released to warehouse, Delivery note or Tax invoice
-	Allow header update: Y/N
-	Don’t send POA for changes: Y/N
  
<ins>Dates</ins>
-	Update confirmed ship date
  
<ins>Prices</ins>
-	Prices include GST: Y/N
-	Use Customer price: Y/N & Max negative & positive price variance
  
<ins>Quantities</ins>
-	Allow quantity decrease on increase type
-	Allow quantity increase on decrease type

#### Customer purchase order Validation profile options
<ins>Sales order</ins>
-	Delivery date

<ins>Sales order line</ins>
-	Delivery date
-	Min/Max qty
-	Sales price
-	Sales unit

### D365 max status
- Sales order = Open order / Cancelled
