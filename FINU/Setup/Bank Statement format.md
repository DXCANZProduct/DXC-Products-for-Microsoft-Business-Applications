---
# required metadata

title: [Finance Utilities ]
description: [Introduction to Finance Utilities-Bank Statement format ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
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

### 3.1.2 Bank Statement format

***<span style="font-variant:small-caps;">Cash and bank Management &gt;
Setup &gt; Advanced bank reconciliation setup &gt; BANK STATEMENT FORMAT </span>***

When the finance utilities parameter Enable custom bank statement formats is enabled, a new checkbox field customized format becomes active in the bank statement format form.  When the customized format is selected, the following below fields and buttons will also be activated

#### 3.1.2.1.	Fields
<table>
    <tr>
                 <td>  <b> Field </b> </ td> 
                 <td>  <b> Description</b> </ td>         
   </tr>
    <tr>
       <td> ABSR File type  </ td>    
       <td> Choose the file format of the bank statement – options include:   
            <br> -	Flat File  
            <br> - 	BAI2 File   
            <br> -	NAI File 
            <br> -	BRS 
            <br> -	Custom
       </ td>   
    </tr> 
    <tr>
       <td> Field delimiter   </ td>    
       <td> 
       The type of field delimiter the file uses. E.g. a comma “,”  
       </td>   
    </tr>
       <td> Record code field position  </ td>    
       <td> This field is active only if the ABSR file type is BAI2, NAI or BRS file. This field captures the position of the Line type code in each line of the file.
E.g. if Field Number =1, the first field of each line in the file determines the Line Type (i.e. 01, 02, 03, 16, 49, 98, 99).
    </td>   
      <tr>
       <td> Record code field length </td>    
       <td> Applicable to BRS Files as record length isn’t always 1 </td>   
    </tr> 
</table>


#### Note: 
When creating a bank statement format, processing group is mandatory (including finance utilities custom bank statement formats). Before configuring a custom bank format, a processing group linked to 'bank statements' must be created. Below are the steps to create such a processing group: 
1.	In the bank statement format, right click on processing group field and select the option 'View details' (There is no direct navigation to 'Processing group' form) 
2.	In the processing group form, create a new processing group 'Bank Statement' 
3.	Click 'entities' button 
4.	In the entities form, Add an entity 'Bank statements' and select the source data format 'XMLElement' 
5.	Click 'Save' button and close the form 
6.	Attach the processing group ‘BankStatement’ while configuring the bank statement format 
