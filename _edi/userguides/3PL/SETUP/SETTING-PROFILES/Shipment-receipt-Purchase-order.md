---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL document type setting profiles - Shipment receipt - Purchase order

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Shipment receipt - Purchase order**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

| **Field**             | **Description**                                                                                                                           | **Options/Example**                                                                                                                 |
| :-------------------- | :---------------------------------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------------------------------- |
| **Create batch**      | If the 3PL’s batch doesn’t exist in D365, allow the batch to be created. Batch details from message will be used to create the D365 batch | • **No** - Staging record will error if batch doesn't exist in D365 <br> • **Yes** - D365 batch created and used in Arrival journal |
| **Auto post receipt** | Option to automatically post product receipt for registered stock                                                                         | • **No** - Only arrival journal posted <br> • **Yes** - Arrival journal posted and purchase order product receipt posted            |

## Where used

The **Setting profile** can be assigned on the Incoming documents FastTab to document type [Shipment receipt - Purchase order](../../DOCUMENTS/Shipment-receipt-Purchase-order.md) for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity

- EDI Settings Shipment Receipt - Purchase order
