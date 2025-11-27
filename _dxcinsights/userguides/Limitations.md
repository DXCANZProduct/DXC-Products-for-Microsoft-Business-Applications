---
layout: product-content
header: Insights for D365 FO
toc: true
---

# Product limitations

The following limitations apply to monitoring and telemtry logging with Insights for D365FO

### 1. Batch jobs / batch tasks

1. Batch jobs developed on the RunBaseBatch framework (by extending the run method) and run in User session mode synchronously will not be monitored / logged to Azure app insights.
2. Batch jobs will not be monitored / logged to Azure app insights during the time in between the enablement of Batch job monitoring on the Insights for D365 parameters form and the next scheduled run of the '[Insights for D365 monitoring automation](./setup.md#4-insights-for-d365-monitoring-automation)' task. To compensate for this time window, the repeat interval of the 'Insights for D365 monitoring automation' can be reduced

### 2. OData Monitoring

1. The monitoring of OData calls with Insights for D365 FO is reliant on the attachment of event handlers on the AOS instances. However, these handlers detach during application downtime (maintenance, upgrades) and are re-attached by loading any form after application restart. OData calls won't be monitored between application downtime and the first form load after restart.

### 3. Data management framework import/export info and warning events

1. The monitoring of Data management framework import/export events with Insights for D365 FO is reliant on the attachment of event handlers on the AOS instances. Data management framework import/export info and warning events will not be monitored / logged to Azure app insights during the time in between the enablement of Data management - info and Data management - warnings monitoring on the Insights for D365 parameters form and the next scheduled run of the '[Insights for D365 monitoring automation](./setup.md#4-insights-for-d365-monitoring-automation)' task. To compensate for this time window, the repeat interval of the 'Insights for D365 monitoring automation' can be reduced.
