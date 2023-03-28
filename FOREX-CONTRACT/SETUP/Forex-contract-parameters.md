---
# required metadata

title: Forex contract
description: Forex contract setup - Forex contract parameters
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-28
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_ForexContractParameters
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Forex contract parameters
The **Forex contract parameters** page is used to define settings that apply across the Forex contract module. These settings affect number sequences, and other behaviour. The setup on this page is set per legal entity and can be modified by users who have the appropriate security permissions.

To open the **Forex contract parameters** page, go to **Forex contracts > Setup > Forex contract parameters**. Then set the fields as described in the following subsections.

## General
The parameters control the operation for the module per legal entity.
The following table describes the fields that are available on the **General** tab of the **EDI parameters** page.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
<ins>**Warnings**</ins>           |
**Increase to a PO warning** 	    |	Pertains to value increase of Purchase orders which have Forex contracts attached. Set here if D365 must give a **Warning** or **Error** message when the increased Purchase order value exceeds the attached Forex contract amount.
**Expiry date warning**           |	Pertains to verification on whether due date on documents match with the expiry date of Forex contract. Set here if D365 must **Warn** or give an **Error** message when the due date and expiry date do not match.
<ins>**Cash in**</ins>            |
**Cash in journal**               |	The journal used to create cash in transactions.
**Default bank account**          |	Default bank account for cash in journals.

## Number sequence
Use the **Number sequences** tab on the **Forex contract parameters** page to assign number sequence codes to the Forex contracts module. The following table describes the purpose of each of those number sequences. For more information about number sequences, see [Number sequences overview](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/organization-administration/number-sequence-overview) and its related topics.

**Reference** 	                  | **Description**
:-------------------------------- |:-------------------------------------
**Forex number**                  |	Specify the number sequence used to allocate Forex Contract ID. <br> Limit of 10 characters.
