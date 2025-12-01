---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Customer setup
## Setup order purpose groups

Users can access the form by navigating to **EDI > Setup > Customer setup > Order purpose group**

EDI purchase orders can be received from trading partners with many order purposes.  The type identifier received can change the way the order is processed within D365.
-	Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order purpose group
-	In the **Description** field, enter a description of the order purpose group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Select the **Order purpose code**. Options are:
    -	**Original** - Indicates this the first/original order or agreement. Applies to document type **Customer purchase order**. 
    -	**Change** - Specifies the sales order change indicator. Applies to document type **Customer purchase order change**.
    -	**Cancellation** - Specifies the sales order cancellation indicator. Applies to document type **Customer purchase order** and **Customer purchase order change**.
    -	**Confirmation** - When receiving a Purchase Order Confirmation (POC) from a customer used to identify a "confirmation". Applies to document type **Customer purchase order**.
-	Specify the **indicator**/customer's value used to identify the **EDI order purpose**

Examples: <br>

**Order purpose** 	              | **X12 examples**                      | **EDIFACT examples**
:-------------------------------- |:------------------------------------- |:-------------------------------------
**Original**                      |	00	                                  | 9
**Change**                        |	04                                    | 4
**Cancellation**                  |	01	                                  | 1
**Confirmation**                  |	06	                                  | 6

## Where used
Order purpose group is assigned on the [Customer Trading partner's](../Trading-partner) Options field called **Order purpose**.

## Data entities:
-	Customer EDI order purpose group
-	Customer EDI order purpose lines
