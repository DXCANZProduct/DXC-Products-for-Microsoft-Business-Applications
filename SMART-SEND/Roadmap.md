---
# required metadata

title: Smart Send
description: Smart Send - Roadmap
author: pmusumeci
Manager: Pontus Ek
ms.date: 2023-07-27
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: pmusumeci
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: pmusumeci
ms.search.validFrom: 2023-07-27
ms.dyn365.ops.version: AX 7.0.1
---

# 	Roadmap 

This page describes the features planned for future releases.

> Note: Dates and features are subject to change.

## Roadmap

Coming Soon




#### Build 10.0.39.2024xxxxx

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
16791	    | The field with ID '0' does not exist in table 'CustInvoiceTable'| When attempting to perform the View >copy function on a Free Text Invoice the error was displayed.
18226     | Free Text Invoices are not saved to Azure blob storage when issued in multiple | Previously when you selected more than 1 free text invoice or a combination of free text and customer tax Invoices only the first Free Text Invoice was sent to blob storage
18275    |Tax Journal Screen resets when sending records across screens | Issue resolved when multiple records are selected and attempted to be sent via Smart Send
17425  |Update Table Groups | Update Table Groups in line with proposed PPAC copy environment functionality to prevent loss of key data
18916|Smart Send "Test Azure blob storage connection" button is not validating correctly| Changes to how FinOps validated blob storage connections have been made as a result of an invalid dll file bundled by Microsoft causing the failure. This change is designed to prevent future issues and reduce dependency
18842|Azure blob storage setup  mismatches|When changing between Blob connection string or Key Vault storage the Blob connection string would still be displayed instead of looking for the key vault type. Also not allowing blob storage values to be blank when Storage options are set to none 
18792| Request for quotation smart send button  will print to screen| When using the smart send button for Request for quotation this would previously print to screen 
18983|Remove Catch statement| Previously when saving files in blob storage a message would display "See event viewer in LCS for more detail" when a non Smart Send error occurred. This has been removed in favour of original errors being passed back to Fin ops from blob storage
