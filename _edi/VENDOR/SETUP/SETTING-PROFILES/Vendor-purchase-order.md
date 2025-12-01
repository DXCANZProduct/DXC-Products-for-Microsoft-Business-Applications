---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Vendor document type setting profiles - Purchase order

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Vendor purchase order**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
<ins>**Purchase order**</ins> |
**Package size – inner/outer**  |	Specify if the inner or outer pack quantity is sent on the purchase order	  | •	Inner <br> •	Outer
**Form note**       |	Header note to send on all purchase orders to the vendor	| •	**Default** - uses Form notes from Procurement and sourcing > Purchase order <br> •	**EDI note** - EDI note becomes available <br> •	**Blank** - blank header note is sent
**EDI note**        |	Memo field	                              | Greyed out if **Form note** is not set to _EDI note_
<ins>**Acknowledgement**</ins>	|
**Acknowledgement required**  |	Specify if the order should receive a purchase order acknowledgement from the Vendor. Affects PO status and POA status. | • **Yes** - Purchase order **status** is updated to _In external review_ (similar to Vendor collaboration) when sending the purchase order to the Vendor (via clicking Confirm/Confirmation on PO), until an **Header - Accept** POA is received back from the Vendor OR updated Purchase order values match to vendor’s Purchase order acknowledgement. The **Acknowledgement status** on the purchase order header is set to _Acknowledgement pending_. <br> • **No** - Purchase order **status** is set to _Confirmed_ and the **Acknowledgement status** on the purchase order header is _blank_. Also see following [summary](Vendor-purchase-order-acknowledgement#acknowledgement-and-purchase-order-confirmation-required).

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Vendor purchase order** for the Vendor Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI settings - Vendor documents purchase order
