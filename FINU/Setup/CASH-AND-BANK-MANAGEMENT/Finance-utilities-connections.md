---
# required metadata

title: [Finance Utilities ]
description: [Cash and bank management setup - Finance utilities connections]
author: [jdutoit2]
manager: Kym Parker
ms.date: 17/06/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DFUConnection]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core-Dynamics-AX-CP-requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions-list-for-docs-topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

## Financial utilities connection
When the bank statements are to be imported via the periodic task **Import bank statements via financial utilities connection**, the applicable connection type must be setup using the **Financial utilities connections** page.

**Financial utilities connections** are used in the following:
1.	Assigned to the applicable [Bank accounts](Bank-accounts.md).
2.	Mandatory parameter in the periodic task [Import bank statements via financial utilities connection](Bank-statement-import.md)

To open the **Financial utilities connections** page, go to **Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities connections**. Then set the fields as described in the following subsections.

> Note: If **Import error path** is not setup/incorrect, the file will be deleted from the import path and not archived. The import file can be attached to the created D365 bank statement(s), by setting **File attachment document type** on **Financial utilities parameters**.


Field         | Description                         | Example or Options
:--           |:--                                  |:--
**Name**      |	Enter a name for your connection	  | ANZ_FTP
**Description**   |	Enter a description for your connection	  |FTP for bank 123
**Connection type** |	Select the applicable connection type	  | •	FTP <br> •	Azure blob <br> •	SFTP <br> •	SharePoint
**Error action**    |	The action to take when there is an error with the connection | •	Error <br> •	Warning
**Enabled**         |	Once all the mandatory fields have been completed the connection can be enabled	  | •	Yes <br> •	No

Click **Save** and the applicable Setup will be displayed as per Connection type selected



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
**Container name**  |	Specify the blob storage container. Folders are not supported	  | integration-import
**Credential type** |	Select applicable Credential type for Azure blob	| •	Key vault <br> •	Database
**Storage account name**  |	Enabled when Credential type = Database	
**Storage account key**   |	Enabled when Credential type = Database	
**Connection string**     |	Enabled when Credential type = Key vault	
**Archive container name**  |	Enter the path where the imported files are to be copied to. Folders are not supported	| integration-archive
**Search mask**           |	A file mask is used to match files in the Import path	        | Bank123*
**Error container name**  |	Enter the path where the files that matches the Search mask, but haven’t successfully been imported, are copied to. Folders are not supported	| integration-error

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
