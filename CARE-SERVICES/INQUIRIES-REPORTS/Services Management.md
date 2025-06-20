---
# required metadata

title: DXC Care services 
Description: Care services, Accommodation Payments
author: Helen Ho
Manager: Pontus Ek
ms.date: 2025-03-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci 

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-03-31
ms.dyn365.ops.version: 10.0.40
---

# Services Management

Services are setup for Residential Care services facilities, Retirement Villages, or community/disability service organisations.

### Creating a new service type

**Path: Care services \> Setup\> Service \> Service Types**

1.  Click on \<New\> to add a new service type.
2.  Enter a unique code and description of that service type
3.  Funded – tick if the service is government funded
4.  Allow partners – tick if partners are admitted to the same place, eg. Tick for independent living where more than one person may reside in the same accommodation place
5.  Legal entity for payment advice logo – if using payment advices select which legal entity logo is to be used for this service type

### Creating a new care type

**Path: Care services \> Setup\> Service \> All services**

1.  Click on \<New\> to add a new care type.
2.  Enter a unique code and description of that care type
3.  Funded – Set to Yes if this care type receives government funding
4.  Subsidy/Events required – Set to yes if events such as ACAR forms are required to be generated
5.  Schedule creation template – select the template that is required for this care type

### Creating a new service

**Path: Care services \> Setup\> Service \> All services**

1.  Click on \<New\> to add a new service.
2.  Populate the Service code, Service type and Description.
3.  Select Active = Yes
4.  Select ‘Place is required on service entry’ for Care services facilities and Retirement villages. This will make the place field mandatory so it will require the client to be admitted to a place when the service entry is added.
5.  Select ‘Enable place address transfer’ to enable the transfer of the place address to become the client’s primary address when the service entry is added.
6.  Populate the relevant details.
7.  Select relevant care type(s)
8.  Select Add to add address and contact information.

### Creating places

**Path: Care services \> Setup\> Service \> All services \> Places**

Services setup with ‘Place is required on service entry’ selected enables the ability to setup beds, rooms, units and other places.

1.  Click on \<New\> to add a new place.
2.  Populate code, description, place type and other details.
3.  Add a price for the place.
4.  Add a valuation for the retirement village place.
5.  Add the relevant feature(s)
6.  Add the address details.
