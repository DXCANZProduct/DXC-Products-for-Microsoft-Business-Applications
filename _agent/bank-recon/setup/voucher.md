---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# DXC Agent for Bank reconciliation in D365 FSCM

## Prerequisites

Start by setting up the prerequisites - [user guide]({{ 'agent/bank-recon/setup/all' | relative_url }})

## DXC Agent for Bank reconciliation - Generate voucher

###  Enable feature
After deployment, find and enable the following features:
1. DXC Agent for finance & supply chain management
2. DXC Agent for bank reconciliation voucher generation

###  All agents

Navigate to **Organisation administration > Agents for finance & supply chain management > All agent** to setup the **DXC Agent for bank reconciliation**

When opening the form, it checks for any new agents and self populates from details from code

Information on fields.

Field                  | Description
:--                    |:--
**Agent name**         | DXCAgentForBankReconciliationVoucherGeneration
**Agent description**  | Agent for Bank Reconciliation Voucher Generation
**Agent connection details**  | Select the agent created in prerequisite [Agent connection parameters](../dxcagentframework/Setup.md#b2--agent-connection-parameters)
**Agent instructions**  | Automatically populated with default Agent instructions
**Agent output format**  | Automatically populated with default output format
**Enabled**            | Set to _Yes_ in order to enable the agent
**Enable telemetry**   | See [detail]({{ 'agent/bank-recon/setup/all#telemetry' | relative_url }})

### Bank transaction types

Navigate to **Cash and bank management > Setup > Bank transaction types** and assign the applicable **Action** to each bank transaction type. <br>
This feature will review the bank statement records where the Action **Generate voucher** is mapped.

Example: **Bank transaction type** value **07** has Action **Generate voucher** assigned.

### Transaction code mapping

Navigate to **Cash and bank management > Setup > Advanced bank reconciliation setup > Transaction code mapping** and ensure all the applicable bank transaction types are mapped for the bank account.

Example: Company bank account has **Statement transaction code** value **005** assigned to **Bank transaction type** value **07**. <br> 
Thus all bank statement records with **Bank transaction code** value **005** will be compared to applicable values in table DXCAgentBankStmtVoucherHistoryView. If a matching unique offset history value exists, this will be used when generating the voucher for this bank statement record. <br> 

The following will be used from the unique history record:
- Offset account
- Financial dimensions for offset account

### Main account - Sales tax

Navigate to **General ledger > Chart of accounts > Accounts > Main accounts**

Where the offset account needs to include tax in the new voucher transaction, ensure the following two fields are setup on each applicable **Main account**.
- Sales tax group
- Item sales tax group

### Default description

This feature uses **Default description** when creating the new transaction.

1. Enable feature **Enable default descriptions for advanced bank reconciliation**
2. Setup [Default descriptions](https://learn.microsoft.com/en-us/dynamics365/finance/cash-bank-management/apply-cash-adv-bank-rec#enable-default-descriptions-for-advanced-bank-reconciliation) for **Bank - reconciliation worksheet** for each applicable **Language** or select **user**. <br> 

