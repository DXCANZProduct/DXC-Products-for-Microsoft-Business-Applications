---
# required metadata

title: [EDI Core]
description: [EDI Core - Setup document types - File templates]
author: [jdutoit2]
manager: Kym Parker
ms.date: 12/01/2020
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

# Document types - File templates

Users can access the form by navigating to **EDI > Setup > Document types**. <br>
Select or filter the applicable Document in the List and select FastTab **Templates**.

Templates hold the settings required to translate the EDI document into or out of the document type’s staging tables. Trading partners will often supply information in different formats and use different fields to specify information.  Having templates allows us to configure these differences in a simple reusable fashion.
- Select **Create**, a new dialog box called **Create a new template** will be displayed.
- Specify the **Template ID** and **Description**
- Select the **Type** of file for which the template is being created, options:
    - Text file (multiple headers supported)
    - XSLT Transformation (multiple headers not supported)
    - XSLT Collection (multiple headers supported)
    - Code Transformation (multiple headers not supported)
    - JSON (multiple headers not supported)
    - JSON Collection (multiple headers supported)
    - EDIFACT (EDI - Standard formats license only)
-	Select **Create**

## Setup
Next step is to update **Setup** for the created template.
The standard setup that applies to all types will be described first, thereafter unique setup for each Type will be discussed.

### Standard setup

**Regional settings** - Select the default regional settings used within the file.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Code page**                     |	Select the applicable code page.
**Time zone preference**          |	Select the time zone offset used when processing the document type: <br> **Auto** (default) – The standard D365 time zone logic applies. <br> **User** – The user who is running the process’s time zone. <br> **No Conversion** – no time zone offset is applied. <br> **Company** – the legal entities time zone offset is applied. <br> **Manual** – use the proceeding ‘time zone’ parameter.
**Time zone**                     |	Enabled and used to set the timezone when **Time zone preference** is set to _Manual_.

**Decimals settings** - Select the default decimal settings used within the file.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Decimals**                      |	The decimal precision applied.
**Separator**                     | The decimal separator applied.
**Thousand separator**            | Only applies to Text templates. The thousand separator applied.

**Date setttings** - Select the default date settings used within the file.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
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

### Text file templates setup

Text file are a very common way to transfer data. They are often delimited files with header and line information. This template type gives the ability to map such files to and from the documents staging tables. Text file can handle multiple headers. <br>
Select the **Setup** button to set the following for text templates:

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Flat or structured**            | **Flat** – A single line per record. Each line of text in the file has all the header information on it as well as the line information. <br> **Structured** – Multiple lines per record. Each line in the file is either a header type or a line type
**Delimited or fixed**            | **Delimited** – Columns using a defined separator. <br> **Fixed** – Fixed width (to be implemented in future version of the module)
**First row is header**           | Specify if the First row is header record. This row will then be ignored on the inbound file.
**Row delimiter**                 |	Select the Row delimiter used within the file, options: <br> **{CR}{LF}** – Carriage return/line feed for windows <br> **{CR}** – Carriage return for MAC. <br> **{LF}** – Line feed for UNIX <br> **{;}** – Semicolon <br> **{:}** – Colon <br> **{,}** – Comma <br> **{t}** – Tab <br> **{\|}** Vertical bar
**Column delimiter**              |	Select the Column delimiter used within the file, same selection as Row delimiter
**Text qualifier**                |	Specify the Text qualifier used to identify text within the file. This will then be removed from the string when writing data to staging.
**Record identifier position**    |	Where the file is Structured, specify the Record identifier position

## Mappings

### Text files mapping

Each document type has its own fields that can be either mapped to for inbound files or mapped from for outbound files. <br>
The mapping is made up of two sections: <br> 
- File sections (structured only) and
- Field mappings (structured and flat)
Select **Mappings** button to specify the columns within the file that are to be mapped.

#### File sections

##### Flat

Select **Edit** to update mappings for a text file
> Note: The Section type information will be defaulted and only a single Line entry is possible for flat text templates.

##### Structured

File sections are the different types of lines that can be found in a **structured** type file (as defined in the Template's setup called _Flat or structured_). Field mappings belong to each file section.

A Structured file can have many different file sections, all with an associated section type.
- Select **New** to create a new record
- Specify the **Name** of the file section. Exampled include header, lines, summary.
- Select the **Section type**. The options are:
    - **Header** – Header information often related to the Customer information.
    - **Line** – Related to Item information.  This may or may not include quantities
    - **Line Detail** – A sub line data line whose data will be mapped to the same record as the Line’s section type data (i.e. Item Quantity information)
    - **Footer** – Summary/Total information
> Note: A single record is possible for Header, Footer and Line sections within a file Section. Multiple records are possible for Header and Line Details
> Note:  Each section type that is included in the file must be specified even if no mappings are required. 
- Enter the section type **Description**
- Enter the **Record Identifier** - The identifier value used to identify the line type from the files data. The position of this identifier is specified on the template's setup called _Row identifier position_.

#### Field mappings

