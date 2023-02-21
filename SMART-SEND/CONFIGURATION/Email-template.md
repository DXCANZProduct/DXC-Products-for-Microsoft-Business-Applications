---
# required metadata

title: Smart Send
description: Smart Send - Email template
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SysEmailTable 
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Email template
The Smart Send feature utilizes, standard, Dynamics 365 for Finance and Operations [email templates](https://docs.microsoft.com/en-us/dynamics365/commerce/email-templates-transactions#create-an-email-template). It is necessary to configure at least one ‘Email template,’ to use the Smart Send features, and typically the email template used would be specific to the business form or report to be sent. 

The following new optional fields have been added:

|  **Field**  | **Description** | 
|:---|:---|     
|  **Additional email recipient**  | Specify an email address that will be appended to the “To” email address. |  
|  **Cc**  | Specify an email address to cc. |  
|  **Bcc**  | Specify an email address to Bcc. |  

In addition to the email addresses the Subject and Body of the email support token place holders. These placeholders will be dynamically replaced based on the context of the business form or report they it is running for. Refer to [Email Placeholder](Email_placeholder) for further detail on supported placeholder tags. It is recommended you create a template for each business form or report as they all have unique place holder tags.

Navigate to **Organization administration > Setup > Organisation email templates**
