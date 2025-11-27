---
layout: product-content
header: Insights for D365 FO
toc: true
---

# Frequently asked questions

### Where can I find contact information for support?

Support contact details can be located on the **Contact** tab at **Organization admininstration > Workspaces > Product support**

### Where can I identify the installed version of Insights for D365 FO?

On the Navigation bar, select **Help & support > About**. <br>
A list of installed models will be displayed on the **Version** tab. Scroll to **DXC Insights**. The version information will be displayed on the right (i.e. DXC Insights **10.0.31.202306231** (isv))

## Dependency and Security Information

Insights for D365 FO includes

- Use of Microsoft Azure Application Insights library
- Use of DXC.FnOInsights library, an extension of the Microsoft Azure Application Insights library to add additional telemetry metrics for enhanced logging capabilities. It still uses the same API that the Microsoft Azure Application Insights data collectors use.

All telemetry is logged within the Microsoft Azure Application Insights only.

Note: DXC does not collect any usage information, or telemetry against any other installed system or ISV module from Insights for D365 FO.

## Troubleshooting

### Product is installed but functionality not visible

If the product is available in About > Version, check if it has been enabled in **Feature management**. <br>
If you don't see **Insights for D365 FO** or **Insights for D365 FO Dual Write**, click **Check for updates**. <br>
**Enable** the feature. <br>

![CheckForUpdates](Images/CheckForUpdates.png "CheckForUpdates")
