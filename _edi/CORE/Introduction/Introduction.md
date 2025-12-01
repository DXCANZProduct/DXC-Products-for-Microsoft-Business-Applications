---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Introduction
This section will provide a quick overview of the Core EDI module.

## Documents
### Core EDI documents (All trading partners)

EDI contains the following documents pertaining to all Trading partners.
- **Inbound**
	- **Functional Acknowledgement** – Receive functional acknowledgement that outbound document has been received by Trading partner.
- **Outbound**
	- **Functional Acknowledgement** – Send functional acknowledgement that inbound document has been received.

Depending on licensing additional documents are available per module, view all trading partner documents [here](Trading-partners-and-documents).

## Setup
### Core setup
The following core setup is available under **EDI > Setup**:
- [Connections](../Setup/Connection-setup) - Setup the applicable ftp/ftps/sftp/azure blob connection(s)/ azure file share
- [Cleanup profile](../Setup/Cleanup-profile) - (Optional) Can be used to automatically delete staging records based on status and age days
- [Reset status](../Setup/Reset-status) - (Optional) Automatic retry by resetting Error records to Not started based on a recurrence pattern
- [EDI parameters](../Setup/EDI-parameters) - Refresh module after deployment, and other parameter setup
- [EDI shared parameters](../Setup/EDI-shared-parameters) - Setup shared parameters
- [UOM mapping](../Setup/UOM-mapping) - Create unit of measure mappings that can be assigned on applicable trading partners, for example kgs to kg
- [Document type mapping](../Setup/Document-type-mapping) - (Optional) Document type mapping for functional acknowledgement documents
- [Document types](../Setup/Document-types) - Setup document templates, setting profiles, validation profiles, outbound filenames and field metadata for all applicable documents
- [Trading partners](../Setup/Trading-partners) - Setup trading partners and assign the applicable mappings and documents
- [EDI Batches](../Setup/EDI-Batches) - Enable batches for all the EDI steps

## Processing

### Import files
Ability to manually import or review inbound files
- [Inbound files](../Managing-files/Inbound-files) - View and/or manually process importing of files and processing to staging.

### Export files
Ability to manually export or review outbound files
- [Outbound files](../Managing-files/Outbound-files) - View and/or manually process exporting of files.

[Process overview for import and export](Process-overview) of EDI documents.

### Archive file attachments and Delete records
- [Archive file queue](../Managing-files/Archiving-files) - Ability to periodically archive document handling attachments for inbound and outbound files
- [Cleanup profile](../Setup/Cleanup-profile) - Can be used to automatically delete staging records based on status and age days

### Automatically reset error records
- [Reset status](../Setup/Reset-status#retryreset-process) - Optional automatic retry by resetting Error records to Not started based on a recurrence pattern

### EDI Core documents
Review staging records. <br>
Users can access the forms by navigating to **EDI > Documents**
- [Functional acknowledgement inbound](../Documents/Functional-acknowledgement-inbound)
- [Functional acknowledgement outbound](../Documents/Functional-acknowledgement-outbound)

### Workspaces
The following workspaces are available in core EDI and will contain a tab per licensed module:
- [EDI Document maintenance](../Workspaces/EDI-Document-maintenance-workspace) - Manage file import and staging record errors. These records have not been successfully processed to a target D365 document

## Inquiries
The following is available for Core EDI by navigating to **EDI > Inquiries and reports**:
- [Functional acknowledgement received](../Inquiries/Functional-acknowledgement-received) - Provides a view of outgoing documents where the Inbound functional acknowledgement is outstanding
- [Trading partner documents](../Inquiries/Trading-partner-documents) - List of all EDI Trading partners and their enabled document types

## Other
- [Data entities](../Other/Data-entities) - Core data entities 
- [Security configuration](../Other/Security-configuration) - EDI security roles
- [Frequently asked questions](../Other/FAQ) - Includes example errors and recommended fixes
