---
# required metadata

title: [Topic name]
description: [Full description that appears in the search results. Often the first paragraph of your topic.]
author: [author's GitHub alias]
manager: AnnBe
ms.date: 06/20/2017
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Pick one: Application User/Developer/IT Pro]
# ms.devlang: 
ms.reviewer: [Content Strategist microsoft alias]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

#  Exceptions

The exceptions page provides the details of any Docusign documents that have had an error at the time of confirmation of the document.  The administrator will be able to review the errors associated.  From there, the administrator can update the details of the document so that it will be successfully processed in future transactions.  The **Exceptions** page is found by navigating to **Organization administration > Inquiries and Reports > Docusign > Exceptions.**


| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Created date and time**          | The time and date the error was created. This comes from the system date of D365.  |
| **Document number**                | The reference to the Document number that has been created.  This will be used to determine which document needs to be re-processed.    |
| **Error message**                     | The display of the error message that is received at the time of processing.  Additionally, users can select the **Error text** action button to review the full message of the error.  This field will be used to identify what changes need to be made to resolve the document process.    | 
| **Created by**                      | The user who processed the document.  This is identified by the system.    | 
