---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL document type setting profiles - Shipment advice - Purchase order

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Shipment advice - Purchase order**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

| **Field**            | **Description**                                                                                                                                                                                                                  | **Options/Example** |
| :------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | :------------------ |
| **New indicator**    | When sending a purchase order advice, specify the indicator to notify the 3PL warehouse that the order is a new record.                                                                                                          | NPO                 |
| **Cancel Indicator** | Specify the indicator to notify the 3PL warehouse that the purchase order advice has been cancelled. <br> Note: To cancel a purchase order advice, navigate to the receipts list journal, select the record, then select cancel. | XPO                 |

## Where used

The **Setting profile** can be assigned on the Outgoing documents FastTab to document type [Shipment advice - Purchase order](../../DOCUMENTS/Shipment-advice-Purchase-order.md) for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity

- EDI Settings Shipment Advice - Purchase order
