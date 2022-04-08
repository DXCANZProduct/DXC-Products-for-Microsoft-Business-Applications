---
# required metadata

title: [EDI Vendor]
description: [Introduction to EDI Vendor]
author: [jdutoit2]
manager: Kym Parker
ms.date: 8/11/2021
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

# Introduction to Vendor EDI
This section will provide a quick overview of the Vendor EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- Inbound
	- Functional Acknowledgement – Receive functional acknowledgement that outbound document has been received by Trading partner.
- Outbound
	- Functional Acknowledgement – Send functional acknowledgement that inbound document has been received.

### Vendor EDI documents (Vendor license only)

EDI contains the following documents pertaining to Vendor Trading partners.
- Outbound
	- Vendor purchase order - Allows D365 to send a purchase order to a Vendor.
	- Vendor purchase order change - Allows D365 to send changes to a purchase order to a Vendor. Also used to send purchase order confirmation where required for a purchase order acknowledgement.

- Inbound
	- Vendor purchase order acknowledgement (POA) - Allows Vendor to send an Acknowledgement once a purchase order has been received and verified, which in turn updates the D365 purchase order based on EDI settings.
	- Vendor advanced shipping notice (ASN) - Allows Vendor to send delivery information to D365 with the delivery details, creating an arrival journal against the purchase order or a Load for Advanced Warehousing warehouses.
	- Purchase invoice - Allows Vendor to send a Tax Invoice document to D365, creating a pending or posting the Tax invoice for the Purchase order/s based on settings and validation.

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction.md#setup)

### Vendor setup

#### Assigned on items:
- Required where the confirmed pack sizes within the Vendor purchase order acknowledgement is set to use System pack and/or System inner. Setup at **Product information management > Products > Released products and selecting FastTab Manage inventory**
	- [Item pack sizes](../../CORE/Setup/Item-pack-sizes.md)

#### Mappings assigned on Vendor Trading partner
Used to map D365/EDI value to Vendor's value and assigned on Vendor Trading partner: <br>

- Vendor setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > Vendor setup** <br>
	- [Order type group](../SETUP/VENDOR-SETUP/Order-type-group.md)
		- Vendor purchase order (OrderType)
		- Vendor purchase order change (OrderType)
	- [Order purpose group](../SETUP/VENDOR-SETUP/Order-purpose-group.md)
		- Vendor purchase order (OrderPurpose)
		- Vendor purchase order change (OrderPurpose)
	- [Order line change type group](../SETUP/VENDOR-SETUP/Order-line-change-type-group.md)
		- Vendor purchase order change (LineChangeType)
	- [Carrier mode](../SETUP/VENDOR-SETUP/Carrier-mode.md)
		- Vendor purchase order (CarrierMode)
		- Vendor purchase order change (CarrierMode)
	- [Charges code](../SETUP/VENDOR-SETUP/Charges-code.md)
		- Vendor purchase order (MiscCode)
		- Vendor purchase order change (MiscCode)
		- Purchase invoice (MiscCode)
	- [POA response code group](../SETUP/VENDOR-SETUP/POA-response-code-group.md)
		- Vendor purchase order acknowledgement (POAVendCode, POAVendCodeItem and POAVendCodeShipment)
	- [Payment terms type group](../SETUP/VENDOR-SETUP/Payment-terms-type-group.md)
		- Vendor purchase order (TermsTypeCode) 
		- Vendor purchase order change (TermsTypeCode)
		- Purchase invoice (TermsTypeCode)
	- [Misc charge/allowance indicator](../SETUP/VENDOR-SETUP/Misc-charge-allowance-indicator.md)
		- Vendor purchase order (MiscIndicator) 
		- Vendor purchase order change (MiscIndicator)
		- Purchase invoice (MiscIndicator)
	- [Misc method of handling](../SETUP/VENDOR-SETUP/Misc-method-of-handling.md)
		- Purchase invoice (MiscMethodHandling)

- Core Setup: **EDI > Setup** <br>
	- [Unit of measure mapping](../../CORE/Setup/UOM-mapping.md)

#### Vendor Document type setup
Setup Document types which will be assigned on Vendor Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates.md): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Vendor purchase order](../SETUP/SETTING-PROFILES/Vendor-purchase-order.md)
    - [Vendor purchase order change](../SETUP/SETTING-PROFILES/Vendor-purchase-order-change.md)
    - [Vendor purchase order acknowledgement](../SETUP/SETTING-PROFILES/Vendor-purchase-order-acknowledgement.md)
    - [Vendor advanced shipping notice](../SETUP/SETTING-PROFILES/Vendor-advanced-shipping-notice.md)
    - [Purchase invoice](../SETUP/SETTING-PROFILES/Purchase-invoice.md)
- Validation profiles: applicable to the following inbound document types
    - [Vendor purchase order acknowledgement](../SETUP/VALIDATION-PROFILES/Vendor-purchase-order-acknowledgement.md)
    - [Vendor advanced shipping notice](../SETUP/VALIDATION-PROFILES/Vendor-advanced-shipping-notice.md)
    - [Purchase invoice](../SETUP/VALIDATION-PROFILES/Purchase-invoice.md)
- [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames.md): applicable to all outbound document types
- [Field metadata](../../CORE/Setup/DocumentTypes/Field-metadata.md): optionally update staging form's display name and help text per field

#### Trading partner setup
Create new trading partners and assign setup and incoming/outgoing documents. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading-partner.md)

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../../CORE/Managing-files/Inbound-files.md)

### Export files
Ability to manually export or review outbound files
- [Outbound files](../../CORE/Managing-files/Outbound-files.md)

### Vendor documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Vendor documents**
- [Vendor purchase order](../DOCUMENTS/Vendor-purchase-order.md)
- [Vendor purchase order change](../DOCUMENTS/Vendor-purchase-order-change.md)
- [Vendor purchase order acknowledgement](../DOCUMENTS/Vendor-purchase-order-acknowledgement.md)
- [Vendor advanced shipping notice](../DOCUMENTS/Vendor-advanced-shipping-notice.md)
- [Purchase invoice](../DOCUMENTS/Purchase-invoice.md)

[Process overview](Process-overview.md) for Vendor EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/WORKSPACES/EDI-Document-maintenance-workspace.md)
- [EDI Purchase order processing](../WORKSPACES/EDI-Purchase-order-processing.md)

## Other
- [Data entities](../OTHER/Data-entities.md)
- [Security configuration](../../CORE/OTHER/Security-configuration.md)
- [Frequently asked questions](../OTHER/FAQ.md)
