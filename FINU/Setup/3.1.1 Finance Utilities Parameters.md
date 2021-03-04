---
# required metadata

title: [Finance Utilities ]
description: [Introduction to Finance Utilities Parameters]
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

# 3. Advanced Bank Statement Functionality
## 3.1 Setup
### 3.1.1 Finance Utilities Parameters

***<span style="font-variant:small-caps;">Cash and bank Management &gt;
Setup &gt; Advanced bank reconciliation setup &gt; Financial utilities
parameters</span>***

The Financial utilities parameter controls the functionality related to
finance utilities. The Finance utilities parameter contains the
following fields;

<table>
    <tr>
                 <td > <b>Field </b> </ td> 
                 <td> <b> Description </b> </ td>         
   </tr>
    <tr>
                 <td colspan = "2"> Reconciliation matching rule </ td>    
    </tr>
    <tr>
       <td> Extended matching rule operator  </ td>    
       <td> This parameter activates a new operator Included in in the Reconciliation matching rules form. It supplements the Contains capability, and means that the field selected is a part of the nominated Bank statement field.  </ td>   
    </tr> 
    <tr>
       <td> Extended financial details for new transaction   </ td>    
       <td> This parameter enables the capture of the following details automatically if the bank statement line is marked as ‘New’ 
            <br> -	Financial dimensions 
            <br> - GST  
            <br> - Sub-Ledger offset account
      </ td>   
    </tr>     
    <tr>
                 <td colspan = "2"> <b> Bank reconciliation </b></ td>    
    </tr>
    <tr>
       <td> Enable custom bank statement formats  </ td>    
       <td> This parameter enables a Customized format field in bank statement format form. 
If the bank statement format is marked as a customised format, additional fields become active to configure the BAI2/NAI/Flat file statement upload 
      </ td>   
    </tr>   
      <tr>
       <td> Auto-post bank statement  </ td>    
       <td> When Auto-post bank statement is YES, the bank statement will automatically be posted upon selecting Mark as reconciled from the Bank Reconciliation Worksheet form.
      </ td>   
    </tr>       
</table>
