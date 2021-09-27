---
# required metadata

title: [EDI Core]
description: [EDI Core - Data entities]
author: [jdutoit2]
manager: Kym Parker
ms.date: 27/09/2021
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

**Order**         | **Entity**
:-----------------|:------------------------------------
1		  | EDI FTP sites

## Core setup
EDI > Setup

**Order**         | **Entity**				                  | **Description**							                                  | **Dependency**
:--|:----------------------------------------------|:--------------------------------------------------------------|:-------------------------
1	 | UOM mapping				                  | Create new UOM mapping group <br> EDI > Setup > UOM mapping   |
2	 | UOM mapping lines			              | Create new UOM mapping lines <br> EDI > Setup > UOM mapping  	| UOM mapping	
3	 | Cleanup profile			                | Create new Cleanup profile <br> EDI > Setup > Cleanup profile |
4	 | Cleanup profile line		            | Create new Cleanup profile lines <br> EDI > Setup > Cleanup profile | Cleanup profile
5	 | Functional acknowledgement <br>document type mapping | Create new Document type mapping <br> EDI > Setup > Document type mapping  | 
6	 | Functional acknowledgement <br>document type mapping lines | Create new Document type mapping lines <br> EDI > Setup > Document type mapping	| Functional acknowledgement <br>document type mapping
7	 | Reset status profile            		| Create new Reset status profile recurrence <br> EDI > Setup > Reset status profile
8  | EDI parameters                      | Create new EDI parameters per legal entity                    |
9  | EDI Shared Parameters               | Create new EDI shared parameters                              |

## Core document setting profiles
EDI > Setup > Document types (Setting profiles for EDI core documents)

**Order**         | **Entity**						| **Description**
:-----------------|:------------------------------------		|:-------------------------
1		  | EDI settings - Functional acknowledgement inbound	| Create new
2		  | EDI settings - Functional acknowledgement outbound

## Document types
EDI > Setup > Document types (Template, Validation, Outbound file names and EDI Field metadata)

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
1		  | EDI Template file			| Create new **Text** template and setup
2		  | EDI Template file section		| Section details for the **Text** template				| EDI Template file
3		  | EDI Template file line section	| Line details for each section for the **EDIFACT** template		| EDI Template file section
4		  | EDI Template XSLT			| Create new **XSLT Transformation** template and setup
5		  | EDI template XSLT collection	| Create new **XSLT Collection** template and setup
6		  | EDI template JSON			| Create new **JSON** template and setup
7		  | EDI template JSON collection	| Create new **JSON Collection** template and setup
8		  | EDI template code transformation	| Create new **Code transformation** template and setup
9		  | EDI Validation profile		| Create new **Validation profiles** for all applicable document types	| EDI Validation profile
10		  | EDI Validation profile line		| Create new **Validation profile lines** for all applicable document types
11		  | EDI Outbound file names		| Create new outbound file names
12		  | EDI Field metadata			| Update document type's field metadata


The following entities are applicable to all EDI - Standard format module:
EDI > Setup > Document types (Template)

 **Order**        | **Entity**		 	    | **Description**								| **Dependency**
:-----------------|:--------------------------------|:-------------------------							|:-------------------------
1	          | EDI Template EDIFACT            | Create new **EDIFACT** template and setup					|
2	          | EDI Template EDIFACT section    | Section details for the **EDIFACT** template				| EDI Template EDIFACT
3	          | EDI Template EDIFACT element    | Element details for each section for the **EDIFACT** template		| EDI Template EDIFACT section
