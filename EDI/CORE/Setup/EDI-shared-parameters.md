---
# required metadata

title: EDI Core
description: EDI Core - Setup EDI shared parameters
author: jdutoi2
manager: Kym Parker
ms.date: 2020-01-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDISharedParameters
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

# EDI shared parameters
The **EDI shared parameters** page is used to define settings that apply across the **EDI** module. The setup on this page is shared across legal entities and can be modified by users with the appropriate security permissions.

To open the **EDI shared parameters** page, go to **EDI > Setup > EDI shared parameters**. Then set the fields as described in the following subsections.

## Prerequisites ##
* Setup [Cleanup profile](Cleanup-profile.md)
* Setup [Reset status profile](Reset-status.md#setup-reset-status-profile)

## Setup EDI shared parameters
The following table describes the fields that are available on the **General** tab on the **EDI shared parameters** page.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
<ins>**Cleanup**</ins>            |
**Cleanup profile**	              | Specify the default cleanup profile that will apply to all inbound and outbound staging records. <br> Can be overridden on Trading partner or Trading partner’s document level. <br> This field can also be left blank here and selected on only the specific Trading partner or Trading partner’s document level. <br> _Note: Setup the periodic job to run the cleanup/delete of staging records via **EDI > Periodic tasks > Cleanup documents**_
<ins>**Reset status**</ins>       | 
**Documents reset status**        |	Assign default Reset status profile for all staging documents. <br> Can be overridden on Trading partner’s document level. <br> This field can also be left blank here and selected on only the specific Trading partner’s document level. <br> _Note: Setup the periodic job to run the reset status of staging records via **EDI > Periodic tasks > Reset document status**_
**Files reset status**            |	Assign default Reset status profile for all inbound and outbound files. This field can't be specified/overridden on a Trading partner's document level. <br> _Note: Setup the periodic job to run the reset status of inbound and outbound files via **EDI > Periodic tasks > Reset document status**_
<ins>**Options**</ins>            |
**Enable XLST scripting**         |	Option to enable scripting for XLST. If not enabled and scripting is used on XLST document, it will error with _Execution of scripts was prohibited_
