---
layout: product-content
header: Care Services
toc: true
---


## Billing journal generation automation

# Navigation : Care Services > Setup > Billing journal generation automation

### FIELD |OPTIONS |	 EXPLINATION 	|
|  **Field**  | **Values** | **Description**
|:---|:---|:---| 
|**Journal name**|Journal names <br>  General ledger > Setup > Journal names (only those with Care services billing journal as the journal type are available for use)|Select the journal name to be used for the billing journal batch. Must be a billing journal type|
|**Journal header description**|Text to be used in the journal header description field. Enter the text to be used when the journal batch header is created.  The journal end date will be added to this text each month|Enter the text to be used when the journal batch header is created.  The journal end date will be added to this text each month|
|**Proposal type**|Values: <br> <br> •	Billing journal proposal <br> <br> •	Billing journal adjustment proposal <br> Care services > Journals > Billing journal > Billing proposal options|Select Billing journal proposal for a new billing period or Select Billing journal adjustment proposal for backdated adjustments|
|**Recurrence type**|Values: <br> •	Weekly<br> •	Fortnightly<br> •	Monthly<br> •	Quarterly|Select the frequency the billing should be run|
|**Monthly run day**|Weekly and Fortnightly Values<br> •	Leave blank and disable
Monthly & Quarterly Values: 
<br> •	Numbers 1 to 31
<br> •	If the monthly run day is greater than the current month, then use the lower of

Ie. If the month has only 28 days but the value is 31, ensure 28 is used, not 31. |Select the day of the month to be used as the run day for each batch or ‘31’ if the billing should be run on the last day of the month|
|**Scheduled posting day**|Weekly and Fortnightly Values
<br> •	Leave blank and disable
Monthly & Quarterly Values: 
<br> •	Numbers 1 to 31
<br> •	If the monthly run day is greater than the current month then use the lower of|Select the day of the month to be used as the posting day for each batch or ‘31’ if the posting date should be the last day of the month or Journal end date if the last day of the billing should be used as the posting date|
|**Scheduled end day**|Weekly and Fortnightly Values
<br> •	Leave blank and disable
Monthly & Quarterly Values: 
<br> •	Numbers 1 to 31
<br> •	If the monthly run day is greater than the current month then use the lower of

Ie. If month has only 28 days but value is 31, ensure 28 is used not 31|System will set for Weekly & Fortnightly recurrences. For Monthly, select the day of the month to be used as the last day for each monthly billing run or ‘Last day’ if the end date should be the last day of the month|
|**Next run date**|Calculated date:
<br> •	Weekly formula: Last end date plus 7 days
<br> •	Fortnightly formula: Last end date plus 14 days
<br> •	Monthly Formula: Set the month and year as  Last end date plus 1 month and set the day from the Monthly run day
<br> •	Quarterly formula: Set the month and year as  Last end date plus 3 months and set the day from the Monthly run day
<br> •	Recalculate if Last end date is updated|Calculated field based on the last end date and the recurrence type|
|**Journal posting date**|Calculated date:
<br> •	Weekly formula: Last end date plus 7 days
<br> •	Fortnightly formula: Last end date plus 14 days
<br> •	Monthly Formula: Set the month and year as  Last end date plus 1 month and set the day from the Monthly run day
<br> •	Quarterly formula: Set the month and year as  Last end date plus 3 months and set the day from the Monthly run day
<br> •	Recalculate if Last end date is updated
<br> •	Calculate AFTER Journal end date is calculated|Calculated field based on the Scheduled posting day and the journal end date|
|**Journal end date**|Calculated date:
<br> •	Weekly formula: Last end date plus 7 days
<br> •	Fortnightly formula: Last end date plus 14 days
<br> •	Monthly Formula: Last end date plus 1 month
<br> •	Quarterly Formula: Last end date plus 3 months
<br> •	Recalculate if Last end date is updated|Calculated field based on the last end date and the recurrence type|
|**Last end date**|Date will be updated from the End date used for the batch when each batch is generated|Use this field to set or reset the Next run date and Journal end date|
|**Filter – Customer Group**|Drop down of Customer Groups
Accounts receivable > Setup > Customers > Customer Groups|If the batch is to be run for a specific customer group only, then select a customer group from this list|
|**Filter – Customer Classification Group**|Drop down of Customer Classification Groups
Sales and marketing > Setup > Customers > Customer classification groups|If the batch is to be run for a specific customer classification group only, then select a customer classification group from this list|
|**Filter – Service code**|Drop down of Service codes
Care services > Setup > Services > All services|If the batch is to be run for a specific service code or a group of service codes, then select the service code(s) from this list |
|**Filter – Customer status**|Active 
Inactive

Allow for Excluding either value by prefixing with an exclamation mark|If the batch is to include or exclude specific customer status, then enter the status.  Prefix with an exclamation mark to exclude a status|
|**Email template**|Drop down of Email templates
System administration > Setup > Email > System email templates|Ensure a System email template has been created for this task and select that template|
|**Email 1**||Enter an email address to receive a notification when the batch job has completed|
|**Email 2**||Enter an email address to receive a notification when the batch job has completed|
