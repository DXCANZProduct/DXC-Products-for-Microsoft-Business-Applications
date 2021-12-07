---
# required metadata

title: [EDI Core]
description: [EDI Core - Frequently asked questions]
author: [jdutoit2]
manager: Kym Parker
ms.date: 29/09/2021
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

# Frequently asked questions

## Version and Support Information
-	Where can I find contact information for support?
    - Support contact details can be located on the EDI parameters form on the About tab.
- Where can I identify the installed version of the EDI module
   - Navigate to Settings > About.  A list of installed models will be displayed on the Version tab.  Search for Sable 37 EDI. The version information will be displayed on the right (i.e. Sable37 EDI 10.0.14.202009181 (isv))
  
## XML Errors
- XML file errors when processed into the staging table
  - Check the data provided for each element is valid. (i.e. A null value for a ‘date’ element, will fail the XSD validation)

## Number sequences are not available to setup
To load all new number sequence references, select **Reset** on **Organization administration > Number sequences > Number sequences > Manual cleanup**
