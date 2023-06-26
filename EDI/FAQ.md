---
# required metadata

title: EDI Core
description: EDI Core - Frequently asked questions
author: jdutoit2
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
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: IconEDI
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Frequently asked questions

### Where can I find contact information for support?
Support contact details can be located on the **Contact** tab at **Organization admininstration > Workspaces > Product support**

### Where can I identify the installed version of the EDI module?
Navigate to **Help & support > About**.  <br>
A list of installed models will be displayed on the **Version** tab.  Search for Sable 37 EDI. The version information will be displayed on the right (i.e. DXC EDI **10.0.34.202306151** (isv))
  
### Number sequences are not available to setup
To load all new number sequence references, select **Reset** on **Organization administration > Number sequences > Number sequences > Manual cleanup**

### Can I resend a document
Yes, an outbound staging record can be created again. Use the **Reset flag** and **Send to EDI** buttons on the source transaction.

### Refresh module
After each deployment, refresh module via **EDI parameters**. <br>
This will flush EDI caches and refresh EDI module metadata such as EDI document types, XML structures, field names etc. 

If you receive:
- XSD validation error 'The 'minOccurs' attribute cannot be present.': use **Reset structure** on your XML templates to fix XSD validation error.
- SQL errors: Run a db sync

### Download document type's header and lines fields
Quick method to download header and line fields for a document type: <br>
- Navigate to **EDI > Setup > Document types**. 
- Select the applicable document type.
- In FastTab **Staging metadata** select **Field upload**.
- Select the **Template** button and then **Download**.

### No document setting specified
Posting some transactions require an EDI document setting specified. <br>
If you receive error 'Update has been cancelled. No document setting specified.' please check if you have a 'Setting profile' assigned for the trading partner's document. <br>
Example: <br>
![EDI Trading partners](CORE/Image/NoDocSettingSpecified.png "EDI Trading partners")

### Module FAQ
The module specific FAQ can be found below. <br>
FAQ includes example errors and methods to fix.

- [Customer](CUSTOMER/INTRODUCTION/FAQ.md)
- [Vendor](VENDOR/INTRODUCTION/FAQ.md)
- [3PL](3PL/INTRODUCTION/FAQ.md)
- [Freight forwarder for Landed cost](FREIGHT-FORWARDER/INTRODUCTION/FAQ.md)
