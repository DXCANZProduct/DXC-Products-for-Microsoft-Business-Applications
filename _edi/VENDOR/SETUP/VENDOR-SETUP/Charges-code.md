---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Vendor setup
## Setup charges code

Users can access the form by navigating to **EDI > Setup > Vendor setup > Charges code**

Code identifying the service, promotion, allowance, or charge. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the charges code
-	In the **Description** field, enter a description of the charges code
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Charges code**. Options are obtained from **Charges code** setup at **Procurement and sourcing > Setup > Charges > Charges code**, examples: <br>
    -	Fee
    -	Freight
    -	Handling
    -	Install
    -	Insurance
-	Specify the vendor's value used to identify the **EDI charges code**.

## Where used
Charges code is assigned on the [Vendor Trading partner's](../Trading-partner) Options field called **Charges code**. <br>
Used on field **MiscCode** on EDI documents:
- Vendor purchase order
- Vendor purchase order change
- Purchase invoice

## Data entities:
- Vendor EDI charges code group
- Vendor EDI charges code lines
