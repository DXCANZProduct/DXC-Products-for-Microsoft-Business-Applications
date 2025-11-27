---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Freight forwarder setup

## Setup Shipping measurement unit mapping

Users can access the form by navigating to **EDI > Setup > Freight forwarder landed cost setup > Shipping measurement unit mapping**

Code mapping the Freight forwarders's value to a D365 Landed cost measurement unit. <br>
Used where the Freight forwarder’s shipping measurement units value differs to Landed cost’s shipping measurement units. <br>

- Click **New** to create a new record
- In the **Name** field, enter the name of the Shipping measurement unit mapping group
- In the **Description** field, enter a description of the Shipping measurement unit mapping group
- In the **Mappings** FastTab, select **Add** to create a new record
- Select the applicable Landed cost **Measurement unit** from the available list
- Specify the Freight forwarder's **Value**. Blank is allowed.

## Where used

Shipping measurement unit mapping is assigned on the [Freight forwarder landed cost Trading partner's](../Trading-partner.md) Options field called **Measurement unit**.

Used on the following EDI documents (field):

- Voyage creator (ShipMeasurementUnitExternal)
- Voyage creator (ShipLineMeasurementUnitExternal)

When the Voyage is created, the measurement and measurement unit are optional header and line fields.

## Examples

| D365 Landed cost Measurement unit | Trading partner values |
| :-------------------------------- | :--------------------- |
| **kgs**                           | KG                     |
| **CBM**                           | CR                     |

## Data entities:

- Shipping measurement unit mapping
- Shipping measurement unit mapping lines
