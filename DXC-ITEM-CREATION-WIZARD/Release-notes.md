---
# required metadata

title: [DXC Item Creation Wizard]
description: [DXC Item Creation Wizard - Release notes]
author: [lcoll]
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
ms.reviewer: [lcoll]
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

### Release 10.0.22.20220531

DXC Smart Business Form Email Manager 10.0.18 runs on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.22	  | [What’s new or changed in Dynamics 365 application version 10.0.22](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-22)
Microsoft Dynamics 365 application	| 10.0.23	  | [What’s new or changed in Dynamics 365 application version 10.0.23](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-23)
Microsoft Dynamics 365 application	| 10.0.24	  | [What’s new or changed in Dynamics 365 application version 10.0.24](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-24)
Microsoft Dynamics 365 application	| 10.0.25	  | [What’s new or changed in Dynamics 365 application version 10.0.25](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-25)
Microsoft Dynamics 365 application	| 10.0.26	  | [What’s new or changed in Dynamics 365 application version 10.0.26](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-26)
Microsoft Dynamics 365 application	| 10.0.27	  | [What’s new or changed in Dynamics 365 application version 10.0.27](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-27)

#### Build 10.0.22.202205311

Number	  | Functionality	  | Reason
:--       |:--              |:--
8335	|	Status Data Entities	| Data entities for the following tables have been included <BR> * DXCICStatusTable <BR> * DXCICStatusTransitionRule <BR> * DXCICStatusAutoRuleTable
9192	|	Item creation import sessions	| The import sessions form will no longer display by default records with a status of Completed, Rejected or Cancelled. Visibility of these records can be toggled using the Show closed control. <BR> <BR> When the import session form is opened the latest record will be selected.
9746	|	Item Creation list page| The item creation list page form will no longer display by default records with a status of Completed, Rejected or Cancelled. Visibility of these records can be toggled using the Show closed control.
9748	|	Item status, released product variants	| The current item status for a product variant is now displayed within the release product variant form.
9786	|	Create DXCICStatusItemTable record on variant creation	| When a product variant is created from a creation template, the variant will inherit the items status defined on the template.
9926	|	Item status - block inventory transactions	| A new transaction type is available for blocking by using item statuses. The new option Inventory will enable the prevention of product or variants with the item status from being included in; <BR> * Inventory movement <BR> * Inventory adjustment <BR> * Inventory transfer <BR> * Inventory count

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
9510    | Import workflow, Auto reject creates loop  | If the workflow element Approve item creation import is set to reject the import session, the rejected import session would be resubmitted. The import session status is now correctly updated to rejected. 

# Previous version(s)

### Release 10.0.18.20211103

#### Build 10.0.18.20211103

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
9569    | Field does not exist in table  | Where an attribute field is included within the same file mask as values from the product translation table the field was included in the updated validation for 9504.

### Release 10.0.18.20211012

#### Build 10.0.18.202110123

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
9504	    | Update file is blanking out fields 	| Tables without a reference to the ItemId or an inventory dimension field were found to clear the contents of a field if the field was included in an imported file without a defined value. <BR> <BR> Where a field in included in the template and no value is provided, the designer now displays the pre-existing value for the matching record.
	
### Release 10.0.12.20210722

#### Build 10.0.12.202107221
  
Number	  | Functionality	  | Reason
:--       |:--              |:--
6232	|	Validation on failed import session	| Imported files that have failed validation can now be revalidated from within the import session designer using the same validation applied on import.
9192	|	Delete a cancelled import session	| The deletion of import sessions that have been submitted to workflow and recalled can now also be deleted from the import session table. Doing so will also remove the item creation records associated with the import session.

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
9174	  | Financial dimension defaults	| Default values set on item creation templates for financial dimensions are now being applied to the item. Where an alternative value is provided in the imported data, this will be used instead.
9175	  | Approved vendor writing to target table prior to workflow completion	| A new table (DXCICCreationPdsApprovedVendorListTable) has been created to stage imported values during the workflow process, as the table structure is not compatible with the use of a TempDB. <BR> <BR> Templates that reference the previous Approved Vendor table will need to be updated to reference the value.
9202	  | Import validation against multiple companies 	| Where import session lines are created for each company on the template header, a distinct validation will be for each record based on values appropriate for each company.
9215	  | Import validation not completed on certain fields	| Fields which were not validating on import are now validated and a log provided to identify the incorrect value that has been imported.

### Release 10.0.12.20210412

#### Build 10.0.12.202104121

<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
6264	  | Financial dimension | Imported financial dimensions where not validated against existing values. User was not provided with a validation error or log when a value was unable to be imported. <BR> <BR> Validation error and log are now present when a financial dimension cannot be written to the designer.

### Release 10.0.9.20210406

#### Build 10.0.9.202104061

Number	  | Functionality	  | Reason
:--       |:--              |:--
8412	|	Import validation	| When importing a file, additional validation is now run on imported string and enum fields to confirm that the value being imported exists. <BR> <BR> Where validation tables are specific to a company/DataAreaId the validation is completed on records that match the company on the item creation template header, as defined by the user. <BR> <BR> Note: Additional validation is not supported for integer and date field types. <BR> <BR> Note: Additional validation is not currently supported for attribute values.
  
<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
8402	  | Clear financial dimensions | The Clear field value defined on the item creation template header allows for a field to updated to a blank value when specified character/s are included in an import file. <BR> <BR> When used on a financial dimension field the existing financial dimension value was not being cleared. This is now supported.
8394	  | Update alternative item number | When importing a value into the field Alternative item number the value in the mapped field of the import file was not used.

### Release 10.0.9.20210205

#### Build 10.0.9.202102051

Number	  | Functionality	  | Reason
:--       |:--              |:--
7865	|	Feature Management	| Move licensing to License manager and Feature Management.
  
### Release 10.0.9.20201201

#### Build 10.0.9.202012011

Number	  | Functionality	  | Reason
:--       |:--              |:--
8344	|	MCRInventTable	| Change to extended data type (DXCICItemId) on MCRInventDim to improve query.

### Release 10.0.9.20201127

#### Build 10.0.9.202011271

Number	  | Functionality	  | Reason
:--       |:--              |:--
8221	|	Update template, status	| Leaving the status on an update template blank will no longer trigger an update of the item status. The existing item status for the updated product will now be retained.
  
<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
8254	  | Generate variants automatically  | When marking the field Generate Variants Automatically in a creation template a validation is run to confirm the subtype is Product Master. This validation failed, preventing the record from being submitted to workflow.
8274	  | Attribute values not recorded for all supplemental hierarchies | Attribute groups assigned to nodes in a category hierarchy of type Supplemental retail hierarchy allow for entry of attribute values using the Item Creation designer. <BR> <BR> This only works for the first hierarcy of this type, subsequent supplemental hierarchies do not return the attributes, preventing the value from being recorded on the product.
8334	  | Update alternative item number | A template with an assigned team can be seen by all users, so long as the template is active.

### Release 10.0.9.20201027

#### Build 10.0.9.202010271

Number	  | Functionality	  | Reason
:--       |:--              |:--
8070	|	New table	| New table Product relationships (EcoResProductRelationTable) available for use in templates.
  
### Release 10.0.9.20201002

#### Build 10.0.9.202010021

Number	  | Functionality	  | Reason
:--       |:--              |:--
8083	|	Data entity addition	| Entity: Item status link <BR>   Staging table: DXCICStatusItemStaging <BR>  Target entity: DXCICStatusItemEntity

### Release 10.0.9.20200914

#### Build 10.0.9.202009141

Number	  | Functionality	  | Reason
:--       |:--              |:--
8028	|	Security enhancements	| Creation of two distinct security roles <BR>   Item creation clerk – Item creation user, able to intiate or update an item creation record. View and manage imported files <BR>   Item creation manager – module admin, can update parameters relating to Item creation and create/edit Item creation templates. <BR>  <BR> Security privilege added where not available <BR> 	Parameters form <BR>  Export template (Template steps) <BR> 	Creation import files form <BR> 	Create workflow
4808	|	Data entities	| New data entity added for the parameters table.
8033	|	New tables	| New tables are available for use in templates; <BR> 	Approved vendor (PdsApprovedVendorList) <BR> 	Direct delivery (MCRInventTable)
7690	|	Creation import session	| Template version used for import can now be view without having to navigate to line view <BR> A filtered view of creation import sessions showing only records assigned to the user has been added.
7942	|	Formatting changes	| Replaced references to PLM with Item creation <BR> Indented submenus within the setup section
  
<ins>Bug fixes</ins>

Number	  | Name	          | Description
:--       |:--              |:--
7909	  | Default order setting – Site  | The field Site was unavailable for selection in the item creation template for the template table Inventory dimensions (Site specific purchase order settings - Default) but could be applied manually. Field was added to list for selection.
7931	  | Changes to assigned team not reflected | When changing the assigned team on an Item creation template it does not update the visibility of the template for either the new or removed team members.
7903	  | Creation import files – Active | Only activated template versions should be visible within the list of templates on the Creation import files form
7449	  | Reservation hierarchy | Field was unavailable for edit within the designer and could only be populated as a default
  
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
