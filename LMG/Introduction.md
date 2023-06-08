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

# License manager

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction
The License manager was created to allow streamlined management of licenses for ISV Product. When License Manager is installed in an environment, a call is made to a back end server to validate that a valid license is active. Where no valid license is identified, the customer will receive messages in their FinOps environment to notify them that the product installed is not licensed. <br>

As an optional addition, License Manager can be implemented using feature keys.  Where a customer is not licensed to use a Product, License Manager can deactivate the feature in a customer environment, therefore removing use of the Product from the customer. <br>

### Disclaimers
- As a customer of License Manager, it’s agreed and understood that DXC will be hosting the customer license information. 

### Objectives
The objectives are: 
-	Describe how to enable license management for product given a specific tenant in FinOps
-	Describe the Power App
-	Describe the view available in Customer environment

 
