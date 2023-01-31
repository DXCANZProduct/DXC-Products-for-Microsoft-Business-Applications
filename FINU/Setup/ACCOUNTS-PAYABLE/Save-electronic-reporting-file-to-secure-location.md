---
# required metadata

title: Finance Utilities 
description: Accounts payable setup - Save electronic reporting file to secure location 
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  ERFormatDestination
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version:: AX 7.0.1
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## Save Electronic reporting file to secure location
The below setup can be used for any Electronic reporting file, but the example provided is for a Vendor GER EFT payment. The feature uses the **Archive** functionality with the following setup steps
-	Step 1: Setup **Electronic reporting export connection**
-	Step 2: Setup **Document types**, using Step 1’s Connection
-	Step 3: Setup **Electronic reporting destination**, using Step 2’s Document type
-	Step 4: Setup AP **Method of payment** and select the Export format configuration from Step 3

Processing: When generating a payment for a method of payment with above GER, the Archive destination is defaulted, and the GER EFT payment file is saved to the assigned connection path.

### Step 1 - Setup Electronic reporting export connections
Users can access the page by navigating to **Organisation administration > Electronic reporting > Electronic reporting export connections**

Select **New** to create the location where GER file is to be saved. Connection options include FTP/FTPS, SFTP or Azure blob

|   Field             |   Description                                                 |   Example or Options   |
|-|-|-|
| **Name**            |	Enter a name for your connection                              | ANZ_FTP |
| **Connection type**	| Select the applicable connection type	                        | •	FTP <br>	• Azure blob <br> • SFTP |
| **Error action**    |	The action to take when there is an error with the connection | • Error <br> • Warning |
| **Enable file encryption/decryption** | Set to _Yes_ if the export file should be encrypted | •	No <br>	• Yes  |
| **Encryption key name** |	Select applicable **Encryption key name** setup in [DXC encryption parameters](../ENCRYPTION/Encryption-decryption.md)


Select **Save** and the applicable **Setup** will be displayed as per the **Connection type** selected

**FTP:**

|   Field    |   Description   |   Example or Options   |
|-|-|-|
| **Host**    | Specify the Host for the FTP site <br> Note: FTP:// is not required ||
| **Path** |	Enter the path where the files are to be saved on the FTP site. |	/GER_ANZ|
| **Port** |	Specify the Port for the FTP site |	22 |
| **Enable TLS** |	Select to enable FTPS using TLS |	•	Yes: FTPS <br> • No: FTP |
| **User**       |	Specify the Username used for authentication to the FTP site |
| **Credential type** |	Select applicable Credential type for FTP site | • Key vault <br> •	Database |
| **Password**	| Enabled when Credential type is set to _Database_. <br> Specify the Password used for authentication to the FTP site. <br> Note: this is encrypted and displayed as •••••••••• within the form.	||
| **Key vault certificate** |	Enabled when Credential type is set to _Key vault_. | Select the applicable Key vault certificate.	|

**Azure blob:**		

|   Field    |   Description   |   Example or Options   |
|-|-|-|
| **Container name** |	Specify the blob storage container	||
| **Credential type** |Select applicable Credential type for Azure blob |	•	Key vault <br> • Database |
| **Storage account name** |	Enabled when Credential type is set to _Database_	||
| **Storage account key** |	Enabled when Credential type is set to _Database_	||
| **Connection string** |	Enabled when Credential type is set to _Key vault_||

**SFTP:**

|   Field    |   Description   |   Example or Options   |
|-|-|-|
| **Host** |	Specify the Host for the SFTP site <br> Note: SFTP:// is not required	||
| **Path**	| Enter the path where the files are to be saved on the SFTP site. |	/GER_ANZ|
| **Port**	| Specify the Port for the SFTP site |	22 |
| **Enable TLS** |	Select to enable SFTP over TLS | • Yes: SFTP over TLS <br> •	No: SFTP|
| **User**	| Specify the **Username** used for authentication to the SFTP site	||
| **Credential type**	| Select applicable Credential type for SFTP site |	•	Key vault <br> • Database |
| **Password**	| Enabled when Credential type is set to _Database_. Specify the Password used for authentication to the SFTP site. *Note: this is encrypted and displayed as •••••••••• within the form.* ||
| **Key vault certificate** |	Enabled when Credential type is set to _Key vault_. | Select applicable Key vault certificate.	|


### Step 2 - Setup Document types

Users can access the page by navigating to **Organisation administration > Document management > Document types**. <br> 
Select **New** to create the **Document type** and assign the **Electronic reporting export connection** created in _step 1_.

|   Field    |   Description   |   Example or Options   |
|-|-|-|
| **Type**  |  Enter the type  |  Example GER  |
| **Name**  |  Enter a name for the document type  |  |
| **Class**  |  Select **Attach file**  |  •	Attach file <br> •	Attach URL <br> •	Simple note      |
| **Group**  |  Select  **File**   |  • Note <br> • File <br> • Image <br> • Document <br> • Worksheet <br> • URL         |
| **Category**  |  Select a **Category**  |  •	None         |
| **Location** | Not used, select any     |  • Azure storage <br> • Database <br> • SharePoint         |
| **SharePoint address** |   Not used  
| **Remove**  |  Document and physical file  |           |
| **Ask for confirmation**  |  Should confirmation be requested priori to removing the file  |  • Yes <br> • No |
| **Electronic report export connection**  |  Select the **Electronic reporting export connection** setup in _step 1_ |  Example ANZ_FTP         |

### Step 3 - Electronic reporting destination
Users can access the page by navigating to **Organisation administration > Electronic reporting > Electronic reporting destination**. <br> 
Select **New** on the Action Pane to create an **Electronic reporting destination** for the selected GER and allocate **Document type** created in _step 2_.

|   Field    |   Description   |    Example or Options   |
|-|-|-|
|  **Reference**  |  Select the  Electronic reporting Reference  |  Example ‘ANZ Direct Credit Service (AU)’  |
|  Select  **New** on the **File destination** FastTab  |  |  |
|  **Name** |  Enter name for the destination  |   |
|  **File component name** |  Select  PaymentFile   |   PaymentFile   |
|  **Stop processing on failure**  |  If enabled and there are errors when saving the file to location, vendor payment processing  **Generate payment**  will create a file and attach to the job. The Payment status will remain  **None**   |  •	Yes <br> •	No          |
|  Select the **Settings** button on the **File destination** FastTab and select the **Archive** tab |  |  |
|  **Enabled**  |  Enable the Archive destination  |  • Yes <br> • No          |
|  **Save in job archive**  |  Enable saving  |  • Yes <br> • No          |
|  **Type**  |  Select the **Document type** created in _step 2_  |  Example GER          |

### Step 4 -	Method of payment
On the selected **Method of payment**, enable **Generic electronic Export format**, and in the **Export format configuration** field select the **Reference** from _step 3_.

## Processing
Vendor payment processing using the above method of payment is discussed at [Processing](../../Processing/Accounts-Payable/Save-electronic-reporting-file-to-secure-location.md)

