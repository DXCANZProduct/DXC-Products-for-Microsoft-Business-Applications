---
# required metadata

title: License manager 
description: License manager - FAQ 
author: hho34
manager: Kym Parker
ms.date: 2023-06-07
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# 	Frequently Asked Questions

## Version and Support Information
Where can I find contact information for support?
Email: ECLANZProductSupport@dxc.com

## 	Troubleshooting
1. Prompt with fix connection when accessing the Power App.   
![License Manager PowerApp Connection Failure](IMAGES/PowerAppConnectionFailure.png "PowerAppConnectionFailure")
The Power App platform requires consent to authenticate and provide access to the license manager service. This prompt appears everytime a new session is started to an existing session expires due to no user input. The standard expiration time for the access token is 60 minutes. While the app is in use, it will be able to auto-refresh the access token.  
1. Connection error when accessing Power App after a new release is applied
![License Manager PowerApp Connection Failure](IMAGES/PowerAppConnectionFailure.png "PowerAppConnectionFailure")
Please refer to the instalaltion instructions located at the end of this documentation [here](./PowerApp.md). For detailed technical documentation, please email the support team, ECLANZProductSupport@dxc.com
1.	I can’t save ‘Customer Products’.
Reason: Field ‘Site (Module) License’ is set to Off OR ‘No. of users’ field is blank

Beore:
![RFQ](IMAGES/CustomerProduct.png "CustomerProduct")

After:
![RFQ](IMAGES/CustomerProductAfter.png "CustomerProductAfter")

![RFQ](IMAGES/CustomerProductAfterOn.png "CustomerProductAfterOn")
