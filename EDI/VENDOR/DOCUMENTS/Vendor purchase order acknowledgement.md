---
# required metadata

title: [EDI Vendor]
description: [EDI Vendor Documents - Vendor purchase order acknowledgement]
author: [jdutoit2]
manager: Kym Parker
ms.date: 12/11/2021
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

# Vendor purchase order acknowledgement

Companies may require a vendor to send a purchase order acknowledgement (POA) for an order and can be one of the reasons a purchase order status is 'In external review'. <br> Where the [Vendor purchase order document setting profile](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order.md) **Acknowledgement required** is set to _Yes_, the purchase order status will be set to **In external review** upon confirmation.

The following subsections will describe how to view, process the acknowledgement and send a Vendor purchase order confirmation (if required). <br>
The Acknowledgement can be viewed from the [Purchase order](#purchase-order) and confirmation values will be populated with default values per Trading partner.<br>
The Confirmation can be either [manually](#manually-processing-purchase-order-acknowledgement) processed or [automatically](#automatically-processing-purchase-order-acknowledgement). <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed.
The processed purchase order acknowledgement and sent confirmation record(s) can be viewed for a purchase order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Purchase order page.<br>

## Prerequisites
The following setup is prerequisites for the vendor purchase order acknowledgement

1. Create [POA response code groups](../SETUP/VENDOR%20SETUP/POA%20response%20code%20group.md) to map the vendor's values to EDI POA responses code groups.
1. Create [Template](../../CORE/Setup/DocumentTypes/File%20templates.md) for the document.
1. Create [Setting profile](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md) for the document.
1. Create [Validation profile](../SETUP/VALIDATION%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md) for the document.
1. If the vendor [trading partner](../SETUP/Trading%20partner.md) doesn't exist, create the new trading partner.
1. Assign the applicable POA response code group to the vendor trading partner.
1. Add and enable the vendor purchase order acknowledgement document to the [Vendor trading partner](../SETUP/Trading%20partner.md) and select the applicable:
    - Template
    - Setting profile
    - Validation profile
    - Search mask

## Processing
Inbound files have the following three steps:
1. **Import** - Imported file can be viewed in **EDI > Files > Inbound files**
2. **Import to staging** - Imported file is processed to staging record/s. The staging record/s can be viewed at **EDI > Documents > Vendor documents > Vendor purchase order acknowledgement**
3. **Staging to target** - The staging record/s is processed to target. If the acknowledgement is succefully processed the corresponding D365 purchase can be updated as per the received vendor values

### Create document
![alt text](../../CORE/Image/Create_Document.png "Create document")

### Header checks for Vendor purchase order acknowledgement
Header checks are performed when:
1. Importing Vendor purchase order acknowledgement file
2. Processing from import to staging
3. Processing from staging to target


![alt text](../IMAGE/HeaderChecks_VendorPOA.png "Header checks for Vendor purchase order acknowledgement")

## Step 1 - Import
When a purchase order acknowledgement file is imported, the file name is key to identifying the vendor and therefore the document template. See [Trading partners](../../CORE/Setup/Trading%20partners.md) for further details.  It is based on this document template that the data within the file is identified and a record created in the EDI staging table in the next step.

> Note: The file mask is used to identify the trading partner and therefore template

## Step 2 - Import to staging - Inbound file validation
When the purchase order acknowledgement file is retrieved and imported, there are various validations that are completed before the staging record is created in the EDI staging table.
If the processing of **Import to staging** errors, the Inbound file's **Status** will be set to _Error_ and no staging record created.

**Rule Id**         |	**Details**         
:--                 |:--                  
**Check Template**  |	Identify a template for the Vendor/Document type. This will be used to identify the whereabouts of data within the file

#### Possible issues and fixes
**Import to staging** errors for Vendor purchase order acknowledgements can be viewed in:
- **EDI > Files > Inbound files** filtered to **Status** set to _Error_
- **EDI > Document maintenance**, tab **Vendor documents**, tile **File import errors**

At this step the issues are usually around the file not matching the template.
- Does the file have the correct template assigned (General tab, field **Template**):
  - **No**: Use **Reset template** to assign a different template. If this should apply to future documents for the Trading partner, also update in **Trading partners**.
  - **Yes**: Review **Log** and fix the applicable template in **EDI > Setup > Document types**. Examples issues are date format, new field.

Example error for file not matching template: 'Segment '<xml' not found in EDI template mapping'

## Step 3 - Staging to target
If the processing of **Staging to target** errors, the staging record's **Staging to target status** will be set to _Error_ and the acknowledgement won't be created on the target D365 purchase order.

#### Possible issues and fixes
**Staging to target** errors for Vendor purchase order acknowledgements can be viewed in:
- **EDI > Documents > Vendor documents > Vendor purchase order acknowledgement** filtered to **Staging to target tatus** set to _Error_
- **EDI > Document maintenance**, tab **Vendor documents**, tile **Purchase order acknowledgement errors**
- **EDI > Document maintenance**, tab **Vendor documents**, **Documents** page, tab **POA**

At this step the issues are usually around mapping/business logic issues.
Review the **Log** or **Version log** for the applicable record to find the issue. Example errors and method to fix are discussed in below table.

> Note: When the Version log displays an **Error type** of _Processing error_, the processing has stopped because of a standard D365 error and the **Message** will display the standard D365 error. <br>
> Note: Similar to manually processing a D365 transaction, EDI will stop at the first processing error and only this error is displayed. Fixing the error and reprocessing might result in subsequent standard processing errors which need to be dealt with.

#### Example header errors:
**Error message**       | **Error type**         | **Method to fix**
:---------------------- |:----                   |:----


### Staging line validation - Purchase order acknowledgement

![alt text](../IMAGE/LineChecks_VendorPOA.png "Item checks for Vendor purchase order acknowledgement")

**Rule Id**                 | **Details**                                               | Error    
:---                        |:---                                                       |:---              
**PO line number**          | Find the D365 purchase order line number to which the POA line belongs    | Error at Staging table. <br> No target POA created
**No Valid Item**           | No valid item based on the different options available    | Error at Staging table. <br> No target POA created

#### Possible issues and fixes
**Staging to target** errors for Vendor purchase order acknowledgement can be viewed in:
- **EDI > Documents > Vendor purchase order acknowledgement** filtered to **Staging to target tatus** set to _Error_
- **EDI > Document maintenance**, tab **Vendor documents**, tile **Purchase order acknowledgement errors**
- **EDI > Document maintenance**, tab **Vendor documents**, **Documents** page, tab **POA**

At this step the issues are usually around setup/business logic issues.
Review the **Log** or **Version log** for the applicable record to find the issue. Example errors and method to fix are discussed in below table.

#### Example line errors:
**Error message**                     | **Error type**         | **Method to fix**
:------------------------------------ |:----                   |:----
Item not found: %	                  | Item not found         | **EDI > Documents > Vendor documents > Vendor purchase order acknowledgement** and/or <br> **Product information management > Products > Released products** <br> Dependening on **Item Id source** assigned to Trading partner’s Document's <br> [**Setting profile**](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md), EDI couldn’t find the staging record's Item Id / Barcode. <br> Either fix staging or setup on the Item.

### Validation

[Validation profiles](../SETUP/VALIDATION%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md) can be specified and linked to the template along with a rule error tolerance which is used to determine how D365 will react.  Options are:
-	**Info** - An infolog is displayed with information only, it is not identified as a warning
-	**Warning** - An infolog is displayed with a warning. It is possible to carry on processing
-	**Error** - An infolog is displayed with an error. It is not possible to carry on processing until the error has been corrected. EDI Status = Error

The following table describes each validation option for the Vendor purchase order akcnowledgement document. It also describes if the validation rule is not met, but only has an info or warning error tolerance, how the target D365 purchase order will be updated.

Rule Id	                | Details	                            | Info/Warning tolerance updates
:--                     |:--                                    |:--
<ins>**Purchase order header**</ins>
**Reject**              | Vendor POA response: **Header – not accepted**. Vendor rejects the complete purchase order. <br> This validation can be used to manually manage Vendor rejections by adding this validation with an error tolerance.	| Cancel purchase order
**Version**             | Validates that the vendor is responding to the current purchase order version	          | No update to D365 PO, only used for comparison
**Delivery date**       | Vendor POA response: **Header – change**. <br> The Vendor’s POA delivery date doesn’t match the D365 PO's delivery date	| Update PO header's **Confirmed delivery date**
**Vendor reference**    | Vendor POA’s Vendor reference doesn’t match the PO’s Vendor reference	                  | Update PO header's **Vendor reference**
<ins>**Purchase order line**</ins>
**Short pick**          | Vendor POA response: **Line shipment - partial**. <br> Acknowledgement qty is less than purchase order line qty. If the vendor’s unit differs, unit conversion is used to convert. | Update PO line's deliver remainder qty (use unit conversion if POA different unit).
**Batch Id update**     | Where the batch id received is different to the batch id on the purchase order.	| If batch doesn’t exist for item, the batch is created and assigned to the purchase order line
**Purchase price**      | Vendor POA response: **Line price advise**. <br> The vendor’s POA unit price should be checked using the purchase order unit price. <br> If the prices are slightly different it should check both the tolerance and ‘Use Vendor Price’ flag before giving an error/warning. Example: <br> Item X purchase order unit price 10.25 <br> Item Y purchase order unit price 8.88 <br> Vendor has a min and max tolerance setting of 0.05 <br> Purchase order prices are not including tax <br> Vendor sends their EDI POA including tax <br> The setting use vendor pricing is given <br> Item X EDI file price (before converting) 11.26 (after conversion) 10.24 <br> Item Y EDI file price (before converting) 9.70 (after conversion) 8.82. <br> Template setting against this field is warning. <br> A warning is only given for Item Y because it is outside of the tolerance. 	| Update PO line's purchase price (if within allowed variance): else error
**Delivery date**       | The Vendor’s POA line delivery date doesn’t match the PO delivery date	    | Update PO line confirmed delivery date
**Reject**              | Vendor POA response: **Line item – out of stock** <br> Vendor POA response: **Line item – withdrawn** <br> Vendor rejects the purchase order line	| Cancel purchase order line’s deliver remainder
**Minimum/maximum quantity**    | The POA quantity should be devisable by the multiple specified on the Default/Site order settings table. <br> Use unit conversion if POA unit of measurement differs. Need to set to Error if not allowed to increase deliver remainder over purchase order line over-delivery%	| Update PO line deliver remainder. 


## Purchase order
Users can access **All purchase orders** page by navigating to **Accounts payable > Purchase orders > All purchase orders** and manage the EDI POA's Confirmation details by using the below buttons that have been added to the **EDI** tab on the Action Pane.

Field	                  | Description
:--                       |:--
**Confirmation**          |	Select the **Confirmation** button to review vendor's POA for the D365 PO. The details of this page will be discussed in below.
**Send to EDI**           |	Select the **Send to EDI** button to create Purchase Order Confirmation (POC) staging table record. The button will only be available if a POA has been received from the Vendor.
**Reset flag**            |	Select the **Reset flag** button to reset the **EDI status** to allow for re-sending of the POC to the staging table. Note: The POC record on the staging table should be deleted manually before the sales order flag is reset.

## Processing
The POC can be sent [manually](#manually-processing-purchase-order-confirmation) or [automatically](#automatically-processing-purchase-order-confirmation) to the vendor.
Both of these options will be discussed in the following subsections.

### Manually processing Purchase order confirmation
The **Confirmation** page is accessed by navigating to **Accounts payable > Purchase orders > All purchase orders**, and selecting **Confirmation** on the **EDI** tab on the Action Pane.
A list of outstanding confirmations can also be accessed by navigating to **EDI > Vendor workspaces > EDI purchase order processing** and either selecting the tile or tab called **Pending POA confirm**.

The Confirmation page is split into five tabs:
1. [Header](#header) - Manage the POC header's response for ship and receipt dates. 
3. [Line price](#line-price) - Manage the POC line' price response, example vendor's POA purchase price vs. D365 PO line system price. 
4. [Line quantity](#line-quantity) - Manage the POC line quantity response, example vendor's POA purchase quantity vs. D365 PO line quantity.
5. [Line pack](#line-pack) - Manage the POC line pack response, example Vendor pack vs. System pack
6. [Line inner](#line-inner) - Manage the POC line inner response, example Vendor inner vs. System inner

Vendor mapped values for POA response codes are setup in [POA response code group](../SETUP/VENDOR%20SETUP/POA%20response%20code%20group.md) and assigned to the Vendor trading partner's **POA response code group**.

#### Header
The following tables describe the fields and buttons that are available on the **Header** tab of the Confirmation page. <br>
The **Header** POC response codes are managed on this tab.

##### Fields
Field	                    | Description
:--                         |:--
**Response code**           | Vendor’s purchase order acknowledgement header response
**Vendor delivery date**    | Vendor’s acknowledged delivery date (updates D365 PO header confirmed delivery date)
**System delivery date**    | D365 purchase order requested receipt date
**Confirmed delivery date** | Confirmed delivery date (to be sent on Purchase order confirmation)
**Confirmation auto triggered** | Indicates if the **Confirmed delivery date** is an auto triggered value


##### Buttons
It is possible to update the POC's confirmed values by using the available buttons:

Button                      | Description
:--                         |:--
**Confirmation response**   | Manually select Purchase order confirmation response: <br> •	**Accept acknowledgement** – Update PO Header and Lines with POA's Header and Lines data <br> •	**Accept delivery date** – Updates only delivery date <br> • **Auto set confirmation** – Auto trigger all confirmed values for all tabs


#### Line price
The following tables describe the fields and buttons that are available on the **Line price** tab of the Confirmation page. <br>

##### Fields
Field	                    | Description
:--                         |:--
**Log**                     | This will show a warning if Validation failed with error tolerance set to warning
**Item number**             | Item number from the purchase order
**Barcode**                 | Barcode for the item number from the purchase order
**Product Name**            | Item name for the item number from the purchase order
**Unit**                    | Unit from the purchase line
**Vendor price**            | Price received in the purchase order acknowledgement, converted to purchase unit where POA unit different to PO unit
**System price**            | Unit price from D365 purchase order
**Confirmed price**         | Confirmed price to be sent on the purchase order confirmation (POC) to the vendor. <br> Note: The confirmed price will be set as either the vendor or system values dependant on the parameter set on the [POA setting profile](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md): <br> •	Use vendor price (Y/N), and if Y falls within variance range: <br> •	Maximum negative price variance <br> •	Maximum positive price variance
**Confirmation auto triggered** | Indicates if the **Confirmed price** is an auto triggered value


##### Buttons
It is possible to update the Purchase order and Confirmed values by using the available buttons for a particular or multiple lines:

Button              | Description
:--                 |:--
**Display dimensions**  | Update the dimensions displayed on the Confirmation page
**Use system price**    | No update to Purchase order. Updates the **Confirmed price** field to the system price
**Use vendor price**    | Update the **Purchase order** line’s unit price and **Confirmed price** field to the vendor price


#### Line quantity
The following tables describe the fields and buttons that are available on the **Line quantity** tab of the Confirmation page. <br>

##### Fields
Field	                    | Description
:--                         |:--
**Log**                     | This will show a warning if Validation failed with error tolerance set to warning
**Item number**             | Item number from the purchase order
**Barcode**                 | Barcode for the item number from the purchase order
**Product Name**            | Item name for the item number from the purchase order
**Unit**                    | Unit from the purchase line
**Vendor quantity**         | Quantity received in the purchase order acknowledgement, converted to purchase unit where POA unit different to PO unit
**System quantity**         | Purchase quantity for each purchase line (deliver remainder). 
**Confirmed quantity**      | Confirmed quantity to be sent on the purchase order confirmation (POC) to the vendor. <br> Note: The confirmed quantity will be set as the vendor quantity if min/max validation allows update of deliver remainder, else system quantity
**Confirmation auto triggered** | 	Indicates if the **Confirmed quantity** is an auto triggered value

##### Buttons
It is possible to update the Purchase order and Confirmed values by using the available buttons for a particular or multiple lines:

Button                  | Description
:--                     |:--
**Display dimensions**  | Update the dimensions displayed on the Confirmation page
**Use system quantity** | No update to purchase order. Update the **Confirmed quantity** field to the system’s deliver remainder quantity
**Use vendor quantity** | Update the **Purchase order** line’s deliver remainder quantity and **Confirmed quantity** field to the vendor quantity
**Clear confirmed quantity**    | No update to purchase order. Clears **Confirmed quantity** on the Confirmation page.


#### Line pack
The following tables describe the fields and buttons that are available on the **Line pack** tab of the Confirmation page. <br>

##### Fields
Field	                    | Description
:--                         |:--
**Log**                     | This will show a warning if Validation failed with error tolerance set to warning
**Item number**             | Item number from the purchase order
**Barcode**                 | Barcode for the item number from the purchase order
**Product Name**            | Item name for the item number from the purchase order
**Unit**                    | Unit from the purchase line
**Vendor pack**             | Pack quantity received from the Vendor in the POA
**System pack**             | Valid system pack for the inner or outer as specified on **Package size - inner/outer** on the settings profile for the Vendor purchase order acknowledgement
**Confirmed pack**          | Confirmed pack quantity to be sent on the purchase order confirmation (POC) to the vendor. <br> Note: The automatically acknowledged pack (Vendor or System) is set on **Confirmed pack** on the settings profile for the Vendor purchase order acknowledgement.
**Confirmation auto triggered** | 	Indicates if the **Confirmed pack** is an auto triggered value

##### Buttons
It is possible to update the Purchase order and Confirmed values by using the available buttons for a particular or multiple lines:

Button                      | Description
:--                         |:--
**Display dimensions**      | Update the dimensions displayed on the Confirmation page
**Use vendor pack**         | No updates to purchase order. Update the **Confirmed pack** field to the **Vendor pack**
**Use system pack**         | Update the **Confirmed pac**k field to the **System pack**. Calculated by using unit conversion and rounding setup on the item.
**Clear confirmed pack**    | No update to purchase order. Clears **Confirmed pack** on the Confirmation page.


#### Line inner
The following tables describe the fields and buttons that are available on the **Line inner** tab of the Confirmation page. <br>

##### Fields
Field	                    | Description
:--                         |:--
**Log**                     | This will show a warning if Validation failed with error tolerance set to warning
**Item number**             | Item number from the purchase order
**Barcode**                 | Barcode for the item number from the purchase order
**Product Name**            | Item name for the item number from the purchase order
**Unit**                    | Unit from the purchase line
**Vendor inners**           | Vendor # of inners received in the purchase order acknowledgement
**System inners**           | Valid system # of inners. Note: The number of inners is calculated based on the quantity within an outer and inner. Unit conversion, example 12 ea (inner) in a box (outer).
**Confirmed inners**        | Confirmed # of inners to be sent on the purchase order confirmation (POC) to the vendor. <br> Note: The automatically acknowledged inner (Vendor or System) is set on **Confirmed inner** on the settings profile for the Vendor purchase order acknowledgement.
**Confirmation auto triggered** | 	Indicates if the **Confirmed inner** is an auto triggered value

##### Buttons
It is possible to update the Purchase order and Confirmed values by using the available buttons for a particular or multiple lines:

Button                      | Description
:--                         |:--
**Display dimensions**      | Update the dimensions displayed on the Confirmation page
**Use system inner**	    | No updates to purchase order. Update the **Confirmed inners** field to the **System inner**.
**Use vendor inner**	    | No updates to purchase order. Update the **Confirmed inners** field to the **Vendor inner**.
**Clear confirmed inners**	| No update to purchase order. Clears **Confirmed inners** on the Confirmation page.


### Automatically processing Purchase order confirmation

Vendor EDI module includes the ability to automatically send vendor purchase confirmations by setting **Purchase order confirmation required** to _Yes (PO is auto-confirmed)_ on the [Vendor purchase order acknowledgement](../SETUP/SETTING%20PROFILES/Vendor%20purchase%20order%20acknowledgement.md) document setting and assigning it to the Vendor trading partner on the incoming document **Vendor purchase order acknowledgement** (POA). Once a POA is received from the Vendor, EDI will use document settings and validation to automatically send a confirmation to the vendor. <br>
The confirmations can be viewed in:
- **History** tab on the D365 Purchase order Action Pane, EDI tab. If **Reference** is set to _Confirmation_, the Confirmation matched the Vendor's POA. If set to _Change_, the Confirmation didn't match and sent a change to the vendor.
- **EDI > Documents > Vendor purchase order change**. If **EDI order purpose** is set to mapped value for _Confirmation_, the Confirmation matched the Vendor's POA. If set to mapped value for _Change_, the Confirmation didn't match and sent a change to the vendor.

## View staging table records
To view the Vendor purchase order acknowledgement staging records, go to **EDI > Documents > Vendor documents > Vendor purchase order acknowledgement**. 
Use this page to review staging and process EDI Vendor purchase order acknowledgement documents, update the D366 purchase order and send the purchase order confirmation (where set to automatic).

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI%20parameters.md#number-sequence) on the **EDI parameters**.
**Company account**     | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and updated the D365 purchase order and sent a purchase order confirmation (where set to automatic). <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Vendor account assigned to the staging record.
**Trading partner GLN**         | The Vendor’s global location number is shown here.
**Purchase order**              | Purchase order number for the POA record.
**PO version number**           | The version of the purchase order number being acknowledged.
**Purchase order date**         | The purchase order date from the PO that is being acknowledged is shown here.
**Acknowledged status date**    | The purchase order acknowledgement date from the EDI POA is shown here.
**POA code**                    | POA Header code group as mapped in [POA response code group](../SETUP/VENDOR%20SETUP/POA%20response%20code%20group.md).
**EDI order purpose**           | The EDI order purpose is shown here.
**Created date and time**       | The date and time the selected record was created in the staging table.
**Sent**                        | Indicates if the **Functional acknowledgement outbound** has been sent to the trading partner for the inbound document record.

### Buttons
The following buttons are available on the **Vendor purchase order acknowledgement**'s Action Pane, tab **Purchase order acknowledgement**.

**Button**	                    | **Description**
:---                            |:----
**Process purchase order acknowledgment**   | Process purchase order acknowledgement for the selected record in the staging table.
**Process all purchase order acknowledgment**   | Process purchase order acknowledgement for the staging records that have a **Staging to target status** set to _Not started_. 
**Inbound files**               | View the inbound file record the selected staging record.
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading%20partner.md) page.
**Purchase order**              | If the EDI POA has been completed it is possible to inquire on the linked Purchase order the POA was created for.
**Vendor**                      | Inquire on the Vendor for the selected record.
**Show log**                    | If there are Errors within the document, it is possible to review them at any time using this button. Shows only the current version.
**Version log**                 | View all log versions. When a document’s status is reset and reprocessed, a new log version is created. Can view all log versions.
**Reset Status**                | You can reset the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Vendor purchase order acknowledgement**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all incoming documents staging pages and enables the user to process or view the **Functional acknowledgement outbound** that has been created for the inbound document.

**Button**	                    | **Description**
:---                            |:----
**Send to EDI**                 | If the **Sent** field for the staging record is set to _No_, use this button to create the **Functional acknowledgement outbound** record and also update the **Sent** field to _Yes._
**Reset flag**                  | If the **Sent** field for the staging record has been set to _Yes_, use this button to reset **Sent** to _No_.
**Functional acknowledgement**  | Use this button to view the **Functional acknowledgement outbound** record created for the inbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                    | **D365 PO update**
:---                    |:---                                                   |:---
<ins>**Identification FastTab**</ins>
<ins>**Identification**</ins>		
**EDI number**          | EDI Staging table record id                           | History page on D365 PO
**Company account**     | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here.   | 
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and updated the D365 purchase order and sent a purchase order confirmation (where set to automatic). <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>	
**Purchase order**          | Purchase order number for the POA record	
**Purchase order date**     | The purchase order date from the PO that is being acknowledged is shown here	
**Acknowledged status date**    | The purchase order acknowledgement date from the EDI POA is shown here	| Acknowledgement status date
**POA code**                | POA Header response code	                                                    | Acknowledgement status
**EDI order purpose**       | The EDI order purpose is shown here	
<ins>**Status**</ins>		
**Group control number**    | Group control number for outbound document. To be used to match inbound functional acknowledgement, where applicable.	
**Sent**                    | Indicates if functional acknowledgement outbound has been sent to the trading partner for the inbound document.	
<ins>**General FastTab**</ins>
<ins>**Purchase order acknowledgement**</ins>
**POA code**                | POA Header response code	                                                    | Acknowledgement status
<ins>**Details**</ins>
**Vendor reference**        | Vendor’s order reference	                                                    | Vendor reference
**Vendor account**          | Vendor account for the POA record	
**Vendor name**             | Vendor name	
**Trading partner GLN**     | The vendor’s global location number is shown here	
**Company GLN**             | The company’s global location number is shown here
**Buyer group**             | The Purchase Order’s Buyer group is shown here	
**Buyer name**              | Buyer name	
**Buyer email**             | Buyer email	
**Buyer phone**             | Buyer phone	
**Company phone**           | Company phone	
**Company name**            | Company name	
**Tax registration number** | Company tax registration number	
<ins>**Vendor invoicing**</ins>	
**Vendor name**             | Vendor name	
**Vendor primary street number**    | Vendor primary address - street number	
**Vendor primary street**   | Vendor primary address - street	
**Vendor primary city**     | Vendor primary address - city	
**Vendor primary county**   | Vendor primary address - county	
**Vendor primary state**    | Vendor primary address - state	
**Vendor primary ZIP/postal code**  | Vendor primary address - ZIP/postal code	
**Vendor primary country/region**   | Vendor primary address – country/region	
<ins>**Customer invoicing**</ins>		
**Bill to**                 | Our account number as loaded on Vendor’s Invoice account	
**Name**                    | Bill to - Name	
**Name or description**     | Bill to - Invoice address name	
**Street number**           | Bill to - Street number	
**Street**                  | Bill to - Street	
**City**                    | Bill to - City	
**County**                  | Bill to - County	
**State**                   | Bill to - State	
**ZIP/postal code**         | Bill to - ZIP/postal code	
**Country/region**          | Bill to - Country/region	
<ins>**Version**</ins>
**PO version number**       | The version of the D365 purchase order number	
**Created date and time**   | The date and time the selected record was created in the staging table.
<ins>**Delivery**</ins>		
**Delivery name**           | Ship to - Name	
**Ship to**                 | Our account number as loaded on Vendor’s Order account	
**Store code**              | Ship to - Store code	
**Street number**           | Ship to - Street number	
**Street**                  | Ship to - Street	
**City**                    | Ship to - City	
**County**                  | Ship to - County	
**State**                   | Ship to - State	
**ZIP/postal code**         | Ship to - ZIP/postal code	
**Country/region**          | Ship to - Country/region	
**Delivery date**           | Required delivery date	
**Acknowledged delivery date**  | Acknowledged delivery date                            | Confirmed delivery date
**Site**                    | Storage dimension - Site	
**Warehouse**               | Storage dimension - Warehouse	
**Delivery terms**          | Delivery terms	
**Delivery mode**           | Delivery mode	
**Form note**               | Header note to be sent with purchase order	
**Requester**               | Requester	
**Attention information**   | Attention information	
<ins>**Transportation**</ins>		
**Shipping carrier**        | Shipping carrier	
**Carrier qualifier**       | Code designating the system/method of code structure used for shipping carrier	
**EDI carrier mode**        | Code specifying the method or type of transportation for the shipment. Mapped value setup in [Carrier mode](../SETUP/VENDOR%20SETUP/Carrier%20mode.md).
<ins>**Miscellaneous**</ins>		
**Misc. indicator**         | Code which indicates an allowance or charge for the service specified. Mapped value setup in [Misc charge/allowance indicator](../SETUP/VENDOR%20SETUP/Misc%20charge%20allowance%20indicator.md).
EDI charges code	Code identifying the service, promotion, allowance, or charge. Mapped value setup in [Charges code](../SETUP/VENDOR%20SETUP/Charges%20code.md).
<ins>**Totals**</ins>
**Subtotal amount**         | Subtotal of all purchase order lines	
**Line discount**           | Discount for all purchase order lines	
**Misc amount**             | Purchase order header misc. charge/allowance amount	
**Tax amount**              | Tax amount	
**Round-off**               | Round-off	
**Total amount**            | Total amount	
<ins>**Payment**</ins>                 
**Currency**                | Currency	
**Terms code**              | Payment terms. Mapped value setup in [Payment terms type group](../SETUP/VENDOR%20SETUP/Payment%20terms%20type%20group.md).
**Terms net days**          | Payment terms net due days
**Cash discount**           | Settlement discount percentage	
**Days**                    | Settlement days	
**Discount amount**         | Settlement discount amount if paid within settlement days	


### Line fields
The following EDI Line fields are available on the lines page. <br> 
If update to purchase order line is allowed, column **D365 PO line update** indicates what field could be updated by the POA.

**Field**                   | **Description**                                                           | **D365 PO line update**
:---                        |:---                                                                       |:---
**Line number**             | The line within the EDI table/file. Refers to original purchase order EDI line number and used in matching	
**Item number**             | The item identifier as sent by the trading partner	
**POA code item**           | Purchase order acknowledgement code for the item, for example line price - advise.
**POA code shipment**       | Purchase order acknowledgement code for shipment of the item, for example partial/full shipment.
**Description**             | Purchase order line text	
**Purchase quantity**       | Acknowledged purchase quantity	                                        | Deliver remainder quantity. Will be converted if POA unit doesn't match PO unit. <br> EDI acknowledgement tab > Acknowledged quantity
**Unit**                    | Unit of measure of purchase quantity                                      | Used in unit conversion (if applicable) for quantity and unit price
**Price unit**              | The quantity of the product that is covered by the purchase price. Usually 1. | Used in unit price calculation
**Price multiplier**        | Value to be used to obtain a new value. NetUnitPrice/UnitPrice. Example price before discount $100 and after discount $90 has a price multiplier of 0.9	
**Includes GST**            | Unit prices and unit discounts includes GST	
**Unit price**              | Unit price for the item	                                                | POA unit price/POA price unit = D365 PO line unit price. Will be converted if POA unit doesn't match PO unit. <br> EDI acknowledgement tab > Acknowledged price 
**Unit discount**           | The amount of the line discount per price unit	
**Unit discount percentage**    | Discount percentage	
**Net unit price**          | Unit price net of all discounts	
**Charges on purchases**    | The purchase charge that is calculated as a charge that is independent of the quantity on the purchase order line	
**Misc charges**	        | Miscellaneous charge/allowance allocated to purchase order line	
**Line amount excluding tax**   | Net line amount excluding tax	
**Line amount tax**         | Line amount tax	
**Line amount including tax**   | Net line amount including tax	
**Currency**                | Currency	
**Inners quantity**         | Unit conversion quantity of inners to outers. <br> Example qty 12 ea (inner) per box (outer)	    | EDI acknowledgement tab > Acknowledged inner
**Inners unit**             | Inners unit of measure as setup on item’s [pack size](../../CORE/Setup/Item%20pack%20sizes.md)    | 
**Pack quantity**           | Package quantity	                                                                                | EDI acknowledgement tab > Acknowledged pack
**Pack unit**	            | Package unit of measure	
**Configuration**           | Inventory dimension - Configuration	
**Color**                   | Inventory dimension - Colour	
**Size**                    | Inventory dimension - Size	
**Style**                   | Inventory dimension - Style	
**Site**                    | Storage dimension - Site	
**Warehouse**               | Storage dimension - Warehouse	
**Requested receipt date**  | The requested receipt date	
**Accepted delivery date**  | Vendors accepted delivery date	                                                                | EDI acknowledgement tab > Acknowledged date
**Requester**               | Requester	
**Attention information**   | Attention information	
**Delivery name**           | Address for Delivery – Delivery name	
**Name or description**     | Ship to – Name or description	
**Street number**           | Ship to - Street number	
**Street**                  | Ship to - Street	
**City**                    | Ship to - City	
**County**                  | Ship to - County	
**State**                   | Ship to - State	
**ZIP/postal code**         | Ship to - ZIP/postal code	
**Country/region**          | Ship to - Country/region	
**Store code**              | Ship to - Store code	
**Batch number**            | Batch number for the item	                                                                        | Batch
**Manufacturing date**      | Vendor’s manufacturing date for the batch	                                                        | If Batch doesn't exist, used to create batch
**Expiration date**         | Vendor’s expiration date for the batch	                                                        | If Batch doesn't exist, used to create batch
        
