---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# 3PL document type setting profiles - Inventory adjustment advice - Transfer

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Inventory adjustment advice - Transfer**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

**Field**           |	**Description**	                          | **Options/Example**
:-------            |:-------                                   |:----------
**Journal name**    |	Specify the transfer journal name for transfer adjustments	| Journal names of **Journal type** set to _Transfer_ from **Inventory management > Setup > Journal names > Inventory**
**Auto post journal** |	When the transfer journal is created, the journal should also be automatically posted	| • **No** – Transfer journal created, but not posted <br> • **Yes** – Transfer journal posted
**Create batch**	  | If the 3PL’s batch doesn’t exist in D365, allow the batch to be created. Batch details from message will be used to create the D365 batch	| • **No** – Staging record will error if batch doesn't exist in D365 <br> • **Yes** - D365 batch created and used in Transfer journal

## Where used
The **Setting profile** can be assigned on the Incoming documents FastTab to document type [Inventory adjustment advice - Transfer](../../DOCUMENTS/Inventory-adjustment-Transfer) for the 3PL Trading partner at **EDI > Setup > Trading partners**.

## Data entity
- EDI Settings Inventory adjustment - Transfer
