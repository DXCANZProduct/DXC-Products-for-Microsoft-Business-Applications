---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder - Security configuration
author: jdutoit2
manager: Kym Parker
ms.date: 2022-11-04
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
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Security configuration

## Core EDI module

Core EDI has the following EDI roles included:

- **EDI administrator** - Documents all EDI events. Maintains all EDI setup

## Freight forwarder EDI module

Freight forwarder EDI has the following EDI roles included:

- **EDI freight forwarder landed cost administrator** - Maintains EDI freight forwarder landed cost setup
- **EDI freight forwarder landed cost manager** - Documents freight forwarder landed cost EDI events with read access to EDI setup. Ability to setup new Trading partner
- **EDI freight forwarder landed cost clerk** - Documents freight forwarder landed cost EDI events with read access to setup
