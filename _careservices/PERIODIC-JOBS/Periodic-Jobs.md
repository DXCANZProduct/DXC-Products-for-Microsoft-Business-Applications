---
layout: product-content
header: Care Services
toc: true
---

# Periodic Jobs

Periodic jobs can be setup to run at a regular interval to update information such as client capping details.

**Navigate to: Care services> Periodic**

### Client capping calculation


This function updates the Client capping records accessible from the customer account (Customer > Action pane> Setup > Capping limit setup) to reflect changes in the annual and lifetime capping limit thresholds, along with all transactions that count towards reaching the threshold that have occurred since the last calculation date.

1.  Navigate to Care services > Periodic > Client capping calculation
2.  Populate the calculation date, all transactions up to and including this date will be considered against the threshold for each capping limit
3.  To run for selected clients only, filter the records using the customer account table.
4.  To setup the job to run in the background at a regular interval, set the <Use current date> to yes. This will allow the job to run every day.
5.  Select batch processing to Yes
6.  Click on Recurrence
7.  Populate the dates and recurrence patterns
8.  Click **\<OK\>** to close the form.
9.  Click **\<OK\>** to add the job to the batch queue to be processed at the set interval.

### Accommodation payment calculation

This function updates the Accommodation payment details also accessible from the customer account (All Customers > Invoice > Accommodation Payment) to reflect changes in the balances following billing and receipting

1.  Navigate to Care services > Periodic > Accommodation payment calculation
2.  Populate the calculation date, all transactions up to and including this date will be considered
3.  Select ‘Include discharged’ to yes to include clients who have departed
4.  To run for selected clients only, filter the records using the customer account table.
5.  To setup the job to run in the background at a regular interval, set the <Use current date> to yes. This will allow the job to run every day.
6.  Select batch processing to Yes
7.  Click on Recurrence
8.  Populate the dates and recurrence patterns
9.  Click **\<OK\>** to close the form.
10. Click **\<OK\>** to add the job to the batch queue to be processed at the set interval.

### Concessional/Supported ratio calculation

This function calculates the Concessional/Supported ratios for all services (facilities). The result of the calculations is displayed in Inquiries and reports > Service concessional/Supported daily ratio.

The job should be run before generating funding claims to ensure the accommodation supplements are reduced when the ratio is below the threshold

1.  Navigate to Care services > Periodic > Concessional/Supported ratio calculation
2.  Populate the calculation date, select the first day of the month to calculate ratios for the calendar month
3.  To run for selected services only, filter the records using the service code table.
4.  To setup the job to run in the background at a regular interval, Select batch processing to Yes
5.  Click on Recurrence
6.  Populate the dates and recurrence patterns
7.  Click **\<OK\>** to close the form.
8.  Click **\<OK\>** to add the job to the batch queue to be processed at the set interval.

**![Service concessional](../IMAGES/Service concessional.png)**

*Service concessional/supported ratio*

### Service listing calculation

This function calculates the service listing information such as current clients, available places (beds), accommodation payment statistics for all services (facilities). The result of the calculations is displayed in All Services > Service listing

1.  Navigate to Care services > Periodic > Service listing calculation
2.  Populate the calculation date
3.  To run for selected services only, filter the records using the service code table.
4.  To setup the job to run in the background at a regular interval, Select batch processing to Yes
5.  Click on Recurrence
6.  Populate the dates and recurrence patterns
7.  Click **\<OK\>** to close the form.
8.  Click **\<OK\>** to add the job to the batch queue to be processed at the set interval.


### Lumpsum journal type update for the posted customer transactions

This function updates the flag on customer transactions

1.  Navigate to Care services > Periodic > Lumpsum journal type update for the posted customer transactions

### Limit reached flag reset

This function removes the limit reached flag to reset the calculations for the lifetime capping

1.  Navigate to Care services > Periodic > Limit reached flag reset
2.  Select the relevant client account (or leave blank to reset all)
3.  Select the lifetime capping limit to reset
4.  To setup the job to run in the background at a regular interval, Select batch processing to Yes
5.  Click on Recurrence
6.  Populate the dates and recurrence patterns
7.  Click **\<OK\>** to close the form.
8.  Click **\<OK\>** to add the job to the batch queue to be processed at the set interval.

### Funding schedule lines update

1.  Navigate to Care services > Periodic > Funding schedule lines update
2.  Select the relevant service code
3.  To setup the job to run in the background at a regular interval, Select batch processing to Yes
4.  Click on Recurrence
5.  Populate the dates and recurrence patterns
6.  Click **\<OK\>** to close the form.
7.  Click **\<OK\>** to add the job to the batch queue to be processed at the set interval.
