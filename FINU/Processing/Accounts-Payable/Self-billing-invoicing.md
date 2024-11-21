---
# required metadata

title: Finance Utilities 
description:  Accounts payable processing - Self billing invoicing
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-11-21
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: VendPaymMode, LedgerJournalTable5, LedgerJournalTable9
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Self billing invoicing / RCTI
The fields as described in the following subsections are available to control the additional functionality for Self billing invoicing / Recipient-Created Tax Invoice (RCTI). <br>
This provides the ability to automatically create a Purchase invoice for Product receipt(s).

## Prerequisites
Setup requirements are discussed in detail at [Self billing invoicing setup](../../Setup/ACCOUNTS-PAYABLE/Self-billing-invoicing.md). <br>
Processing are discussed in the following subsections.

## Product receipt

When the self billing purchase order is product receipted it becomes available to self billing invoicing

## Invoice

### Create invoice

The Self billing invoice group's **Create invoice with product receipt** determines when the invoice is created:
- **Yes** - The invoice is automatically created when the product receipt is posted
- **No** - The invoice is automatically created when the periodic task runs: **Accounts payable > Periodic tasks > Create self billing invoices**

Invoice fields populated from setup:
- **Number** - Self billing invoice group's **Invoice number mask** + **Number sequence group** (where **Add number sequence group** is set to _Yes_).
- **Invoice description** - Self billing invoice group's **Invoice description**.
- **Invoice date** - Accounts payable parameter's **Invoice date**:
    - **Product receipt date** -  The latest product receipt date is used for Invoice date.
    - **Today's date** - Today's date is used for Invoice date.
- **Posting date** - Accounts payable parameter's **Posting date**:
    - **Invoice date** -  The Invoice date date is used for Posting date.
    - **Today's date** - Today's date is used for Posting date.

### Post invoice

The Self billing invoice group's **Post invoice requirements** determines how the created invoice is posted:
- **Do not post** - Created invoice is not posted and remains as pending vendor invoice
- **Post** - Created invoice is automatically posted. If post failed, it will remain as pending vendor invoice
- **Post and print** - Created invoice is automatically posted. If post failed, it will remain as pending vendor invoice. The invoice is also automatically printed as per Print management destination. The following print management destination options are supported:
    - Smart Send (where licensed)
    - Email

