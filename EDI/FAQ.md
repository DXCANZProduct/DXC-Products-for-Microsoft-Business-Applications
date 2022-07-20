---
# required metadata

title: EDI Core
description: EDI Core - Frequently asked questions
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  NumberSequenceTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Frequently asked questions

### Version and Support Information
-	Where can I find contact information for support?
    - Support contact details can be located on the EDI parameters form on the About tab.
- Where can I identify the installed version of the EDI module
   - Navigate to Settings > About.  A list of installed models will be displayed on the Version tab.  Search for Sable 37 EDI. The version information will be displayed on the right (i.e. Sable37 EDI 10.0.14.202009181 (isv))
  
### XML Errors
- XML file errors when processed into the staging table
  - Check the data provided for each element is valid. (i.e. A null value for a ‘date’ element, will fail the XSD validation)

### Number sequences are not available to setup
To load all new number sequence references, select **Reset** on **Organization administration > Number sequences > Number sequences > Manual cleanup**

### Module FAQ
The module specific FAQ can be found here:
- [Customer](CUSTOMER/INTRODUCTION/FAQ.md)
- [Vendor](VENDOR/INTRODUCTION/FAQ.md)
- [3PL](3PL/INTRODUCTION/FAQ.md)
- [Freight forwarder for Landed cost](FREIGHT-FORWARDER/INTRODUCTION/FAQ.md)
