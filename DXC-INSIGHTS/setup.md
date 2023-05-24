# Setting up DXC Insights (with Azure Application Insights)

###	1. Azure Application Insights instance
Start by creating a new Application Insights instance in Azure. See [MS doc](https://docs.microsoft.com/en-us/azure/azure-monitor/app/create-new-resource)

Copy the Instrumentation Key. This will be used to link the DXC Insights logger to your Azure Application Insights instance.
![Instrument Key](IMAGES/Instrument_key.png)

### 2.	Feature Activation <br>
Find and activate the feature ‘DXC Insights’

![Feature_Management](IMAGES/Feature_Management.png)
 
### 3.	DXC Insights Parameters
Navigate to System administrators > DXC Insights > DXC Insights parameters. 
![Parameters](IMAGES/Parameters.png)

On the ‘Settings’ tab, update and save the types of telemetry that DXC Insights will send to Azure Application Insights or your specified telemetry logger. 

![Telemetry_settings](IMAGES/Telemetry_settings.png)

### 4.	Configure the Azure Application Insights telemetry
On the 'Azure application insights parameters’ tab, create a new record and paste the key you copied earlier from the [Azure Application Insights instance](setup.md#1-Azure-Application-Insights-instance) step into the ‘Instrumentation key’ field. Enter a description for the instance and enable the ‘Log telemetry’ field to allow telemetry to be logged to the Azure Application Insights instance. More than one Application insights instance can be added and enabled.

![Azure_Application_insights_screen](IMAGES/Azure_Application_insights_screen.png)

### 5.	Enable the Periodic monitoring  
Navigate to System administrators > DXC Insights > DXC Insights parameters > Periodic monitoring and enable the monitoring batch service. 

The Refresh frequency values refer to the range (min & max) in milliseconds between which the monitoring batch service will be run. The recommended values for these are 30,000ms and 300,000ms

![Periodic_monitoring](IMAGES/Periodic_monitoring.png)
