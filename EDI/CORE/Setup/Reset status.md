---
# required metadata

title: [EDI Core]
description: [EDI Core - Setup reset status profile]
author: [jdutoit2]
manager: Kym Parker
ms.date: 22/07/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [Operations AOT form name to tie this topic to]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [jdutoit2]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global for most topics. Set Country/Region name for localizations]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [author's Microsoft alias]
ms.search.validFrom: [month/year of release that feature was introduced in, in format yyyy-mm-dd]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
---

# Reset status process

## Retry/reset process

The Reset status functionality provides companies the option to set an automatic _retry_ process for error records. <br>
Files and/or documents with error status can be reset based on the reset profile’s recurrence and the number of reset attempts (End after in Recurrence).
The files and/or documents will then be picked up in the next normal processing batch. If the underlying issue has been fixed, the file can be successfully processed. If the underlying issue still exist and all the reset attempts have completed the automatic resets will end. There is also an option to **Edit status recurrence** whereby the number reset attempts will be started again. Users can also select a different ‘Reset status profile’ on the document or file’s header.

## Setup retry/reset process
The setup is split into the following:
1.	[**Setup Reset status profile**](#setup-reset-status-profile): Set recurrence of the reset. <br>
a.	**End after** sets the number of reset attempts. <br>
b.	**Recurrence pattern** sets the interval of resetting. <br>
Example: **End after** of 5 with **Recurrence pattern** of 2 minutes will reset error records every 2 minutes for 5 times. The reset will stop once the **End after** number of resets have occurred. <br> Optional: A user can manually override the recurrence by assigning a **Retry profile** on the record or using **Edit status recurrence** to start the process again by setting retry attempts to 0 and the retry date/time will start again based on the assigned retry profile’s recurrence interval. When using **Edit status recurrence** values needs to be updated in order to reset the **Reset status attempts** to zero.
2.	Assign default **Reset profile** on [**EDI shared parameters**](EDI_SharedParameters.md) or set up on only the applicable Trading partner’s documents (step 3)
3.	Optional: Ability to override default reset profiles from shared parameters on the Trading partner’s documents.
4.	Setup the [**Reset documents status**] periodic task; similar to a workflow processor job.

Example issues that could result in an Error status:

**Step** 	                        | **Path**                              | **Example issue and fix**
:-------------------------------- |:------------------------------------- |:-------------------------------------
<ins>**Files**</ins>
**Inbound to staging**            |	EDI > Files > Inbound files           |	Document template issues, for example assigned template doesn’t match file’s format. <br> Fix: Reset template to correct template or fix assigned template
**Export**                        |	EDI > Files > Outbound files          |	Connection issue. <br> Fix: If setup issue, fix on Connection setup else fix network issue.
<ins>**Documents**</ins>	
**Staging to target**             |	EDI > Documents                       | Business logic issues, for example unmapped order type for the Customer purchase order record. <br> Fix: Add mapping to Order type group
**Process to outbound**           |	EDI > Documents                       |	Document template issues, for example text document type doesn’t have any mappings which results in Empty file. <br> Fix: Assign field mappings to template.


### Setup Reset status profile

Users can access the form by navigating to **EDI > Setup > Reset status profile**.

Various reset status profiles can be created to specify different recurrences. <br>
- Click **New** to create a new record.
- In the **Name** field, enter the name of the Reset status profile group
- In the **Description** field, enter a description of the Reset status profile group
-	Select **Recurrence** and set: <br>
  - End after: Number of retry attempts. <br>
  - Recurrence pattern: Retry interval.

The configured Reset status profiles can be used either in:
- [EDI shared parameters](EDI_SharedParameters.md):
  - **Documents reset status**: Assign default Reset status profile for all staging documents. <br>
  - **Files reset status**: Assign default Reset status profile for all inbound and outbound file. <br>
- Trading partner’s Incoming and Outgoing documents (overrides the default from EDI shared parameters)

### Setup Reset document status periodic task
Users can access the form by navigating to **EDI > Periodic tasks > Reset document status**
Similar to a workflow processing job, set the periodic task to run infinite according to its schedule. An error document is like a workflow task which needs to be processed to it’s assigned reset profile recurrence.

