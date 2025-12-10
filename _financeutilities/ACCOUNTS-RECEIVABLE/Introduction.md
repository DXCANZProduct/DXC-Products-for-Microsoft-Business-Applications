---
layout: product-content
header: Finance Utilities
toc: true
---

## Introduction
The DXC Finance Utilities module provides enhanced functionalities to Microsoft Dynamics 365 for the following:

# Accounts receivable
## Customer references

Ability to set multiple references against customers. These references can be used in the following scenarios:
- Customer remittance file refers to a reference unique to the customer, but not an invoice number. This reference can be used to find the applicable customer account when creating the customer payment journal while importing customer remittances using the additional licensed feature AR Utilities.
- Roadmap: Reconciliation matching rules additional ability to use the customer reference to find the applicable customer account when creating the customer payment journal.

Detail:
- [Customer reference setup]({{ '/financeutilities/ACCOUNTS-RECEIVABLE/Setup/Customer-reference' | relative_url }})

## Interest notes Due date
Ability to use Customer's payment terms when posting Interest notes. 

- [Customer parameters setup]({{ '/financeutilities/ACCOUNTS-RECEIVABLE/Setup/Customer-parameters' | relative_url }})

## Import customer remittance
> Note: Additional feature included in AR Utilities. If you are licensed for Finance Utilities, this extra feature can be added to your license on request.

Enhancement to import customer remittance files using data entity Customer payment journal.
- [Import customer remittance setup]({{ '/financeutilities/ACCOUNTS-RECEIVABLE/Setup/Customer-remittance' | relative_url }})
- [Import customer remittance processing]({{ '/financeutilities/ACCOUNTS-RECEIVABLE/Processing/Customer-remittance' | relative_url }})

