---
# required metadata

title: [DXC Item Creation Wizard]
description: [DXC Item Creation Wizard  - Template versions]
author: [Liam Coll]
manager: Kym Parker
ms.date: 27/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DXC Item Creation Wizard ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [helenho]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
