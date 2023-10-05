---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder Documents - Voyage advice
author: jdutoit2
manager: Kym Parker
ms.date: 2023-10-05
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: Action:SAB_EDIStagingFormRun_FFLCVoyageAdvice
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: 
ms.search.region: IconEDIFreightForwarderDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Voyage advice

Voyage advice document can be used to send Purchase order details to the Freight forwarder. <br>
The following subsections will describe how to view and send the **Voyage advice**. <br>
Viewing the [Staging table records](#view-staging-table-records) will also be discussed.


## Prerequisites
The following setup is prerequisites for the **Voyage advice**

### Document type setup
EDI > Setup > Document types: Voyage creator
1. Create [Template](../../CORE/Setup/DocumentTypes/File-templates.md) for the document.
2. Create [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md) for the document.


### Trading partners
EDI > Setup > Trading partners
1. If the Freight forwarder landed cost [trading partner](../SETUP/Trading-partner.md) doesn't exist, create the new trading partner.
1. Add and enable the **Voyage advice** document to the [Freight forwarder landed cost trading partner](../SETUP/Trading-partner.md) and select the applicable:
    - Template
    - File name setup

## Processing

### Create Voyage advice staging
An outbound voyage advice can be triggered via the following method: 
-	**Purchase order**: Accounts payable > Purchase orders > All purchase orders
        - Assign applicable **Shipping company** on the Purchase order header Landed cost FastTab.
        - Use **Send to EDI** on the Purchase order's Action Pane, Purchase tab, Landed cost heading, to create the outbound staging record,

## View staging table records
To view the Voyage advice staging records, go to **EDI > Documents > Freight forwarder landed cost documents > Voyage advice**. <br>
Use this page to review staging and process EDI Vendor purchase order documents to an Outbound file.

### List page
The following EDI fields are available on the list page.

**Field**               | **Description**
:---                    |:---
**EDI number**          |	EDI Staging table record id. Select **EDI number** or the **Details** button on the Action Pane, to view the details for the selected record. The number sequence is determined by [EDI number](../../CORE/Setup/EDI-parameters.md#number-sequence) on the **EDI parameters**.
**Company account**     | Legal entity of the document.
**Company GLN**         | The company’s global location number is shown here.
**Staging to target status**    | The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and created/added to Landed cost voyage(s). <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
**Trading partner account**     | Vendor account of **Shipping type** set to _Shipping company_ assigned to the staging record.
**Trading partner GLN**         | The Freight forwarder’s global location number is shown here.
**Created Date and Time**       | The date and time the selected record was created in the staging table
**Received**                    | Indicates if the **Functional acknowledgement inbound** has been received from the trading partner for the outbound document record

### Buttons
The following buttons are available on the **Voyage creator**'s Action Pane, tab **Voyage creator**.

**Button**	                    | **Description**
:---                            |:----
**Create selected files**       | Creates the outbound file for selected records where **Staging to target status** is set to _Not started_
**Create files**	            | Creates the outbound file for all records where **Staging to target status** is set to _Not started_
**Outbound files**              | View the outbound file record created by the selected staging record
**Trading partner**             | View the trading partner details in the [**Trading partners**](../SETUP/Trading-partner.md) page
**Show log**                    | If there are logs created within the **Process to outbound** step it is possible to review them at any time using this button. Shows only the current version.
**Reset Status**                | You can reset the the **Staging to target status** to _Not started_. This can be used to reprocess the selected record/s. Documents can only be processed if **Staging to target status** is set to _Not started_.
**Edit reset status recurrence**    | If the underlying issue was resolved after all the reset attempts have been completed the user can use this button to edit the recurrence field/s. This will: <br> • Update **Reset status profile** to _blank_ <br> • Update the **Reset status date/time** to next time reset will run <br> • **Reset status attempts** set to _Zero_ and <br> • **Recurrence** text updated with changed recurrence details
**Reset template**	            | Reset the template used to create the outbound file. <br> Only enabled where the **Staging to target status** is set to _Not started_.
**Cancel**                      | Select **Cancel** to update the **Staging to target status** to _Canceled_. Button is enabled when the **Staging to target status** is not set to _Completed_.

The following buttons are available on the **Voyage advice**'s Action Pane, tab **Acknowledgement**.
The **Acknowledgement** tab is available on all outgoing documents staging pages and enables the user to view the **Functional acknowledgement inbound** that has been received and processed for the outbound document.

**Button**	                    | **Description**
:---                            |:----
**Acknowledgement**             | Use this button to view the **Functional acknowledgement inbound** record received and processed for the outbound document.


### Header fields
The following EDI Header staging fields are available on the header page.

**Field**	            | **Description**	                                    | **D365 header target**
:---                    |:---                                                   |:---
<ins>**Identification FastTab**</ins>   |
<ins>**Identification**</ins>		|
**EDI number**          | EDI Staging table record id                           | 
**Company account**     | Legal entity of the document
**Company GLN**         | The company’s global location number is shown here.   | 
**Staging to target status**    |  The current status of the staging record. Options include: <br> • **Not Started** – The staging record has been successfully processed from the inbound file to the staging table but not processed to target. <br> • **Error** – The staging record has been processed from the staging table but no target has yet been created/updated.  There are errors with the staging record that needs to be reviewed. <br> • **Completed** – The staging record has been succesfully processed and created/added to Landed cost voyage(s). <br> • **Canceled** – The record has been manually canceled and will be excluded from processing.
<ins>**Reset status**</ins>		|
**Reset status profile**    | Reset status profile assigned to the file/document. This will default from EDI shared parameters or can be overridden on Trading partner’s incoming and outgoing documents. The profile can also be changed to another profile which will also reset the **Reset status attempts** to 0 and reset the **Reset status date/time**	
**Reset status date/time**  | Next date/time automatic reset status will run	
**Reset status attempts**   | Number of reset attempts already processed. The reset attempts will stop once this number reaches the **End after** as per assigned **Reset status profile**’s Recurrence	
**Recurrence**              | Recurrence text. Contains standard details of Recurrence, for example: <br> •	Interval (recurrence pattern) <br> • How many times the period will run (End after) <br> • From date/time the recurrence will start	


### Line fields
The following EDI Line fields are available on the lines page. <br> 

**Field**                   | **Description**                                                           | **D365 target**
:---                        |:---                                                                       |:---
**Line number**             | The line within the EDI table/file. Does not refer to Purchase or Transfer order line number.	
**Booking reference**       | Freight forwarder’s reference for the voyage. Can also be used as reference for Voyage tracking document   | Voyage > Booking reference
**Description**             | Voyage description	                                                    | Voyage > Description
**Voyage**                  | Populated with target Voyage, once staging record has been completed and created a voyage/s	| Voyage > Voyage
**Shipping container**      | Shipping container identification. Used to create a new Landed cost shipping container or add to existing container for the voyage  | Voyage lines > Shipping container
**Shipping container type** | Used to populate to Shipping container type for the target Shipping container. Mapped values can be used by assigning [Shipping container types mapping](../SETUP/FF-SETUP/Shipping-container-types-mapping.md) to the Trading partner.	| Shipping container > Shipping container type
**Ship date**               | Voyage and Shipping container’s ship date	                                | Voyage > Ship date <br> Shipping container > Ship date
**From port**               | The originating **From port**. If Journey template is not provided, this field is used to determine Journey template	| Used in [calculation](#journey-template-calculation) for Voyage > Journey template
**To port**                 | The final destination’s **To port**. If Journey template not provided, this field is used to determine Journey template	| Used in [calculation](#journey-template-calculation) for Voyage > Journey template
**Mode of delivery**        | The mode of delivery between **From** and **To port**. If Journey template not provided, this field is used to determine Journey template	| Used in calculation for Voyage > Journey template
**Number**                  | The D365 **Purchase** or **Transfer order number** for the voyage line	| Voyage lines > Number
**Reference**               | Indicates the reference for Number. Options are: <br> • Purchase order <br> • Transfer	| Voyage lines > Reference
**Bar code**                | The item identifier as sent by the trading partner. Used when Item Id source is: <br> • GTIN <br> • Barcode <br> Converted to internal item number by using **Item id source** on document settings.	| Voyage lines > Item number
**Item number**             | The item identifier as sent by the trading partner. Used when Item Id source is: <br> • Our item number <br> • External item number <br> Converted to internal item number by using **Item id source** on document settings.	| Voyage lines > Item number
**Size**                    | Product dimension - Size	                                            | Voyage lines > Size
**Style**                   | Product dimension - Style	                                            | Voyage lines > Style
**Version**                 | Product dimension - Version                                           | Voyage lines > Version
**Configuration**           | Product dimension - Configuration	                                    | Voyage lines > Configuration
**Color**                   | Product dimension - Colour	                                        | Voyage lines > Color
**Quantity**                | Voyage line’s quantity	                                                | Voyage lines > Quantity
**Unit**                    | Unit of measure of Voyage line quantity. <br> Mapped values can be used by assigning [UOM mapping](../../CORE/Setup/UOM-mapping.md) to the Trading partner.	    | Voyage line details > Reference > Unit
**House air waybill/Bill of lading**    | HAWB for voyage line	                                        | Voyage > House air waybill/Bill of lading
**Master air waybill/Bill of lading**   | MAWB for voyage line	                                        | Voyage > Master air waybill/Bill of lading
**Folio**                   | Folio for voyage line. <br> If blank, the Landed cost Folio number sequence will be used to create a new folio | Voyage lines > Folio
**Vendor account**          | Folio’s vendor account	                                                | Folios > Vendor account
**Customs broker**          | Folio’s customer broker. <br> Mapped values can be used by assigning [Customs broker mapping](../SETUP/FF-SETUP/Customs-broker-mapping.md) to the Trading partner.	| Folios > Customs broker
**Number of cartons**       | Voyage line and folio’s number of cartons	                                | Voyage lines > Number of cartons <br> Folios > Number of cartons
**Measurement**             | Voyage measurement	                                                    | oyage > Measurement
**Measurement unit**        | Voyage measurement unit. <br> Mapped values can be used by assigning [Shipping measurement unit mapping](../SETUP/FF-SETUP/Shipping-measurement-unit-mapping.md) to the Trading partner.	| Voyage > Measurement unit
**Line measurement**        | Voyage line measurement	                                                | Voyage lines > Measurement
**Line measurement unit**   | Voyage line measurement unit. <br> Mapped values can be used by assigning [Shipping measurement unit mapping](../SETUP/FF-SETUP/Shipping-measurement-unit-mapping.md) to the Trading partner.	 | Voyage lines > Measurement unit
**Vessel**                  | Voyage vessel	                                                            | Voyage > Vessel
**External Voyage Id**      | External voyage identification	                                        | Voyage > External voyage ID
**Journey template**        | Journey template to be used for Landed cost Tracking. <br> If blank, the following will be used to determine the applicable Journey template: <br> • From port <br> •	To port <br> •	Mode of delivery    | Voyage > Journey template
**Departure date**          | Departure date for the voyage	                                            | Voyage > Departure date
**ETA at shipping port**    | Estimated arrival at shipping port	                                    | Voyage > ETA at shipping port
**Shipment estimated delivery date**    | Estimated delivery date	                                    | Voyage > Estimated delivery date <br> Container > Estimated delivery date - if **Container estimated delivery date** blank
**Container estimated delivery date**	| Estimated delivery date for container. <br> If blank, **Shipment estimated delivery date** will be used	| Container > Estimated delivery date
**Shipping company seal number**    | Container’s shipping company seal number	                        | Container > Shipping company seal number

