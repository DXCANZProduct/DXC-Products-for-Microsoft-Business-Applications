# Monitoring Captured Data 

The data sent by DXC Insights can be viewed, queried and have monitoring rules applied to it in Azure application insights. The easiest way to get started consuming 
[Application insights](https://learn.microsoft.com/en-us/azure/azure-monitor/app/app-insights-overview?tabs=net#how-do-i-use-application-insights) is through the 
Azure portal and the built-in visual experiences. Advanced users can [query the underlying data](https://learn.microsoft.com/en-us/azure/azure-monitor/logs/log-query-overview)
directly to [build custom visualizations](https://learn.microsoft.com/en-us/azure/azure-monitor/app/tutorial-app-dashboards) through Azure Monitor Dashboards and 
Workbooks.

### 1. Overview
The overview page makes use of the data from DXC Insights to give a quick overview of the load on the environment.

![Overview](/DXC-INSIGHTS/IMAGES/Overview.png)

### 2. Performance
You get an overview of the most exhaustive menu items/forms to open and run, and jump into analytics with [Performance view](https://learn.microsoft.com/en-us/azure/azure-monitor/app/tutorial-performance) 
– get deep insights into how your Application or API and downstream dependencies are performing and find for a representative sample to [explore end to end](https://learn.microsoft.com/en-us/azure/azure-monitor/app/transaction-diagnostics). 

![Performance](/DXC-INSIGHTS/IMAGES/Performance.png)

### 3.	Failures
Get an overview of the exceptions that are thrown due to errors on the [Failure view](https://learn.microsoft.com/en-us/azure/azure-monitor/app/tutorial-runtime-exceptions) – understand which components or actions are generating failures and triage errors and exceptions. 
The built-in views are helpful to track application health proactively and for reactive root-cause-analysis.

![failures](/DXC-INSIGHTS/IMAGES/Failures.png)

#### Dual-write exceptions
With the “Dual-write” telemetry logging enabled [Section 2.4](https://github.com/DXCANZProduct/DXC-Products-for-Microsoft-Business-Applications/blob/PM_edits/DXC-INSIGHTS/setup.md#4azure-application-insights-telemetry-configuration), you can add an additional filter on the ‘Failures’ view to search for exceptions that get triggered during dual-write sync. 
On the ‘Failures’ view add a new filter pill, select ‘Exception Type’ as the property, and select ‘Dual-write’ as the value. Click ‘Refresh’ and a list of dual-write exceptions will get listed.

![Dual_Write](/DXC-INSIGHTS/IMAGES/Dual_Write.png)

### 4.	Transaction Search
You can make a transaction search on the events in system based on data received from DXC Insights.

![Tranasaction.png](/DXC-INSIGHTS/IMAGES/Tranasaction.png)

### 5.	Metrics
You can monitor performance and health metrics of SQL Database
  Read more about [Application Insights](https://learn.microsoft.com/en-us/azure/azure-monitor/app/app-insights-overview?tabs=net) and what it can do

![Metrics.png](/DXC-INSIGHTS/IMAGES/Metrics.png)
