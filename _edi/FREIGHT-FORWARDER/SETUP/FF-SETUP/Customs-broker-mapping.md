---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Freight forwarder setup
## Setup Customs broker mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Customs broker mapping**

Code mapping the Freight forwarders's value to a D365 Vendor of Shipping type set to Customs broker. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Customs broker mapping group
-	In the **Description** field, enter a description of the Customs broker mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Customs broker** from the available list. Options are obtained from **Vendor account** setup at **Accounts payable > Vendors > All vendors**, where the Voyage's **Shipping type** is set to _Customs broker_
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Customs broker mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner) Options field called **Customs broker**.

Used on the following EDI documents (field):
- Voyage creator (ShipCustomsBroker)

## Data entities:
- Customs broker mapping
- Customs broker mapping lines
