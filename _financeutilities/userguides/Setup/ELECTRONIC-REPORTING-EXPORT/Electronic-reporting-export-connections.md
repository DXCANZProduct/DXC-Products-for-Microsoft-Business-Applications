---
layout: product-content
header: Finance Utilities
---

# Electronic reporting

Finance utilities includes functionality to export an Electronic reporting format to a secure location.

### Setup steps

1. [Electronic reporting export connections](#setup-electronic-reporting-export-connections)
2. [Document types](Document-types.md)
3. [Electronic reporting destination](Electronic-reporting-destination.md)

The following section will describe the required setup for Step 1 for the secure location which is available in **Electronic reporting export connections**.

### Setup Electronic reporting export connections

Users can access the page by navigating to **Organisation administration > Electronic reporting > Electronic reporting export connections**

Select **New** to create the location where GER file is to be saved. Connection options include FTP/FTPS, SFTP, Azure blob or API Endpoint

| Field                                 | Description                                                                                                                                                                                                    | Example or Options                                      |
| ------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------- |
| **Name**                              | Enter a name for your connection                                                                                                                                                                               | ANZ_FTP                                                 |
| **Connection type**                   | Select the applicable connection type                                                                                                                                                                          | • FTP <br> • Azure blob <br> • SFTP <br> • API Endpoint |
| **Error action**                      | The action to take when there is an error with the connection                                                                                                                                                  | • Error <br> • Warning                                  |
| **Enable file encryption/decryption** | Set to _Yes_ if the export file should be encrypted                                                                                                                                                            | • No <br> • Yes                                         |
| **Encryption key name**               | Select applicable **Encryption key name**. <br> See [DXC encryption parameters](../ENCRYPTION/Encryption-decryption.md) for additional details.                                                                |
| **Enable business event**             | Option to create an event when file is saved to Azure blob. <br> Setup required: <br> • Set this option to Yes <br> • Active Business event 'Electronic reporting file exported to azure blob' • No <br> • Yes |

Select **Save** and the applicable **Setup** will be displayed as per the **Connection type** selected

### Log

All connection methods have the option to set **Log level** and **Retention periods**. <br>
These logs can then be used to set **Custom alerts**, for example using error log to be notified when a connection can't connect.

- Fields for setting log:

| **Field**                    | **Description**                                                                                                   |
| :--------------------------- | :---------------------------------------------------------------------------------------------------------------- |
| **Logging level**            | Select required logging level: <br> • None (default) <br> • Info <br> • Warning <br> • Error                      |
| <ins>**Log retention**</ins> |
| **Duration**                 | Enter quantity for required duration                                                                              |
| **Period**                   | Select log retention period: <br> • Unlimited <br> • Days <br> • Weeks <br> • Months <br> • Quarters <br> • Years |

- **Log** button available on Connection setup:

| **Field**                 | **Description**                           |
| :------------------------ | :---------------------------------------- |
| **Created date and time** | Date and time log was created.            |
| **Created by**            | By whom the log was created.              |
| **Level**                 | Log level: Information, warning or error. |
| **Log code**              | Code that initiated the log.              |
| **Message**               | Message for the log.                      |

### FTP

| Field                     | Description                                                                                                                                                                                     | Example or Options                           |
| ------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------- |
| **Host**                  | Specify the Host for the FTP site <br> Note: FTP:// is not required                                                                                                                             |                                              |
| **Path**                  | Enter the path where the files are to be saved on the FTP site.                                                                                                                                 | /GER_ANZ                                     |
| **Port**                  | Specify the Port for the FTP site                                                                                                                                                               | 22                                           |
| **Enable TLS**            | Select to enable FTPS using TLS                                                                                                                                                                 | • Yes: FTPS <br> • No: FTP                   |
| **User**                  | Specify the Username used for authentication to the FTP site                                                                                                                                    |
| **Credential type**       | Select applicable Credential type for FTP site                                                                                                                                                  | • Key vault <br> • Database                  |
| **Password**              | Enabled when Credential type is set to _Database_. <br> Specify the Password used for authentication to the FTP site. <br> Note: this is encrypted and displayed as •••••••••• within the form. |                                              |
| **Key vault certificate** | Enabled when Credential type is set to _Key vault_.                                                                                                                                             | Select the applicable Key vault certificate. |

### Azure blob

| Field                    | Description                                                                                                         | Example or Options          |
| ------------------------ | ------------------------------------------------------------------------------------------------------------------- | --------------------------- |
| **Container name**       | Specify the blob storage container                                                                                  |                             |
| **Credential type**      | Select applicable Credential type for Azure blob                                                                    | • Key vault <br> • Database |
| **Storage account name** | Enabled when Credential type is set to _Database_                                                                   |                             |
| **Storage account key**  | Enabled when Credential type is set to _Database_                                                                   |                             |
| **Connection string**    | Enabled when Credential type is set to _Key vault_. <br> **Azure SAS Storage account level tokens** also supported. |                             |

### SFTP

| Field                 | Description                                                                                                                                                                                                 | Example or Options                                                            |
| --------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **Host**              | Specify the Host for the SFTP site <br> Note: SFTP:// is not required                                                                                                                                       |                                                                               |
| **Path**              | Enter the path where the files are to be saved on the SFTP site.                                                                                                                                            | /GER_ANZ                                                                      |
| **Port**              | Specify the Port for the SFTP site                                                                                                                                                                          | 22                                                                            |
| **Enable TLS**        | Select to enable SFTP over TLS                                                                                                                                                                              | • Yes: SFTP over TLS <br> • No: SFTP                                          |
| **User**              | Specify the **Username** used for authentication to the SFTP site                                                                                                                                           |                                                                               |
| **Credential type**   | Select applicable Credential type for SFTP site                                                                                                                                                             | • Key vault <br> • Database <br> • Private key (SSH key file stored in Azure) |
| **Password**          | Enabled when Credential type is set to _Database_. Specify the Password used for authentication to the SFTP site. _Note: this is encrypted and displayed as •••••••••• within the form._                    |                                                                               |
| **Connection string** | Enabled when Credential type is set to _Key vault_ or _Private key_. <br> _Private key_: In 'Key vault parameters' create a vault to store the access key of the storage account to access the sshkey file. | Select applicable Key vault certificate.                                      |
| **Container name**    | Enabled when Credential type is set to _Private key_. <br> Enter the Azure container that stores the SSH key file                                                                                           |                                                                               |
| **File name**         | Enabled when Credential type is set to _Private key_. <br> Enter the file name for the SSH key file                                                                                                         |                                                                               |
| **Phass phrase**      | Enabled when Credential type is set to _Private key_. <br> If applicable, enter the phass phrase for the SSH key file                                                                                       |                                                                               |

### API Endpoint

> Note: Available **Web API types** can be viewed on ActionPane.

[Technical guide](../../Technical/Web-API-Endpoint.md) for Web API Endpoints.

| Field                        | Description                                     | Example or Options                                                    |
| :--------------------------- | :---------------------------------------------- | :-------------------------------------------------------------------- |
| Web API types                | Select applicable export web service            | Options as per **Web API types**                                      |
| **Connection details**       |                                                 |
| Internet address             | Enter the internet address for the API Endpoint | https://XX.azurewebsites.net/                                         |
| Service endpoint             | Enter the service point for the API Endpoint    | api/DFUWebAPIImportExport/importFile                                  |
| Validate connection endpoint | Service endpoint for **Validate connection**    | api/HealthCheck/testConnection                                        |
| **OAUTH connection details** |                                                 |
| Application ID               | Azure active directory application identifier   |
| Key vault secret name        | Azure active directory application secret key   | Select the applicable **Secret** as setup in **Key vault parameters** |
| Tenant ID                    | Azure active directory tenant identifier        | XX.onmicrosoft.com                                                    |
| Authority URI                | Azure active directory authority URI            | https://login.microsoftonline.com/                                    |

### Validate connection

Use button **Validate connection** to validate the following:

- Connection details
- Export path or container

### Static IP address required for connection

Where the bank requires a static IP address for connections for sending bank payment files to their SFTP

#### Options

- Send file from D365 F&O via an Azure Logic App with a static IP

  - [https://learn.microsoft.com/en-us/answers/questions/32399/azure-logic-apps-with-a-fixed-ip-address](https://learn.microsoft.com/en-us/answers/questions/32399/azure-logic-apps-with-a-fixed-ip-address)
  - [https://learn.microsoft.com/en-us/azure/logic-apps/connect-virtual-network-vnet-set-up-single-ip-address](https://learn.microsoft.com/en-us/azure/logic-apps/connect-virtual-network-vnet-set-up-single-ip-address)

- Utilize the API option in Finance utilities connection
