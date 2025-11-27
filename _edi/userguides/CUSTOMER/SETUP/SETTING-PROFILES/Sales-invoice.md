---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Customer document type setting profiles - Sales invoice

Users can access the form by navigating to **EDI > Setup > Document types**.

- To create a new record, select document type **Sales invoice**.
- Select the **New** button in the **Settings profiles** FastTab.
- Specify the **Settings profile id** and **Description** of the profile.
- Select the Settings profile id hyperlink or the **Setup** button to update profile details.

| **Field**                    | **Description**                                                                                                                                                      | **Options/Example**                                                                                                                                                                                                                                                   |
| :--------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| <ins>**Invoice type**</ins>  |                                                                                                                                                                      |
| **Invoice**                  | Specify mapping for Invoice                                                                                                                                          | • EDIFACT example: 388 = Tax invoice or 380 = Commercial invoice <br> • X12 example: VJ = Commercial invoice                                                                                                                                                          |
| **Send only for EDI orders** | Option to only create a Sales invoice staging record where the sales order was created via EDI. <br> Only applies to customers that have this document type enabled. | • **Yes** – Sales invoice staging record will only be created when the sales order was created via EDI <br> • **No** – Sales invoice staging record will be created for all sales orders.                                                                             |
| **Credit adjustment note**   | Specify mapping for Credit note                                                                                                                                      | • EDIFACT example: 381 = Credit note <br> • X12 example: CR = Credit memo                                                                                                                                                                                             |
| **Don't send credit note**   | Specify if credit notes should be sent to the customer                                                                                                               | • **No** - When posting a credit note, the **Send to EDI** will be set to _No_ and won't create a Sales invoice staging record. <br> • **Yes** - When posting a credit note, the **Send to EDI** will be set to _Yes_ and will create a Sales invoice staging record. |

## Where used

The **Setting profile** can be assigned on the Outgoing documents FastTab to document type **Sales invoice** for the Customer Trading partner at **EDI > Setup > Trading partners**.

## Data entity

- EDI Settings - Sales invoice
