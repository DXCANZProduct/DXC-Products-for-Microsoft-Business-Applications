---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# DXC Agent for Bank reconciliation in D365 FSCM

# A. Microsoft Foundry

Start by creating your Microsoft Foundry resources. See:
- [Quikstart](https://learn.microsoft.com/en-us/azure/ai-foundry/quickstarts/get-started-code?view=foundry&preserve-view=true&tabs=python)
- [Create resources](https://learn.microsoft.com/en-us/azure/ai-foundry/tutorials/quickstart-create-foundry-resources?view=foundry&tabs=azurecli)
- [Pricing](https://azure.microsoft.com/en-au/pricing/details/microsoft-foundry/)


# B. D365 Finance and Operations

## B.1.	Enable feature
After deployment, find and enable the feature **DXC Agent for bank reconciliation** to enable the product.

## B.2.  Agent connection parameters

Navigate to **System administration > Agents for finance & supply chain management > Agent connection parameters** to add the **Microsoft Foundry** details created in section A. <br>

Field                  | Description
:--                    |:--
**Deployment name**    | Enter the Deployment name. Example dxcagentforfscm-gpt-5.2-chat
**Target URI**         | Paste the URI. Example https://xx-us-reso.cognitiveservices.azure.com/
**API key**            | Enter the API key


## B.3.  All agents

Navigate to **System administration > Agents for finance & supply chain management > All agent** to setup the **DXC Agent for bank reconciliation**

When opening the form, it checks for any new agents and self populates from details from code

Information on fields.

Field                  | Description
:--                    |:--
**Agent name**         | DXCAgentForBankReconciliation
**Agent description**  | Agent for bank reconciliation
**Agent connection details**  | Select the agent created in B.2.
**Enabled**            | Set to _Yes_ in order to enable the agent
**Enable agent response validation**  | Additional validation is available that can review the matching results from the agent instructions. Set to _Yes_ to enable validation.

## B.4. Bank accounts

Where you want the agent to automatically run when importing the bank statement, navigate to **Cash and bank management > Bank statement reconciliation > Bank accounts**.

Select the applicable company bank account, and where **Reconcile after import** is _Yes_ you will be able to set **Run reconciliation agent** to _Yes_.

> Note: The agent will only automatically run where:
> Bank account's **Reconcile after import** is _Yes_, and **Run reconciliation agent** is _Yes_, and
> Import bank statement **Reconcile after import** is _Yes_

