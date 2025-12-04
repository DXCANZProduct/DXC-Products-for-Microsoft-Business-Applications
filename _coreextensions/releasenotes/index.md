---
layout: releasenotes-content
header: Core Extensions
title: 10.0.44.202510171
release-version: 10.0.44.202510171
state: current
toc: true
---
# Version compatibility
The matrix shows the minimum DXC build versions that are compatible with Microsoft versions and builds. <br>
If blank, investigations are ongoing. <br>

D365 Version		  |Iissues found in testing?| Product version tested
:--       	 		 |:--           			  |:--
Product version: 10.0.40 <br> App build: 10.0.1935.5	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymisation 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.41 <br> App build: 10.0.2015.16	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymisation 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.42 <br> App build: 10.0.2095.13	  | No | DXC Core Extensions 10.0.40.202410231 <br> DXC Data Anonymisation 10.0.40.202410231 <br> DXC DMF Toolbox 10.0.40.202410231
Product version: 10.0.43 <br> App build: 10.0.2177	  | No | DXC Core Extensions 10.0.40.202502051 <br> DXC Data Anonymisation 10.0.40.202502051 <br> DXC DMF Toolbox 10.0.40.202502051
Product version: 10.0.44 <br> App build: 10.0.2263	  | yes only build errors 22878 | DXC Core Extensions 10.0.40.202502051 <br> DXC Data Anonymisation 10.0.40.202502051 <br> DXC DMF Toolbox 10.0.40.202502051 <br> build errors fixed in 10.0.44.202506171
Product version: 10.0.45 <br> App build: 10.0.2345.13	  | No | DXC Core Extensions 10.0.44.20250625 <br> DXC Data Anonymisation 10.0.44.20250625 <br> DXC DMF Toolbox 10.0.44.20250625 
Product version: 10.0.46 <br> App build: 10.0.2428	  |  | DXC Core Extensions 10.0.44.202510171 <br> DXC Data Anonymisation 10.0.44.202510171 <br> DXC DMF Toolbox 10.0.44.202510171 

Release notes for other models included in product:
- [DXC License Manager]({{'licensemanager/releasenotes/dxclicensemanager/' | relative_url }})
- [DXC License]({{'licensemanager/releasenotes/dxclicense' | relative_url }})

# Deprecated features

This section describes the features that have been removed or are planned to be removed from a Core Extensions version.

Deprecated in version 10.0.40.20241023
### Exchange Rate Import - Bank of Canada
Reason for deprecation/removal: no longer being used as a source of currency exchange rates

### Business Process links
Reason for deprecation/removal - Business Process links (also referred to as Business Process Suite) were originally designed for Mavim and SharePoint integration.  Both Mavim and SharePoint have alternate connection capabilities with D365 Finance and Operations, and the product is no longer being utilised as part of the Core extension solutions. The Model was removed in version 10.0.40.202502051

# Current version

### Release {{page.release-version}}

DXC Core extensions {{page.release-version}} run on the following Microsoft releases

Base	  | Version	  | Release
:--       |:--            |:--
Microsoft Dynamics 365 application	| 10.0.44 	  | [What’s new or changed in Dynamics 365 application version 10.0.44](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-44)
Microsoft Dynamics 365 application	| 10.0.45 	  | [What’s new or changed in Dynamics 365 application version 10.0.45](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-45)
Microsoft Dynamics 365 application	| 10.0.46 	  | [What’s new or changed in Dynamics 365 application version 10.0.46](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-46)

{% include_relative {{page.release-version}}.md %}
