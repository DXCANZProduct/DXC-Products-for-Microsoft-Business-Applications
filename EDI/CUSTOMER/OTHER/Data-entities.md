---
# required metadata

title: EDI Customer
description: EDI Customer - Data entities
author: jdutoit2
manager: Kym Parker
ms.date: 2023-03-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable, SAB_EDIParameters, SAB_EDICustOrderTypeMapping, SAB_EDICustOrderPurposeMapping, SAB_EDICustPOACodesMapping, SAB_EDICustOrderLineChangeMapping, SAB_EDITradingPartner
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

## Core setup
EDI > Setup > EDI parameters

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1                 | Sales order hold codes          | Create new **Order hold codes** to use in **EDI parameters**: <br> • POC pending hold code <br> • POA pending hold code <br> • Validation error hold code |

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
3                 | Customer postal addresses                 | Standard data entity with addition of EDI field <br> •  Store Code | 

## Released products
Product information management > Products > Released products

**Order**         | **Entity**						                  | **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:-------------------------                   |:-------------------------
1                 | Released products V2                    | Standard data entity with addition of EDI fields: <br> • Inner unit <br> • Outer unit

