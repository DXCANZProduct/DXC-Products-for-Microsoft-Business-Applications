---
# required metadata

title: [EDI Core]
description: [EDI Core - Frequently asked questions]
author: [jdutoit2]
manager: Kym Parker
ms.date: 29/09/2021
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

# Frequently asked questions

## Version and Support Information
-	Where can I find contact information for support?
  - Support contact details can be located on the EDI parameters form on the About tab.
- Where can I identify the installed version of the EDI module
  - Navigate to Settings > About.  A list of installed models will be displayed on the Version tab.  Search for Sable 37 EDI. The version information will be displayed on the right (i.e. Sable37 EDI 10.0.14.202009181 (isv))
  
## XML Errors
- XML file errors when processed into the staging table
  - Check the data provided for each element is valid. (i.e. A null value for a ‘date’ element, will fail the XSD validation)

## Incoming orders
-	The Customer has sent the GTIN, however this is not being recognised when processing the order
   - Check that the GTIN from the file is mapped to the Barcode field in the staging table.
   - Check that the Item ID source is set to GTIN in the settings profile
-	My inbound file has been processed but there is no staging record
   - Check the template that is associated with the trading partner
- Staging table cannot be processed.  
   - Check the Version log for more details on the error.
  
## Sales orders
-	I am trying to edit the sales order however it is not possible
   - It is not possible to edit a sales order if a POA has been send and the Safety level if POA sent flag is set to locked (see POA settings profiles for further details)
   - Check that the sales order is not invoiced
-	I am trying to post the pick list, however the button is not available.
   - Check that the sales order is not on hold
-	I am trying to release the order to the warehouse, however this is not possible
   - Check that the sales order is not on hold
-	I am trying to post the delivery note, however the button is not available.
   - Check that the sales order is not on hold
-	I am trying to post the sales invoice, however the button is not available.
   - Check that the sales order is not on hold
-	My incoming file had 4 sales order lines, however my sales order only has 1 line
   - Check and validate the line number in the file.  This issue will occur where all line numbers are the same.  A warning will be displayed on the sales order 'EDI staging line 2.00 updated sales EDI line 1.00'
- If I manually create a Sales order to an EDI customer, can I still send them EDI for this order.
   - Can’t send a POA as the POA compares to data sent by the Customer, but are able to send ASN and Invoice
-	I am trying to create an ASN, however this is not possible
   - ASN requires SSCC and Consignment assigned
  
## Released product setup
-	I am trying to select the unit of measure for the inner and outer on the released products form, however the unit is not displayed
   - Check that there is a valid unit of conversion from the sales unit to the unit you wish to select.

## Number sequences are not available to setup
To load all new number sequence references, select **Reset** on **Organization administration > Number sequences > Number sequences > Manual cleanup**
