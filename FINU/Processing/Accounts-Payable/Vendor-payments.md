---
# required metadata

title: Finance Utilities 
description: Accounts payable setup - Vendor Payments 
author: jdutoit2
manager: Kym Parker
ms.date: 2024-02-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  LedgerJournalTable5, VendPaymMode, BankAccountTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

**Accounts payable functionality**

The fields as described in the following subsections are available to control the additional functionality for accounts payable.

# Bank accounts

Some improvements to the Accounts Payable EFT payment processing have been created, these include the following setup on the Company's bank account.

This can be set per company bank account. To open the the **Bank accounts** page, go to **Cash and bank management > Bank accounts > Bank accounts**. <br>
Expand the **Payment management** FastTab and set the applicable fields under header **AP EFT parameters**:

### Balance line

> Note: Only applicable to custom Finance Utilities EFT formats **

Finance utilities has parameterised the format of the last two balancing lines on EFT file payments. Standard Australian EFT file formats provided by Microsoft always include a balancing line; however, many Australian banks do not require it or require an additional totaling line. It also hardcodes the order of the dollar values in this total and so this enhancement allows both settings to be controlled through Bank account parameters.

-	**Extra balance line on EFT** - some banks require an additional ‘balancing line’ to be the second last line of the EFT file generated. If your bank requires this, then enable this option.
-	**Include balance line in record count** – as per the above point, if the extra line is to be included in the last record line count, enabnle this field. This option is only selectable when the above option has been enabled.
-	**Total line order** – here you can determine the order of amounts on the balance line in the EFT file.  The following options are available:
 <br> o	Total net, total credit, total debit
 <br> o	Total net, total debit, total credit
 <br> o	Total credit, total debit, total net
 <br> o	Total debit, total credit, total net

### Vendor bank name

> Note: Only applicable to custom Finance Utilities EFT formats **

This setup will use the **Vendor bank account name** instead of the **Vendor name** when generating the EFT payment file.

-	Expand the Payment Management FastTab and select whether the EFT file should **Use vendor bank name**.

### User identification
Option to set the User identification to be used when generating the vendor payment.

# Methods of payment
The Method of payment form is used to set up and generate the EFT file from your Dynamics 365 environment. 

### File formats

> Note: Recommended to use Generic electronic reporting formats.

Finance utilities EFT formats: When setting up Vendor **Methods of payment** and setting **Generic electronic Export format** to _No_, Finance utilities currently provides the following export formats:
- ANZ Direct Credit Service (AU)
- CBA Direct Credit Service (AU)
- NAB Direct Credit Service (AU)
- STG Direct Credit Service (AU)
- WBC Direct Entry System (AU)
- ANZ Direct Credit Service (NZ)
- ANZ Domestic Credit Payment (NZ)
- ASB Payment (NZ)
- BNZ Direct Credit Service (NZ)
- HSBC Payment (NZ)
- NAT Direct Credit Service(NZ)


### Automatic generation of payment reference
This functionality populates the **Payment reference** field in the Accounts payable Payment journal line automatically with a unique number when generating the EFT payment file. Each payment line is unique regardless of the number of vendors during generation via EFT method of payment.

The following setup is required.
- On the **Methods of payment** page, set **Auto payment reference number** to _Yes_.
- On the **Accounts payable parameters** page, select the **Number sequences** tab, and set a number sequence for **Payment reference**.

This number sequence Payment reference will be used when generating payments for a method of payment which has the auto payment reference checkbox selected.
After the payment has been generated, the Payment reference number is reflected on: 
- Header of the Finance Utilities [**Payment Advice**](#payment-advice-report) report
-	Populated on the Payment reference field on the journal lines

> Note: If the payment status is changed from Sent to None and the payment is generated again, a _new_ payment reference number is generated and replaces the old on the journal line. The payment advice when reprinted reflects the correct reference number

### EFT file name generation

> Note: Applicable to custom Finance Utilities EFT formats and Electronic reporting formats

This modification is to automatically populate EFT file name based on the number sequence pattern.
File information fields will be automatically filled with the file name that has following pattern:
File name when **Enable file parameters** is set to:
- **Yes**: 'File name mask' & **NumberSequence**.FileFormat
- **No**
    - Finance Utilities EFT formats: 'Method of payment' & 'Bank account' & 'Date/time'
    - Electronic reporting formats: Blank

1. Set the **Number sequence** in the **Accounts payable parameters**
    - On the Number sequence FastTab, set a sequence for **EFT file name**

2. Set whether the method of payment should automatically generate a filename for the EFT file. To open the the **Methods of payment** page, go to **Accounts payable > Setup > Payment setup > Methods of payment**.
    -	Highlight applicable method of payment
    -	Expand **EFT** FastTab and set **Enable file parameters** to _Yes_.
    -	File name mask. Default when **Enable file parameters** is enabled: BankAccountId. Use **Editor** to edit the default.
    -	Enter **File format**, example txt

**Editor** button can be used to edit the file name mask. A combination of static values and placeholders can be assigned.

- [Sundry method of payment](Sundry-payment.md)
- [BPAY method of payment](BPAY-payment.md)

# Vendor payment journal
The following Vendor payment journal fields are populated by Finance Utilities Accounts Payable functionality: 
- **Lodgement reference** - [BPAY method of payment](BPAY-payment.md)
- **Export file name** - When the vendor payment is generated, the Export file name displayed on the Generate payments dialog is written to the relevant vendor payment journal lines
     - Note: This does not yet include file names generated by Electronic reporting config.
- **Payment reference** - [Details](#automatic-generation-of-payment-reference)

# Payment advice report
A custom-built report has been developed to provide a remittance advice to vendors upon processing a payment run. The report will show the vendor bank account details where the payment is deposited, as well as the invoices numbers paid, what amount and what discount applied. This remittance advice report works in conjunction with the **Smart Send** Emailing functionality. The report is available when Payment status is Sent.

Users can select to use the custom-build report by navigating to **Accounts payable > Setup > Forms setup**. <br>
On the **General** tab, select **Print management**. <br>
Expand **Module - accounts payable** and select **Payment advice**. If a record doesn't exist for the document, right-click and select **New**. 
A new original or copy record is displayed. In field **Report format**, select the applicable Finance utilities payment advice report.
If feature 'Enable batch processing for bank payment advice reports' is:
- Disabled - user will be able to select report **ECL_BankPaymAdviceVend.Report**
- Enabled - user will be able to select report **ECL_BankPaymAdviceVendV2.Report**

The Payment advice report can be used in conjunction with sending via Email to the Vendor. Access to the new form is available from;
-	Accounts payable payment journal (from Accounts Payable > Payments > Payment journal – when set as Sent the journal line is available for printing
-	Vendor's transactions
-	Payment history on the vendor

# Payments report
When creating a **Vendor payment journal**, it can be useful to print the **Payments** report to reconcile vendor bank details, before generating the EFT file.
Finance utilities has added the following fields on the right for each Vendor payment line:
- Vendor bank name
- Vendor BSB
- Vendor account

No setup is required to enable the additional fields on the report.


