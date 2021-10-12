---
# required metadata

title: [Finance Utilities]
description: [Cash and bank management setup - Bank reconciliation matching rules]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Finance Utilities-Bank Reconciliation Matching Rules ]
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

# Advanced bank reconciliation functionality
The fields as described in the following subsections are available to control the additional functionality for advanced bank reconciliation.

## Setup
### Bank Reconciliation Matching Rules
#### Group by document number

D365 standard does not have the capability to match one transaction in the bank statement to multiple transactions in the D365 Bank Transactions that have the same **Journal id** or **Cheque number**. This Finance utilities functionality extends the automatic reconciliation matching rules by adding **Group by document number** to Reconciliation matching rules with Action **Match with bank statement** in 'Step 1: Define the matching rule'.

The feature can be activated from **Cash and bank management > Setup > Advanced bank reconciliation setup > Reconciliation matching rules**

| Field | Description |
|-|-|
| **Group by document number** | This feature combines the D365 bank transactions amount that have the **same Document number** (populated with the Journal id or check number) during the Bank reconciliation process, from **Run matching rules.** |

#### Matching Parameter - Included In
If the **Financial utilities parameter**'s **Extended matching rule operator** is set to _Yes_, the option **Included in** is available for selection in 'Step 1: Define the matching rule'. 

When the Operator **Included in** is selected, D365 checks whether the value of **Field** is included in the value of the **Statement fields**.

-	**Contains** (which is STD) means that the field Payment Reference in D365 _contains_ the value of the Payment reference in the Bank File.
-	**Included in** heading means that the field Payment Reference in D365 is _included as a part of the value_ of the Payment reference in the Bank File.

**Included in** example:

|    Basic Criteria   |    Yes or No   |
|-|-|
|   Match Amount  |  Yes  |
|   Match Date  |  Yes  |
|   Match Document Number  |  No  |
|   Match Transaction Type  |  No  |
|   Match Payment Reference |  No  |

|    Field   |    Operator   |    Included in   |    Value   |    Statement Fields   |
|-|-|-|-|-|
|   Payment reference  |  Contains  |  Tick  |    |  Document number  |

|    Source           |   Matched   | Booking Date |   Debit   |   Credit   |   Bank Trx Type  |   Document number      |
|-                    |:-:          |-             |-          |-           |-                 |-                       |
| D365 Bank Trx       |             |              |           |            |                  |                        |
| **Line 1**          | X           |  14/01/2018  |           | 1000       | 01               | **AAU1367611**         |
| Line 2              |             |  14/01/2018  |           | 1000       | 01               | AAU1367612             |
| Bank Statement Trx  |             |              |           |            |                  |                        |
| **Line 1**          | X           |  14/01/2018  |           | 1000       | 699              | CBA pmt **AAU1367611** |
| Line 2              |             |  14/01/2018  |           | 1000       | 699              | CBA pmt AAU1367613     |

In this example, when the above Reconciliation Matching rule is run, D365 Bank Transactions Line 1 will be matched with Bank Statement Transactions Line 1 because the **Document number** value “AAU1367611” is included in the value of the field Reference No “CBA pmt AAU1367611”.

#### Mark as New - Additional defaults

If the **Financial utilities parameter**'s **Extended financial details for new transaction** parameter is set to _Yes_, the option to capture the following details automatically for **Mark as new** bank statement lines can be selected.
-	Financial dimensions 
-	GST
-	Sub-Ledger offset account

|    Field / Button   |    Description   |
|-|-|
| **Financial Dimensions > Offset account**  |  Financial dimensions that have to be used to post the _new_ transactions. <br> If the dimensions are filled in, it will override the financial dimensions set by default on the selected main account. <br> Else, financial dimensions set by default on the selected main account will apply with the new transaction. |
| **Offset Company Account**  | Defaults to the current legal entity. <br> Populates the new field Offset Company Account in the Bank Statement Line Details form when a Line – marked as New – is created.           |
| **Offset Account type**   | Populates the new field Offset Account Type in the Bank Statement Line Details form when a **Mark as new** line is created. <br> Note: This field defaults to Ledger; Extended financial details only support offset account type _Ledger_, _Customer_ and _Vendor_.          |
| **Offset Account**   |  Populates the new field Offset Account in the Bank Statement Line Details form when a **Mark as new** line is created.   |
| **GST Group**   |  Populates the field GST group in the Bank Statement Line Details form when a **Mark as new** line is created.   |
| **Item GST Group**    |  Populates the field Item GST group in the Bank Statement Line Details form when a **Mark as new** line is created   |
