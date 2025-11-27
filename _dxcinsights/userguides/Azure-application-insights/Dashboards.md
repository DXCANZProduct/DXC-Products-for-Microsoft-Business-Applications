---
layout: product-content
header: Insights for D365 FO
toc: true
---

# Insights for D365 FO Dashboards for Application Insights

Application Insights has always provided a summary overview pane to allow quick, at-a-glance assessment of your application's health and performance.

### Insights for D365 FO Dashboard Overview.

The Insights for D365 FO dashboard gives a summarized overview of Exceptions and Failures, System health telemetry and Usage data for your application.

![Dashboard_overview](../IMAGES/Dashboard_overview.png)

### 1. Exceptions and failures

The exceptions and failures provide a summary of exceptions caught during Dual-write sync, top 10 errors encountered in batch processing, server exceptions and dependency failures and failed requests.

### 2. System health

The system health section provides telemetry on SQL health metrics including average CPU utilization, average memory usage, average input/output and average session utilization over the last 12 hours. These metrics are time locked for the last 12 hours and are not controlled by the dashboard time filter. The time range will need to be manually changed on these tiles to get custom time range metrics. The system health also provides a summary of the server response time based on the dashboard’s time range filter.

### 3. Continuous monitoring

Continuous monitoring helps organizations maintain a proactive approach to managing their operations. Specific business rules that have been setup with Insights for D365 FO are used to continuously evaluate and track specific aspects of the organization's operations, or critical business areas. The charts in this section help provide timely insights to users, allowing them to make informed decisions, and address issues promptly.

### 4. Usage

The usage section gives an overview of user sessions over the last 24 hours, as well as the number of users that have been active on the application over the dashboard’s time range. Requests display a count of requests received by the server. You can also see the application’s most viewed pages, slowest loading pages and top 10 most time-consuming requests on the server in this section.

### 5. Insights for D365 FO dashboard templates

Insights for D365 FO dashboard templates can be accessed from the Insights for D365 FO dashboard templates fast tab. Navigate to **System Administration > Setup > Insights for D365 FO > Insights for D365 FO parameters** then select the 'Azure application insights parameters' section to display the Insights for D365 FO dashboard templates fast tab. Click on ‘Check for updates’ to download the latest templates that we have released. Select a template version and Click _‘Download file’_ to download the template.

![Insights_dashboard_templates](../IMAGES/Insights_dashboard_templates.png)

### 6. Insights for D365 FO dashboard deployment

ARM templates are JSON or Bicep files that define the resources you need to deploy for your solution. To understand the concepts associated with deploying and managing your Azure solutions, see [how to create an Azure Resource Manager template](https://learn.microsoft.com/en-us/azure/azure-resource-manager/templates/quickstart-create-templates-use-the-portal) and [template deployment overview](https://learn.microsoft.com/en-us/azure/azure-resource-manager/templates/overview).

In summary, to deploy the Insights for D365 FO dashboard for your Azure Application Insights instance, download and keep a local copy of the DXCInsightsDashboardTemplate json file. In the web browser, go to the [Azure portal](https://portal.azure.com/) and sign in. From the Azure portal search bar, search for deploy a custom template and then select it from the available options.

![dashboard_deployment](../IMAGES/dashboard_deployment.png)

Select _‘Build your own template in the editor’_ template

![Custom_deployment](../IMAGES/Custom_deployment.png)

Select _‘Load file’_ and upload the ‘DXCInsightsDashboardTemplate.json’ file. Click _‘Save’_.

![Edit_template](../IMAGES/Edit_template.png)

Select the Resource group to which your new dashboard will belong to. Enter the appropriate Instance details for region and the name of the dashboard. By default, the dashboard name is ‘DXCInsightsDashboard’. Enter the ‘Application Insights Instance’ name for which the dashboard will be created, and finally enter the ‘Resource group’ name to which the previously entered Application Insights instance belongs to. Select _‘Review + create’_.

![Custom_deployment_review](../IMAGES/Custom_deployment_review.png)

The portal validates your template and the values you provided. After validation succeeds, select _‘Create’_ to start the deployment.

![Custom_deployment_validation](../IMAGES/Custom_deployment_validation.png)

Once your validation has passed, you will see the status of the deployment. When it completes successfully, select _‘Go to resource’_ to see the dashboard.

![Go_to_resource](../IMAGES/Go_to_resource.png)
