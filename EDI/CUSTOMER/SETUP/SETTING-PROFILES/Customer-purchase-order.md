---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setup - Document type Setting profiles - Customer purchase order]
author: [jdutoit2]
manager: Kym Parker
ms.date: 28/06/2022
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

# Customer document type setting profiles - Purchase order

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Customer purchase order**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>Purchase order</ins> |   |
**Item ID Source**  |	Determine the method of item identification used by this customer when ordering products. Where the External item number, GTIN or Barcode is unique per Variant, EDI will create the sales order against the correct variant, i.e. the customer doesn’t have to supply variant details in inbound document.	| •	**Our Item number** - this is the item ID on the items form <br> •	**External item number** - this is the item Id on the customer external item form <br> •	**GTIN** - this is the GTIN assigned to an item <br> •	**Barcode** - This is the Barcode assigned to an item.
**Blank unit**    | Where the staging record will create a new sales line and the **Unit** is not provided in the file, this document setting provides options to use for the blank unit staging line(s) D365 sales order line's **Unit** |  • **Sales unit** - Use item's sales unit  <br> • Sales trade agreement unit <br> • Inventory unit <br> • Error (errors the complete staging record)
**Price includes tax**  |	Specify if the price (line amount &/or unit price) received from the Customer includes tax 	  | Yes/No
**Use Customer Price**  |	Select this flag to use the customer's price on the sales order	                              | • **Yes**: If there is a variance between the trade agreement /list price stored in D365 and the Customers price received in the purchase order, the purchase order will be used if within the variance range. <br> • **No**: System price will be used when creating the sales order.
**Maximum negative price variance** |	Where **Use Customer Price** is set to _Yes_: <br> Specify the maximum negative price variance that can occur without warning. 	| It is recommended that these settings are set to at least 0.01 if the '**Price include tax** is ticked' to avoid any rounding differences between the two solutions being flagged.
**Maximum positive price variance** | Where **Use Customer Price** is set to _Yes_: <br> Specify the maximum positive price variance that can occur without warning	| It is recommended that these settings are set to at least 0.01 if the 'include tax flag is ticked' to avoid any rounding differences between the two solutions being flagged.
**Create release order without blanket order** | The action taken when a release order is received without a blanket order	| •	**No** - do not allow the release order <br> •	**Yes** - allow the release order <br> •	**Warning** - allow the release order with a warning message
**Duplicate tolerance** |	If a Customer purchase order (Customer requisition) is received more than once, D365 needs to determine what to do with the duplicate/s | •	**Error** - Duplicate purchase orders not allowed and the staging record will error and not create an additional D365 sales order. <br> •	**Accept** - Duplicate purchase orders are allowed. Duplicate purchase orders will create a new D365 sales order. <br> •	**Accept on flagged orders** - Duplicate purchase orders are only allowed if existing sales order is flagged to allow duplicates. On the original sales order header set on the **EDI** FastTab set **Bypass duplicate check** to _Yes_. Staging records with a duplicate Customer requisition where the sales order's Bypass duplicate check is set to _No_ will error.
**Update confirmed ship date**  |	Similar to **Simulate delivery dates**, updates the **Confirmed ship date** and **Confirmed receipt date** on the sales order header, which are also used in the Customer purchase order acknowledgement | Yes/No
<ins>**Purchase agreement**</ins>   |   |
**Agreement classification**	  | Select the agreement classification used when blanket orders are created	
**Strip field delimiter**       |	Specify the delimiter used to identify a release order	Some of the trading partners use a slightly different PO number on the Blanket order compared with the Release order. An example of a Blanket order PO number is 0005055365-0000, they will then send four releases with the number 0005055365-0010, 0005055365-0020, 0005055365-0030 and 0005055365-0040. In the template the strip field delimiter would be set to “-“, it should then find the applicable sales agreement by using the number before the delimiter. 
<ins>**Supplementary items**</ins>    |   |
**Add mandatory supplementary items** |	Option to automatically add mandatory supplementary items upon sales order creation	| Yes/No
**Add optional free of charge supplementary items** |	Enabled when **Add mandatory supplementary items** is set to _Yes_. Option to automatically add optional free of charge supplementary items	| Yes/No
**Add optional charged supplementary items**  |	Enabled when **Add mandatory supplementary items** is set to _Yes_. Option to automatically add optional charged supplementary items	| Yes/No
<ins>**Retail**</ins>   |   |
**Channel**                     |	Option to set the channel when creating retail sales order.	  | Drop-down options from Name as setup in **Retail and commerce > Channels > Stores > All stores**
**Automatic complete retail order** |	Option to automatically Complete the Sales order and process payment for retail orders where the customer’s **Allow on account** is set to _Yes_. Utilizes Payment method as set below. If payment can’t be completed the sales order is put on hold.	| Yes/No
**Payment method**              |	Option to set the **Retail payment method** for processing Payment. If Payment method is blank, the first Payment method for the Channel where **Default function** is Customer is utilized.	| Drop-down options from **Retail and commerce > Channel setup > Payment methods**. Filtered to **Default function = Customer** (only Customer supported)

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Customer purchase order** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - PO
