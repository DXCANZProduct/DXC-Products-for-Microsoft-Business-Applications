---
# required metadata

title: [EDI Customer]
description: [EDI Customer Documents - Sales invoice]
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

# Sales invoice
EDI customers may require a Sales invoice for a sales order.

> Note: Sales invoices can also be sent for a sales order not created via EDI.

The following subsections will describe how to view, process and send Sales invoices to applicable Customer Trading partners. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed. <br>
The created sales invoice record(s) can be viewed for a sales order, by selecting the **History** button on the **EDI** tab on the Action Pane of the Sales order page.<br>

## Prerequisites
The following setup is prerequisites for the sales invoice

1. Create [Template](../../CORE/Setup/DocumentTypes/File%20templates.md) for the document.
2. Create [Setting profile](../SETUP/SETTING%20PROFILES/Sales%20invoice.md) for the document.
3. Create [Outbound filenames](../../CORE/Setup/DocumentTypes/Outbound%20filenames.md) for the document.
4. If the customer [trading partner](../SETUP/Trading%20partner.md) doesn't exist, create the new trading partner.
5. Add and enable the sales invoice to the [Customer trading partner](../SETUP/Trading%20partner.md) and select the applicable:
    - Template
    - Setting profile
    - File name setup

## Processing
### Post sales invoice
When the document **Sales invoice** is enabled for the EDI customer, the post sales invoice page field **Send to EDI** will be set to _Yes._
The Sales invoice [Document setting profile](../SETUP/SETTING%20PROFILES/Sales%20invoice.md) provides the option to exclude credits notes from creating a sales invoice staging record by setting **Don't send credit note** to _Yes._

## View staging table records
To view the Sales invoice staging records, go to **EDI > Documents > Customer documents > Sales invoice**. 
Use this page to review staging and process EDI Sales invoice documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI%20parameters.md#number-sequence) on the **EDI parameters**.
**Company**             | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue. • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Customer account assigned to the staging record.
**Trading partner GLN**         | The Customer’s global location number is shown here.
**Tax invoice**                 | Tax invoice number
**Customer requisition**        | Sales order's Customer requisition
**Customer reference**          | Sales order's Customer reference
**Created Date and Time**       | The date and time the selected record was created in the staging table.
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.

### Buttons
The following buttons are available on the **Customer advanced shipping notice** Action Pane, tab **Advanced shipping notice**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_.
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_.
**Outbound files**              | View the outbound file record created by the selected staging record.
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading%20partner.md) page.
**Invoice journal**             | View the tax invoice for the staging record.
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Sales invoice**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.

### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                      | **Source D365 field**
:---                    |:---                                                     |:---
<ins>**Identification FastTab**</ins>		
<ins>**Identification**</ins>		
**EDI number**          | EDI Staging table record id                             | EDI parameters > Number sequences > EDI number
**Company**             | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here      | 
**Template Id**                 | The EDI template that will be used to create the outbound file    | Trading partner > Template assigned to document type	            
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been created but no outbound file has yet been generated. <br> • **Error** – The staging record has been processed, but no outbound file has been created.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and added to the outbound file queue.	• **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	
<ins>**Overview**</ins>	
**Customer requisition**	| Customers purchase order number to be populated in the Customer requisition field of the sales order header | Sales Order > General > Customer requisition
**Customer reference**	    | Customers purchase order number to be populated in the Customer reference field of the sales order header   |	Sales Order > General > Customer reference
<ins>**Details**</ins>		
**Delivery terms**          | Customer delivery terms	            | Sales Order > Delivery > Delivery terms
**Terms of payment**	    | Terms of payment	                    | Sales Order > Price and discount > Payment
**Description**             | Terms of payment (Description)	    | Sales Order > Price and discount > Payment (Description)
**Carrier**                 | Carrier assigned to the packing slip	| Consignments > Carrier
**Bill of lading ID**		
**Customer GLN**            | The Global location number for this customer      | Sales Order > EDI > Customer GLN
<ins>**Status**</ins>
**Group control number**    |	Group control number for the outbound document. To be used to match inbound functional acknowledgement, where applicable.
**Received**                |	Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record.
<ins>**General FastTab**</ins>
<ins>**Delivery address**</ins>
**Delivery name**           | Address for delivery	                | Sales Order > Delivery Address Information	
**City**                    | Delivery address - City	
**Country/region**          | Delivery address - Country/region	
**ISO**                     | Delivery address - Country/region ISO	
**County**                  | Delivery address - County	
**District**                | Delivery address - District	
**Post box**                | Delivery address - Post box	
**State**                   | Delivery address - State	
**Street**                  | Delivery address - Street	
**Street number**           | Delivery address - Street number	
**ZIP/postal code**         | Delivery address - Zip/postal code	
**Building complement**     | Delivery address - Building complement	
**Store code**              | Delivery address - Store code	
<ins>**Warehouse**</ins>    | Address for warehouse                  |	Sales Order > Warehouse Information
**State**                   | Warehouse address - State	
**Street**                  | Warehouse address - Street	
**Street number**           | Warehouse address - Street number	
**ZIP/postal code**         | Warehouse address - ZIP/postal code	
**Building complement**     | Warehouse address - Building complement	
**City**                    | Warehouse address - City	
**Country/region**          | Warehouse address - Country/region	
**ISO**                     | Warehouse address - Country/region ISO	
**County**                  | Warehouse address - County	
**District**                | Warehouse address - District	
**Post box**                | Warehouse address - Post box	
<ins>**Invoice**</ins>      | Invoice details		
**Invoice**                 | D365 Invoice number	                | Invoice > Invoice Number
**Name**                    | Tax invoice account name	            | Invoice > Invoice Account Name
**Tax exempt number**       | Invoice account’s tax exempt number	| Invoice > Invoice Account’s VATNum
**Our account number**      | Our account number in the customers system	
**Date**                    | Invoice date	                        | Invoice journal > Date
**Due**                     | Invoice Due Date	                    | Invoice journal > Due Date
**Invoice amount excluding tax**    | Invoice amount excluding tax	| Invoice journal amount > Price excl. tax
**Invoice tax amount**      | Invoice total tax amount	            | Invoice journal amount > Sales tax
**Invoice amount including tax**    | Invoice amount including tax	| Invoice Journal Amount > Price incl. tax
**Tax rate**                | Calculated invoice tax rate	        | Invoice tax amount / Invoice amount excluding tax \*100
**Discount percentage**     | Invoice discount percentage	
<ins>**Invoice address**</ins>      | Invoice address for customer   | Invoice journal > Invoice account > Address information
**Building complement**     | Invoice address - Building complement	
**City**                    | Invoice address - City	
**Country/region**          | Invoice address - Country/region	
**ISO**                     | Invoice address - ISO	
**County**                  | Invoice address - County	
**District**                | Invoice address - District	
**Post box**                | Invoice address - Post box	
**State**                   | Invoice address - State	
**Street**                  | Invoice address - Street	
**Street number**           | Invoice address - Street number	
**ZIP/postal code**         | Invoice address - ZIP/postal code	
<ins>**Company**</ins>      | 		
**Company name**            | Company name	
**Company address**         | Address for company                    | Invoice journal > Company > Address information
**Street number**           | Company address - Street number
**Building complement**     | Company address - Building complement
**City**                    | Company address - City
**Country/region**          | Company address - Country/region
**County**                  | Company address - County
**District**                | Company address - District
**Post box**                | Company address - Post box
**State**                   | Company address - State
**Street**                  | Company address - Street
**ZIP/postal code**         | Company address - ZIP/postal code

### Line fields
The following EDI Line staging fields are available on the lines page.

**Field**	                | **Description**	                                        | **Source D365 field**
:---                        |:---                                                       |:---
**Line number**             | The line within the EDI table/file	
**Line number document**    | The line within the D365 Invoice	                        | Invoice journal line > Line number
**Item number**             | The D365 item id                                          | Invoice journal line > Item Number
**Name**                    | The D365 item name	                                    | Invoice journal line > Item Name
**Lot ID**                  | Lot Id / InventTransId for the invoice line	            | Inventory transaction > InventTransId
**Bar code**                | The GTIN or barcode	                                    | Sales line > EDI > EDI item number
**External item number**	| The external item number	                                | Sales line > General > External
**Unit price**	            | Unit price for the item	                                | Sales line > Unit price
**Unit tax rate**	        | Tax unit rate included for the order line	                | Tax unit rate for the Tax & Item tax groups
**Sales tax amount**	    | Tax line amount included for the order line	            | Tax amount for the Tax & Item tax groups
**Unit Price incl. tax**    | Unit price including tax	                                | Sales line > Unit price incl. tax
**Unit**                    | Unit of measure	                                        | Sales line > Unit
**Quantity**                | Invoice quantity	                                        | Invoice journal line > Quantity
**Ordered quantity**        | Sales order line’s quantity	                            | Sales line > Quantity
**Line amount excluding tax**   | Line amount excluding tax	                            | Sales line amount > Line amount excl. tax
**Line amount including tax**   | Line amount including tax	                            | Invoice journal line > Line amount incl. tax
**Delivery name**		                                                                | Sales line > Delivery Address Information
**Store code**	            | Store code for the sales line	                            | Sales line > Store code
**Customer reference**	    | Customers purchase order number as per Customer reference field in the sales order line	
**Customer requisition**	| Customers purchase order number as per Customer requisition field of the sales order line	
**Purchase order date**     | The purchase order date from the EDI order is shown here  | Sales order > Original order date	
**Delivery note**           | Delivery note for the Sales invoice is shown here. If invoice processed with **Update** set to _Delivery note_ and only for one Delivery note.	
**Document date**           | Document date for the Delivery note	
**Consignment note number** | Delivery note’s Consignment note number	
**Sales order**             | Sales order number for the invoice	
