---
# required metadata

title: Finance Utilities 
description: Encryption / decryption
author: jdutoit2
manager: Kym Parker
ms.date: 2024-03-05
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCEncryptionParameters
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

# Encryption / Decryption
Encryption / Decryption is available utilising the **DXC Encryption** model.

Once below has been setup, the functionality can be used on the following Finance utilities functionality:
- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md) to decrypt a bank statement file imported using periodic task **Import bank statements via financial utilities connection**


## Step 1 - Setup Secrets in Key vault parameters
Setup the following as **Secrets** in **Key vault parameters** for the encryption/decryption:
- Phassprase - Longer version of a password used to encrypt the sender's private key using a hash of the passphrase as the secret key
- Private key - Sender's private key
- Public key -  Sender's public key
- Receiver's public key - Receiver's public key (used for decryption)

Files are encrypted and signed with the sender's private key, receiver's public key, and the pass phrase. <br>
Files are verified and decrypted with the recipient's private key, sender's public key and the pass phrase.

PGP uses a passphrase to encrypt your private key on your machine. Your private key is encrypted on your disk using a hash of your passphrase as the secret key. You use the passphrase to decrypt and use your private key. A passphrase should be hard for you to forget and difficult for others to guess.

> Note: It's recommended to for the Private key, Public key, Receiver’s public key use Azure Storage SAS URL with read only access stored in the keyvault secrets. The SAS url points to the file and includes the token to access it.

## Step 2 - Assign Secrets in DXC encryption parameters
Assign above **Secrets** to the encryption/decryption. <br>
To open the **DXC encryption parameters** page, go to **Organization administration > Setup > DXC encryption > DXC encryption parameters**. <br>

Select **New** and set the fields as described in the following subsection.

Field                       | Description                         
:--                         |:--                        
**Encryption key name**     | Enter a unique name for the encryption
**Passphrase**              |	Select the applicable **Secret** from **Key vault parameters**
**Private key**             |	Select the applicable **Secret** from **Key vault parameters**
**Public key**              |	Select the applicable **Secret** from **Key vault parameters**
**Receiver's public key**     |	Select the applicable **Secret** from **Key vault parameters**

## Step 3 - Use Encryption in Finance utilities

Assign to Finance utilites functionality:
- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md) to decrypt a bank statement file imported using periodic task **Import bank statements via financial utilities connection**.

Setup: 

Field                       | Description                         
:--                         |:--                        
**Enable file encryption/decryption**     | Set to _Yes_
**Encryption key name**                   | Select applicable **Encryption key name** setup in Step 2
