---
layout: product-content
header: Care Services
toc: true
---


# Services Australia Support at Home Custom Service

## D365FO Custom Service
The solution provides custom service endpoints for integrating with Services Australia Support at Home APIs. All APIs have been certified by Services Australia to ensure compliance and compatibility.

**Service group name** - DXCSAPI_SAH_Service  

### Care Recipients
**Service name** - CareRecipients

**Service endpoints**
- GetIndividualContribution

### Budgets
**Service name** - Budgets

**Service endpoints**
- GetBudgetSummary
- GetServiceProviderBudgets
- GetCareRecipientBudgets
- GetBudgetDetails
- BudgetRollover

### Event Supplements
**Service name** - EventSupplements

**Service endpoints**  
*Entry*
- GetEntries
- CreateEntry
- UpdateEntry
- DeleteEntry
- GetEntry

*Departure*
- GetDepartures
- GetDeparture
- CreateDeparture
- UpdateDeparture
- DeleteDeparture

*Oxygen supplement*
- GetOxygenSupplements
- GetOxygenSupplement
- CreateOxygenSupplement
- UpdateOxygenSupplement
- EndOxygenSupplement
- DeleteOxygenSupplement
- UploadOxygenSupplementAttachment
- ImportOxygenSupplementAttachment

*Enteral feeding supplement*
- GetEnteralFeedingSupplements
- GetEnteralFeedingSupplement
- CreateEnteralFeedingSupplement
- UpdateEnteralFeedingSupplement
- EndEnteralFeedingSupplement
- DeleteEnteralFeedingSupplement
- UploadEnteralFeedingSupplementAttachment
- ImportEnteralFeedingSupplementAttachment

### Invoice
**Service name** - Invoices

**Service endpoints**
- GetInvoices
- GetInvoice
- GetInvoiceItem
- CreateInvoice
- SubmitInvoice
- ReopenSubmittedInvoice
- AddItemToInvoice
- UpdateInvoiceItem
- DeleteInvoiceItem
- UploadAttachment
- RetrieveAttachmentDetails
- GetAttachmentPdfImage
- DeleteAttachmentPdfImage
- DeleteInvoice

### Claim
**Service name** - Claims

**Service endpoints**
- GetClaims
- GetClaim
- SubmitClaim

### Payment
**Service name** - Payments

Endpoints
- GetPaymentStatement
- GetPaymentStatementDownload

## Getting Started

### Register your external application  
   - **Register you app in Azure Portal** - https://learn.microsoft.com/en-us/entra/identity-platform/quickstart-register-app
   - **Register your external app in D365FO** - https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/data-entities/services-home-page#register-your-external-application

### Postman collection
1. **Environment variables**
   - **API URI** - api/services/DXCSAPI_SAH_Service
   - **Base URI** - D365 FO environment URL
   - **Tenant Id** - Entra ID application tenant Id
   - **Client Id** - Entra ID application client Id
   - **Client secret** - Entra ID application client secret
   - **Resource** - Entra ID application resource, end with /.default
2. **Postman collection** - [Download Postman Collection](FILES/DXC%20Care%20Services%20API%20Suite%20postman%20collection%20-%20202511201.zip) 