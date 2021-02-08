---
# required metadata

title: [Docusign]
description: [Setup Parameters]
author: [ndavidson2]
manager: Kym Parker
ms.date: 12/01/2020
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

# Users

The Docusign Users page is used to set up all of the users within Dynamics 365 that have access to utilize Docusign signature functionality.  All users who will be involved in submission of documents must be set up within this form, which can be reached by navigating to **Organization administration** > **Setup** > **Docusign** > **Users**


To create a new user:

1.	Click on **New** to create a new User.
2.	Enter the **DocuSign User Name** into the user name field.
3.	In the Dynamices Users fast tab, select Add
4.	Select the D365 UserID to use for the DocuSign account.


| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **UserID**          | Select the Dynamics 365 UserID that will utilize the Docusign integration.   |
| **Operator name**                | The name associated to the UserId selected in the **UserId** field.  This is set up on the **Users** page.     |
 

Multiple D365 user accounts can be added to the same Docusign user name.  New users can be added to the existing Docusign account by following steps 3 and 4 above. Dynamics 365 users are required to have an assigned Docusign User account to process correctly.

