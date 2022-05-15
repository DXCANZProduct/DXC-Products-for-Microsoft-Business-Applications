---
# required metadata

title: [EDI]
description: [EDI - Release notes]
author: [jdutoit2]
manager: Kym Parker
ms.date: 16/05/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Release notes]
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

# 	Release notes
This document describes the features that are either new or changed in the release version mentioned.

# Current version

### Release 10.0.22.202204101

DXC EDI 10.0.22 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.22	  | [What’s new or changed in Dynamics 365 application version 10.0.22](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-22)
Microsoft Dynamics 365 application	| 10.0.23	  | [What’s new or changed in Dynamics 365 application version 10.0.23](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-23)
Microsoft Dynamics 365 application	| 10.0.24	  | [What’s new or changed in Dynamics 365 application version 10.0.24](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-24)
Microsoft Dynamics 365 application	| 10.0.25	  | [What’s new or changed in Dynamics 365 application version 10.0.25](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-25)
Microsoft Dynamics 365 application	| 10.0.26	  | [What’s new or changed in Dynamics 365 application version 10.0.26](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-26)

#### Build 10.0.22.2022041012

<ins>Deprecated</ins>

Functionality		| Reason
:--			|:--
EDI > Setup > Batch control <br> EDI > Batch control (workspace)	| Replaced with **EDI > Setup > EDI batch control groups**, which allows companies to setup a batch for one or multiple legal entities. <br> **Note**: Running **Refresh module** will transfer the “tick’s” (green in screenshot) from deprecated Batch control to new Batch control groups. <br> Next step is to delete the company specific EDI Batch jobs (via System administration > Inquiries > Batch jobs) and then create new batch jobs for each process via red in below screenshot. These will automatically be created on Company account dat, which enables the batch to run for multiple company accounts. <br> ![EDI batch control groups](RELEASE-NOTES-IMAGES/202204101_1.png "EDI batch control groups")

<ins>New features</ins>

Number	  | Functionality	  | Reason
:--       |:--              |:--
9314	  | Batch control groups	| Allows companies to setup a batch group for one or multiple legal entities. <br> **Note**: See note in Deprecated section.
9733	  | Fixed text file template	| Alignment and Padding character have been added to Fixed Text Document Type Templates. <br> **Note**: new index has been added to Field position for Text fixed templates, which doesn’t allow multiple fields to start in same position. Before upgrading, update template/s if **Field position** isn’t unique.
9732	 | Text file template	| Text Document type’s Setup: Decimal separator ‘None’ option.
9653	 | XML and JSON document template mapping	| **Static values** and **Custom format** on inbound XML and JSON document mapping. Examples: <br> •	Where a field is in the inbound file, but should be replaced with another value: Use Custom format and substring formula. Example: <br> ![Custom format](RELEASE-NOTES-IMAGES/202204101_2.png "Custom format") <br>  •	Where a field isn’t in the inbound file, but a static value should be populated in staging: Use Static value. Example: <br> ![Static value](RELEASE-NOTES-IMAGES/202204101_3.png "Static value")
10073	| UOM mapping	| UOM mapping enhanced to include: <br> •	Company (Blank Company is allowed where Item code is set to All) <br> •	Item code (Table, Group, All) <br> •	Item relation <br> •	Inventory dimensions <br> **Note**: All existing UOM mappings will have Company set to Blank and Item code set to All. Should be no issues with backwards compatibility.
9660	| EDI batches	| Enable automated retries - if D365 experience a brief loss of connection to MS SQL Server. isRetryable set to True
9792	| Process to outbound	| Added **Records to include** filter on **Process to outbound**
9742	| Sales invoice	 | Additional sales invoice fields: <br> •	Header: <br> o	Invoice contact name <br> o	Invoice phone number <br> •	Lines: <br> o	Customer account <br> o	Customer contact name <br> o	Customer phone number <br> o	Delivery address details from sales order line <Br> o	Backorder quantity <br> o	Sales unit price (unit price before discounts excluding tax) <br> o	Sales unit price include tax (unit price before discounts including tax) <br> o	Unit discount <br> o	Unit discount percent
9612	| EDI Document maintenance workspace	| New Tile‘**File export errors** added to **EDI Document maintenance workspace** (per module). <br> Displays Outbound files with **Status** is set to _Error_ per module
9714	| Outbound filename	| Enhancements to form layout. <br> And additional currentSessionDate placeholders.
9692	| Purchase order confirmations	| Procurement and sourcing > Purchase orders > Purchase order confirmation > Purchase order confirmations <br> Added **Sent to EDI** to list page, and buttons **Send to EDI** and **Reset flag**. <br> ![Purchase order confirmations](RELEASE-NOTES-IMAGES/202204101_4.png "Purchase order confirmations")
10084	| Version log’s Message	| Changed **Message** to unlimited type string <br> ![Message](RELEASE-NOTES-IMAGES/202204101_5.png "Message")
10026	| Stock transfer receipt – Purchase order	| New button **Product receipt** added to staging form. Enabled if the document setting **Auto post receipt** is set to _Yes_.
9496	| Staging line height	| New EDI extended data types to improve staging forms lines’ height.
10147	| Consignment notes	| Removed error message **No document setting specified** where a customer doesn’t have a setting profile assigned to Customer advanced shipping notice document. **Add** button will be disabled if no setting profile assigned. **Add** button is only enabled where document setting **ASN strategy** is set to _Consolidated packing slip_ and **Sent to EDI** is _No_.
9827 <br> 9829	| **Sent to EDI** on EDI processing workspaces	| <ins>EDI Sales order processing workspace</ins> <br> New tile and tab for **Open invoice**. Filtered to sales invoices for customer trading partners with ‘Sales invoice’ document enabled. Below new buttons and filters also added to **Open consignment notes** <br> <ins>EDI Purchase order processing workspace</ins> <br> New tile and tab for **Open confirmation**. Filtered to purchase confirmations for vendor trading partners with **Vendor purchase order** document enabled. <br> <ins>All above processing workspaces</ins> <br> Additional functionality on Processing for all the Open tabs: <br> •	Filtered to Sent to EDI is No <br> •	Filtered to Excluded set to No <br> •	Buttons: <br> o	**Send to EDI** - can create staging record from workspace and update **Sent to EDI** to _Ye_s <br> o	**Reset flag** – Enabled when **Sent to EDI** is _Yes_. Reset ‘Sent to EDI’ to No which enables ‘Send to EDI’ button <br> o	**Exclude / Include** (New functionality) – Ability to exclude the record from the “outstanding” list. Use filter Excluded to view records that has been excluded and can use button Include to include record again. Doesn’t create the staging record, but assist users in managing their “outstanding” list. <br> ![EDI Sales order processing](RELEASE-NOTES-IMAGES/202204101_6.png "EDI Sales order processing")

<ins>Bug fixes</ins>

Number	| Name		 | Description
:--	|:--		 |:--
9990	| 10.0.26 PEAP	 | Compile error fixes for 10.0.26 PEAP
10023	| Customer advanced shipping notice	| SSCC blank for 'ASN line configuration' PickingList
9707	| 3PL Document maintenance	| Tile vs. Document list (all legal entities)
9644	| Batch jobs	 | ‘Process to outbound’ ran for all legal entities
9795	| Purchase invoice	| Using OrderedQty instead of InvoiceQuantity
9694	| Saved views	 | Saved views not applied to all EDI forms	
10080	| Staging forms	 | Staging forms wasn’t opening correct record after inserting a column on lines
9820	| XSLT format	 | ‘Format outbound document’ not applied to XSLT
5402	| Display method | Ability to add display method field (example numberOf Lines) to text template mapping and ability to import via entity
8341	| 3PL UI fixes	 | Various small user interface fixes on staging forms (removing duplicates etc.) Also updated entity ‘EDI Shipment Receipt settings – Transfer order’ to ‘EDI Settings Shipment Receipt - Transfer order’ for consistency
4432	| Customer UI fixes | Various small user interface fixes to staging forms, POA document setting profile and adding Store code to Trading partner’s Address

#### Build 10.0.22.2022041013
Includes Inbound Transportation management (ITM) & ITM version Freight forwarder of 2022041012

#### Build 10.0.22.2022041014 
	
Number	| Name	 | Description
10236	| Text document type template	| **Field position** index reverted to not unique 

#### Build 10.0.22.2022041015
Includes Inbound Transportation management (ITM) & ITM version Freight forwarder of 2022041014

# Previous version(s)




# Installation process
To align with MS best practice and to protect our IP the following changes have been made to the release process.
- The license models DXCLicense and Sable37License will only be released as binaries as part of a deployable package. 
- We will no longer be providing test models for the products, neither as binary or source code. 
- We will only publish the release as a deployable package. 
- Model source code can be provided on request if needed for extensions or debugging.
	- If you have been given the source code to our model for extension or debugging purpose, never make modifications directly to our models! 
	- If you need an extension point, please send an email to ECLANZProductSupport@dxc.com and request it to be implemented. 


Depending on the installation history follow one of these guides to install the new release. 
## Installation without existing installed product
1. Apply the deployable package to your environment. 
2. If you have requested any model for extension or debugging purposes. Install the model source code. 
a.	Note, once the model source code is compiled it will overwrite the binaries installed when the deployable package was applied. 


## Installation with existing installed product
If you’re installing the new release in an installation that already has a previous version of the product installed and you’re not using it for debugging or extension. We recommend that you;  
1. Remove the release product model source code from your source control, if source control is used. 
2. Apply the deployable package, installing the latest version of the product models as binaries.  
3. Check in the binaries for the models to source control, if source control is used. 

If you’re using our model source code for extension or debugging and would like to continue using it, please do the following to apply the new release with the source code. 

1. Remove product license model from your source control that is applicable to the release. You’ll find the license model in the deployable package. It will either be called DXCLicense and Sable37License. 
2. Apply the deployable package to your environment to install the latest binaries. Check in the binaries for the license model that was removed in step 1 to source control. Note, this step will also install the binaries for all the models in the new release. 
3. Install the product release model source code and check into source control. 

If you don’t follow these instructions and continue building your installation deployable package using the license model source code, the installation will continue using the same license model as before applying the release. 

## Feature management
Enable all licensed modules via Feature management. Features are called:
- EDI (enable first)
- EDI – 3PL Documents
- EDI – Customer documents
- EDI – Vendor documents
- EDI – Freight forwarder documents (for ITM)
- EDI – Freight forwarder landed cost documents (for Landed cost)
- EDI – Standard formats

If you above features are not visible, press **Check for updates** to refresh the feature management list.

## Refresh EDI module
**EDI > Setup > EDI parameters** <br>
After each deployment, click **Refresh module**. <br>
This will flush EDI caches and refresh EDI module metadata such as EDI document types, XML structures, field names etc.

