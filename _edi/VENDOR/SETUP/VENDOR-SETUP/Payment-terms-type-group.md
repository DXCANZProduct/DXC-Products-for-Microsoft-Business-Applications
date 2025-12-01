---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Vendor setup
## Setup payment terms type group

Users can access the form by navigating to **EDI > Setup > Vendor setup > Payment terms type group**

Code identifying the type of payment terms. <br>

- Click **New** to create a new record
-	In the **Name** field, enter the name of the payment terms type group
-	In the **Description** field, enter a description of the payment terms type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Terms of payment**. Options are obtained from Terms of payment setup at **Accounts payable > Setup > Payment setup > Terms of payment**, examples: <br>
    - COD
    - Month+15
    - Net30
-	Specify the vendor's value used to identify the **EDI payment terms**.

## Where used
Payment terms type group is assigned on the [Vendor Trading partner's](../Trading-partner) Options field called **Payment terms type**. <br>
Used on field **TermsTypeCode** on EDI documents:
- Vendor purchase order
- Vendor purchase order change
- Purchase invoice

## Data entities:
- Vendor EDI payment terms type group
- Vendor EDI payment terms type lines
