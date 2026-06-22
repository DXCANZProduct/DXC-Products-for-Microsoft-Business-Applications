---
layout: product-content
header: DXC Agent for Finance in D365 FSCM
toc: true
---

# 	Frequently Asked Questions

### Where can I find contact information for support?
   
Support contact details can be located on the **Contact** tab at **Organization admininstration > Workspaces > Product support**
  
### Where can I identify the installed version of the DXC Agent module

On the Navigation bar, select **Help & support > About**. <br>
A list of installed models will be displayed on the **Version** tab.  Scroll to **DXC Agent For Finance**. The version information will be displayed on the right (i.e. DXC Agent For Finance **10.0.45.202602132** (isv))

### Dependency and Security Information

Microsoft Foundry used by the agent is controlled by the client. <br> 
Data Isolation: Data used in Microsoft Foundry remains within the customer's Azure tenant and is encrypted at rest.

### Governance

See the following section for more details around [Governance]({{ '/agent/dxcagentfinance/governance' | relative_url }})

### How many tokens does it use
Approximately 115 tokens per record. <br>
Using gpt5.2 has 250000 tokens limit per minute. <br>
250000 tokens limit is about 2,200 records combined statements and transactions. <br>

# 	Troubleshooting

###   Product is installed but functionality not visible
If the product is available in About > Version, check if it has been enabled in **Feature management**. <br>

**Enable** the features in the following order. <br>
1. DXC Agent for finance & supply chain management

The following can be enabled in any order after 1. has been enabled (if licensed):
- DXC Agent for bank reconciliation
- DXC Agent for bank reconciliation voucher generation
- DXC Agent for bank reconciliation payment journal generation

If you don't see the features, click **Check for updates**. <br>

### Error: Generating receipt journal fails. Please refresh the page to retry.
This error occurs when the bank account is configured not to automatically post agent created customer or vendor payments, and a user attempts to use the agent to create a payment journal that already exists. For example, if the agent has already created an open payment journal for the bank statement record, it will prevent the creation of another agent-generated payment journal to avoid duplicates.


