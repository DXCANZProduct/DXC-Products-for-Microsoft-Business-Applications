---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Introduction to EDI Integrations systems
This section will provide a quick overview of the Integration systems EDI module. <br>
Integrations module is beneficial for EDI documents that are not specific to a customer, vendor or warehouse. <br>
Change tracking is used to send data based on full or changes to the tracked table(s). <br>
Examples are integrating with an online store.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- Inbound
	- Functional Acknowledgement – Receive functional acknowledgement that outbound document has been received by Trading partner.
- Outbound
	- Functional Acknowledgement – Send functional acknowledgement that inbound document has been received.

### Integrations EDI documents (Integrations license only)

EDI contains the following documents pertaining to Integration system Trading partners.
- **Outbound**
	- **Customer** - Allows D365 to send customer information using change tracking on tracked tables
	- **Customer group** - Allows D365 to send customer group information using change tracking on tracked tables

## Setup
### Core setup
Core setup is discussed in detail [here](../../CORE/Introduction/Introduction#setup)

### Integration setup

#### Integration systems Document type setup
Setup Document types which will be assigned on Integrations Trading partner. <br>
Users can access the form by navigating to **EDI > Setup > Document types**

- [File templates](../../CORE/Setup/DocumentTypes/File-templates): applicable to all document types
- [Outbound file names](../../CORE/Setup/DocumentTypes/Outbound-filenames): applicable to all outbound document types
- [Field metadata](../../CORE/Setup/DocumentTypes/Field-metadata): optionally update staging form's display name and help text per field

#### Integration systems
Integrations trading partner isn't linked to D365 customer, vendor or warehouse. <br> 
This form allows the ability to create the Integration systems account that will be used when creating the Integrations Trading partner.
 - [Integration systems](../SETUP/Integration-systems)

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

### Export batch jobs
Integration systems module utilizes the **Export batch jobs** to schedule outgoing documents.
- [Export batch jobs](../../CORE/Setup/EDI-Batches#export-batch-jobs)

### Integrations documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents > Integration systems documents**
- [Customer](../DOCUMENTS/Customer)
- [Customer group](../DOCUMENTS/Customer-group)

