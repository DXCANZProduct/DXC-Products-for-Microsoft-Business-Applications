
---
layout: product-content
header: Core Extensions
toc: true
---

# Security configuration

## Core Extension
For Core Extensions/Core Utilities, there are no New Security roles as part of the ISV; however, we have extended standard security roles to allow for journal import menus to be displayed.  Additionally, you will require access to the required module and menu item to access the required enhanced feature.

The Import projects need to have security roles applied to them for non-administrator users to have permission to import files into the journals. 
It is recommended that the following roles be set to use the import features:

**Roles**         | **Import Feature**                    
:-----            |:------------------------        
Accounting Manager                | 	Import General Journal and Import Ledger Journal multi-company
Materials Manager                 |   Import Inventory Adjustment Journal
Materials Manager                 |   Import Inventory Movement Journal
Budget Manager                    |  Import Budgets


To run the User security audit details report, you must be assigned the “Security administrator” role.

**Data Anonymisation**
 
The Data Anonymisation feature can only be accessed by the System Administrator security role
 
To  Import or Export Printer management settings, you need access to the Data Management Framework.  To view the results, you require access to the relevant module and at a minimum Data management operations user to view execution results 

