---
# required metadata

title: [Finance Utilities ]
description: [Processing - ABN lookup and validation]
author: [jdutoit2]
manager: Kym Parker
ms.date: 04/03/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# ABN lookup

When ABN validation has been enabled for the legal entity, the ABN lookup feature is available through below options for Vendor and Customer as discussed in the following subsections.
Advanced filters are also available to limit the search results:
•	Select the applicable state/s.
•	ZIP/postal code
•	Search width (Typical or Narrow)
•	Active (No / Yes)

## Vendors
ACCOUNTS PAYABLE > VENDORS > ALL VENDORS
Select the applicable Vendor and choose either of the following:
•	On the Action Pane, on the Vendor tab, in the Registration group, select ABN lookup. The vendor’s Name will be populated in the Search box. Add any advanced filters and select the Search button. In the Search results, select the applicable line and press OK, this will create (if required) and populate the Tax exempt number on the currently selected Vendor.
•	On the Invoice and delivery FastTab, select or view details on the Tax exempt number field. Select the ABN lookup button. Enter the company’s name in the Search box. Add any advanced filters and select the Search button. In the Search results, select the applicable line and press OK, this will create the Tax exempt number, but user still needs to assign it to the vendor in the Invoice and delivery FastTab.

## Customers
ACCOUNTS RECEIVABLE > CUSTOMERS > ALL CUSTOMERS
Select the applicable Customer and choose either of the following:
•	On the Action Pane, on the Customer tab, in the Registration group, select ABN lookup. The customer’s Name will be populated in the Search box. Add any advanced filters and select the Search button. In the Search results, select the applicable line and press OK, this will create (if required) and populate the Tax exempt number on the currently selected Customer.
•	On the Invoice and delivery FastTab, select or view details on the Tax exempt number field. Select the ABN lookup button. Enter the company’s name in the Search box. Add any advanced filters and select the Search button. In the Search results, select the applicable line and press OK, this will create the Tax exempt number, but user still needs to assign it to the customer in the Invoice and delivery FastTab.


# ABN status / validation
When ABN validation has been enabled for the legal entity, the ABN status/validation feature is available through below options for Vendor and Customer as discussed in the following subsections
The following ABN Status information will be displayed for the selected customer or vendor:
•	ABN
•	Status: Examples are Active, Cancelled
•	Type: Examples are Australian Private Company
•	Trading name
•	State
•	Post code

## Vendors
ACCOUNTS PAYABLE > VENDORS > ALL VENDORS
Select the applicable Vendor and choose either of the following:
•	On the Action Pane, on the Vendor tab, in the Registration group, select ABN status.
•	Manually enter the Tax exempt number on the Invoice and delivery FastTab.

## Customers
ACCOUNTS RECEIVABLE > CUSTOMERS > ALL CUSTOMERS
Select the applicable Customer and choose either of the following:
•	On the Action Pane, on the Customer tab, in the Registration group, select ABN status.
•	Manually enter the Tax exempt number on the Invoice and delivery FastTab.

# ABN validation report
To run the **ABN validation** report, go to **Organization administration > Inquiries and reports > ABN validation**. <br>
Select the applicable parameters and press **OK**.

Field	              | Description
|--                 |--               |
**Filter by type**  |	Set to _Yes_ if report should be filtered by type
**Filter type**     |	If Filter by type was set to _Yes_, select: <br> •	Customer, or <br> •	Vendor 
**Status**          |	Select the applicable status: <br> •	All <br> •	Valid <br> •	Invalid <br> •	Cancelled
