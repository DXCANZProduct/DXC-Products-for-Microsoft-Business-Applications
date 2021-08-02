---
# required metadata

title: [Core Extensions]
description: [Core Extensions - User security audit detail report]
author: [Liam Coll]
manager: Kym Parker
ms.date: 02/08/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Core Extensions]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# User Security Audit Detail Report
##	Overview
The report *User security audit details report* included in the Core Extensions product gives an overview of the security setup for a user. The information shown on the report is down to the privilege level details.

*Note: This can be a slow report based on the number of users and security roles. It is suggested you use filters to reduce the result.*

## Process
1. To run the report, you must be assigned the “Security administrator” role.
2. Navigate to **System administration > Security > User security audit details report**.

The details shown per user are:
* All the roles that are assigned to the user
* All the duties as part of the role
* All the privileges as part of the duty
