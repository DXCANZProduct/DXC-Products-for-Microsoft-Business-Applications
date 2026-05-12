---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# DXC Agent for Bank reconciliation in D365 FSCM

The **DXC Agent for Bank reconciliation in D365 FSCM** can be run by: 

## Automatically with Bank statement import

See [setup]({{ '/agent/bank-recon/setup/all#b4-bank-accounts' | relative_url }}) for prerequisites.

When importing bank statements with **Reconcile after import** enabled and the prerequisite setup are met the agent will automatically run the licensed agents assigned to the workflow that is either assigned to the Bank account, Cash and bank parameters or the system default.

## Manually in Bank reconciliation Worksheet

The agent can be manually run by navigating to **Cash and bank management > Bank statement reconciliation > Bank reconciliation** and selecting the applicable reconciliation's **Worksheet**.

Where the agent is enabled, the following buttons will be enabled in the **Unmatched transactions** tab: 
- To run the agent for all unmatched bank statement transactions, no need to select any records only click **Create transactions with agent**.
- To run the agent for manually selected records, select the applicable unmatched bank statement transactions and click **Create transactions with agent**

## Results

### Matched transactions

The transactions that have been matched by the Agent can easily be viewed in **Matched transactions** as these are flagged in **Matching rule** with **DXCAgent**. <br>

> Note: Reconciliation matching rule **DXCAgent** is automatically created by the product, but only the name is used for flagging the applicable Matched transactions.

**Matching justification** field provides information on Agent reasoning.


![Worksheet-prompt](../IMAGES/agent-bankrecon-worksheet3.png)
