---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Document type mapping

## Setup Document type mapping

Users can access the form by navigating to **EDI > Setup > Document type mapping**. <br>
The mapping can be used in functional acknowledgement's [setting profiles](SETTING-PROFILES/Functional-acknowledgement.md).

Create a new Document type mapping by:

- Click **New** to create a new record.
- In the **Name** field, enter the name of the Document type mapping group
- In the **Description** field, enter a description of the Document type mapping group
- In the **Mappings** fast tab, select **Add** to create a new record
- Select the **EDI Document type**
- Specify the trading partner's value in **Document type**, for example 'IN' for Sales invoice

## Where used

Used on the following EDI documents (field):

- Functional acknowledgement inbound (AcknowledgedDocumentTypeExternalId)
- Functional acknowledgement outbound (SourceDocumentTypeExternalId)

## Data entities

- Functional acknowledgement document type mapping
- Functional acknowledgement document type mapping lines
