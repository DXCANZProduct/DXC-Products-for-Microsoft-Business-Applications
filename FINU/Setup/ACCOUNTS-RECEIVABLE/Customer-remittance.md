---
# required metadata

title: DXC Finance Utilities - AR Utilities
description: Customer remittance setup
author: jdutoit2
manager: Kym Parker
ms.date: 2023-04-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology:  

# optional metadata

ms.search.form:  CustParameters, DXCARRemittanceFormat, CustPaymMode, DXCARConnection
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Customer remittance setup
The fields as described in the following subsections are available to control the functionality for customer remittance import available in additional licensed feature **Finance utilities - AR utilities**.

> Note: The fields are only available where additional licensed feature **Finance utilities - AR utilities** is enabled.

## Accounts receivable parameters

The **Accounts receivable parameters** page contains additional fields used to define settings that apply to Customer remittance functionality.

To open the page, navigate to **Accounts receivable > Setup > Accounts receivable parameters** and select the **Settlement** tab.<br>
Then set the fields as described in the following subsections.

**Field** | **Description**   
:--       |:--
**Create prepayment**                   | When set to _Yes_ customer payment journal line(s) that aren't settled against a D365 invoice, will be created as a prepayment. 
**Auto post customer payment journal**  | When set to _Yes_ the created cusomer payment journal will be automatically posted.
**File attachment document type**       | Select applicable document type. When populated, the import file will be attached to the created customer payment journal. <br> Ensure the file extension is setup in all applicable legal entities File types in Document management parameters.

## Remittance format

The **Remittance format** page will be used to set the format of the import file. <br>
The format is used for **Customer remittance import** and **Direct debit returns**.

To open the page, navigate to **Accounts receivable > Payments setup > Remittance format**.<br>
See the following [page](Remittance-format.md) for setup information.


## Methods of payment
The **Methods of payment** page contains additional fields used to define settings that apply to Customer remittance functionality.

To open the page, navigate to **Accounts receivable > Payment setup > Methods of payment** and select the **General** FastTab.<br>
Then set the fields under **Import payments processing** as described in the following subsections.

**Field** | **Description**   
:--       |:--
**Error account customer**  | Where the D365 customer account can't be found, use this customer account to create the customer payment journal line
**Settle transaction**      | When set to _Yes_ and the invoice can be found in D365, the invoice number will be populated on the customer payment journal line.
**Posting date**            | Select the applicable posting date to be used for customer payment journal lines, options include:  <br> •	Remittance transaction date <br> •	Today’s date
**Reference number type**   | Where [Customer references](Customer-reference.md) are used to find the applicable D365 customer account, select the applicable Reference number type to use in the lookup. 
**Remittance format**       | Select the applicable [Remittance format](Remittance-format.md) that will be used when importing the file.

## Financial utilities connection

The Accounts receivable **Financial utilities** page will be used to set the connection where the import file will be found. <br>
The connections are used for **Customer remittance import** and **Direct debit returns**.

To open the page, navigate to **Accounts receivable > Payments setup > Financial utilties connection**.<br>
See the following [page](Finance-utilities-connections.md) for setup information.

## Periodic task

After all the setup has been completed the periodic task can be set using **Accounts receivable > Periodic tasks > Payment journal import**

**Field** | **Description**   
:--       |:--
**Name**              | Select the applicable **Financial utilities connection**. <br> Setup in Accounts receivable > Payments setup > Financial utilties connection
**Method of payment** | Select the applicable **Method of payment**. <br> This will be used to find the Remittance format used to map the file and other setup utilitised in creating the customer payment journal.

## Processing

Processing the Customer remittance is discussed [here](../../Processing/Accounts-Receivable/Customer-remittance.md)


