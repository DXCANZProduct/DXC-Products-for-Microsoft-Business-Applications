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

Users can access the form by navigating to **EDI > Setup > Document types** and selecting FastTab **Templates**.

The EDI templates hold the settings required to translate the EDI document into or out of the document type’s staging tables. Trading partners will often supply information in different formats and use different fields to specify information.  Having templates allows us to configure these differences in a simple reusable fashion.
-	Select **Create**, a new dialog box will be displayed
- Specify the **Template ID** and **Description**
-	Select the Type of file for which the template is being created, options:
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

<ins>**Regional settings:**</ins>
Select the default regional settings used within the file.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
<ins>**Regional settings**</ins>
**Code page**                     |	
**Time zone preference**          |	The time zone offset used when processing the document type: <br> **Auto** (default) – The standard D365 time zone logic applies. <br> **User** – The user who is running the process’s time zone. <br> **No Conversion** – no time zone offset is applied. <br> **Company** – the legal entities time zone offset is applied. <br> **Manual** – use the proceeding ‘time zone’ parameter.
**Time zone**                     |	Enabled and used to set the timezone when **Time zone preference** is set to _Manual_.

<ins>**Decimals settings:**</ins>
Select the default decimal settings used within the file.

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Decimals**                      |	The decimal precision applied.
**Separator**                     | The decimal separator applied.
**Thousand separator**            | Only applies to Text templates. The thousand separator applied.

<ins>**Date setttings:**</ins>
Select the default date settings used withing the file.

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

### Text files

#### Text files setup



Text file are a very common way to transfer data. They are often delimited files with header and line information. This template type gives the ability to map such files to and from the documents staging tables. Text file can handle multiple headers. <br>
Select the **Setup** button to set the following:


- Flat – A single line per record. Each line of text in the file has all the header information on it as well as the line information
- Structured – Multiple lines per record. Each line in the file is either a header type or a line type
•	Select if the file is:
•	Delimited – Columns using a defined separator
•	Fixed – Fixed width (to be implemented in future version of the module)
•	Specify if the First row is header record. This row will then be ignored.
•	Select the Row delimiter used within the file
•	{CR}{LF} – Carriage return/line feed for windows
•	{CR} – Carriage return for MAC
•	{LF} – Line feed for UNIX
•	{;} – Semicolon
•	{:} – Colon
•	{,} – Comma
•	{t} – Tab
•	{|} Vertical bar
•	Select the Column delimiter used within the file, same selection as Row delimiter
•	Specify the Text qualifier used to identify text within the file. This will then be removed from the string when writing data to staging.
•	Where the file is Structured, specify the Record identifier position
•	If required, update the regional settings

## Mappings

### Text files mapping
