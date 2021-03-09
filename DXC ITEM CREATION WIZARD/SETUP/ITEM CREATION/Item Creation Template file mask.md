---
# required metadata

title: [DXC Item Creation Wizard ]
description: [Introduction to DXC Item Creation Wizard - Setting up Item Creation Templates ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DXC Item Creation Wizard ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [helenho]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

#### Setting up Item Creation Templates
##### Create Import File Masks

The View/New/Update import Items file mask is used to set up the pattern of characters used to match the import files within your Dynamics 365 environment.
Within this form, you will set up the new items attributes and etc before creating the template. 
Y
ou can reach the Item creation import file masks form by navigating to 

**Item creation > Setup > Item creation > Item creation import file masks**

Import file name masks need to be created in the system. You need to specify masks for all the files you will be creating and using for the bulk item upload templates. 

*Note: Import file mask ‘Attrib*’ *will look in the folder location specified for any files beginning with ‘Attrib’*

1.	Click the **New** button. 
2.	In the **File Mask field** enter the name of the .csv file to be uploaded. The file mask can end with a * to allow for numbering of files. 
3.	The **Description** allows for a description of the file mask. 
