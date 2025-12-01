---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL setup
This section provides a short overview of the required prequisites for setting up EDI for 3PL warehouses. <br>

## Trading partner
The Trading partner fields are used to describe how the prequisites setups are allocated to an EDI 3PL warehouse. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners** <br>

3PL Trading Partner Setup - Quick Summary:

**Setup** 	                      | **Short description**                 | **Setup path**
:-------------------------------- |:------------------------------------- |:-------------------------------------
<ins>**Options**</ins>		        |
**Connection profile**            |	Ability to override the default EDI connection profile on Trading partner level. If blank, default EDI connection will be used. Default EDI connection is determined by: <br> • Outgoing documents: Connection profile setup on [EDI > Setup > EDI parameters](../../CORE/Setup/EDI-parameters) <br> • Incoming documents: All active connection incoming paths as setup in [Connections](../../CORE/Setup/Connection-setup). | [EDI > Setup > Connection setup](../../CORE/Setup/Connection-setup)
**Cleanup profile**	              | Ability to override the default Cleanup profile (setup on Shared EDI parameters) on Trading partner level. If blank, default Cleanup profile will be used as setup on [EDI > Setup > EDI shared parameters](../../CORE/Setup/EDI-shared-parameters) | [EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile)
<ins>**Order**</ins>	            |
**Inventory journal name mapping**  |	Ability to specify 3PL’s mapped value for Movement journals. If not sent by 3PL, the default movement will be used	| [EDI > 3PL setup > Inventory journal name mapping](3PL-SETUP/Inventory-journal-name-mapping)
**Inventory status Id mapping**   | Categorize inventory	  | [EDI > 3PL setup > Inventory status Id mapping](3PL-SETUP/Inventory-status-Id-mapping)
**Disposition code mapping**      | Specify how to process an item that is returned by a customer	  | [EDI > 3PL setup > Disposition code mapping](3PL-SETUP/Disposition-code-mapping)
**Item arrival**                  | Specify which arrival journal to use for trading partner	      | Inventory management > Setup > Journal names > Warehouse management
**Transaction code mapping**      | Indicates inventory movement direction. With **In** the quantity is used as-is, **Out** is converted to a negative quantity	| [EDI > 3PL setup > Transaction direction mapping](3PL-SETUP/Transaction-direction-mapping)
**EDI Document type**             |	Each applicable outbound document type	                                                                 | [EDI > Setup > Document types](../../CORE/Setup/Document-types)
**Template**                      |	Document type template		                                                                               | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File-templates)
**Setting profile**               |	Settings profile		                                                                                     | [Setting profiles on EDI > Setup > Document types](Setting-profiles)
**File name setup**               |	Outbound file name		                                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document-types)
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection-setup) on document level. If blank, the trading partner’s Connection profile will be used. |	[EDI > Setup > Connection setup](../../CORE/Setup/Connection-setup)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup-profile) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI-shared-parameters) will be used.  |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile)
**Acknowledgement**	              | An Inbound Functional Acknowledgement is required from the trading partner for the outgoing document. Note: Also required to setup the Functional acknowledgement inbound document under Incoming documents.  |	Y/N
**Enabled**                       | Ability to enable/disable document type for Trading partner	| Y/N
<ins>**Incoming documents**</ins> |	It brings the document template, mappings, settings profile, validation and filename mask together to enable the document for the trading partner
**EDI Document type**             |	Each applicable inbound document type	                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document-types)
**Template**                      |	Document type templates defined for the document type                                                    | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File-templates)
**Setting profile**               |	Settings profiles defined for the document type                                                          | [Setting profiles on EDI > Setup > Document types](Setting-profiles)
**Validation profile**            | Validation profiles defined for the document type		                                                     | [EDI > Setup > Document types](Validation-profiles)
**Search mask**                   |	A file mask is used to match files in the document type’s defined directories	
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection-setup) on document level. If blank, the trading partner’s Connection profile will be used.   | [EDI > Setup > Document types](../../CORE/Setup/Connection-setup)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup-profile) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI-shared-parameters) will be used. |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile)
**Acknowledgement**	              | Trading partner requires an Outbound Functional Acknowledgement for the incoming document. Note: Also required to setup the Functional acknowledgement outbound document under Outgoing documents.  | Y/N
**Enabled**                       |	Ability to enable/disable document type for Trading partner	                                              | Y/N

