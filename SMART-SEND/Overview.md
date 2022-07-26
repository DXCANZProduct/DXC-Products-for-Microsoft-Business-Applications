---
# required metadata

title: Smart Send
description: Smart Send - Overview
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-29
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# DXC Smart Business Form Email Manager

## Release notes
The [release notes](Release-notes.md) describes the features that are either new or changed. 

## Introduction
DXC Smart Business Form Email Manager for Microsoft Dynamics 365 Finance and Operations (or Smart Send) is a simple and smart solution for sending business forms and other reports to your customers and vendors. The solution automates distribution of business forms and reports based on contact preferences using rich format email templates. The following are example business forms processes that can be streamlined using the DXC Smart Business Form Email Manager solution:

#### Customer
* Sales agreement confirmation
* Sales quotation
*	Sales order confirmation
*	Sales packing slip
*	Sales invoice
*	Sales return order
*	Sales return acknowledgement
*	Free text invoice
*	Customer account statement
*	Customer payment advice
*	Collection letter

#### Vendor
*	Request for quotation
*	Purchase order confirmation
*	Vendor payment advice
*	Vendor invoice

#### Projects
*	Project quotation
*	Project invoice

#### Inventory management
*	Transfer (order) overview

#### Warehouse management
* Bill of lading
*	Container contents

#### Transportation Management 
*	Commercial invoice
*	Packing list

####	Extendable to other business forms and reports

## Email Distribution
Business forms are sent automatically using email templates and are directed to recipients based on contact information setup on the customer account. 
* Email distribution may be controlled with the ability to hold and release documents before they are sent with the capability to fix and resend emails with incorrect addresses. 
* Email content is authored using placeholder tags which dynamically looks information up from the business form or report to include in the email subject or body. 
* Email can include the business form as well as additional file attachments associated with the email template, business form or report.

## Save to Azure Storage
DXC Smart Business Form Email Manager can also save copies of the emailed/printed business forms or reports into Azure storage. This allows for an archive of the actual business forms produced and sent. File location and file name can utilize placeholder tags which dynamically looks information up from the business form or report to include in the file name and define the Azure Storage location. Any fixed list placeholder tags are stored as metadata against the file in the Azure Storage.

## Extendable
While out of the box functionality is for the business forms listed above, the solution can be extended on further business forms or reports. A [technical guide](TECHNICAL-GUIDE/Technical-guide.md) is provided or alternatively upon request can be evaluated for product enhancements.
DXC Smart Business Form Email Manager for Microsoft Dynamics 365 Finance and Operations is simple to deploy, setup, and configure. Using the Microsoft Dynamics 365 extension framework you can deploy continuous updates for your Microsoft Dynamics 365 installation while maintaining compatibility with the add-on without taking a new release or merging code.

*Note: Major updates to the underlying Microsoft Dynamics 365 solution may require a new version of the addon solution to remain compatible with Microsoft Dynamics 365. Best practices in extension based development are used to maintain maximum compatibility with future versions of Microsoft Dynamics 365. Most incremental Microsoft Dynamics 365 updates should not require a new version of the addon solution, but testing should always be performed before deploying to a production environment.*

## Configuration

The following setup is required to configure Smart Send:
- [Smart send parameters](CONFIGURATION/Parameters.md) - Configure the business form or report type to be sent using Smart Send.
- [Email templates](CONFIGURATION/Email-template.md) - Create an email template to add a body to the email being generated. Placeholder tokens allow for the values in the report to be dynamically created.
- [Email placeholders](CONFIGURATION/Email_placeholder.md) - Identify the fixed and dynamic tokens supported for each report type.
- [Contact information purposes](CONFIGURATION/Address-and-contact-information-purpose.md) - Create or identify an existing contact information purpose as the intended destination of the business form or report.
- [Contact information](CONFIGURATION/Contact-information.md) - Contact information with the appropriate purpose must be stored against the account or account contact.
- [Security](CONFIGURATION/Security.md) - Lists the privileges associated with Smart Send and the security roles with access to the privilege

## [Email processing](PROCESSES/Email-processing.md)

## New ideas
Have a suggestion for new product or new feature for existing product? [Suggest a New idea](https://forms.office.com/r/U9twpSt3in)
