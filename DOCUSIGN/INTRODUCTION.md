---
# required metadata

title: Docusign
description: Introduction to Docusign
author: ndavidson
manager: Kym Parker
ms.date: 2020-01-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_DSDocument
audience: Application User
# ms.devlang: 
ms.reviewer: ndavidson2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: ndavidson2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---
# DXC DocuSign for Dynamics 365 for Operations

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction

**DXC DocuSign for Dynamics 365 for Operations module couples Microsoft D365 Finance and Operations with the DocuSign® solution.**

DXC Solutions for Docusign and Dynamics 365 empowers users to send, sign, and approve documents quickly via electronic signature capture and approvals. This module allows users to be able efficiently send documents to both external and internal receipiants for review, acceptance or rejection. This creates a seamless process that can be used by internal teams, customers, vendors and partners to do business.

Any Dynamics 365 documents that use SSRS processing capabilities can be sent for signature via DocuSign. Additionally, selected completed documents (including signatures) will be downloaded and attached via Document handling to the corresponding record. This feature is available for the following documents: 

- Sales Quotation – attached to the Quotation journal
- Purchase Order Confirmation – attached to the Purchase Order confirmation journal
- Sales Agreement Confirmation – attached to the Sales Agreement confirmation
- Purchase Agreement Confirmation – attached to the Purchase Agreement confirmation

The Docusign solution for D365 allows for seamless document signature capture design, review, processing, and approval. It allows decision makers to review and approve documents within minutes while providing legally binding signed agreements.  

## Configuration

The following setup is available under **Organization administration > Setup > Docusign**:
- [DocuSign parameters](SETUP/Parameters.md) - Configure connection setting for DocuSign and update frequency.
- [Document types](SETUP/Document-type.md) - Set which document formats will use DocuSign
- [Templates](SETUP/Template.md) - Set the signatory types, the sequence of the signatories, the tag types and their position on the document 
- [Users](SETUP/Users.md) - Set the user accounts who are able to send using DocuSign

### Print Management

Print management configuration forms now allow for DocuSign as a destination
- [Print Management](SETUP/Print-Management.md) - Set DocuSign as the print management destination for the selected report format

## Inquiries

The following forms are available under **Organization administration > Inquiries and reports > Docusign**:
- [Documents](INQUIRIES/Documents.md) - Review the status of selected documents communicated to DocuSign.
- [Exceptions](INQUIRIES/Exception.md) - Review the reason for a failed communication with either DocuSign or the signatory.
