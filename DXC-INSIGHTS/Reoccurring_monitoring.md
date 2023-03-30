# Reoccurring monitoring
### 1. Enable the Periodic monitoring  
Navigate to **System administrators > DXC Insights > DXC Insights parameters > Periodic monitoring** and enable the monitoring batch service. 
The Refresh frequency values refers to the range (min & max) in milliseconds between which the monitoring batch service will be run. 
The recommended values for these are 30,000ms and 300,000ms
![Periodic_monitoring](/DXC-INSIGHTS/IMAGES/Periodic_monitoring.png)

### 2.	Configure Periodic monitoring
Navigate to **System Administration > Setup > Configure monitoring** If this is the first time you have opened the form, it will be empty. Click the menu button labeled ‘Refresh list’. This will scan the AOT and build a list of monitoring rules and their parameters. When you build a new monitoring rule, make sure to refresh the list so that it will appear in the list. 

![Configure_Periodic_monitoring](/DXC-INSIGHTS/IMAGES/Configure_Periodic_monitoring.png)

By default, each rule is disabled. You can use the menu buttons at the top of the form to ‘Enable’ or ‘Disable’ the rule. Additionally, you can change how frequently this rule should run. 

### 3.Start the Monitoring Batch Job
The monitoring rules focus on polling the current system health. This is accomplished through a single batch job that executes the monitoring business rules. Navigate to **System administrators > DXC Insights > Periodic monitoring > Monitoring batch service**

Only one instance is required, and it does not need a recurrence. The batch job will manage itself and sleep until the next time it needs to run. Leave the ‘Batch processing’ option at ‘No’ click Okay to start the batch job. 

![Monitoring_batch](/DXC-INSIGHTS/IMAGES/Monitoring_batch.png)

Once running, the monitoring batch job will re-scan for changes in settings and business rules. You can disable the batch job from **System administrators > DXC Insights > DXC Insights parameters > Periodic monitoring** tab if needed. Refer to section [Enable the Periodic monitoring](https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/edit/PM_edits/DXC-INSIGHTS/Reoccurring_monitoring.md#1-enable-the-periodic-monitoring)
