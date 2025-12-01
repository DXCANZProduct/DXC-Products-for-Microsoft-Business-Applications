---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Vendor setup
## Setup order line change type group

Users can access the form by navigating to **EDI > Setup > Vendor setup > Order line change type group**

Order line change type codes are used to identify the type of line change sent the the vendor in the Vendor purchase order change document.

-	Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order line change type group
-	In the **Description** field, enter a description of the order line change type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order line change type**
-	Specify the vendor's value for the line change type in **EDI order change type**
-	Set **Don't send change** - Ability to limit when a staging record is created. Vendor purchase order change staging record will not be created where all line's **Order line change type**'s **Don't send change** is set to _Yes_.

The Order line change types are:

**Order line change type** 	        | **Description of D365 purchase order line change**            | **X12 examples**
:-----------------------------------|:-------------------------------------                         |:----------------:
**Add additional item**             | New purchase order line was added to existing purchase order	| AI
**Delete items**                    | Existing purchase order line’s Deliver remainder has been cancelled, or removed       | DI
**Changes to line items**           | Multiple changes to existing purchase order line, for example quantity and price      | CA
**Price change**                    | Price change only to existing purchase order line                                     | PC
**Quantity decrease**               | Only quantity decrease to existing purchase order line                                | QD
**Quantity increase**               | Only quantity increase to existing purchase order line                                | QI
**Reschedule**                      | Only requested delivery date change to existing purchase order line                   | RS
**No change**                       | No changes to existing purchase order line                                            | NC


## Where used
Vendor EDI order line change type group is assigned on the [Vendor Trading partner's](../Trading-partner) Options field called **Order line change type**. <br>
Used on field **LineChangeType** on EDI documents:
- Vendor purchase order change

## Data entities:
- Vendor EDI order line change type group
- Vendor EDI order line change type group line
