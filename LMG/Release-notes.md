---
# required metadata

title: License manager
description: License manager - Release notes
author: jdutoit2
manager: Kym Parker
ms.date: 2023-11-20
ms.topic: article
ms.prod:
ms.service: dynamics-ax-applications
ms.technology:

# optional metadata

ms.search.form:
audience: Application User
# ms.devlang:
ms.reviewer: jdutoit2
# ms.tgt_pltfrm:
# ms.custom:
ms.search.region: DXCLicenseManager
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Release notes

This document describes the features that are either new or changed in the release version mentioned.

<!--TOC-->

- [Current Version](#current-version)
  - [D365 Finance and Operations](#d365-finance-and-operations)
    - [DXC License Manager](#dxc-license-manager)
    - [DXC License](#dxc-license)
  - [Microsoft Power Apps](#microsoft-power-apps)
    - [DXC License Manager Canvas App](#dxc-license-manager-canvas-app)
  - [React Web App](#react-web-app)
    - [DXC License Manager Web App](#dxc-license-manager-web-app)
- [Previous Version(s)](#previous-versions)
  - [D365 Finance and Operations](#d365-finance-and-operations-1)
    - [DXC License Manager](#dxc-license-manager-1)
  - [Microsoft Power Apps](#microsoft-power-apps-1)
    - [DXC License Manager Canvas App](#dxc-license-manager-canvas-app-1)
    <!--/TOC-->

# Current version

## D365 Finance and Operations

### DXC License Manager

#### **Release 10.0.32.20230731**

DXC License Manager 10.0.32.20230731 runs on the following Microsoft releases

| Base                               | Version | Release                                                                                                                                                                 |
| :--------------------------------- | :------ | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Microsoft Dynamics 365 application | 10.0.32 | [What’s new or changed in Dynamics 365 application version 10.0.32](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-32)         |
| Microsoft Dynamics 365 application | 10.0.33 | [What’s new or changed in Dynamics 365 application version 10.0.33](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-changed-10-0-33) |
| Microsoft Dynamics 365 application | 10.0.34 | [What’s new or changed in Dynamics 365 application version 10.0.34](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-34)         |
| Microsoft Dynamics 365 application | 10.0.35 | [What’s new or changed in Dynamics 365 application version 10.0.35](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-35)         |
| Microsoft Dynamics 365 application | 10.0.36 | [What’s new or changed in Dynamics 365 application version 10.0.36](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-36)         |
| Microsoft Dynamics 365 application | 10.0.37 | [What’s new or changed in Dynamics 365 application version 10.0.37](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-37)         |
| Microsoft Dynamics 365 application | 10.0.38 | [What’s new or changed in Dynamics 365 application version 10.0.38](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-38)         |

<b>Build 7.0.6801.37 </b>

<ins>New features</ins>

| Number | Functionality                                                   | Description                                                                                                                                                                  |
| :----- | :-------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 15113  | Feature disabling based on disable date not working             | A fix has been made to force disable a feature using the expiry date and feature disable dates configured in backed for license controlled products with feature management. |
| 15116  | Inclusion of additonal endpoint for non-production environments | An additional domain has been added to mark development environments as non-production within the IsProductEnvironment telemetry for app insights logging.                   |

### DXC License

#### **Release 10.0.34.20231031**

DXC License 10.0.34.20231031 runs on the following Microsoft releases

| Base                               | Version | Release                                                                                                                                                         |
| :--------------------------------- | :------ | :-------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Microsoft Dynamics 365 application | 10.0.34 | [What’s new or changed in Dynamics 365 application version 10.0.34](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-34) |
| Microsoft Dynamics 365 application | 10.0.35 | [What’s new or changed in Dynamics 365 application version 10.0.35](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-35) |
| Microsoft Dynamics 365 application | 10.0.36 | [What’s new or changed in Dynamics 365 application version 10.0.36](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-36) |
| Microsoft Dynamics 365 application | 10.0.37 | [What’s new or changed in Dynamics 365 application version 10.0.37](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-37) |
| Microsoft Dynamics 365 application | 10.0.38 | [What’s new or changed in Dynamics 365 application version 10.0.38](https://docs.microsoft.com/en-us/dynamics365/finance/get-started/whats-new-changed-10-0-38) |

<b>Build 7.0.6931.48 </b>

<ins>New features</ins>

| Number | Functionality | Description                                                          |
| :----- | :------------ | :------------------------------------------------------------------- |
| 16411  | DXC License   | DXC License including feature managed SmartSend and Core extensions. |

## Microsoft Power Apps

### DXC License Manager Canvas App

#### **Release 2023060511**

DXC version – 1.0.0.6 <br>
Cepheo version – 1.0.0.5

Release date: 17 July 2023

<ins>Bug fixes</ins>

| Number | Functionality                                                            | Description                                                                                                                                                                                                        |
| ------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 14592  | Disable add button when customer edit view is enabled                    | A fix has been applied to disable users from trying to create a new button while in edit mode.                                                                                                                     |
| 14593  | Customer list is not refreshed after adding/updating a customer record   | A fix has been made to resolve the refresh issue for customer record not appearing in the customer details list pane after add or update                                                                           |
| 14594  | Blank customer name is accepted                                          | Customer name has been set to mandatory. In previous versions, the customer name could be reset to blank during update                                                                                             |
| 14595  | Same name product can be created multiple times                          | Product name has been set to unique                                                                                                                                                                                |
| 14596  | Blank tenant is saved successfully                                       | In previous versions, the tenant name could be left blank. Validation has been added for missing tenant name                                                                                                       |
| 14597  | Environment count does not update                                        | A fix has been applied for the environment count refresh within the customer products list. In previous version, the environment count was not updated when the back button was pressed from the environments view |
| 14598  | Product record still visible after delete                                | A fix has been made to the product list refresh. This will now reflect the delete of all product records                                                                                                           |
| 14600  | Blank product name is accepted                                           | Product name is set to mandatory. The app will prompt for missing product name during creation and deletion                                                                                                        |
| 14601  | New product not visible under product list in the customer products view | A fix has been made to refresh the product list after a product record is created.                                                                                                                                 |

## React Web App

### DXC License Manager Web App

#### **Release 20240227.1**

Release date: 27 February 2024

<ins>New features</ins>

| Number | Functionality                                                                     | Description                                                                                                                                                                                                                                                                                                                                       |
| :----- | :-------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 14177  | React front-end for license management across different ISV partner organisations | New react-based front end has been designed for license management. This will replace the replace the existing PowerApp currently being used for managing customer license information. It includes all the existing functionlity within the PowerApp and some additional features described below in addition to multi-tenancy support           |
| 15606  | Manage Product Data                                                               | Ability to manage product information.                                                                                                                                                                                                                                                                                                            |
| 15609  | Manage Customer Data                                                              | Ability to manage customer information.                                                                                                                                                                                                                                                                                                           |
| 15612  | Manage Customer Product Licenses                                                  | Ability to manage customer product licenses.                                                                                                                                                                                                                                                                                                      |
| 15612  | Manage Customer Environments level                                                | Ability to customer environments. This functionality has been modified to enable environment management against customer records. In previous version this had to be done on a customer product                                                                                                                                                   |
| 15621  | Product customers view                                                            | New view to access the list of customers for any product                                                                                                                                                                                                                                                                                          |
| 15630  | License Expiry view                                                               | View upcoming license expiry information                                                                                                                                                                                                                                                                                                          |
| 15633  | Single-sign on using organization email account                                   | Ability to sign up and sign in using the organization email account                                                                                                                                                                                                                                                                               |
| 15636  | Manage user access                                                                | Added new capability for role based accessibility of all views within the app and define access privileges (Create, Read, Update, Delete permissions) for each role and view. Organisation administrators will have full access, can manage user access control and will be able to register or unregistered users within the app to grant access |
| 16027  | Web App Theme and Styling access                                                  | Added new capability for organization admins to configure the color scheme of the app which is applicable to all users within the organization. Additionally, added ability to update the icon and default landing page upon sign in for the app.                                                                                                 |
| 16559  | BI Reports                                                                        | New capability that allows organizations to setup and configure their own Power BI reports and configure workspace settings within the web app for viewing Power BI embedded reports. This feature includes report and page level access control within the web app.                                                                              |

# Previous version(s)

## D365 Finance and Operations

### DXC License Manager

#### **Release 10.8.32.10171**

<b>Build 7.0.5493.35497 </b>

<ins>New features</ins>

| Number | Functionality | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| :----- | :------------ | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 13085  | Multi-tenant  | Enabled multi-tenant support for license manager. <br> - Added support for tenant GUID for license server product validations. <br> - All licensed products now require a unique tenant GUID specific to the organization for license validation. <br> - Added multi-tenancy support to the existing license validation API. <br> - Added ability to host separate database and application insights instances for specific to each tenant. <br> - Added capability to forward tenant specific telemetry. <br> - Added ability to resolve product license validation based on the tenant GUID configured <br> - Updated product publisher to be based off the tenant. |

#### **Release 10.8.32.10156**

<b> Build 7.0.5493.35497 </b>

<ins>New features</ins>

| Number | Functionality        | Description                                                                          |
| :----- | :------------------- | :----------------------------------------------------------------------------------- |
| 10625  | Product help in D365 | Users can access applicable product’s GitHub user guides from within D365 help pane. |

#### **Release 10.8.32.10141**

<b> Build 7.0.5493.35497 </b>

<ins>New features</ins>

| Number | Functionality                | Description                                                                                                                                                                                                                                                                                                                              |
| :----- | :--------------------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 10341  | D365 - Product documentation | Added ability to view user guides, release notes and contact information for each product within D365 <br> - New workspace under organization administration called Product support <br> - These fields can be updated as part of the license manager Power App front end and are synced within D365 when the license check is executed. |

#### **Release 10.8.32.10131**

<b> Build 7.0.5493.35497 </b>

<ins>Bug fixes</ins>

| Number | Functionality                            | Description                                                                                                                                                                             |
| :----- | :--------------------------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 68     | Fix load time delay due to license check | A fix has been implemented to address the load time delay on the default page. The license check used to lock the process and users would experience a delay of approximately a minute. |

#### **Release 10.8.32.10123**

<b> Build 7.0.5493.35497 </b>

<ins>New features</ins>

| Number | Functionality                            | Description                                                                                                                                                                                                                                        |
| :----- | :--------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 54     | Configure custom DNS for license manager | - Previous versions used azure hosted connection which can encounter down time and delay. <br> - Added custom DNS to ensure licensing team have full access to DNS propagation and can handle redirection to alternative service during downtimes. |

<ins>Bug fixes</ins>

| Number | Functionality                                                              | Description                                                                                  |
| :----- | :------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------- |
| 63     | Set find and exist method accessibility to public in license manager table | Users were unable to access these methods in extends due to its accessibility set to private |

#### **Release 10.8.32.10101**

<b> Build 7.0.5493.35497 </b>

<ins>Bug fixes</ins>

| Number | Functionality                                               | Description                                                                                                                                            |
| :----- | :---------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------- |
| 40     | Fixed synchronisation issues when performing license checks | Users experienced info logs stating the product is enabled but not licensed even though the product is licensed. This issues persisted intermittently. |

## Microsoft Power Apps

### DXC License Manager Canvas App

#### **Release 202306051**

DXC version – 1.0.0.5 <br>
Cepheo version – 1.0.0.4

Release date: 5 June 2023

<ins>Bug fixes</ins>

| Number | Functionality             | Description                                                                         |
| :----- | :------------------------ | :---------------------------------------------------------------------------------- |
| 14138  | Edit product - JSON error | Fix has been applied for an issue with json error promp when a product is modified. |

<ins>Deprecation</ins>

| Number | Functionality           | Description                                                                                                                                         |
| :----- | :---------------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------- |
| 13682  | Deprecate DAXEAM Mobile | Daxeam mobile is no longer supported. As part of this change, the environments API endpoint and the product type Daxeam Mobile has been deprecated. |

#### **Release 202304281**

DXC version – 1.0.0.4 <br>
Cepheo version – 1.0.0.3

Release date: 28 April 2023

<ins>Bug fixes</ins>

| Number | Functionality                                                | Description                                                                                                                           |
| :----- | :----------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------ |
| 13692  | Fixed customer description update issue                      | In previous version, when the customer description was modified an error used to be prompted to the user and the value was not saved. |
| 13696  | Fixed issue when trying to update dates on customer products | In previous version, the date was not updated correctly when modifying the customer product record.                                   |

<ins>Known issues</ins>

| Number | Name                      | Description                                       | Rectified Release |
| :----- | :------------------------ | :------------------------------------------------ | :---------------- |
| 14138  | Edit product – JSON error | When modifying products, a json error is prompted |

#### **Release 202303311**

DXC version – 1.0.0.1 <br>
Cepheo version – 1.0.0.2

Release date: 31 March 2023

<ins>New features</ins>

| Number | Functionality                                   | Description                                                                                                                                                                                                                                                |
| :----- | :---------------------------------------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 13085  | Enable multi-tenant support for license manager | - Enabled multi-tenant-based license manager views to display tenant specific data in correlation to the database instance for each unique tenant GUID <br> - Updated framework for data processing within Power Apps to use APIM using OAuth credentials. |
