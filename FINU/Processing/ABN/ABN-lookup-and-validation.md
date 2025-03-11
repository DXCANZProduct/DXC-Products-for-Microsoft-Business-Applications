---
# required metadata

title: Finance Utilities 
description: Processing - ABN lookup and validation
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-03-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXC_ABNValidationProviderTypeTable
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom:: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# ABN lookup

When ABN validation has been enabled for the legal entity, the **ABN lookup** functionality is available through below options for Vendor and Customer as discussed in the following subsections.

Advanced filters are also available to limit the search results: <br>
- Select the applicable state(s)
- ZIP/postal code
- Search width - Typical or Narrow
- Active - No / Yes

## Prerequisites
The following setup are [prerequisites](../../Setup/ABN/ABN-lookup-and-validation.md) for ABN lookup and validation:
- Register for Web API
- Setup ABN validation providers
- Setup legal entity to use the ABN validation provider

## Vendors
Go to **Accounts payable > Vendors > All vendors** and select the applicable Vendor. Choose either of the following: <br>
- On the Action Pane, on the **Vendor** tab, in the **Registration** group, select **ABN lookup**. The vendor’s Name will be populated in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create (if required) and populate the **Tax exempt number** on the currently selected Vendor.
- On the **Invoice and delivery** FastTab, select or view details on the **Tax exempt number** field. Select the **ABN lookup** button. Enter the company’s name in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create the Tax exempt number, but user still needs to assign it to the vendor in the **Invoice and delivery** FastTab. If using ABN to search, turn on **Search by ABN**.  

## Customers
Go to **Accounts receivable > Customers > All customers** and select the applicable Customer. Choose either of the following: <br>
- On the Action Pane, on the **Customer** tab, in the **Registration** group, select **ABN lookup**. The customer’s Name will be populated in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create (if required) and populate the **Tax exempt number** on the currently selected Customer.
- On the **Invoice and delivery** FastTab, select or view details on the **Tax exempt number** field. Select the **ABN lookup** button. Enter the company’s name in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create the Tax exempt number, but user still needs to assign it to the customer in the **Invoice and delivery** FastTab. If using ABN to search, turn on **Search by ABN**.  


# ABN status / validation
When ABN validation has been enabled for the legal entity, the **ABN status/validation** functionality is available through below options for Vendor and Customer as discussed in the following subsections
The following **ABN Status** information will be displayed for the selected customer or vendor:
- **ABN**
- **Status** - Examples are Active, Cancelled or Invalid (not found in ABN lookup)
- **Type** - Examples are Australian Private Company, Discretionary Trading Trust
- **Trading name**
- **State**
- **Post code**
- **GST from**
     - **Registered for GST**: From date for current GST registration status
     - **Cancelled GST**: Obtained from historical details
     - **Not registered for GST**: Earliest ABN entity status from date
- **GST to** - Populated where the ABN is registered for GST
- **GST registered**
     - **Registered for GST**: Y
     - **Cancelled GST**: C
     - **Not registered for GST**: N

## Vendors
Go to **Accounts payable > Vendors > All vendors** and select the applicable Vendor and choose either of the following:
- On the Action Pane, on the **Vendor** tab, in the **Registration** group, select **ABN status**.
- Manually enter the **Tax exempt number** on the **Invoice and delivery** FastTab.

## Customers
Go to **Accounts receivable > Customers > All customers** and select the applicable Customer and choose either of the following:
- On the Action Pane, on the **Customer** tab, in the **Registration group**, select **ABN status**.
- Manually enter the **Tax exempt number** on the **Invoice and delivery** FastTab.

## Vendor invoices
Ability for users to check the current ABN and GST status for a vendor while entering an invoice. <br>
**ABN status** button is enabled when the 'Tax exempt number'/'ABN' is populated for the vendor invoice line. <br> 

Available on the ActionPane in the following forms:
- Accounts payable > Invoices > Invoice journal
- Accounts payable > Invoices > Pending vendor invoices
- Accounts payable > Invoices > Tax invoice register
- General ledger > Journal entries > General journals
- Project management and accounting > Journals > Expense

# ABN validation report
To run the **ABN validation** report, go to **Organization administration > Inquiries and reports > ABN validation**. <br>
Select the applicable parameters and press **OK**.

### Fields
- **Filter by type** -	Set to _Yes_ if report should be filtered by type
- **Filter type** -	If Filter by type was set to _Yes_, select either of the following:
   - Customer
   - Vendor 
- **Status**  -	Select the applicable status:
   - All - not filtered to any specific status
   - Valid
   - Invalid
   - Cancelled

# Run update
To update below fields based on current government online information:

- **Company name** - where the Company name is blank
- **Status** - Examples are Active, Cancelled or Invalid (not found in ABN lookup)
- **Entity type** - Examples are Australian Private Company, Discretionary Trading Trust
- **GST from** - Populated where the ABN is registered for GST
- **GST to** - Populated where the ABN is registered for GST
- **GST registered** - Set to:
     - **Y** where 'GST to' date is in the future or 0001-01-01
     - **C** where 'GST to' date is in the past
     - **N** where never been registered for GST


The following can be used:
- **Update ABN validation** periodic task
- **Run update** on **ABN validation review** form
- When adding new records via **ABN lookup**

# Review updates

Users can review new/updated ABN records, for example an ABN is not registered for GST anymore.

- Navigate to **Organization administration > Inquiries and reports > ABN validation review**.
- **Related information** can be used to view the customer(s) and/or vendor(s) that have the ABN allocated.
- Select applicable record(s) and select **Mark as reviewed** to update their reviewed status.
- **Run update** can be used to run the web service to update ABNs with current data from the Australian Business Register.
- **Change history** can be used to view changes made in D365 for each ABN.

  
