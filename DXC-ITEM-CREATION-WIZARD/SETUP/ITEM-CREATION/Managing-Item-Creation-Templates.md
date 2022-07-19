---
# required metadata

title: DXC Item Creation Wizard
description: DXC Item Creation Wizard  - Template versions
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-27
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCICCreationTemplateTableListPage 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom:2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Template versions

Item creation templates are version controlled to allow the tracking of fields added and removed from templates over time. The version used to create or update a product is recorded against the item creation record for logging and audit purposes. 

## Activate a version

To use an Item creation template, it must be activated. It is not possible to edit an activated template. Activation of a template is achieved from the action pane at **Item creation > Setup > Item creation > Item creation templates > Manage > Activate**.

## Deactivate a version

It is possible to stop using an Item creation template version by deactivating it. Deactivating a template version does not allow for the template to be edited. Deactivation occurs by selecting **Item creation > Setup > Item creation > Item creation templates > Manage > Deactivate**.

## Create a new version

To edit an activated item creation template a new version needs to be created, a new version number will be allocated. **Item creation > Setup > Item creation > Item creation templates > New version**

|  **Field**  | **Description** | 
|:---|:---|     
|  **Copy from**  | Existing version for the selected template that will be used as the basis for the new version. This does not need to be the latest or current version. This will populate with the version currently being viewed. | 
|  **Description**  | This can include changes made or the reason for changes so as to distiguish between past versions. | 
|  **Set as current version**  | This version will become the current version. The template will not be available for use until the version has been activated. | 

## View/manage versions

It is possible to view all versions for a template by selecting versions from with the action pane. **Item creation > Setup > Item creation > Item creation templates > Manage >  Versions**

|  **Field**  | **Description** | 
|:---|:---|     
|  **Current**  | Identifies the version of the template referenced when the template is used. Only one version can be current. The current version must be active to be available for use.  | 
|  **Description**  | This can include changes made or the reason for changes so as to distiguish between past versions. | 
|  **Version**  | The version number for the selected template. | 
|  **Activated**  | Identifies the version as having been activated. The current version must be active to be available for use.  |

Versions can be managed from within this slider by selecting the following actions. 

|  **Action**  | **Description** | 
|:---|:---|     
|  **View**  | Opens the selected version in view mode. | 
|  **Edit**  | Opens the selected version in edit mode. Versions that have been activated cannot be edited in this mode. | 
|  **New version**  | Will provide the options for creating a new version. *Copy from* will populate with the version selected at the time. | 
|  **Delete**  | Delete the version. A version can only be deleted if it has not been used to create/update an item. | 
|  **Set current**  | Set the selected version as the current version, making this the version that will be used when the template is selected. Only one version can be current. | 
|  **Activate**  | Activates the selected version making it available for use. This version can no longer be updated. | 
|  **Copy**  | Create a new template using the selected version. | 

### Copy a version

A new template can be created by copying all configuration for the selected template version. The following information to define the charateristics of the new template.
**Item creation > Setup > Item creation > Item creation templates > Manage > Copy**

|  **Field**  | **Description** | 
|:---|:---|     
|  **Template  name**  | Identifier for the template, used to determine its purpose. | 
|  **Template type**  | The action that will be taken when the template is used. | 
|  **Status**  | The item status that will be applied to items on use of the template. Update of the item status is also controlled by [workflow](Item-creation-workflows) configuration. | 
|  **Only current version**  | Determines if all versions from the selected template are copied into the new template, or only the current version. | 
