---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Data entities

The following is a summary of data entities available for the Vendor EDI module:

## Vendor setup
EDI > Setup > Vendor setup

**Order**         | **Entity**                      | **Description**	                                         | **Dependency**
:-----            |:------------------------        |:-------------------                                      |:------------------------
1	                | Vendor EDI order type group     | Create new **Vendor EDI order type group**. EDI > Setup > Vendor setup > Order type group |
2	                | Vendor EDI order type lines     | Create new **Vendor EDI order type lines**. EDI > Setup > Vendor setup > Order type group | Vendor EDI order type group
3	                | Vendor EDI order purpose group  | Create new **Vendor EDI order purpose group**. EDI > Setup > Vendor setup > Order purpose group |
4	                | Vendor EDI order purpose lines  | Create new **Vendor EDI order purpose lines**. EDI > Setup > Vendor setup > Order purpose group | Vendor EDI order purpose group
5	                | Vendor EDI order line change type group | Create new **Vendor EDI order line change type group**. EDI > Setup > Vendor setup > Order line change type group  |
6	                | Vendor EDI order line change type lines | Create new **Vendor EDI order line change type lines**. EDI > Setup > Vendor setup > Order line change type group  | Vendor EDI order line change type group
7	                | Vendor EDI carrier mode group   | Create new **Vendor EDI carrier mode group**. EDI > Setup > Vendor setup > Carrier mode |
8	                | Vendor EDI carrier mode lines   | Create new **Vendor EDI carrier mode lines**. EDI > Setup > Vendor setup > Carrier mode | Vendor EDI carrier mode group
9	                | Vendor EDI charges code group   | Create new **Vendor EDI charges code group**. EDI > Setup > Vendor setup > Charges code |
10	              | Vendor EDI charges code lines   | Create new **Vendor EDI charges code lines**. EDI > Setup > Vendor setup > Charges code | Vendor EDI charges code group
11	              | Vendor EDI POA response code group  | Create new **Vendor EDI POA response code group**. EDI > Setup > Vendor setup > POA response code group |
12	              | Vendor EDI POA response code lines  | Create new **Vendor EDI POA response code lines**. EDI > Setup > Vendor setup > POA response code group | Vendor EDI POA response code group
13	              | Vendor EDI payment terms type group | Create new **Vendor EDI payment terms type group**. EDI > Setup > Vendor setup > Payment terms type group |
14	              | Vendor EDI payment terms type lines | Create new **Vendor EDI payment terms type lines**. EDI > Setup > Vendor setup > Payment terms type group | Vendor EDI payment terms type group
15	              | Vendor EDI misc. charge/allowance indicator group | Create new **Vendor EDI misc. charge/allowance indicator group**. EDI > Setup > Vendor setup > Misc charge/allowance indicator |
16	              | Vendor EDI misc. charge/allowance indicator lines | Create new **Vendor EDI misc. charge/allowance indicator lines**. EDI > Setup > Vendor setup > Misc charge/allowance indicator | Vendor EDI misc. charge/allowance indicator group
17	              | Vendor EDI misc method of handling group  | Create new **Vendor EDI misc method of handling group**. EDI > Setup > Vendor setup > Misc method of handling |
18	              | Vendor EDI misc method of handling lines  | Create new **Vendor EDI misc method of handling lines**. EDI > Setup > Vendor setup > Misc method of handling | Vendor EDI misc method of handling group

## Document setting profiles
EDI > Setup > Document types (Setting profiles for EDI vendor documents)

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1	    | EDI settings - Vendor documents purchase order                | Create new document type **Settings profile** for Vendor documents purchase order
2	    | EDI settings - Vendor documents purchase order changes        | Create new document type **Settings profile** for Vendor documents purchase order changes
3	    | EDI settings - Vendor documents purchase order acknowledgment | Create new document type **Settings profile** for Vendor documents purchase order acknowledgment
4	    | EDI settings - Vendor documents advanced shipping notice      | Create new document type **Settings profile** for Vendor documents advanced shipping notice
5	    | EDI settings - Vendor documents purchase invoice              | Create new document type **Settings profile** for Vendor documents purchase invoice


## Document types
EDI > Setup > Document types (Template, Validation, Outbound file names and EDI Field metadata)

See [Core data entities](../../CORE/OTHER/Data-entities#document-types)

## Trading partner
EDI > Setup > Trading partner

**Order**         | **Entity**						| **Description**                             | **Dependency**
:-----------------|:------------------------------------		|:------------------------- |:-------------------------
1                 | EDI Vendors                             | Create new Vendor trading partner   | [Vendor setup](#vendor-setup)
2                 | EDI Documents - Vendors                 | Add incoming and outgoing documents to Vendor trading partner | EDI Vendors, [Vendor setting profiles](#document-setting-profiles)  and [Document types](../../CORE/OTHER/Data-entities#document-types)
