---
layout: product-content
header: Finance Utilities
toc: true
---

# Customer remittance import 

The functionality as described in the following subsections relates to customer remittance import available in additional feature **Finance utilities - AR utilities**. <br>
If you are licensed for Finance Utilities, this extra feature can be added to your license on request.

## Functionality

Customer remittance import includes the following functionality:
- Periodic import of customer remittance file from ftp, sftp or Azure blob storage.
- Decryption of import files supported.
- Remittance custom format mapping.
- Composite entity Customer payment journal is used, and standard DMF validation and error handling applies.
- One import file creates one customer payment journal. Each line in the import file creates one line in the customer payment journal.
- Options per legal entity:
    - Automatically post created customer payment journal
    - Create prepayment. 
        - When set to _Yes_ and an invoice isn't settled, the payment journal line will be created as a prepayment.
        - When set to _No_ and an invoice isn't settled, check if automatic settlement is allowed.
            - Automatic settlement allowed: Feature will apply automatic settlement
            - Automatic settlement not allowed: Payment journal line will be created without settling an invoice, and not created as prepayment. 
    - Ability to attach original import file to created customer payment journal
- Options per methods of payment: 
    - If D365 customer account can't be found (by using customer reference number or invoice), option to create the payment journal line using the Error customer account.
    - Settle transaction. When set to _Yes_, the functionality will attempt to settle the payment line against an open invoice for the customer. Also see prepayment options per legal entity **
    - Customer payment journal line date can use one of the following:
        - Remittance transaction date
        - Today's date
    - Remittance file format
- Ability to use the following methods to obtain D365 customer account:
    - Customer reference number
    - Invoice number
    - If D365 customer account can't be found, the functionality will create the line against the Error customer account setup on the method of payment
- Filter on customer payment journal to view journals created via the periodic task.

## Assumptions
The following assumptions apply to the functionality:
- An invoice will only be referenced once in the import file

## Prerequisites
The following setup are prerequisites for the Customer remittance import

1. [Accounts receivable parameters](../Setup/Customer-remittance#accounts-receivable-parameters)
2. [Remittance format](../Setup/Remittance-format)
3. [Methods of payment](../Setup/Customer-remittance#methods-of-payment)
4. [Financial utilities connection](../Setup/Finance-utilities-connections)
5. [Periodic task](../Setup/Customer-remittance#periodic-task)
6. [Customer references](../Setup/Customer-reference) - if customer references are to be used to find the applicable D365 customer account

## Processing

When the file is imported using the [periodic task](../Setup/Customer-remittance#periodic-task), AR Utilities converts the data as per setup and creates an import using Data management composite entity **Customer payment journal**.

If the journal hasn't been created, review **Execution details** in Data management Job history.

<ins>**Customer payment journal filter**</ins>

Filter **Imported via financial utilities connection** on the **Customer payment journal**, provides users with the ability to filter to journals imported via the periodic task.

<ins>**Customer payment journal document handling**</ins>

Import file is attached where Accounts receivable's **File attachment document type** is populated.

<ins>**Customer payment journal values**</ins>

Below section describes where each value on the Customer payment journal is sourced from.


**Heading**

**Journal field**   | **Source**
:--                 |:--                 
**Name**            | Method of payment's Name
**Description**     | Journal name's Description
**Posted**          | Journal is automatically posted where Accounts receivable parameters's **Auto post customer payment journal** (Settlement tab) is set to _Yes_
**Modified by**     | Batch job's Created by
**Amounts include sales tax**   | Set to _Yes_ when prepayment voucher is created.

**Lines**

**Journal field**   | **Source**
:--                 |:--   
**Date**            | Where Method of payment's **Posting date** is set to: <br> • **Today's date** <br> • **Remittance transaction date** - Import file's mapped field **Date**
**Company**         | Company file is imported
**Account**         | Calculated by either of the following methods: <br> • Import file's mapped field **Reference number**'s Customer account <br> • Import file's mapped field **Invoice**'s Invoice account <br> • Method of payment's **Error account customer** if above didn't find a customer account
**Account name**    | Customer's **Name**
**Invoice**         | Import file's mapped field **Invoice**
**Description**     | Import file's mapped field **Description**
**Credit**          | Import file's mapped field **Amount**
**Currency**                | Customer's **Currency**
**Offset account type**     | Method of payment's **Account type**
**Offset account**          | Method of payment's **Payment account**
**Method of payment**       | Periodic task's **Method of payment**
**Payment reference**       | Import file's mapped field **Payment reference**
**Sales tax group**         | Customer's **Sales tax group**
**Exchange rate**           | Applicable exchange rate for currency
**Prepayment journal voucher**  | Set to _Yes_ where invoice is not populated and Accounts receivable's **Create prepayment** is set to _Yes_

## Error handling

[Standard DMF Error handling](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/data-entities/dm-error-descriptions) applies when the file is imported using composite entiy **Customer payment journal**.

Scenarios for error in Data management:
- Customer is stopped for all and thus the customer payment journal line can't be created

The Financial utilities connection includes an error file location. <br>
A file will be moved to error location in the following scenarios:
- Journal was set to automatically post, but posting process ended in error.

If you receive error 'Number sequence 0 does not exist' in the periodic task - Ensure a Journal name has been selected in the Methods of payment's Name

