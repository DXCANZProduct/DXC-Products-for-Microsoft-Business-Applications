---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Freight forwarder setup
## Setup Shipping port qualifier mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping port qualifier mapping**

Used to map the Freight forwarder’s shipping port qualifier value to indicate if the port referred to in the message is the **From port** or **To port**.

- Click **New** to create a new record
-	In the **Name** field, enter the name of the Shipping port qualifier mapping group
-	In the **Description** field, enter a description of the Shipping port qualifier mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Shipping port qualifier** from the available list. Options include: 
    - From port
    - To port	
-	Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used
Shipping port qualifier mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner) Options field called **Port qualifier**.

Used on the following EDI documents (field):
- Voyage tracking (PortQualifier)

If the voyage tracking leg, whose tracking is being updated, includes a From and To port (Example: Air or Sea legs), the **Shipping port mapping** and **Shipping port qualifier** will be used to find the applicable leg to update. This is especially useful for journeys with multiple sea and/or air legs.

## Examples

EDI port qualifier	| Trading partner values    | Description
:--                 |:--                        |:--
**From port**       | L                         | Port of Loading
**From port**	    | R                         | Place of Receipt
**To port**	        | D                         | Port of Discharge
**To port**	        | E                         | Place of Delivery

## Data entities:
- Shipping port qualifier mapping
- Shipping port qualifier mapping lines
