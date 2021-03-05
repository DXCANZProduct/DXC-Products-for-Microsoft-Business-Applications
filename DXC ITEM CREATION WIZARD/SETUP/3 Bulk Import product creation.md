---
# required metadata

title: [DXC Item Creation Wizard ]
description: [DXC Item Creation Wizard -3	Bulk Import product creation]
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

# 3	Bulk Import product creation
Item creation is a complimentary solution to the standard Dynamics 365 Finance and Operations, Enterprise Edition process of creating products, product masters and releasing products.  It offers greater flexibility, control and efficiency.  In addition, the Item Creation can create multiple items at the same time via a .csv file template. 

## 3.1	 Setting up for Bulk Import Product Creation
### 3.1.1	Set up Parameters

<b> Item creation > Setup > Item creation parameters > Shared number sequences (tab) </b>

Create shared number sequences for the functionality that will be used within the Item Creation module. 

<table style="width: 100%">
    <tr>
          <th WIDTH="20%" > <b> Field </b>  </th>
          <th WIDTH=80%"> <b> Description </b> </th>
   </tr> 
   <tbody>
   <tr>
        <td > <b> Creation number </b></td>    
        <td > <b> Description </b> </td> 	   
    </tr> 
    <tr>
       <td> <b> Creation number </b></td>      	
       <td> Unique identifier for item creation.</td>   
    </tr>    
    <tr>
       <td> <b> Import session </b></td>     	
       <td> Unique identifier for import sessions creation. </td> 
    </tr> 
    </tbody>      
</table>
