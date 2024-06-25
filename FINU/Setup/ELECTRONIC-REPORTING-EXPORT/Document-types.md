---
# required metadata

title: Finance Utilities 
description: Organization administration - Electronic reporting export connection 
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

# Electronic reporting

Finance utilities includes functionality to export an Electronic reporting format to a secure location.

### Setup steps
1. [Electronic reporting export connections](Electronic-reporting-export-connections.md)
2. [Document types](#setup-document-types)
3. [Electronic reporting destination](Electronic-reporting-destination.md)

The following section will describe the required setup for Step 2 for assigning the secure location created in **Electronic reporting export connections** to a **Document type**.

### Setup Document types

Users can access the page by navigating to **Organisation administration > Document management > Document types**. <br> 
Select **New** to create the **Document type** and assign the **Electronic reporting export connection** created in _step 1_.

|   Field    |   Description   |   Example or Options   |
|-|-|-|
| **Type**  |  Enter the type  |  Example GER  |
| **Name**  |  Enter a name for the document type  |  |
| **Class**  |  Select **Attach file**  |  •	Attach file <br> •	Attach URL <br> •	Simple note      |
| **Group**  |  Select  **File**   |  • Note <br> • File <br> • Image <br> • Document <br> • Worksheet <br> • URL         |
| **Category**  |  Select a **Category**  |  •	None         |
| **Location** | Not used, select any     |  • Azure storage <br> • Database <br> • SharePoint         |
| **SharePoint address** |   Not used  
| **Remove**  |  Document and physical file  |           |
| **Ask for confirmation**  |  Should confirmation be requested priori to removing the file  |  • Yes <br> • No |
| **Electronic report export connection**  |  Select the **Electronic reporting export connection** setup in _step 1_ |  Example ANZ_FTP         |


