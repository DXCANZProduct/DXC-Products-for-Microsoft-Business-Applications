---
# required metadata

title: EDI Vendor
description: EDI Vendor Setup - Document type Validation profiles - Vendor purchase order acknowledgement
author: jdutoit2
manager: Kym Parker
ms.date: 2021-11-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDITradingPartner, SAB_EDIDocumentTypeTable
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

# Vendor setup
## Vendor document type validation profiles - Vendor purchase order acknowledgement (POA)

Users can access the form by navigating to **EDI > Setup > Document types**.

Validation profiles are groups of business validation rules that can be applied to a trading partner. They provide the ability to set variable tolerances on various different aspects of the documents business process. Once a validation profile is created it can be configured by adding validation rules to it and defining the error tolerance of the rule. <br>
Once setup for each document type, the validation profile can be assigned to each incoming document on the Trading partner setup in **EDI > Setup > Trading partners**.

> Note:  The validation profiles FastTab is only displayed for Document types that have valid validation options

- To create a new record, select the **New** button in the validation profiles FastTab.
- Specify the **Name** and **Description** of the profile.
- Select the **Name** hyperlink or the **Setup** button to update profile details.
- Select **Add** to add the validation rule.
- Select the **Validation rule**.
- Select the **Error tolerance** to specify the validation level.  If a validation rule fails, this will be used to determine how it reacts. The logs can be viewed on the staging record's **Show log** or **Version log**. Options:
  - **Info** - An Infolog is displayed with information only. If the validation rule fails a message will be written to the staging records log but the record will continue to process.
  - **Warning** - An Infolog is displayed with a warning. If the validation rule fails a message will be written to the staging records log but the record will continue to process. 
  - **Error** - An Infolog is displayed with an error. If the validation rule fails, the staging records will be set to error state and the target document note created/updated. 

**Validation instance**       | **Validation rule**           | **Description**       | **Info/Warning tolerance updates**
:-------                      |:-------                       |:----------            |:----------
**Purchase order**            | **Reject**                    |	POA Header indicates the Vendor is rejecting the order 	| Cancels D365 PO
**Purchase order**            |	**Version**                   |	Vendor’s POA version doesn’t match current PO version	  | Disregards difference in version
**Purchase order**            |	**Delivery date**             |	Vendor’s POA delivery date doesn’t match PO delivery date	| Update D365 PO's confirmed delivery date
**Purchase order**            |	**Vendor reference**          |	Vendor’s POA Vendor reference doesn’t match PO Vendor reference	| Update D365 PO's Vendor reference
**Purchase order line**       | **Delivery date**             |	Vendor’s POA line delivery date doesn’t match PO line delivery date	| Update D365 PO line's confirmed delivery date
**Purchase order line**	      | **Minimum/maximum quantity**  |	The POA quantity should be devisable by the multiple specified on the Default/Site order settings table. Since this validation can increase the allowed delivery, it is also used to check if vendor’s quantity is within the allowed purchase order line over-delivery %. Set to error if not allowed to increase over this over-delivery %	| Update D365 PO line's deliver remainder. Use unit conversion if POA units differs.
**Purchase order line**	      | **Purchase price**            |	The POA line's unit price should be checked against the purchase order being acknowledged. Example: <br> Item X PO price 10.25 <br> Item Y PO price 8.88 <br> Vendor has a min and max tolerance setting of 0.05 <br> Vendor does not have their trade agreements entered including tax <br> Vendor sends their EDI orders including tax <br> The setting **Use vendor price** is given <br> Item X EDI file price (before converting) 11.26 (after conversion) 10.24 <br> Item Y EDI file price (before converting) 9.70 (after conversion) 8.82 <br> Template setting against this field is warning. <br> A warning is only given for Item Y because it is outside of the tolerance.  The warning message should show the price before and after conversion plus the price AX finds. It also used unit of conversion in price comparison if vendors unit doesn’t match purchase order.	| Update D365 PO line's unit price (if within allowed variance): else error
**Purchase order line**       |	**Short pick**                |	Acknowledgement quantity is less than purchase order line quantity. <br> After unit conversion, and also checks purchase order line’s under-delivery %	| Update D365 PO line's deliver remainder qty (use unit conversion if POA different unit). If outside under-delivery %: error
**Purchase order line**       |	**Batch Id update**           | Where the POA's batch id received is different to the batch id on the purchase order.	| If batch doesn’t exist in D365 for the item, the D365 batch is created and assigned to purchase order line
**Purchase order line**       |	**Reject**                    |	POA line indicates the Vendor is rejecting the order line 	| Cancel only the applicable purchase order line’s deliver remainder

## Where used
The **Validation profile** can be assigned on the Incoming documents FastTab to document type **Vendor purchase order acknowledgement** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Validation profile
- EDI Validation profile line
