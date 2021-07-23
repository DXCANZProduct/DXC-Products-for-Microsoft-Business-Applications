---
# required metadata

title: [DXC Item Creation Wizard ]
description: [DXC Item Creation Wizard - Managing item statuses  ]
author: [Liam Coll]
manager: Kym Parker
ms.date: 23/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DXC Item Creation Wizard ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [liamcoll]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

#	Managing Item Status

There are 4 methods to update the item status on a released product. 

## Updating using a creation template

A status value can be assigned to an [item creation template](Item_Creation_Templates). Use of this template to create, release or update an item will apply the template status to the released product where the Change item status element has been included in the approval [workflow](Item_creation_workflows).

Where no item status exists on a released product and the template does not have a value defined, the default value set in the [parameters](Item_creation_workflows) form will be used.

## Updating a single item
Item Creation > Products > Released Products > Item creation > Item status link (button)
The item status can be held at the item or item dimension level. The item status can be manually updated via the released products form. 
1.	The form will default to show current records once opened.  
2.	Enter the as at date.
3.	Select Apply.
Note: The Item Status displayed at the top of the released products form is the item status at the item level, not the item dimension level.

## Updating a group of items
Item creation > Periodic Tasks > Update item status
A periodic job is available that can be either manually run to update the item status as of a specified date for a range of items. Category hierarchy can be used to help filter products. 
Where this is the case it allows for item status updated to be planned and entered into AX prior to the effective date.  Reports/inquiries can then be run to filter down based on the item status at a specific date.
1.	Select the From Status.
2.	Select the To Status
3.	Enter an effective date if required.  To make effective immediately, leave blank.
4.	Select a Category hierarchy if required to filter down to a group of products.
5.	Select the filters applicable in the Tree Pane section. Use the + and - to open up the branches of the tree.  Click on the categories at any level to restrict items. 
6.	Select the items that must be updated. 
7.	Select OK.
Note: Optionally select the Batch tab to run the report on a batch. Please see Microsoft User Guides  For further information

## Updating based on stock on hand rules
Item creation > Setup > Item Setup > Automatic status change rules
Automatic status change rules can be setup to update the item status based on certain events that take place.  For example, an item that has been set to 'Run Out' can be updated to 'Discontinued' Once the stock on hand becomes zero. 
1.	Within the Status form select the status.
2.	Click the button Allowed status transitions.
3.	Click the New button.
4.	Select the To Status.
5.	Repeat as necessary.
6.	Click Close once completed.


#	Item Status Visibility

## Released products
When viewing the Released Product details, the inventory status symbol will be displayed directly below the Item number and description.

## Inventory transactions
When creating a sales/purchase order, the inventory status symbol will be displayed in the first column of the sales/purchase line.  This will enable the user to identify that the item is ‘active’, discontinued’ etc.
