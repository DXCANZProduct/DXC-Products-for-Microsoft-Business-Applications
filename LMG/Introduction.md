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
ms.search.region: DXCLicenseManager
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# License manager

## Release notes

The [release notes](Release-notes.md) describes the features that are either new or changed.

## Introduction

The license manager solution allows management of licenses for Dyanmics 365 Finance and Operations ISV products. This module allows ISV partners to manage customer license information, control expired licenses and environments enabled, extend and incoporate license control for each ISV product and collect license based telemetry.

This module enables ISV partners to be able to implement license control on their products. Upon installation of the license controlled ISV products a validation request is made to the licensing service to verify the product license. If not licensed, expired or disabled, customers will receive prompt to contact the ISV partner for license issues.

License Manager can be implemented either using configuration keys or feature management. As an optional addition, when a customer is not licensed to use a product, License Manager can deactivate the feature in a customer environment, therefore removing use of the product from the customer.
<br>

### Disclaimers

- As a customer of License Manager, it’s agreed and understood that DXC will be hosting the customer license information.

### Objectives

The objectives are:

- [Describe enabling license control for product given a specific ISV partner in FinOps](./FinOps.md)
- [Describe the License Manager Power App](./PowerApp.md)
- [Describe the License Manager Web App](./ReactWebApp.md)
