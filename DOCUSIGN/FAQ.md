---
# required metadata

title: Solutions for DocuSign and Dynamics 365 
description: solutions for DocuSign and Dynamics 365 - FAQ 
author: pmusumeci
Manager: Kym Parker
ms.date: 2023-08-22
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  DocuSign
audience: Application User
# ms.devlang: 
ms.reviewer: pmusumeci

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: pmusumeci
ms.search.validFrom: 2016-08-22
ms.dyn365.ops.version: 10.0.34 and above
---

# Frequently Asked Questions

**If more than one contact has the same purpose as my intended ESignature contact, what will happen?**

If more than one contact is assigned the same purpose then DocuSign will send the document to all email addresses that have the specified purpose.  Each recipient will be treated as an optional sign with no signature dependency or order. 

**What will happen if I send my document without including any Tags in the template's signatory details section?**
Users will be prompted to choose a tag from the available options and can set their placement 


###   Grant Consent Function

When selecting Grant consent you are taken to a page with the below error.

![went_wrong](/IMAGES/Went_wrong.png)

Log into your DocuSign Account and Navigate to the Settings Tab at the top.  
On the left-hand side select "Apps and Keys"
on the page under the Menu "Apps and Integration Keys" select Actions> View details on your App 
under App details edit the redirect URLs to include your Dynmics365 instance

### Dependency and Security Information

Data stored securely inside Finance and operations
- Docusign Authentication details
- Web service address, OAuth server URL
- Integrator key, RSA private key
- User ID, User name
- Logging of exceptions
- Document templates
