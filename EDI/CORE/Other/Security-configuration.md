---
# required metadata

title: EDI Core
description: EDI Core - Security configuration
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
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

# Security configuration

The following roles are included in EDI:
- EDI engine:
  - EDI administrator: Documents all EDI events. Maintains all EDI setup
- Customer module:
  - EDI customer manager: Documents customer EDI events with read access to EDI setup. Ability to setup new Trading partner
  - EDI customer clerk: Documents customer EDI events with read access to setup
  - EDI customer administrator: Maintains EDI customer setup
- 3PL module:
  - EDI 3PL manager: Documents 3PL EDI events with read access to EDI setup. Ability to setup new Trading partner
  - EDI 3PL clerk: Documents 3PL EDI events with read access to setup
  - EDI 3PL administrator: Maintains EDI 3PL setup
- Vendor module:
  - EDI vendor manager: Documents vendor EDI events with read access to EDI setup. Ability to setup new Trading partner
  - EDI vendor clerk: Documents vendor EDI events with read access to setup
  - EDI vendor administrator: Documents vendor EDI events with read access to setup
- Freight forwarder landed cost module:
  - EDI freight forwarder landed cost manager: Documents freight forwarder landed cost EDI events with read access to EDI setup. Ability to setup new Trading partner
  - EDI freight forwarder landed cost clerk: Documents freight forwarder landed cost EDI events with read access to setup
  - EDI freight forwarder landed cost administrator: Maintains EDI freight forwarder landed cost setup
