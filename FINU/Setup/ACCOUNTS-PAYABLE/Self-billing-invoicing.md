---
# required metadata

title: Finance Utilities 
description:  Accounts payable setup - Self billing invoicing
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-11-21
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: VendParameters, DFUSelfBillingInvoiceGroups, VendTableListPage
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

## Self billing invoice groups
Users can access the form by navigating to **Accounts payable > Setup > Self billing invoice groups**. <br>
These groups are assigned to applicable vendors.

On the Action Pane, select New and enter the following details
- **Self billing** - Ability to manage the self billing functionality on a group level. 
- **Create invoice with product receipt** - Ability to automatically create the purchase invoice when the product receipt is posted
    - **Yes** - Consolidate invoices is disabled as the purchase invoice is 1:1 with product receipt
    - **No** - Consolidate invoices is enabled and periodic task **Create self billing invoices** needs to be setup to create the purchase invoice(s).
- **Consolidate invoices** - Select method of consolidation when periodic task **Create self billing invoices**  is used to create the purchase invoice(s):
    - **Product receipt** - Split one invoice per one uninvoiced product receipt
    - **Purchase order** - Consolidate all uninvoiced product receipts per purchase order into one invoice
    - **Invoice account** - Consolidate all uninvoiced product receipts per invoice account into one invoice
    - **Receipt date** - Consolidate all uninvoiced product receipts per receipt date into one invoice
- **Post invoice requirements** - Select applicable option for the created purchase invoice
    - **Do not post** - Created invoice is not posted and remains as pending vendor invoice
    - **Post** - Created invoice is automatically posted. If post failed, it will remain as pending vendor invoice
    - **Post and print** - Created invoice is automatically posted. If post failed, it will remain as pending vendor invoice. The invoice is also automatically printed as per Print management destination. The following print management destination options are supported:
        - Smart Send (where licensed)
        - Email
- **Automatic approval** - Field is available for use in _Vendor invoice workflow_
- **Invoice description** - Populates invoice's Invoice description
- **Invoice number**
    - **Invoice number mask** - Use **Editor** button to build an Invoice number mask using static or one/many of the following placholder fields:
        - **Vendor account** - Vendor table's Vendor account
        - **Group** - Invoice account's Group
        - **Vendor account** - Purchase order's Vendor/Order account
        - **Invoice account** - Purchase order's Invoice account
        - **Purchase order** - Purchase order id
        - **Company** - Purchase order's legal entity
        - **Product receipt** - Product receipt
    - **Add number sequence group** - where the invoice number mask will not result in a unique number, it is advised to add number sequence group to the end of the invoice number mask. For example where consolidating by purchase order and it could result in multiple invoices for the same purchase order.
    - **Number sequence group** - where a Number sequence group hasn't been assigned to the vendor, this group will be used. 
        - Order of which Number sequence group is used, if blank next one is used:
            - Invoice account
            - Order account
            - Purchase order's Self billing invoice group
  
#### Populate Invoice number without automatically creating invoice
When setting **Self billing** to _No_ and assigning the **Invoice number** fields, the group can be used to populate invoice numbers for manually created purchase invoices.


## Vendors
Users can access the form by navigating to **Accounts payable > Vendors > All vendor**

The following fields on the **Invoice and delivery** FastTab applies to the functionality:
- Assign the applicable **Self billing invoice group** setup in previous section to all applicable Vendor(s) in field **Self billing invoicing**
- Where applicable assign a **Number sequence group** to all applicable Vendor(s)

## Periodic task

Where the Self billing invoice group's **Create invoice with product receipt** is set to _No_, it is required to create a batch recurrence for the group using the following periodic task: <br> 
**Accounts payable > Periodic tasks > Create self billing invoices**

### Processing
Processing is discussed in detail at [Self billing invoicing processing](../../Processing/Accounts-Payable/Self-billing-invoicing.md).
