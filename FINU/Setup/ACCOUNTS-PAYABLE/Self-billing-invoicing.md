---
# required metadata

title: Finance Utilities 
description:  Accounts payable setup - Self billing invoicing
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-11-20
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: VendParameters, DFUSelfBillingInvoiceGroups
audience: Application User
# ms.devlang:
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm:
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Self billing invoicing / RCTI
The fields as described in the following subsections are available to control the additional functionality for Self billing invoicing / Recipient-Created Tax Invoice (RCTI). <br>
This provides the ability to automatically create a Purchase invoice for Product receipt(s).

## Accounts payable parameters
Users can access the form by navigating to **Accounts payable > Setup > Accounts payable parameters**

Select the **Invoice** tab, and expand **Self billing invoicing** FastTab
- **Enable self billing invoicing** - This enables the functionality and menu items for the legal entity.
- **Invoice date** - Select the applicable Invoice date for the Purchase invoice:
    - **Product receipt date** -  The latest product receipt date is used for Invoice date.
    - **Today's date** - Today's date is used for Invoice date.
 - **Posting date** - Select the applicable Posting date for the Purchase invoice:
    - **Invoice date** -  The Invoice date date is used for Posting date.
    - **Today's date** - Today's date is used for Posting date.


#### Data entities
The new fields have been added to the applicable data entities:

Field                                         | Data entity            | DFU field  
:--  | :--  | :--



### Processing
Processing is discussed in detail at [Self billing invoicing processing](../../Processing/Accounts-Payable/Self-billing-invoicing.md).
