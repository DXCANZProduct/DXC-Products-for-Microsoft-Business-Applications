---
# required metadata

title: DXC Care Services 
description: Care Services Parameters
author: Peter Musumeci 
Manager: Pontus Ek
ms.date: 2026-07-09
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci 

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-03-31
ms.dyn365.ops.version: 365 FSCM
---


# Care Services Parameters

The setup and configuration parameters for Care Services are available in the Dynamics 365 Care Services parameter form. 
Navigate to **Care Services> Setup > Care services parameters**

## General
The General tab of the Care Services Parameters form allows you to configure generic elements of care services business logic.

### Non-care services statement

When the "Use customer statement name" parameter is enabled (Yes) in Care Services Parameters, the system will use the value entered in the *Customer Statement Name* field on the customer record when generating Customer Statements. This allows clients to have a preferred/personlaised  name displayed, such as Matt Trakker, instead of Mr Matthew C. Trakker. 
This applies to the following statements.
1.	Care services billing statement.
2.	Care services accommodation payment statement.

### Payment cancellation parameter
**Activate cancel payment option for summarised transactions** <br>
When a user performs a direct debit run, there is an option to have all payments summarised into a single line on the bank reconciliation page. When this option is enabled (Yes), users can reverse individual customer payments from the bank reconciliation amount even if those payments have been summarised into a single bank transaction line. The value of any cancelled payment will reduce the amount of the corresponding bank reconciliation line, even if that line has already been reconciled.

### Address and contact purpose
Previous occupant update email
When a new Service entry is created, the system checks whether any other customers are currently being billed for charges related to that accommodation or "Service". If a billing schedule line is found, those charges are subsequently ended, and an email notification is sent to the corresponding contact with a matching purpose to advise of this.


|  **Field**  | **Description** | 
|:---|:---|     
|  Purpose | The purpose assigned to the email contact for the relevant Service (Care services > Setup > Service > All services > ) | 
|  Template  | Specifies the pre-configured email template from Organisation email templates (Organisation administration > Setup > Organisation email templates) to be used for the email notification. | 

### Report

Address and contact information purpose
The purpose selected here informs the system which legal entity address and contact information should be used when these are populated on reports such as Customer invoice/statements


Aged debtors report note purpose
The Care services aged debtors report can include debt collection notes.  The note type/purpose is selected here

### Workflow
Billing journal workflows

|  **Field**  | **Description** | 
|:---|:---|  
|Override 'Disallow approval by submitter’ | This toggle allows an initiator of a journal to also be an approver.|

Billing journal line workflows

|  **Field**  | **Description** | 
|:---|:---|  
| Auto approve lines created from billing journal proposals | Auto approve lines created from billing schedules – This toggle allows the system to set the approved flag to Yes for all system-generated billing journal lines on creation |
|Override 'Disallow approval by submitter'|This toggle allows an initiator of a journal line to also be an approver.|


Billing schedule workflows

|  **Field**  | **Description** | 
|:---|:---| 
| Enable billing schedule workflow | Use this toggle to turn the Billing schedule workflow on or off |
| Override 'Disallow approval by submitter' | This toggle allows an initiator of a Billing schedule line to also be an approver. |

## Journal 
On the Journal tab of the Email parameters form, you can configure the journal information for care services

Journal names

|  **Field**  | **Description** | 
|:---|:---| 
| Billing journal | Default name for Care services billing journal residential account type | 
|  Funding journal  | Default name for Care services funding journal | 
|  Receipt journal  | *Default name for Care services receipt journal | 
|  Funding reconciliation journal  | Default name for Care services funding reconciliation journal | 
| Lumpsum invoice journal  | Default name for Care services billing journal for accommodation account type | 
|  Lumpsum receipt journal  | Default name for Care services receipt journal accommodation account type | 
|  CRF Journal  | Default name for Care service CRF Journal | 
|  DMF Journal  | Default name for Care service DMF Journal | 
|  Capital gain journal  | Default name for Capital Gain Journal | 
|  Funding reconciliation adj jnl  | Default name for Default name for Care services adjustment billing journal residential account type  | 
|  Refund journal  | Default name for refund journal for residential account type | 

Journal defaults

|  **Field**  | **Description** | 
|:---|:---| 
|  Receipt journal billing account name | Default receipt account name when a new receipt journal line is created | 
|  Billing journal billing account name  | Default billing journal lines account name when s new billing journal lines is created | 
|  Refund billing code  | Default refund billing code when new refund journal line is created | 
|  Account payable billing account code | Default billing account code for refund payment | 
|  Refund billing account name | ult billing account name for refund accommodation account type | 


