---
layout: product-content
header: DXC Agent for Finance in D365 FSCM
toc: true
---

## Reporting

Reporting is available for DXC Agent for Bank reconciliation in D365 FSCM. <br> 
Applicable reporting is also discussed under each agent, this page is a summary of all the available reporting fields for all the Finance agents.

### All agents

Navigate to **Organization administration > Agents for finance & supply chain management > All agents**

#### Dashboard

Power users can view telemetry by month for applicable agents.

Field	                                            | Match agent | Voucher agent | Customer agent  | Vendor agent	  	
:--                                               |:--:	    |:--:           |:--:             |:--:
Statement count                                   | X           | X             | X               | X 
Document count                                    | X           | 
Matched statement count                           | X           | 
Matched document count                            | X           |
Number of matches                                 | X           | X             | X               | X
Generated voucher count                           |             | X
Generated customer payment journal count          |             |               | X               |    
Generated settled customer payment journal count  |             |               | X               |    
Generated vendor payment journal count            |             |               |                 | X  
Number of runs                                    | X           | X             | X               | X 

      
### Bank reconciliation

Navigate to **Cash and bank management > Bank statement reconciliation > Bank reconciliation**

Displays agent results for each reconciliation's Matched transactions.

Field	                                            | Match agent | Voucher agent | Customer agent  | Vendor agent	  	
:--                                               |:--:	        |:--:           |:--:             |:--:
Bank statements matched by agent                  | X           | X             | X               | X
Percentage of bank statements matched by agent    | X           | X             | X               | X
Vouchers created by agent                         |             | X             |                 |  
Customer payments created by agent                |             |               | X               |  
Vendor payments created by agent                  |             |               |                 | X
