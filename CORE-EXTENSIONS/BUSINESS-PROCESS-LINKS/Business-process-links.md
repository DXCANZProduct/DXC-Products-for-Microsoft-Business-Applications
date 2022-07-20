---
# required metadata

title: Core Extensions
description: Core Extensions - Business process links
author: Liam Coll
manager: Kym Parker
ms.date: 2021-08-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: SystemParameters, BPS_ProcessLink
audience: Application User
# ms.devlang: 
ms.reviewer: Liam Coll

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Liam Coll
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Business Process Links
## Overview
The business process links feature allows you to setup associated links to forms when the user clicks on the D365 Help icon. The associated links will display under the Process Links tab. This was designed for Mavim and SharePoint but will work for any external links.
## Setup
A user may manually add Process links or alternatively use the Open in Excel function for bulk updates.

### Process links
To set up the process links, you first need to find the form name. 

1. Navigate to a form that you want to create a process link for.
2. Right click within the form.
3. Hover mouse over *Form information* to view the exact form name.
    * Selecting *Form name* will open the *Form information* slider, the form name can be copied from within the Administration tab.

#### Manually adding process links

1. Navigate to **System administration > Setup > Process links**
2. Add a new line 

|  **Field**  | **Description** | 
|:---|:---|     
|  **Form name**  | The form the link will be accessable from. |   
|  **Title**  | The header the link will be given, identifies its purpose. | 
|  **Subtitle**  | Additional details on what will be accessed by selecting this link. | 
|  **Form name**  | The URL that will be accessed by selecting this link. | 

#### Using Data Entity
The Process Links data entity may be used to import process links. The Open in Excel option is also available for updating the table.
 
#### Security Roles
The *Maintain process links table* security role has access to edit the Process Links form.
 
### SharePoint Connector
Mavim provides a SharePoint deployment. For this installation type, you can use the SharePoint connector set up. 

1. Navigate to **System administration > Setup > System parameters**
2. Click on *DXC business process* tab and select *SharePoint* from the *Connector type* drop down select list under the *Connector type* fast tab. This action will display fields applicable for SharePoint search setup.
    * Default SharePoint server – The URL to the SharePoint server
    * Sort process links by – Allows the user to determine the sort order of the results by Process links or SharePoint results. Which ever one is selected, it will appear at the top.

### Mavim Connector
The Mavim connector integrates the Mavim Portal into the help pane of Microsoft Dynamics 365 Finance and Operations. The help pane will load results from the Mavim Portal that are related to the form the user is on. Or they can search Mavim within the pane.

1. Navigate to **System administration > Setup > System parameters**
2. Select the DXC business process tab
3. Connector type
    * Select *Mavim portal* in the connector type field. This action will display the fields required to configure Mavim portal search setup.

#### Mavim portal

|  **Field**  | **Description** | 
|:---|:---|     
|  **Mavim portal URL**  | URL for the Mavim portal API. |   
|  **Username**  | Username to authenticate and login to the Mavim portal API. |   
|  **Password**  | Password to authenticate and login to the Mavim portal API. |   
|  **Sort process links by**  | Allows users to determine the sort order of the business process links and the Mavim portal links. |   
|  **Search by**  | Allows user to specify how to search the Mavim portal. The Mavim Portal API provides this capability which has been extended here. |   
|  **Refresh**  | The refresh button when clicked will authenticate and connect to the Mavim portal API. Once the connection is successful it will load all the setup data into the Version management, Chart management and Topic management sections respectively. |   

#### Version Management
The Mavim portal may contain multiple version definitions. This functionality shows all existing versions on the Mavim portal and provides ability to use to include/exclude certain version definitions from the results returned from the Mavim portal API. The user also can add or remove version definitions from the list of available versions.

|  **Field**  | **Description** | 
|:---|:---|     
|  **ID**  | The version id. |   
|  **Publisher**  | The name of the version. The key part of this information is the number that is at the end of the name, for instance, ‘29025’. This number identifies the version definition, ‘29’ and version number, ‘025’. Only the definition will be used to return results. |   
|  **Version definition**  | The version definition that is used as an identifier to decide whether to include the results. |   
|  **Enabled**  | Field to indicate whether to include or exclude the version definition from the results returned by the Mavim portal. |  

#### Chart Management
This functionality allows users to determine the order to display charts when a result has multiple charts associated with it. For example, a topic has a flowchart and a cross-functional chart associated to it then the display order can be determined to show flowchart first and cross-functional chart second. 

This functionality also allows users to determine whether the certain charts should be included in the results or not. User can add or remove chart types. Additionally, the move up and move down button allow user to be able to change the order of each chart type displayed under the processes tab within the help tab. When the list is loaded for the first time by selecting the refresh button, the default sort order is by *Type*.

The system will only return results for chart types that are enabled.
* **Name** – Chart type.
* **Enabled** – Flag to indicate whether the selected record type should be included in the results or not.

#### Topic Type Management
The Mavim connector will load the following types on refresh. These values are fixed and do not change on the Mavim side. The system will only return results for topics specified in this list.

|  **Topic Type ID**  | **Name** | **Topic Type** |  
|:---|:---|:---|      
|  **10**  | Topic | Get chart |    
|  **31**  | Start activity | Get chart |    
|  **32**  | Stop activity | Get parent |    
|  **33**  | Decision | Get parent |    
|  **35**  | Detailed process | Get chart |    
|  **36**  | Process | Get chart |    
|  **39**  | Activity | Get parent |    
|  **40**  | Activity | Get parent |    

Each topic type id determines the action that will be used to generate the hyperlink to be displayed as part of the results.

Currently there are two actions
* **Get Chart** – This indicates that associated chart(s) for the topic needs to be retrieved.
* **Get Parent** – This indicates that associated chart(s) for the topic that is one level above the returned topic needs to be retrieved.

## Process
Under the help pane, there is a new Processes tab. This will load results based on your set up to show links relevant to the form you are on. However, it does allow for searching for specific terms in the search bar. To use it;

1. Open a form that has content configured for it. 
2. Click Help on top right.
3. Select the *Processes* tab.
4. Results will display with a hyperlink.

*Note: These are hyperlinks that are independent of Finance and Operations, some systems may require credentials to be specified.*
