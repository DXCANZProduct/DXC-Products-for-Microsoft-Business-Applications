---
# required metadata

title: Finance Utilities 
description: Accounts payable processing - Save Electronic reporting file to secure location 
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  Finance Utilities 
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Accounts payable functionality
The features as described in the following subsections are available to control the additional functionality for accounts payable.

## Save electronic reporting file to secure location
Setup requirements are discussed in detail at [Save electronic reporting file to secure location setup](../../Setup/ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md). <br>
Generating the payments are discussed in the following subsections.

## Generate payment
When selecting **Generate payments** for a vendor payment journal that is using a **Method of payment** set to save the GER file to a secure location, the **Archive** destination is defaulted.

If there is an error saving the file to secure location and **Stop processing on failure** on the **Electronic reporting destination** was enabled, the processing will error and **Payment status** remains None. Example error ‘The process stopped because the delivery of file ‘%’ to the destination failed. The payments cannot be generated.’

