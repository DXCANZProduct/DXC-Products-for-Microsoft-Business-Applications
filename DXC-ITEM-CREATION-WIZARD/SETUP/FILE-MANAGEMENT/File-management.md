---
# required metadata

title: DXC Item Creation Wizard 
description: DXC Item Creation Wizard  - File management
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-28
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# File management (File Uploader)

## .Net program
D365 FinOps is a cloud based solution, and therefore files cannot automatically be imported from a local file server via a batch job.  This .net program allows files to be stored in a local fileserver and automatically uploaded into the ‘blob’ where D365 can process the files.

Setup of the application involves the following steps:
1.	Installing the application;
2.	Creating Azure AD app registration to enable access to D365 instance;
3.	Registering Azure app ID in AX and assigning to a user that the application will perform actions in D365 on behalf of;
4.	Creating Data management import project
5.	Creating recurring job for import project and linking it to the Azure App ID
6.	Editing configuration file for the file uploader using the information collected during the previous steps

###	Installation
1.	A .zip file can be accessed [here](File-uploader-for-file-management.zip). 
2.	The zip file contains a setup file that must be run.
3.	The will be installed on your fileserver. By default this will installed at C:\Program Files (x86)\Sable 37 Inc\Dynamics AX File Uploader.

### Configuration
The **CONFIG** file can be found in the install folder. The file must be opened and updated as follows:

#### Client Settings 

The following 5 folders must be created within the local file directory. The paths can then be updated in the CONFIG file.
* Input
* PreProcess
* InProcess
* Error
* Success

```
   <!-- Client settings -->
   <add key="Input Directory" value="C:\temp\DIXF\input" />
   <add key="Preprocess Directory" value="C:\temp\DIXF\preprocess" />
   <add key="InProcess Directory" value="C:\temp\DIXF\inprocess" />
   <add key="Error Directory" value="C:\temp\DIXF\error" />
   <add key="Success Directory" value="C:\temp\DIXF\success" />
   <add key="Process Interval" value="1" />
   <add key="Logging Level" value="2" /> 
```
  
|  **Key**  | **Description** | 
|:---|:---|     
|  **Input directory**  | Anything located in this folder will be uploaded to the ‘blob’. Subfolders can be included for management of files, folder structure will recorded against the imported file. | 
|  **PreProcess directory**  | Files being prepared for upload will be moved here. |
|  **InProcess directory**  | Any files that in process will be moved here. | 
|  **Error directory**  | Any files that error will be moved here. |   
|  **Success directory**  | Once a file has been successfully uploaded, it will be moved here. | 
|  **Process interval**  | Specify the frequency for the service (mins) |
|  **Logging level**  | By default, the config file has logging level set to 2. The Log will be written to the computer’s event and viewable from event viewer. <br /> Possible values: <br />   0 – only log error <br />   1 – log error and warning <br />   2 – log info, error and warming|

#### Server Side Settings
 
``` 
    <!-- Server side settings -->
    <add key="AAD Tenant" value="???.com" />
    <add key="Azure Auth Endpoint" value="https://login.windows.net/" />
    <add key="Azure Client ID" value="08cd1730-1894-4af9-g9Tn-d6c561f3ab29" />
    <add key="Dynamics AX Uri" value="https://environment.cloudax.dynamics.com" />
    <add key="SecretKey" value=".jOd16-YV7ROKcyeYGgJtuxvL444pU_-eO" />
```

For the Azure app registration make sure that the following is correct:

1.	Authentication: Web – Redirect URI must match the URL of the target AX system, e.g. https://contoso.sandbox.operations.dynamics.com/
2.	Certificates and secrets: create new client secret that never expires. Copy the new secret value to notepad. To make sure there are no hidden characters at the end or beginning of the secret string when it’s copied, delete characters at the beginning and end of the secret until visible characters start getting deleted. Restore any visible characters that got deleted. 
3.	API permissions: add the following permissions, and get subscription administrator to grant the permissions:
 4.	Manifest: check that URL’s in the manifest match the AX instance URL mentioned in step 1

The following must be updated in the configuration file:

|  **Key**  | **Description** | 
|:---|:---|     
|  **AAD Tenant**  | Azure Active Directory Tenant ie. companyname.onmicrosoft.com. | 
|  **Azure Auth Endpoint**  | Azure Portal authorization for [external client](https://docs.microsoft.com/en-us/dynamics365/supply-chain/warehousing/install-configure-warehousing-app#create-a-web-service-application-in-active-directory). | 
|  **Azure Client ID**  | From Azure AD app registration: Overview -> Application (client) ID. | 
|  **Dynamics AX URL**  | Website Path. | 
|  **SecretKey**  | . | 

#### Data Transfer Setting

``` 
    <!-- Data transfer settings -->
    <add key="Recurring Job ID" value="CD78E40F-4BBB-48F6-B18E-4A32051CE35B" />
    <add key="Company" value="USMF" />
``` 

|  **Key**  | **Description** | 
|:---|:---|     
|  **Recurring Job ID**  | Once the Data Management import job is completed, the recurring job ID can be entered into the config file. | 
|  **Company**  | Specify the company within D365 for Operations where the files will be uploaded to. | 

### Services
 
Once installation and configuration have been completed, the Dynamics AX File Uploader service must be started on the local machine. 

Where you need to change between Dev/Test/SBox/Prod environments you will need to keep separate config files.  
1. Stop the service
2. Change the CONFIG file to point to the correct D365 instance
3. Start the service


### Data Management

A recurring job needs to be configured within D365 FinOps via data management. This can be accessed from **Workspaces > Data management > Import**.
1.	Select *Import*
2.	Enter the *Name* and *Description* of the job 
3.	Select *Add File*
4.	Select *Refresh entity list* (if required)
5.	Select *File import data* as the *Entity name*
6.	Select *Package* as the *source data format*
7.	Select Upload and upload this [package](File-management-data-package.zip).
8.	Select *Save*
9.	Click on *Create recurring data job*
10.	Enter the *Name* of the recurring job
11.	Specify a *Description* if required
12.	Specify the *Application ID*. This should match with the Client ID in the config file (App registration client ID). *Enabled* must be ticked.
13.	Select the *Set processing recurrence* button to set frequency
14.	Set *Supported data source type* to *Data package*
15.	Copy the *ID* from the Server side settings in the config file into the application ID. <add key="Recurring Job ID" value="???" />
16.	Select *Yes* to ‘Enable recurring data job “Name”?
17.	Select *OK*
 
### Azure Active Directory 
**System administration > Setup > Azure active directory applications
1.	Select *New *to create a new record.
2.	Specify the *Application ID*. This should match with the Client ID in the config file (Azure app registration client ID)
3.	Specify a user that is enabled, and has appropriate permissions in AX (application will perform actions in AX as that user).
