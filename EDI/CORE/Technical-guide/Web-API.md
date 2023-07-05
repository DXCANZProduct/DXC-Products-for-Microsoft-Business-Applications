---
# required metadata

title: EDI
description: Technical guide - Web API
author: jdutoit2
manager: Kym Parker
ms.date: 2023-07-06
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconEDI
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Technical guide - Web API

Two service endpoints are exposed as part of the EDI solution. <br>
Service group name: SAB_EDIServices

- SAB_EDIInboundService
  - Allows import of files accessible via a temporary blog storage URL
  - Allows single file import
  - Allows multiple file import
  - Allows package import (zipped file)
  - Any third-party service that can process Http based client requests can be utilized
    

- SAB_EDIOutboundService
  - Allows access to export file via a temporary blog storage URL
  - Allows access to export package via a temporary blog storage URL
  - Any third-party web-based service that can be authenticated using an application Id and secret can be used to configure the Web API settings for access to export files.
    
For more details see, custom services Microsoft documentation: <br> 
https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/data-entities/services-home-page <br>
https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/data-entities/custom-services <br>

# Connection setup
The connection setup for web services need to be specified here: **EDI > Setup > Connection setup > Web API settings**
See [guide](https://dxcanzproduct.github.io/DXC-Products-for-Microsoft-Business-Applications/EDI/CORE/Setup/Connection-setup.html#web-services) for more details.

# Inbound services
The EDI module exposes various functions to send files into the inbound staging area for processing. <br>
For each integration, the **SAB_EDIExternalWebServiceIncoming** class needs to be implemented to specify the logic for where the file can be downloaded from or for any specific requirements and mappings needed for the document type processing. <br>

This requires the web api settings for connection details.


![Inbound services](../Image/Web-API-inbound-services.png "Inbound services")

### GetAzureWriteUrl

**GET /api/Services/SAB_EDIServices/SAB_EDIInboundService/GetAzureWriteUrl**

Retrieves a writable Azure URL to upload a file for reading into D365. <br>
This requires an input parameter for the name of the file. This can be any file type that is supported and configured for EDI document types. <br>
This request will return a single URL end point. <br>
This endpoint utilizes the same underlying framework as data management to generate a temporary blob storage URL. <br>

Example: https://xx.blob.core.windows.net/dmf/text.xml?sv=2014-02-14&sr=b&sig=OoMCuQnQqOVgM5gpw8HNqeuGlApBSta3IPCU99uOnYI%3D&st=2023-07-04T06%3A26%3A04Z&se=2023-07-04T07%3A01%3A04Z&sp=rw

##### Request

Name 	          | Type	        | Description
:--             |:--            |:--
uniqueFileName	| String	      | **Required** The name of the file

Sample: <br>
application/json, text/json <br>
{ <br>
  "uniqueFileName": "exampleFile.xml" <br>
}

##### Response

Name 	          | Type	        | Description
:--             |:--            |:--
AzureWriteId	  | GUID	        | A unique identifier
AzureWriteUrl	  | String	      | An Azure writable URL

Sample: <br>
application/json, text/json <br>
{ <br>
  "AzureWriteId": "8e59a2ba-ca6f-4d14-bafa-28e49c6528c9", <br>
  "AzureWriteUrl": "<span>https://</span>XXXX.blob.core.windows.net/dmf/exampleFile" <br>
}

 
### AddFileToQueue (Single files)
**GET /api/Services/SAB_EDIServices/SAB_EDIInboundService/AddFileToQueue**

A request to this endpoint allows import of single files. This uses the same functionality to process the import as the Inbound files in EDI.
Parameters to add a single file into the inbound file queue

##### Request

Name 	          | Type	        | Description
:--             |:--            |:--
**AddFileToQueueContract**		  |   |  
AzureWriteUrl	  | String	      | **Required** The azure blob storage URL of the file. File for the import. <br> A request to the GetAzureWriteUrl can be made to get access to the temporary blob storage URL. <br> This can be populated with the data required using any third-party web API that supports URL based file reading and writing and processing URL based request. 
DocumentType	  | String	      | **Required** The EDI Document type the file relates to. <br> This determines the document type for import within EDI. The name should correspond against the document type name configured in EDI. <br> For example, Customer purchase order
TradingPartnerCompanyId	| String	| **Required** The legal entity the file relates to. The company in which file must be imported. This should be based on the configuration in EDI trading partners. 
TradingPartnerId | String	      | **Required** Trading partner Id as configured in EDI trading partners
TradingPartnerType	| String	  | **Required** The trading partner type as configured in EDI trading partners, for example, Customer
FileName	       | String	      | **Required** The name of the file for import

Sample: <br>
application/json, text/json <br>

{ <br>
  "AddFileToQueueContract":{  <br>
    "AzureWriteUrl": "<span>https://</span>XXXX.blob.core.windows.net/dmf/exampleFile", <br>
    "DocumentType": "Customer purchase order", <br>
    "FileName": "ExampleFile001.xml", <br>
    "TradingPartnerCompanyId": "USMF", <br>
    "TradingPartnerId": "GLN00001", <br>
    "TradingPartnerType": "Customer" <br>
  } <br>
}

This endpoint returns the status of import, error message (if any), name of file and the reference number for the import. 

##### Response

Name 	          | Type	        | Description
:--               |:--                  |:--
Reference	  | Long	        | Unique identifier of the added file
ErrorMsg	  | String	        | Any error message generated
Success	          | Boolean	        | Whether the add was successful
FileName	  | String	        | Filename

Sample: <br>
application/json, text/json <br>
{ <br>
  "Reference": "65468431638", <br>
  "ErrorMsg": "", <br>
  "Success": true, <br>
  "FileName": “ExampleFile001.xml”  <br>
}
 
#### GetStatus
**GET /api/Services/SAB_EDIServices/SAB_EDIInboundService/GetStatus**

A function to retrieve the status of a queued inbound file. It also has the ability to provide information on the processed document’s status if the inbound file has been processed.

##### Request

Name 	          | Type	        | Description
:--             |:--            |:--
reference	      | Long	        | **Required** Unique identifier of the file
includeStagingStatus	| Boolean	| **Required** also return the status of the staging record if processed

Sample: <br>
application/json, text/json <br>
{ <br>
  "reference": "65468431638", <br>
  "includeStagingStatus": true <br>
}

##### Response

Name 	        | Type	        | Description
:--             |:--            |:--
Status		| String	| The status of the file
ProcessedDateTime	| UTC Date time		| The date time the file was processed
ProcessedDocumentId	| String		| The processed file’s EDI Id
processedDocumentStatus	| String		| The processed files status

Sample: <br>
application/json, text/json <br>
{ <br>
  "Status": "Processed", <br>
  "ProcessedDateTime": "1900-01-01T00:00:00Z", <br>
  "ProcessedDocumentId": "", <br>
  "processedDocumentStatus": "Not started"  <br>
}

 
### AddFilesToQueue (list of files)
**GET /api/Services/SAB_EDIServices/SAB_EDIInboundService/AddFilesToQueue**

A collection of AddFileToQueueContract parameters

##### Request

Name 	          | Type	        | Description
:--             |:--            |:--
**AddFileToQueueContracts**		|	|
AzureWriteUrl			| String	| **Required** The azure blob storage URL of the file
DocumentType			| String	| **Required** The EDI Document type the file relates to
TradingPartnerCompanyId		| String	| **Required** The legal entity the file relates to
TradingPartnerId		| String	| **Required** The trading partner GLN the file relates to
TradingPartnerType		| String	| **Required** The Trading partner type the file relates to
FileName			| String	| **Required** The name of the file

Sample: <br>
application/json, text/json <br>

{ <br>
  "AddFileToQueueContracts": [{ <br>
    "AzureWriteUrl": "<span>https://</span>XXXX.blob.core.windows.net/dmf/exampleFile", <br>
    "DocumentType": "Customer purchase order", <br>
    "FileName": "ExampleFile001.xml", <br>
    "TradingPartnerCompanyId": "USMF", <br>
    "TradingPartnerId": "GLN00001", <br>
    "TradingPartnerType": "Customer" <br>
  },  <br>
  { <br>
    "AzureWriteUrl": "<span>https://</span>XXXX.blob.core.windows.net/dmf/exampleFile02", <br>
    "DocumentType": "Customer purchase order", <br>
    "FileName": "ExampleFile002.xml", <br>
    "TradingPartnerCompanyId": "USMF", <br>
    "TradingPartnerId": "GLN00001", <br>
    "TradingPartnerType": "Customer" <br>
    } <br>
  ] <br>
}

##### Response

Name 	          | Type	        | Description
:--             |:--            |:--
Reference	| Long		| Unique identifier of the added file
ErrorMsg	| String	| Any error message generated
Success		| Boolean	| Whether the add was successful
FileName	| String	| Filename


Sample: <br>
application/json, text/json <br>
\[ <br>
  { <br>
    "Reference": 6546813513, <br>
    "ErrorMsg": "", <br>
    "Success": true, <br>
    "FileName": “ExampleFile001.xml” <br>
  }, <br>
  { <br>
    "Reference": 6413813168, <br>
    "ErrorMsg": "", <br>
    "Success": true, <br>
    "FileName": “ExampleFile002.xml” <br>
  } <br>
]


### AddFileToQueue_package
**GET /api/Services/SAB_EDIServices/SAB_EDIInboundService/AddFileToQueue_package**

A function to push a data package which will be extracted and its contents put into the inbound file queue.

##### Data package
The data package is a zip file that includes a ‘manifest.xml’ xml file. The manifest file defines the files within the data package in the following XML structure

\<Documents> <br>
  \<Document>		 <br>
    \<DocumentType/> <br>
    \<FileName/> <br>
    \<TradingPartnerCompanyId/> <br>
    \<TradingPartnerId/> <br>
    \<TradingPartnerType/> <br>
  \</Document> <br>
\</Documents>	 <br>

Name 	           | Type	        | Description
:--                |:--                  |:--
DocumentType	   | String		| **Required** The EDI Document type the file relates to
TradingPartnerCompanyId	| String	| **Required** The legal entity the file relates to
TradingPartnerId   | String		| **Required** The trading partner GLN the file relates to
TradingPartnerType | String		| **Required** The Trading partner type the file relates to
FileName	   | String		| **Required** The name of the file


Sample: <br>
\<?xml version="1.0" encoding="utf-8"?> <br>
\<Documents> <br>
  \<Document>		 <br>
    \<DocumentType>PO\</DocumentType> <br>
    \<FileName>FileUpload_01.xml\</FileName> <br>
    \<TradingPartnerCompanyId>USMF\</TradingPartnerCompanyId> <br>
    \<TradingPartnerId>GLN00001\</TradingPartnerId> <br>
    \<TradingPartnerType>Customer\</TradingPartnerType> <br>
  \</Document> <br>
  \<Document>		 <br>
    \<DocumentType>PO\</DocumentType> <br>
    \<FileName>FileUpload_02.xml\</FileName> <br>
    \<TradingPartnerCompanyId>USMF\</TradingPartnerCompanyId> <br>
    \<TradingPartnerId>GLN00001\</TradingPartnerId> <br>
    \<TradingPartnerType>Customer\</TradingPartnerType> <br>
  \</Document> <br>
\</Documents> <br>

##### Request

Name 	        | Type	        | Description
:--             |:--            |:--
azureWriteUrl	| String	| **Required** The azure blob storage URL of the data package

Sample: <br>
application/json, text/json <br>
{ <br>
  " azureWriteUrl ": "<span>https://</span>XXXX.blob.core.windows.net/dmf/exampleDataPackage" <br>
}

##### Response
A collection of results

Name 	          | Type	        | Description
:--             |:--            |:--
Reference	| Long		| Unique identifier of the added file
ErrorMsg	| String	| Any error message generated
Success		| Boolean	| Whether the add was successful
FileName	| String	| Filename

Sample: <br>
application/json, text/json <br>
\[ <br>
  { <br>
    "Reference": 6546813513, <br>
    "ErrorMsg": "", <br>
    "Success": true, <br>
    "FileName": “ExampleFile001.xml” <br>
  }, <br>
  { <br>
    "Reference": 6413813168, <br>
    "ErrorMsg": "", <br>
    "Success": true, <br>
    "FileName": “ExampleFile002.xml” <br>
  } <br>
] <br>

# Outbound services
The EDI module exposes various functions to pull files from the outbound staging area for download.

An oData feed of the outbound file queue (/data/SAB_EDIFileExport) is available for discovering the outbound queued file references.

### GetFileDetailFromQueue
###### Request

Name 	          | Type	        | Description
:--               |:--                  |:--
reference	  | Long		| **Required** The reference of the queued file

Sample: <br>
application/json, text/json <br>
{ <br>
  "reference": 61684163581 <br>
} <br>

##### Response

Name 	          | Type	        | Description
:--               |:--                  |:--
FileName	  | String		| The filename
Reference	  | Long		| The reference of the file
AzureUrl	  | String		| The URL of the file for download

Sample: <br>
application/json, text/json <br>
{ <br>
  "FileName": "packageDownload.zip", <br>
  "Reference": 61684163581, <br>
  "AzureUrl": "<span>https://</span>icondev803825a2135bfabe1.blob.core.windows.net/edi/exampleFile001.zip" <br>
}

 
### GetFileDetailFromQueue_Package
##### Request

Name 	         | Type	        | Description
:--              |:--           |:--
packageFileName	 | String	| **Required** The name of the package to be created
References	 | Collection of longs	| **Required** The reference of the queued file

Sample: <br>
application/json, text/json <br>
{ <br>
  "packageFileName" : "packageDownload.zip", <br>
  "references": [5637149076, 5637149076] <br>
} 

##### Response

Name 	        | Type	        | Description
:--             |:--            |:--
FileName	| String	| The filename
AzureUrl	| String	| The URL of the file for download

Sample: <br>
application/json, text/json <br>
{ <br>
  "FileName": "packageDownload.zip", <br>
  "AzureUrl": "<span>https://</span>icondev803825a2135bfabe1.blob.core.windows.net/edi/exampleFile001.zip" <br>
}

##### Data package
The data package is a zip file that includes a ‘manifest.xml’ xml file. The manifest file defines the files within the data package in the following XML structure

\<Documents> <br>
  \<Document>		 <br>
    \<DocumentType/> <br>
    \<FileName/> <br>
    \<TradingPartnerCompanyId/> <br>
    \<TradingPartnerId/> <br>
    \<TradingPartnerType/> <br>
  \</Document> <br>
\</Documents>	 <br>

Name 	          | Type	        | Description
:--             |:--            	|:--
DocumentType	| String		| **Required** The EDI Document type the file relates to
TradingPartnerCompanyId	| String	| **Required** The legal entity the file relates to
TradingPartnerId	| String	| **Required** The trading partner GLN the file relates to
TradingPartnerType	| String	| **Required** The Trading partner type the file relates to
FileName		| String	| **Required** The name of the file

Sample: <br>
\<?xml version="1.0" encoding="utf-8"?> <br>
\<Documents> <br>
  \<Document>		 <br>
    \<DocumentType>PO\</DocumentType> <br>
    \<FileName>FileUpload_01.xml\</FileName> <br>
    \<TradingPartnerCompanyId>USMF\</TradingPartnerCompanyId> <br>
    \<TradingPartnerId>GLN00001\</TradingPartnerId> <br>
    \<TradingPartnerType>Customer\</TradingPartnerType> <br>
  \</Document> <br>
  \<Document>		 <br>
    \<DocumentType>PO\</DocumentType> <br>
    \<FileName>FileUpload_02.xml\</FileName> <br>
    \<TradingPartnerCompanyId>USMF\</TradingPartnerCompanyId> <br>
    \<TradingPartnerId>GLN00001\</TradingPartnerId> <br>
    \<TradingPartnerType>Customer\</TradingPartnerType> <br>
  \</Document> <br>
\</Documents> <br>
