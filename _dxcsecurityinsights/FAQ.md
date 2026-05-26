---
layout: product-content
header: Security Insights for D365 FO
toc: true
---

# Frequently asked questions

### Where can I find contact information for support?
Support contact details can be located on the **Contact** tab at **Organization admininstration > Workspaces > Product support**

### Where can I identify the installed version of Security Insights for D365 FO?
On the Navigation bar, select **Help & support > About**. <br>
A list of installed models will be displayed on the **Version** tab.  Scroll to **DXC Security Insights for D365FO**. The version information will be displayed on the right (i.e. DXC Security Insights for D365FO  **10.0.37.202406181** (isv))

## Dependency and Security Information

Security Insights for D365FO only needs Read-Access to read data from Azure Application Insights.

Note: DXC does not collect any usage information, or telemetry against any other installed system or ISV module from Security Insights for D365FO. 

# 	Troubleshooting

###   Product is installed but functionality not visible
If the product is available in About > Version, check if it has been enabled in **Feature management**. <br>
If you don't see **Security Insights for D365FO**, click **Check for updates**. <br>
**Enable** the feature. <br>

### Fetch error

Error: The web service call failed for %. The remote server returned an error: (400) Bad Request. <br> 

Method to fix:
1. Confirm configuration for the Azure Application Insights instance is correct and validate in 'Insights for user access and security parameters' .
2. Check for users with special characters in their id

### Securable object entitled count comparison

When comparing **License usage summary**'s Entitled count to **Security Insight**'s Securable object entitled count, you could notice a lower number in Security Insights. <br> 
In Security insights we exclude the Read Access level Entitled securable objects in the count, as these on it's own wouldn't require a license.
Otherwise if the user accessed only this read object, it might incorrectly display they require the full license type.

  

