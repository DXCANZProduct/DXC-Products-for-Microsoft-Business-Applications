---
# required metadata

title: EDI Freight forwarder
description: EDI Freight forwarder Setup
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-23
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_EDIDocumentTypeTable, SAB_EDIParameters, SAB_EDISharedParameters, SAB_EDIFFLCShipPortTableMapping, SAB_EDIFFLCVendDlvModeMapping, SAB_EDIFFLCCustomsBrokerMapping, SAB_EDIFFLCShipContainerTypeMapping, SAB_EDIFFLCShipActivityTableMapping, SAB_EDIFFLCShipPortQualifierMapping, SAB_EDIFFLCShipMeasurementUnitMapping, SAB_EDICleanupProfile, SAB_EDITradingPartner
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:  2016-05-31
ms.dyn365.ops.version: AX 7.0.1

---

# Freight forwarder landed cost setup
This section provides a short overview of the required prequisites for setting up EDI for Freight forwarder landed cost. <br>

## Trading partner
The Trading partner fields are used to describe how the prequisites setups are allocated to an EDI Freight forwarder landed cost. <br>
Users can access the form by navigating to **EDI > Setup > Trading partners** <br>

Trading Partner Setup - Quick Summary:

**Setup** 	                      | **Short description**                 | **Setup path**
:-------------------------------- |:------------------------------------- |:-------------------------------------
<ins>**Options**</ins>		        |
**Connection profile**            |	Ability to override the default EDI connection profile on Trading partner level. If blank, default EDI connection will be used. Default EDI connection is determined by: <br> • Outgoing documents: Connection profile setup on [EDI > Setup > EDI parameters](../../CORE/Setup/EDI-parameters.md) <br> • Incoming documents: All active connection incoming paths as setup in [Connections](../../CORE/Setup/Connection-setup.md). | [EDI > Setup > Connection setup](../../CORE/Setup/Connection-setup.md)
**Cleanup profile**	              | Ability to override the default Cleanup profile (setup on Shared EDI parameters) on Trading partner level. If blank, default Cleanup profile will be used as setup on [EDI > Setup > EDI shared parameters](../../CORE/Setup/EDI-shared-parameters.md) | [EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile.md)
<ins>**Container mapping**</ins>  |			
**Container type**                |	Container type identifiers  | [EDI > Freight forwarder landed cost setup > Shipping container type mappings](FF-SETUP/Shipping-container-types-mapping.md)
**Measurement unit**              |	Shipping measurement unit mapping	| [EDI > Freight forwarder landed cost setup > Shipping measurement unit mapping](FF-SETUP/Shipping-measurement-unit-mapping.md)
<ins>**Journey mapping**</ins>		|
**Port**                          |	Shipping port mapping	      | [EDI > Freight forwarder landed cost setup > Shipping port mapping](FF-SETUP/Shipping-port-mapping.md)
**Port qualifier**                | Shipping port qualifier mapping	| [EDI > Freight forwarder landed cost setup > Shipping port qualifier mapping](FF-SETUP/Shipping-port-qualifier-mapping.md)
**Mode of delivery**              |	Mode of delivery mapping	  | [EDI > Freight forwarder landed cost setup > Modes of delivery mapping](FF-SETUP/Modes-of-delivery-mapping.md) 
**Activity**                      | Activity mapping	          | [EDI > Freight forwarder landed cost setup > Activity mapping](FF-SETUP/Activity-mapping.md)
<ins>**Other mappings**</ins>		  |
**Customs broker**                |	Customs broker mapping	    | [EDI > Freight forwarder landed cost setup > Customs broker mapping](FF-SETUP/Customs-broker-mapping.md)
**UOM**                           |	Unit of measure mappings for in- and outbound documents	    | [EDI > Setup > UOM mapping](../../CORE/Setup/UOM-mapping.md)
<ins>**Outgoing documents**</ins> |	It brings the document template, mappings, settings profile together to enable the document for the trading partner <br>
**EDI Document type**             |	Each applicable outbound document type	                                                                 | [EDI > Setup > Document types](../../CORE/Setup/Document-types.md)
**Template**                      |	Document type template		                                                                               | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File-templates.md)
**Setting profile**               |	Settings profile		                                                                                     | [Setting profiles on EDI > Setup > Document types](Setting-profiles.md)
**File name setup**               |	Outbound file name		                                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document-types.md)
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection-setup.md) on document level. If blank, the trading partner’s Connection profile will be used. |	[EDI > Setup > Connection setup](../../CORE/Setup/Connection-setup.md)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup-profile.md) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI-shared-parameters.md) will be used.  |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile.md)
**Acknowledgement**	              | An Inbound Functional Acknowledgement is required from the trading partner for the outgoing document. Note: Also required to setup the Functional acknowledgement inbound document under Incoming documents.  |	Y/N
**Enabled**                       | Ability to enable/disable document type for Trading partner	| Y/N
<ins>**Incoming documents**</ins> |	It brings the document template, mappings, settings profile, validation and filename mask together to enable the document for the trading partner
**EDI Document type**             |	Each applicable inbound document type	                                                                   | [EDI > Setup > Document types](../../CORE/Setup/Document-types.md)
**Template**                      |	Document type templates defined for the document type                                                    | [Templates on EDI > Setup > Document types](../../CORE/Setup/DocumentTypes/File-templates.md)
**Setting profile**               |	Settings profiles defined for the document type                                                          | [Setting profiles on EDI > Setup > Document types](Setting-profiles.md)
**Validation profile**            | Validation profiles defined for the document type		                                                     | [EDI > Setup > Document types](Validation-profiles.md)
**Search mask**                   |	A file mask is used to match files in the document type’s defined directories	
**Connection profile**            |	Ability to override the default [EDI connection profile](../../CORE/Setup/Connection-setup.md) on document level. If blank, the trading partner’s Connection profile will be used.   | [EDI > Setup > Document types](../../CORE/Setup/Connection-setup.md)
**Cleanup profile**               |	Ability to override the default [Cleanup profile](../../CORE/Setup/Cleanup-profile.md) on document level. If blank, the trading partner’s Cleanup profile will be used. If Trading partner's Cleanup profile is blank, the default Cleanup profile on [EDI shared parameters](../../CORE/Setup/EDI-shared-parameters.md) will be used. |	[EDI > Setup > Cleanup profile](../../CORE/Setup/Cleanup-profile.md)
**Acknowledgement**	              | Trading partner requires an Outbound Functional Acknowledgement for the incoming document. Note: Also required to setup the Functional acknowledgement outbound document under Outgoing documents.  | Y/N
**Enabled**                       |	Ability to enable/disable document type for Trading partner	                                              | Y/N


