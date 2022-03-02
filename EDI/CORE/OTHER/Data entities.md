---
# required metadata

title: [EDI Core]
description: [EDI Core - Data entities]
author: [jdutoit2]
manager: Kym Parker
ms.date: 11/01/2022
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

# Data entities

The following is a summary of data entities available for the core EDI module:

## Connections
EDI > Setup > Connection setup

**Order**         | **Entity**              | **Description**	                                         | **Dependency**
:-----|:------------------------------------|:-------------------                                      |:------------------------
1		  | EDI FTP sites                       | FTP and SFTP **Connection details**, excluding passwords |
2     | EDI FTP Folder setup                | FTP and SFTP **Incoming and Outgoing paths**             | • EDI FTP sites
•	Socks4


## Core setup
EDI > Setup

**Order**         | **Entity**				                  | **Description**							                             | **Dependency**
:--|:----------------------------------------------|:--------------------------------------------------------------|:-------------------------
1	 | UOM mapping				                  | Create new **UOM mapping group**. EDI > Setup > UOM mapping   |
2	 | UOM mapping lines			              | Create new **UOM mapping lines**. EDI > Setup > UOM mapping  	| • UOM mapping	
3	 | Cleanup profile			                | Create new **Cleanup profile**. EDI > Setup > Cleanup profile |
4	 | Cleanup profile line		            | Create new **Cleanup profile lines**. EDI > Setup > Cleanup profile | • Cleanup profile
5	 | Functional acknowledgement document type mapping | Create new **Document type mapping** used for Functional acknowledgement. EDI > Setup > Document type mapping  | 
6	 | Functional acknowledgement document type mapping lines | Create new **Document type mapping lines** used for Functional acknowledgement. EDI > Setup > Document type mapping	| • Functional acknowledgement <br>document type mapping
7	 | Reset status profile            		| Create new **Reset status profile** recurrence <br> EDI > Setup > Reset status profile
8  | EDI parameters                      | Create new **EDI parameters** per legal entity                    |
9  | EDI Shared Parameters               | Create new **EDI shared parameters**                              |

## Core document setting profiles
EDI > Setup > Document types (Setting profiles for EDI core documents)

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1		  | EDI settings - Functional <br>acknowledgement inbound	| Create new document type **Settings profile** for Functional <br>acknowledgement inbound
2		  | EDI settings - Functional <br>acknowledgement outbound | Create new document type **Settings profile** for Functional <br>acknowledgement outbound

## Document types
EDI > Setup > Document types (Template, Validation, Outbound file names and EDI Field metadata)

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
1		  | EDI Template file			| Create new **Text** template and setup
2		  | EDI Template file section		| Section details for the **Text** template				| • EDI Template file
3		  | EDI Template file line section	| Line details for each section for the **Text** template		| • EDI Template file section
4		  | EDI Template XSLT			| Create new **XSLT Transformation** template and setup
5		  | EDI template XSLT collection	| Create new **XSLT Collection** template and setup
6		  | EDI template JSON			| Create new **JSON** template and setup
7		  | EDI template JSON collection	| Create new **JSON Collection** template and setup
8		  | EDI template code transformation	| Create new **Code transformation** template and setup
9     | EDI template section  | Create new **section** for existing XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI Template XSLT <br/> • EDI template XSLT collection <br/> • EDI template JSON <br/> • EDI template JSON collection <br/> • EDI template code transformation
10    | EDI template fields   | Create new **fields** for existing sections for XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI template section
11	  | EDI Validation profile		| Create new **Validation profiles** for all applicable document types	
12	  | EDI Validation profile line		| Create new **Validation profile lines** for all applicable document types | • EDI Validation profile
13	  | EDI Outbound file names		| Create new **Outbound file names**
14		| EDI Field metadata			| Update document type's **Field metadata**

The following entities are applicable to all **EDI - Standard formats** module:
EDI > Setup > Document types (Template)

 **Order**        | **Entity**		 	    | **Description**								| **Dependency**
:-----------------|:--------------------------------|:-------------------------							|:-------------------------
1	          | EDI Template EDIFACT            | Create new **EDIFACT** template and setup					|
2	          | EDI Template EDIFACT section    | Section details for the **EDIFACT** template				| • EDI Template EDIFACT
3	          | EDI Template EDIFACT element    | Element details for each section for the **EDIFACT** template		| • EDI Template EDIFACT section

> Note: If the EDIFACT template has been created manually (not via data entity), first delete the default UNA elements before importing Section and Element entities for the template. <br> Re-import data package if elements are not populated.

## EDI Batch control group
EDI > Setup > Batch control group

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
1   | EDI batch control group               | Create new **Batch control group**
2   | EDI batch control group company       | Add **Companies** to the Batch control group  | • EDI batch control group
3   | EDI batch control group job           | Add **Job** / Control type to the Batch control group | • EDI batch control group
4   | EDI batch control group document      | Add and enable **Documents** to the Batch control group per Job / Control type | • EDI batch control group <br/> • EDI batch control group job 
5   | EDI batch control group transfer type | Add and enabled **Transfer type** to the Batch control group per Document for Import and Export jobs  | • EDI batch control group <br/> • EDI batch control group job <br/> • EDI batch control group document
