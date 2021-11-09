---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor Setup - Document type Validation profiles - Vendor advanced shipping notice]
author: [jdutoit2]
manager: Kym Parker
ms.date: 9/11/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Vendor setup
## Vendor document type validation profiles - Vendor advanced shipping notice (ASN)

Users can access the form by navigating to **EDI > Setup > Document types**.

Validation profiles are groups of business validation rules that can be applied to a trading partner. They provide the ability to set variable tolerances on various different aspects of the documents business process. Once a validation profile is created it can be configured by adding validation rules to it and defining the error tolerance of the rule. <br>
Once setup for each document type, the validation profile can be assigned to each incoming document on the Trading partner setup in **EDI > Setup > Trading partners**.

> Note:  The validation profiles FastTab is only displayed from Document types that have valid validation options

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
The **Validation profile** can be assigned on the Incoming documents FastTab to document type **Vendor advanced shipping notice** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Validation profile
- EDI Validation profile line
