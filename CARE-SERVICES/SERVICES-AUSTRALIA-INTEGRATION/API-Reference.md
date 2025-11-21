---
# required metadata

title: DXC Care services API Reference
description: Services Australia Support at Home API reference
author: Artika Dutt
Manager: Pontus Ek
ms.date: 2025-11-19
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Artika Dutt

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Artika Dutt
ms.search.validFrom: 2025-11-19
ms.dyn365.ops.version: AX 7.0.1
---


# Services Australia Support at Home API Reference

## Supported APIs
This section describes the list of APIs supported.

### DXC Care Services V0.1
NOI received 3 October 2025

Functions:
- Aged Care API - Support at Home Budgets - 1.2.0
  - Budget
    - GET Budget care recipient
    - GET Budget details
    - GET Budget service provider
    - GET Budget summary
    - POST Budget roll over

### DXC Care Services V0.2
NOI received 22 October 2025

Functions:
- Aged Care API - Care recipient Individual contribution - 1.0.0
  - Care recipient individual contribution
    - GET care recipient individual contribution
- Aged Care API - Support at Home Budgets - 1.2.0
  - Budget
    - GET Budget care recipient
    - GET Budget details
    - GET Budget service provider
    - GET Budget summary
    - POST Budget roll over
- Aged Care API - Support at Home Entry/Departure - 1.0.0
  - Entry
    - DEL Delete departure
    - DEL Delete entry
    - GET Query departure events
    - GET Query entries into Support at Home
    - GET Retrieve departure details
    - GET Retrieve entry details
    - POST Create entry
    - POST Depart care recipient from care
    - PUT Update departure
    - PUT Update entry
- Aged Care API - Support at Home Invoices - 1.1.0
  - Service invoice
    - DEL Delete attachment
    - DEL Delete invoice item
    - GET Invoice details
    - GET Invoice item details
    - GET Query invoice details
    - GET Retrieve attachment pdf image
    - POST Add item to an invoice
    - POST Create invoice
    - POST Delete invoice
    - POST Re-open a submitted invoice for editing
    - POST Submit invoice
    - POST Upload attachment
    - PUT Update invoice item
- Aged Care API - Support at Home claim - 1.0.0
  - Claim
    - GET claim details
    - GET claim search
    - POST claim
- Aged Care API - Support at Home enteral feeding supplement - 1.0.0
  - Enteral feeding supplements
    - DEL enteral feeding supplement
    - GET enteral feeding retrieve attachment
    - GET enteral feeding supplement details
    - GET enteral feeding supplements
    - POST enteral feeding supplement
    - POST enteral feeding upload attachment
    - POST Update the enteral feeding supplement end date
    - PUT enteral feeding supplement
- Aged Care API - Support at Home oxygen supplement - 1.0.0
  - Oxygen supplements
    - DEL oxygen supplements
    - GET oxygen retrieve attachment
    - GET oxygen supplement details
    - GET oxygen supplements
    - POST oxygen supplements
    - POST oxygen upload attachment
    - POST Update the oxygen supplement end date
    - PUT oxygen supplements
- Aged Care API - Support at Home payment statement - 1.0.0
  - Payment statement
    - GET payment statement
    - GET payment statement download
