---
# required metadata

title: EDI Core
description: EDI Core - Setup document types - Field metadata
author: jdutoit2
manager: Kym Parker
ms.date: 2020-01-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIDocumentTypeTable
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: jdutoit2
ms.search.validFrom:   2016-05-31
ms.dyn365.ops.version:  AX 7.0.1
---

# Document types - Field metadata

## Setup field metadata

Users can access the form by navigating to **EDI > Setup > Document types**. <br>

The field labels that are available as standard in D365 often need to be updated or extended in order to display meaningful information.  Using the field metadata fast tab, it is possible to update both the **display name** and the **help** text available for a specific field within the document templates form.

The Field metadata fast tab displays all the available fields for the Document type and their current details. 

### Update manually

- Select the document type to create the display name or help text for.
- All available fields will be displayed
  > Note: Use the Toggle button to filter based on _header_ or _lines_ fields
- Select the field to update

**Field** 	                      | **Description**
:-------------------------------- |:-------------------------------------
**Field name**                    |	The system field name (not editable)
**Field label**                   |	The field label provided standard. Unless overridden via the display name field this will be the label displayed throughout the implementation (not editable)
**Display name**                  |	An override to the standard field label. If set, this will be seen throughout the environment in place of the standard field label.
**Help**                          |	The help text provided standard. Unless overridden via the display description field this will be the label displayed throughout the implementation (not editable)
**Display description**           |	An override to the standard help text. If set, this will be seen throughout the environment in place of the standard help text.
**Notes**                         |	User defined notes if required

### Update via upload

As setting these fields via the grid may be time consuming, a bulk update function has been provided.

- Select the **document type** to create the display name or help text for.
- All available fields will be displayed
  > Note: Use the Toggle button to filter based on _header_ or _lines_ fields
- Select the **Field upload** button
- To download a template, select **Template** from the dialog box, then **Download**
- Update the csv file, then save as csv
- From the dialog box, select **Browse**, and select the saved csv file
- Select if the csv file has **headers**
- Select **OK** to upload the file
