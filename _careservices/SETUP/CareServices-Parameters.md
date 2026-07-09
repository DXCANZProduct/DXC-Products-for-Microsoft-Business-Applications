---
layout: product-content
header: Care Services
toc: true
---


# Care Services Parameters
The parameters for Care Services are contained within the standard Dynamics 365 Care Services parameter form. 
Navigate to Care services > Setup > Care services parameter

## General
On the General tab of the Email parameters form, you can configure the generic type of care services business logic

### Non care services statement

When the "Use customer statement name" parameter is enabled (Yes) in Care Services Parameters, the system will use the value entered in the Customer Statement Name field in customer table when generating the Customer Statement.
1.	Care services billing statement.
2.	Care services accommodation payment statement.

### Payment cancellation parameter
Activate cancel payment option for summarized transactions
Selecting the Activate cancel payment option for summarized transactions allows users to cancel customer payments even when the bank transaction has been summarized into a single bank transaction.  The bank transaction will be adjusted by the amount of the cancelled payment.

### Address and contact purpose
Previous occupant update email
When a new service entry is created the system checks to see if anyone else is being billed for charges related to that accommodation.  If a billing schedule line is found those charges are ended and an email is sent to advise of this.


|  **Field**  | **Description** | 
|:---|:---|     
|  Purpose | The purpose for the email address to be used is selected here. | 
|  Template  | Select the template for the email alert| 

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
| Auto approve lines created from billing journal proposals | Auto approve lines created from billing schedules – This toggle allows the system to set the approved flag to Yes for all system generated billing journal lines on creation |


|  **Field**  | **Description** | 
|:---|:---|  
|Override 'Disallow approval by submitter'|This toggle allows an initiator of a journal line to also be an approver.|


Billing schedule workflows
|  **Field**  | **Description** | 
|:---|:---| 
| Enable billing schedule workflow | Use this toggle to turn the Billing schedule workflow on or off |
| Override 'Disallow approval by submitter' | This toggle allows an initiator of a Billing schedule line to also be an approver. |
