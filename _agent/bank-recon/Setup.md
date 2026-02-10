---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# DXC Agent for Bank reconciliation in D365 FSCM

## Prerequisites

Start by setting up the prerequisite **Microsoft Foundry** and **DXC Agent for finance & supply chain management** - [user guide](../dxcagentframework/Setup.md)

## DXC Agent for Bank reconciliation

###  Enable feature
After deployment, find and enable the following features:
1. DXC Agent for bank reconciliation

###  All agents

Navigate to **System administration > Agents for finance & supply chain management > All agent** to setup the **DXC Agent for bank reconciliation**

When opening the form, it checks for any new agents and self populates from details from code

Information on fields.

Field                  | Description
:--                    |:--
**Agent name**         | DXCAgentForBankReconciliation
**Agent description**  | Agent for bank reconciliation
**Agent connection details**  | Select the agent created in prerequisite [Agent connection parameters](../dxcagentframework/Setup.md#b2--agent-connection-parameters)
**Enabled**            | Set to _Yes_ in order to enable the agent
**Enable agent response validation**  | Additional validation is available that can review the matching results from the agent instructions. Set to _Yes_ to enable validation.

### Bank accounts

Where you want the agent to automatically run when importing the bank statement, navigate to **Cash and bank management > Bank statement reconciliation > Bank accounts**.

Select the applicable company bank account, and where **Reconcile after import** is _Yes_ you will be able to set **Run reconciliation agent** to _Yes_.

> Note: The agent will only automatically run where:
> Bank account's **Reconcile after import** is _Yes_, and **Run reconciliation agent** is _Yes_, and
> Import bank statement **Reconcile after import** is _Yes_

