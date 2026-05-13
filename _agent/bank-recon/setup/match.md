---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# DXC Agent for Bank reconciliation in D365 FSCM

## Prerequisites

Start by setting up the prerequisites - [user guide]({{ 'agent/bank-recon/setup/all' | relative_url }})

## DXC Agent for Bank reconciliation - Match with bank documents

###  Enable feature
After deployment, find and enable the following features:
1. DXC Agent for bank reconciliation

###  All agents

Navigate to **Organisation administration > Agents for finance & supply chain management > All agent** to setup the **DXC Agent for bank reconciliation**

When opening the form, it checks for any new agents and self populates from details from code

Information on fields.

Field                  | Description
:--                    |:--
**Agent name**         | DXCAgentForBankReconciliation & DXCAgentForBankReconciliationValidation
**Agent description**  | Agent for bank reconciliation & Agent for Bank Reconciliation Validation
**Agent connection details**  | Select the agent created in prerequisite [Agent connection parameters](../dxcagentframework/Setup.md#b2--agent-connection-parameters)
**Agent instructions**  | Automatically populated with default agent instructions
**Agent output format**  | Automatically populated with default output format
**Enabled**            | Set to _Yes_ in order to enable the agent
**Enable telemetry**   | See [detail]({{ 'agent/bank-recon/setup/all#telemetry' | relative_url }})

### Cash and bank parameters

Navigate to **Cash and bank management > Setup > Cash and bank management parameters**.

The following parameters on the **Bank reconciliation** tab influences matching by the agent:  
- **Validate transaction type mapping** - where set to _Yes_, the agent will use **Transaction code mapping** for the bank reconciliation's bank account in the matching criteria
- **Validate date difference between statement lines and bank documents during bank reconciliation process** - where set to _Yes_, the **Allowed date difference** is applied in matching criteria.
