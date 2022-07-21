---
# required metadata

title: EDI Core
description: EDI Core Setup - Document type mapping
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-27
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
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Document type mapping

## Setup Document type mapping
Users can access the form by navigating to **EDI > Setup > Document type mapping**. <br>
The mapping can be used in functional acknowledgement's [setting profiles](SETTING-PROFILES/Functional-acknowledgement.md).

Create a new Document type mapping by:
- Click **New** to create a new record. 
- In the **Name** field, enter the name of the Document type mapping group
- In the **Description** field, enter a description of the Document type mapping group
- In the **Mappings** fast tab, select **Add** to create a new record
- Select the **EDI Document type**
- Specify the trading partner's value in **Document type**, for example 'IN' for Sales invoice

## Where used
Used on the following EDI documents (field):
- Functional acknowledgement inbound (AcknowledgedDocumentTypeExternalId)
- Functional acknowledgement outbound (SourceDocumentTypeExternalId)

## Data entities
- Functional acknowledgement document type mapping
- Functional acknowledgement document type mapping lines


