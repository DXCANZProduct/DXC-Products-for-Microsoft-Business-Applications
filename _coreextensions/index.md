---
layout: product-content
header: Core Extensions
toc: true
---

## Release notes

The release notes describes the features that are either new or changed.

## Solution Overview
DXC Core Extensions for Microsoft Dynamics 365 is a set of productivity utilities providing functionality to complement the standard Microsoft solution. Core Extensions includes the following components:

### [Company Colors](./COMPANY-COLORS/Company-Colors)
Company colors allow a user to select a preferred color theme for a company. Standard D365 allows you to only define a color theme per user. This feature, however, extends that capability to allow you to define a theme at company level. This will enable the user to differentiate each company by the color selected.

### [Exchange Rate Import](EXCHANGE-RATE-IMPORT/Exchange-rate-import)
Microsoft Dynamics 365 offers functionality to import exchange rates based on limited sources. The Exchange Rate Import leverages the same standard framework of Microsoft Dynamics 365 but extends functionality to support the following additional sources; Reserve Bank of Australia, Bank of Canada, Open Exchange Rates.

### [Display reciprocal exchange rate](RECIPROCAL/Company-Reciprocal)
Display reciprocal exchange rate allows companies to view the exchanges rates in reciprocal format.
For example instead of 0.69, displays result of 1/0.69.
This applies to all users and all exchange rates for the selected company

### [User Security Audit Detail Report](USER-SECURITY-AUDIT-DETAIL-REPORT/User-Security-audit-detail-report)
The report “User security audit details report” included in the Core Extensions product gives an overview of the security setup for a user. The information shown on the report is down to the privilege level details.

### [General and Inventory Journal Import](JOURNAL-IMPORTS/General-and-inventory-journal-import)
The Import Journal functionality provides a user-friendly method to import general journal and inventory journal transaction data from Excel or CSV files. All the standard validation and defaulting will occur. Both General Journals and Inventory Journals are supported. The imports are based on Data Entities and allows configuration of new templates to be imported.

### [Business Process Links](BUSINESS-PROCESS-LINKS/Business-process-links)
The business process links feature allows you to setup associated links to forms when the user clicks on the Dynamics 365 Help icon. The associated links will display under the Process Links tab. This was designed for Mavim and SharePoint but will work for any external links.

### [Import Budgets](IMPORT-BUDGETS/Import-budgets)
The Import Budgets extension allows importing budget from Microsoft Excel templates where period budgets are presented in a traditional columnar format including dynamically adding financial dimensions and financial period across columns.

### [DMF Toolbox](DMF-TOOLBOX)
The DMF toolbox provides users with the visibility of 2 additional fields within Data Management Entities.

Enum values - a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. For example, in the Customers data entity the field Time Zone has a pre-defined list of values that can be selected. 

Unique indexes -   A unique index guarantees that the index key contains no duplicate values and therefore every row in the table is in some way unique. For Example, the customer account number must be unique in the Customers entity.

### [Data Anonymization](Data-Anonymization/Anonymization)
Data Anonymization is a process that allows for information to be scrambled post a database copy or restore from a production into a sandbox environment.  The process can assist in protecting sensitive or personal information like names, bank accounts, addresses and more from people that should or do not require visibility of sensitive data. The process can be used to protect data and confidentiality but still allow necessary third parties access to your environment. 

### [Import/Export Print management settings ](Print-management)


## New ideas
Have a suggestion for new product or new feature for existing product? [Suggest a New idea](https://forms.office.com/r/U9twpSt3in)
