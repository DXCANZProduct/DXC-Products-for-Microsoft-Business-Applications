---
layout: product-content
header: DXC Agent for Finance in D365 FSCM
toc: true
---

# DXC Agent for bank reconciliation voucher generation

The **DXC Agent for bank reconciliation voucher generation** allows users to automatically create new voucher bank documents for relevant bank statement records, based on historical data for the bank account.

# Setup

## Prerequisites

Start by setting up the prerequisite **Microsoft Foundry** and **DXC Agent for finance & supply chain management** - [user guide]({{ '/agent/dxcagentframework/Setup' | relative_url }})

##  Enable feature
After deployment, find and enable the following features:
1. DXC Agent for finance & supply chain management
2. DXC Agent for bank reconciliation voucher generation


##  All agents

Navigate to **Organisation administration > Agents for finance & supply chain management > All agent** to setup the applicable agent.

When opening the form, it checks for any new agents and self populates from details from code

See below table for information on fields.

Field                  | Description
:--                    |:--
**Agent name**         | DXCAgentForBankReconciliationVoucherGeneration
**Agent description**  | Agent for Bank Reconciliation Voucher Generation
**Agent connection details**  | Select the agent created in prerequisite [Agent connection parameters](../dxcagentframework/Setup.md#b2--agent-connection-parameters)
**Agent instructions**  | Automatically populated with default Agent instructions
**Agent output format**  | Automatically populated with default output format
**Enabled**            | Set to _Yes_ in order to enable the agent
**Enable telemetry**   | See below for more details

### Telemetry

Set **Enable telemetry** to _Yes_ to log and view telemetry for _applicable_ agents. <br>
View the telemetry by using **Go to dashboard** on the ActionPane. This is only enabled for applicable agents.

Per each run, the following telemetry could be logged per agent. The data is displayed by month: 
- Statement count
- Generated voucher count
- Number of runs

## Bank transaction types

Navigate to **Cash and bank management > Setup > Bank transaction types** and assign the applicable **Action** to each bank transaction type. <br>
This feature will review the bank statement records where the Action **Generate voucher** is mapped.

Example: **Bank transaction type** value **07** has Action **Generate voucher** assigned.

## Transaction code mapping

Navigate to **Cash and bank management > Setup > Advanced bank reconciliation setup > Transaction code mapping** and ensure all the applicable bank transaction types are mapped for the bank account.

Example: Company bank account has **Statement transaction code** value **005** mapped to **Bank transaction type** value **07**. <br> 
Thus all bank statement records with **Bank transaction code** value **005** will be compared to applicable values in table DXCAgentBankStmtVoucherHistoryView for the bank reconciliation's bank account. Where the agent determines a matching unique offset history value exists, this will be used when generating the voucher for this bank statement record. <br> 

The following will be used from the unique history record:
- Offset account
- Financial dimensions for offset account

## Main account - Sales tax

Navigate to **General ledger > Chart of accounts > Accounts > Main accounts**

Where the offset account needs to include tax in the new voucher transaction, ensure the following two fields are setup on each applicable **Main account**.
- Sales tax group
- Item sales tax group

## Default description

This feature uses **Default description** when creating the new transaction.

1. Enable feature **Enable default descriptions for advanced bank reconciliation**
2. Setup [Default descriptions](https://learn.microsoft.com/en-us/dynamics365/finance/cash-bank-management/apply-cash-adv-bank-rec#enable-default-descriptions-for-advanced-bank-reconciliation) for **Bank - reconciliation worksheet** for each applicable **Language** or select **user**. <br>

## Cash and bank parameters

Navigate to **Cash and bank management > Setup > Cash and bank parameters**.

- **Agent historical reference period** - Applies only to Agent for Bank Reconciliation Voucher Generation. Specifies how many months of historical transaction data the agent can use during its first run when creating new transactions. This setting does not apply to subsequent runs.

# Processing

The **DXC Agent for Bank reconciliation in D365 FSCM** can be run by: 

## Automatically with Bank statement import

See [setup]({{ '/agent/bank-recon/setup/all#b4-bank-accounts' | relative_url }}) for prerequisites.

When importing bank statements with **Reconcile after import** enabled and the prerequisite setup are met the agent will automatically run the licensed agents assigned to the workflow that is either assigned to the Bank account, Cash and bank parameters or the system default.

## Manually in Bank reconciliation Worksheet

The agent can be manually run by navigating to **Cash and bank management > Bank statement reconciliation > Bank reconciliation** and selecting the applicable reconciliation's **Worksheet**.

Where the agent is enabled, the **Create transactions with agent** button will be enabled in the **Unmatched transactions** tab. 
- To run the agent for all unmatched bank statement transactions, no need to select any records only click **Create transactions with agent**.
- To run the agent for manually selected records, select the applicable unmatched bank statement transactions and click **Create transactions with agent**

## Results

### Matched transactions

#### Matching rule
The transactions that have been matched by the Agent can easily be viewed in **Matched transactions** as these are flagged in **Matching rule** with **DXCAgent**. <br>

> Note: Reconciliation matching rule **DXCAgent** is automatically created by the product, but only the name is used for flagging the applicable Matched transactions.

#### Matching justication

To view Agent reasoning, see **Matching justification** for more information.

![Matching justification](../IMAGES/agent-bankrecon-justification.png)

