---
layout: product-content
header: Finance Utilities
toc: true
---

# Customer reference setup

The fields as described in the following subsections are available to control the functionality for:

- Customer remittance import available in additional licensed feature **Finance utilities - AR utilities**
- Bank statement reconciliation - **Offset account reference bank statement** field is set to use a field from the bank statement field to find the applicable D365 customer account - [More info](../CASH-AND-BANK-MANAGEMENT/Bank-reconciliation-matching-rules.md#customer-payment-and-settle-of-invoice-11)

## Reference number type

Customers could have various types of references. This page allows users to set **Reference number types** that will be used when assigning **Customer references** to the **Customer**.

To open the page, navigate to **Accounts receivable > Setup > Reference number type**.<br>
On the Action Pane, select **New** and enter the following details.

| **Field**                 | **Description**                                                  |
| :------------------------ | :--------------------------------------------------------------- |
| **Reference number type** | Set an unique reference number for each customer reference type. |

### Where used

- Customer references on Customer
- Method of payment for AR utilities
- Financial utilities parameters, when using customer references in the Reconciliation matching rules to find the D365 customer account

**Data entity**: Reference number type

## Customer references

The following section describes creating customer references against a customer.

To open the page, navigate to **Accounts receivable > Customers > All customers**. <br>
Select the applicable customer and select **Customer references** on **Customer** tab on the ActionPane.

On the Action Pane, select **New** and enter the following details.

| **Field**                 | **Description**                                                                                                                                                                                                                                                                                       |
| :------------------------ | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Customer account**      | Customer account is automatically assigned based on the selected customer.                                                                                                                                                                                                                            |
| **Reference number type** | Select the applicable **Reference number type** as set in the previous section.                                                                                                                                                                                                                       |
| **Reference number**      | Enter the value for the customer reference.                                                                                                                                                                                                                                                           |
| **Active**                | Set the customer reference as active. <br> Only one active record per **Reference number type** is allowed per customer. <br> If the customer has existing references for the reference number type, their Active would first need to be changed to _No_ before activating a new record for the type. |

**Data entity**: Customer references

### Customer approval

Customer reference fields are also available on **Customer approval** in **Accounts receivable parameters**:

- Reference number type
- Reference number
- Customer reference active
