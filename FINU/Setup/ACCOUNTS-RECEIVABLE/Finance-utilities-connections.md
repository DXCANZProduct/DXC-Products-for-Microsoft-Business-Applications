---
# required metadata

title: DXC Finance Utilities - AR Utilities
description: Financial utilities connections setup
author: jdutoit2
manager: Kym Parker
ms.date: 2023-04-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCARConnection, DXCEncryptionParameters
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

## Financial utilities connection
When the **Customer remittances** or **Direct debit returns** are to be imported via their periodic tasks, the applicable connection type must be setup using the **Financial utilities connections** page.

> Note: The menu is only available where additional licensed feature **Finance utilities - AR utilities** is enabled.

Accounts receivable **Financial utilities connections** are used in the following:
1.	Mandatory parameter in the periodic task [Payment journal import](). Only enabled Financial connections can be selected in the periodic task.

The import file can be attached to the created D365 customer payment journal, by setting **File attachment document type** on the **Settlement** tab on **Accounts receivable parameters**.

Examples where a file would we moved to **Import error path**:
- 

> Note: If **Import error path** is not setup/incorrect, the file will be deleted from the import path and not archived. 


To open the **Financial utilities connections** page, go to **Accounts receivable > Payments setup > Financial utilities connections**. Then set the fields as described in the following subsections.


Field         | Description                         | Example or Options
:--           |:--                                  |:--
**Name**      |	Enter a name for your connection	  | ANZ_FTP
**Description**   |	Enter a description for your connection	  |FTP for bank 123
**Connection type** |	Select the applicable connection type	  | •	FTP <br> •	Azure blob <br> •	SFTP <br> •	SharePoint
**Error action**    |	The action to take when there is an error with the connection | •	Error <br> •	Warning
**Enabled**         |	Once all the mandatory fields have been completed the connection can be enabled	  | •	Yes <br> •	No
| **Enable file encryption/decryption** | Set to _Yes_ if the import file should be decrypted | •	No <br>	• Yes  |
| **Encryption key name** |	Select applicable **Encryption key name**. <br> See [DXC encryption parameters](../ENCRYPTION/Encryption-decryption.md) for additional details. 

Click **Save** and the applicable Setup will be displayed as per Connection type selected. <br>

### Log
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

### FTP

Field         | Description                         | Example or Options
:--           |:--                                  |:--
**Host**            |	Specify the Host for the FTP site <br> > Note: FTP:// is not required	
**Port**            |	Specify the Port for the FTP site	      | 21
**Enable TLS**      |	Select to enable FTPS using TLS	        | •	Yes: FTPS <br> •	No: FTP
**User**            |	Specify the Username used for authentication to the FTP site	
**Password**        |	Specify the Password used for authentication to the FTP site. <br> > Note: this is encrypted and displayed as •••••••••• within the form.	
**Import path**     |	Enter the path where the files are to be imported from	  | /Integration
**Import archive path** |	Enter the path where the imported files are to be copied to	 | /Integration/Archive
**Search mask**     |	A file mask is used to match files in the Import path	    | Bank123*
**Import error path** |	Enter the path where the files that matches the Search mask, but haven’t successfully been imported, are copied to	| /Integration/Error

### Azure blob storage

Field         | Description                         | Example or Options
:--           |:--                                  |:--
**Container name**  |	Specify the **import** blob storage container. Folders are not supported	  | integration-import
**Credential type** |	Select applicable **Credential type** for Azure blob	| •	Key vault <br> •	Database
**Storage account name**  |	Enter the **Storage account name** where Credential type = **Database**
**Storage account key**   |	Enter the **Storage account key** where Credential type = **Database**	
**Connection string**     |	Enabled when Credential type = **Key vault**. <br> Select the applicable **Secret** as setup in **Key vault paramaters**. 
**Archive container name**  |	Enter the **archive** path where the imported files are to be copied to. Folders are not supported	| integration-archive
**Search mask**           |	A file mask is used to match files in the Import path	        | Bank123*
**Error container name**  |	Enter the **error** path where the files that matches the Search mask, but haven’t successfully been imported, are copied to. Folders are not supported. | integration-error

### SFTP		

Field         | Description                         | Example or Options
:--           |:--                                  |:--
**Host**                  |	Specify the Host for the SFTP site. <br> > Note: SFTP:// is not required	
**Port**            |	Specify the Port for the SFTP site	  | 21
**User**            |	Specify the Username used for authentication to the SFTP site	
**Password**        |	Specify the Password used for authentication to the SFTP site. <br> > Note: this is encrypted and displayed as •••••••••• within the form.	
**Import path**     |	Enter the path where the files are to be imported from	  | /Integration
**Import archive path** |	Enter the path where the imported files are to be copied to	  | /Integration/Archive
**Search mask**     |	A file mask is used to match files in the Import path	    | Bank123*
**Import error path** |	Enter the path where the files that matches the Search mask, but haven’t successfully been imported, are copied to	  | /Integration/Error

### SharePoint
> Note: Setup SharePoint at **Organisation administration > Document management > Document management parameters**, tab **SharePoint**

Field         | Description                         | Example or Options
:--           |:--                                  |:--
**Import SharePoint address**	| Enter the SharePoint address where the files are to be imported from |	https://.../Shared Documents/Integration
**Archive SharePoint address**  |	Enter the SharePoint address where the imported files are to be copied to	| https://.../Shared Documents/Integration-archive
**Import error SharePoint address** |	Enter the SharePoint address where the files that matches the Search mask, but haven’t successfully been imported, are copied to	| https://.../Shared Documents/Integration-error
**Search mask**     |	A file mask is used to match files in the Import path	    | Bank123*


### Validate connection
Use button **Validate connection** to validate the following:
- Connection details
- Import path
- Import archive path
- Import error path

### Enable connection
Once all setup has been completed, update **Enabled** to _Yes_.
