---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# DXC Agent for Bank reconciliation in D365 FSCM

# A. Microsoft Foundry

Start by creating 



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

Select **New** and populate the following:

Field                  | Description
:--                    |:--
**Agent name**         | Enter **DXCAgentForBankReconciliation**
**Agent description**  | Enter a description, for example **Agent for bank reconciliation**
**Agent connection details**  | Select the agent created in B.2.
**Enabled**            | Set to _Yes_ in order to enable the agent
**Enable agent response validation**  | Additional validation is available that can review the matching results from the agent instructions. Set to _Yes_ to enable validation.


