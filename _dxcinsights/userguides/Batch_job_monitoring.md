---
layout: product-content
header: Insights for D365 FO
toc: true
---

# Batch job monitoring setup

Enable Batch job monitoring on the Insights for D365 parameters form.

# Monitoring process automation task

Ensure that the 'Insights for D365 monitoring automation' task is added to the process automation tasks schedule. Refer to [Insights for D365 monitoring automation](./setup.md#4-insights-for-d365-monitoring-automation)

# Inconsistent Batch job completion Monitoring

Inconsistent Batch job completion monitoring with Insights for D365 FO allows users to monitor batch job execution completion times and detect if batch jobs are completing earlier than expected or if they are finishing later than anticipated (which might suggest performance issues or delays).

### 1. Enable batch job monitoring with Insights for D365 FO

To setup monitoring, navigate to **System administration > Inquiries > Batch jobs** and open the enhanced batch job details view in edit mode. Users will need to :

1. Enable monitoring with Insights for D365 FO under 'Inconsistent Batch job completion' group
2. Enter the estimated minimum number of minutes that the batch job is expected to take to complete execution in the 'Minimum completion time' field.
3. Enter the estimated maximum number of minutes that the batch job is expected to take to complete execution in the 'Maximum completion time' field.
4. Click **Save**

![BatchJobMonitoring_LineLevel](IMAGES/BatchJobMonitoring_LineLevel.png)

Telemetry will be logged with Insights for D365 FO at the start and end of each batch job execution. A summary of batch jobs that finish behind schedule or too early is available on Azure Application Insights with the Insights for D365 FO Dashboard provided by DXC. You can also set up Alerts on Azure Application Insights to send a notification to a chosen destination, such as an email, SMS message, web hook, or it can even execute an action with Azure Logic App. Refer to [Setup alerts on continuous monitoring business rules](./Azure-application-insights/Azure_alerts.md#1-setup-alerts-on-continuous-monitoring-business-rules) to setup alerts for critical batch jobs that are completing earlier than expected or if they are finishing later than anticipated.

N.B
Refer to [Batch job limitations](./Limitations.md#1-batch-jobs--batch-tasks) to understand current limitations on batch job monitoring
