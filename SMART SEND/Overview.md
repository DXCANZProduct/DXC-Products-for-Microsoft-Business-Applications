---
# required metadata

title: [Smart Send]
description: [Smart Send - Overview]
author: [Liam Coll]
manager: Kym Parker
ms.date: 29/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Smart Send]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [Liam Coll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [Liam Coll]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Overview
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
While out of the box functionality is for the business forms listed above, the solution can be extended on further business forms or reports, and technical guide is provided or alternatively upon request can be evaluated for product enhancements.
DXC Smart Business Form Email Manager for Microsoft Dynamics 365 Finance and Operations is simple to deploy, setup, and configure. Using the Microsoft Dynamics 365 extension framework you can deploy continuous updates for your Microsoft Dynamics 365 installation while maintaining compatibility with the add-on without taking a new release or merging code.

*Note: Major updates to the underlying Microsoft Dynamics 365 solution may require a new version of the addon solution to remain compatible with Microsoft Dynamics 365. Best practices in extension based development are used to maintain maximum compatibility with future versions of Microsoft Dynamics 365. Most incremental Microsoft Dynamics 365 updates should not require a new version of the addon solution, but testing should always be performed before deploying to a production environment.*
