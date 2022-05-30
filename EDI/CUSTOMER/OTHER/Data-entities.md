---
# required metadata

title: [EDI Customer]
description: [EDI Customer - Data entities]
author: [jdutoit2]
manager: Kym Parker
ms.date: 20/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [EDI]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [jdutoit2]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Data entities

The following is a summary of data entities available for the Customer EDI module:

## Customer setup
EDI > Setup > Customer setup

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Customer EDI order type group   | Create new **Customer EDI order type group**. EDI > Setup > Customer setup > Customer EDI order type group
2	                | Customer EDI order type lines   | Create new **Customer EDI order type lines**. EDI > Setup > Customer setup > Customer EDI order type group  | Customer EDI order type group
3	                | Customer EDI order purpose group  | Create new **Customer EDI order purpose group**. EDI > Setup > Customer setup > Customer EDI order purpose group
4	                | Customer EDI order purpose lines  | Create new **Customer EDI order purpose lines**. EDI > Setup > Customer setup > Customer EDI order purpose group | Customer EDI order purpose group
5	                | POA response code group           | Create new **POA response code group**. EDI > Setup > Customer setup > POA response code group
6	                | POA response code group lines     | Create new **POA response code lines**. EDI > Setup > Customer setup > POA response code group  | POA response code group
7	                | Customer EDI order line change type group       | Create new **Customer EDI order line change type group**. EDI > Setup > Customer setup > Customer EDI order line change type group
8	                | Customer EDI order line change type group line  | Create new **Customer EDI order line change type lines**. EDI > Setup > Customer setup > Customer EDI order line change type group  | Customer EDI order line change type group

## Document setting profiles
EDI > Setup > Document types (Setting profiles for EDI customer documents)

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1	    | EDI Settings - PO                               | Create new document type **Settings profile** for Customer purchase order |
2	    | EDI Settings - Customer purchase order change   | Create new document type **Settings profile** for Customer purchase order change |
3	    | EDI Settings - POA                              | Create new document type **Settings profile** for Customer purchase order acknowledgement |
4	    | EDI Settings - ASN                              | Create new document type **Settings profile** for Customer advanced shipping notice |
5	    | EDI Settings - Sales Invoice                    | Create new document type **Settings profile** for Sales invoice |

## Document types
EDI > Setup > Document types (Template, Validation, Outbound file names and EDI Field metadata)

See [Core data entities](../../CORE/OTHER/Data-entities.md#document-types)

## Trading partner
EDI > Setup > Trading partner

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1                 | EDI Customers                           | Create new Customer trading partner   | [Customer setup](#customer-setup)
2                 | EDI Documents - Customers               | Add incoming and outgoing documents to Customer trading partner | EDI Customers, [Customer setting profiles](#document-setting-profiles)  and [Document types](../../CORE/OTHER/Data-entities.md#document-types)
3                 | Party postal address V2                 | Std entity with addition of EDI field SAB_EDIStoreCode | 
