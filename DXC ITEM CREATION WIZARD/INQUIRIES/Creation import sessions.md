---
# required metadata

title: [DXC Item Creation Wizard ]
description: [Introduction to DXC Item Creation Wizard - Creation import sessions  ]
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

# Creation import sessions

When one or more files are imported against a template an import session is created to validate the data and track the submission to workflow. Import session can be viewed at **Item creation > Inquiries > Item creation import sessions**. Information found on the import session include;

|  **Field**  | **Description** | 
|:---|:---|     
|  **Import session**  | Unique identification for the import session. |   
|  **Start date/time**  | Creation date and time for the import session. |  
|  **End date/time**  |  |
|  **Status**  | Represent the stage of processsing through the workflow. |   
|  **Template version**  | The template name and version number used for all records included in the import session. |   

#### Status values

The status values applied to a creation import session related to progress along the workflow.

|  **Status**  | **Description** | 
|:---|:---|     
|  **Not submitted**  | Import session was not submitted to workflow. Can be caused by a validation error or difference in mask and number of import fields.  |  
|  **Submitted**  | Import session has been submitted to workflow and is awaiting processing. |  
|  **Approved**  | Import session has been approved in workflow and is awaiting actions. |  
|  **Completed**  | Import session has been processed through workflow and items created/udpated. |  
|  **Canceled**  | Workflow has been recalled. |  

#### Deleting an import session

Import sessions can only be deleted if the record has a status of either *Not submitted* or *Canceled*.

Deleting an import session will also remove all import session line and any reference to the line accessable from the [All creation items](All_creation_items) form.

#### Submitting an import session to workflow

All imported sessions will be automatically submitted to the [Item creation import workflow](Item_creation_workflows), the exception to this is where the imported file contains incomplete or incorrect data. 

Fields that result in a validation error can be amended within the designer accessable from the lines form. Once all records have been sucessfully validated the workflow button will become visible on the action pane of the import session form, allowing the session and all lines to be submitted for approval.

A single line within the import session cannot be seperated from the other lines to allow some of the records to import.

## Import session lines

Import session lines represent each item contained within the imported file. The fields on the import session line allow for the identification of a record from all of those impoarted. The values present in the imported file can be accessed from the designer menu.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Item creation**  | Record referenced in [All creation items](All_creation_items). |   
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
