---
# required metadata

title: License manager
description: Introduction to License manager
author: hho34
manager: Kym Parker
ms.date: 2023-06-07
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
# ms.custom: 
ms.search.region: ICONForex
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---


## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction
Introduction to License Manager

### Audience
This guide is intended for Partners with extensive knowledge of D365 Finance and Operations. 

### Learning Objectives
Describe and illustrate the functionality of DXC License Manager.

### Prerequisites
Before reading this guide, the reader must have extensive knowledge of: 
- Microsoft D365 Finance and Operations

### New or Changed Features
The highlights of the new features being added to the DXC License Manager module include:
- Support for multi-tenant added.

### Deprecated Features
The highlights of deprecated features removed from the DXC License Manager module include:
- None

### Disclaimers
- As a customer of License Manager, it’s agreed and understood that DXC will be hosting the customer license information. 
 
## License Manager Overview
The DXC license manager was created to allow streamlined management of licenses for ISV Product. When License Manager is installed in an environment, a call is made to a back end server to validate that a valid license is active. Where no valid license is identified, the customer will receive messages in their FinOps environment to notify them that the product installed is not licensed. <br>

As an optional addition, DXC License Manager can be implemented using feature keys.  Where a customer is not licensed to use a Product, DXC License Manager can deactivate the feature in a customer environment, therefore removing use of the Product from the customer. <br>

### Objectives
The objectives are: 
- Describe how to enable license management for product given a specific tenant in FinOps
- Describe the Power App
- Describe the view available in Customer environment
 

