---
# required metadata

title: [Finance Utilities ]
description: [Introduction to DXC Item Creation Wizard  ]
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

# 2	Item Creation
## 2.1	Setting up for Item Creation
### 2.1.1	Set up Parameters 

<b> Item creation > Setup > Item creation parameters > General (tab) </b>

<table style="width: 100%">
    <tr>
          <th WIDTH="30%"> <b> Field  </b>  </th>
          <th WIDTH="70%"> <b> Description </b> </th>
   </tr> 
   <tbody>
   <tr>
        <td colspan = "2"> Item creation </td>    	   
    </tr> 
    <tr>
       <td> <b> Delete product dimension value with a variant </b></td>     
       <td> What should happen when a product dimension value with an existing variant is deleted </td>   
    </tr>    
    </tbody>      
</table>

<b> Item creation > Setup > Item creation parameters > Shared number sequences (tab) </b>

<table style="width: 100%">
    <tr>
          <th WIDTH="30%"> <b> Field  </b>  </th>
          <th WIDTH="70%"> <b> Description </b> </th>
   </tr> 
   <tbody>
   <tr>
        <td> Creation number </td>    
        <td> Unique identifier for item creation. </td> 
    </tr> 
    <tr>
       <td> Import session </td>     
       <td> Unique identifier for import sessions creation. </td>   
    </tr>    
    </tbody>      
</table>

### 2.1.2	Set up Workflow

<b> Item creation > Setup > Item creation workflows </b>
1 workflow must be created.

1.	Item creation workflow - workflow must be created to <U> create/update items via manual input. </U>

2.	Item creation import workflow - workflow must be <U> created to create/update items in bulk via import. </U> 

Note: For information on how to create workflows please refer to the <U> standard Dynamics 365 Finance and Operations, Enterprise Edition functionality.  </U>
