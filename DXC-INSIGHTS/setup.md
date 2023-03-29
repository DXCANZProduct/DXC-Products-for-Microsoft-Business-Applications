# Setting up DXC Insights 
##	1. Azure Application Insights instance
Start by creating a new Application Insights instance in Azure See [MS doc](https://docs.microsoft.com/en-us/azure/azure-monitor/app/create-new-resource)

Copy the Instrumentation Key. This will be used to link the DXC Insights logger to your Azure Application Insights instance.


2.2.	Feature Activation
Find and activate the feature ‘DXC Insights’

 
2.3.	DXC Insights Parameters
Navigate to System administrators > DXC Insights > DXC Insights parameters. 

Enable the integration on the ‘Settings’ tab and add your insights instances instrumentation keys that you want to send the telemetry to. Sending telemetry to Application Insights can be enabled and disabled.


2.4.	Azure Application Insights telemetry configuration
Setup the Azure Application Insights telemetry configuration on the ‘Azure application insights parameters’ tab. Add a new record for an Azure Application Insights instance and enter the ‘Instrumentation key’ you copied earlier from the Azure Application Insights instance creation step here.
Add a description for the instance, and select the types of telemetry that you want to be logged with DXC Insights onto the Azure Application Insights instance. More than one Application insights instance can be enabled and the types of data to be sent can be selected.

2.5.	Reoccurring monitoring
2.5.1.	Enable the Periodic monitoring  
Navigate to System administrators > DXC Insights > DXC Insights parameters > Periodic monitoring and enable the monitoring batch service. 
The Refresh frequency values refers to the range (min & max) in milliseconds between which the monitoring batch service will be run. The recommended values for these are 30,000ms and 300,000ms

2.5.2.	Configure Periodic monitoring
Navigate to System Administration > Setup > Configure monitoring. If this is the first time you have opened the form, it will be empty. Click the menu button labeled ‘Refresh list’. This will scan the AOT and build a list of monitoring rules and their parameters. When you build a new monitoring rule, make sure to refresh the list so that it will appear in the list. 




By default, each rule is disabled. You can use the menu buttons at the top of the form to ‘Enable’ or ‘Disable’ the rule. Additionally, you can change how frequently this rule should run. 

2.5.3.	Start the Monitoring Batch Job
The monitoring rules focus on polling the current system health. This is accomplished through a single batch job that executes the monitoring business rules. Navigate to System administrators > DXC Insights > Periodic monitoring > Monitoring batch service.

Only one instance is required, and it does not need a recurrence. The batch job will manage itself and sleep until the next time it needs to run. Leave the ‘Batch processing’ option at ‘No’ click Okay to start the batch job. 




Once running, the monitoring batch job will re-scan for changes in settings and business rules. You can disable the batch job from System administrators > DXC Insights > DXC Insights parameters > Periodic monitoring tab if needed. Refer to section Enable the Periodic monitoring.
 

