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

# 8.	Frequently Asked Questions
## 8.1.	Version and Support Information

  -		Where can I find contact information for support?
    <br> o	Support contact details can be located on the Finance Utilities parameters form on the About tab.
  -	Where can I identify the installed version of the Finance Utilities module
    <br> o	Navigate to Settings > About.  A list of Loaded Packages and their models will be displayed.  Search for and expand DXCFinanceUtilities. The version information will be displayed on the right (i.e. DXC Finance Utilities 10.0.240.2019443 (isv))


## 8.2.	Troubleshooting
### 8.2.1.	Bank statement doesn’t import

<U> Issue: </U>
Bank statement doesn't import.
 
<U> Resolution: </U>
Usually the issue is with the bank account number or date (import date doesn't match file's date).
To check bank account:
Cash and bank management > Setup > Advanced bank reconciliation setup > Bank statement format
Please compare your setup to similar format in our latest Product test environment: 
<U> Current Test Environments in DXC Eclipse ANZ IP </U>
Things to check:

1.	'Field delimiter' and 'Record code field position' (if applicable). Else the fields can't be extracted and matched.

2.	Custom format > Lines: Bank account number. Compare:

Import file's bank account: Does it contain bsb+account or just account
Bank accounts: Bank account number field only (not bsb): Does it match to import file's bank account number?
Bank statement format > Lines > Bank account number. If import file contains bsb+account and your bank setup is split into bsb and bank account number fields, set up appropriate start position.

### 8.2.2.	Generating AP payment - AuthenticationFailed
<U> Error: </U>
AP > Payments > Vendor receipt journal
When Generating AP payment:
<br>
<Error>

<Code>AuthenticationFailed</Code>
<br>
<Message>
Server failed to authenticate the request. Make sure the value of Authorization header is formed correctly including the signature. RequestId:c32c9282-f01e-001f-7992-307f2f000000 Time:2019-07-02T04:53:06.7210430Z
<br>
</Message>
<br>
<AuthenticationErrorDetail>
Signature did not match. String to sign used was r 2019-07-02T04:48:06Z 2019-07-02T04:58:06Z /icontest101b5352042be59a/temporary-file/{07E4FA8A-CF12-4259-8472-294E81A18189}/USMF OPER000143 2014-02-14 attachment
</AuthenticationErrorDetail>
<br>
</Error>
<br>
<U> Resolution: </U>
AP > Payment setup > Methods of payment

If 'Enable file parameters' is Yes on your Method of Payment, the 'File format' requires a value:


### 8.2.3.	AP Payment advice – Vendor bank details missing
<U> Issue: </U>
AP Payment advice doesn't show Vendor bank details:

<U> Resolution: </U>
If a payment advice is generated prior to installing DXC Finance Utilities, the payment advice defaults to standard D365 report.

To fix via Interface (planned for next release): Update print management (AP > Setup > Forms > Form setup)  to: ECL_BankPaymAdviceVend.Report 

If fixing via Interface doesn’t work, a developer can fix in SQL table PrintMgmtReportFormat.
Payment advice uses default D365 payment advice with records where System = 0

Run select * from PrintMgmtReportFormat

Find the below records.

Update Green circle to 1

### 8.2.4.	Saving to secure location

If there is an error saving the file to secure location and Stop processing on failure was enabled the processing will error and Payment status remains None. Example error ‘The process stopped because the delivery of file ‘%’ to the destination failed. The payments cannot be generated.’
Check setup on the applicable Electronic reporting export connections

### 8.2.5.	Number sequences are not available to setup

To load all new number sequence references click the button:
<br> Organization administration > Number sequences > Number sequences > Manual cleanup > Reset </br>
