---
layout: product-content
header: Finance Utilities
toc: true
---

# Encryption / Decryption

Encryption / Decryption is available utilising the **DXC Encryption** model.

Once below has been setup, the functionality can be used on the following Finance utilities functionality:

- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md) to decrypt a bank statement file imported using periodic task **Import bank statements via financial utilities connection**

## Step 1 - Setup Secrets in Key vault parameters

Setup the following as **Secrets** in **Key vault parameters** for the encryption/decryption:

- Phassprase - Longer version of a password used to encrypt the sender's private key using a hash of the passphrase as the secret key
- Private key - Company's private key
- Counter party's public key

PGP uses a passphrase to encrypt your private key on your machine. Your private key is encrypted on your disk using a hash of your passphrase as the secret key. You use the passphrase to decrypt and use your private key. A passphrase should be hard for you to forget and difficult for others to guess.

> Note: It's recommended to for the Private key, Public key, Receiver’s public key use Azure Storage SAS URL with read only access stored in the keyvault secrets. The SAS url points to the file and includes the token to access it.

## Step 2 - Assign Secrets in DXC encryption parameters

Assign above **Secrets** to the encryption/decryption. <br>
To open the **DXC encryption parameters** page, go to **Organization administration > Setup > DXC encryption > DXC encryption parameters**. <br>

Select **New** and set the fields as described in the following subsection.

- Enter a unique **Encryption key name**
- Select the applicable **Key type** and select the applicable secrets setup in step 1 under **Pgp encryption key** FastTab. Only applicable secrets are enabled.
  - **Encrypt** - Low level of encryption
    - Counter party's public key
  - **Encrypt and sign** - High level of encryption
    - Private key
    - Counter party's public key
    - Passphrase
  - **Decrypt** - Low level of decryption
    - Private key
    - Passphrase
  - **Decrypt and verify** - High level of decryption
    - Private key
    - Counter party's public key
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

## Step 3 - Use Encryption in Finance utilities

Assign to Finance utilites functionality:

- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md) to decrypt a bank statement file imported using periodic task **Import bank statements via financial utilities connection**.

To enable encryption / decryption on the connection:

- Set **Enable file encryption/decryption** to _Yes_
- Select applicable **Encryption key name** setup in Step 2
