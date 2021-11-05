---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Customer advanced shipping notice]
author: [jdutoit2]
manager: Kym Parker
ms.date: 5/11/2021
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

# Customer advanced shipping notice (ASN)

EDI customers may require an advanced shipping notice (ASN) for a sales order.

> Note: Customer advanced shipping notice can also be sent for a sales order not created via EDI.

The following subsections will describe how to view, process and send Customer advanced shipping notice to applicable Customer Trading partners. 
Viewing the [Staging table records](#view-staging-table-records) will also be discussed.
The created ASN record(s) can be viewed for a sales order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Sales order page.<br>

## Processing

### Post packing slip
When posting a packing slip for a sales order, it is possible to add consignment information.
-	From the packing slip posting form, select the **Assign consignment note** button
-	To create a new consignment note record, select **New**
    - Update the **Consignment note number**
    - Select the **Shipping carrier** and **Carrier service**
-	To select a previously created consignment note, select the record
> Note: Consignment notes will be matched to the delivery based on the Delivery Name, Delivery address, Customer account and warehouse.
-	Click **Assign** to attach the consignment note number to the packing slip
-	**Send to EDI**: Where the **ASN strategy** has been configured to:
    - **Single packing slip**, the Send to EDI flag will be set to _Yes_.  Once the packing slip is posted, a Customer advanced shipping notice record will be created in the staging table.
    - **Consolidated packing slip**, the Send to EDI flag will be set to _No_. Users still need to assign the Consignment note, but the ASN must be sent to EDI from the [Consignment notes](#consignment-notes) page before a Customer advanced shipping notice staging record will be created.

> Note: **ASN strategy** is setup on the [Customer advanced shipping notice setting profile](../SETUP/SETTING%20PROFILES/Customer%20advanced%20shipping%20notice.md)
and assigned to the Trading partner when setting up the document on their outgoing documents. 

> Note: If the packing slip was posted without assigning a consignment note, it is possible to add the packing slip to a consignment note afterwards().
> The Customer advanced shipping notice setting profile, has the option to **Warn when consignment note not assigned**.

### Consignment notes
EDI requires the delivery to be assigned to a consignment note. The consignment note can contain one or multiple deliveries.
The consignment note can be created when posting the packing slip, or by following the steps as per following subsection.

#### Create a consignment note
To open the **Consignment notes** page, go to **EDI > Inquiries and reports > Consignment notes**. Then set the fields as described below.
-	To create a new consignment note, select **New**
-	Select the **Customer account** for the consignment
-	Enter the **Consignment note number**
-	Select the **Shipping carrier** and **Carrier service**
-	Select the **Delivery address information**

#### Add packing slips to a consignment note
To open the **Consignment notes** page, go to **EDI > Inquiries and reports > Consignment notes**. Then set the fields as described below.
-	Select the applicable consignment note
-	To add packing slips, select **Add** from the consignment lines
-	A list of unassigned packing slips for the customer and delivery address will be displayed
-	Select valid record(s) to be assigned to the consignment note
-	Select **Add lines**

#### Create ASN from consignment notes

#### Auto generate a consignment note number

## View staging table records
To view the Customer purchase order acknowledgement staging records, go to **EDI > Documents > Customer documents > Customer purchase order acknowledgement**. 
Use this page to review staging and process EDI Customer purchase order acknowledgements documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**

### Buttons
The following buttons are available on the **Customer purchase order acknowledgement** Action Pane, tab **Purchase order acknowledgement**.

**Button**	                    | **Description**

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	              | **Description**	                                      | **Source D365 field**
:---                      |:---                                                   |:---

### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	              | **Description**	                                      | **Source D365 field**
:---                      |:---                                                   |:---
