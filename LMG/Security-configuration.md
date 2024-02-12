---
# required metadata

title: EDI Customer
description: EDI Customer - Security configuration
author: adutt2
manager: Kym Parker
ms.date: 2022-04-11
ms.topic: article
ms.prod:
ms.service: dynamics-ax-applications
ms.technology:

# optional metadata

ms.search.form:
audience: Application User
# ms.devlang:
ms.reviewer: adutt2

# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: adutt2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Security configuration

## License Manager FinOps module

License Manager has the following roles included:

- **IT administrator** - Documents all EDI events. Maintains all EDI setup
- **IT administrator** - Documents all EDI events. Maintains all EDI setup

## License Manager PowerApp Canvas App

No role based access. Access is controlled by the owner of the environment in which the cavas app has been installed.

## License Manager Web App

License Manager Web App comes with three different personas for accessibility.

- **Global Admin** - Manages and assigns admin privileges to different organizations using RBAC feature.
- **Organization Admin** - Manages and assigns organization's user privileges using RBAC feature.
- **User** - Access the app based on their accessibility. No admin privileges.

Role based access (RBAC) can be managed by Global and Organization Admins which is dynamics and allows the following level of access for each view

- Delete (Highest level access. Can create, read, update and delete records)
- Create (Can create, read and update records )
- Update (Can read and update records)
- Read (Read-only access)
