# DXC Electronic Data Interchange (EDI) - Technical Guide

The DXC EDI module provides enhanced functionalities to Microsoft Dynamics 365 for Finance and Operations (FinOps). This guide provides an overview of the technical requirements for making extensions to specific features.

## EDI module library for D365 FSCM
### Enums
For more information on the enums for DXC EDI and it's related modules, refer to the Application Explorer (AOT) within a D365 FSCM development environment.  

|Element| Description|
|--|--|
|SAB_EDIDocumentType||
|SAB_EDIDocumentTypeHierarchyType||


### Classes
For more information please reach out to the support team.

|Element| Description|
|--|--|
|[SAB_EDIDocumentSettingsContract](#sab_edidocumentsettingscontract-1)|Abstract class for document settings profile parameters|
|[SAB_EDIDocumentSettingsDialogService](#sab_edidocumentsettingsdialogservice)|Abstract class for document settings profile dialog|
|[SAB_EDIDocumentSettingsUIBuilder](#sab_edidocumentsettingsuibuilder)|UI builder class for document settings profile dialog UI|
|[SAB_EDIDocumentTypeClass](#sab_edidocumenttypeclass)| Abstract class for implement EDI document types. |
|SAB_EDIDocumentTypeFactoryAttribute|Attribute class for EDI document type, [SAB_EDIDocumentType](#enums)|
|[SAB_EDIStagingFormClass](#sab_edistagingformclass)|Abstract class for staging forms for document types|
|[SAB_EDIProcessor](#sab_ediprocessor)|Contains logic for processing inbound documents|
|[SAB_EDIProcessor_PicklistRegistration](#sab_ediprocessor_picklistregistration)|Performs the core process of picking list registration inbound document import |
|[SAB_EDIOutboundStagingWriter](#sab_edistagingoutboundwriter)|Abstract class for processing outbound documents|
|[SAB_EDIXSDGenerator](#sab_edixsdgenerator)||
|[SAB_EDIXSDGeneratorSchemaItem](#sab_edixsdgeneratorschemaitem)||

#### SAB_EDIDocumentSettingsContract  
Definition for class SAB_EDIDocumentSettingsContract

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Non-access modifier__| abstract|
|__Source__| SAB_EDIDocumentSettingsContract.xpp |  

__Properties__  
Properties for class SAB_EDIDocumentSettingsContract  

|Data type| Name| 
|--|--|
|SAB_EDIDocumentSettingsProfileRefRecId|profile|


__Methods__  
Methods for class SAB_EDIDocumentSettingsContract  

|Name|Returns|Description|
|--|--|--|
|constructBasedOnDocumentType(SAB_EDIDocumentType, boolean _throwErrorOnNotFound = false |SAB_EDIDocumentSettingsContract||
|create(SAB_EDIDocumentSettingsProfile)|SAB_EDIDocumentSettingsContract||
|findOrInitBufferForUpdate|Common||
|getProfileFieldId|FieldId|Abstract method to return the field id for the document type's profile settings table foreign key record Id|
|getPprofileTableId|TableId|Abstract method to return the table id for the profile settings table|
|initContractParent(SAB_EDIDocumentSettingsProfile)|void||
|serviceClassStr|IdentifierName|Abstract method to return the name of your dialog service class example, classStr(SAB_EDIDocumentSettingsDialogService_InboundExample)|
|serviceMethodStr|IdentifierName|Abstract method to return the name of your dialog service run method, example, methodStr(SAB_EDIDocumentSettingsDialogService_InboundExample, run)|

#### SAB_EDIDocumentSettingsDialogService  
For more information please reach out to the support team.  

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Non-access modifier__| abstract|
|__Source__| SAB_EDIDocumentSettingsDialogService.xpp |


__Methods__  

Methods for class SAB_EDIDocumentSettingsDialogService  

|Name|Returns|Description|
|--|--|--|
|saveSettings(SAB_EDIDocumentSettingsContract) |final void|Saves the contract settings|

#### SAB_EDIDocumentSettingsUIBuilder
For more information please reach out to the support team.  

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Extends__| SysOperationAutomaticUIBuilder|
|__Source__| SAB_EDIDocumentSettingsUIBuilder.xpp |


#### SAB_EDIDocumentTypeClass
For more information please reach out to the support team.  

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Non-access modifier__| abstract|
|__Source__| SAB_EDIDocumentTypeClass.xpp | 

__Constructors__  
| Method | Description|
| -- | -- |
|||


|  Method | Description  |
| -- | -- | 
| new() | Initializes a new instance of SAB_EDIDocumentTypeClass class. |

__Properties__  
| Data type| Name|
|--|--|  
|SAB_EDIDocumentTypeTable| documentTypeTable  |
|SAB_EDIDocumentType| documentType |
|UnknownNoYes| featureEnaled |
|Map|documentTypeEnabledMap|

__Methods__  
Methods for class SAB_EDIDocumentTypeClass  
|Name|Returns|Description|
|--|--|--|
|allowDuplicateStagingSourceDocs| boolean | The allowDuplicateStagingSourceDocs returns boolean flag to indicate if the document type allows duplicate staging source documents.|
|documentDescription| [SAB_EDIDocumentTypeDescription](#edts)| The documentDescription returns the description for the document|
|documentDirection| [SAB_EDIDocumentDirection](#enums) | The documentDirection returns the document direction, for example, incoming or outgoing|
|documentHierarchyPath| List | The documentHierarchyPath returns a list of the hierarchy path for the document, populated using the enum, SAB_EDIDocumentTypeHierarchyType|
|documentName|[SAB_EDIDocumentTypeTableName](#edts)|The documentName returns the name of the document|
|documentRootNodeName| str | The documentRootNodeName returns the root node name, for example Product_Master. Note: this should not have any spaces|
|processMenuItemSingle|str|The processMenuItemSingle returns the menu item action string for processing single document |
|processMenuItem| str | The processMenuItem returns the menu item action string for processing multiple documents|
|stagingHeaderFromCommon(Common)|[SAB_EDIStagingHeader](#sab_edistagingheader)|The stagingHeaderFromCommon returns the staging header record|
|stagingHeaderKeyFields| container| The stagingHeaderKeyFields returns a container (fieldNum) with all fields that are to be used as key for the staging data|
|stagingHeaderTransferStatusFieldId|FieldId|The stagingHeaderTransferStatusFieldId returns the transfer status field id from the header table |
|stagingLineFromCommon(Common)|[SAB_EDIStagingLine](#sab_edistagingline)|The stagingLineFromCommon returns the staging line record|
|tableIdHeader|TableId|The tableIdHeader returns the table Id for the EDI document header table|
|tableIdLine|TableId|The tableIdLine returns the table Id for the EDI document line table|
|tableIdTradingPartnerDefault|TableId|The tableIdTradingPartnerDefault returns the table id of the trading partner defaulting table|

#### SAB_EDIStagingFormClass
For more information please reach out to the support team.  

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Non-access modifier__| abstract|
|__Source__| SAB_EDIStagingFormClass.xpp |

__Methods__
Methods for class SAB_EDIStagingFormClass  
|Name|Returns|Description|
|--|--|--|
|DocumentType|SAB_EDIDocumentType| The DocumentType returns the document type enum value, SAB_EDIDocumentType(#enums)|
|HeaderIdentificationFieldGroups| List | The HeaderIdentificationFieldGroups returns a list of field groups that contains field for identifying the header|
|lineViewGridFieldGroup|str| The lineViewGridFieldGroup returns the tableFieldGroupStr of the field group that comprises of all data required to be displayed in the line grid in the details view|
|LinesHeaderFieldGroups|List|The LinesHeaderFieldGroups returns the list of table field groups that needs to be displayed within the lines header tab within the staging form.|
|mainGridFieldGroup|str|The mainGridFieldGroup the tableFieldGroupStr of the field group that comprises of all data required to be displayed on the main grid of the staging form|

#### SAB_EDIProcessor
For more information please reach out to the support team.  

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Non-access modifier__| abstract|
|__Source__| SAB_EDIProcessor.xpp |

__Properties__  
Properties for class SAB_EDIProcessor  
|Data type| Name|
|--|--|
|SAB_EDIStagingHeader|ediStagingHeader|
|RecId|stagingTableRecId|
|SAB_EDIDocumentType|documentType|
|SAB_EDIDocumentTypeClass|documentTypeClass|
|SAB_EDITradingPartner|tradingPartner|
|NoYes|overrideError|

__Methods__  
Methods for class SAB_EDIProcessor  
|Name|Returns|Description|
|--|--|--|
|initDocument|void|Abstract method to initialize variables for document processing |
|process|void|Abstract method to perform all logic required to process inbound document|
|postProcess|void|Abstract method to perform any additional logic after document has been processed |

#### SAB_EDIProcessor_PicklistRegistration
For more information please reach out to the support team.  

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Extends__| SAB_EDIProcessor_3PL|
|__Source__| SAB_EDIProcessor_PicklistRegistration.xpp |


__Properties__  
Properties for class SAB_EDIProcessor_PicklistRegistration  
|Data type|Name|
|--|--|
|SAB_EDIPicklistRegistrationStaging|stagingCaller|
|SAB_EDIDocumentSettingsContract_PicklistRegistration|

__Methods__
Methods for class SAB_EDIProcessor_PicklistRegistration
|Name|Returns|Description|
|--|--|--|
|processPackingSlip(WMSPickingRouteSAB_EDIWMSPickingRouteExt| void | Processes packing slip based on transType of the picking route.  Sales - Executes processPackingSlip_salesOrder. TransferOrderShip - Executes processShipTransferOrder. Default - Executes delegate processPackingSlip_delegate |
|processPackingSlip_delegate(WMSPickingRoute, SAB_EDIDocumentSettingsContract_PicklistRegistration, EventHandlerAcceptResult) |void|
|processPackingSlip_salesOrder(WMSPickingRoute)|void|Process sales order|
|processShipTransferOrder(WMSPickingRoute)|void|Process transfer order|

#### SAB_EDIOutboundStagingWriter
For more information please reach out to the support team.

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Non-access modifier__| abstract|
|__Source__| SAB_EDIOutboundStagingWriter.xpp |

__Properties__
Properties for class SAB_EDIOutboundStagingWriter
|Data type| Name|
|--|--|
|QueryRun|queryRun|
|Common|sourceBuffer|
|SAB_EDIDocumentType|documentType|
|SAB_EDIDocumentTypeClass|documentTypeClass|
|TableId|queryRunTableIdHeader|
|TableId|queryRunTableIdLine|
|TableId|sourceTableIdLine|
|SAB_EDIStagingHeader|stagingHeaderCurrent|
|SAB_EDIStagingLine|stagingLineCurrent|
|SAB_EDITradingPartner|tradingPartnerBuffer|
|SAB_EDITradingPartner|headerCount|
|boolean|isDocumentHasLines|
|SAB_EDILineNum|ediLineNumber|

__Methods__
Methods for class SAB_EDIOutboundStagingWriter
|Name|Returns|Description|
|--|--|--|
|caption|str|Name of the document|
|composeStagingHeader(Common)|SAB_EDIStagingHeader|Populate data within your staging table for export|
|composeStagingLine(Common,SAB_EDIStagingLine, queryRun)|SAB_EDIStagingLine|Populate data within your staging table for export|
|initQueryRun| void | Initialize  | Initializes queryRun |
|initQueryRunFromBuffer|void| Initializes queryRun from sourceBuffer|  
|sourceTableIdHeader| TableId | Returns the table Id for the source table |
|sourceTableIdLine| TableId | Returns the table Id for the source line table |
|tradingPartnerFromSourceHeader(Common)|SAB_EDITradingPartner | Returns the trading partner record |
|tradingPartnerTableId|TableId | Returns the table Id for the trading partner |

### SAB_EDIXSDGenerator
For more information please reach out to the support team.

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Source__| SAB_EDIXSDGenerator.xpp |

__Properties__
Properties for class SAB_EDIXSDGenerator
|Data type|Name|
|--|--|
|System.Xml.Schema.XmlSchema|schema|
|SAB_EDITemplate|template|
|SAB_EDIXSDGeneratorSchemaItem|currentSchemaItem|
|SAB_EDIITemplateTreeNode|templateRootNode|

__Methods__
Methods for class SAB_EDIXSDGenerator
|Name|Returns|Description|
|--|--|--|
|init|boolean||
|writeStartSection(Name _sectionName, TableId _staginTableId, int64 _sectionId)|void||
|createElement||Has been moved to [SAB_EDIXSDGeneratorSchemaItem](#sab_edixsdgeneratorschemaitem)| 

#### SAB_EDIXSDGeneratorSchemaItem
For more information please reach out to the support team.

| Definition| Description|
|--|--|  
|__Access modifier__| public  |
|__Source__| SAB_EDIXSDGeneratorSchemaItem.xpp |


__Methods__
Methods for class SAB_EDIXSDGeneratorSchemaItem
|Name|Returns|Description|
|--|--|--|
|createElement(SAB_EDIField _ediField)|System.Xml.Schema.XmlSchemaElement||

### Maps

|Element|Description|
|--|--|
|[SAB_EDIStagingHeader](#sab_edistagingheader)| Contains all fields required to be present within an EDI staging header table|
|[SAB_EDIStagingLine](#sab_edistagingline)|Contains all fields required to be present within an EDI staging line table|

#### SAB_EDIStagingHeader
For more information please reach out to the support team.
__Methods__
Methods for map SAB_EDIStagingHeader
|Name|Returns|Description|
|--|--|--|
|newStagingHeader(SAB_EDIDocumentType)|SAB_EDIStagingHeader|The newStagingHeader returns staging header record based on the document type |
|updateTransferStatus(RecId, SAB_EDIDocumentType, SAB_EDITransferStatus)|SAB_EDIStagingHeader|The updateTransferStatus updates transfer status for the staging header record for the specified document type.|
|isFileImportedBefore(SAB_EDIFileImport) | boolean | The isFileImportedBefore returns boolean flag to indicate is the file has already been imported or not.|
|initFromFileImport(SAB_EDIFileImport)|void|The initFromFileImport initializes the file import|
|initFromEDITradingPartner(SAB_EDITradingPartner)|void|The initFromEDITradingPartner initializes the trading partner fields for the staging header table| 
|ediTradingPartner|SAB_EDITradingPartner|The ediTradingPartner returns the EDI trading partner record|
|name|Name|The name returns the trading partner name|
|accountNum| SAB_EDITradingPartnerAccount | The accountNum returns the trading partner account |
|documentType|SAB_EDIDocumentType|The documentType returns the document type of the EDI staging header record|
|resetStatus|void|The resetStatus resets the status of the document to not started|
|canResetStatus|canBeCancelled|The canResetStatus returns a boolean flag to indicate if the document status can be reset or not|
|canBeCancelled|boolean||
|cancel|boolean||
|functionalAckSentToEDI|SAB_EDISentToEDI||
|getNextLineNum|SAB_EDIStagingLineNum||
|findByEdiId(SAB_EDIDocumentType, SAB_EDIId, boolean forUpdate)|SAB_EDIStagingHeader||
|documentSettingsExistByTradingPartner(SAB_EDIDocumentType, RefRecId, RefTableId)|boolean||
|documentSettingsExist|boolean||
|documentSettings(boolean silent)|SAB_EDIDocumentSettingsContract||
|validationProfile|SAB_EDIValidationProfileRecId||
|getStagingHeaderQuery(SAB_EDIDocumentTypeClass)|Query||


#### SAB_EDIStagingLine
For more information please reach out to the support team.
__Methods__
Methods for map SAB_EDIStagingLine

|Name|Returns|Description|
|--|--|--|
|initFromEDIStagingHeader|void|The initFromEDIStagingHeader initializes EDI Id and EDI line number for the staging line from the header record|
