---
# required metadata

title: DXC Care services API Suite Setup
description: Services Australia Support at Home Integration Setup
author: Artika Dutt
Manager: Pontus Ek
ms.date: 2025-11-19
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Artika Dutt

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Artika Dutt
ms.search.validFrom: 2025-11-19
ms.dyn365.ops.version: AX 7.0.1
---


# Care services API Suite <br> <br> Services Australia Support at Home Integration Setup
Services Australia requires a PRODA account to be able to val
1. **PRODA Authentication Profile** - A valid PRODA (Provider Digital Access) authentication profile
2. **PRODA Setup** - PRODA configuration URLs
3. **Services Australia Product** - Details of the Services Australia product subscribed by the organisation
4. **Services Australia integration parameters** - Parameters required for setting up PRODA connection profiles for authentication and access to Support at home APIs.

## PRODA Authentication profiles
The PRODA Authentication Profile defines the authentication parameters required for connecting to PRODA's authentication services.  

**Key and Secret Management**  
Services Australia integration requires that keys and secrets are reused for more than 50% of their lifetime to maintain secure connections otherwise requests will be throttled. It is recommended to set refresh ratios to 80% to ensure that keys and secrets are automatically refreshed before they expire, preventing authentication failures. 

Navigate to: **Care services > Setup > Services Australia integration > PRODA Authentication profiles**  

**Identification**
1.  **Name** - Enter a descriptive name for the profile.

**Authentication setup**  
1.  **RSA key name** - Enter a unique name to identify the RSA key. This key is used to establish a secure connection with the PRODA device to access the Services Australia APIs.  
2.  **Key refresh ratio** – Specify the rate at which the RSA key will be refreshed. The RSA key has an expiry date, and it must be refreshed before expiration for authentication to succeed. **Recommended value: 0.8.**  
3.  **Use Key Vault** – Enable this option to use Azure Key Vault for generating and storing all secrets and keys. When disabled, key generation uses the cryptography library and all secrets are stored securely within FinOps.   
4.  **Token refresh ratio** – Specify the rate at which the access token will be refreshed. Access tokens have a maximum lifetime of one hour and are required for authenticating against the Services Australia API. **Recommended value: 0.8.**

**Use key vault enabled**  
The latest Azure Key Vault SDK isn’t supported yet in the current FinOps Key Vault setup. This will switch to the newer Azure Key Vault SDK, which changes how your system connects to Key Vault. Before enabling, please make sure your environment and key vault configuration is compatible with the latest Azure Key Vault SDK.
> [!IMPORTANT]
> **Azure Key Vault SDK Version Change**
> 
> When enabled, this solution uses the latest Azure Key Vault SDK instead of the legacy version currently integrated with standard FinOps Key Vault functionality. The newer SDK implements different authentication and connection mechanisms for accessing Key Vault resources.
>
> **Before enabling:**
> - Verify your Azure environment supports the latest Key Vault SDK
> - Ensure your key vault access policies and permissions are configured correctly
> - Test in a non-production environment first

1.  **Key vault credential type** – Select the credential type depending on your organization setup:
    - **Client secret** - Selected by default
    - **Default** - Automatically tries all available authentication methods
    - **Managed Identity** - Uses Azure managed identity for authentication
2.  **Additionally allowed tenants** - Enter additional tenant IDs to grant key vault access to other tenants (if required).
3.  **Managed service identity** – Required only if credential type is set to Managed Identity. Enter the managed identity details.
4.  **Key vault parameter** – Select the key vault parameter setup that will be used for generating and storing RSA keys and other secrets.
5.  **Access token secret name** – Enter the secret name in Key Vault to securely store the access token.

**Use key vault manual enabled**
- This option enables manual entry of key vault credentials instead of relying on the built-in key vault parameters.
- This functionality allows you to use a key vault that does not exist in the same tenant as the FinOps environment. 
- This is primarily intended for development and testing environments.

1. **Key vault URL** - Enter the URL of the Azure Key Vault (e.g., https://yourvault.vault.azure.net/).
2. **Key Vault client** - Enter the Client ID (Application ID) for the key vault connection.
3. **Key vault tenant ID** - Enter the Tenant ID for the key vault connection.
4. **Key vault secret key** - Enter the secret key for authenticating the key vault connection.
5. **Access token secret name** - Enter the secret name to securely store the access token in the key vault.
   
## PRODA Setup

The **PRODA Setup** section allows users to configure the required URLs for authenticating with **PRODA** in order to access **Services Australia APIs**. Proper configuration ensures secure communication and successful integration with government services.

Navigate to: **Care services > Setup > Services Australia integration > PRODA setup**

1. **Name** - Enter a descriptive name for the setup.
2. **Audit ID type URI** - Required for device PRODA API requests
3. **Subject ID type URI** - Required for device PRODA API requests
4. **Audience** - PRODA Service Provider Audience string. Service provider name - PRODA
5. **Device activation URI** - Required for the device activation process of the PRODA authentication workflow.  
6. **Access token URI** - Required for device authentication provess, which is essential for accessing Services Australia APIs.
7. **Access token audience** - PRODA Service Provider Audience string. Service provider name - Aged Care

## Services Australia Product Setup
The **Services Australia Product** section is used to configure the certified solution details required for accessing **Services Australia APIs**. This ensures that the integration is tied to an approved application and complies with Services Australia’s authentication requirements.

Navigate to: **Care services > Setup > Services Australia integration > Services Australia product setup**

1. **Name** - A descriptive name for the product. This helps identify the solution within your environment.

The following details are provided by the vendor  
- **Proda client Id**
- **Product Id**
- **Application Id**

## Services Australia integration

Navigate to: **Care services > Setup > Care services parameters > Services Australia integration**

### PRODA Connection profile
The **PRODA Connection Profile** section allows you to configure multiple instances for connecting and authenticating against the **Services Australia APIs**. Each profile defines the connection parameters required to securely interact with Services Australia services.

Before setting up a connection profile, ensure that:
- A **PRODA organisation** has been created.  
- A **PRODA device** has been registered.  

1. **PRODA connection profile** - A descriptive name for the profile. This helps identify the connection instance.
2. **Organisation ID** - The organisation RA number associated with the certified product.
3. **Device name** - The registered PRODA device name.
4. **Device expiry** - 
5. **Auth** - Select the authentication profile to be used for this connection.
6. **Config** - Choose the configuration settings associated with the profile.
7. **Product** - Select the Services Australia product configured above.
8. **Base URL** - Aged care API endpoint

### Validate key vault connection
If the selected authentication profile has key vault enabled, this option allows key vault validation using the latest Azure Key Vault SDK.
  
### Activate device
Device activation can also be performed from this page. For more information, see [Device Activation Guide](PASTE-LINK-HERE).