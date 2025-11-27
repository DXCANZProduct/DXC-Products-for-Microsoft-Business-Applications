---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL setup

## Setup Order purpose group

Users can access the form by navigating to **EDI > Setup > 3PL setup > Order purpose group**

Code mapping the 3PL's value to a EDI order purposes. <br>

- Click **New** to create a new record
- In the **Name** field, enter the name of the order purpose group
- In the **Description** field, enter a description of the order purpose group
- In the **Mappings** FastTab, select **Add** to create a new record
- Select the **Order purpose code** from the available list. Options are Original, Change and Cancellation
- Specify the 3PL's value used to identify the **EDI order purpose**

## Where used

Order purpose group is assigned on the [3PL Trading partner's](../Trading-partner.md) Options field called **Order purpose**. <br>
Used on field **OrderPurpose** on EDI documents:

- Picking list

## Data entities:

- 3PL EDI order purpose group
- 3PL EDI order purpose lines
