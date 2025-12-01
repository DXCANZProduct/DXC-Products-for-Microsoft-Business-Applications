---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL document type setting profiles - Picking list

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Picking list**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Prevent cancel picking route**  |	When the warehouse is a 3PL EDI trading partner and has the **Picking list** document enabled, should the option of cancelling a picking route be prevented. 	| •	**Yes** - When a user attempts to cancel a picking route for the EDI trading partner, they will receive a warning ‘Cancel picking route is prevented for the EDI warehouse based on Picking list document settings.’ They won’t be able to cancel the picking route. This is used where the EDI trading partner doesn’t have the capabilities to process cancels via EDI. <br> •	**No** - The EDI trading partner has the capability to process cancelled picking lists via EDI. The picking list will be sent with an **Order purpose** of _Cancellation_

## Where used
The **Setting profile** can be assigned on the Outgoing documents FastTab to document type [Picking list](../../DOCUMENTS/Picking-list) for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings - Picking list
