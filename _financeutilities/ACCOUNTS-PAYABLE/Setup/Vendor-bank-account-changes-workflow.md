---
layout: product-content
header: Finance Utilities
toc: true
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## Vendor approval workflow

When changes are made to specific vendor or vendor bank account fields, standard D365 vendor workflow can be used for approval before the changes are applied to the vendor. 
Finance utilities has added additional **Vendor bank account** and **Vendor** fields that can be managed by the workflows provided by standard D365.

Users can access the **Accounts payable parameters** page by navigating to **Accounts payable > Setup > Accounts payable parameters**. <br>

### Vendor
The below fields have been added to the existing **Vendor approval** fields. <br> 
When enabled they will be submitted using the existing **Proposed vendor changes workflow** (VendTableChangeProposalWorkflow). <br> 
-	Payment id (existing field used for Finance utilities BPAY)

### Vendor bank account
The below fields have been added to the existing **Vendor bank account approval** fields. <br> 
When enabled they will be submitted using the existing **Workflow approval for proposed vendor change** (VendBankAccountChangeProposalTemplate). <br>
-	Biller code (Finance utilities BPAY field)
-	Lodgement reference (Finance utilities BPAY field)

