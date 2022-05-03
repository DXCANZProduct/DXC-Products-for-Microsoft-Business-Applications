---
# required metadata

title: [Forex contract]
description: [Cash in Forex contract]
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

# Cash in Forex Contract

Once the Forex contract has expired, users can post the cash in journal for the Remaining amount. <br>
The Forex contract’s **Bank account** or **Vendor account** is used in the journal, and as such user will receive an error if neither of these has been filled in when cashing in the remainder of the forex contract. If both **Bank account** and **Vendor account** are filled, **Bank account** field will be used in the cash in journal. <br>
When the system creates the cash in journal, it debits and credits different bank accounts. Therefore, you must set up your system so that a single voucher can have multiple bank lines. 
1.	Go to **General ledger > Ledger setup > General ledger parameters**.
2.	On the **Ledger** tab, on the **General** FastTab, set the **Allow multiple transactions within one voucher** option to Yes.
3.	If you receive a warning message, select **Close** to accept the change.

The outcome of cashing in the forex contact is a general journal created (or posted) using the **Name** as setup in **Forex contract parameters** field **Cash in journal**. <br>
The Forex contract’s **Bank account** or **Vendor account** is credited and **Cash in bank account** debited by the **Remaining amount** and **Exchange rate** as per the forex contract. <br>
The Forex contract’s **Status** will also be set to _Cashed in_.

Cash in transaction can be achieved by either of the following:
-	Per forex contract
-	Periodic task for all expired and open (not cashed in) forex contracts

## Forex contract

Go to **Forex contracts > Forex contracts > All forex contracts**

-	Select the applicable **Forex number**
-	On the Action Pane, on the **Forex contracts** tab, in the **Manage** group, select **Cash in forex contract**.
-	Select if the created cash in journal should be posted in **Post now**.
-	Select **OK**.

> Note: If the forex contract has not expired, the journal will not be created and will error with **Contract has not expired**

## Periodic task

Go to **Forex contracts > Periodic tasks > Cash in forex contract**

-	Select if the created cash in journal(s) should be posted in **Post now**.
-	Set the **Recurrence** (if applicable).
-	Select **OK**.

> Note: One journal will be created with a line per Forex contract cashed in.

