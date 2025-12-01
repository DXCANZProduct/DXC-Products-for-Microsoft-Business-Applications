---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
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
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction#setup)

### Vendor setup

#### Assigned on items:
- Required where the confirmed pack sizes within the Vendor purchase order acknowledgement is set to use System pack and/or System inner. Setup at **Product information management > Products > Released products and selecting FastTab Manage inventory**
	- [Item pack sizes](../../CORE/Setup/Item-pack-sizes)

#### Mappings assigned on Vendor Trading partner
Used to map D365/EDI value to Vendor's value and assigned on Vendor Trading partner: <br>

- Vendor setup and which EDI document (and field) it is mapped to/from: **EDI > Setup > Vendor setup** <br>
	- [Order type group](../SETUP/VENDOR-SETUP/Order-type-group)
		- Vendor purchase order (OrderType)
		- Vendor purchase order change (OrderType)
	- [Order purpose group](../SETUP/VENDOR-SETUP/Order-purpose-group)
		- Vendor purchase order (OrderPurpose)
		- Vendor purchase order change (OrderPurpose)
	- [Order line change type group](../SETUP/VENDOR-SETUP/Order-line-change-type-group)
		- Vendor purchase order change (LineChangeType)
	- [Carrier mode](../SETUP/VENDOR-SETUP/Carrier-mode)
		- Vendor purchase order (CarrierMode)
		- Vendor purchase order change (CarrierMode)
	- [Charges code](../SETUP/VENDOR-SETUP/Charges-code)
		- Vendor purchase order (MiscCode)
		- Vendor purchase order change (MiscCode)
		- Purchase invoice (MiscCode)
	- [POA response code group](../SETUP/VENDOR-SETUP/POA-response-code-group)
		- Vendor purchase order acknowledgement (POAVendCode, POAVendCodeItem and POAVendCodeShipment)
	- [Payment terms type group](../SETUP/VENDOR-SETUP/Payment-terms-type-group)
		- Vendor purchase order (TermsTypeCode) 
		- Vendor purchase order change (TermsTypeCode)
		- Purchase invoice (TermsTypeCode)
	- [Misc charge/allowance indicator](../SETUP/VENDOR-SETUP/Misc-charge-allowance-indicator)
		- Vendor purchase order (MiscIndicator) 
		- Vendor purchase order change (MiscIndicator)
		- Purchase invoice (MiscIndicator)
	- [Misc method of handling](../SETUP/VENDOR-SETUP/Misc-method-of-handling)
		- Purchase invoice (MiscMethodHandling)

- Core Setup: **EDI > Setup** <br>
	- [Unit of measure mapping](../../CORE/Setup/UOM-mapping)

#### Vendor Document type setup
Setup Document types which will be assigned on Vendor Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates): applicable to all document types
- Setting profiles: applicable to the following document types
    - [Vendor purchase order](../SETUP/SETTING-PROFILES/Vendor-purchase-order)
    - [Vendor purchase order change](../SETUP/SETTING-PROFILES/Vendor-purchase-order-change)
    - [Vendor purchase order acknowledgement](../SETUP/SETTING-PROFILES/Vendor-purchase-order-acknowledgement)
    - [Vendor advanced shipping notice](../SETUP/SETTING-PROFILES/Vendor-advanced-shipping-notice)
    - [Purchase invoice](../SETUP/SETTING-PROFILES/Purchase-invoice)
- Validation profiles: applicable to the following inbound document types
    - [Vendor purchase order acknowledgement](../SETUP/VALIDATION-PROFILES/Vendor-purchase-order-acknowledgement)
    - [Vendor advanced shipping notice](../SETUP/VALIDATION-PROFILES/Vendor-advanced-shipping-notice)
    - [Purchase invoice](../SETUP/VALIDATION-PROFILES/Purchase-invoice)
- [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames): applicable to all outbound document types
- [Field metadata](../../CORE/Setup/DocumentTypes/Field-metadata): optionally update staging form's display name and help text per field

#### Trading partner setup
Create new trading partners and assign setup and incoming/outgoing documents. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners**
- [Trading partner](../SETUP/Trading-partner)

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../../CORE/Managing-files/Inbound-files)

### Export files
Ability to manually export or review outbound files
- [Outbound files](../../CORE/Managing-files/Outbound-files)

### Vendor documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Vendor documents**
- [Vendor purchase order](../DOCUMENTS/Vendor-purchase-order)
- [Vendor purchase order change](../DOCUMENTS/Vendor-purchase-order-change)
- [Vendor purchase order acknowledgement](../DOCUMENTS/Vendor-purchase-order-acknowledgement)
- [Vendor advanced shipping notice](../DOCUMENTS/Vendor-advanced-shipping-notice)
- [Purchase invoice](../DOCUMENTS/Purchase-invoice)

[Process overview](Process-overview) for Vendor EDI documents.

### Workspaces
The following workspaces are available:
- [EDI Document maintenance](../../CORE/Workspaces/EDI-Document-maintenance-workspace)
- [EDI Purchase order processing](../WORKSPACES/EDI-Purchase-order-processing)

## Other
- [Data entities](../OTHER/Data-entities)
- [Security configuration](../OTHER/Security-configuration)
- [Frequently asked questions](FAQ) - Includes example errors and recommended fixes
