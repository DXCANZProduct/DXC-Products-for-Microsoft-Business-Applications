---
# required metadata

title: DXC-ITEM-CREATION-WIZARD
description: DXC-ITEM-CREATION-WIZARD - Frequently asked questions
author: Peter Musumeci
manager: Kym Parker
ms.date: 2023-06-26
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  NumberSequenceTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: DXC-ITEM-CREATION-WIZARD
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2023-06-26
ms.dyn365.ops.version: 10.0.34
---

# Frequently asked questions

### Where can I find contact information for support?
Support contact details can be located on the **Contact** tab at **Organization admininstration > Workspaces > Product support**

### Where can I identify the installed version of Insights for D365 FO?
Navigate to Help & support > About.
A list of installed models will be displayed on the Version tab. Search for DXC Item Creation. The version information will be displayed on the right (eg DXC Item Creation 10.0.34.202306151)

### Can I have product attributes on multiple update templates?
When an Item creation session is generated the update template will record the values assigned to the respective product attributes at that time. If another user has submitted changes, whether in progress, approved or still in workflow these will be overridden by the most recent submission. It is for this reason we recommend that the number of templates used to update product attributes are minimal.

### Will the default value for my Product attributes display during an update session?
Yes, when you run an update session that includes Product Attributes, the session will display the default attribute value that was assigned when you configured the template and the current system value for all other attributes against the relevant item. 

### Can I create a template that only updates 1 or 2 specific product attributes?
Currently when you run an update session that includes product attributes, all attributes assigned against the released product are displayed in the template.

### Can I update previously released variants to use the Item Status indicator?

Yes, if you have a variant for your Product Master that has been released without an Item Status, you can update this variant to display the status indicator using the Item Status Link.  See [Updating a single item](DXC-ITEM-CREATION-WIZARD/PROCESSES/Managing-item-statuses.md)
