---
# required metadata

title: Forex contract
description: Cash in Forex contract
author: jdutoit2
manager: Kym Parker
ms.date: 2022-04-11
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SAB_ForexContractTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: 
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
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

