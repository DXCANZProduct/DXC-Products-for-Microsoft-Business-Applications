---
layout: product-content
header: Care Services
toc: true
---


# Care Services Parameters

The parameters for Care Services are contained within the standard Dynamics 365 Care Services parameter form. 
Navigate to Care Services> Setup > Care Services parameter

## General
On the General tab of the Care Services parameters form, you can configure the generic type of care services business logic

### Non care services statement

When the "Use customer statement name" parameter is enabled (Yes) in Care Services Parameters, the system will use the value entered in the Customer Statement Name field in the Customer table when generating the Customer Statement.
1.	Care services billing statement.
2.	Care services accommodation payment statement.

### Payment cancellation parameter
Activate cancel payment option for summarised transactions
Selecting the Activate cancel payment option for summarised transactions allows users to cancel customer payments even when the bank transaction has been summarised into a single bank transaction.  The bank transaction will be adjusted by the amount of the cancelled payment.

### Address and contact purpose
Previous occupant update email
When a new service entry is created, the system checks to see if anyone else is being billed for charges related to that accommodation.  If a billing schedule line is found, those charges are ended, and an email is sent to advise of this.


|  **Field**  | **Description** | 
|:---|:---|     
|  Purpose | The purpose for the email address to be used is selected here. | 
|  Template  | Select the template for the email alert| 

### Reports

|  **Field**  | **Description** | 
|:---|:---|     
|  Address and contact information purpose | The purpose selected here determines which Legal entity (Organisation administration > Organisations> Legal entities) address and contact information is displayed  when populating reports, such as customer invoices and statements. The selected purpose must match a purpose that is assigned to an address on the legal entity.
|  Aged debtors report note purpose | The Care Services Aged Debtors report can include debt collection notes. Select the note type/purpose to be used for these notes here. Only includes the latest note against the customer record when the note type matches. 

### Workflows 

See [care services workflows] ({{ '/careservices/SETUP/Care-Services-workflows' | relative_url }})) for further details around set up, workflow elements and assignment types 

Billing journal workflows

|  **Field**  | **Description** | 
|:---|:---|  
|Override 'Disallow approval by submitter’ | This toggle allows a journal initiator to also be an approver.|

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

## Journals 
On the Journals tab of the Care services parameters form, you can configure naming conventions and default settings for the different types of journals used in Care Services.

### Journal names

|  **Field**  | **Description** | 
|:---|:---| 
| Billing journal | Default name for Care services billing journal residential account type | 
|  Funding journal  | Default name for Care services funding journal | 
|  Receipt journal  | Default name for Care services receipt journal | 
|  Funding reconciliation journal  | Default name for Care services funding reconciliation journal | 
| Lumpsum invoice journal  | Default name for Care services billing journal for accommodation account type | 
|  Lumpsum receipt journal  | Default name for Care services receipt journal accommodation account type | 
|  CRF Journal  | Default name for Capital Refurbishment Fees  Journal | 
|  DMF Journal  | Default name for Deferred Management Fees  Journal | 
|  Capital gain journal  | Default name for Capital Gain Journal | 
|  Funding reconciliation adj jnl  | Default name for Care services adjustment billing journal residential account type  | 
|  Refund journal  | Default name for refund journal for residential account type | 

### Journal defaults

|  **Field**  | **Description** | 
|:---|:---| 
|  Receipt journal billing account name | Default receipt account name when a new receipt journal lines is created | 
|  Billing journal billing account name  | Default billing journal lines account name when s new billing journal lines is created | 
|  Refund billing code  | Default refund billing code when new refund journal line is created | 
|  Account payable billing account code | Default billing account code for refund payment | 
|  Refund billing account name | ult billing account name for refund accommodation account type | 

## Billing
### Billing parameter
On the Billing tab of the Care services parameters form, you can configure the billing information for care services

|  **Field**  | **Description** | 
|:---|:---| 
|  Enable invoice billing functionality  | This toggle allows the billing transactions and Invoice functionality to be utilised instead of only having the billing journal functionality. This is usually used when customers have a high volume of transactions which are then combined into a single customer transaction line | 
|  Enable billing transactions invoice id  | This toggle allows invoice numbers to be automatically allocated to each billing journal line | 
|  Enable default dimensions  | This toggle allows default dimensions in the system to auto-populate on the billing journals | 
|  Enable auto journal approval  | This toggle allows billing journals to be set to approved on creation | 
|  Enable zero-dollar billing transactions  | Enable zero-dollar billing transactions – This toggle allows billing transactions where there is a zero-dollar value to be posted so that they can be included on the invoice for Customer information | 
|  Days weeks start | This is used by the Weekly & Fortnightly billing recurrences to determine which day should be used to start the period so all customers are aligned | 
|  Enable auto billing journal proposal tax invoice number  | This will allow the user to automatically create and select a new number sequence format for the billing journal proposal tax invoice | 
|  Include service group on billing journal | To show and include service group in the billing journal| 
|  HELF indexation factor | Factor for HELF | 
|  HELF index number| Index number for HELF | 

### Billing journal

|  **Field**  | **Description** | 
|:---|:---| 
|  Number of threads  | To handle the number of transactions in a batch when generating billing journal | 
|  Auto post | Auto-post the billing journal from batch processing | 

### Billing line restriction exclusion
The Billing line restriction exclusion field in the Care Service Parameters has been deprecated

### Import parameters
The Billing rate ER import mapping id  field in the Care Service Parameters has been deprecated

## Funding
###  Funding parameter

|  **Field**  | **Description** | 
|:---|:---| 
|  Enable default dimensions | Determines whether default financial dimensions are automatically assigned to funding transactions. | 
|  Enable auto journal approval | Automatically approves generated funding journals when enabled. | 
|  Support ratio reduction  | Set the supported ratio reduction to the percentage that the funding will be reduced by  | 
|  Support ratio threshold  | Set the Supported ratio threshold to the ratio set by the Department to specify the minimum percentage of supported residents required before the funding is reduced.  | 

### Subsidy
The Subsidy field in the Care Service Parameters has been deprecated

### Funding journal
Number of threads generating funding journal via the funding claim form

### Funding reconciliation

|  **Field**  | **Description** | 
|:---|:---| 
|  Billing account name user for residential billing  | Select the billing account name to be used for the billing adjustment transactions, usually MTCF, raised from the funding reconciliation | 
|  Billing code for MTCF adjustment  | Select the billing code to be used for billing adjustment transactions, usually MTCF, raised from the funding reconciliation | 

### Home care packages

|  **Field**  | **Description** | 
|:---|:---| 
|  Billing Account Name for HCP Funding  | Defines the billing account that receives Home Care Package funding from the government.Used when HCP funding claims are processed. <br> •	Records HCP funding income transactions. <br> •	Supports reconciliation of funding received. | 
|  Billing Account Name for HCP Billing | Specifies the billing account used for charging services delivered under Home Care Packages. <br> •	Generates resident or client service charges. <br> •	Links delivered services to the HCP billing ledger. <br> •	Supports invoicing and reporting. | 
|  Home Based Care Category for Income  | Determines the income category assigned to Home Care Package revenues. <br> •	Categorizes HCP income. <br> •	Supports financial reporting and analysis. <br> •	Ensures consistent classification of package funding.| 
| Billing Code for Client Unspent Finalisation | Defines the billing code used when processing final client unspent balances after package closure. <br> •	Applies during client exit processing. <br> •	Records final unspent balance adjustments.<br> •	Supports regulatory compliance. | 
|  Billing Code for ITF Adjustment  | Identifies the billing code used when Income Tested Fee (ITF) adjustments are required. <br> •	Processes ITF corrections. <br>•	Records fee amendments. <br> •	Supports financial reconciliation.| 
|  Funding Code for CW Unspent Finalisation | Specifies funding codes used when finalising Commonwealth unspent funds. <br> •	Calculates government-returnable funds. <br> •	Records Commonwealth unspent fund transactions. <br> •	Supports final package closure processes.| 
|  HCP Unspent Liability Account  | Defines the General Ledger liability account used to hold unspent Home Care Package balances. <br> •	Tracks client unspent funds. <br> •	Supports financial statements. <br> •	Maintains compliance with HCP regulations.| 
|  Unspent File Format  | Specifies the format used when exporting unspent fund information. <br> •	Generates regulatory submissions. <br> •	Produces reconciliation files. <br> •	Supports integration with external financial systems.| 
 | HCP Refund Due Days  | Defines the number of days allowed to process unspent fund refunds after package closure. <br> •	Controls refund timelines. <br> •	Supports compliance requirements. <br> •	Triggers refund monitoring processes. | 
 |  HCP Client Report Due Days  | Specifies the timeframe for issuing client reports following package events. <br> •	Supports legislative reporting obligations. <br> •	Monitors report generation deadlines. <br> •	Ensures timely client communication.| 
 |  HCP Funding Reconciliation Adjustment Account | Defines the General Ledger account used for reconciliation adjustment postings. <br> •	Records funding variances. <br> •	Supports end-of-period reconciliation. <br> •	Maintains audit traceability.| 

### Support at home
|  **Field**  | **Description** | 
|:---|:---| 
|  Billing Account Type Support at Home Funding  |Defines the billing account used to record Support at Home funding transactions received from the funding authority. <br> •	Records Support at Home funding income. <br> •	Used during funding claim processing. <br> •	Supports funding reconciliation and reporting.| 
| Billing Account Type for Client Contributions  | Defines the billing account used to record client contribution charges. <br> •	Posts client contributions to the appropriate ledger account. <br> •	Supports invoicing and payment tracking. <br> •	Separates government funding from client-funded amounts.  | 
|  *Billing Code for Client Contributions  | Specifies the billing code used when charging client contribution fees. <br> •	Generates client contribution transactions. <br> •	Identifies contribution charges in reports and invoices. <br> •	Supports financial tracking and auditing.  | 
|  Billing Code for Client Contribution Adjustments| Defines the billing code used when correcting or adjusting previously charged client contribution amounts. <br> •	Processes refunds or corrections. <br> •	Adjusts billing errors. <br> •	Manages retrospective fee changes. | 
|  Maximum Funding Claims on Funding Claim Form  | Determines the maximum number of funding claim lines that can be included on a single funding claim form. <br> •	Controls claim form size. <br> •	Improves claim processing efficiency. <br> •	Supports compliance with funding submission requirements.  | 

## Capping limits
### Capping limits setup

|  **Field**  | **Description** | 
|:---|:---| 
|  Allow Charge Beyond Capping Limits | Controls whether service charges can continue after a resident reaches their annual or lifetime capping limit. | 
|  Auto Create Client Capping | Automatically creates capping records for new residents or clients requiring capping management | 
|  Annual Capping Limit  | Defines the annual contribution threshold that a resident can be charged within a financial year | 
|  Lifetime Capping Limits  | Specifies the lifetime capping limit configuration used by the system. | 
|  Total Years of Billing for NCCC  | Determines the number of years used when calculating contribution caps under the NCCC billing framework. | 

## Accommodation payment 
### Interest Rate Setup

|  **Field**  | **Description** | 
|:---|:---| 
|  Interest Payable Billing Account Name  | Defines the billing account used to record accommodation payment interest charges. | 
|  Allow Agreed Amount to Exceed Accommodation Price  | Determines whether the agreed accommodation payment amount can be higher than the published accommodation price. | 
|  DAP Consumer Price Index %*  | Specifies the Consumer Price Index (CPI) rate used to calculate Daily Accommodation Payments (DAP). <br> •	Supports DAP interest calculations. <br> •	Applies CPI adjustments where required. <br> •	Maintains current accommodation pricing calculations.| 

### Accommodation Payment Transactions

|  **Field**  | **Description** | 
|:---|:---| 
|  Include Transactions Up To  | Determines the historical transaction period included when processing accommodation payment calculations. | 

### Accommodation Payment Types

|  **Field**  | **Description** | 
|:---|:---| 
|  Accommodation Bond  | Defines the accommodation bond payment category used for legacy bond arrangements. | 
|  RAD/DAP | Specifies the accommodation payment type used for	Refundable Accommodation Deposits (RAD)  and Daily Accommodation Payments (DAP) <br> •	Calculates daily accommodation fees. <br> •	Tracks resident accommodation arrangements.| 
|  Concessional  | Used for residents classified under concessional accommodation arrangements. <br> •	Applies concessional accommodation rules. <br> •	Supports government-funded accommodation programs.| 
|  Fully Supported  | Identifies residents eligible for full accommodation support. <br> •	Exempts residents from accommodation payment obligations where applicable. <br> •	Applies government-supported accommodation funding.| 
|  Partially Supported – Assisted | Defines accommodation charges for partially supported residents receiving assisted accommodation support. <br> •	Calculates resident accommodation contributions. <br> •	Supports mixed funding arrangements.| 
|  Partially Supported – RAC/DAC  | Specifies billing treatment for partially supported residents under RAC/DAC accommodation arrangements. <br> •	Tracks accommodation subsidies. <br> •	Supports accommodation funding calculations. | 
|  Accommodation Charge – Assisted  | Defines accommodation charge billing rules for assisted residents. <br> •	Generates accommodation charge transactions. <br> •	Supports resident billing. | 
|  Full Accommodation Charge  | Used when residents are responsible for the entire accommodation payment amount. <br> •	Applies full accommodation fees. <br> •	Generates accommodation invoices. | 
|  Ingoing Contribution  | Defines the billing category used for resident ingoing contributions. <br> •	Records entry contributions. <br> •	Supports accommodation funding administration.|
|  Supported / Accommodation Payment  | Defines the billing type used when accommodation is supported through funding assistance programs. <br> •	Identifies subsidised accommodation arrangements. <br> •	Supports government funding reporting. |

### Import parameters
The Accommodation Payment Line ER Import Mapping  field in the Care Service Parameters has been deprecated

### Retentions

|  **Field**  | **Description** | 
|:---|:---| 
|  Annual Retention Rate  | Defines the annual retention percentage applied to accommodation deposits. <br> Example <br> Retention Rate: 2% <br> Accommodation Deposit: $100,000 <br> Annual Retention: <br> $100,000 × 2% = $2,000  | 
|  Retention Capped Years  | Defines the maximum number of years retention amounts can be applied. <br> Example <br> If retention is capped at 5 years: <br> •	Retention applies annually for five years. <br> •	No additional retention is charged after the fifth year.| 
|  Allow Negative Lump Sum Balance  | Determines whether accommodation lump sum balances can become negative. | 
|  Default Retention Billing Account Type  | Specifies the default billing account used when retention transactions are generated. <br> •	Posts retention charges automatically. <br> •	Supports financial reporting and auditing.| 

## Services
### Set up services for care services

|  **Field**  | **Description** | 
|:---|:---| 
|  Departure Reason – Inactive  | Specifies the default departure reason used when a resident or client is marked as inactive. | 
|  Enable Place Address Transfer  | Controls whether address information is automatically transferred between resident records and related place records. | 
|  Default Place Address Purpose  | Determines the default address purpose assigned when a new place address is created. | 
|  Default deprecated address purpose  | Select the default purpose of the deprecated address  on client transfer | 
|  Calculate Current Service Entry  | Determines whether the system automatically calculates a resident's current service entry status.| 
|  Enable Service Listing Syncing  | Controls whether service listings are synchronised automatically with related care service records.| 


## Services Australia Integration
### PRODA Connection Profile 
Defines the environment-specific connection used for Services Australia integration.

|  **Field**  | **Description** | 
|:---|:---| 
|  New   | Create a new PRODA connection profile | 
|  Delete   | Remove an existing profile | 
|  Validate Key Vault Connection  | Verify access to authentication certificates and secrets. | 
|  Activate Device   | Register and activate the device for PRODA communication | 
|  PRODA connection profile  | Defines the environment-specific connection used for Services Australia integration. | 
|  Organisation ID  | Identifies the registered organisation within PRODA and Services Australia. | 
|  Device Name   | Identifies the registered integration device used to communicate with Services Australia.* | 
|  Device Expiry   | Displays the expiration date of the registered device certificate. | 

### General
|  **Field**  | **Description** | 
|:---|:---| 
|  Auth  | Select the authentication profile to be used for this connection. | 
| Config  | Choose the configuration settings associated with the profile. | 
|  Product   | Select the Services Australia product configured above. | 
|  Base URL   | Aged care API endpoint | 
|  Override HTTP Timeout   | Determines whether a custom timeout value will be used instead of the system default | 
|  Timeout in Seconds   | Specifies the maximum amount of time allowed for an API response. | 
|  Batch Jobs   | Defines the number of parallel batch tasks used when processing Services Australia transactions. | 

## Print management
The Print Management displays available Care Services documents and their associated print settings.
The following document types are available for configuration:
<br> •	Care Services Accommodation Payment Statement
<br> •	Care Services Billing Statement
<br> •	Care Services Statement

