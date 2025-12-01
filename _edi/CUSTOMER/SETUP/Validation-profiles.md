---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Customer setup
## Document types - Validation profiles

Users can access the form by navigating to **EDI > Setup > Document types**.

Validation profiles are groups of business validation rules that can be applied to a trading partner. They provide the ability to set variable tolerances on various different aspects of the documents business process. Once a validation profile is created it can be configured by adding validation rules to it and defining the error tolerance of the rule. <br>
Once setup for each document type, the validation profile can be assigned to each incoming document on the Trading partner setup in **EDI > Setup > Trading partners**.

> Note:  The validation profiles FastTab is only displayed from Document types that have valid validation options

- To create a new record, select the **New** button in the validation profiles FastTab.
- Specify the **Name** and **Description** of the profile.
- Select the **Name** hyperlink or the **Setup** button to update profile details.
- Select **Add** to add the validation rule.
- Select the **Validation rule**.
- Select the **Error tolerance** to specify the validation level.  If a validation rule fails, this will be used to determine how it reacts. Options:
  - **Info** - An Infolog is displayed with information only. If the validation rule fails a message will be written to the staging records log but the record will continue to process.
  - **Warning** - An Infolog is displayed with a warning. If the validation rule fails a message will be written to the staging records log but the record will continue to process. 
  - **Error** - An Infolog is displayed with an error. If the validation rule fails, the staging records will be set to error state and the target document note created/updated. Except for Customer module where an order hold will be applied to the sales order. The **Validation error hold code** that was assigned in EDI parameters will be applied to the Sales order.

The following customer documents have validation profiles:
- [Customer purchase order](VALIDATION-PROFILES/Customer-purchase-order)
- [Customer purchase order change](VALIDATION-PROFILES/Customer-purchase-order-change)
