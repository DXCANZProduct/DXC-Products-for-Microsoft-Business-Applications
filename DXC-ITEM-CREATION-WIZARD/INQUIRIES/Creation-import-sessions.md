---
# required metadata

title: DXC Item Creation Wizard 
description: Introduction to DXC Item Creation Wizard - Creation import sessions  
author: Liam Coll
manager: Kym Parker
ms.date: 2021-07-27
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCICCreationImportSession 
audience: Application User
# ms.devlang: 
ms.reviewer: helenho

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Creation import sessions

When one or more files are imported against a template an import session is created to validate the data and track the submission to workflow. Import session can be viewed at **Item creation > Inquiries > Item creation import sessions**. Information found on the import session include;

|  **Field**  | **Description** | 
|:---|:---|     
|  **Import session**  | Unique identification for the import session. |   
|  **Start date/time**  | Creation date and time for the import session. |  
|  **End date/time**  |  |
|  **Status**  | Represent the stage of processsing through the workflow. <br /> * **Not submitted** - Import session was not submitted to workflow. Can be caused by a validation error or difference in mask and number of import fields. <br /> * **Submitted** - Import session has been submitted to workflow and is awaiting processing. <br /> * **Approved** - Import session has been approved in workflow and is awaiting actions. <br /> * **Completed** - Import session has been processed through workflow and items created/udpated. <br /> * **Canceled** - Workflow has been recalled. |   
|  **Template version**  | The template name and version number used for all records included in the import session. |   

#### Deleting an import session

Import sessions can only be deleted if the record has a status of either *Not submitted* or *Canceled*.

Deleting an import session will also remove all import session line and any reference to the line accessable from the [All creation items](../CREATION/All-creation-items.md) form.

#### Submitting an import session to workflow

All imported sessions will be automatically submitted to the [Item creation import workflow](../SETUP/Item-creation-workflows.md), the exception to this is where the imported file contains incomplete or incorrect data. 

Fields that result in a validation error can be amended within the designer accessable from the lines form. Once all records have been sucessfully validated the workflow button will become visible on the action pane of the import session form, allowing the session and all lines to be submitted for approval.

A single line within the import session cannot be seperated from the other lines to allow some of the records to import.

## Import session lines

Import session lines represent each item contained within the imported file. The fields on the import session line allow for the identification of a record from all of those impoarted. The values present in the imported file can be accessed from the designer menu.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Item creation**  | Record referenced in [All creation items](../CREATION/All-creation-items.md). |   
|  **Status**  | Validation status. |   
|  **Creation number**  | Record referenced in All creation items. |   
|  **Template version**  | The template name and version number, shared by all records included in the import session. |   
|  **Product**  | Product identifier for created/updated item. |   
|  **Step**  | Step against which the file mask is imported. Effects what fields are displayed when the designer menu is opened. |   
|  **New item number**  | If the template is creating a new item number, this will be reference. Used for creation templates. |   
|  **Existing item number**  | If the template references an existing item number this will be referenced. Used for update templates. |   
|  **Company**  | Company the item will be created/updated in. |   
|  **Status**  | Represent the stage of processsing through the workflow. |   

#### Designer

Accessing the designer will allow for values recorded against the item creation record to be updated to resolved validation issues identified on import. After the update has been completed a new validation can be initiated by selecting *validate* from the action pane.

Unlike when accessed from the all creation items, the import session line cannot be submitted to workflow from within the designer. Once all import session lines have been sucessfully validated this will be available from the import session directly. 

#### Log

When an import session line is not validated sucessfully on import, the cause of the validation failure will be captured against the record. This can be accessed by selecting the import session line and selecting *Log* from the action pane. Contents of the log are displayed in the message bar.
