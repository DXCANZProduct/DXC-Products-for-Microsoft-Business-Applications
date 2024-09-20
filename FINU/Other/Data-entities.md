---
# required metadata

title: Finance Utilities
description: Finance Utilities setup - Data Entities 
author: Monica du Toit
manager: Pontus Ek
ms.date: 2024-01-16
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
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Cash and bank management
Finance utilities includes the following data entities in Cash and bank management:

### Financial utilities parameters
Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters <br>
Data entity: Financial utilities parameters

### Financial utilities connection
Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities connections

**Order** | **Entity**                            
:--       |:--
1 | **Financial utilities connections**  
2 | **Connection - FTP** 
2 | **Connection - SFTP**
2 | **Connection - Azure blob**
2 | **Connection - Sharepoint**

### Bank accounts
Cash and bank management > Bank accounts > Bank accounts

**Entity**                          | **Additional Finance utilities fields for standard entity**                
:--       |:--                   
**Bank accounts**                   | **EFT parameters:** <br> • BPAY batch ID (DFUBPAYBATCHID) <br> •	Extra balance line on EFT (DFUEXTRABALANCELINE) <br> • Include balance line in record count (DFUBALANCELINECOUNT) <br> • Total line order (DFUTOTALLINEORDER) <br> • Use vendor bank name (DFUUSEVENDBANKNAME) <br> • User identification (DFUEFTUSERID) <br> **Import financial utilities connection:** <br> • Financial utilities connection (DFUCONNECTIONNAME)

### Reconciliation matching rules
Cash and bank management > Setup > Advanced bank reconciliation setup > Reconciliation matching rules

**Entity**                          | **Additional Finance utilities fields for standard entity**                     
:--       |:--
**Reconciliation matching rules**   | **Step 2: Do not mark when there are matching bank transactions:** <br>  •	Group by document number (SYSTEMGENERATEDTYPE = ECL_GroupByDocumentNum) <br> • Include in (DFUBANKRULEACTIVATEINCLUDEIN) <br> **Step 3: Extended financial details:** <br> • Company (DFUCOMPANY) <br> •	Offset company (DFUOFFSETCOMPANY) <br> •	Offset account type (DFUOffsetAccountType) <br> •	Offset account (DFUOFFSETLEDGERDIMENSIONDISPLAYVALUE) <br> • Account's financial dimension values (DFUDEFAULTDIMENSIONDISPLAYVALUE) ** <br> •	Offset account's financial dimension values (DFUOFFSETDEFAULTDIMENSIONDISPLAYVALUE) ** <br> •	Offset account bank statement field (DFUOFFSETACCOUNTFIELDNAME) <br> • Offset account reference bank statement field (DFUOFFSETACCOUNTREFERENCEFIELDNAME) <br> • Settle transaction (DFUSETTLETRANS) <br> •	Settle transaction bank statement field (DFUSETTLETRANSFIELDNAME) <br> •	Auto-post customer payment journal (DFUCUSTPAYMAUTOPOST) <br> •	Auto-post and transfer customer payment journal (DFUCUSTPAYMAUTOPOSTTRANSFER) <br> •	GST group (DFUTAXGROUP) <br> •	Item GST group (DFUTAXITEMGROUP)  <br> • Description mask (SAB_DESCRIPTIONMASK) | 

> ** Note: Ensure the **Financial dimension configuration for integrating applications** dimension format aligns with dimensions on the bank reconciliation matching rule before importing the **Reconciliation matching rules** entity. General ledger > Chart of accounts > Dimensions > Financial dimension configuration for integrating applications. <br> Define data entity format for **Default dimensions integration** and **Ledger dimensions integration**. <br>
> See [link](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/financial/financial-dimension-configuration-integration) for more detail.

### Bank statement format
Cash and bank management > Setup > Advanced bank reconciliation setup > Bank statement format <br> 
Bank statement format entities are a combination of Finance utilities entities and additional fields added to standard entity. 

**Order** | **Entity**                          | **Standard / Finance <br> utilities entity**   | **Additional Finance utilities fields for standard entity** 
:--       |:--  |:--  |:--
1         | **Bank statement format**           | Standard                                  |  • Custom format (SAB_FINCUSTOMFORMAT) <br> • ABSR file type (SAB_FINFILETYPE) <br> • Field delimiter (SAB_FINFIELDDELIMITER) <br> •  Record code field position (SAB_FINFIELDPOSITION) <br> • Record code field length (DFUIMPORTLENGTHRECORDCODE) |
2         | **Custom line codes**               | Finance utilities                         | - 
3         | **Bank statement format lines**     | Finance utilities                         | - 
4         | **Line codes format**               | Finance utilities                         | - 

> Note: If comma is used in **Field delimiter** on the **Bank statement format**, set SAB_FINFIELDDELIMITER **Text qualifier** to _Yes_ in Mapping details.


# Accounts payable
Finance utilities includes the following data entities in Accounts payable:

### Vendor bank accounts
Accounts payable > Vendors > All vendors - Bank accounts on Vendor FastTab

**Entity**                          | **Additional Finance utilities fields for standard entity**                 
:--       |:--                                       
**Vendor bank accounts**            | • Biller code (DFUBILLERCODE) <br> • Lodgement reference (DFULODGEMENTREF) <br> • Bank code (ECL_BANKCODE) <br> • Bank particulars (ECL_BANKPARTICULARS) <br> • Bank reference (ECL_BANKREFERENCE) 

### Vendor methods of payment
Accounts payable > Payment setup > Methods of payments

**Entity**                          | **Additional Finance utilities fields for standard entity**                 
:--       |:--                                       
**Vendor payment method**           | • Sundry method of payment (DFUSUNDRYPAYM) <br> • Auto payment reference number (DFUAUTOPAYMENTREFNUMBER) <br> • BPAY method of payment (DFUBPAYPAYM) <br> • Payment control > Lodgement reference is mandatory (DFUVALIDATELODGEMENTREFISMANDATORY) <br> • Payment attributes > Lodgement reference (DFUATTRIBUTELODGEMENTREFENABLED)

# Accounts receivable
Finance utilities includes the following data entities in Accounts receivable:

### Reference number type
Accounts receivable > Setup > Reference number type <br>
Data entity: Reference number type

### Customer references
Accounts receivable > Customers > All customers: Customer references <br>
Data entity: Customer references

# Budgeting
Finance utilities includes the following data entities in Budgeting:

### Budget utilities parameters
Budgeting > Setup > Basic budgeting > Budget utilities parameters <br>
Data entity: Budget utilities parameters

# Accounts receivable - AR utilities
**Finance utilities - AR utilities** includes the following data entities in Cash and bank management:

> Note: The forms and additional fields are only available where additional licensed feature **Finance utilities - AR utilities** is enabled

### Remittance format
Accounts receivable > Payments setup > Remittance format <br>

**Order** | **Entity**                            
:--       |:--
1         | Finance utilities template file
2         | Remittance format
3         | Finance utilities template file section
4         | Finance utilities template file line section

### Financial utilities connections
Accounts receivable > Payments setup > Financial utilties connection

**Order** | **Entity**                            
:--       |:--
1 | **Financial utilities connections**  
2 | **Connection - FTP** 
2 | **Connection - SFTP**
2 | **Connection - Azure blob**
2 | **Connection - Sharepoint**

### Accounts receivable parameters
Accounts receivable > Setup > Accounts receivable parameters

**Entity**                          | **Additional Finance utilities fields for standard entity**                 
:--       |:-- 
**Customer parameters** | • Create prepayment (DXCARCREATEPREPAYMENT) <br> • Auto post customer payment journal (DXCARAUTOPOSTCUSTPAYMJOUR) <br> • File attachment document type (DXCARDOCUTYPEID)


### Methods of payment
Accounts receivable > Payment setup > Methods of payment

**Entity**                          | **Additional Finance utilities fields for standard entity**                 
:--       |:-- 
**Customer payment method**   | • Error account customer (DXCARCUSTACCOUNTERROR) <br> • Settle transactions (DXCARSETTLETRANSACTIONS) <br> • Posting date (DXCARPOSTINGDATETYPE) <br> • Reference number type (DXCARREFERENCENUMBERTYPE) <br> • Remittance format
