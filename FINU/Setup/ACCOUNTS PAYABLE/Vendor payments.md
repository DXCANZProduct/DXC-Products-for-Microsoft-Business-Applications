---
# required metadata

title: [Finance Utilities ]
description: [Finance Utilities - Vendor Payments ]
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

##	Vendor Payments

The Vendor Payments form is used to set up and generate the EFT file from your Dynamics 365 environment. 
Within this form, you will set up the details regarding the vendor payment of the vendor account, that will be utilized when sending EFT file to your bank. 

Note: Only applicable to custom DXC Finance Utilities EFT formats
Some improvements to the AP EFT payment processing have been created, these include: 
-	Balance Line, Totaling functions on the EFT File format.
-	Auto Generating a Payment Reference for each EFT payment which can be traced in Vendor’s Bank Statement, AX Bank Transactions/Reconciliation and Payment Advice.
-	Vendor Bank Account Name used on EFT file instead of Vendor Name.
-	Payment Advice report, a specific EFT Remittance Advice report has been produced which can be auto emailed at time of generating the EFT File.
-	EFT File Name generation 

### 	EFT File Balance Line

**CASH AND BANK MANAGEMENT > BANK ACCOUNTS > BANK ACCOUNTS**

Note: Only applicable to custom DXC Finance Utilities EFT formats

DXC has parameterised the format of the last two balancing lines on EFT file payments. Standard Australian EFT file formats provided by Microsoft always include a balancing line; however, many Australian banks do not require it or require an additional totaling line. It also hardcodes the order of the dollar values in this total and so this enhancement allows both settings to be controlled through Bank account parameters.

-	Highlight the Bank Account from which EFT payment is drawn and click Edit.
-	Expand the Payment Management fast Tab:
-	Extra Balance Line on EFT - some banks require an additional ‘balancing line’ to be the second last line of the EFT file generated. If your bank requires this, then tick this box, otherwise leave it un-ticked.
-	Include Balance Line in Record Count – as per the above point, if the extra line is to be included in the last record line count, tick this field, otherwise leave blank. This option is only selectable when the above option has been checked.
-	Total Line Order – here you can determine the order of amounts on the balance line in the EFT file.  The following options are available:
 <br> o	Total net, total credit, total debit
 <br> o	Total net, total debit, total credit
 <br> o	Total credit, total debit, total net
 <br> o	Total debit, total credit, total net

###	Auto Generation of Payment Reference
This functionality populates the Payment Reference field in Accounts Payable Payment Journal automatically with a unique number on generation of the EFT payment file. Each payment line is unique regardless of the number of vendors during generation via EFT method of payment.

**ACCOUNTS PAYABLE > SETUP > PAYMENT SETUP > METHODS OF PAYMENT**

-	Auto payment reference number = Yes

**ACCOUNTS PAYABLE > SETUP > ACCOUNTS PAYABLE PARAMETERS**

-Number sequences > Payment reference

This number sequence “Payment Reference” will be used when generating payments for a method of payment which has the auto payment reference checkbox selected.
After the payment has been generated:
-	The Payment Reference number is reflected on the header of DXC Finance Utilities Payment Advice
-	Payment Reference field is populated on the journal lines
-	If the payment status is changed from Sent to None and the payment is generated again, a new payment reference number is generated and replaces the old on the journal line.
-	The payment advice when reprinted reflects the correct reference number

###	Vendor bank name
**CASH AND BANK MANAGEMENT > BANK ACCOUNTS > BANK ACCOUNTS**

Note: Only applicable to custom DXC Finance Utilities EFT formats

This setup will use the Vendor’s Bank Account Name instead of the Vendor’s Name when generating the EFT payment file.
•	Highlight the Bank Account from which EFT payment is drawn and click Edit.
•	Expand the Payment Management fast Tab and click on the Use <b> Vendor Bank Name </b> checkbox.
•	When Use vendor bank name checkbox is marked, the name on the Vendor Bank Accounts form will be used instead of the name in the Vendor Accounts form.

###	Vendor payment advice
A custom-built report has been developed to provide a remittance advice to vendors upon processing a payment run. The report will show the vendor bank account details where the payment is deposited, as well as the invoices numbers paid, what amount and what discount applied. This remittance advice report works in conjunction with the Smart Send Emailing functionality. The report is available when Payment status is Sent.

**ACCOUNTS PAYABLE > SETUP > FORMS > FORM SETUP**

Add the ‘Payment advice’ heading and the Report format selection. Select the DXC payment advice.

The Payment advice can be used in conjunction with sending via Email to the Vendor. Access to the new form is available from;
-	Accounts payable Payment Journal (from Accounts Payable > Payments > Payment journal – when set as Sent the journal line is available for printing
-	From the Posted payment journal
-	From the Accounts Payable Vendor transaction Enquiry

###	EFT File name generation
This modification is to automatically populate EFT file name based on the number sequence pattern.
File information fields will be automatically filled with the file name that has following pattern:
“BankAccountIdNumberSequence.FileFormat. 

**ACCOUNTS PAYABLE > SETUP > PAYMENT SETUP > METHODS OF PAYMENT**
-	Highlight applicable method of payment
-	Expand EFT Fast tab and click Enable file parameters checkbox
-	Enter file format, example txt

**ACCOUNTS PAYABLE > SETUP > ACCOUNTS PAYABLE PARAMETERS**
-	Number sequences > EFT file name

###	Payments
Added Vendor BSB and Vendor Account on the right for each Vendor payment. This could be used for reconciling payment details prior to generating the payment file.


