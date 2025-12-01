---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Vendor setup
## Setup purchase order types

Users can access the form by navigating to **EDI > Setup > Vendor setup > Order type group**

EDI purchase orders can be sent to trading partners with many order types.  The type identifier sent can change the way the order is processed within the trading partner's system. <br>

- Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order type group
-	In the **Description** field, enter a description of the order type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order Type**. Options are: <br>
    -	**Order** - When creating a purchase order to the vendor; used to identify a "normal" order using these characters 
    -	**Agreement** - When sending a purchase agreement to a vendor; used to identify a "blanket" order
    -	**Release order** - When the purchase order was created by releasing from a purchase agreement
-	Specify the vendor's value used to identify the **EDI order type**

Examples: <br>

**Order type** 	                  | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Order**                         |	**SA** - Stand Alone Order <br> **KN** - Purchase Order	| **220** - Order 
**Agreement**                     |	**KA** - Agreement <br> **KB** - Blanket Purchase Agreement | **221** - Blanket order
**Release order**                 |	**RL** - Release or Delivery Order	  | **226** - Call off order

## Where used
Order type group is assigned on the [Vendor Trading partner's](../Trading-partner) Options field called **Order type**. <br>
Used on field **OrderType** on EDI documents:
- Vendor purchase order
- Vendor purchase order change

## Data entities:
- Vendor EDI order type group
- Vendor EDI order type lines
