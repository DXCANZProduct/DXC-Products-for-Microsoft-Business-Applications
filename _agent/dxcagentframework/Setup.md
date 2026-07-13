---
layout: product-content
header: DXC Agent for finance & supply chain management
toc: true
---

# DXC Agent for finance & supply chain management

# A. Microsoft Foundry

Start with [Deploy Microsoft Foundry Models in the Foundry portal](https://learn.microsoft.com/en-us/azure/ai-foundry/foundry-models/how-to/deploy-foundry-models?view=foundry-classic)

Note the following to paste in **Agent Connection Parameters**:
- Target Uri
- Model deployment name
- Key



Additional resources:
- [Quikstart](https://learn.microsoft.com/en-us/azure/ai-foundry/quickstarts/get-started-code?view=foundry&preserve-view=true&tabs=python)
- [Create resources](https://learn.microsoft.com/en-us/azure/ai-foundry/tutorials/quickstart-create-foundry-resources?view=foundry&tabs=azurecli)
- [Pricing](https://azure.microsoft.com/en-au/pricing/details/microsoft-foundry/)


# B. D365 Finance and Operations

## B.1.	Enable feature
After deployment, find and enable the following features:
1. DXC Agent for finance & supply chain management


## B.2.  Agent connection parameters

Navigate to **Organisation administration > Agents for finance & supply chain management > Agent connection parameters** to add the **Microsoft Foundry** details created in section A. <br>

Field                  | Description
:--                    |:--
**Deployment name**    | Enter the Deployment name. Example dxcagentforfscm-gpt-5.2-chat
**Target URI**         | Paste the URI. Example https://xx-us-reso.cognitiveservices.azure.com/
**API key**            | Enter the API key


> Note: Not shared across legal entities; to enable companies to keep separate model deployments / costs in MS Foundry.

## B.3.  All agents

Navigate to **Organisation administration > Agents for finance & supply chain management > All agent** to setup the applicable licensed agents.

### Telemetry

The **All agents** form, provides the option to log and view telemetry for _applicable_ agents, by setting the **Enable telemetry** to _Yes_.

View the telemetry by using **Go to dashboard**.

## B.4. Agent workflows
Provides the ability to run multiple agents in a specific order.

Navigate to **Organisation administration > Agents for finance & supply chain management > Agent workflows**.

Click **New** to create a new workflow and select the applicable Agents under **workflow agents setup**.
The default **Agent instructions** could also be overridden per workflow.


