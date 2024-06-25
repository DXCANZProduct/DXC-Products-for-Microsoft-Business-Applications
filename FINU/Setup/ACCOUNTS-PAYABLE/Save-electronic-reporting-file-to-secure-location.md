---
# required metadata

title: Finance Utilities 
description: Accounts payable setup - Save electronic reporting file to secure location 
author: jdutoit2
manager: Pontus Ek
ms.date: 2024-06-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  ERFormatDestination, DXCEncryptionParameters, DocuType, DFUGERExportConnection
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version:: AX 7.0.1
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## Save Electronic reporting file to secure location
The below setup can be used for any Electronic reporting file, but the example provided is for a Vendor GER EFT payment. The feature uses the **Archive** functionality with the following setup steps
-	Step 1: Setup [Electronic reporting export connection](../ELECTRONIC-REPORTING-EXPORT/Electronic-reporting-export-connections.md)
-	Step 2: Setup [Document types](../ELECTRONIC-REPORTING-EXPORT/Document-types.md), using Step 1’s Connection
-	Step 3: Setup [Electronic reporting destination](../ELECTRONIC-REPORTING-EXPORT/Electronic-reporting-destination.md), using Step 2’s Document type
-	Step 4: Setup AP **Method of payment** and select the Export format configuration from Step 3

Processing: When generating a payment for a method of payment with above GER, the Archive destination is defaulted, and the GER EFT payment file is saved to the assigned connection path.

Please use links in above for setup required in step 1 - 3.

### Step 4 -	Method of payment
On the selected **Method of payment**, enable **Generic electronic Export format**, and in the **Export format configuration** field select the **Reference** from _step 3_.

## Processing
Vendor payment processing using the above method of payment is discussed at [Processing](../../Processing/Accounts-Payable/Save-electronic-reporting-file-to-secure-location.md)

