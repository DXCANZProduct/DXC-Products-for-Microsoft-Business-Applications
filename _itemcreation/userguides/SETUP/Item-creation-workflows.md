---
layout: product-content
header: Item Creation Wizard
toc: true
---

# Item creation workflows

Workflows are used in item creation to manage the approval of created, released or updated products. You can reach the item creation workflow form by navigating to **Item creation > Setup > Item creation workflows**

## Workflow types

A default workflow must be created for each of the creation methods in use.

| **Workflow type**                 | **Description**                                                                                        |
| :-------------------------------- | :----------------------------------------------------------------------------------------------------- |
| **Item creation workflow**        | Workflow applied to item creation records initiated manually from within the _All creation items_ form |
| **Item creation import workflow** | Workflow applied to imported records visible from the _Item creation import sessions_ form             |

## Workflow elements

Additional elements have been created for use with item creation workflow.

| **Workflow element**           | **Description**                                                                                                                              |
| :----------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------- |
| **Approve item creation step** | Use this element to approve an item creation step.                                                                                           |
| **Change item status**         | This element will update the item status based on the template configuration.                                                                |
| **Create/update item**         | Will create or update the item that has been submitted to the workflow. Applicable to _Item creation workflow_                               |
| **Run creation**               | Will create or update all items in the import session that has been submitted to the workflow. Applicable to _Item creation import workflow_ |
| **Set next step**              | Will update the item creation record to the next step in the template.                                                                       |
| **Edit step**                  | Allows for editing of the record that has been submitted.                                                                                    |

Note: For information on how to create a workflow please refer to the [standard Dynamics 365 Finance and Operations, Enterprise Edition functionality.](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/organization-administration/create-workflow?toc=/dynamics365/finance/toc.json)
