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

Navigate to **Cash and bank management > Setup > Bank transaction types** and assign the applicable **Action** to each bank transaction type.

### Transaction code mapping

Navigate to **Cash and bank management > Setup > Advanced bank reconciliation setup > Transaction code mapping** and ensure all the applicable bank transaction types are mapped for the bank account.

### Main account - Sales tax

Navigate to **General ledger > Chart of accounts > Accounts > Main accounts**

Where the offset account needs to include tax in the new voucher transaction, ensure the following two fields are setup on each applicable **Main account**.
- Sales tax group
- Item sales tax group



