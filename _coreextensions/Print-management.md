---
layout: product-content
header: Core Extensions
toc: true
---

# Import/Export Printer management settings

## Overview

A new data entity titled “Print management document settings” has been developed to allow for the export and subsequent import of document settings within the printer management forms, including conditional settings.  The entity facilitates export to a CSV Format or Excel (limited functionality) file where they can be subsequently imported into another environment or legal entity.  This new data entity is capable of exporting settings related to other DXC products that utilise the print Management forms, including [Smart Send](https://dxcmsanzproduct.com/smartsend)and [DocuSign](https://dxcanzproduct.github.io/DXC-Products-for-Microsoft-Business-Applications/DOCUSIGN/INTRODUCTION.html).   The entity only exports printer settings that have been set and will not export settings in “default” status (eg where the report output has not been configured).

Print Management settings are available in the following Modules-<br>
* Accounts receivable
* Accounts payable
* Inventory management
* Procurement and sourcing
* Project management and accounting
* Transportation management
* Warehouse management


## Print management document settings

### Data Entity Overview

The *Print management document settings* entity allows for existing Print management settings to be exported into..  Complex conditional settings can be exported and copied to sandbox environments for testing or training as well as copying between legal entities, keeping in mind that number sequences and conditions are not always the same between legal entities.  
Conditional settings can be set up with specific parameters related to customer/vendor accounts, transaction conditions and more.  These conditions are built as a query and stored in the database as a complex string of data.  Due to Excel field limitations conditional format settings should only be exported using CSV format, not .xlxs

To Export Print management settings 
1. Navigate to **Workspaces > Data management > Export**
2. Create a new Group
    * **Group name** - Enter a name for the processing group e.g. Printer setup
    * **Description**	- Enter a description for the processing group e.g. Print management Settings Date 
    * **Data project operation type**	- Export
3.	Select Add Entity
4.	Complete the dialog, 
    * **Entity name**	- Print management document settings
    * **Target data format** - CSV (due to complex string data format Excel is not recommended if import is required at a later date)
    * **Use sample file**	- No
    * **Skip staging** - No (the entity will override the default value of Yes once added)
    * **Default refresh type** - All fields
5.	Select Add
7.	Select Close
8.	Select Export options > Export now from the action pane
9.	Once completed  select Download file from the menu bar
10.	This downloads a CSV file which can  be used in the Import process or stored as a backup in case of user error

Below is a brief outline of the fields in the entity.

|  **Field**  | **Description** | 
|:---|:---|     
|  **PRINTMGMTDOCINSTANCENAME**  | This is the identifier for the record, For an original, the name is always Original. For a copy, you can customise a name. | 
|  **NODETYPE**  | Finance and Operation area that the print settings relate to.  For Example, Sales, Purchase, Project etc. <br> The node does not represent the Module, for example Accounts receivable module holds settings for Sales and some Inventory related tasks such as picking list |   
|  **PRIORITYID**  | Name of the form within Print management setup.  Eg. SalesOrderConfirmation. |  
|  **DESCRIPTION**  | Select the report name available in the system. |  
|  **DESTINATIONEMAILCC** <br>  **DESTINATIONEMAILFILEFORMAT** <br> **DESTINATIONEMAILSUBJECT** <br> **DESTINATIONEMAILTO** <br> | Fields outlining parameters used when Print destination settings are selected for Email. |  
|  **DESTINATIONFILEFORMAT** <br>  **DESTINATIONFILENAME**  | Fields outlining parameters used when Print destination settings are selected for File. |  
|  **DESTINATIONPRINTERCOLLATED** <br>  **DESTINATIONPRINTERFROMPAGE** <br> **DESTINATIONPRINTERNAME** <br> **DESTINATIONPRINTERNUMBEROFCOPIES** <br> **DESTINATIONPRINTERNUMBEROFCOPIES** <br>**DESTINATIONPRINTERORIENTATION** <br> **DESTINATIONPRINTERPRINTALLPAGES** <br>**DESTINATIONPRINTERPRINTBOTHSIDES** <br>**DESTINATIONPRINTERTOPAGE** <br> **SAVETOARCHIVE** <br>| Fields outlining parameters used when Print destination settings are selected for printer output | 
|  **ESSEMAILTEMPLATEID** <br>  **ESSFILENAME** <br> **ESSLOGISTICSLOCATIONROLENAME** <br>  | Fields outlining parameters For Smart Send. |  
|  **ISPRINTJOBSETTINGSCONFIGURED**  | Yes/no Field if form has Print destination settings. |  
|  **PRINTMEDIUMTYPE**  | Number of copies to be printed  |  
|  **QUERYPACKED**  | Contains string data related to specific conditional settings that have been created.  The Query from within the user interface that outlines the conditions for conditional outputs are stored as data String   |  
|  **REPORTFORMATNAME**  | Name of the stationary report being utilised   |  
|  **SUPPRESS**  | Is Printing for this document suspended   |  

### Reset print management.

With the ability to import Print management settings there may be the requirement to Reset print management settings back to default.  A Reset print management function has been provided positioned next to the print management button in all available modules.  To enable access to the reset function, users need to be given access to the **Maintain and reset settings for print management privilege** as part of their security role.


