---
layout: product-content
header: Finance Utilities
toc: true
---

# Technical guide - Web API Endpoint

The Web API endpoint connection allows files to processed against an external web service. This section provides details of how this can be consumed with two example, Web App and Function app.<br>

# Connection setup

The connection setup for Web API endpoint need to be specified here:

- **Financial utilities connections**  
  See [guide](../CASH-AND-BANK-MANAGEMENT/Setup/Finance-utilities-connections) for more details.
- **Electronic reporting export connections**  
  See [guide](../ELECTRONIC-REPORTING-EXPORT/Setup/Electronic-reporting-export-connections) for more details.

# Web API Types

Finance utilities can be configured to support different Web API types. The implementations available will be visible within a list accessible via the connections view.
![image](../Images/TechnicalDoc_WebAPI_Types-1.png)

The list consists of the details of the Web API types implemented for processing data.
![image](../Images/TechnicalDoc_WebAPI_Types.png)

Currently, the solution contains implementation for importing and exporting file. This has been configured to work for the following

- Bank statement import. See [guide](../CASH-AND-BANK-MANAGEMENT/Setup/Bank-statement-import)
- Customer remittance import. See [guide](../ACCOUNTS-RECEIVABLE/Setup/Customer-remittance)
- Save electronic report file to secure location. See [guide](../ELECTRONIC-REPORTING-EXPORT/Processing/Save-electronic-reporting-file-to-secure-location).

# File import/export processing

This section describes how to consume the web API connection types within an external web service using two examples, Function App and Web App.

## Import file using Finance Utilities connections

The image describes an example implementation of an API endpoint to retrieve file for import which can be consumed via the Finance utitlities connection in FinOps.
![image](../Images/TechnicalDoc_WebAPI_ImportFile.png)

The image describes an example implementation of a function app.
![image](../Images/TechnicalDoc_WebAPI_ImportFile-1.png)

## Export file using Finance Utilities connections

The image describes an example implementation of an API endpoint to retrieve the exported file received via the Finance utilities connections in FinOps.
![image](../Images/TechnicalDoc_WebAPI_ExportFile.png)

The image describes an example implementation of a function app.
![image](../Images/TechnicalDoc_WebAPI_ExportFile-1.png)

**Note:** The file passed a parameter called, file within FinOps when the ER file is exported. Please ensure that the external service extracts the file using the same parameter name as shown in the examples above.
