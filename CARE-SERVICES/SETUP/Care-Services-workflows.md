---
# required metadata

title: DXC Care Services 
description: Care Services Workflows
author: Peter Musumeci 
Manager: Pontus Ek
ms.date: 2025-03-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci 

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-03-31
ms.dyn365.ops.version: 365 FSCM
---


# Care Services Workflows

## Billing Journal Workflow

Navigate to:  **Care Services > Journals > Billing journal**

Care Services Billing Journal Workflow Activation. Navigate to:  **General Ledger > Journal setup > Journal names**

Navigate to the Journal Type Care Services Billing Journal.  Subsequently, you can select Line approval or Header approval ("Approval Workflow")

**![Workflow Activtaion](../IMAGES/Workflow.png)**

When the Approval Workflow toggle is set to Yes, the Approval Workflow button will be available on the Billing journal.  

When the Line Approval Workflow toggle is set to Yes, the Line Approval Workflow button will be available on the Billing journal

*Note* While a journal has an incomplete Line Approval Workflow process, the billing journal will not be available for posting, and the "Approval Workflow" (Header level) cannot be initiated. Disable the Header Workflow process if there is an active Line Approval Workflow, and complete before initiating the Header workflow.






Navigation Menu:  Care Services > Setup > Care Services Workflows
