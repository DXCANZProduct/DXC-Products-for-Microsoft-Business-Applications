---
# required metadata

title: License manager 
description: License manager - PowerApp 
author: hho34
manager: Kym Parker
ms.date: 2023-06-07
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
# ms.custom: ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# License Manager PowerApp 
## License Manager Views

**Logo** | **View**
:--       |:--
![License Manager PowerApp ](IMAGES/Peoplelogo.png "Peoplelogo") | **Customers -** View, edit or add new Product Customer details and view, edit or add new Customer products  
Box in circle (hidden at the bottom left) | **Products -** View, edit or add new Products
![License Manager PowerApp ](IMAGES/Expiry.png "Expiry Report") | **Expiry(s) report -** View expired and due to expire licenses based on filter criteria

## Customer Details
Customer Information shows all information relating to the Customer who has licensed Products by the organization <br>
•	Customer Name – Official Name of the customer <br>
•	Customer Description – Description or a.k.a name for the customer <br>
•	Customer Region - Used to identify the region of the customer head office <br>
•	Customer Number – Used to identify the customer in sales/finance systems <br>

## Customer Products
Customer Products shows a list of all Products that have been licensed for the selected customer.
The following will either display a green tick (active) or red cross (inactive/expired): <br>
**•	Active** – Where the customer product Subscription End Date (Expiry Date) has not been reached <br>
**•	Enabled** – Customer products Enabled is set to YES <br>
**•	Site License** – Customer product’s Site (Module) License is set to YES. Where this is inactive, No. of Users MUST be completed <br>
The other options available on this form include: <br>

- Edit
![License Manager PowerApp ](IMAGES/Edit.png "Edit")

  -	**Product** - Select Product from the list of available Products <br>
  -	**License Type** - Options Include: <br>
             -	Perpetual - Product purchased with perpetual license, but maintenance should still be invoiced in order to receive ‘latest’ code  <br>
             -	Month - Subscription License billed monthly <br>
             -	Quarter - Subscription License billed quarterly <br>
             -	Annual - Subscription License billed annually <br>
             -	Subscription - Licensed based on subscription model <br>
             -	Temp - A temp license has been provided to enable customer to evaluate the product <br>



