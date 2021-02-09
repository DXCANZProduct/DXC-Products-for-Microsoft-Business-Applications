---
# required metadata

title: [Docusign]
description: [Setup Parameters]
author: [ndavidson2]
manager: Kym Parker
ms.date: 12/01/2020
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


# Templates

Docusign templates provide the configuration of various documents inside of D365.  Templated determine whether the document should be authorised by external users, internal users, or both.  Templates also identify the order of authorization and the details of the information and placement of *signatory* information.  At least one template must be created in order to use this module; however multiple templates can be created depending upon business requirements.  Templates are created by going to the **Organization Administration > Setup > Docusign > Templates** page.

## Overview ##

On opening the page, the templates overview shows all of the available templates that have been created.


| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Template**                      | Select the Unique ID that will be the template name.   |
| **Description**                   | A description of the template.     |
| **Signing sequence**              | The sequence of signing of the *Docusign* document that will be sent.  Three options are available for signing: <br> <br> **External only** - only parties external to the business will sign the document. <br> **External/Internal** - both external and internal parties must sign th edocument. The external parties must complete their requirements first. <br>  **Internal** - Internal parties will sign the document. | 


When creating a new Docusign template, a new page will open to allow users to create a new template.   There are three sections on the *New Record*  Templates page view.  The **Template** section contains the templates overview information outlined above.  There are two additional sections available for creating templates and will be outlined below.

## Signatories ##

In the **Signatories** section, you will enter the parties that will sign the document,  the order of completion, and if there are any dependencies in signing.  Multiple parties can be set up in this section to sign a document. The number and type of signatories are defined the **Template** section.   

To add a signatory to the template, select the **Add** action in the signatory section. 

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Sorting**                      | The sorting number determines the order the document will be signed.  This will allow users to define if the order will be signed internally or externally first.  The **Sorting** field works in conjunction with **Dependency** field to identify the order documents are sent through *Docusign*.   |
| **Description**                   | A description of the signatory. This will be a description of the person who will be signing the document, such as a Purchasing agent or Sales Manager.     |
| **Depedency**              | If there is a dependency required, enter the **sorting** value of the signatory.  This number will determine who signs a document first, and every subsequent signatory. | 
| **Type**                          |  Enter the **Type** of the party that will sign the document.  <br> <br> *External* will be a party external to the business. <br> <br> *Internal* will be a party within the business. | 
