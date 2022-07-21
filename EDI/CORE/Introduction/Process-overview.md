---
# required metadata

title: EDI Process overview
description: Overview of the EDI import and export process
author: jdutoit2
manager: Kym Parker
ms.date: 2021-07-21
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

# Process Overview

## Import process overview
The Trading partner or VAN will place data into a ‘cloud accessible’ location (i.e. FTP, SFTP or Azure blob) and D365 will periodically import these files into an inbound document staging area for processing.

D365 will use templates to read the data from the inbound documents and create staging data. The staging data is then processed into target documents within D365 and standard application processing rules are applied.

![EDI import process](../Image/Core_ImportProcess.png "EDI import process")

## Export process overview
An event in D365 will trigger an EDI document to be evaluated. If the document is enabled (based on an associated Trading partner) D365 will create staging data from the event’s information (i.e. invoice posting, picking list posting).

Once the staging data is created an appropriate template is applied to generate an EDI document file and placed into the outbound documents queue. 

The outbound documents queue is periodically processed, and the files are placed into their setup destinations for the Trading partner or VAN to retrieve.

![EDI export process](../Image/Core_ExportProcess.png "EDI export process")
