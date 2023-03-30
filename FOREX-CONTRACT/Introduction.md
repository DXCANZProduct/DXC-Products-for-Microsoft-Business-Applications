---
# required metadata

title: Forex contract
description: Introduction to Forex contract
author: jdutoit2
manager: Kym Parker
ms.date: 2022-04-08
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
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# DXC Forex contract

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction
The Forex contract module is designed to allocate Forex contracts to purchase orders and invoice journals. <br>
The amounts in inventory/vendor accounts will be calculated based on the attached Forex contract forward rate. <br>

Goods are imported from another country by the company. Payment in foreign currency is going to be made in a certain period. <br>
To hedge the exchange rate risk, the company enters into a contract with bank to purchase the foreign currency at a certain exchange rate on the payment due date. <br>
The contract between the company and the bank is called a Forex contract.

## Setup
The following setup is required per legal entity.

- [Forex contract parameters](SETUP/Forex-contract-parameters.md)
- [Forex over allocation](SETUP/Forex-over-allocation.md)


## Processing
The following describes using the Forex contract functionality.

- [Create forex contract](PROCESSING/Create-forex-contract.md)
- [Link forex contract to documents](PROCESSING/Link-forex-contract.md)
- [Changes to forex contract or document](PROCESSING/Changes.md)
- [Invoice posting](PROCESSING/Invoice-posting.md)
- [Cash in forex contracts](PROCESSING/Cash-in.md)
- [Inquiries](PROCESSING/Inquiries.md)


## Other

### Data entities
Forex contract include data entities to support its enhancements to D365.

- [Data entities](OTHER/Data-entities.md)

### Security configuration

The following roles are included in the Forex contract module: 
-	**Forex manager** – manages forex contract setup
- **Forex contracts clerk** – creates and maintains forex contracts

## New ideas
Have a suggestion for new product or new feature for existing product? [Suggest a New idea](https://forms.office.com/r/U9twpSt3in)
