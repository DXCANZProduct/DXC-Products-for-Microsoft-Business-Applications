---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Connection methods

## Overview
Various communication methods (FTP, FTPS, SFTP, Azure cloud blob storage, Azure file share and WebAPI services) can be used to:
- Import EDI documents from the VAN or Trading partner and/or
- Export EDI documents generated within D365 to the VAN or Trading partner.

Default EDI connection is determined by: <br>
- Outgoing documents: Connection profile setup on [EDI > Setup > EDI parameters](EDI-parameters) <br> 
- Incoming documents: All active connection incoming paths as setup below. <br>

The default EDI connection can be overridden on Trading partner or Trading partner document level for outgoing and incoming documents.

## Log
All connection methods have the option to set **Log level** and **Retention periods**. <br>
These logs can then be used to set **Custom alerts**, for example using error log to be notified when a connection can't connect.

- Fields for setting log:

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
**Logging level**                   | Select required logging level: <br> • None (default) <br> • Info <br> • Warning <br> • Error
<ins>**Log retention**</ins>        |
**Duration**                        | Enter quantity for required duration
**Period**                          | Select log retention period: <br> • Unlimited <br> • Days <br> • Weeks <br> • Months <br> • Quarters <br> • Years


- **Log** button available on Connection setup:

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
**Created date and time**           | Date and time log was created.
**Created by**                      | By whom the log was created.
**Level**                           | Log level: Information, warning or error.
**Log code**                        | Code that initiated the log.
**Message**                         | Message for the log.

### Cleanup log

In order to create a batch to delete connection logs older than the retention period, follow these steps:

1. Select the connection, then select the **Log** button.
2. Select **Cleanup log**. The retention settings are automatically copied to **Duration** and **Period**.
3. Set **Batch processing** to _Yes_, set the **Recurrence** and update the **Task description** if required.
4. Click **OK**.

Running **Test connection** also deletes the connection log records that falls outside the retention period for the connection.

### FTP sites
Users can access the form by navigating to **EDI > Setup > Connection setup > FTP sites**

FTP is a communication method that can be used for this module. FTPS and FTP protocols are supported. 
The FTP sites setup form holds the information required to connect to, retrieve and create files in/from FTP sites as well as the EDI document paths in the FTP site.

#### Create a new site configuration
To begin, create a new FTP site record and fill out the connection parameters

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Site name**                 | Specify a **Name** for the FTP site |
| **Active**                    | Indicates if the site is active. <br> To activate, select the **Activate** button available in the ribbon. <br> To deactivate, select the **Deactivate** button available in the ribbon. |
<ins>**Connection**</ins>           | 
| **Host**                 		| Specify the **Host** for the FTP site <br> *Note: FTP:// is not required* |
| **Port**                 		| Specify the **Port** for the FTP site|
| **Enable TLS**          		| Select to enable FTPS using TLS |
| **Disable delete**          | When set to _Yes_, the file will not be deleted from the import path. This is useful where you don't have edit rights on the connection and don't want to see an error in the connection log. <br> *Note: Enabling this option for FTP may cause a performance impact. Each file will be downloaded and uploaded to its specific directory to retain file in source directory.*
<ins>**Credentials**</ins>     		| 
| **User**                 		| Specify the **Username** used for authentication to the FTP site |
| **Password**                  | Specify the Password used for authentication to the FTP site. <br> *Note: this is encrypted and displayed as ……. within the form.* |

> Note: Select **Test Connection** to confirm that a connection can be made with the FTP site specified.

#### Site paths
It is possible to configure a different FTP site path per EDI document type.
A common way to configure this is to setup a FTP site for the UAT environment versus the PROD environment so the PROD database can easily be rolled over into the UAT environment by simply changing the active site.

<ins>**Incoming documents**</ins> <br>
Incoming documents have the following available paths:
- **Inbound** - The path the EDI document files will be retrieved from
- **Archive** - Once succesfully imported to EDI's Inbound files, the file is moved from Inbound to Archive path
Incoming documents also have 1 optional path:
- **Error** - If there is an error with the import, for example duplicate filename, the file is moved from Inbound to Error path. If the Error path is not setup, the file will remain in Inbound path

Select **Populate paths** on the Action pane, to create the incoming and outgoing paths for all the licensed documents.

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **EDI document type**             | Specify the **Document type** the path relates to |
| **Type**                				  | The type of path: <br> • **Inbound** - The path the EDI document files will be retrieved from <br> • **Archive** - Once succesfully imported to EDI's Inbound files, the file is moved from Inbound to Archive path <br> • **Error** - If there is an error with the import, for example duplicate filename, the file is moved from Inbound to Error path
| **Search mode**		                | Specify to use either the Trading partner’s **Search mask** as prefix or suffix to identify ‘who’ the file is from. <br> Options: <br> **File name must start with** – Filename must start with Trading partner’s Search mask <br> **File name must end with** – Filename must end with Trading partner’s Search mask |
| **Path**			                    | Specify the FTP path |

<ins>**Outgoing documents**</ins> <br>
Outgoing documents have a single path that is required to be defined

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **EDI document type**             | Specify the **Document type** the path relates to |
| **Path**			                    | Specify the FTP path where the outbound file will be saved |

> Note: Each site path can be tested to ensure it is valid by selecting the path records to be tested and pressing the **Test path connection** button on the Incoming and/or Outgoing path's toolbar. <br>The results will be shown on the far right of the grid.

### SFTP sites
Users can access the form by navigating to **EDI > Setup > Connection setup > SFTP sites**

The SFTP sites setup form holds the information required to connect to, retrieve and create files in/from SFTP sites as well as the EDI document paths in the SFTP site.

#### Create a new site configuration
To begin, create a new SFTP site record and fill out the connection parameters

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Site name**                 	| Specify a **Name** for the SFTP site |
| **Active**                   	    | Indicates if the site is active. <br> To activate, select the **Activate** button available in the ribbon. <br> To deactivate, select the **Deactivate** button available in the ribbon. |
| <ins>**Connection**</ins>            	|  |
| **Host**                 			| Specify the **Host** for the SFTP site <br> *Note: SFTP:// is not required* |
| **Port**                			| Specify the **Port** for the SFTP site|
| **Disable delete**          | When set to _Yes_, the file will not be deleted from the import path. This is useful where you don't have edit rights on the connection and don't want to see an error in the connection log.
| <ins>**Credentials**</ins>      			|  |
| **User**                 			| Specify the **Username** used for authentication to the SFTP site |
| **Password**                  	| Specify the **Password** used for authentication to the SFTP site. <br> *Note: this is encrypted and displayed as ……. within the form.* |
| <ins>**Proxy**</ins> (where applicable)  	|  |
| **Proxy type**                 	| Select the applicable **Proxy type**, options <br> - Socks4 <br> - Socks5 <br> - Http |
| **Proxy host** 	             	| Specify the **Proxy host** for the SFTP site |
| **Proxy port**                 	| Specify the **Proxy port** for the SFTP site |
| **Proxy user name**              	| Specify the **Proxy username** used for authentication to the SFTP site |
| **Proxy password**               	| Specify the **Proxy password** used for authentication to the SFTP site. <br> *Note: this is encrypted and displayed as ……. within the form.* |
| <ins>**Private key**</ins> (where applicable) 	|  |
| **Private key**                 	| Specify the **Private key** used for authentication to the SFTP site |
| **Pass phrase**                 	| Specify the **Pass phrase** used for authentication to the SFTP site |

> Note: Select Test Connection to confirm that a connection can be made with the SFTP site specified.

#### Site paths
It is possible to configure a different SFTP site path per EDI document type.
A common way to configure this is to setup a SFTP site for the UAT environment versus the PROD environment so the PROD database can easily be rolled over into the UAT environment by simply changing the active site. 

<ins>**Incoming documents**</ins> <br>
Incoming documents have the following available paths:
- **Inbound** - The path the EDI document files will be retrieved from
- **Archive** - Once succesfully imported to EDI's Inbound files, the file is moved from Inbound to Archive path
Incoming documents also have 1 optional path:
- **Error** - If there is an error with the import, for example duplicate filename, the file is moved from Inbound to Error path. If the Error path is not setup, the file will remain in Inbound path

Select **Populate paths** on the Action pane, to create the incoming and outgoing paths for all the licensed documents.

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **EDI document type**                 | Specify the **Document type** the path relates to |
| **Type**                				| The type of path: <br> • **Inbound** - The path the EDI document files will be retrieved from <br> • **Archive** - Once succesfully imported to EDI's Inbound files, the file is moved from Inbound to Archive path <br> • **Error** - If there is an error with the import, for example duplicate filename, the file is moved from Inbound to Error path |
| **Search mode**		                | Specify to use either the Trading partner’s **Search mask** as prefix or suffix to identify ‘who’ the file is from. <br> Options: <br> **File name must start with** – Filename must start with Trading partner’s Search mask <br> **File name must end with** – Filename must end with Trading partner’s Search mask |
| **Path**			                    | Specify the SFTP path |

<ins>**Outgoing documents**</ins> <br>
Outgoing documents have a single path that is required to be defined

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **EDI document type**                 | Specify the **Document type** the path relates to |
| **Path**			                    | Specify the SFTP path where the outbound file will be saved |

> Note: Each site path can be tested to ensure it is valid by selecting the path records to be tested and pressing the **Test path connection** button on the Incoming and/or Outgoing path's toolbar. <br>The results will be shown on the far right of the grid.

### Azure blob storage sites
Users can access the form by navigating to **EDI > Setup > Connection setup > Azure sites**

Azure cloud blob storage is a communication method that can be used for this module. 
The Azure sites setup form holds the information required to connect to, retrieve and create files in/from Azure sites as well as the EDI document path in the Azure site.

#### Create a new site configuration
To begin, create a new Azure site record and fill out the connection parameters.

| **Field** 					    | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Site name**                		| Specify a **Name** for the Azure site |
| **Azure connection type**          | Select between _Azure blob_ or _Azure file share_
| **Active**                   	     | Indicates if the site is active. <br> To activate, select the **Activate** button available in the ribbon. <br> To deactivate, select the **Deactivate** button available in the ribbon. |
**Credential type**					| Select between *Key vault* (available for Azure blob and Azure file share) or *Database* (only available for Azure blob)
| **Disable delete**          | When set to _Yes_, the file will not be deleted from the import path. This is useful where you don't have edit rights on the connection and don't want to see an error in the connection log.
<ins>**Manual credentials**</ins> 			|	
**Storage account name**			| If Credential type is set to **Database**: Specify the **storage account name** used for authentication to the Azure site
**Storage account key**				| If Credential type is set to **Database**: Specify the **storage account key** used for authentication to the Azure site. 
<ins>**Key vault**</ins> 			|	
**Key Vault certificate**			| If Credential type is set to **Key vault**: Assign Key vault **Secret** setup in **Key vault parameters**. Can also assign a Key vault for SAS on account level.
             		
> Note: Select **Test Connection** to confirm that a connection can be made with the Azure site specified.

#### Site paths
It is possible to configure a different Azure site path per EDI document type. 
A common way to configure this is to setup an Azure site for the UAT environment versus the PROD environment so the PROD database can easily be rolled over into the UAT environment by simply changing the active site. 

<ins>**Incoming documents**</ins> <br>
Incoming documents have the following available paths:
- **Inbound** - The path the EDI document files will be retrieved from
- **Archive** - Once succesfully imported to EDI's Inbound files, the file is moved from Inbound to Archive path
Incoming documents also have 1 optional path:
- **Error** - If there is an error with the import, for example duplicate filename, the file is moved from Inbound to Error path. If the Error path is not setup, the file will remain in Inbound path

Select **Populate paths** on the Action pane to create the incoming and outgoing paths for all the licensed documents.

| **Field**                         	| **Description**                      | 
| :-------------------------------- 	|:-------------------------------------| 
| **EDI document type**             	| Specify the **Document type** the path relates to |
| **Type**                				| The type of path: <br> • **Inbound** - The path the EDI document files will be retrieved from <br> • **Archive** - Once succesfully imported to EDI's Inbound files, the file is moved from Inbound to Archive path <br> • **Error** - If there is an error with the import, for example duplicate filename, the file is moved from Inbound to Error path |
| **Search mode**		     		    | Specify to use either the Trading partner’s **Search mask** as prefix or suffix to identify ‘who’ the file is from. <br> Options: <br> **File name must start with** – Filename must start with Trading partner’s Search mask <br> **File name must end with** – Filename must end with Trading partner’s Search mask |
| **Azure blob storage container name**	/ <br> **Azure file share** | Specify the blob storage container or Azure file share name |
| **Folder name**                     | Where applicable, specify the folder name |

Outgoing documents have a single path that is required to be defined

| **Field**                         	| **Description**                      | 
| :-------------------------------- 	|:-------------------------------------| 
| **EDI document type**             	| Specify the **Document type** the path relates to |
| **Azure blob storage container name**	/ <br> **Azure file share** | Specify the blob storage container or Azure file share name |
| **Folder name**                     | Where applicable, specify the folder name |

> Note: Each site path can be tested to ensure it is valid by selecting the path records to be tested and pressing the **Test path connection** button on the Incoming and/or Outgoing path's toolbar. <br>The results will be shown on the far right of the grid.*
> **Folder name** is excluded in **Test path connection**.

### Web services
This is a base framework that will allow developers to build custom connections to consume external APIs and integrate them with the module. Out of the box the module does not include any functional connections and only provides development examples as a guide. 
For further information, please see [Technical guide - Web API](../Technical-guide/Web-API)

Users can access the form by navigating to **EDI > Setup > Connection setup > Web API settings**

The Web API setup form holds the information required to connect to, retrieve and create files via web services. It is designed with some base fields as a framework and can be extended within the implementation as required.

#### Create a web API connection

| **Field** 					    | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Name**                 			| Specify a **Name** for the web API connection |
| **Description**                 	| Enter the **Description** of web API |
| **Active**                   	    | Indicates if the site is active. <br> To activate, select the **Activate** button available in the ribbon. <br> To deactivate, select the **Deactivate** button available in the ribbon. |
| <ins>**General**</ins>                		
| **Web API type**                 	| A list of available connections that have been developed for the implementation. Can also be viewed at **EDI > Setup > Configurations > Web API types** |
| **Internet address**             	| The base URL of the API |
| **Service endpoint**             	| The specific services endpoint |
| <ins>**Connection details**</ins>       		
| **User**                  		| Specify the **Username**  used for authentication to the web API |
| **Password**                 		| Specify the **Password**  used for authentication to the Web API |
| **Application Id**                | Specify the **Application Id**  used for the web API |
| **Application key**               | Specify the **Application key**  for the web API |

#### Inbound
The EDI module exposes various functions to send files into the inbound staging area for processing. 

#### Outbound
The EDI module exposes various functions to pull files from the outbound inbound staging area for download.
An oData feed of the outbound file queue (/data/SAB_EDIFileExport) is available for discovering the outbound queued file references.
