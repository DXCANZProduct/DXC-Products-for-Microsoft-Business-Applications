---
# required metadata

title: EDI Vendor
description: EDI Vendor Setting profiles - Purchase invoice
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Vendor document type setting profiles - Purchase invoice

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Purchase invoice**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Purchase Invoice**</ins> |
**Item ID source**  |	Determine the method of item identification used by this vendor when selling products	  | •	**Our Item number** - this is the item ID on the items form <br> •	**External item number** - this is the item Id on the vendor external item form <br> •	**GTIN** - this is the GTIN assigned to an item <br> •	**Barcode** - This is the Barcode assigned to an item.
**Purchase order line matching strategy**   |	Specify the method of matching the EDI invoice line to D365 purchase order line |	•	**Item and line number** – if the Vendor sends the D365 purchase order line number, select this option. EDI will match by line number but error if Item numbers doesn’t match. <br> •	**Item number descending** – if the Vendor doesn’t send the D365 purchase order line number, select this option. EDI will match by Item number descending.
**Price includes sales tax**  |	Specify if the Misc. Amount and Unit price received from the Vendor includes tax. Converted to match purchase order	  | •	**As per purchase order** – The vendor is setup in D365 to match vendor’s method of including/excluding tax in pricing <br> •	**Excluding tax** – Vendor sends pricing excluding tax <br> •	**Including tax** – Vendor sends pricing including tax
**Origin**          |	Specify the default **Document origin** for the D365 Purchase invoice   |	•	Manual <br> •	Vendor portal <br> •	Service
**Invoice description** |	Specify the default **Description** to be used on D365 Purchase invoice	  | 50-character string field <br> Can be blank
**Invoice date**    |	Specify the default **Invoice date** to be used on the D365 Purchase invoice  | •	**Document date** – EDI document/Vendor document date <br> •	**Today’s date** – EDI staging-to-target processing date
**Posting date**    |	Specify the default **Posting date** to be used on the D365 Purchase invoice  | •	**Invoice date** – Invoice date as determined by **Invoice date** setting <br> •	**Today’s date** – EDI staging-to-target processing date
**Due date**        |	Specify the default Purchase invoice’s **due date** calculation method	      | •	**System due date** – System calculated due date <br> •	**Vendor due date** – EDI document/ Vendor’s due date
**Approved**        |	Option to default Purchase invoice as **approved**                            |	Yes/No
**Approved by**     |	Select **Approved by** employee. This option is available even if previous Approved is No. Requested approver on Invoice and Requested approver email address obtained from employee email	  | Employee drop-down
**Vendor exchange rate**  |	Option to use Vendor’s exchange rate as per EDI document	If EDI invoice currency doesn’t equal purchase order's currency, the following rate is used to convert EDI invoice values to PO currency  | •	**Yes** – Vendor exchange rate is used  <br> •	**No** – System exchange rate is used
**Attach file**     |	Option to attach original EDI file to Purchase invoice’s Attachments	        | • **Yes** - Attaches the file from Inbound file's document handling to the D365 purchase invoice <br> • **No** - No file attached to D365 purchase invoice
**Submit pending tax invoice with discrepancies** |	When workflow is enabled for vendor invoices, specify if the pending invoice should be submitted to workflow if a discrepancy has been found	Only applicable where Workflow is enabled for vendor invoices | •	**Yes** – Invoice with discrepancy is submitted to workflow <br> •	**No** – Invoice with discrepancy is not submitted to workflow
<ins>**Invoice type**</ins> | 
**Invoice**         |	Specify vendor's mapping for Invoice	    | EDIFACT example is 380
**On hold**         |	Specify if **Invoice** should be created as on hold	  | Yes/No
**Credit adjustment note**  |	Specify vendor's mapping for **Credit adjustment note**     |	EDIFACT example is 381
**On hold**         |	Specify if **Credit adjustment note** should be created as on hold	| Yes/No
<ins>**Charges code**</ins> | Specify default **Charges code** for Purchase invoice, two options:
**As per EDI document** |	Option to use Vendor provided charges code as per EDI document	| •	**Yes** – Charges code as per EDI document is used on Purchase invoice <br> •	**No** – Process ignores Vendor’s charges code provided on EDI document. Next field **Charges code** becomes mandatory
**Charges code**    |	Option to use a fixed charges code, i.e. ignore Vendor’s charges code in EDI document and set to this default. Only available when **As per EDI document** is _No_.	Drop-down options as per **Accounts payable > Charges setup > Charges code**
<ins>**Allocate charges to order lines**</ins> | Similar functionality as **Allocate charges** on Purchase order's Action Pane.
**Auto allocate charges** |	Option to automatically allocate EDI invoice header misc. charge, of type Item, to invoice lines	| When EDI Invoice’s Misc. header charge is of type Item: <br> •	**Yes** – Invoice’s header misc. charges will be allocated to lines. If existing allocation on the Purchase order, these will be used. Else the below document settings will be used to allocate. <br> •	**No** – Invoice’s header misc. charge isn’t allocated to invoice lines and staging errors with ‘Charges that are of the type Item have not been allocated’. Similar to confirmation that would error if a header charge of type item hasn’t been allocated.
**Charges allocation**  |	Select one of the following values to specify how the charges should be allocated	  | •	**Net amount** – Allocate charges according to each line amount relative to the total net amount. <br> •	**Quantity** – Allocate charges according to the number of units for each line relative to the total number of units. <br> •	**Per line** – Allocate charges equally among the total number of lines.
**Allocate charges to lines**   |	Select a value to specify whether charges should be allocated to all lines, to positive lines only, or to negative lines only.	| •	All lines <br> •	Positive lines <br> •	Negative lines
**Allocate all**        |	Select this check box to allocate charges to invoice lines even if the charges code has a debit type other than Item	| •	Yes <br> •	No
**Stocked**             |	Select this check box to allocate charges to only inventoried order lines	          | •	Yes <br> • No 


## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Purchase invoice** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI settings - Vendor documents purchase invoice

