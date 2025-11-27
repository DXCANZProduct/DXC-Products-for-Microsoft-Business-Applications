---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Freight forwarder setup
## Setup Shipping port mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping port mapping**

Code mapping the Freight forwarders's value to a D365 Landed cost shipping port. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the shipping port mapping group
-	In the **Description** field, enter a description of the shipping port mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Shipping port** from the available list. Options are obtained from **Shipping port** setup at **Landed cost > Delivery information setup > Shipping ports**
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Shipping port mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner.md) Options field called **Port**.

Used on the following EDI documents (field):
- Voyage creator (ShipFromPort)
- Voyage creator (ShipToPort)
- Voyage tracking (Port)

## Data entities:
- Shipping port mapping
- Shipping port mapping lines
