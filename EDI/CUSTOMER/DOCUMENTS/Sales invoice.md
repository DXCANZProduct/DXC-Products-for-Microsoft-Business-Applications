---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Sales invoice]
author: [jdutoit2]
manager: Kym Parker
ms.date: 5/11/2021
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

# Sales invoice
EDI customers may require a Sales invoice for a sales order.

> Note: Sales invoices can also be sent for a sales order not created via EDI.

The following subsections will describe how to view, process and send Sales invoices to applicable Customer Trading partners. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed. <br>
The created sales invoice record(s) can be viewed for a sales order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Sales order page.<br>

## Prerequisites
The following setup is prerequisites for the sales invoice

1. Create [Template](../../CORE/Setup/DocumentTypes/File%20templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING%20PROFILES/Sales%20invoice.md) for the document.
3. Create [Outbound filenames](../../CORE/Setup/DocumentTypes/Outbound%20filenames.md) for the document.
4. If the customer [trading partner](../SETUP/Trading%20partner.md) doesn't exist, create the new trading partner.
5. Add and enable the sales invoice to the [Customer trading partner](../SETUP/Trading%20partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

## Processing
