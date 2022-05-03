---
# required metadata

title: [EDI Core]
description: [EDI Core - Setup EDI parameters]
author: [jdutoit2]
manager: Kym Parker
ms.date: 29/09/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  [SAB_EDIParameters]
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

# EDI parameters
The **EDI parameters** page is used to define settings that apply across the EDI module. These settings affect number sequences, and other behaviour. The setup on this page is set per legal entity and can be modified by users who have the appropriate security permissions.

To open the **EDI parameters** page, go to **EDI > Setup > EDI parameters**. Then set the fields as described in the following subsections.

## Refresh module
After each deployment, users should select the **Refresh module** button on the **General** tab of **EDI parameters** page.  
This option will refresh the modules artefacts and ensure the module is up to date.

## General
The parameters control the operation for the module per legal entity.
The EDI parameter’s Date format will be used to default Text document type’s Date formats. 
XML and JSON uses standard ISO formats, but can be overridden on a document level.

Leave XML and JSON as Standard date format to utilities the standard formats. 
If they are setup as Custom, the custom date and time format must be specified.

The following table describes the fields that are available on the **General** tab of the **EDI parameters** page.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
<ins>**Document Types**</ins>
**File Attachment Document Type** |	Specify the **Document management type** used to store EDI files that are sent and received for review. <br> Ensure file types/extensions that will be received from Trading partners, are included in **File types** at **Organization administration > Document management > Document management parameters**.
<ins>**Connection**</ins>         |
**Connection profile**	          | Specify the default **Connection profile** to be used when sending Outbound documents. This default can be overridden on Trading partner or Trading partner’s document level.
<ins>**Date**</ins>
**Date and time format**          |	**Standard** – Enables standard date/time formats. Enables the following fields: <br> -	Standard date and time format <br> -	Standard time format <br> -	Culture <br> **Custom** – Provides ability to specify a custom date/time format. Enables the following fields <br> -	Custom date and time format <br> - Custom time format
**Standard date and time format** |	Enabled when **Date and time format** is set to _Standard_. [Options](https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-date-and-time-format-strings)
**Standard time format**          |	Select between *Short time* or *Long time*
**Culture**                       |	Enabled when **Date and time format** is set to _Standard_ <br> -	**Custom** – Enables the Custom date and Custom time format fields <br> -	**[Invariant](https://docs.microsoft.com/en-us/dotnet/api/system.globalization.cultureinfo.invariantculture?view=netframework-4.8)** – Culture insensitive, associated with English language but not with any country/region <br> -	**Standard** – Enables Standard language field, to select applicable std language 
**Standard language**             |	Enabled when **Culture** is set to *Standard*. <br> Select applicable standard language
<ins>**Custom date format**</ins> | Enabled when **Culture** is set to *Custom*
**Format**                        |	Select the default **date** format to be used for all text templates
**Day**                           |	Select the default format used for **day** for all text templates
**Month**                         |	Select the default format used for **mont**h for all text templates
**Year**                          |	Select the default format used for **year** for all text templates
**Separator**                     |	Select the default **date separator** used for all text templates
<ins>**Custom time format**</ins> | Enabled when **Culture** is set to *Custom*
**Format**                        |	Select the default **time** format to be used for all text templates
**Separator**                     |	Select the default **time separator** used for all text templates
<ins>**Custom date and time format**</ins> | Enabled when **Date and time format** is set to _Custom_
**Custom date and time format**   |	Enter custom date and time format
**Formatted date and time example** |	Displays example date and time for Custom date and time format (in UTC timezone)
**Custom time format**            |	Enter custom time format
**Formatted time example**        |	Displays example time for **Custom time format** (in UTC timezone)
<ins>**Sales orders**</ins>
**Allow historic PO types**       |	Customer order types: Confirmation, Cancel and Change have been moved to Order purpose. This field provides Backwards compatibility to still show these deprecated options under order types

## Number sequence
Use the **Number sequences** tab on the **EDI parameters** page to assign number sequence codes to the different number sequences that the EDI module uses. The following table describes the purpose of each of those number sequences. For more information about number sequences, see [Number sequences overview](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/organization-administration/number-sequence-overview) and its related topics.

> Note: Number sequences displayed is dependent on enabled licensed modules.

**Reference** 	                  | **Description**
:-------------------------------- |:-------------------------------------
**EDI number**                    |	Unique identifier for EDI staging. This stores the data in D365 in an intermediary/staging tables before creating the target record.
**ASN number**                    |	Unique identifier when creating a Customer Advanced Shipping Notice (ASN) record. Customer license only
**Reconciliation Id**             |	Unique identifier when creating a 3PL Reconciliation Id. 3PL license only
**Group control number**          |	Unique identifier when creating outbound records. The Inbound functional acknowledgement needs to refer to the outbound document's Group control number in order to reconcile against the correct outbound record and update the Received status to Yes.

## Hold codes
The **Hold codes** tab is only available for Customer license. Assign the Hold codes to be used when creating the Sales order when processing Customer purchase order records. <br>

If required, create new Hold codes via **Sales and marketing > Setup > Sales orders > Order hold codes**. <br>
**Order hold codes** used for EDI, should have the following fields set to _No_:
- Default for sales order
- Remove inventory reservations

The following table describes the fields that are available on the **Hold codes** tab of the **EDI parameters** page.
**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**POC pending hold code**         |	Specify the hold code to be used for sales orders that require a Purchase order confirmation (POC). <br> When Customer purchase order acknowledgement document setting **PO confirmation required** is set to Yes, the Sales order will be created with this Hold code.
**POA pending hold code**	        | Specify the hold code to be used for orders that require a POA must be sent. <br> When Customer purchase order acknowledgement document setting **Lock order** is set to Yes, the Sales order will be created with this Hold code.
**Validation error hold code**    |	Specify the hold code to be used for validation errors. <br> When the Customer purchase order violates Error type validations, the sales order will be created with this Hold code.
