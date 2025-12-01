---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL document type setting profiles - Shipment receipt - Return order

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Shipment receipt - Return order**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Auto post journal** |	When the return order receipt is received and arrival journal created, the journal should also be automatically posted	| • **No** – Arrival journal is created, but not posted <br> • **Yes** –  Arrival journal is automatically posted
**Post delivery note**  |	Enabled when **Auto post journal** is set to _Yes_. <br> Only posts the delivery note if none of the lines contains a _Replace_ Action since this requires manual action on the return order before a delivery note can be posted.	| • **No** – Return order’s delivery note is not posted <br> • **Yes** – Return order’s delivery note is automatically posted
**Cancel return quantity remainder**  | When the receipt qty < Return order line’s qty, the return order line’s qty is updated to match receipt. i.e. not split line created for 'remainder'	| If receipt qty < return qty: <br> • **No** – Return order line is split for the 'remainder' <br> • **Yes** – Return order line isn’t split for the 'remainder' and the existing line’s qty is updated to match receipt qty

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type [Shipment receipt - Return order](../../DOCUMENTS/Shipment-receipt-Return-order) for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings Shipment Receipt - Return order
