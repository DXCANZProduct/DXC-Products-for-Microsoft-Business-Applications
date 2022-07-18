---
# required metadata

title: Finance Utilities 
description: Processing - ABN lookup and validation
author: jdutoit2
manager: Kym Parker
ms.date: 2022-03-04
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  Finance Utilities 
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: Global 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom:: 2016-05-51
ms.dyn365.ops.version: AX 7.0.1
---

# ABN lookup

When ABN validation has been enabled for the legal entity, the **ABN lookup** functionality is available through below options for Vendor and Customer as discussed in the following subsections.

Advanced filters are also available to limit the search results: <br>
- Select the applicable state(s)
- ZIP/postal code
- Search width - Typical or Narrow
- Active - No / Yes

## Vendors
Go to **Accounts payable > Vendors > All vendors** and select the applicable Vendor. Choose either of the following: <br>
- On the Action Pane, on the **Vendor** tab, in the **Registration** group, select **ABN lookup**. The vendor’s Name will be populated in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create (if required) and populate the **Tax exempt number** on the currently selected Vendor.
- On the **Invoice and delivery** FastTab, select or view details on the **Tax exempt number** field. Select the **ABN lookup** button. Enter the company’s name in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create the Tax exempt number, but user still needs to assign it to the vendor in the **Invoice and delivery** FastTab.

## Customers
Go to **Accounts receivable > Customers > All customers** and select the applicable Customer. Choose either of the following: <br>
- On the Action Pane, on the **Customer** tab, in the **Registration** group, select **ABN lookup**. The customer’s Name will be populated in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create (if required) and populate the **Tax exempt number** on the currently selected Customer.
- On the **Invoice and delivery** FastTab, select or view details on the **Tax exempt number** field. Select the **ABN lookup** button. Enter the company’s name in the Search box. Add any advanced filters and select the **Search** button. In the Search results, select the applicable line and press OK, this will create the Tax exempt number, but user still needs to assign it to the customer in the **Invoice and delivery** FastTab.


# ABN status / validation
When ABN validation has been enabled for the legal entity, the **ABN status/validation** functionality is available through below options for Vendor and Customer as discussed in the following subsections
The following **ABN Status** information will be displayed for the selected customer or vendor:
- ABN
- Status - Examples are Active, Cancelled
- Type - Examples are Australian Private Company
- Trading name
- State
- Post code

## Vendors
Go to **Accounts payable > Vendors > All vendors** and select the applicable Vendor and choose either of the following:
- On the Action Pane, on the **Vendor** tab, in the **Registration** group, select **ABN status**.
- Manually enter the **Tax exempt number** on the **Invoice and delivery** FastTab.

## Customers
Go to **Accounts receivable > Customers > All customers** and select the applicable Customer and choose either of the following:
- On the Action Pane, on the **Customer** tab, in the **Registration group**, select **ABN status**.
- Manually enter the **Tax exempt number** on the **Invoice and delivery** FastTab.

# ABN validation report
To run the **ABN validation** report, go to **Organization administration > Inquiries and reports > ABN validation**. <br>
Select the applicable parameters and press **OK**.

Field	              | Description
|--                 |--               |
**Filter by type**  |	Set to _Yes_ if report should be filtered by type
**Filter type**     |	If Filter by type was set to _Yes_, select: <br> •	Customer, or <br> •	Vendor 
**Status**          |	Select the applicable status: <br> •	All <br> •	Valid <br> •	Invalid <br> •	Cancelled
