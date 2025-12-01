---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL setup
## Setup Inventory status Id mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Inventory status Id mapping**

Code mapping the 3PL's value to a D365 Inventory status Id. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the inventory status Id mapping group
-	In the **Description** field, enter a description of the inventory status Id mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Inventory status** from the available list. Options are obtained from **Inventory status** setup at **Warehouse management > Setup > Inventory > Inventory statuses**
-	Specify the 3PL's value used to identify the **Value**

## Where used
Inventory status Id mapping is assigned on the [3PL Trading partner's](../Trading-partner) Options field called **Inventory status Id mapping**. <br>
Used on field **InventStatusId** on EDI documents:
- Picking list registration
- Shipment receipt - Purchase order
- Shipment receipt - Transfer order
- Shipment receipt - Return order
- Shipment receipt - Voyage
- Inventory adjustment - Transfer (InventStatusIdFrom and InventStatusIdTo)
- Inventory adjustment - Counting
- Inventory adjustment - Reconciliation
- Inventory adjustment - Movement

## Data entities:
- Inventory status Id mapping
- Inventory status Id mapping lines
