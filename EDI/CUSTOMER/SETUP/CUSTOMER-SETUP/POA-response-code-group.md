---
# required metadata

title: EDI Customer
description: EDI Customer setup - POA responde code group
author: jdutoit2
manager: Kym Parker
ms.date: 2023-10-20
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDICustPOACodesMapping
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconEDICustomerDocuments
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Customer setup
## Setup POA responde codes

Users can access the form by navigating to **EDI > Setup > Customer setup > POA response code group**

POA Response codes are used to identify the status of information used in a Purchase Order Acknowledgement (POA) for each customer.
- Click **New** to create a new record. 
- In the **Name** field, enter the name of the POA response code group
- In the **Description** field, enter a description of the POA response code group
- In the **Mappings** FastTab, select **Add** to create a new record
- Specify the **POA code** to be used for each response code. The POA response codes are:

**Response code** 	              | **Description**                       | **Example**          | **Target POA field**
:-------------------------------- |:------------------------------------- |:---------------------|:------------------
<ins>**Header response codes**</ins>    |   |
**Header – accept**               |	Order accepted	                      | A                    | POA header - POA code
**Header – accepted with reserve**|	Order accepted with reserve	          | AR                   | POA header - POA code
**Header – change**               |	Change to the Order header's dates    | C	                 | POA header - POA code
**Header – not accepted**         |	Order not accepted	                  | NA                   | POA header - POA code
<ins>**Line response codes**</ins>      |   |
**Line price – accept**           |	Item price accepted                   |	PO                   | POA lines - POA code item
**Line price – advise**           |	Advise of a price difference	        | PA                 | POA lines - POA code item
**Line item – accept**            |	Item quantity accepted	              | IQA                  | POA lines - POA code item
**Line item – out of stock**      |	Advise of stock shortage	            | IS                 | POA lines - POA code item
**Line item – withdrawn**         |	Advise item is no longer available	  | LW                   | POA lines - POA code item
**Line item – pack accept**       |	Item pack accepted	                  | LPA                  | POA lines - POA code item
**Line item – pack difference**   |	Advise of pack difference	            | PD                 | POA lines - POA code item
**Line item – inner accept**      |	Item inner accepted	                  | LIA                  | POA lines - POA code item
**Line item – inner difference**  |	Advise of inner difference	          | ID                   | POA lines - POA code item
**Line shipment – partial**       |	Advise of partial shipment	          | SP                   | POA lines - POA code shipment
**Line shipment – full**          |	Advise of full shipment               |	SF                   | POA lines - POA code shipment
**Line item - accept**            | Item accepted                         | IA                   | POA lines - POA code line
**Line item - advise**            | Advise of line                        | IC                   | POA lines - POA code line
**Line item - reject**            | Item rejected                         | IR                   | POA lines - POA code line



- In the **Allow auto trigger** field, select if the POA response can be triggered by **Auto set response codes**. <br> The following response codes can only be manually triggered and thus their **Allow auto trigger** is set to _No_ and disabled:
    - Header – not accepted
    - Line item – withdrawn
- In the **Allow auto send** field, select if the POA response should be included in the periodic task **Send customer purchase order acknowledgement**

## Scenarios
The following section decribes how the EDI module sets the POA auto response code. <br>
This is applicable to Response codes where **Allow auto trigger** is set to Yes.

### Line POA response codes
#### Line price
- **Line price - accept**: Acknowledged **unit price** = Customer's EDI purchase order line's **unit price**.
- **Line price - advise**: Acknowledged **unit price** <> Customer's EDI purchase order line's **unit price**. Customer purchase order document setting **Use customer price** is set to _Yes_, and sales order line's unit price doesn't equal the Customer's EDI purchase order line's unit price.

#### Line item quantity
- **Line item - accept**: Acknowledged **quantity** = Customer's EDI purchase order line's **quantity**.
- **Line item - out of stock**: Acknowledged **quantity** <> Customer's EDI purchase order line's **quantity**. Customer purchase order acknowledgement document setting **Quantity type** is set to use Reserved quantity, and sales order line's reserved quantity is less than the Customer's EDI purchase order line quantity.
- **Line item - withdrawn**: Can't be auto triggered.

#### Line shipment
- **Line shipment – partial**: Customer Trading partner's **No backorder** is set to _Yes_ and Acknowledged **quantity** <> Customer's EDI purchase order line's **quantity**
- **Line shipment – full**: Customer Trading partner's **No backorder** is set to _No_. Acknowledged quantity vs. Customer's EDI purchase order line's quantity doesn't impact when **No backorder** is set to No.

#### Line item pack
- **Line item - pack accept**: Acknowledged **Pack** = Customer's EDI purchase order line's **Pack**.
- **Line item - pack difference**: Acknowledged **Pack** <> Customer's EDI purchase order line's **Pack**. Customer purchase order acknowledgement document setting **Pack type** is set to use **System pack**, and sales order line's pack isn't the same as the Customer's EDI purchase order line's pack.

#### Line item inner
- **Line item - inner accept**: Acknowledged **Inner** = Customer's EDI purchase order line's **Inner**.
- **Line item - inner difference**: Acknowledged **Inner** <> Customer's EDI purchase order line's **Inner**. Customer purchase order acknowledgement document setting **Inner type** is set to use **System inner**, and sales order line's pack isn't the same as the Customer's EDI purchase order line's pack.

#### Line
- **Line - accept**: If all the applicable line codes are accept
- **Line - advise**: If all the applicable line codes are combination of advise and reject
- **Line - reject**: If all the applicable line codes are reject

Response code is only applicable if mapped.

The following responses are deemed Accept:
- Line price - accept
- Line item - accept
- Line item - pack accept
- Line item - inner accept
- Response code not mapped

The following responses are deemed Reject:
- Line price - advise
- Line item - out of stock
- Line item - withdrawn
- Line item - pack difference
- Line item - inner difference

### Header POA response codes
- **Header - accept**: When all of below applies <br>
    - Header acknowledged dates = Customer's dates
    - Line price - accept
    - Line item - accept
    - Line item - pack accept
    - Line item - inner accept
- **Header - accepted with reserve**: <br>
    -  Header acknowledged dates = Customer's dates, and any of below are not accept:
    - Line price
    - Line item
    - Line item - pack
    - Line item - inner
- **Header - change**: <br>
    - When either of the acknowledged dates (deadline or delivery) differ from Customer's dates
    - Line response codes have no effect

## Where used
POA response code group is assigned on the [Customer Trading partner's](../Trading-partner.md) Options field called **POA responde code group**.

## Data entities:
- POA response code group
- POA response code group lines
