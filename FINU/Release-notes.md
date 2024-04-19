---
# required metadata

title: Finance Utilities
description: Finance Utilities - Release notes
author: jdutoit2
manager: Kym Parker
ms.date: 2024-04-19
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Next version

### Release 10.0.37.20240325

#### Build 10.0.37.202403252
Estimated release date: 30 April 2024 <br>

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
17385		| Cash and bank management	| Reconciliation matching rule | Ability to set a **Description** mask for Mark new transactions for offset types **Ledger, Vendor and Bank**. <br> Related to 17290 that added this functionality for offset type Customer.  <br> **Editor** provides the ability to set a combination of static fields and placeholders: <br> • Currency <br> • Description <br> • Amount <br> • Document number <br> • Entry reference <br> • Bank statement transaction code <br> • Reference No. <br> • Related bank account <br> • Name (Trading party) <br> • Bank account <br> • Bank account number <br> • Bank groups <br> Note: If File name mask is not populated, the Bank statement line's Description will be written to new transaction's Description. <br> ![Recon matching rule](Images/ReleaseNotes_20240329_3.png "Recon matching rule")

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
17633		| Accounts receivable	| Interest notes - Due date | When AR parameter setting 'Use Customer payment terms' was set to _Yes_, it resulted in incorrect due dates for Free text invoices. <br> Only relevant to release 10.0.36.202403251
17448		| Accounts payable	| Method of payment - EFT file name Placeholders | Editor Placeholder picker displayed Bank statement fields added for Reconciliation matching rule's Description mask. <br> Only relevant to release 10.0.36.202403251

# Current version

### Release 10.0.36.20240325

DXC Finance Utilities 10.0.36 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.36	  | [What’s new or changed in Dynamics 365 application version 10.0.36](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-36)
Microsoft Dynamics 365 application	| 10.0.37	  | [What’s new or changed in Dynamics 365 application version 10.0.37](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-37)
Microsoft Dynamics 365 application	| 10.0.38	  | [What’s new or changed in Dynamics 365 application version 10.0.38](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-38)
Microsoft Dynamics 365 application	| 10.0.39	  | [What’s new or changed in Dynamics 365 application version 10.0.39](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-39)

#### Features not yet supported

Feature	| 10.0.39 Feature state
:--       	|:--		
**Time zone for importing bank statements using Electronic reporting** <br> Finance utilities doesn't currently support converting date/time fields within the bank statement file | Mandatory
**Modern bank reconciliation** | Preview


#### Build 10.0.36.202403251
Release date: 25 March 2024 <br>

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
17092		| Accounts payable <br> Accounts receivable	| ABN and GST validation	| _Only applicable to Australia and only visible where ABN validation is enabled for the Legal entity_ <br> • New fields added to TaxVatNumTable: <br> - **Status**: ABN status for example Active or Cancelled <br> - **Entity type**: Entity type for the ABN, for example 'Australian Private Company' <br> - **GST from**: Populated where the ABN is registered for GST * <br> - **GST to**: Populated where the ABN is registered for GST * <br> - **GST registered**: Set to _Yes_ where 'GST to' date is in the future *  <br> ![ABN validation](Images/ReleaseNotes_20240329_1.png "ABN validation") <br> * The three new GST fields have also been added to the **ABN status** dialog. <br> ![ABN status](Images/ReleaseNotes_20240329_2.png "ABN status") <br> Above new fields are updated to current government data when running either: <br> • **Update ABN validation** periodic task <br> • **Run update** on ABN validation review form <br> • When adding new records via **ABN lookup** <br> [User guide](Processing/ABN/ABN-lookup-and-validation.md)
17159 <br> 17233 | Accounts payable <br> Accounts receivable | ABN validation | _Only applicable to Australia and only visible where ABN validation is enabled for the Legal entity_ <br> New form **ABN validation review** for users to review new/updated ABN records. For example an ABN is not registered for GST anymore. <br> Select applicable record(s) and select **Mark as reviewed** to update their reviewed status. <br> **Run update** can be used to run the web service to update ABNs with current data from the Australian Business Register. <br> Update can also be run via 'Organization administration > Periodic > **Update ABN validation** <br> ![Review](Images/ReleaseNotes_20240329_8.png "Review")
17286		| Accounts payable	| ABN validation | _Only applicable to Australia and only visible where ABN validation is enabled for the Legal entity_ <br> Ability for users to check the current ABN and GST status for a vendor while entering an invoice. <br> **ABN status** button is enabled when the 'Tax exempt number'/'ABN' is populated for the vendor invoice line. <br> ![Vendor invoice ABN status](Images/ReleaseNotes_20240329_7.png "Vendor invoice ABN status") 
16924		| Organisation administration | Electronic reporting export connections | Log functionality added <br> ![Log](Images/ReleaseNotes_20240329_5.png "Log")
17248		| Cash and bank management <br> Organisation administration | • Financial utilities connections <br> • Electronic reporting export connections | New Connection type option **API Endpoint**. <br> Can thus now import bank statements as an inbound web service or export ER files as an outbound web service. <br> Also works with Azure function. <br> [Import user guide](Setup/CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.html#api-endpoint) <br> [Export user guide](Setup/ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.html#step-1---setup-electronic-reporting-export-connections) <br> [Web API Endpoint Technical guide](Technical/Web-API-Endpoint.md)
17290		| Cash and bank management	| Reconciliation matching rule | Ability to set a **Description** mask for Mark new transactions. <br> This release includes only **Customer** offset types. Roadmap: include the other offset types Vendor, Bank and Ledger. <br> **Editor** provides the ability to set a combination of static fields and placeholders: <br> • Currency <br> • Description <br> • Amount <br> • Document number <br> • Entry reference <br> • Bank statement transaction code <br> • Reference No. <br> • Related bank account <br> • Name (Trading party) <br> • Bank account <br> • Bank account number <br> • Bank groups <br> Note: If File name mask is not populated, the Bank statement line's Description will be written to new transaction's Description. <br> ![Recon matching rule](Images/ReleaseNotes_20240329_3.png "Recon matching rule") <br> ![Editor](Images/ReleaseNotes_20240329_4.png "Editor") <br> ![Journal](Images/ReleaseNotes_20240329_9.png "Journal")
16827		| Accounts receivable	| EFT file name on Method of payment	| Ability to set EFT file name for Customer payment files (direct debits) on the Method of payment. <br> [User guide](Setup/ACCOUNTS-RECEIVABLE/Customer-payments.md)
16600		| Accounts payable	| Vendor payment journal | When the vendor payment is generated, the **Export file name** displayed on the Generate payments dialog is written to the relevant vendor payment journal lines' new field called **Export file name**. <br> Note: This does not yet include file names generated by Electronic reporting config. <br> ![Export file name](Images/ReleaseNotes_20240329_6.png "Export file name")
17422		| N/A		| N/A |  Update to **Table groups** to support "transaction" types being truncated in copy environment feature via Power platform.


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16997		| Accounts payable	| EFT file name editor on Method of payment	| Refresh required to save updates to the file name using Editor
16827		| Accounts receivable | EFT file name on Method of payment | If the same payment method PaymMode exists in the Accounts payable (AP) module, the EFT file name setup from the AP method of payment was used
17063		| Accounts receivable | Interest notes - Due date | Due date now updated before the transaction records are created. <br> Resolves error: "Cannot edit a record in Customer transactions (CustTrans). An update conflict occurred due to another user process deleting the record or changing one or more fields in the record."
17119		| Accounts payable <br> Accounts receivable	| ABN lookup	| Fix to 'Company name' in Search results
16925		| Organisation administration	| Electronic reporting jobs	| When using an Electronic reporting destination with document type in conjunction with Electronic reporting export connection, the record created in the Electronic reporting jobs will now also contain: <br> • Document handling attachment <br> • Field 'Files' populated with the file name.
17012		| Cash and bank management	| Reverse mark as new transaction	| Support added for reversing **mark as new** transactions offsetting to **vendor, bank or customer** within the same legal entity. <br> 15693 resulted on an incorrect sign on the reverse transaction on the bank, vendor and customer <br> Supports features: <br> • Enable bank reconciliation reversal even new transactions exist in posted bank statement <br> • Reverse posted bank statement with new transactions <br>
17126		| Cash and bank management	| Reconciliation matching rule	| When used to create automatically posted Customer dishonour payments, the automatically matching in the Bank reconciliation failed. 
17437		| Cash and bank management	| Bank statement periodic import | Archive issue when connection has high latency. File deleted before it could copy to Archive. Change: Before delete the result of copy is awaited and retried for 1 seconds 3 times before marking as an exception.


# Deprecated features

This section describes the features that have been removed, or planned to be removed from a Finance utilities version.

### Vendor bank account change workflow
- Reason for deprecation/removal - Replaced by D365 feature from 10.0.32 called 'Vendor bank account change proposal workflow' / 'Supplier bank account change proposal workflow'. [Learn more](https://learn.microsoft.com/en-gb/dynamics365/finance/accounts-payable/vendor-bank-account-workflow)
- Impact - Removal of the following fields in Accounts payable parameters FastTab 'Vendor approval':
	- Bank account number
	- Bank account BSB
	- Bank account biller code (Finance utilities field)
	- Bank account lodgement reference (Finance utilities field)
	- Bank account bank group
	- Bank account SWIFT code
	- Bank account IBAN
	- Bank account active date
	- Bank account expiration date
- Notice date - 24 July 2023
- Status - Completed in 10.0.36.202311161
> Note: The Finance utilities fields (Biller code and Lodgement reference) have been added to standard 'Vendor bank account approval' FastTab in Accounts payable parameters in Finance Utilities version 10.0.35.202307311.

### New bank statement transaction - Posting date
- Finance Utilities functionality - Option to post **new** bank statement transaction at either **Today's date** or **Statement transaction date** (Statement's To date)
- Recommended process: Feature 'New voucher and date for new transactions in the advanced bank reconciliation bank statement' is automatically enabled from 10.0.36. The feature automatically sets new 'Cash and bank management parameters' field 'Set the booking date as default accounting date for new transactions' to _Yes_. Select applicable option in this new field to set the default accounting date for new transactions:
	- Yes: Bank statement line booking date
 	- No: Bank statement import date 
- Reason for deprecation/removal - Feature 'New voucher and date for new transactions in the advanced bank reconciliation bank statement' was introduced in 10.0.31. In 10.0.35 MS has updated the feature which has resulted in a breaking change for Finance Utilities Posting date functionality. From 10.0.36 this feature is enabled by default.
- Impact - Removal of the following fields & functionality:
	- Posting date default on bank account <br>
	- Posting date option on importing bank statement <br>
 	- Posting date on bank reconciliation <br>
- Notice date - 4 September 2023
- Status - Completed in 10.0.36.202311161

![Bank statement](Images/Deprecate_PostingDate_1.png "Bank statement") <br>

![Bank reconciliation](Images/Deprecate_PostingDate_2.png "Bank reconciliation")

# Previous version(s)

Approximately one year of previous versions are included below.

### Release 10.0.36.20231116

#### Build 10.0.36.2023111671
Release date: 2 February 2024 <br>

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
16332		| System administration 	| Business event for electronic reporting export | New Business event **Electronic reporting file exported to azure blob**. Option to create an event when exporting ER file to Azure Blob via 'Electronic reporting export connections'.
16596		| Organization adminstration	| Electronic reporting export connection | 'Validate connection' functionality added

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16873		| Accounts payable	| Payment advice print	| Finance utilities was referencing 'ECL_BankPaymAdviceVendV2' report when printing Vendor Payment advice. When the report wasn't deployed to an environment, printing would error with 'Parameter _reportName cannot be null or empty'. Reference to the ECL report has been removed.
16897		| Accounts payable <br> Accounts receivable	| ABN validation	| Only applicable to 10.0.36.2023111661. When ABN validation was active for the legal entity, any changes on the vendor/customer resulted in ABN validation dialog popping up.
16959		| Various	| - Financial utilities connections <br> - Electronic reporting export connections	| Increase EDT for usernames, passwords (sftp, ftp) and storage account name, storage account key (Azure blob)
16976		| Accounts reveivable	| Interest note - Due date	| Waive, reinstate and reverse of interest notes also now utilize 'Use customer payment terms' option.


#### Build 10.0.36.2023111661
Release date: 12 January 2024 <br>

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16822 <br> 16754 | Data management | ABN validation - Import entities TaxVATNumTable & VendVendorV2	| ABN validation GUI popup wrapped around a condition for data import scenarios. Also removed the previous 'Skip validation' method when importing Vendors entity. <br> When ABN validation is enabled for the legal entity and the entities imported, ABN validation will occur without the GUI popup. Records with valid ABNs will be imported and only invalid ABN staging records will error.



#### Build 10.0.36.2023111651
Release date: 21 December 2023 <br>

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16794		| Accounts payable	| Vendor approval	| Related only to earlier versions of 10.0.36.20231116 - deprecating Vendor bank account approval. <br> Resulted in values not being retained for client extended fields in Vendor approval.


#### Build 10.0.36.2023111642
#### Build 10.0.35.2023111641
Release date: 14 December 2023 <br>

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16758		| Accounts payable	| Vendor approval	| Proposed changes disregarded for changes to standard vendor fields. 
16765		| Accounts payable	| Method of payment <br> EFT file name Editor	| Label fix and saving of changes to file name mask.


#### Build 10.0.36.2023111631
Release date: 8 December 2023

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16747		| N/A		| Deployment		| Bug fix only applicable to 10.0.36.2023111621, which included unit tests. <br> To remove unit tests, use the following [instructions](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/deployment/uninstall-deployable-package) to remove the package/uninstall unit tests.

#### Build 10.0.36.2023111621
#### Build 10.0.35.2023111622
Release date: 30 November 2023 <br> 

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
15693		| Cash and bank management	| Reverse mark as new transaction	| Support added for reversing **mark as new** transactions offsetting to **vendor, bank or customer** within the same legal entity. <br> Supports features: <br> • Enable bank reconciliation reversal even new transactions exist in posted bank statement <br> • Reverse posted bank statement with new transactions <br>


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16584		| Accounts payable	| Vendor bank account approval	| Proposed changes disregarded for changes to standard vendor bank account fields.


#### Build 10.0.36.202311161
#### Build 10.0.35.202311161
Release date: 16 November 2023 <br> 

<ins>Deprecated</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
15394		| Accounts payable	| Vendor bank account change workflow	| Deprecate Vendor bank account fields in Vendor approval. <br> See [Deprecated features notice - Vendor bank account change workflow](#vendor-bank-account-change-workflow) for more details.
16002		| Cash and bank management	| Mark as new transaction's Posting date	| Deprecate **Posting date** functionality for Mark as new transactions. <br> See [Deprecated features notice - Posting date](#new-bank-statement-transaction---posting-date) for more details.

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
15488		| Accounts receivable	| Interest notes - Due date	| New field called **Use customer payment terms** added to **Accounts receivable parameters**  and **Credit and collections parameters** (Collections tab). <br> If set to _Yes_, the customer's payment terms will be used to determine Due date when posting Interest notes. <br> [Guide](Setup/ACCOUNTS-RECEIVABLE/Customer-parameters.md)
16039		| Cash and bank management	| Bank statement import	| **Run in the background** functionality added to **Import bank statements** <br> ![Import bank statements](Images/ReleaseNotes_20231130_1.png "Import bank statements") 
16471		| Encryption	| | DXC encryption parameters: Rename field KeyVaultSignerPublicKey (Signer's public key) to KeyVaultReceiverPublicKey (Receiver's public key)
16401		| Accounts payable	| Vendor bank account - Lodgement reference	| Increased Lodgement reference EDT from 18 to 20
N/A		| DXC License 	| | DXC License 10.0.34.202310311 - Includes feature managed SmartSend and Core extensions


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16069		| Unit tests	| 	| Fix 10.0.37 build issues for Finance utilities Unit tests
16244		| Cash and bank management	| Import statement	| Code change in 10.0.37 that makes 'Bank account' mandatory when using 'Import statement for multiple bank accounts in all legal entities'
16036		| Data management	| Import data entity **Document types**	| Couldn't import the entity with Finance utilities field DFUGEREXPORTCONNECTION. <br> Error: 'The column ErrorCode in entity Document types has incorrect data. Please correct the data and try the import again.'

### Release 10.0.35.20230731

#### Build 10.0.35.2023073156
Release date: 14 November 2023 <br> 

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16460		| Cash and bank management	| Intercompany bank Mark as new transactions | 16338's change to intercompany bank mark as new, created a bank statement in the destination company to create intercompany reconciled bank transactions. This has now been changed to not create a bank statement in the destination legal entity. It now creates an unreconciled bank transaction in the destination company using the following from originating company: Debit/Credit Amount, OffsetLedgerDimension, BankTransType, OffsetTxt, OffsetCompany, OffsetAccountType, ExchRateSecond, ExchRate, CurrencyCode, Voucher, TransDate, LedgerDimension, AccountType, JournalNum


#### Build 10.0.35.2023073143
Release date: 2 November 2023 <br> 

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
16429		| Cash and bank management	| Bank statement / reconciliation	| Update ledgers used for mark as new **Intercompany bank** transactions. Previously used  LedgerInterCompany fields CustLedgerDimension and DebitLedgerDimension, but these aren't available in the Intercompany accounting form. Now using: OriginatingDebitLedgerDimension or OriginatingCreditLedgerDimension and DestinationCreditLedgerDimension or DestinationDebitLedgerDimension.

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16338		| Cash and bank management	| Intercompany bank Mark as new transactions | Additions to 15578. Applicable to when a bank statement line is marked as new and offset to an **intercompany bank account**. <br> Previously only supported when bank statement is posted via 'Mark as reconciled' (Auto-post bank statement is set to _Yes_), and feature 'Advanced bank reconciliation improvement: enable filtering and provide separate grid for new transactions' disabled. <br> Now supports the feature enabled and posting the bank statement from the Bank statement page (Auto-post bank statement is set to _No_) as well.
16250		| Cash and bank management	| Import statement	| Incorrect warning message when importing bank statement and the file contains multiple bank accounts and the import parameters is filtered to one bank account that exists in the file: 'Failed to match with bank account'. <br> It also warned about No matching bank account found for bank accounts that doesn't exist in D365, but the import was only filtered to one specific bank account.


#### Build 10.0.35.2023073131
Release date: 4 October 2023 <br> 

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16114		| ABN Validation	| Customer and Vendor ABN validation	| Decouple DXCABNValidation from DXCFinanceUtilities enabling companies to remove model DXCABNValidation.


#### Build 10.0.35.2023073122
Release date: 31 August 2023 <br> 

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
15017		| Accounts payable	| EFT file name generation	| Ability to set static values and select placeholders for EFT file name in Vendor's Method of payment <br> [User guide](Setup/ACCOUNTS-PAYABLE/Vendor-payments.md#eft-file-name-generation) <br> ![Method of payment](Images/ReleaseNotes_20230731_4.png "Method of payment") <br> ![Editor](Images/ReleaseNotes_20230731_5.png "Editor") 
15578		| Cash and bank management	| Bank reconciliation	| When bank statement line is marked as new and offset to an **intercompany bank account**, the postings will now be created as intercompany. Example: <br>  • **Current company**: Debit I/C Receivable and Credit Bank account <br> • **Intercompany**: Debit Bank account and Credit I/C Payable

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
15891		| Cash and bank management	| Bank reconciliation | Only issue in **10.0.35.202307311**. <br> When running matching rules, the lines are not moved to matched/new transactions
15976		| Cash and bank management	| Bank reconciliation	| When running Reconciliation matching rule offsetting to account type **Customer**, the customer payment journal line's **Approved** will now be set to _Yes_. Else the record is not available to be settled.
15899		| Accounts payable	| Payments report	| Only issue in 10.0.35. <br> When printing the **Payments** report in Vendor payments, every 2nd page is blank.


#### Build 10.0.35.202307311
Release date: 31 July 2023 <br> 

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
14578		| Cash and bank management	| Bank reconciliation	| Support for manually setting offset details when enabling feature **Advanced bank reconciliation improvement: enable filtering and provide separate grid for new transactions**. This feature adds section **New transactions** in the Bank reconciliation and in 10.0.35 MS added additional button **Line details**. <br> Finance utilities now utilises **Line details** for the ability to manually set offset details for mark as new transactions. <br> ![Line details](Images/ReleaseNotes_20230731_1.png "Line details") <br><br> _Note: Using button Cancel on Line details currently still saves any changes. Bug has been reported to Microsoft and fix will be included in 10.0.37_
14929		| Cash and bank management	| Bank statement import	| **Decimal adjustment** was limited to 5 decimals. <br> Have been changed to dynamic and now supports higher than 5 decimals.
14088		| Cash and bank management	| Bank statement import	- Periodic task | Currently when the periodic task **Import bank statements via financial utilities connection**'s Bank statement format's **Custom format** is: <br> • **Yes**: By design if there are issues with creating bank statement for any of the accounts in the file (example bank account doesn't exist in D365) , no bank statements are created and the file is moved to error path (instead of archive). <br> • **No**: Std creates bank statements for all valid bank accounts using the Electronic reporting configuration - we have no control over this. <br> **This change**: will move the file to **Error path / container** (instead of archive path) if not all bank statements could be created when using the periodic task and the bank statement format's **Custom format** is set to _No_.
15410		| Accounts payable	| Vendor bank account approval	| Support for 10.0.32 feature 'Vendor bank account change proposal workflow’ / ‘Supplier bank account change proposal workflow' which is on by default from 10.0.35. <br> Added the following Finance utilities fields to **Vendor bank account approval**: <br> • Biller code <br> • Lodgement reference <br> Note: Finance utilities includes vendor bank accounts fields in **Vendor approval**, which has now been replaced by this MS feature, and will be deprecated in the next Finance utilities release. Please migrate your vendor bank account approval setup from **Vendor approval** to **Vendor bank account approval** before the next release. <br> [Deprecation notice](#vendor-bank-account-change-workflow) <br> ![Vendor bank account approval](Images/ReleaseNotes_20230731_2.png "Vendor bank account approval")
14099		| Accounts receivable | AR Utilities	| Added Amount **Decimal adjustment** option to Remittance format <br> ![Remittance format](Images/ReleaseNotes_20230731_3.png "Remittance format")
N/A		| Licensing	| DXC License & DXC License manager	| New versions included: <br> • DXC License 10.0.34.202307311 <br> • DXC License Manager 10.0.32.202307312

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
14619		| Cash and bank management	| Bank statement import	- Custom formats | Ability to map non transaction record custom line codes. Previously if Opening or Closing balance custom line codes where set in **Custom line codes**, these were imported as transaction records. 
15482		| Cash and bank management	| Bank statement import	- Custom formats | When using mapped **Ending balance** field, the opening balance was added to the imported bank statement's ending balance
15199		| Cash and bank management	| Reconciliation matching rules	set | Extension to **processMatchRuleSet** to support reprocessing unmatched bank statement lines. <br> The issue came in where the filter criteria for each rule in the set found the same bank statement lines, but the rules used different bank statement fields to find the D365 customer account to post the customer payment journal. <br> <br> Example - Reconciliation matching rule set where all the rules filters to same criteria that matches to 15 bank statement lines: <br> Rule 1: Uses Bank statement field **Description** to find the D365 customer account, but only 3 lines could find a D365 customer account in this field to successfully post. <br> Rule 2: Uses Bank statement field **Entry reference** to find the D365 customer account. The expectation would be that Rule 2 would find the remaining 12 bank statement lines and post the applicable ones, but it found 0. <br> Before this change, only rule 1 in the set found bank statement lines, and subsequent rules found 0.
15390		| Cash and bank management	| Bank reconciliation	| When running a **Mark new transactions** Reconciliation matching rule that: <br> • Posts customer payment journals and <br> • Financial utilities parameters **Only match posted statement lines** was set to _Yes_ and <br> • **No** journals were successfully posted (for example couldn't find any matching D365 customer account for all the lines) <br> All unmatched bank statement transactions, that matched the criteria, where moved to matched.

### Release 10.0.34.20230615

#### Build 10.0.34.202306151
Release date: 15 June 2023 <br> 

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
14332	| Cash and bank management <br> Accounts receivable | Financials utilities connection |  Update to support Azure Blob Storage related method depreciation in 10.0.34. <br> Replaced StartCopyFromBlob with BeginStartCopy <br> [Obsolete API](https://learn.microsoft.com/en-us/previous-versions/azure/jj732079(v=azure.100))
12430		| Cash and bank management | Reconciliation matching rules | New field **Offset account reference bank statement field** provides the ability to use [Customer reference](Setup/ACCOUNTS-RECEIVABLE/Customer-reference.md) to find the applicable D365 customer account when running a Mark new transactions Reconciliation matching rule offsetting to customer. 
14536	| Cash and bank management	| Bank statements	| Ability to map **Ending balance** on custom bank statement formats. Where this is mapped, the imported bank statement's ending balance will be used to populate the Bank statement's ending balance field. This is useful to validate that bank statements are imported in the correct sequence.
14332	| Accounts payable	| Model reference	| Added FinTag model reference to Finance utilities
14524	| Accounts payable	| Payments report	| Added new field for Vendor's bank name

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
14532		| Cash and bank management	| Bank reconciliation report	| Fixed Report's Txt field's ExtendedDataType to match Bank account transaction's Txt field.
14696		| Cash and bank management	| Bank statement import	- Custom formats | Issue with 88 continuation line's string size. 


### Release 10.0.31.20230518

#### Build 10.0.31.202305181
Release date: 18 May 2023 <br> 

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
12631		| Cash and bank management	| UI updates		| • Update header on Bank accounts 'EFT parameters' to 'AP EFT parameters' <br> • Bank reconciliation warning log updated where the customer payment journal isn't automatically posted: "Customer payment journal % has been created successfully. Please post the payment journal manually, refresh the worksheet and manually match with the new bank transactions."

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
14277		| Cash and bank management	| Bank statement	| Importing bank statement file that contains multiple bank accounts in different legal entity's errored with: "The bank account % must enable the parameter Advanced bank reconciliation" for bank accounts in different legal entity.
13554		| Cash and bank management	| Bank reconciliation	| From 10.0.31 when feature 'New voucher and date for new transactions in the advanced bank reconciliation bank statement' was enabled and running a mark as new reconciliation rule that offsets to Vendor, it didn't create the record in the vendor subledger.
14096		| Cash and bank management	| Reconciliation report	| Timeout on report when bank account has a large number of transactions.
14230		| Accounts receivable		| AR Utilities		| Update Error customer account logic to work with blank invoice.
14239		| Accounts receivable		| Data management	| Importing entity 'Customers V3' errored when ABN lookup is enabled.
12902		| Accounts payable		| Data management	| Importing entity 'Vendors V2' errored when ABN lookup is enabled.
14333		| Accounts payable		| Generate payments	| Only issue where the GER file is automatically saved to Azure blob storage with keyvault. Added security privilege to duty 'Maintain vendor payments'. Error: "Access denied to field Key Vault secret key (SecretKey) in table Key Vault parameters (KeyVaultParameters)."


### Release 10.0.29.20230505

#### Build 10.0.29.202305051
Release date: 5 May 2023 <br> 

<ins>New features</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
12644		| Customer references	| Ability to set multiple references against customers - [Setup](Setup/ACCOUNTS-RECEIVABLE/Customer-reference.md). <br> These references can be used in the following scenarios: <br> • Customer remittance file refers to a reference unique to the customer, but not an invoice number. This reference can be used to find the applicable customer account when creating the customer payment journal while importing customer remittances using the additional licensed feature AR Utilities. <br> • Roadmap: Reconciliation matching rules additional ability to use the customer reference to find the applicable customer account when creating the customer payment journal.
11357		| Import customer remittance file	| New licensed feature included in **AR Utilities**. <br> Enhancement to import customer remittance files from ftp, sftp or Azure blob storage using data entity Customer payment journal. <br> A wide variety of setup options allows flexibility on method to find the customer account, settlement, posting date, custom file mapping etc. <br> • [Import customer remittance setup](Setup/ACCOUNTS-RECEIVABLE/Customer-remittance.md) <br> • [Import customer remittance processing](Processing/Accounts-Receivable/Customer-remittance.md)
13907		| Financial utilities connection	| Where file is moved to **error** path/container, the Financial utilites connection's Log Level will be set to _Error_. <br> Set connection's **Logging level** to _Error_ and use custom alerts to be alerted when a file has been moved to error path. <br> ![Connection log](Images/ReleaseNotes_202304_1.png "Connection log")
N/A		| License manager	| License manager version 10.8.32.10171 <br> Enhanced Licensing capabilities to assist with licensing support and scaling. <br> **Note:** Required to upgrade all installed DXC products to at least the following versions: <br> • EDI 10.0.29.202305053 <br> • Finance utilities 10.0.29.202305051 <br> • SmartSend 10.0.29.202304142 <br> • Core extensions 10.0.29.202304142 <br> • DocuSign 10.0.29.202304211 <br> • Item creation 10.0.29.202304211 <br> •  PLM 10.0.29.202304211 <br> • Forex 10.0.29.202305101  <br> ![System parameters](Images/ReleaseNotes_202304_2.png "System parameters")

<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
12857		| Data entity - Reconciliation matching rules	| Reverse changes for 11749. Removed fields added back.
12888		| Data entity - Financial utilities connections	| Fixed entities required to import Financial utilties connections
10429		| Data entity - Reconciliation matching rule 	| When importing entity, the Offset account was imported with Chart of account delimiter after the ledger account.
14093		| Reconciliation matching rules | Security: Maintain privilege added for **Copy matching rule**. Added to Duty 'Enable bank management process'.


### Release 10.0.29.20230131

#### Build 10.0.29.202301317
Release date: 17 April 2023 <br> 

<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
13788		| Bank reconciliation	| Modified fix for 13592 to use **Accounting currency** instead of Reporting currency.


#### Build 10.0.29.202301316
Release date: 30 March 2023 <br> 

<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
13592		| Bank reconciliation	| Exchange rate issue when using Mark as new and Offset account type is set to **Vendor**. When the currency differs to the legal entity, and the posted vendor transaction is selected to be used in settlement, the transaction's amount doesn't update the **Settlement balance**.
13620		| Vendor bank account approval	| From 10.32 MS has introduced their own Vendor bank account approval. MS used the same method name processChangesForApproval as we used for Finance utilities functionality. We've updated ours to avoid compile issues from 10.0.32.


#### Build 10.0.29.202301315
Release date: 3 March 2023 <br> 

<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
11505		| Reconciliation matching rules	| Bank reconciliation: When running multiple Reconciliation matching rules with **Action** set to _Mark new transactions_ and **Offset account type** set to _Customer_, errored with 'No statement lines have been marked. The match has an imbalance of %amount%'. 
12801		| Reconciliation matching rules	| Bank reconciliation: When running Reconciliation matching rules with **Action** set to _Mark new transactions_ and **Offset account type** set to _Customer_ and **Auto-post customer payment journal** set to _Yes_, and there was an issue with posting the customer payment journal (for example customer is stopped) the bank statement transactions were still matched.


#### Build 10.0.29.202301314
Release date: 27 February 2023 <br> 

<ins>New features</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
12934		| Bank statement import	|  Support DXC X++ replacement for XSLT depreciation


#### Build 10.0.29.202301313
Release date: 22 February 2023 <br> 

<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
N/A		| DXC Encryption	| Update to DXC encryption. Resolve error: Module 'DXCEncryption' is missing the following dependencies: 'ApplicationFoundationFormAdaptor'


#### Build 10.0.29.202301312
Release date: 14 February 2023 <br> 

Number	  	| Functionality	  | Description
:--       	|:--              |:--
12825		| DXC Encryption	| Remove unwanted model references


#### Build 10.0.29.202301311
Release date: 31 January 2023 <br> 

<ins>New features</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
11653		| Encryption / Decryption	| New model **DXC Encryption**. <br> Encryption/decryption options added to following Finance utilities functionality: <br> • Encrypt option on **Electronic reporting export connections** to send encrypted GER Vendor EFT files <br> • Decrypt option on **Financial utilities connection** to decrypt a bank statement file imported using periodic task **Import bank statements via financial utilities connection**. <br> [User guide](Setup/ENCRYPTION/Encryption-decryption.md)
12119		| Financial utilities connection	| **Log** ability added to all connection types. Ability to set **Logging level** and **Retention period**. This provides users the ability to set Custom alerts. For example if a connection can't connect a log with level _Error_ can be created. <br> ![Log](Images/ReleaseNotes_20230131_1.png "Log")
12353		| Reconciliation matching rules	| Ability to use invoice to find the D365 customer account. <br> Applicable to **Offset account type** set to _Customer_ and where **Offset account** and **Offset account bank statement field** are both blank. <br> When running the Reconciliation matching rule, the field mapped to **Settle transaction bank statement field** (D365 invoice number) will be used to find the **D365 customer account**, to create the **Customer payment journal line**. <br> [User guide](Setup/CASH-AND-BANK-MANAGEMENT/Bank-reconciliation-matching-rules.md#mark-as-new---additional-defaults)<br> ![Reconciliation matching rules](Images/ReleaseNotes_20230131_2.png "Reconciliation matching rules")
10419		| Data entity - Bank accounts	| Added following field to entity 'Bank accounts': <br> • Financial utilities connections
10425		| Data entity - Vendor payment method	| Added following field to entity 'Vendor payment method':  <br> • Sundry method of payment <br> • Auto payment reference number <br> • BPAY method of payment
N/A		| License manager	| License manager version 10.8.32.10156. <br> **Help** includes links to applicable GitHub user guide page/s <br> ![Help](Images/ReleaseNotes_20230131_3.png "Help")


<ins>Bug fixes</ins>

Number	  	| Functionality	  | Description
:--       	|:--              |:--
12324		| Bank statement import	| When a custom bank statement format was used and the file contained a bank account that isn't setup for advanced bank reconciliation, the bank statement headers were created for the bank accounts setup with advanced bank reconciliation, but no bank statement lines were created. <br> The fix now creates the bank statement lines for the bank accounts setup as advanced. <br> Note: Std GER doesn't import any bank statements where the file contains a bank account not setup as advanced bank reconciliation.


### Archive
Older releases notes can be accessed [here](Release-notes-archive.md)


# Installation process
To align with MS best practice and to protect our IP the following applies to the release process.
- The license models DXCLicense and Sable37License will only be released as binaries as part of a deployable package. 
- We will not provide test models for the products, neither as binary or source code. 
- We will only publish the release as a deployable package. 
- Model source code can be provided at our discretion. It can be requested for debugging upgrade errors, or if required for extensions.
	- If you have been given the source code to our model for extension or debugging purpose, never make modifications directly to our models! 
	- If you need an extension point, please send an email to ECLANZProductSupport@dxc.com and request it to be implemented. 


Depending on the installation history follow one of these guides to install the new release. 
## Installation without existing installed product
1. Apply the deployable package to your environment. 
2. If you have requested any model for extension or debugging purposes. Install the model source code. 
a.	Note, once the model source code is compiled it will overwrite the binaries installed when the deployable package was applied. 



## Installation with existing installed product
If you’re installing the new release in an installation that already has a previous version of the product installed and you’re not using it for debugging or extension. We recommend that you;  
1. Remove the release product model source code from your source control, if source control is used. 
2. Apply the deployable package, installing the latest version of the product models as binaries.  
3. Check in the binaries for the models to source control, if source control is used. 

If you’re using our model source code for extension or debugging and would like to continue using it, please do the following to apply the new release with the source code. 

1. Remove product license model from your source control that is applicable to the release. You’ll find the license model in the deployable package. It will either be called DXCLicense and Sable37License. 
2. Apply the deployable package to your environment to install the latest binaries. Check in the binaries for the license model that was removed in step 1 to source control. Note, this step will also install the binaries for all the models in the new release. 
3. Install the product release model source code and check into source control. 

If you don’t follow these instructions and continue building your installation deployable package using the license model source code, the installation will continue using the same license model as before applying the release. 

## Feature management
Enable the following features in D365 Feature management:
- Finance utilities
- Finance utilities - AR utilities (additional license option)

If above feature is not visible, press **Check for updates** to refresh the feature management list.

