---
# required metadata

title: [Finance Utilities ]
description: [Finance Utilities - FAQ ]
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

# 	Frequently Asked Questions
## 	Version and Support Information


**Where can I find contact information for support?**
   
Support contact details can be located on the **Financial utilities parameters** page on the **About** tab. Users can navigate to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters**.
  
 **Where can I identify the installed version of the Finance utilities module**

On the Navigation bar, select **Settings > About**
A list of installed models will be displayed on the **Version** tab.  Scroll to **DXC Finance Utilities**. The version information will be displayed on the right (i.e. DXC Finance Utilities **10.0.240.2019443** (isv))


## 	Troubleshooting
### 	Bank statement doesn’t import

*Issue:*
Bank statement doesn't import.
 
*Resolution:*
To check bank account mapping, navigate to Cash and bank management > Setup > Advanced bank reconciliation setup > Bank statement format
Things to check:
1.	**Field delimiter** and **Record code field position** (if applicable). Else the fields can't be extracted and matched.
2.	**Custom format > Lines: Bank account number**. Compare:
- Import file's bank account: Does it contain bsb+account or just account?
- Company bank accounts: Bank account number field only (not bsb): Does it match to import file's bank account number? If import file contains bsb+account and your bank setup is split into bsb and bank account number fields, set up appropriate start position on **Custom format > Lines**.

### 	Generating AP payment - AuthenticationFailed
*Error:*
AP > Payments > Vendor receipt journal
When Generating AP payment:
<br>
<Error>

\<Code>AuthenticationFailed\</Code> <br>
\<Message> <br>
Server failed to authenticate the request. Make sure the value of Authorization header is formed correctly including the signature. <br>
\</Message> <br>
\<AuthenticationErrorDetail> <br>
Signature did not match. String to sign used was <br>
\</AuthenticationErrorDetail> <br>
\</Error> <br>

*Resolution:*
AP > Payment setup > Methods of payment
If **Enable file parameters** is set to _Yes_ on your Method of Payment, the **File format** requires a value.


### 	Payment advice report – Vendor bank details missing
*Issue:*
AP Payment advice doesn't show Vendor bank details:

*Resolution:*
Select the Finance utilities report on [Payment advice](Setup/ACCOUNTS%20PAYABLE/Vendor%20payments.md#payment-advice-report) report's Print management.

### 	Saving to secure location

If there is an error saving the file to secure location and **Stop processing on failure** was enabled on **Electronic reporting destination**, the processing will error and **Payment status** remains _None_. Example error: The process stopped because the delivery of file ‘%’ to the destination failed. The payments cannot be generated. <br>
Check setup on the applicable [Electronic reporting export connections](Setup/ACCOUNTS%20PAYABLE/Save%20electronic%20reporting%20file%20to%20secure%20location.md)

### 	Number sequences are not available to setup

To load all new number sequence references click the button **Reset** on: <br>
Organization administration > Number sequences. Select **Manual cleanup > Reset** on the Action Pane.
