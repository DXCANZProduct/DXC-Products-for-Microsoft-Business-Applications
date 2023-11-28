---
# required metadata

title: Core Extensions
description: Core Extensions - Import/Export Print management settings
author: Peter Musumeci
manager: Kym Parker
ms.date: 2023-10-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  Print management document settings
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2023-10-31
ms.dyn365.ops.version: 10.0.34
---

# Import/Export Printer management settings

### Overview

A new data entity titled “Print management document settings” has been developed to allow for the export and subsequent import of document settings within the printer management forms including conditional settings to a CSV Format file where they can be subsequently imported into another environment or legal entity.  This new data entity is capable of exporting settings related to other DXC products including Smart Send and DocuSign.   The entity only exports Printer settings that have been set up and will not export settings in “default” status.
Print Management settings are available in the following Modules-<br>
•	Accounts receivable<br>
•	Inventory management<br>
•	Procurement and sourcing<br>
•	Project management and accounting<br>
•	Transportation management<br>
•	Warehouse management<br>




|  **Field**  | **Description** | 
|:---|:---|     
|  **Default**  | Select a default business form or report per document type. When the Smart Send button is clicked on each of the document forms, the default business form or report is used. If none are selected, then the system default will be used. |   
|  **Report**  | Select from a list of business form or report types that are supported for Smart Send. <br/> * Customer account statement <br/> * Payment advice (Vendor payment advice) <br/> * Purchase order <br/> * Sales invoice <br/> * Free text invoice <br/> * Sales quotation <br/> * Project invoice <br/> * Sales order confirmation <br/> * Packing slip <br/> * Sales agreement confirmation <br/> * Project quotation <br/> * Collection letter <br/> * Customer payment advice <br/> * Request for quotation <br/> * Container contents <br/> * Bill of lading <br/> * Sales return <br/> * Transfer overview. |  
|  **Report format**  | Select the report name available in the system. |  
|  **Description**  | Basic description of the business form. |  
|  **Email ID**  | Email templates to use when emailing the business form. |  
|  **File name**  | File name that will be generated for the business form or report. Placeholder tags are supported. This helps with giving meaningful name to the files. Refer to [Email placeholder](Email-placeholder.md) for further detail on supported placeholder tags. |  
