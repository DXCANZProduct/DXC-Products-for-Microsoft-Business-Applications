---
# required metadata

title: [EDI Customer]
description: [EDI Customer Setup - Document type Setting profiles - Customer purchase order change]
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

# Customer document type setting profiles - Purchase order change

Users can access the form by navigating to **EDI > Setup > Document types**. <br>
> Note: Customer purchase order change doesn’t apply to Sales agreement order types.

- To create a new record, select document type **Customer purchase order change**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

\** Applies only to **Automatic** processing method. When Change is manually approved these document settings and validations are ignored and applicable D365 sales order fields updated. 

**Field**             |	**Description**	                          | **Options/Example**
:-------              |:-------                                   |:----------
<ins>**Document**</ins> |   |
**Processing method** |	Specify method of processing purchase order changes	| •	**Automatic** – Document settings and validation will be used to automatically process the change and update the D365 sales order, if within the allowed parameters. <br> •	**Manual** – Document settings and validation doesn’t apply and the change is manually approved via the **Sales order processing workspace > Pending PO changes** or **Sales order EDI header > Changes**
<ins>Purchase order</ins> |   |
**Item ID Source**  |	Determine the method of item identification used by this customer when ordering products. Where the External item number, GTIN or Barcode is unique per Variant, EDI will create the sales order against the correct variant, i.e. the customer doesn’t have to supply variant details in inbound document.	| •	**Our Item number** - this is the item ID on the items form <br> •	**External item number** - this is the item Id on the customer external item form <br> •	**GTIN** - this is the GTIN assigned to an item <br> •	**Barcode** - This is the Barcode assigned to an item.
**Blank unit**    | Where staging line's **Unit** is blank, this document setting provides options to use for these lines when creating the D365 sales order line's **Unit** |  • **Sales unit** - Populate with item's sales unit <br> • **Sales trade agreement unit** - Populate with applicable sales trade agreement unit <br> • **Inventory unit** - Populate with item's inventory unit <br> • **Error** - Errors the complete staging record
\** **Document status** |	Allow sales orders up to and including this status to be changed	| •	None <br> •	Confirmation <br> •	Picking list / Released to warehouse <br> •	Delivery note <br> •	Tax invoice
\** **Allow header update** |	If allowed, applicable D365 Sales order fields are updated	  | Yes/No
**Don’t send POA for changes**  |	If the customer has Customer purchase order acknowledgement (POA) setup, should it be sent for the PO Change. Not all customers want/can process a POA for a PO Change.	  | Yes/No
<ins>**Dates**</ins>    |   |
**Update confirmed ship date**  |	Similar to **Simulate delivery dates**, updates the **Confirmed ship date** and **Confirmed receipt date** on the sales order header, which are also used in the Customer purchase order acknowledgement | Yes/No
<ins>**Prices**</ins>   |   |
**Price includes tax**  |	Specify if the price (line amount &/or unit price) received from the Customer includes tax 	  | Yes/No
**Use Customer Price**  |	Select this flag to use the customer's price on the sales order	                              | • **Yes**: If there is a variance between the trade agreement /list price stored in D365 and the Customers price received in the purchase order, the purchase order will be used if within the variance range. <br> • **No**: System price will be used when creating the new or updating an existing sales order line.
**Maximum negative price variance** |	Where **Use Customer Price** is set to _Yes_: <br> Specify the maximum negative price variance that can occur without warning. 	| It is recommended that these settings are set to at least 0.01 if the '**Price include tax** is ticked' to avoid any rounding differences between the two solutions being flagged.
**Maximum positive price variance** | Where **Use Customer Price** is set to _Yes_: <br> Specify the maximum positive price variance that can occur without warning	| It is recommended that these settings are set to at least 0.01 if the 'include tax flag is ticked' to avoid any rounding differences between the two solutions being flagged.
<ins>**Quantities**</ins>   |   |
\** **Allow quantity decrease on increase type**  |	If the line change type is quantity increase and the imported quantity is a decrease, make the change regardless	| Yes/No
** **Allow quantity increase on decrease type**   |	If the line change type is quantity decrease and the imported quantity is an increase, make the change regardless	| Yes/No

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type **Customer purchase order change** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - Customer purchase order change
