# Setting up DXC Insights 
##	1. Azure Application Insights instance
Start by creating a new Application Insights instance in Azure. See [MS doc](https://docs.microsoft.com/en-us/azure/azure-monitor/app/create-new-resource) for 

Copy the Instrumentation Key. This will be used to link the DXC Insights logger to your Azure Application Insights instance.

![Instrument Key](/DXC-INSIGHTS/IMAGES/Instrument_key.png)
2.	Feature Activation
Find and activate the feature ‘DXC Insights’

 
3.	DXC Insights Parameters
Navigate to System administrators > DXC Insights > DXC Insights parameters. 

Enable the integration on the ‘Settings’ tab and add your insights instances instrumentation keys that you want to send the telemetry to. Sending telemetry to Application Insights can be enabled and disabled.


4.	Azure Application Insights telemetry configuration
Setup the Azure Application Insights telemetry configuration on the ‘Azure application insights parameters’ tab. Add a new record for an Azure Application Insights instance and enter the ‘Instrumentation key’ you copied earlier from the Azure Application Insights instance creation step here.
Add a description for the instance, and select the types of telemetry that you want to be logged with DXC Insights onto the Azure Application Insights instance. More than one Application insights instance can be enabled and the types of data to be sent can be selected.

