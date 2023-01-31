---
# required metadata

title: Finance Utilities 
description: Encryption / decryption
author: jdutoit2
manager: Kym Parker
ms.date: 2023-01-31
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
Encryption / Decryption is available utilising the 'DXC Encryption' model.

Once below has been setup, the functionality can be used on the following Finance utilities functionality:
- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md) to decrypt a bank statement file.

## Step 1
Setup the following as **Secrets** in **Key vault parameters** for the encryption/decryption:
- Phassprase
- Private key
- Public key
- Signer's public key

## Step 2
Assign above **Secrets** to the encryption/decryption. <br>
To open the **DXC encryption parameters** page, go to **Organization administration > Setup > DXC encryption > DXC encryption parameters**. <br>

Select **New** and set the fields as described in the following subsection.

Field                       | Description                         
:--                         |:--                        
**Encryption key name**     | Enter a unique name for the encryption
**Passphrase**              |	Select the applicable **Secret** from **Key vault parameters**
**Private key**             |	Select the applicable **Secret** from **Key vault parameters**
**Public key**              |	Select the applicable **Secret** from **Key vault parameters**
**Signer's public key**     |	Select the applicable **Secret** from **Key vault parameters**

## Step 3

Assign to Finance utilites functionality:
- Encrypt option on [Electronic reporting export connections](../ACCOUNTS-PAYABLE/Save-electronic-reporting-file-to-secure-location.md) to send encrypted GER Vendor EFT files
- Decrypt option on [Financial utilities connection](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections.md) to decrypt a bank statement file.

Setup: 

Field                       | Description                         
:--                         |:--                        
**Enable file encryption/decryption**     | Set to _Yes_
**Encryption key name**                   | Select applicable **Encryption key name** setup in Step 2
