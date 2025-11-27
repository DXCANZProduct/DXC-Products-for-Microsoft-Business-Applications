---
layout: product-content
header: Item Creation Wizard
toc: true
---

## Releasing an existing item to another company

Item creation extends on the standard AX functionality for releasing a product into a new company by also populating the values present on the released product. Fields included in the release template can also be updated, this allows for fields with values that are not consistant between companies to reflect the value required in the new company. Release templates are then submitted to the _Item creation workflow_ for approval prior to the the released product being created.

Release templates can be initiated from the All creation items form by selecting an active template with a template type of _release to a new company_. All creation items can be accessed by navigating to **Item creation > Item creation > All creation items**.

1. Click _New_.
2. Select _Template name_ with a template type of _release to a new company_.
3. Select the _Item number_ the update will be applied to.
4. Click _OK_ to open the _Designer_ form.
5. Complete the fields as per your [templates](Item-creation-templates) requirements.
6. Click _Validate_ to confirm fields and display the workflow menu.
7. Under workflow, click _Submit_ to commence the [Item creation workflow](Item-creation-workflows).
8. If this is the **last Step** it will either update the released product or request an Approval. This will be determined by the workflow configuration.

If there are **more Steps** to complete then the next user(s) will need to complete their Steps. Normally your workflow will be configured to email them or send them an alert to advise that there is a workflow action for them to attend to. To complete their step, they must:

1. Navigate to **Item creation > Item creation > Open creation items.**
2. Select the _relevant record._
3. Click on the _Designer_ icon in the action pane.
4. Complete the fields as per your templates requirements.
5. Click _Validate_ to display workflow menu.
6. Click _Submit_ to continue the Item creation workflow.

_Note: It is possible to Close at any time; your entries will be saved._
