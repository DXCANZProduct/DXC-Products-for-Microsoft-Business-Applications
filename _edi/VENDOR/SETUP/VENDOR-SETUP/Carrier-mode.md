---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Vendor setup
## Setup carrier mode

Users can access the form by navigating to **EDI > Setup > Vendor setup > Carrier mode**

Code specifying the method or type of transportation for the shipment. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the carrier mode
-	In the **Description** field, enter a description of the carrier mode
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Mode**. Options are obtained from **Modes** setup at **Transportation > Setup > Carriers > Mode**, examples: <br>
    - Air
    - Rail
-	Specify the vendor's value used to identify the **EDI carrier mode**.

## Where used
Carrier mode is assigned on the [Vendor Trading partner's](../Trading-partner) Options field called **Carrier mode**. <br>
Used on field **CarrierMode** on EDI documents:
- Vendor purchase order
- Vendor purchase order change

## Data entities:
- Vendor EDI carrier mode group
- Vendor EDI carrier mode lines
