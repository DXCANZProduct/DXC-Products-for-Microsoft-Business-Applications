---
# required metadata

title: Finance Utilities 
description: Cash and bank management setup - Finance utilities connections
author: jdutoit2
manager: Kym Parker
ms.date: 2023-01-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DFUConnection
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
When the bank statements are to be imported via the periodic task **Import bank statements via financial utilities connection**, the applicable connection type must be setup using the **Financial utilities connections** page.

**Financial utilities connections** are used in the following:
1.	Assigned to the applicable [Bank accounts](Bank-accounts.md) - Optional (for info).
2.	Mandatory parameter in the periodic task [Import bank statements via financial utilities connection](Bank-statement-import.md). Only enabled connections can be selected in the periodic task.

The import file can be attached to the created D365 bank statement(s), by setting **File attachment document type** on **Financial utilities parameters**.

Examples where a file would we moved to **Import error path**:
- File contains one or multiple bank accounts and not all bank accounts could be found. No bank statements are imported and file is moved to error.

> Note: If **Import error path** is not setup/incorrect, the file will be deleted from the import path and not archived. 


To open the **Financial utilities connections** page, go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities connections**. Then set the fields as described in the following subsections.


Field         | Description                         | Example or Options
:--           |:--                                  |:--
**Name**      |	Enter a name for your connection	  | ANZ_FTP
**Description**   |	Enter a description for your connection	  |FTP for bank 123
**Connection type** |	Select the applicable connection type	  | •	FTP <br> •	Azure blob <br> •	SFTP <br> •	SharePoint
**Error action**    |	The action to take when there is an error with the connection | •	Error <br> •	Warning
**Enabled**         |	Once all the mandatory fields have been completed the connection can be enabled	  | •	Yes <br> •	No

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
