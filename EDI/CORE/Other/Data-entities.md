---
# required metadata

title: EDI Core
description: EDI Core - Data entities
author: jdutoit2
manager: Kym Parker
ms.date: 2022-01-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIFTPSite
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

# Data entities

The following is a summary of data entities available for the core EDI module:

## Connections
EDI > Setup > Connection setup

**Order**         | **Entity**              | **Description**	                                         | **Dependency**
:-----|:------------------------------------|:-------------------                                      |:------------------------
1		  | EDI FTP sites                       | FTP and SFTP **Connection details**, excluding passwords |
2     | EDI FTP Folder setup                | FTP and SFTP **Incoming and Outgoing paths**             | • EDI FTP sites <br> •	Socks4


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
EDI > Setup > Document types (Template, Validation, Outbound file names and Staging metadata)

### Templates

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
**Text file** | | |
1		  | EDI Template file			| Create new **Text** template and setup
2		  | EDI Template file section		| Section details for the **Text** template				| • EDI Template file
3		  | EDI Template file line section	| Line details for each section for the **Text** template		| • EDI Template file section
**XSLT Transformation & XSLT Collection** | | |
1		  | EDI Template XSLT			| Create new **XSLT Transformation** template and setup
2		  | EDI template XSLT collection	| Create new **XSLT Collection** template and setup
3     | EDI template section  | Create new **section** for existing XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI Template XSLT <br/> • EDI template XSLT collection
4     | EDI template fields   | Create new **fields** for existing sections for XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI template section
5     | EDI template fields XSLT | Update **Attribute** flag on template fields  | • EDI template fields
**JSON & JSON Collection** | | |
1		  | EDI template JSON			| Create new **JSON** template and setup
2		  | EDI template JSON collection	| Create new **JSON Collection** template and setup
3     | EDI template section  | Create new **section** for existing XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI template JSON <br/> • EDI template JSON collection
4    | EDI template fields   | Create new **fields** for existing sections for XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI template section
**Code Transformation** | | |
1		  | EDI template code transformation	| Create new **Code transformation** template and setup
2     | EDI template section  | Create new **section** for existing XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI template code transformation
3    | EDI template fields   | Create new **fields** for existing sections for XSLT Transformation, XSLT Collection, JSON, JSON Collection or Code Transformation template types | • EDI template section
**EDIFACT**       |  | Applicable to **EDI - Standard formats** module |
1	   | EDI Template EDIFACT            | Create new **EDIFACT** template and setup					|
2	   | EDI Template EDIFACT section    | Section details for the **EDIFACT** template				| • EDI Template EDIFACT
3	   | EDI Template EDIFACT element    | Element details for each section for the **EDIFACT** template		| • EDI Template EDIFACT section

> Note: If the EDIFACT template has been created manually (not via data entity), first delete the default UNA elements before importing Section and Element entities for the template. <br> Re-import data package if elements are not populated.

### Setting profiles
Setting profiles are module specific and discussed within each module.

### Validation profiles

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
1	  | EDI Validation profile		| Create new **Validation profiles** for all applicable document types	
1	  | EDI Validation profile line		| Create new **Validation profile lines** for all applicable document types | • EDI Validation profile

### Outbound file names

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
1	  | EDI Outbound file names		| Create new **Outbound file names**

### Staging metadata

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
1		| EDI Field metadata			| Update document type's **Field metadata**


## EDI Batch control group
EDI > Setup > Batch control group

**Order**         | **Entity**				| **Description**							| **Dependency**
:-----------------|:------------------------------------|:-------------------------						|:-------------------------
1   | EDI batch control group               | Create new **Batch control group**
2   | EDI batch control group company       | Add **Companies** to the Batch control group  | • EDI batch control group
3   | EDI batch control group job           | Add **Job** / Control type to the Batch control group | • EDI batch control group
4   | EDI batch control group document      | Add and enable **Documents** to the Batch control group per Job / Control type | • EDI batch control group <br/> • EDI batch control group job 
5   | EDI batch control group transfer type | Add and enabled **Transfer type** to the Batch control group per Document for Import and Export jobs  | • EDI batch control group <br/> • EDI batch control group job <br/> • EDI batch control group document
