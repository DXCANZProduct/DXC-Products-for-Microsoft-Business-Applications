---
# required metadata

title: [Docusign]
description: [Introduction to Docusign]
author: [ndavidson]
manager: Kym Parker
ms.date: 12/01/2020
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Docusign]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [ndavidson2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [ndavidson2]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
