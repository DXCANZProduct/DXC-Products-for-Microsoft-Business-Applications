---
# required metadata

title: [Forex contract]
description: [Create Forex contract]
author: [jdutoit2]
manager: Kym Parker
ms.date: 11/04/2022
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

# Create a Forex contract

Go to **Forex contracts > Forex contracts > All forex contracts**. <br>
To create a new record, select the **New** button in the navigation bar and enter the following details. <br>


**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
<ins>**Contract**</ins>           |
**Forex number**	                | If you’ve set up a number sequence for forex number, this field is automatically set to a unique, system generated ID. Otherwise, enter a unique ID
**Contract number**               | Bank’s contract number
**Description**                   |	Short description of the Forex Contract
**Status**                        |	•	**Open** - Default when creating new contract. Contract is available to be linked to orders if expiration date is still in the future <br> •	**Cashed in** – Once the expiration date has been reached, users can cash in the contract and the status will be updated accordingly
**Exchange rate**                 |	Forex Contract forward rate
**Fee**                           |	The amount of fee that is related to the Forex contract
<ins>**Currencies**</ins>         |
**Base currency**                 |	The currency used to purchase the foreign currency. The base currency is normally the local currency within D365 and thus the default.
**Terms currency**                |	The terms currency is the currency which is being purchased
<ins>**Amounts**</ins>            |
**Amount**                        |	The amount in terms currency that is going to be purchased
**Base currency amount**          |	The amount in base currency amount used to purchase the terms currency. This field is calculated by D365 based on **Amount** and **Exchange rate** fields.
**Unallocated amount**            |	The remaining amount in terms currency of Forex contracts. This is the amount which has not yet been allocated to any documents.
**Settled amount**                |	The settled amount in terms currency of Forex, this is the amount of Forex which has been allocated to invoices or vendor transactions.
**Remaining amount**              |	The remaining amount in terms currency of Forex, this is the amount which hasn’t yet been used. The difference between **Amount** and **Settled amount**
<ins>**Contract period**</ins>	  |
**Date**                          |	The Forex Contract date
**Fixed term period**             |	The Forex contract might cover a fixed period, i.e. 90 days or 6 months.  Options include: Day, Week, Month, and Year. 
**Fixed term value**              |	Numeric value of the units defined in Fixed term period field
**Expiration date**               |	The Forex contract’s expiry date. It could either be calculated using Date, Fixed term period and Fixed term value fields or be manually input.
<ins>**Other**</ins>              |
**Bank account**                  |	Bank account with which the Forex Contract was made
**Allow overallocation**          |	Indicate whether the allocated amount of Forex contracts can exceed the contract value
**Vendor account**                |	If the Contract was purchased from a vendor this can be specified here
**Dealer reference**              |	Dealer information field
**Cash in bank account**          | Defaults from Forex parameters
**Remarks**                       |	A text field which allows extra bank / vendor information to be specified
<ins>**Spot**</ins>               |
**Exchange rate**                 |	Spot exchange rate on the contract day
**Spot rate amount**              |	Calculated based on previous Exchange rate field, else the current rate as setup in General ledger.
**Premium**                       |	The difference between **Spot rate amount** and **Base currency amount**
<ins>**Cash in**</ins>	          |
**Cash in journal number**        |	Once the Forex contract has been cashed in, this field will be populated with the created journal number.

