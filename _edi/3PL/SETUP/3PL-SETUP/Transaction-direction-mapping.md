---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL setup
## Setup Transaction direction mapping

Users can access the form by navigating to **EDI > Setup > 3PL setup > Transaction direction mapping**

Code mapping the 3PL's value to a EDI Transaction direction. <br>
With some EDI standards quantities are always positive. The transaction direction code indicates if the movement is **out** or **into** inventory. When direction mapping indicates an **out** value, the quantity is converted to **negative**. All in direction quantities are used as-is. A blank in mapping is also acceptable. If no mapping is assigned to the 3PL, the qty’s will be used as-is (not converted).

- Click **New** to create a new record
-	In the **Name** field, enter the name of the transaction direction mapping group
-	In the **Description** field, enter a description of the transaction direction mapping group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Transaction direction**. Options are In or Out.
-	Specify the 3PL's value used to identify the **EDI code**

## Where used
Transaction direction mapping is assigned on the [3PL Trading partner's](../Trading-partner) Options field called **Transaction direction mapping**. <br>
Used on field **TransactionDirection** on EDI documents:
- Inventory adjustment - Movement

## Data entities:
- Transaction direction mapping
- Transaction direction mapping lines
