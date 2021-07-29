---
# required metadata

title: [Smart Send]
description: [Smart Send - Email template]
author: [Liam Coll]
manager: Kym Parker
ms.date: 29/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Smart Send]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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

Navigate to **Organization administration > Setup > Email templates**
