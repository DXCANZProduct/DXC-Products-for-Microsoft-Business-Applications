---
# required metadata

title: Finance Utilities 
description: Introduction to Finance Utilities 
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-03-25
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# DXC Finance Utilities

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction
The DXC Finance Utilities module provides enhanced functionalities to Microsoft Dynamics 365 for the following:

-   **Cash and bank management**
    -   Bank statement import formatting
    -   Advanced bank reconciliation, including:
        -   Extended matching functionality, including improved handling of Marked and Matched transactions
        -   Additional capability when using ‘Mark as new’ facility
        -   Ability to reconcile a small balance correction adjustment
        -   Ability to prevent reconciliation of unmatched statements
    -   Periodic task to automatically import bank statements from FTP/FTPS, SFTP or Azure blob. Decryption option included.
-   **Accounts payable**
    -   Sundry vendor payment management
    -   BPAY vendor payment
    -   Formatted Vendor Payment Advice
    -   ABN lookup and validation (Australia only)
    -   IRD number validation (New Zealand only)
    -   Save GER to secure location, for example FTP/FTPS, SFTP or Azure blob. Encryption option included
    -   Self billing invoicing / Recipient-Created Tax Invoice (RCTI)
- **Accounts receivable**
    -   Customer bank account changes workflow
    -   ABN lookup and validation (Australia only)
    -   IRD number validation (New Zealand only)
    -   Customer references
    -   Option to use Customer's payment terms for Due date on Interest notes
    -   Import customer remittance files (additional licensed feature included in AR Utilities)
- **Budgeting**
    -   Budget import with separate column for each period


#  Cash and bank management
## Bank statement import and reconciliation

The Cash and Bank Management department can build bank statement format matching with the bank account statement files generated by Bank(s). The finance utilities provide a simplified platform to define the bank statement format definition for various file types.
DXC Finance Utilities supports the following formats:
-	Flat file
-	NAI
-	BAI2
-	Custom
-	BRS
-	GHS

The Custom format provides some flexibility on configuring additional formats.

The Bank account statements can then be imported into Dynamics 365 based on the statement format definitions. 
 
Matching rules can be executed either during or after the import, to automatically match the bank statement transactions to Dynamics 365 bank transactions. Also, bank transactions can be automatically created, posted and reconciled based on configured matching rules. 
 
Finance utilities minimises the manual actions required for reconciling bank account statement(s) with bank transactions processed in Dynamics 365FO. 

#### Setup
- [Financial utilities parameters](Setup/CASH-AND-BANK-MANAGEMENT/Finance-utilities-parameters.md)
- [Bank statement format](Setup/CASH-AND-BANK-MANAGEMENT/Bank-statement-format.md)
- [Populate accounts payable document number](Setup/CASH-AND-BANK-MANAGEMENT/Populate-account-payable-payment-document-number.md)
- [Bank reconciliation matching rules](Setup/CASH-AND-BANK-MANAGEMENT/Bank-reconciliation-matching-rules.md)
- [Customer payment and settle of one invoice via bank reconciliation](Setup/CASH-AND-BANK-MANAGEMENT/Bank-reconciliation-matching-rules.md#customer-payment-and-settle-of-invoice-11)

#### Processing
- [Bank statement import](Processing/Bank-Statement-Reconciliation/Bank-statement-import.md)
- [Bank reconciliation worksheet](Processing/Bank-Statement-Reconciliation/Bank-reconciliation-worksheet.md)
- [Reports](Processing/Bank-Statement-Reconciliation/Cash-and-bank-management-reports.md)

#### Setup for automatic import of bank statement
- [Encryption/decryption](Setup/ENCRYPTION/Encryption-decryption.md) - where the import file should be decrypted
- [Financial utilities connections](Setup/CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md)
- [Bank accounts](Setup/CASH-AND-BANK-MANAGEMENT/Bank-accounts.md)
- Periodic task [Import bank statements via financial utilities connection](Setup/CASH-AND-BANK-MANAGEMENT/Bank-statement-import.md)

# Accounts payable
## Sundry vendors

The Sundry Payment modification gives the user the ability to enter a supplier name and address on an individual invoice allowing these details to be used on a cheque payments, as well as one-off BSB and Account Number for EFT Payments. Therefore, many one- time vendor invoices can be stored on one sundry vendor record but allowing for separate payments without a change to the vendor record information.  This also makes it possible to pay all sundry invoices in one payment proposal.

- [Sundry setup](Setup/ACCOUNTS-PAYABLE/Sundry-payment.md)
- [Sundry processing](Processing/Accounts-Payable/Sundry-payment.md)

## BPAY

The BPAY method of payment modification provides the ability to set BPAY required fields on the Vendor and Company bank account. Flagging the method of payment as BPAY, sets the BPAY fields as mandatory for invoice transactions. 

When invoice transactions are created for vendors with a BPAY method of payment, the BPAY fields are auto populated from the Vendor details. The BPAY fields can also be entered or edited at time of invoice entry. Posting validation confirms all mandatory BPAY fields are entered else the posting will fail. 

Within the Vendor payment proposal, grouping also occurs for the new BPAY field.

- [BPAY setup](Setup/ACCOUNTS-PAYABLE/BPAY-payment.md)
- [BPAY processing](Processing/Accounts-Payable/BPAY-payment.md)

## Save Vendor payments file to secure location

Where the **Method of payment** file uses Generic electronic Export format, the **Generate payments** file can be sent to a secure location like ftp, ftps, sftp, azure blob or api endpoint.<br>
See [link](#save-electronic-reporting-file-to-secure-location) for more details.

File can be PGP encrypted (optional).

## Payment advice report

A custom-built report has been developed to provide a Payment advice to vendors upon processing an EFT payment run. The report will show the vendor bank account details where the payment is deposited as well as the invoice numbers paid, what amount and what discount applied. This remittance advice report works in conjunction with the Smart Send function.

- [Vendor payments setup](Setup/ACCOUNTS-PAYABLE/Vendor-payments.md)

## Vendor bank account changes workflow

Finance utilities have added additional fields to **Vendor approval** and **Vendor bank account approval** on the **Accounts payable parameters**. <br>
This provides companies the option to submit changes to these fields to the standard vendor approval workflows.
- [Vendor bank account changes worklow setup](Setup/ACCOUNTS-PAYABLE/Vendor-bank-account-changes-workflow.md)


## Self billing invoicing / Recipient-Created Tax Invoice (RCTI)
Provides the ability to automatically create a Purchase invoice for Product receipt(s)
- [Setup](Setup/ACCOUNTS-PAYABLE/Self-billing-invoicing.md)
- [Processing](Processing/Accounts-Payable/Self-billing-invoicing.md)

# ABN and IRD number validation

## ABN lookup and validation
> Note: Only applicable to Australia. 

Where the company has registered to use ABN lookup Web API and the legal entity setup in D365, it is possible to lookup and validate customer and vendor’s ABN in D365.
- [ABN lookup and validation setup](Setup/ABN/ABN-lookup-and-validation.md)
- [ABN lookup and validation processing](Processing/ABN/ABN-lookup-and-validation.md)

## IRD number validation
> Note: Only applicable to New Zealand. 

Where the company has enabled IRD number validation for the legal entity.
- [IRD number validation setup](Setup/ABN/IRD-number-validation.md)
- [IRD number validation processing](Processing/ABN/IRD-number-validation.md)


# Accounts receivable
## Customer references

Ability to set multiple references against customers. These references can be used in the following scenarios:
- Customer remittance file refers to a reference unique to the customer, but not an invoice number. This reference can be used to find the applicable customer account when creating the customer payment journal while importing customer remittances using the additional licensed feature AR Utilities.
- Roadmap: Reconciliation matching rules additional ability to use the customer reference to find the applicable customer account when creating the customer payment journal.

Detail:
- [Customer reference setup](Setup/ACCOUNTS-RECEIVABLE/Customer-reference.md)

## Interest notes Due date
Ability to use Customer's payment terms when posting Interest notes. 

- [Customer parameters setup](Setup/ACCOUNTS-RECEIVABLE/Customer-parameters.md)

## Import customer remittance
> Note: Additional feature included in AR Utilities. If you are licensed for Finance Utilities, this extra feature can be added to your license on request.

Enhancement to import customer remittance files using data entity Customer payment journal.
- [Import customer remittance setup](Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md)
- [Import customer remittance processing](Processing/Accounts-Receivable/Customer-remittance.md)

# Budgeting
## Budget import

Ability to import budget file with monthly columns.
The modification gives the user the ability to set the budget import file's format and financial dimensions included in the file.

- [Budget import setup](Setup/BUDGETING/Budget-import.md)
- [Budget import processing](Processing/Budgeting/Budget-import.md)
- [Example file format](Processing/Budgeting/Example-file-format.md)

# Electronic reporting

## Save electronic reporting file to secure location

Modification allows users to automatically save the electronic reporting file to a secure location like ftp, ftps, sftp, azure blob or api endpoint.
- [Encryption/decryption](Setup/ENCRYPTION/Encryption-decryption.md) - where the export file should be encrypted
- [Save electronic reporting file to secure location setup](Setup/ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md)
- [Save electronic reporting file to secure location processing](Processing/Accounts-Payable/Save-electronic-reporting-file-to-secure-location.md)

# Encryption / decryption

##  Encrypt electronic reporting file with export
- [Encryption/decryption](Setup/ENCRYPTION/Encryption-decryption.md) - Encryption / Decryption setup
- [Connection](Setup/ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md) - Use the encryption on the export connection

## Decrypt inbound file with import
- [Encryption/decryption](Setup/ENCRYPTION/Encryption-decryption.md) - Encryption / Decryption setup
- [Connection](Setup/ACCOUNTS-PAYABLE/Setup/CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md) - Use the decryption on the import bank statement connection
- [Connection](/Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.html#financial-utilities-connection) - Use the decryption on the import customer remittance connection


# Other

### Data entities
Finance utilities include data entities to support its enhancements to D365.
The data entities include Finance utilities tables and also enhances existing standard entities.

- [Data entities](Other/Data-entities.md)

### Security configuration

The following roles are included in the Finance utilities module: 
- Finance utilities manager
- Finance utilities clerk

## FAQ

See our FAQ for general information and troubleshooting.

- [FAQ](FAQ.md)

## New ideas
Have a suggestion for new product or new feature for existing product? [Suggest a New idea](https://forms.office.com/r/U9twpSt3in)


