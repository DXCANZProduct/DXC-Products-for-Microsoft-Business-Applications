---
layout: product-content
header: Item Creation Wizard
toc: true
---

## Create a new Item

Item creation extends on the standard AX functionality for creating/updating items. It provides a streamlined way to create/update items, ensuring all required fields have been populated by different departments where necessary using workflow capabilities. Once item information has been completed it is possible to approve item creation and release to multiple entities.

You can reach the All creation items form by navigating to **Item creation > Item creation > All creation items**.

1. Click _New_.
2. Select _Template name_ with a template type of _create_.
   - If a number sequence is not defined on the template, or is set to manual a _Product number_ must be entered.
3. Click _OK_ to open the _Designer_ form.
4. Complete the fields as per your [templates](../SETUP/ITEM-CREATION/Item-creation-templates.md) requirements.
5. Click _Validate_ to confirm fields and display the workflow menu.
6. Under workflow, click _Submit_ to commence the [Item creation workflow](../SETUP/Item-creation-workflows.md).
7. If this is the **last Step** it will either generate the Product or request an Approval. This will be determined by the workflow configuration.

If there are **more Steps** to complete then the next user(s) will need to complete their Steps. Normally your workflow will be configured to email them or send them an alert to advise that there is a Workflow Product Creation for them to attend to. To complete their step, they must:

1. Navigate to **Item creation > Item creation > Open creation items.**
2. Select the _relevant record._
3. Click on the _Designer_ icon in the action pane.
4. Complete the fields as per your templates requirements.
5. Click _Validate_ to display workflow menu.
6. Click _Submit_ to continue the Item creation workflow.

_Note: It is possible to Close at any time; your entries will be saved._
