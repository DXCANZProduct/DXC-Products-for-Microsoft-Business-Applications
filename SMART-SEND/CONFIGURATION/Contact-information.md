---
# required metadata

title: [Smart Send]
description: [Smart Send - Contact information]
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

## Customer/Vendor Account Contact Information
The Smart Send retrieves an email address by matching the contact information on the customer or vendor with a purpose. Specify at least one email address on the contact information and select a purpose that is specified on the Smart Send parameters.

It is possible to create multiple contact information records and assign different purpose values should a different contact be required for each business form or report.
 
To configure the contact information record with the desired purpose, select the appropriate contact information record and click the advanced button. Select the appropriate Purpose(s), value(s) – Click OK.

## Customer/Vendor Account Contacts
Smart Send can also retrieve an email address by matching the customer or vendor contact with a purpose. For this feature to work, the email parameter for the business form must have the parameter “Include account contact” selected. Refer to [Overview](Parameters.md) for more details on this parameter.

After a Customer or Vendor contact is selected, you must specify at least one email address on the contact information and select a purpose that is specified on the Smart Send parameters for a single or multiple business forms. It is possible to setup multiple contacts to share or have different purpose values should multiple or different contacts be required for each business form.
 
To configure the customer or vendor contact with the desired purpose, select the appropriate account contact, select the contact information record and click the advanced button. Select the appropriate Purpose(s), value(s) – Click OK.

## Warehouse Address Contact Information
For the Transfer overview, Smart Send retrieves an email address by matching the contact information with a purpose on a Warehouse address contacts. First, create a Warehouse Address for the Warehouse or Site.

Then specify at least one email address on the contact information and select a purpose that is specified on the Smart Send parameters. It is possible to create multiple contact information records and assign different purpose values should a different contact be required for each business form or report.

To configure the contact information record with the desired purpose, select the appropriate contact information record and click the advanced button. Select the appropriate Purpose(s), value(s) – Click OK.
