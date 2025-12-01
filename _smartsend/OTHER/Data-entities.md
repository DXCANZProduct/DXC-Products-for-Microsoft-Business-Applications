---
layout: product-content
header: Smart Business Form Email Manager (SmartSend)
toc: true
---

# Data entities

The following is a summary of data entities available for the Smart Send module:
## Email setup


**Order**| **Entity**                      | **Description**	                                                                                        | **Dependency**
:-----   |:------------------------        |:-------------------                                                                                      |:------------------------
1	| Address and contact information purpose  | Create new **Contaact Purpose/s**. Organization administration > Global address book > Address and contact information purpose| Customer/Vendor contacts
2	| Organization email template  | Create new **Organization email template/s**. Organisation administration > Setup > Organisation email templates
3	| Organization email template message  | Assign new **Email message content** to a specified email template. Organisation administration > Setup > Organisation email templates| Organization email template 
4	| SmartSend setup  | Create/Load  new **Smart Send Report/s** . System administration > Setup > Email > Email parameters | Organisational email templates, Report Format,  contact information purposes 


**Note: The fields XSLTTRANSFORM and EMAILTEMPLATESTRING in the template *Organization email template message*  have character limitations that can lead to email body content being truncated.  It is recommended that dynamic templates used with Smart Send are stored as html files and then loaded individually not using the standard DMF entity 

