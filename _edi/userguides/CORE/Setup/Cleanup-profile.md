---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Cleanup profile

## Setup Cleanup profile

Users can access the form by navigating to **EDI > Setup > Cleanup profile**. <br>
The cleanup profile is used to automatically delete staging record/s.

Create a new Cleanup profile by:

- Click **New** to create a new record.
- In the **Name** field, enter the name of the Cleanup profile group
- In the **Description** field, enter a description of the Cleanup profile group
- In the **Mappings** fast tab, select **Add** to create a new record
- Select the **Staging to target status**. Options:
  - Not started
  - Completed
  - Error
  - Cancelled
- Specify the **Age days**. When the batch job is run, staging records older than this value will be deleted.

The configured Cleanup profiles can be used either in:

- EDI shared parameters, and/or
- Trading partner’s Options, and/or
- Trading partner’s Incoming and Outgoing documents

Also required to setup a period task to run the cleanup via **EDI > Periodic tasks > Cleanup documents**.
