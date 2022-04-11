---
# required metadata

title: [Forex contract]
description: [Introduction to Forex contract]
author: [jdutoit2]
manager: Kym Parker
ms.date: 08/04/2022
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Forex contract]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Introduction to DXC Forex contract

The Forex contract module is designed to allocate Forex contracts to purchase orders and invoice journals. <br>
The amounts in inventory/vendor accounts will be calculated based on the attached Forex contract forward rate. <br>
<br>

Goods are imported from another country by the company. Payment in foreign currency is going to be made in a certain period. <br>
To hedge the exchange rate risk, the company enters into a contract with bank to purchase the foreign currency at a certain exchange rate on the payment due date. <br>
The contract between the company and the bank is called a Forex contract.

## Setup
The following setup is required per legal entity.

- [Forex contract parameters](SETUP/Forex-contract-parameters.md)
- [Forex over allocation](SETUP/Forex-over-allocation.md)


## Processing
The following describes using the Forex contract functionality.

- [Create forex contract](PROCESSING/Create-forex-contract.md)


## Other

### Data entities
Forex contract include data entities to support its enhancements to D365.

- [Data entities](SETUP/Data-entities.md)

### Security configuration

The following roles are included in the Forex contract module: 
-	**Forex manager** – manages forex contract setup
- **Forex contracts clerk** – creates and maintains forex contracts
