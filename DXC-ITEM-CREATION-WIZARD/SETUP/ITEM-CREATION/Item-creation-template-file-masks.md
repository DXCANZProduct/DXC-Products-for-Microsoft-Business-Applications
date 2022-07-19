---
# required metadata

title: DXC Item Creation Wizard 
description: Introduction to DXC Item Creation Wizard - Item creation template file masks
author: liamcoll
manager: Kym Parker
ms.date: 2021-07-23
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCICCreationImportFileMask 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Item creation import file masks

The import file mask is used to set up the pattern of characters used to identify and match imported files to the fields included in the item creation template. Item creation import file masks can be reached by navigating to **Item creation > Setup > Item creation > Item creation import file masks**.

Multiple file masks can be included within a single template, though all files should be imported into D365 prior to initiating the creation process. 

|  **Field**  | **Description** | 
|:---|:---|     
|  **File mask**  | The name of the file to be uploaded. The file mask can end with a * to allow for files that match the mask on the leading characters. |  
|  **Description**  | A readable description that details the purpose of the mask, for where the *File mask* is not clear. |  
