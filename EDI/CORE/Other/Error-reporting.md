---
# required metadata

title: EDI Core
description: EDI Core - Error reporting
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIDocumentWorkspace
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Error reporting

When EDI documents are processed, they may fail for various reasons.
EDI module includes defined errors (via development), else the standard D365 error will be provided.

## Process
When an Inbound document is received and processed via EDI it could fail for various reasons, examples:
- Unit conversion not found
- Receipt date not valid
- Quantity not available ATP
- Not within multiple/max qty
- Item or Customer on hold
- Mandatory dimension not specified

Previously these errors were only available as text log on the applicable staging document.
Staging processing errors are now defined and saved to a table for reporting purposes.

## Version log

Version log applies to **Inbound documents**, and users can access the staging forms by navigating to **EDI > Documents**. 
These errors can be viewed on the **Version log** form on each Staging form or [EDI Document maintenance workspace](../Workspaces/EDI-Document-maintenance-workspace.md). <br>
If a record’s status was reset and reprocessed the **Version log** will show all the version’s status and if there were any errors, split these into Header and Lines. If there were no errors, a version is still created with blank error details. If an error is not defined the Staging to target status will be Error and the standard D365 error will be provided. <br>
**Show log** shows only the latest log. <br>
**Version log** form displays the following fields for each processing version: <br>

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Version**                       |	Starts at 1. If record is reset and reprocessed version will increment accordingly
**Start timestamp**               |	Date/time version was created
**EDI Document type**             |	Staging document type, example Customer purchase order
**Staging to target status**      |	The status of the processing record. Options include: <br> •	**Error**: The EDI file has been processed but there are errors with the record that needs to be reviewed. <br> •	**Completed**: The EDI file has been successfully processed.
<ins>**Header**</ins>             |
**Error type**                    |	Displays:<br> • **Defined errors**, examples 'Order duplicate', 'Store code not found', 'Purchase order '%' already exists on sales order '%''<br> • **Processing error**: displays the standard D365 error, example 'Inventory dimension Site is mandatory and must consequently be specified.'
**Level**                         |	Options include: Error or Warning
**Message**                       |	Detailed error message
<ins>**Lines**</ins>              |
**Line number**                   |	Staging line number
**Error type**                    |	Displays defined error
**Level**                         |	Options include: Error or Warning
**Message**                       |	Detailed error message
