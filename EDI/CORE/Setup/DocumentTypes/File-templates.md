---
# required metadata

title: EDI Core
description: EDI Core - Setup document types - File templates
author: jdutoit2
manager: Kym Parker
ms.date: 2022-06-28
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Document types - File templates

Users can access the form by navigating to **EDI > Setup > Document types**. <br>
Select or filter the applicable Document in the List and select FastTab **Templates**.

Templates hold the settings required to translate the EDI document into or out of the document type’s staging tables. Trading partners will often supply information in different formats and use different fields to specify information.  Having templates allows us to configure these differences in a simple reusable fashion.

Create new template:
- Select **Create**, a new dialog box called **Create a new template** will be displayed
- Specify the **Template ID** and **Description**
- Select the **Type** of file for which the template is being created, options:
    - [Text file](#text-files) - multiple headers supported
    - [XSLT Transformation](#xml-files) - single header supported
    - [XSLT Collection](#xml-files) - multiple headers supported
    - [JSON](#json-files) - single header supported
    - [JSON Collection](#json-files) - multiple headers supported
    - [Code Transformation](#code-transformation-files) - single header supported
    - [EDIFACT](#edifact-files) - EDI - Standard formats license only
- Select **Create**

Copy existing template:
- Select **Copy**, a new dialog box called **Copy template** will be displayed
- Specify the **Template ID** and **Description**
- Select **Copy**

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

### Text files

#### Text files templates setup

Text file are a very common way to transfer data. They are often delimited files with header and line information. This template type gives the ability to map such files to and from the documents staging tables. Text file can handle multiple headers. <br>
Select the **Setup** button to set the following for text templates:

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Flat or structured**            | **Flat** – A single line per record. Each line of text in the file has all the header information on it as well as the line information. <br> **Structured** – Multiple lines per record. Each line in the file is either a header type or a line type
**Delimited or fixed**            | **Delimited** – Columns using a defined separator. <br> **Fixed** – Fixed width
**First row is header**           | Specify if the First row is header record. This row will then be ignored on the inbound file.
**Row delimiter**                 |	Select the Row delimiter used within the file, options: <br> **{CR}{LF}** – Carriage return/line feed for windows <br> **{CR}** – Carriage return for MAC. <br> **{LF}** – Line feed for UNIX <br> **{;}** – Semicolon <br> **{:}** – Colon <br> **{,}** – Comma <br> **{t}** – Tab <br> **{\|}** Vertical bar
**Column delimiter**              |	Select the Column delimiter used within the file, same selection as Row delimiter
**Text qualifier**                |	Specify the Text qualifier used to identify text within the file. This will then be removed from the string when writing data to staging.
**Record identifier position**    |	Where the file is Structured, specify the Record identifier position

If required to update regional, decimals or date settings, see [Standard setup](#standard-setup).

> Note: **Flat or structured** cannot be changed when mappings exist.

#### Text files template mappings

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
> Note: A single record is possible for Header, Footer and Line sections within a file Section. Multiple records are possible for Header and Line Details. <br>
> Note:  Each section type that is included in the file must be specified even if no mappings are required. 
- Enter the section type **Description**
- Enter the **Record Identifier** - The identifier value used to identify the line type from the files data. The position of this identifier is specified on the template's setup called _Row identifier position_.

#### Field mappings

Field mappings define how the data is positioned in the file on the section line. Fields can also be statically set to values and certain functions are available to transform the fields data if required.

**Field** 	                      | **Description**                         | **Applicable to          
:-------------------------------- |:-------------------------------------   |:----------------
**Value type**                    |	Whether the field value is a static value or a mapped field value	| Inbound & Outbound
**Static value**	              | If the field type is a static type, then this is the static value	| Inbound & Outbound
**Staging field**	              | The mapped field	                                                | Inbound & Outbound
**Staging table**	              | The table the mapped field represents                               | Inbound & Outbound
**Field position**	              | The position in the file the mapping represents                     | Inbound & Outbound
** **Field length**               |	Number of characters for field	                                    | Inbound & Outbound
** **Alignment**	              | Select Left or Right alignment for the field	                    | Outbound
** **Padding character**	      | Enter a padding character for the field	                            | Outbound
**Function**	                  | Apply an optional function to the data of this field                | Inbound & Outbound

> Note: ** Available for Fixed type text templates.


There are two ways to add a field mapping:

##### Manual selection

1. To create a new mapping, select **Add** from the mapping FastTab.
2. Select if the **Value type** will be:
    - Field - mapped to or from staging field, or 
    - Static - Static value used
4. If the Value type is Static, complete the **Static value** <br> _Note: Static value can be either plain text or a method between brackets for outbound files. Example:_ <br> 
(currentDate()) <br> 
(currentLanguageId()) <br> 
(currentSessionDate()) <br> 
(currentSessionDateTime()) <br> 
5.  Specify the **Staging field**. Switch bewteen the header and lines table to find the required field.
7.  Enter the **Field position** within the file.

> Note: To delete a line, select the record then select **Remove**. 

##### Fields picker

Alternatively, a bulk field picker can be used to add multiple mappings at once. 
- Select **Fields picker**
- A new form is displayed allowing Header and Line selection of multiple available records

**Field** 	                      | **Description**                      
:-------------------------------- |:-------------------------------------
**Selected**                      |	Mark whether to add the field. <br> Also indicates if the field is already selected for the template.
**Field label**                   |	The label of the field
**Field name**                    | The name of the field

- Select **Update** to update the mapping

Buttons **Select all** and **Clear all** are also available to easily select or clear all fields for the mapping.

> Note: To delete a line, select the record then select **Remove**. Lines can also be moved using the **Move up** or **Move down** buttons.
> If a field needs to be added more than once, use manual **Add** button on the Mappings FastTab.

##### Field functions

Field mappings can have functions applied to them to transform the data or perform calculations based on that data. The functions are only available for certain data types based on their functionality.

**Field function** 	              | **Field data type**                  | **Description**                       
:-------------------------------- |:-------------------------------------|:-----------------------
**Average**                       |	Number	                             | Average value across all staging records for the selected field
**Earliest**                      |	Date	                             | Earliest value across all staging records for the selected field
**First**	                      | Any type                             | First selected value across all staging records for the selected field
**Last**                          |	Any type	                         | Last selected value across all staging records for the selected field
**Latest**                        |	Date	                             | Latest value across all staging records for the selected field
**Max**                           |	Number	                             | Max value across all staging records for the selected field
**Min**                           |	Number	                             | Min value across all staging records for the selected field
**Remove carriage returns**       |	String	                             | Remove Carriage returns in the value of the selected field
**Remove decimal**                |	Number	                             | Remove decimals in the value of the selected field. Example: Line numbers.
**Remove space**                  |	String	                             | Remove spaces in the value of the selected field
**Sum**                           |	Number	                             | Sum of values across all staging records for the selected field

> Note: The list of available functions can also be located via **EDI > Setup > Configurations > Template field functions**


### XML files

When a new XML file template is created, the currently available fields will be defaulted in the mapping. <br>
By selecting **Mappings**, users can remove/add fields or move position of field/s. <br>
They can also enter a static value, apply custom formats and set the field as an attribute.

The elements in the XML template, uses the D365 table field names but it can be overridden in the **Name** column in Mappings.

Users can also enter a static value or apply functions for inbound and outbound files.
- **Static value**: Users can use a static value on an inbound file where the field is not within the file. Or send a static value on an outbound file.
- **Custom format**: Where the field is within the inbound file but needs to be formatted, use formula like substring to replace. On outbound files, custom format can also be used to format differently to document template’s setup, or other examples as per [Custom format](#custom-format) section.

Style sheets can also be applied, which will override the mappings.
XML Collection should be used for XML files with multiple headers.

#### XML files templates setup
If required, update the general settings by seleting the **Setup** button.

**Field** 	                      | **Description**                      
:-------------------------------- |:-------------------------------------
**Remove blank elements**         |	Select to remove elements from the outbound file that do not have data.  This is required for XSD validation.
**XLST output is XML**            |	Select if the XLST output is XML
**Suppress BOM characters**       |	**No** – Include byte order mark (BOM) characters in generated outbound XML files. <br> **Yes** – Suppress byte order mark (BOM) characters in outbound files
**Format outbound document**      |	**Outbound files**: <br> •	**No** – XML outbound file is created without carriage returns <br> •	**Yes** - XML outbound file is created with carriage returns <br> **Inbound files**: not affected by setting, file with/without carriage returns can be imported.

If required to update regional, decimals or date settings, see [Standard setup](#standard-setup).

#### XML template mappings

When creating **XLST Transformation** or **XLST Collection** templates:
- Select **Mappings**, the following options are available:
       - **XML** – Ability to override the default mappings
       - **XSD** – (XML Schema Definition) describes the elements within the XML document
       - **XSLT** – Ability to apply an XSLT transformation (if required)

> Note: If the document type has staging record/s, users can use the following to create an example XML populated with information. Select **Mappings > XML**. Select **Set data** button on the **Example** FastTab, select a staging table record and select **Choose**.

#### XML Transformation

XML file can be transformed by utilizing **Mappings > XSLT**
Paste XLST code on XLST tab. Can use **Run transformation** to check for compile errors. <br>
When opening the form, it will also display any compile errors.
**Validate XSD** is used to validate transformed XML, not the XSLT.
Click **Save XSLT**.
If scripting is allowed, ensure [EDI Shared parameter](../EDI-shared-parameters.md) **Enable XLST scripting** is enabled.

### JSON files

When a new JSON file template is created, the currently available fields will be defaulted in the mapping. <br>
By selecting **Mappings**, users can remove/add fields or move position of field/s. <br>
They can also enter a static value and apply custom formats.

The elements in the JSON template, uses the D365 table field names but it can be overridden in the **Name** column in Mappings.

Users can also enter a static value or apply functions for inbound and outbound files.
- **Static value**: Users can use a static value on an inbound file where the field is not within the file. Or send a static value on an outbound file.
- **Custom format**: Where the field is within the inbound file but needs to be formatted, use formula like substring to replace. On outbound files, custom format can also be used to format differently to document template’s setup, or other examples as per [Custom format](#custom-format) section.

JSON Collection should be used for JSON files with multiple headers.

> Note: If the document type has staging record/s, users can use the following to create an example XML populated with information. Select **Mappings > XML**. Select **Set data** button on the **Example** FastTab, select a staging table record and select **Choose**.

#### JSON files templates setup
If required to update regional, decimals or date settings, see [Standard setup](#standard-setup).
Date settings allow for ability to override default JSON ISO standard date format yyyy-MM-dd'T'HH:mm:ss.ff


### Code transformation files

Code transformation file format is available and uses the Incoming/outgoing transformation as developed in **EDI > Setup > Configurations > Template code transformations**

#### Code transformation files templates setup

If required, update the general settings by seleting the **Setup** button.

**Field** 	                            | **Default**                      
:---------------------------------------|:-------------------------------------
**Transformation**                      | Select the applicable Transformation Name. Values are filtered to Direction of the document template (Outgoing vs. Incoming)

If required to update decimals or date settings, see [Standard setup](#standard-setup).


### EDIFACT files

#### Prerequisites
License: IconEDIStandardFormats <br>
Feature enabled: EDI - Standard formats

#### EDIFACT files templates setup
If required, update the general settings by seleting the **Setup** button. <br>

The following Options under General, are defaulted for EDIFACT and are used to populate the mappings in UNA Service string.

**Field** 	                            | **Default**                      
:---------------------------------------|:-------------------------------------
**Component data element separator**    | :
**Data element separator**		        | +
**Decimal mark** **		                | .
**Release character**	            	| ?
**Segment terminator**		            | ‘

If required to update regional, decimals or date settings, see [Standard setup](#standard-setup).

> Note: The **Decimal separator** is linked to the **Decimal mark**. <br>
> Date formats can also be overridden for a specific field within Mappings by using [Custom format](#custom-format). For example, the document’s date format is set to yyyyMMdd, but can use yyyyMMddHHmm for specific field CreatedDateTime.

#### EDIFACT files template mappings

Each document type has its own fields that can be either mapped to for incoming files or mapped from for outgoing files. When creating an EDIFACT template, it automatically creates the EDI message and populates UNA segment under Mappings. EDIFACT mappings uses a tree structure, and normally includes a:
- **Header section** – Header provides information related to the message, recipient, sender, reference, name and address, etc.
- **Detail section** - Related to line-item information. For example: line number, item numbers, quantities, and pricing. Since this section needs to repeat per staging line: Select the line staging table in field **Staging table**.
- **Summary section** – Document’s total monetary amounts. Also includes Section control, Control total and Message trailer.

Select **Mappings** to access the template’s mappings.

EDIFACT hierarchy is (Section) > Segment > Composites > Elements

##### Sections

- Select **Add section** and enter a **Name**. Sections can be added under existing sections to create a tree structure. <br>
When creating the **Detail section** (that will be repeated for each line), select the applicable **Staging table** next to the Section’s **Name**. This will ensure the section is repeated for each line record. This is not required for Header or Summary section.
<br>
Example Sections are:
- Header section
- Detail section
- Summary section

> Note: To **Delete** a section, select the section then select **Delete section**.

##### Segment

The level under Section is called **Segments**. <br>
- Select the applicable Section and select **New** to add a Segment.
- Enter a **Static value** OR select the applicable **Staging field**. Segments are usually Static values like UNH, BGM, etc. <br>
When selecting a **Staging field**, the Staging table options include the header, line staging tables. <br>
It also includes **EDIFACT message**, which includes options like:
    - Created date
    - Created time
    - Segment count, and
    - Service string fields
- **Name** is defaulted from the Static value / Staging field but can be overridden.
- Where applicable, enter a [Custom format](#custom-format) for the field.

> Note: To **Delete** a Segment, select the record then select **Delete**. <br>
> Segments can be moved up or down within its Section by using the **Up** and **Down** buttons.

Example Segments for a EDIFACT D01B are:
- 0010 UNH Message header:
    - Static value = UNH 
    - Name = 0010 Message header
- 0020 BGM Beginning of message
    - Static value = BGM
    - Name = 0020 Beginning of message

##### Composites

The level under Segments is called **Composites**. 
- Select the applicable Segment and select **New** to add a Composite.
- Enter a **Static value** OR select the applicable **Staging field**. <br>
When selecting a **Staging field**, the Staging table options include the header, line staging tables. <br>
It also includes **EDIFACT message**, which includes options like:
    - Created date
    - Created time
    - Segment count, and
    - Service string fields
- **Name** is defaulted from the Static value / Staging field but can be overridden.
- Where applicable, enter a [Custom format](#custom-format) for the field.

> Note: To **Delete** a composite, select the record then select **Delete**. <br>
> Composites can be moved up or down within its Segment by using the **Up** and **Down** buttons. <br>

Example Composites for Segment UNH for an outbound Vendor purchase order:
- 0062 Message reference number:
    - Staging field = Group control number
    - Name = 0062 Message reference number
- 0065 Message type
    - Static value = ORDERS
    - Name = 0065 Message type

##### Elements

The level under Composites is called **Elements**. 
- Select the applicable Composite and select **New** to add an Element.
- Enter a **Static value** OR select the applicable **Staging field**. <br>
When selecting a **Staging field**, the Staging table options include the header, line staging tables. <br>
It also includes **EDIFACT message**, which includes options like:
    - Created date
    - Created time
    - Segment count, and
    - Service string fields
- **Name** is defaulted from the Static value / Staging field but can be overridden.
- Where applicable, enter a [Custom format](#custom-format) for the field.

> Note: To **Delete** an Element, select the record then select **Delete**. <br>
> Elements can be moved up or down within its Composite by using the **Up** and **Down** buttons. <br> 

Example Elements for Segment 0065 Message type:
- 0052 Message version number
    - Static value = D
    - Name = 	0052 Message version number
- 0054 Message release number
    - Static value = 01B
    - Name = 	0054 Message release number
- 0051 Controlling agency, code
    - Static value = UN
    - Name = 0051 Controlling agency, code
- 0057 Association assigned code
    - Static value = EAN010
    - Name = 0057 Association assigned code

Short example to display section, segment, composite, element relation:

**Section** 	                   | **Segment**                  | **Composite**                 | **Element**                    
:----------------------------------|:-----------------------------|:------------------------------|:---------------------
Header section	                   | UNH (Message header)         | Message reference number      | 
<br>        		        	   | <br>                         | ORDERS (Message type)         | D (Message version number)		
<br>        		        	   | <br>                         | <br>                          | 01B (Message release number)
<br>        		               | <br>                         | <br>                          | UN (Controlling agency, code)
<br>        		               | <br>                         | <br>                          | EAN010 (Association assigned code)

##### Custom format

Field mappings can have C# formats applied by using the field Custom format, some examples include: <br>

**Example Custom format**	       | **Description**	          | **Example before**	          | **Example result**
:----------------------------------|:-----------------------------|:------------------------------|:---------------------
35	                               | Left 35 characters of string |	Long description item that is more than 35 characters	| Long description item that is more
3,5	                               | Substring (3,5)	          | 123456789	                  | 34567
prefix{0,7:3,5}postfix	           | Align example with prefix and postfix               |	123456789	                  | prefix 34567postfix
C4                                 | Currency with 4 decimals	  | 123.45676	                  | $123.4567
N2	                               | 2 decimals	                  | 123.45676	                  | 123.45
N0	                               | 0 decimals (for example line number)	| 1.0000000           |	1

More examples:
- [https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-numeric-format-strings](https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-numeric-format-strings)
- [http://blog.stevex.net/string-formatting-in-csharp/](http://blog.stevex.net/string-formatting-in-csharp/)

##### Example

An example of the document’s format can be viewed under the **Example** FastTab in **Mappings**. <br>
**Segment** will display the selected Segment’s example, whereas **Message** displays the complete message’s example. <br>
**Set data** can be used to select an existing staging record to populate the Message example. <br>
Where **Set data** is blank, the Example message staging fields will not be populated, but will display the mapped {Table.Field} value. <br>

### Data entities
See [Data entities](../../Other/Data-entities.md) for importing document type templates
