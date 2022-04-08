---
# required metadata

title: [Topic name]
description: [Full description that appears in the search results. Often the first paragraph of your topic.]
author: [author's GitHub alias]
manager: AnnBe
ms.date: 06/20/2017
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Pick one: Application User/Developer/IT Pro]
# ms.devlang: 
ms.reviewer: [Content Strategist microsoft alias]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

#  Print Management

Within the print management forms in standard D365, users will be able to set documents to utilize Docusign as the default output location.  On the **Print Management** form, a new destination has been added to the relevant documents, called *Docusign*.  This destination must be used in order to set the email addresses that will be used for document recipients.

Within the Printer Settings for Print Management, the *Docusign* option will allow you to set the following:

- **To** - The email address for the document signatories. Docusign will identify the order of the signatories in this field.  The first email entered here will be associated with first signatory set in the **Templates** form.  Each subsequent email in this field will be assigned to each of the subsequently defined signatories.  
- **CC** - The email address for the CC of the document signatories.  
- **Subject** - Enter the subject line that will be used for the document.

In addition to being able to hard-code email addresses into the **To** and **Cc** fields, users have the option of setting the email address to an external **Purpose** or an internal **Worker title**.  The **Purpose** field provides a drop-down of the Roles associated to Customers or Vendors contacts.  These are set on the **Customer** or **Vendor** pages, respectively.  The **Worker title** field is a drop-down of the all of the availabe **worker titles** in the Employee setup forms.  The **worker title** is set on each employee record.  

