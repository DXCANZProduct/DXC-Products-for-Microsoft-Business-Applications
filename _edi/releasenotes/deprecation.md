---
layout: releasenotes-content
header: Electronic Data Interchange (EDI)
title: Deprecated
state: previous
---

# Deprecated

### Microsoft deprecation notice

[Microsoft notice](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/get-started/removed-deprecated-features-platform-updates#feature-deprecation-effective-october-2024)
- **Likely to affect**: Companies that uses **Database** credential type for their **Azure blob** connections. **Key Vault** credential type is not affected. These connections can be found at 'EDI > Setup > Connection setup > Azure sites' <br>
- **Status**: Rollout for the change by Microsoft begins in **October 2024** in a phased manner. Changes will be backported to **10.0.41 (PU65)** and all later releases. <br> 
- **What do you need to do if affected**: 
	- Step 1 - Create Connection string in Azure portal
	- Step 2 - In **Key vault parameters** create a Secret using the value created in step 1.
	- Step 3 - Change all applicable **Azure blob** connections: <br> 
		• Credential type: Key Vault <br>
		• Key vault: Secret setup in step 2
