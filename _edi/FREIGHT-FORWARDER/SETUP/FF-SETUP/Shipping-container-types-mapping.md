---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Freight forwarder setup
## Setup Shipping container types mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping container types mapping**

Code mapping the Freight forwarders's value to a D365 Landed cost shipping containers. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Shipping container types mapping group
-	In the **Description** field, enter a description of the Shipping container types mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Shipping container type** from the available list. Options are obtained from **Shipping container type** setup at **Landed cost > Containers setup > Shipping container types**
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Shipping container types mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner) Options field called **Container type**.

Used on the following EDI documents (field):
- Voyage creator (ShipContainerTypeId) 

## Examples
D365 Landed cost Shipping container types	| Trading partner values
:--                                       |:--
**40’FCL**                                |	40HC
**40’FCL**                                |	4000
**20’FCL**                                |	2000

## Data entities:
- Shipping container type mapping
- Shipping container type mapping lines
