---
# required metadata

title: Core Extensions
description: Core Extensions - User security audit detail report
author: Liam Coll
manager: Kym Parker
ms.date: 2021-08-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
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
