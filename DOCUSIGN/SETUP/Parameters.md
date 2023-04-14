---
# required metadata

title: DXC Solutions for DocuSign and Dynamics 365
description: Setup Parameters
author: lcoll
manager: Kym Parker
ms.date: 2023-04-14
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_DSParameters
audience: Application User
# ms.devlang: 
ms.reviewer: ndavidson2

# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: IconDocuSign 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: ndavidson2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Parameters

## Prerequisites

### DocuSign administrator user
Sign-in to the DocuSign admin portal. <br>
Ensure that the user has been configured with admininstrator access. <br>

### Key Vault

#### Docusign
1. Create a new **Key vault resource** and specify the required values.
2. Create a new **App registrations** to grant permission to the key vault. Select the Single tenant option.
3. Navigate to **Access policies** from the key vault and select Create. <br> ![Access policies](../IMAGES/Parameters-1.png "Access policies")
4. On Permissions' **Configure from a template**, select the appropriate permission. Example: Key, Secret and Certificate management and click Next.
5. Select the App registration that had been configured and assign.
6. Navigate to **Apps and Keys** in the DocuSign admin portal. Copy the integration key for the live app


#### D365
**System administrator > Setup > Key Vault parameters**
[MS user guide](https://docs.microsoft.com/en-us/dynamics365/finance/localizations/setting-up-azure-key-vault-client)



## DocuSign parameters
The DocuSign parameters form is used to set up the connection between your Dynamics 365 environment and your DocuSign account.  Within this form, you will set up the details regarding the administrator of the DocuSign account, along with a connection key that will be utilized when sending data through to DocuSign.
 You can reach the parameters form by navigating to **Organization administration** > **Setup** > **DocuSign** > **DocuSign parameters**


| **Field**                         | **Description**                      | **Example**     |
| :-------------------------------- |:-------------------------------------| :-------------- |
| **Web services address**          | DocuSign will provide the web address utilized to initiate the connection to your DocuSign account. Two variants of this field value will be used; one for a development or non-production instance and the second for production. <br> Navigate to **Apps and Keys** from the DocuSign admin portal and copy the **Account Base URI**, | https://demo.docusign.net  |
| **OAuth server URL**                | Enter the DocuSign OAuth server URL      | account-d.docusign.com
| **Integrator key**                | An integrator key is a unique identifier for each DocuSign account that is used for integration into another third-party system. It is used for all API calls to DocuSign.  This field value is provided by DocuSign in their Administration area. <br> <br>  The integrator key value must be configured as a manual secret within a key vault, with the [key vault parameters defined in FinOps](https://docs.microsoft.com/en-us/dynamics365/finance/localizations/setting-up-azure-key-vault-client). The integrator key can then be selected from the list of available key vault secrets  |
| **User ID**                     | Enter the DocuSign Administrator User ID. This can be accessed from the DocuSign user profile. <br> This user will need to have administration rights on the connected DocuSign account.     | 
| **RSA private key**               | The RSA private key is generated within DocuSign from the *Apps and Keys* administation page. Select the integration app, then  actions > edit. Under authentication, select *Generate RSA*. This will provide you with a once off private key value which should be recorded.  <br> <br>  The RSA private key value must be configured as a manual secret within key vault.  Due to the length of the key this cannot be stored directly in the key vault, instead the RSA private key can be stored as a private text file within blob storage. A SAS URL is then created for the file. This URL is stored as a manual secret in the key vault. <br> <br> The key vault parameters are then defined in FinOps, after which the integrator key can then be selected from the list of available key vault secrets   | 
| **Log exception**                 | Select *Yes* to capture the DocuSign error messages when they occur.  The messages will appear on the **Exeptions** page within the DocuSign integration. <br> <br> The errors will allow for investiation and resolution by an administrator.      | 

After the parameter values have been defined it is neccesary to grant consent for the authentication. This can be achieved by selecting *Grant consent* at the top of the page.

When working within the parameters form, the web services UI will be varied both across environments and across regions.  The test environments will have a working services connection by connecting to the following:  https://demo.docusign.net/restapi .  This is regardless of the region of the business.  

When moving to a production environment, you must update your integration to use the right base URL for API calls instead of https://demo.docusign.net/restapi . The base URL will vary, depending on the DocuSign account being used.  Each registered DocuSign user for your application can access one or more accounts. Each account has an associated base URL. Currently, the production base URLs include: www.docusign.net, na2.docusign.net, eu.docusign.net, etc. Additional base URLs are added regularly.  


## Updates FastTab 

The updates FastTab provides the details regarding the frequency of updates between the two systems.

| **Field**                         | **Description**                      | 
| :-------------------------------- |:-------------------------------------| 
| **Status update time overlap**          | The update **Update document status** periodic task must be set up to run, as a minimum, every 15 minutes. <br> <br> When this batch process runs, it will send DocuSign a time value and request all document status updates after that time, and up to the time the batch process is run.  Dynamics then stores the time the batch process completes.   |


*Note on Updates:*  As an example of the batch process for DocuSign, assume the batch process runs at 9:00 a.m. and sent a time of 8:45 a.m.  All document status updates between 8:45 and 9:00 would be requested.  Dynamics will store a value of 9:00 a.m., so that the next time the batch process runs it would request all document status updates from 9:00 a.m. 

There will be instances where the process my take longer to finalize.  When this occurs, the finalization time will be recorded and will be used as the initialization time at the next batch process run.  This is why the field has been provided.  
