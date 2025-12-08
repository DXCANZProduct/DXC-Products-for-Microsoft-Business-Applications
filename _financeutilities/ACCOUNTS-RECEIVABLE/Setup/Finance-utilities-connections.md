---
layout: product-content
header: Finance Utilities
toc: true
---

## Financial utilities connection
When the **Customer remittances** or **Direct debit returns** are to be imported via their periodic tasks, the applicable connection type must be setup using the **Financial utilities connections** page.

> Note: The menu is only available where additional licensed feature **Finance utilities - AR utilities** is enabled.

Accounts receivable **Financial utilities connections** are used in the following:
1.	Mandatory parameter in the periodic task [Payment journal import](). Only enabled Financial connections can be selected in the periodic task.

The import file can be attached to the created D365 customer payment journal, by setting **File attachment document type** on the **Settlement** tab on **Accounts receivable parameters**.

Examples where a file would we moved to **Import error path** are discussed in [Error handling](../../Processing/Accounts-Receivable/Customer-remittance#error-handling)

> Note: If **Import error path** is not setup/incorrect, the file will be deleted from the import path and not archived. 


To open the **Financial utilities connections** page, go to **Accounts receivable > Payments setup > Financial utilities connections**. Then set the fields as described in the following subsections.

[Financial utilities connection setup](../CASH-AND-BANK-MANAGEMENT/Finance-utilities-connections)

