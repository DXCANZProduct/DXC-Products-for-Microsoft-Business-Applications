---
layout: product-content
header: Finance Utilities
toc: true
---

## Introduction
The DXC Finance Utilities module provides enhanced functionalities to Microsoft Dynamics 365 for the following:

-   **Cash and bank management**
    -   Bank statement import formatting
    -   Advanced bank reconciliation, including:
        -   Extended matching functionality, including improved handling of Marked and Matched transactions
        -   Additional capability when using ‘Mark as new’ facility
        -   Ability to reconcile a small balance correction adjustment
        -   Ability to prevent reconciliation of unmatched statements
    -   Periodic task to automatically import bank statements from FTP/FTPS, SFTP or Azure blob. Decryption option included.
    -   Modern bank reconciliation:
        - Offset company - Ability to post the offset to intercompany ledger, bank, vendor or customer.
        - Offset type bank - Modern bank reconciliation doesn't include an option for offset type Bank which is used for bank transfers. In Finance utilities we support this option under 'Generate voucher'.
        - Offset type customer:
            - Ability to use 'Customer reference' to find the Customer account.
            - Field format - enhanced option in Reconciliation matching rule for using part of a bank statement field to find the invoice / customer.
            - One customer payment journal for all matched bank statement lines (only 'Generate customer payment').
            - Posting options (only 'Generate customer payment').
     - Correction amounts - Ability to enter correction amounts at time of matching Bank statement transactions to Bank transactions.
-   **Accounts payable**
    -   Sundry vendor payment management
    -   BPAY vendor payment
    -   Formatted Vendor Payment Advice
    -   ABN lookup and validation (Australia only)
    -   IRD number validation (New Zealand only)
    -   Vendor bank account format validation
    -   Save GER to secure location, for example FTP/FTPS, SFTP or Azure blob. Encryption option included
    -   Self billing invoicing / Recipient-Created Tax Invoice (RCTI)
- **Accounts receivable**
    -   Customer bank account changes workflow
    -   ABN lookup and validation (Australia only)
    -   IRD number validation (New Zealand only)
    -   VCustomer bank account format validation
    -   Customer references
    -   Option to use Customer's payment terms for Due date on Interest notes
    -   Import customer remittance files
- **Budgeting**
    -   Budget import with separate column for each period

## Demonstration
Watch DXC Technology’s short demonstration on Finance Utilities [here](https://www.youtube.com/playlist?list=PLIM01nS-jtL_uUFd0JRmQx1MV6WsaMfLO)

### Modern bank reconciliation - Overview
**Duration: 7.5 minutes**

A brief overview of the key enhancements Finance Utilities introduces to Modern Bank Reconciliation

[Watch recording](https://youtu.be/taaHtFOrkXE?si=OE5azLlWiS9Hk5OF)

### Accounts Payable
**Duration: 13.25 minutes**

Demonstration for various Accounts Payable functionalities using Finance Utilities in D365 Finance and Operations.

[Watch recording](https://youtu.be/VKssfqil1sw?si=7vAC-WWRwAYFF3oJ)

### Self billing / Recipient-created tax invoices (RCTI)
**Duration: 11 minutes**

Demonstration for automatically creating Recipient-created tax invoices for Purchase order’s Product receipts using Finance Utilities in D365 Finance and Operations. <br>
The invoices can be automatically created at time of product receipt, or with a periodic task that has various consolidation options available.

[Watch recording](https://youtu.be/bD6-Wz0VGW0?si=CXMTTbYRS9jvj3Ul)

### Electronic reporting export
**Duration: 6.5 minutes**

Demonstration for exporting Electronic reporting files to secure locations using Finance Utilities.

[Watch recording](https://youtu.be/FlukDXw_FPM?si=x0w_sLjNWJC2_75g)

### Customer remittance import
**Duration: 8.5 minutes**

Demonstration for importing Customer remittance files from secure locations using Finance Utilities.

[Watch recording](https://youtu.be/JpKETZekivM?si=t3588ATwLTPyoep-)


## FAQ

See our FAQ for general information and troubleshooting.

- [FAQ]({{ '/financeutilities/FAQ' | relative_url }})


