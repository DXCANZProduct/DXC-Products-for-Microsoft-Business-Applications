---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# DXC Agent for Bank reconciliation in D365 FSCM

## Prerequisites

Start by setting up the prerequisite **Microsoft Foundry** and **DXC Agent for finance & supply chain management** - [user guide]({{ '/agent/dxcagentframework/Setup' | relative_url }})

## DXC Agent for Bank reconciliation

See following links for setup specific to each functionality (licensed separately):
 - [Match with bank documents]({{ '/agent/bank-recon/setup/match' | relative_url }})
 - [Generate voucher]({{ '/agent/bank-recon/setup/voucher' | relative_url }})
 - Generate customer payments (coming soon)
 - Generate vendor payments (coming soon)

### Bank accounts

Where you want the agent to automatically run when importing the bank statement, navigate to **Cash and bank management > Bank statement reconciliation > Bank accounts**.

1. Select the applicable company bank account, and where **Reconcile after import** is _Yes_ you will be able to set **Run reconciliation agent** to _Yes_.

> Note: The agent will only automatically run where:
> Bank account's **Reconcile after import** is _Yes_, and **Run reconciliation agent** is _Yes_, and
> Import bank statement **Reconcile after import** is _Yes_


## Workflow

### Setup


### Override default

If you want to override the default workflow or agent, assign a workflow or agent in:
 - **Cash and bank parameters** - this will override the agent default
 - **Bank account** - this will override any overide in Cash and bank parameters

## Telemetry

Navigate to **Organisation administration > Agents for finance & supply chain management > All agent**. <br>
Set **Enable telemetry** to _Yes_ to log and view telemetry for _applicable_ agents. <br>
View the telemetry by using **Go to dashboard** on the ActionPane. This is only enabled for applicable agents.

### Examples: 

#### DXC Agent for bank reconciliation (Match with bank documents): 


#### DXC Agent for bank reconciliation voucher generation (Generate voucher): 



