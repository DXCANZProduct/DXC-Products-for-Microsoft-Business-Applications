---
layout: product-content
header: Finance Utilities
toc: true
---

## DXC Agent for Finance

The Finance Utilities deployable package contains the models used by [DXC Agent for Finance]({{ '/agent/dxcagentfinance' | relative_url }}). <br> 
Its functionality is grouped into the following features, each licensed separately:

Feature	   | Actions available in feature	  	
:--        |:--	         	
DXC Agent for bank reconciliation    | • [Match with bank documents]({{ '/agent/dxcagentfinance/bank-recon/match' | relative_url }}) - Match bank statement transaction with bank document and bank documents to bank documents.
DXC Agent for bank reconciliation voucher generation | • [Generate voucher]({{ '/agent/dxcagentfinance/bank-recon/voucher' | relative_url }}) - Create a new voucher transaction based on history for the bank account.
DXC Agent for bank reconciliation payment journal generation | • [Generate customer payment]({{ '/agent/dxcagentfinance/bank-recon/customer' | relative_url }}) - Create a new customer payment journal and settle an invoice where applicable. <br> • [Generate vendor payment]({{ '/agent/dxcagentfinance/bank-recon/vendor' | relative_url }}) -  Create a new vendor payment journal 

### DXC Agent for Finance and Finance Utilities

Where Finance Utilities and applicable Agent features are both enabled, the following Finance Utilities functionalities are incorporated:
- **Generate voucher - Offset type Bank**. Creating a bank transfer voucher based on history.
- **Generate voucher - Intercompany for Offset type Ledger and Bank**. Creating a ledger or bank transfer voucher in different legal entity based on history.
- **Generate customer payment - Current legal entity only**. Using Finance Utilities 'Customer references' to find the Customer account to create the customer payment journal

The following is not yet incorportated:
- **Generate customer payment - Intercompany**. Using Finance Utilities 'Customer references' to find the Customer account to create the customer payment journal
- **Generate vendor payment - Intercompany**. Ability to find the Vendor account in a different legal entity for centralised payments.
  
