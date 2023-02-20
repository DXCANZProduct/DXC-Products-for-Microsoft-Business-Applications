---
# required metadata

title: Docusign
description: Setup Parameters
author: ndavidson2
manager: Kym Parker
ms.date: 2020-01-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_DSUser
audience: Application User
# ms.devlang: 
ms.reviewer: ndavidson2
# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconDocuSign 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: ndavidson2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
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

