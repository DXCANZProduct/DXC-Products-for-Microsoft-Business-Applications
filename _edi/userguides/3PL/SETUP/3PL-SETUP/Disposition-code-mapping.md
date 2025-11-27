---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL setup

## Setup Disposition code mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Disposition code mapping**

Code mapping the 3PL's value to a D365 Disposition code. <br>

- Click **New** to create a new record
- In the **Name** field, enter the name of the disposition code mapping group
- In the **Description** field, enter a description of the disposition code mapping group
- In the **Mappings** FastTab, select **Add** to create a new record
- Select the **Disposition code** from the available list. Options are obtained from **Disposition code** setup at **Sales and marketing > Setup > Returns > Disposition codes**
- Specify the 3PL's value used to identify the **Value**

## Where used

Disposition code mapping is assigned on the [3PL Trading partner's](../Trading-partner.md) Options field called **Disposition code mapping**. <br>
Used on field **DispositionCodeExternal** on EDI documents:

- Shipment receipt - Return order

## Data entities:

- Disposition code mapping
- Disposition code mapping lines
