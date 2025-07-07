---
# required metadata

title: Finance Utilities
description: Finance Utilities - Release notes
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-07-03
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

# Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Version compatibility
The matrix shows the minimum DXC build versions compatible per Microsoft versions and builds. <br>
If blank: investigations are ongoing. <br>

D365 Version	  | Any issues found in testing?	  | Product version tested
:--       	  |:--           			  |:--
Product version: 10.0.42 <br> App build: 10.0.2095.13	  | No	          | DXC Finance Utilities 10.0.40.2024091931 <br> [DXC ABN Validation 10.0.40.2024091931] <br> [DXC Encryption 10.0.40.202409162]
Product version: 10.0.43 <br> App build: 10.0.2177.18	  | Yes <br> • 21291 & 21612  | DXC Finance Utilities 10.0.40.202501221 <br> [DXC ABN Validation 10.0.40.202501221] <br> [DXC Encryption 10.0.40.202412121] <br> 21612 Build error fixed in 10.0.42.202504081 <br> 21291 Fixed in 10.0.43.20250502
Product version: 10.0.44 <br> App build: 10.0.2263.11	  | Only build errors 22783 & 22784  | DXC Finance Utilities 10.0.42.202504081 <br> [DXC ABN Validation 10.0.42.202504081] <br> [DXC Encryption 10.0.42.202504041] <br> Build errors fixed in 10.0.43.202505211


#### Features not yet supported

Feature	| 10.0.44 Feature state
:--       	|:--		
**Modern bank reconciliation** | On by default, needs to be manually disabled

Release notes for other models included in product:
- [DXC Connections](../CONNECTIONS/Release-notes.md)
- [DXC License Manager](../LMG/Release-notes.md#dxc-license-manager)
- [DXC License](../LMG/Release-notes.md#dxc-license)

### Microsoft deprecation notice

[Microsoft notice](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/get-started/removed-deprecated-features-platform-updates#feature-deprecation-effective-october-2024)
- **Likely to affect**: Companies that uses **Database** credential type for their **Azure blob** connections. These connections can be used to import bank statements and/or export electronic reporting format files. <br>
- **Status**: Rollout for the change by Microsoft begins in **October 2024** in a phased manner. Changes will be backported to **10.0.41 (PU65)** and all later releases. <br> 
- **What do you need to do if affected**: 
	- If decide to use **Blob Service SAS URL** in Key vault:
		- Step 1 - Ensure Finance Utilities version 10.0.40.202409192 is deployed . If using **Connection string** Key vaults, older Finance Utilities versions should be fine.
		- Step 2 - Create Blob service SAS URL in Azure portal - [User guide](https://learn.microsoft.com/en-us/azure/storage/common/storage-sas-overview)
		- Step 3 - In **Key vault parameters** create a Secret using the value created in step 2.
		- Step 4 - Change all applicable **Azure blob** connections: <br> 
			• Credential type: Key Vault <br>
	 		• Connection string: Secret setup in step 3
    - If decide to use **Connection string** in Key vault:
		- Step 1 - If using **Connection string** Key vaults, older Finance Utilities versions should be fine. Not required to upgrade to 10.0.40.202409192
		- Step 2 - Create Connection string in Azure portal
		- Step 3 - In **Key vault parameters** create a Secret using the value created in step 2.
		- Step 4 - Change all applicable **Azure blob** connections: <br> 
			• Credential type: Key Vault <br>
	 		• Connection string: Secret setup in step 3

# Current version

### Release 10.0.43.20250521

DXC Finance Utilities 10.0.43 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application 	| 10.0.43 	  | [What’s new or changed in Dynamics 365 application version 10.0.43](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-43)
Microsoft Dynamics 365 application 	| 10.0.44 	  | [What’s new or changed in Dynamics 365 application version 10.0.44](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44)

#### Build 10.0.43.202505211
Release date: 21 May 2025

<ins>Manual actions required</ins>
- Where **Import lines** is used to import budgets into **Budget register entries**, please add Finance utilities duty **Maintain budget import** to an existing/new role. We'll add it to a new role in the next planned August release. Related to 22784.

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
22907		| Cash and bank management	| Posting new transactions	| Fix to error caused by 21957, only applicable to release 10.0.43.202505021. Error when posting new transaction: "Function SourceDocumentExtensionFactory::newObject has been incorrectly called."
22709		| ABN validation	| Create new vendor	| Fix to label on Vendors Action pane - 'New ABN vendor'
22783		| DXC Encryption	| 10.0.44 build error fix	| New DXC Encryption model 10.0.43.202505191 to fix build error. Removed privilege 'Maintain DXC encryption parameters' from standard role 'Information technology manager'.
22784		| Budgeting	| 10.0.44 build error fix	| Removed Finance Utilities duty 'Maintain budget import' (SAB_FinBudgetMaintain) from standard role 'Budget manager'. <br> ![Security](Images/ReleaseNotes_20250521_1.png "Security")
22874		| Accounts payable	| Sundry vendor payment proposal	| When overriding fields on payment proposal, the sundry vendor lines were incorrectly grouped on payment journal line.


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

### Release 10.0.43.20250502

#### Build 10.0.43.202505021
Release date: 2 May 2025

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
21806 <br> 22076 | Various	| Azure connections	| Added ability to use container level shared access signature URI by setting new field **Disable storage account access** to _Yes_. <br> ![Container level SAS](Images/ReleaseNotes_20250331_6.png "Container level SAS") <br> ![Container level SAS](Images/ReleaseNotes_20250501_2.png "Container level SAS")
21544		| Accounts payable	| ABN validation (only applicable to Australia)	| **New ABN vendor** - Create a new vendor by entering their ABN. This automatically creates the new ABN and Vendor and populates vendor's name and assigns the ABN to the newly created vendor. <br> Requirements: <br> • 'ABN validation' enabled for the legal entity <br> • Automatic number sequence used to create Vendor account ID <br> ![New ABN vendor](Images/ReleaseNotes_20250501_1.png "New ABN vendor")
21675		| Accounts payable	| Electronic reporting (ER) | Payment advice report: ER version of the SSRS report ECL_BankPaymAdviceVendV2.Report. Published on LCS solution as 'Vendor payment adviceV2_DXC(Excel)'

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
21957		| Various	| 10.0.43 build issue	| Fix 10.0.43 extra build issue on Reconciliation matching rules - Financial dimensions.
21291		| Accounts payable	| Vendor payments	| Fix 10.0.43 issue where the value written to Finance Utilities field 'Export file name' was CustVendPaymERExport.updatePaymentItem instead of actual file name.
21218		| Accounts payable	| Self billing / RCTI	| Fix to Consolidate by Receipt date. Issue occurred where multiple invoices were created for same purchase order.
21950		| Cash and bank management	| Bank reconciliation	| Removed the requirement where a Bank transaction needs to be selected when using Match. This allows users to match two Bank statement transactions that balance to zero (reversals).

### Release 10.0.42.20250408

#### Build 10.0.42.2025040822
Release date: 21 May 2025

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
22874		| Accounts payable	| Sundry vendor payment proposal	| When overriding fields on payment proposal, the sundry vendor lines were incorrectly grouped on payment journal line.


#### Build 10.0.42.202504081
Release date: 8 April 2025

<ins>Manual actions required</ins>
- Delete any existing batch job for periodic task 'Update ABN validation' and create new batch job.


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
21612		| Various	| 10.0.43 build issue	| Fix 10.0.43 build issue on **Validate connection** for **API Endpoint** connection type. <br> Microsoft.IdentityModel.Clients.ActiveDirectory has been deprecated and no longer supported by FinOps and needs to be upgraded to now use Microsoft.Identity.Client <br> [Microsoft notice](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/get-started/removed-deprecated-features-platform-updates#azure-active-directory-authentication-library-adal)
21732		| Various	| ABN validation	| Incorrect GST registered status where ABN hasn't registered for GST and the ABN has been cancelled - showed GST registered as Cancelled.  

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
21215		| Various	| ABN validation	| Where the ABN isn't registered for GST, use the earliest ABN entity status from date for **GST from** date. 
21210		| Various	| Encryption and Decryption	| Filtered drop-down options: <br> • Import connections to decrypt key types <br> • Export connections to encrypt key types <br> ![Decryption](Images/ReleaseNotes_20250331_3.png "Decryption") <br> <br> ![Encryption](Images/ReleaseNotes_20250331_4.png "Encryption")
20946		| Cash and bank management	| Bank statement periodic import | Where the bank statement has no transactions - now moving the file to archive instead of error folder. Also updated error message to infolog 'No bank statement was created as file contained no transactions'
17536		| Cash and bank management	| Import bank statement	| New Financial utilities parameters field **Enable date range for custom bank statement formats** controls the **From date** and **To date** inputs on **Import bank statement** for custom bank statement formats. <br> • **No** (default) - From and To date won't be mandatory anymore and automatically calculate the from date as earliest date in file and To date as latest date in the file. Similar to our periodic import job. <br> • **Yes** - From and To date is still mandatory for custom bank statement formats. This is useful where a company only needs to import a certain date range for the particular bank statement.
17536		| Cash and bank management	| Modern bank reconciliation	| Where the feature 'Modern bank reconciliation' is enabled, the bank statement form has been replaced with a new std form. Similar to Bank statement form with feature disabled, we replaced 'Import bank statement' dialog with Finance Utilities dialog which supports importing Finance Utilities custom formats.  
21689 <br> 21102 | Various	| DXC Connections	| New DXC Connections release 10.0.42.202504042 - [Release notes](../CONNECTIONS/Release-notes.md) <br> • SFTP connection migrated to DXC Connections model. <br> • Azure blob connection: added ability to use container level shared access signature URI <br> • Upgraded SFTP to latest 2024.2.0
21719		| Various	| DXC Encryption	| New DXC Encryption release 10.0.42.202504041. See below for details.


#### DXC Encryption Release 10.0.42.202504041

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
20654		| DXC Encryption	| Generate keys	| Ability to **Generate** encryption keys within FinOps on **DXC encryption parameters** <br> ![Generate encryption keys](Images/ReleaseNotes_20250331_1.png "Generate encryption keys")
21545		| DXC Encryption	| Key values	| Previously the module only included the option for SAS URL to Azure blob file to store the Encryption keys. This change provides support for Secrets in Azure containing base 64 encoded data of the actual keys into D365 key vault. These secrets will then be pulled into FinOps as base64, and decoded before being used for encryption/decryption purposes.
21698		| DXC Encryption	| Key values	| New field **Key source** provides the ability to store key values as string within FinOps. Options: <br> • **Key vault** (default) - Azure Storage SAS URL & Azure Secrets <br> • **String** - Store keys within FinOps without Azure + key vaults. Also includes option to download the public key <br> ![Store key values in FinOps](Images/ReleaseNotes_20250331_5.png "Store key values in FinOps")
21548		| DXC Encryption	| Setup	| Moving **Private key** and **Counter party's public key** around in **DXC encryption parameters**
21551		| DXC Encryption	| Validate	| Ability to validate encryption / decryption key name. Select applicable **Encryption key name**, click **Validate** which will open a dialog to browse to a file. <br> • **Encrypt / Encrypt and sign** - select a file that should be encrypted, if setup is correct the encrypted file will be created that can be sent to counter party for testing. <br> • **Decrypt / Decrypt and verify** - select encrypted file that should be decrypted, if setup is correct a decrypted file will be created. <br> ![Validate](Images/ReleaseNotes_20250331_2.png "Validate")

### Release 10.0.40.20250122

#### Build 10.0.40.202501221
Release date: 22 January 2025

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
20611		| Cash and bank management	| Bank statement format | Increased Custom line code's **Line code** from 5 to 10 characters
20434		| Various	| Encryption	| DXC Encryption 10.0.40.202412121. Ability to setup lower level of encryption. [User guide](Setup/ENCRYPTION/Encryption-decryption.md) <br> Key type options: <br> • Encrypt <br> • Encrypt and sign <br> • Decrypt <br> • Decrypt and verify <br> ![DXC encryption parameters](Images/ReleaseNotes_20250122_1.png "DXC encryption parameters")


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
20860		| Cash and bank management	| Mark as new - offset to intercompany account | When using **Post** button in bank reconcilidation's New transactions and unselected new transaction record's Line details were offset to **intercompany** account, these records were also incorrectly posted in the intercompany and also still showed as unposted on the bank reconciliation.
20960		| Cash and bank management	| Import bank statements | Removed **Recurrence** on Batch processing for Import bank statements. Also fixed issue where duplicate bank statements where imported when: <br> Batch processing enabled and <br> Was an issue with automatic reconcile after import and running default matching rule set.
20959		| Cash and bank management	| Reconcile after import with default matching rule set	| Similar to 18174, also fixed issue where subsequent rules not run when the matching rule set contains a rule that errors and was automatically run with reconcile after import (set as default matching rule set on bank account).

### Release 10.0.40.20241204

#### Build 10.0.40.202412041
Release date: 4 December 2024

<ins>Manual actions required</ins>
- Delete any existing batch job for periodic task 'Update ABN validation' and create new batch job.

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
18867		| Various	| IRD number validation	| Modulus 11 digit check, length, digit separator validation for New Zealand IRD numbers. <br> Supports format xxx-xxx-xxx and xxxxxxxxx. <br> This option is enabled by allocating the applicable country, for example NZL, on the Legal entity. <br> <br> Examples: <br> • Incorrect number / Check digit: Expecting check digit 9, but found 8 for IRD no. 086689918 <br> •  Not a number format/incorrect separator: Invalid IRD number format. It should only contain digits having format xxx-xxx-xxx or xxxxxxxxx. <br> • Length: Invalid IRD number length, IRD number should be 9 digits long. <br> ![IRD number validation](Images/ReleaseNotes_20241206_1.png "IRD number validation") <br> <br> ![IRD number validation example](Images/ReleaseNotes_20241206_2.png "IRD number validation example")
18875		| Data management	| ABN validation	| Data entities added
19026		| Organization administration	| ABN validation review	| Where ABN validation is enabled for the legal entity, users can use new button **Change history** to view changes made in D365 for each ABN. <br> ![Change history](Images/ReleaseNotes_20241206_4.png "Change history") <br>  <br> ![Change history](Images/ReleaseNotes_20241206_3.png "Change history") 
19549		| Organization administration	| ABN validation review	| Enabled the following buttons: New and Delete. <br> Added the following buttons: ABN lookup and ABN status <br> ![Buttons](Images/ReleaseNotes_20241206_5.png "Buttons")
20197		| Accounts payable	| Self billing invoicing <br> Recipient-Created Tax Invoice (RCTI) | Ability to automatically create vendor invoices after a product receipt. <br> The invoice can be automatically created at the same time of product receipt, or split/consolidate using the periodic task. <br> <br> The periodic task split/consolidate options include: <br> • Product receipt <br> • Purchase order <br> • Invoice account <br> • Receipt date <br> <br> Post options: <br> • **Do not post** - Created invoice is not posted and remains as pending vendor invoice <br> • **Post** - Created invoice is automatically posted. If post failed, it will remain as pending vendor invoice <br> • **Post and print** - Created invoice is automatically posted. If post failed, it will remain as pending vendor invoice. The posted invoice is also automatically printed/sent as per Print management destination. The following print management destination options are supported: Smart Send (where licensed,  Email and Electronic reporting export connections <br> <br> [Setup](Setup/ACCOUNTS-PAYABLE/Self-billing-invoicing.md) <br> [Processing](Processing/Accounts-Payable/Self-billing-invoicing.md) 
20304		| Accounts payable	| Method of payment - BPAY	| Payment control **Payment ID** and Payment attributes **Payment ID** is still defaulted to Yes, but now no longer disabled
17514	| DXC License manager	| Licensing | New DXC License manager 10.0.40.202412041. See [Release notes](../LMG/Release-notes.md#d365-finance-and-operations) for more detail.
20389	| DXC Connections	| All Azure connections | New DXC Connections 10.0.40.202412041. <br> See [Release notes](../CONNECTIONS/Release-notes.md) for more detail.

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
19459		| Cash and bank management	| Reconciliation matching rules - Offset type Ledger	| When entering new Offset account number, limited to only **Main accounts** (no financial dimensions). Offset financial dimensions needs to be entered Financial dimensions > Offset account
19527		| Various	| ABN validation	| Fix to **From date** for _Cancelled_ GST records
20187		| Accounts payable	| BPAY	| When overriding the vendor bank's default **lodgement reference** on a BPAY method of payment invoice and manually selecting the invoice for settlement on the payment journal line, the default lodgement reference wasn't overridden by the actual lodgement reference on the invoice. This issue only applied to manual settlement, not payment proposal process.

### Release 10.0.40.20240919

#### Build 10.0.40.2024091941
Release date: 19 November 2024

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
19934 <br> 20173		| Cash and bank management	| Mark as new - offset to intercompany account	| 1. Fix to related vouchers for intercompany vouchers. <br> 2. Fix to financial dimensions, as per below. This also resolves the incorrect warning where a financial dimension is used for intercompany offset, but suspended for bank recon's legal entity. <br> ![Financial dimensions](Images/ReleaseNotes_20241115_1.png "Financial dimensions")
20177		| Cash and bank management	| Mark as new | Blank distribute amount
20180		| Cash and bank management	| Bank statement | New Security privilege 'Maintain vouchers to be reversed' added to DFUBankStatementReversalDialog. Added to std duty 'Enable bank management process'
20184		| Cash and bank management	| Mark as new - offset to intercompany account with tax	| Where the intercompany offset type ledger included tax, the tax was incorrectly posted in bank recon's legal entity. Tax is now posted with the expense/income in the intercompany legal entity.



#### Build 10.0.40.2024091931
Release date: 28 October 2024

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
19587		| Cash and bank management	| Reconciliation matching rules - offset to intercompany customer and settling invoice | Issue with finding the intercompany invoice
19571		| Cash and bank management	| Mark as new - offset to same bank account | Missing subledger entry when offsetting to same bank account. Issue came from 18692 in release 10.0.38.202408071
19576		| Cash and bank management	| Mark as new - offset to intercompany account	| Offset ledger, customer and vendor not posted in Intercompany legal entity


#### Build 10.0.40.202409192
Release date: 3 October 2024

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
19353		| Various	| Azure connections	| Fix to **Azure blob** connection types using **Shared access signature (SAS)** to access Azure Blob Storage at account level. <br> Fix for error: "**No valid combination of account information found**" <br> Applicable to versions 10.0.40.202409162 & 10.0.40.202409191 <br> • Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities <br> • Organisation administration > Electronic reporting > Electronic reporting export connections. 


#### Build 10.0.40.202409191
Release date: 19 September 2024

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
18827		| Cash and bank management	| Reconciliation matching rules - offset to customer	| New option **Auto-post and transfer customer payment journal** enables customer payment journal to be posted and any error lines transferred to a new unposted journal (example stopped customer). Both customer payment journals' **Document** will refer to the Bank reconciliation. <br> ![Post and transfer](Images/ReleaseNotes_20240919_1.png "Post and transfer")
19151		| Cash and bank management	| Reconciliation matching rules - data entity	| Field 'Description mask' added to data entity
18837		| Accounts payable	| Payments report | Use Vendor bank account's BPAY **Biller code** and **Lodgement reference** fields where payment line's method of payment **BPAY method of payment** is _Yes._ <br> [User guide](Processing/Accounts-Payable/Vendor-payments.md#payments-report) <br> <br> ![Payments](Images/ReleaseNotes_20240919_2.png "Payments")

### Release 10.0.40.20240916

#### Build 10.0.40.202409162
Release date: 16 September 2024 <br>

<ins>Manual actions required</ins>
- Delete any existing batch job for periodic task 'Update ABN validation' and create new batch job.

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
18870		| Various	| ABN lookup	| New field **Search by ABN** available in **ABN lookup**. When set to: <br> • No: Search by Company name <br> • Yes: Search by ABN <br> ![ABN lookup](Images/ReleaseNotes_20240913_1.png "Search by ABN")
18851		| Various	| ABN status	| Where the GST is **Cancelled** for an ABN, the **From date** will be obtained from Historical details to indicate from which date the GST has been cancelled. <br> ![ABN status](Images/ReleaseNotes_20240913_2.png "Cancelled From date")
18987		| Various	| ABN / TaxVatNumTable	| New fields added to TaxVatNumTable: <br> • Created by <br> • Created date and time <br> • Modified by <br> • Modified date and time <br> • Reviewed date
18509		| Accounts receivable	| AR Utilities	| Ability to obtain part of a field in the remittance file, by using **Field format** on below fields: <br> • Customer reference <br> • Tax invoice <br> [User guide](Setup/ACCOUNTS-RECEIVABLE/Remittance-format.md#field-format) <br>  <br> ![Field format](Images/ReleaseNotes_20240913_3.png "Field format") <br> ![Field format](Images/ReleaseNotes_20240913_4.png "Field format")
19087		| Various	| Azure connections	| Azure dll moved to new model called DXCConnections. <br> DXC Connections release 10.0.40.202409192 - [Release notes](../CONNECTIONS/Release-notes.md)
19023		| Accounts payable	| Sundry method of payment	| Allow Generic electronic Export formats where Sundry method of payment is set to Yes.



<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
18984		| Organisation administration	| ABN validation review	| When **Reviewed** changes from _Yes_ to _No_ by an update to the ABN record, the **Reviewed by** used to still store the previously reviewed by user which is not valid since the record is not reviewed anymore.
19014		| Cash and bank management | Web API import & DXC Encryption	| Added a check on warning for files imported via WebAPI . If file is empty, a warning will be added to the batch job logs and no files will be added for further process of mapping from file to BankStatement tables. <br> In addition to this, a check and warning has been added in the DXC Encryption model code. If an empty is received for decryption, a warning will be displayed to the user to indicate file stream is empty. <br> New DXC Encryption version 10.0.41.202409161
18802		| Various	| Azure connections	| Unable to find manual secret value

### Release 10.0.38.20240823

#### Build 10.0.38.202408232
Release date: 28 August 2024 <br>

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
18893		| Cash and bank management	| Bank statement import via Web API with decryption	| Fix for error 'This stream does not support seek operations. Batch task failed: NotSupportedException'

#### Build 10.0.38.202408231
Release date: 23 August 2024 <br>

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
18858		| Cash and bank management	| Bank statement import with decryption	| Error decrypting ER bank statement formats

### Release 10.0.38.20240807

#### Build 10.0.38.202408071
Release date: 7 August 2024 <br>

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
18347		| Cash and bank management | Bank accounts | Only enable field 'Include balance line in record count' when field 'Extra balance line on EFT' is enabled.
18550		| Cash and bank management | Bank reconciliation	| Disable button 'Match id' in Bank reconciliation Worksheet when Financial utilities parameter field 'Auto assign Match Id' is set to _Yes_. Else it errors with 'No statement lines have been marked'. Clicking Match Id is unnecessary as the Match id will automatically be assigned when user clicks button 'Match' in the Bank reconciliation Worksheet.
18692		| Cash and bank management | Bank reconciliation	| When feature 'Enable posting of new transactions in bank reconciliation' is enabled, the ability to post mark new transactions are available in the Bank reconciliation Worksheet. If user used this posting, and also posted the bank statement, a duplicate mark new transaction was posted. <br> This was only relevant for offset types Customer (when manually marked as new in Recon - not via recon rule that creates customer payment journal), Vendor or Bank.
18689		| Organisation administration	| ABN validation report	| Previously when running report 'ABN validation' the API was run for each vendor/customer with an ABN allocated. Since the fields are now stored on the TaxVatNumTable the report will now not run the API anymore. The relevant fields on the TaxVatNumTable can be updated to current Australian Business Register data by either: <br> • Organisation administration > Periodic > Update ABN validation <br> • 'Run update' on 'Organisation administration > Enquiries and reports > ABN validation review. 
18158		| Various 	| SFTP Connection | PR fixes to 18158 SSH key vault Azure blob storage


### Release 10.0.37.20240625

#### Build 10.0.37.202406251
Release date: 25 June 2024 <br>

<ins>Manual steps required</ins>
- If using DXC encryption / decryption, please see 17274. Required to update new field **Counter party's public key** with the applicable key.

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
18126		| Accounts payable	| Generate file per payment line	| New option called **Generate file per payment line** on **Methods of payment** for _Electronic reporting export formats_. <br> When set to Yes, the vendor payment's **Generate payments** will create an EFT file per journal line. <br> ![Generate file per payment line](Images/ReleaseNotes_20240626_1.png "Generate file per payment line")
17230		| Various 	| Azure Connection	| Ability to use **Azure SAS Storage account level token** for Connection string on Azure connections.  <br> Applicable to: <br> • Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities connections <br> • Accounts receivable > Payments setup > Financial utilities connections (AR utilities feature) <br> • Organization administration > Electronic reporting > Electronic reporting export connections
18158		| Various 	| SFTP Connection	| New **Credential type** option **Private key** provides the option to store SSH key file in Azure, setup in D365 as Key vault parameter and use on Finance utilities SFTP connection. <br> Applicable to: <br> • Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities connections <br> • Accounts receivable > Payments setup > Financial utilities connections (AR utilities feature) <br> • Organization administration > Electronic reporting > Electronic reporting export connections <br> <br> ![Private key](Images/ReleaseNotes_20240626_3.png "Private key")
17274		| Organization administration | DXC encryption parameters	| **Public key** (sender's public key) and **Receiver's public key** replaced with new field **Counter party's public key**. <br> Note: Manual step required to update new field with the applicable key.
18149		| Budgeting	| Import budget | Ability to **Generate template** based on setup on **Budget utilities parameters**: <br> • Number of months <br> • Dimension format <br> ![Generate budget import template](Images/ReleaseNotes_20240626_2.png "Generate budget import template")


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
18174		|  Cash and bank management	| Reconciliation matching rule set - Customer offset type | Where the Reconciliation matching rule set contained: <br> • Multiple **Mark new transactions** rules offsetting to **Customer** and <br> • Set to automatically post the journal and <br> • One of the rules failed to post the journal (for example customer was stopped for payments) <br> The subsequent rules were not run.
18202		| Accounts receivable	| Interest notes - Due date	| When AR parameter field 'Use customer payment terms' for Interest notes is set to Yes, the Due date correctly included payment terms for the interest note in Customer transactions, but not on 'Settle transactions' or 'Detailed due date list report'.


### Release 10.0.37.20240530

#### Build 10.0.37.202405302
Release date: 30 May 2024 <br>

<ins>Manual actions required</ins>
- Delete any existing batch job for periodic task 'Update ABN validation' and create new batch job.

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
17215		| Various 	| Azure Connection	| Replace deprecated [Microsoft.WindowsAzure.Storage](https://learn.microsoft.com/en-us/dotnet/api/overview/azure/storage/windowsazurestorage%28deprecated%29?view=azure-dotnet-legacy) with [Azure.Storage.Blobs](https://learn.microsoft.com/en-us/azure/storage/blobs/storage-blob-dotnet-get-started?tabs=azure-ad).  <br> Applicable to: <br> • Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities connections <br> • Accounts receivable > Payments setup > Financial utilities connections (AR utilities feature) <br> • Organization administration > Electronic reporting > Electronic reporting export connections <br> <br> DXC_AzureClient 2024.05.30.1
16595		| Various	| Error messages	| Improved error messages for: <br> • Electronic reporting export connections - for errors with setup when generating ER file. <br> • Run reconcilation matching rule that can't find the customer account - include value of bank statement field with issue
N/A		| DXC License	| Licensing		| New DXC License model 10.0.37.202405231. See [Release notes](../LMG/Release-notes.md) for more details.

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
17981		| Accounts payable | Pending invoice	| 10.0.40 build error caused by missing reference for the ProcessAutomation Model which is now used by the VendInvoiceInfoTable. <br> Used to determine whether the Pending invoices button is enabled/disabled in the Vendor Purchase Invoice form.
17990		| Cash and bank management	| Reconciliation matching rule - Customer offset type using Customer references | The created customer payment journal uses the first customer account for all the found lines
18014		| ABN validation	| Security	| New privileges added to access ABN lookup and ABN status: <br> • ABN Validation <br> • Maintain ABN Status <br> •  Maintain ABN validation lookup <br> • Maintain ABN validation review <br> • View ABN Status <br> • View ABN validation lookup <br> • View ABN validation review
17998		| ABN validation	| Rename objects	| Rename objects ending with DXC_Extension: <br> • TaxVATNumTableForm_DXC_Extension <br> • TaxSalesTaxProcessReferenceDataInquire.DXC_Extension <br> • TaxSalesTaxTransactionStatusInquire.DXC_Extension <br> • TaxSalesTaxTrnStatusInquirWithoutTaxPrv.DXC_Extension <br> • TaxVATNumTable.DXC_Extension
18018		| Various   		| Rename objects	| Rename objects ending with DXC_Extension: <br> • BankStatementFormatForm_DXC_Extension <br> • BankChequeTableForm_DXC_Extension <br> • VendPaymMode_DXC_Extension <br> • BankTreasurerWorkspace_DXC_Extension <br> • VendorPaymentHistory_DXC_Extension <br> • BankReconciliationMatchRule_DXC_Extension <br> • CustPaymMode_DXC_Extension <br> • BankStatementTableForm_DXC_Extension

### Release 10.0.37.20240325

#### Build 10.0.37.2024032531
Release date: 16 May 2024 <br>

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
17524		| Various	| SFTP connection	| Upgrade SFTP SSH.NET to latest [2024.0.0](https://github.com/sshnet/SSH.NET/releases/tag/2024.0.0) release. Applicable to: <br> • Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities connections <br> • Accounts receivable > Payments setup > Financial utilities connections (AR utilities feature) <br> • Organization administration > Electronic reporting > Electronic reporting export connections

<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
17966		| Accounts receivable	| Generate payments | Fix for error 'Root element is missing', when generating a payment using a non ER Export format.


#### Build 10.0.37.2024032522
Release date: 26 April 2024 <br>

<ins>New features</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--     	|:--	         	|:--
17385		| Cash and bank management	| Reconciliation matching rule | Ability to set a **Description** mask for Mark new transactions for offset types **Ledger, Vendor and Bank**. <br> Related to 17290 that added this functionality for offset type Customer.  <br> **Editor** provides the ability to set a combination of static fields and placeholders: <br> • Currency <br> • Description <br> • Amount <br> • Document number <br> • Entry reference <br> • Bank statement transaction code <br> • Reference No. <br> • Related bank account <br> • Name (Trading party) <br> • Bank account <br> • Bank account number <br> • Bank groups <br> Note: If File name mask is not populated, the Bank statement line's Description will be written to new transaction's Description. <br> ![Recon matching rule](Images/ReleaseNotes_20240329_3.png "Recon matching rule")
17724		| Licensing	| N/A			| Improvements to licensing - see [Licensing release notes](../LMG/Release-notes.md#release-10037202404262) for detailed information.


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
17633		| Accounts receivable	| Interest notes - Due date | When AR parameter setting 'Use Customer payment terms' was set to _Yes_, it resulted in incorrect due dates for Free text invoices. <br> Only relevant to release 10.0.36.202403251
17448		| Accounts payable	| Method of payment - EFT file name Placeholders | Editor Placeholder picker displayed Bank statement fields added for Reconciliation matching rule's Description mask. <br> Only relevant to release 10.0.36.202403251
17479		| Accounts receivable	| Method of payment - EFT file name Placeholders | Editor Placeholder picker displayed Vendor's Method of payment and Description. Updated to use Customer for these two fields. <br> Only relevant to release 10.0.36.202403251

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
17422		| N/A		| N/A |  Update to **Table groups** to support "transaction" types being truncated in copy environment feature via Power platform admin center.


<ins>Bug fixes</ins>

Number	  	| Module	| Functionality	  	| Description
:--       	|:--   		|:--	           	|:--
16997		| Accounts payable	| EFT file name editor on Method of payment	| Refresh required to save updates to the file name using Editor <br> ![File name editor](Images/ReleaseNotes_20240329_10.png "File name editor")
16827		| Accounts receivable | EFT file name on Method of payment | If the same payment method PaymMode exists in the Accounts payable (AP) module, the EFT file name setup from the AP method of payment was used
17063		| Accounts receivable | Interest notes - Due date | Due date now updated before the transaction records are created. <br> Resolves error: "Cannot edit a record in Customer transactions (CustTrans). An update conflict occurred due to another user process deleting the record or changing one or more fields in the record."
17119		| Accounts payable <br> Accounts receivable	| ABN lookup	| Fix to 'Company name' in Search results
16925		| Organisation administration	| Electronic reporting jobs	| When using an Electronic reporting destination with document type in conjunction with Electronic reporting export connection, the record created in the Electronic reporting jobs will now also contain: <br> • Document handling attachment - ensure your file extension is added to supported File types in Document management parameters <br> • Field 'Files' populated with the file name.
17012		| Cash and bank management	| Reverse mark as new transaction	| Support added for reversing **mark as new** transactions offsetting to **vendor, bank or customer** within the same legal entity. <br> 15693 resulted on an incorrect sign on the reverse transaction on the bank, vendor and customer <br> Supports features: <br> • Enable bank reconciliation reversal even new transactions exist in posted bank statement <br> • Reverse posted bank statement with new transactions <br>
17126		| Cash and bank management	| Reconciliation matching rule	| When used to create automatically posted Customer dishonour payments, the automatically matching in the Bank reconciliation failed. 
17437		| Cash and bank management	| Bank statement periodic import | Archive issue when connection has high latency. File deleted before it could copy to Archive. Change: Before delete the result of copy is awaited and retried for 1 seconds 3 times before marking as an exception.


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

