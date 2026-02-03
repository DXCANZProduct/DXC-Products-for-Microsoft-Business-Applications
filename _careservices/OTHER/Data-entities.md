---
layout: product-content
header: Care Services
toc: true
---

# Data entities

The following is a summary of data entities available for the Care Services module:

**Entity**| **Description/comments**| **Dependency**| Comments
:------------------------|:-------------------|:------------------------|:------------------------
Care services accommodation payment interest rates|Header for accommodation payment interest rates|Header
Care services accommodation payment interest rate lines|Lines for accommodation payment interest rates|Aged care accommodation payment interest rates
Care services accommodation payment|Header for accommodation payment|Header
Care services accommodation payment lines|Lines for accommodation payment lines|Care services accommodation payment
Care services accommodation payment lines import|Import accommodation payment lines for the customer under the accommodation payment for the customer|NIL
Care services accommodation payment type|Import accommodation payment type|NIL
Care services billing account types|Import billing account name|NIL
Care services billing codes|Header for billing code|Header
Care services billing rates|Lines for billing rate |Care services billing codes
Care services billing rates import|Lines for billing rate |Care services billing codes
Care services billing invoicee|Import billing invoicee for customer data|NIL
Care services billing schedule lines|Header for billing schedule|NIL
Care services billing rates|Lines for billing rates|Care services billing schedule lines
Care services billing transactions|Import Customer billing transactions Care services > Billing> Billing transactions|NIL
Care services capping limits|Header for capping limits Care services>Setup>Capping limits|NIL
Care services capping limit lines|Lines for capping limits header|Care services capping limits
Care services care types|Header for care types Care services >Setup> Care types|NIL
Care services client capping|Header for client capping Care services>Customers> Capping limit setup|NIL
Care services client capping lines|Lines for client capping (For export only)|NIL
Care services reference number type|Header for client reference number type|NIL
Care services client reference number|Header for client reference number Care services>Customers>Client reference number|Care services reference number type
Care services contact type|Header for contact type Care service>Setup>Customer>Contact type|Header for contact type
Care services contacts|For export purposes only|NIL
Care services customers|Export customer pre-set direct debit information, for export purposes only, Do not use for import|NIL
Care services customer transactions|Export customer transaction, for export purposes only, Do not use for import|NIL
Care services customer transactions V2|Export customer transaction, for export purposes only, Do not use for import.|NIL
Care services departure codes|Departure codes Care service> Setup> Services Australia> Departure codes.|NIL
Care services departure reasons|Departure reasons Care services>Setup>Service>Departure reasons|NIL
Care services daily concessional support ratio|For export purposes only. Care services> Inquiries and reports> Service concessional/supported daily ratio |NIL
Care services ingoing contribution templates|Header for Care services>Setup>Accommodation>Ingoing contribution templates|NIL
Care services DMF/CRF Applicable rate template lines|Lines for Care services>Setup>Accommodation>Ingoing contribution templates|Care services ingoing contribution templates
Care services DMF/CRF applicable rates|For export purposes only. Customer DMF/CRF rates created via the system.|NIL
Care services event types|Header for Care services event types Care services>Setup>Service Australia Integration> Event types|NIL
Care services events|Lines for Care services events Care services>Setup>Service Australia Integration> Events|Care services event types
Care services event messages|For export purposes only Care services>Setup>Service Australia Integration> Events|Care services events
Care services external funding codes|Header for Care services external funding codes Care services> Setup>Funding>External funding code|NIL
Care services funding codes|Header for funding codes Care services>Setup>Funding>Funding code|Care services external funding codes
Care services funding schedule lines|Header for funding schedule|Care services funding codes
Care services funding rates|Lines for funding schedule rates|Care services funding schedule lines
Care services funding claims|Header for funding claims|NIL
Care services funding claim form|Lines for funding claims |Care services funding claims
Care services funding claim form lines|Lines for funding claims form marked when file exported|Care services funding claim form
Care services funding claim reporting values|Lines for funding claim form reporting value|Care services funding claim form
Care services funding journal headers|Header for funding journal|NIL
Care services funding journal lines|Lines for funding journal|Care services funding journal headers
Care services funding payment statements|Header for funding statement|NIL
Care services funding claim payment statement lines|Lines for funding statement|Care services funding payment statements
Funding reconciliation|For export only|NIL
Funding claim reconciliation lines|For export only|Funding reconciliation
Care services funding reconciliation worksheet|For export only|Funding reconciliation
Care services funding reconciliation accepted funding claims|For export only|Funding reconciliation
Care services funding reconciliation accepted statement lines|For export only|Funding reconciliation
Care services funding reconciliation matched transactions|For export only|Funding reconciliation
Care services funding reconciliation journal headers|Header for funding reconciliation journal - Export only|Funding reconciliation
Care services funding reconciliation journal lines|Lines for funding reconciliation journal - Export only|Care services funding reconciliation journal headers
Care services funding streams|Header for funding stream. - Export only|NIL
Care services funding stream reporting field setup|Lines for funding streams|Care services funding streams
Care services home based care categories|Header for home-based care categories|NIL
Care services home based care set|Header for home-based care  set|NIL
Care services home care package summary|For Export purposes only|NIL
Care services leave types|Header for leave types|NIL
Care services occupancy history|Header for occupancy history - For Export only.|NIL
Care services parameters|Header for Care service parameter|NIL
Care services place types|Header for place types|NIL
Care services place type features|Lines for place types|Care services place types
Care services places|Header for places|NIL
Care services place features|Lines for places|Care services places
Care services place prices|Lines for places|Care services places
Care services place valuations|Lines for places|Care services places
Care services place features|Lines for place|Care services places
Care services|Header for care service Care services> Setup>Service>All services|NIL
Care services service care types|Lines for care services|Care services services
Care services service types|Header for service type Care services >Setup> Service>Service types|NIL
Care services service groups|Header for service group Care services>Setup>Service>Service groups|NIL
Care services service group billing codes|Lines for service group|Care services service groups
Care services service group funding codes|Lines for service group|Care services service groups
Care services service group service codes|Lines for service group|Care services service groups
Care services schedule creation templates|Header for Care services schedule creation templates Care services >Setup>Schedule creation template|
Care services schedule creation billing codes|Lines for Care services schedule creation templates|Care services schedule creation templates
Care services schedule creation funding codes|Lines for Care services schedule creation templates|Care services schedule creation templates
Care services subsidy type|Header for subsidy type Care services>Setup>Subsidy type|NIL
Care services subsidy rates|Lines for subsidy type|Care services subsidy type
Care services subsidy rate dates|Lines for subsidy type|Care services subsidy type
Care services subsidy schedule lines|Lines for subsidy type|Care services subsidy type
Care services service entries|Header for service entry For export purposes only|
Care services invoice|Header for Care services invoice|NIL
Care services invoice line|Lines for Care service invoice|Care services invoice
Care services billing journal headers|Header for billing journal|NIL
Care services billing journal lines|Journal lines for billing journal|Care services billing journal headers
Care services billing journal lines V2 |replaces Care services billing journal lines|Care services billing journal headers| see note below for additional logic control
Care services receipt journal headers|Header for receipt journal header|Care services billing journal headers
Care services receipt journal lines|Lines for receipt journal|Care services receipt journal headers

The following entities are available for the Care Services module as "open in Excel" functionality and are designed to be used with the Excel Add-in.  The entities below are not compatible with the DMF (import/export functionality) 

**Entity**| **Navigation**| **Comments/Available fields**|
:------------------------|:-------------------|:------------------------
Care Services Funding Journal Entry| Care Services>Journals>Funding journal| New entity for Funding journal<br/> Available Fields. <br> Refer to test [Document Template]({{ 'careservices/OTHER/Document_template#care-services-funding-journal-entry' | relative_url }})
Care Services Billing Journal Line Entry V2| Care Services>Journals>Billing journal | Replaces Care Services Billing Journal Line Entry<br/> Available Fields
Care Services Receipt Journal  Line Entry V2| Care Services>Journals>Receipt Journal| Replaces Care Services Receipt Journal Line Entry<br/> Available Fields


Billing Journal Lines V2 Data entity contains additional default logic that facilitates updates to the environment.  This is outlined below 

**Field Name**|  **Data Source**|  **Path**|  **Logic engages under condition**|
:------------------------|:-------------------|:------------------------|:-------------------
Text (Description) |Billing codes description|Care services > Setup > Billing > Billing codes|default value after leave value in Excel blank
Offset text|Billing codes description|Care services > Setup > Billing > Billing codes|default value after leave value in Excel blank
Tax group|Billing codes Tax group|Care services > Setup > Billing > Billing codes|default value after leave value in Excel blank
Tax item group|Billing codes Tax item group|Care services > Setup > Billing > Billing codes|default value after leave value in Excel blank|
Offset dimension|Service code financial dimensions|Care services > Setup > Services > All services|default value by deleting entire column|
Default dimension|Service code default dimensions|Care services > Setup > Services > All services|default value by deleting entire column|
Home based care set id|Billing codes Home based care set|Care services > Setup > Billing > Billing codes|default value after leave value in Excel blank|
Home based care category id|Billing codes Home based care category|Care services > Setup > Billing > Billing codes|Currently Not Used in DMF|
Unit|Billing codes unit|Care services > Setup > Billing > Billing codes|Currently Not Used in DMF|
Recurrence pattern|Billing codes recurrence pattern|Care services > Setup > Billing > Billing codes|default value by deleting entire column|
Billing account name|Journal Name|General Ledger > Setup > Journal setup > Journal names|default value after leave value in Excel blank|
Payment terms|Customer record|Care services > Customers > All customers >Customer record > Payment defaults||
Method of Payment|Customer record|Care services > Customers > All customers >Customer record > Payment defaults||


