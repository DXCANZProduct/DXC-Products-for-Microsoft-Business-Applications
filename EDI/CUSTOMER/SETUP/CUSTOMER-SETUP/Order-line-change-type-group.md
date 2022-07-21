---
# required metadata

title: EDI Customer
description: EDI Customer setup - Order line change type group
author: jdutoit2
manager: Kym Parker
ms.date: 2021-09-30
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer setup
## Setup order line change type group

Users can access the form by navigating to **EDI > Setup > Customer setup > Order line change type group**

Order line change type codes are used to identify the type of line change received from the customer in the Customer purchase order change document.
Manual Processing method overrides below update tolerances. It is still required to setup the line change types for manual processed customers in order to map the Customer’s line change type to D365 line change type, and this determines what can be changed/added.

-	Click **New** to create a new record. 
-	In the **Name** field, enter the name of the order line change type group
-	In the **Description** field, enter a description of the order line change type group
-	In the **Mappings** FastTab, select **Add** to create a new record
-	Specify the **Order line change type**
-	Specify the **indicator**/Customer's value for the line change type in EDI order change type
-	In the **Update tolerance** field, select if the order line change type can update the existing D365 Sales order with the Automatic processing method. The update tolerance is bypassed for Processing method Manual. Options:
    - **Approve**: If all the line changes received are approved, the sales order will be updated.
    - **Approve with warning log**: If all the line changes received are approved, the sales order will be updated. Warning log created on EDI staging record.
    - **Reject with warning log**: If any of the line changes received are Reject, the sales order will not be updated. The Staging record will error, but change can still be viewed via Changes on the Sales order header – EDI ribbon.

The Order line change types are:

**Order line change type** 	        | **If update is allowed**                                      | **X12 examples**
:-----------------------------------|:-------------------------------------                         |:----------------:
**No change**                       | Line is ignored	                                            | NC
**Add additional item**             | New sales order line is added to existing sales order	        | AI
**Delete items**                    | Existing sales order line’s Deliver remainder is cancelled    | DI
**Quantity decrease**               | Existing sales order line’s quantity is reduced	            | QD
**Quantity increase**               | Existing sales order line’s quantity is increased	            | QI
**Change of dates**                 | Existing sales order line’s requested ship and receipt dates are updated	| CT
**Price change**                    | Existing sales order line’s price is changed. Document setting (use customer price and allowed variance) and Validation (Sales price) applies on what price update values are allowed. | PC
**Price and quantity change**       | Existing sales order line’s price and/or quantity is changed (up/down). Document setting (use customer price and allowed variance) and Validation (Sales price) applies on what price update values are allowed | PQ
**Changes to line items**           | Existing sales order line’s price, quantity and/or dates are changed. Document setting (use customer price and allowed variance) and Validation (Sales price) applies on what price update values are allowed	| CA

D365 sales order line allowed changes by Order line change type:

**Order line change type**  | **Requested dates** | **Add new items** | **Cancel deliver remainder** | **Sales qty increase** | **Sales qty decrease** | **Sales unit price**
:---------------------------|:--:                 | :--:              | :--:                         | :--:                   | :--:                   | :--:
**No change**	            | N                   |	N	              | N                            |	N                     | N                      | N
**Add additional item**	    | N/A	              | Y	              | N/A	                         | N/A	                  | N/A	                   | N/A
**Delete items**	        | N                   |	N	              | Y	                         | N                      |	N                      | N
**Quantity decrease**	    | N                   |	N                 |	N                            | N <br> Y (If doc setting allows) | Y            | N
**Quantity increase**	    | N                   | N	              | N	                         | Y	                  | N <br> Y (If doc setting allows) | N
**Change of dates**	        | Y	                  |	N	              | N	                         | N	                  | N                      | N
**Price change**	        | N                   |	N                 |	N                            | N                      |	N                      | Y
**Price and quantity change** | N                 |	N                 |	N                            | Y	                  | Y	                   | Y
**Changes to line items**	| Y	                  | N                 |	N                            | Y                      |	Y                      | Y


## Where used
Customer EDI order line change type group is assigned on the [Customer Trading partner's](../Trading-partner.md) Options field called **Order line change type group**.

## Data entities:
- Customer EDI order line change type group
- Customer EDI order line change type group line
