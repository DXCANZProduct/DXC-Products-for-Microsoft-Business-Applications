---
# required metadata

title: [Finance Utilities ]
description: [Finance Utilities setup - Data Entities ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Data entities

## Finance utilities data entities:
Finance utilities includes the following data entities :

| **Entity**                            | **Manual setup path**   |
|-|-|
|  **Financial utilities parameters**   | Cash and bank management > Setup > Advanced bank reconciliation setup > Financial utilities parameters |
|  **Budget utilities parameters**      | Budgeting > Setup > Basic budgeting > Budget utilities parameters  |

## Standard data entities
Finance utilities have extended the following standard data entities:

| **Entity**                          | **Additional fields**                     | **Manual setup path**   |
|-                                    |-                                          |-
| **Bank accounts**                   | • BPAY batch ID <br> •	Extra balance line on EFT <br> • Include balance line in record count <br> • Total line order <br> • Use vendor bank name <br> • User identification  | Cash and bank management > Bank accounts > Bank accounts
| **Vendor bank accounts**            | • Biller code <br> • Lodgement reference <br> • Bank code <br> • Bank particulars <br> • Bank reference | Accounts payable > Vendors > All vendors - Bank accounts on Vendor FastTab
| **Reconciliation matching rules**   | • Include in <br> •	Group by document number <br> •	Offset company <br> •	Offset account type <br> •	Offset account <br> •	GST group <br> •	Item GST group | Cash and bank management > Setup > Advanced bank reconciliation setup > Reconciliation matching rules

### Bank statament format data entities
Cash and bank management > Setup > Advanced bank reconciliation setup > Bank statement format

| **Order** | **Entity**                          | **Standard / Finance utilities entity**   | **Additional fields where standard entity**                     |
|-          |-                                    |-                                          |-
| 1         | **Bank statement format**           | Standard                                  |  • Custom format (SAB_FINCUSTOMFORMAT) <br> • ABSR file type (SAB_FINFILETYPE) <br> • Field delimiter (SAB_FINFIELDDELIMITER) <br> •  Record code field position (SAB_FINFIELDPOSITION) <br> • Record code field length (DFUIMPORTLENGTHRECORDCODE) |
| 2         | **Custom line codes**               | Finance utilities                         | - 
| 3         | **Bank statement format lines**     | Finance utilities                         | - 
| 4         | **Line codes format**               | Finance utilities                         | - 
