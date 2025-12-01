---
layout: product-content
header: Finance Utilities
toc: true
---

# Encryption / Decryption
Encryption / Decryption is available utilising the **DXC Encryption** model.

Once below has been setup, the functionality can be used on the following Finance utilities functionality:
- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections) to decrypt a bank statement file imported using periodic task **Import bank statements via financial utilities connection**

## Generate
DXC Encryption allows users to generate keys within Finance and Operations.
Navigate to **Organization administration > Setup > DXC encryption > DXC encryption parameters** and use the **Generate** button to create keys that can be used in following steps.
Can optionally also specify a **Passphrase** before generate.

## Encryption keys

The following options are supported:
- **Azure Storage SAS URL** - Private key, Public key, Receiver’s public key use Azure Storage SAS URL with read only access stored in the keyvault secrets. The SAS url points to the file and includes the token to access it. Step 1 required
- **Azure Secrets** - Secrets in Azure containing base 64 encoded data of the actual keys into D365 key vault. These secrets will then be pulled into FinOps as base64, and decoded before being used for encryption/decryption purposes. Step 1 required
- **String in FinOps** - Store key values as string within FinOps DXC Encryption parameters form. Step 1 not required

## Step 1 - Setup Secrets in Key vault parameters
Setup the following as **Secrets** in **Key vault parameters** for the encryption/decryption:
- Passphrase - Longer version of a password used to encrypt the sender's private key using a hash of the passphrase as the secret key
- Private key - Company's private key
- Counter party's public key

PGP uses a passphrase to encrypt your private key on your machine. Your private key is encrypted on your disk using a hash of your passphrase as the secret key. You use the passphrase to decrypt and use your private key. A passphrase should be hard for you to forget and difficult for others to guess.


## Step 2 - Assign Secrets in DXC encryption parameters
Assign above **Secrets** to the encryption/decryption. <br>
To open the **DXC encryption parameters** page, go to **Organization administration > Setup > DXC encryption > DXC encryption parameters**. <br>

Select **New** and set the fields as described in the following subsection.

- Enter a unique **Encryption key name**
- Select the applicable **Key type**:
    - **Encrypt** - Low level of encryption
    - **Encrypt and sign** - High level of encryption
    - **Decrypt** - Low level of decryption
    - **Decrypt and verify** - High level of decryption
- Select the applicable **Key source**: 
    - **Key vault** (default) - Azure Storage SAS URL & Azure Secrets
    - **String** - Store keys within FinOps without Azure + key vaults. Also includes option to download the public key

- Select / enter applicable values under **Pgp encryption key** FastTab. Only applicable secrets are enabled.	
    - **Encrypt**
        - Counter party's public key
        - Public key (optional for Key source String for 'Download public key')
    - **Encrypt and sign**
        - Counter party's public key
        - Private key
        - Passphrase  
        - Public key (optional for Key source String for 'Download public key')
    - **Decrypt**
        - Private key
        - Passphrase 
    - **Decrypt and verify**
        - Counter party's public key (for Key source String, this can be downloaded using 'Download counter party's public key')
        - Private key
        - Passphrase


Notes on high level: 
- If a Company is sending a file to the bank, then:
  - The company uses their Private key, bank’s Public key and Passphrase to encrypt the file before sending

- When the Bank receives the file:
  - The Bank uses their Private key, the company’s Public key and the Passphrase to decrypt the file
 
- When the Bank is sending the file to the company:
  - The Bank uses their Private key, The company’s Public key and Passphrase to encrypt and send the file to the company

- When the company receives the file:
  - The company uses their Private Key, the bank’s Public key and the Passphrase to decrypt the file
 
### Validate

Select applicable **Encryption key name**, click **Validate** which will open a dialog to browse to a file. 
- **Encrypt / Encrypt and sign** - select a file that should be encrypted, if setup is correct the encrypted file will be created that can be sent to counter party for testing.
- **Decrypt / Decrypt and verify** - select encrypted file that should be decrypted, if setup is correct a decrypted file will be created.

## Step 3 - Use Encryption in Finance utilities

Assign to Finance utilites functionality:
- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections) to decrypt a bank statement file imported using periodic task **Import bank statements via financial utilities connection**.

To enable encryption / decryption on the connection: 
 - Set **Enable file encryption/decryption** to _Yes_
 - Select applicable **Encryption key name** setup in Step 2



