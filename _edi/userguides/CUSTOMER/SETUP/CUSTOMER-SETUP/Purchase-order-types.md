---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Customer setup

## Setup purchase order types

Users can access the form by navigating to **EDI > Setup > Customer setup > Customer EDI order type group**

EDI purchase orders can be received from trading partners with many order types. The type identifier received can change the way the order is processed within D365. <br>

> Note: Fields flagged with \* has been deprecated from **Customer EDI order type group**. Backwards compatibility option (EDI parameters > Allow historic PO types) allows companies to show these deprecated options in Customer EDI order type group. These \* options have been moved to **Order purpose group**

- Click **New** to create a new record.
- In the **Name** field, enter the name of the order type group
- In the **Description** field, enter a description of the order type group
- In the **Mappings** FastTab, select **Add** to create a new record
- Select the **Order Type**. Options are: <br>
  - **Order** - When receiving a Purchase Order from a customer used to identify a "normal" order using these characters. Creates a standalone D365 sales order.
  - \* **Confirmation** - When receiving a Purchase Order Confirmation (POC) from a customer used to identify a "confirmation". Confirms an existing D365 sales order. Usually receive in response to a Purchase Order Acknowledgement (POA) sent to the customer.
  - **Agreement** - When receiving a Purchase Order from a customer used to identify a "blanket" order. Creates a D365 sales agreement.
  - **Release order** - When receiving a Purchase Order from a customer used to identify a "release" order. Creates a D365 release order against a D365 sales agreement. Customer purchase order document setting 'Create release order without a blanket order' provides options No, Yes, Warning in cases where a release order is recieved without a matching D365 sales agreement.
  - \* **Cancellation** - Specifies the sales order cancellation indicator. Cancels the D365 sales order or agreement.
- Specify the **indicator**/Customer's value used to identify the EDI order type.

Examples: <br>

| **Order type**    | **X12 examples**                                            | **EDIFACT examples**     |
| :---------------- | :---------------------------------------------------------- | :----------------------- |
| **Order**         | **SA** - Stand Alone Order <br> **KN** - Purchase Order     | **220** - Order          |
| **Agreement**     | **KA** - Agreement <br> **KB** - Blanket Purchase Agreement | **221** - Blanket order  |
| **Release order** | **RL** - Release or Delivery Order                          | **226** - Call off order |

## Where used

Customer EDI order type group is assigned on the [Customer Trading partner's](../Trading-partner.md) Options field called **Customer EDI order types**.

## Data entities:

- Customer EDI order type group
- Customer EDI order type lines
