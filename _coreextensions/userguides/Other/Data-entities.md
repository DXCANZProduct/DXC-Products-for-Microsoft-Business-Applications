---
layout: product-content
header: Core Extensions
toc: true
---

# Data entities

The following is a summary of data entities available for the Core extension  module:

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | General journal entity  | create new  **General journal**. General ledger > Periodic task > Import general journal
1                 |Core ledger journal entity| Create New **General journal** for use with multiple legal entities <br> General ledger > Periodic task > Import ledger journal multi company

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Inventory adjustment journal headers and lines V2 entity | Create new ** Inventory adjustment journal**. Inventory management > Periodic tasks > Import inventory adjustment journal
1	                | Inventory movement journal headers and lines V4 entity  | Create new **Inventory movement journal  **. Inventory management > Periodic tasks > Import inventory movement journal

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Print management document settings  | Import/Export **Print management** settings.  Accounts payable > Setup > Forms > Form setup.  
1	                | Print management document settings  | Import/Export **Print management** settings.  Accounts receivable> Setup > Forms > Form setup.
1	                | Print management document settings  | Import/Export **Print management** settings.  Procurement and sourcing > Setup > Forms > Form setup
1	                | Print management document settings  | Import/Export **Print management** settings.  Project management and accounting > Setup > Forms > Form setup
1	                | Print management document settings  | Import/Export **Print management** settings.  Warehouse management > Setup>Warehouse management parameters > Print management
1	                | Print management document settings  | Import/Export **Print management** settings.  Transportation management>Setup > Transportation management parameters > Print management 
1	                | Print management document settings  | Import/Export **Print management** settings.  Inventory management > Setup > Inventory and warehouse management parameters > Print management  

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Data anonymization parameters  | Import/Export **Data anonymization parameters** <br> Organization administration > Setup > Data anonymization > Data anonymization parameters 
1	                | Data anonymization profile  | Import/Export **Data-Anonymization Profiles** (Name and Description). <br>  Organization administration > Setup > Data anonymization Profiles
2                 | Data anonymization table  | Import/Export **Data-Anonymization Table** settings.  Used to select tables and relevant legal entities to be included in the anonymization process.<br> Organization administration > Setup > Data anonymization Profiles   | Data anonymization profile
3	                | Data anonymization fields | Import/Export **Data-Anonymization Field** settings. Nominate the fields to be scrambled and the type of data you want to be populated <br> Organization administration > Setup > Data anonymization Profiles   | Data anonymization table


