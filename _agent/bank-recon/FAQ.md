---
layout: product-content
header: DXC Agent for Bank reconciliation in D365 FSCM
toc: true
---

# 	Frequently Asked Questions

### Where can I find contact information for support?
   
Support contact details can be located on the **Contact** tab at **Organization admininstration > Workspaces > Product support**
  
### Where can I identify the installed version of the DXC Agent module

On the Navigation bar, select **Help & support > About**. <br>
A list of installed models will be displayed on the **Version** tab.  Scroll to **DXC Agent For Finance**. The version information will be displayed on the right (i.e. DXC Agent For Finance **10.0.45.20260227** (isv))

### Dependency and Security Information

Microsoft Foundry used by the agent is controlled by the client.

### How many tokens does it use
Approximately 115 tokens per record. <br>
Using gpt5.2 has 250000 tokens limit per minute. <br>
250000 tokens limit is about 2,200 records combined statements and transactions. <br>

# 	Troubleshooting

###   Product is installed but functionality not visible
If the product is available in About > Version, check if it has been enabled in **Feature management**. <br>

**Enable** the features in the following order. <br>
1. DXC Agent for finance & supply chain management
2. DXC Agent for bank reconciliation

If you don't see the features, click **Check for updates**. <br>


