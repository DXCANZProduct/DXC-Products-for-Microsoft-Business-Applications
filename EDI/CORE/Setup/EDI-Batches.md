---
# required metadata

title: EDI Core
description: Setup EDI Batches
author: jdutoit2
manager: Kym Parker
ms.date: 2022-03-30
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_EDIBatchControlGroup, SAB_EDIExportBatchJobs
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

# EDI Batches

D365 batches provide the ability to schedule the various processes involved with the EDI module. To reduce the number of batches and simplify the configuration and maintenance a batch control group form has been provided in which the EDI batch groups can be controlled from.

The EDI module process flow is made up of 5 basic steps:

| **Process**            				| **Description**                                                                                                                             	|
|------------------------------------------	|-------------------------------------------------------------------------------------------------------------------	|
| <ins>**Inbound documents**</ins>  	|                                                                                                                                             	|
| **Import**                 			| Files   are retrieved and imported into the modules inbound file staging area                                                          	 	|
| **Process to staging**     			| Files in the inbound file staging area are read and transformed based on the templates <br>into the EDI document type staging tables    			|
| **Process to target**      			| The EDI document type staging tables are processed to their target D365 documents and <br>business functions are performed.                     	|
| <ins>**Outbound documents**</ins> 	|                                                                                                                                             	|
| **Process to outbound**    			| EDI document type staging table records are processed based on the templates and files are <br>generated into the outbound file staging area    	|
| **Export**                 			| Files in the outbound file staging area are exported.                                                                                 		|

Each of these steps has a batch job that can be scheduled to automate it. Each of these batch jobs is run per company or multiple companies; and will run over all enabled EDI document types. 
This has the following advantages:
- Different companies can have different batch schedules/frequencies and can be turned on or off separately
- Different alert rules can be applied to different companies
- Without reconfiguring or even stopping a batch job, individual document types can be enabled or disabled


Users can access the form by navigating to **EDI > Setup > Batch control group**.
- Select **New** to create a new batch group
- Enable the applicable company/s the batch group applies to. The current legal entity is automatically enabled. Users can also use Enable all or Disable all.

For each of the 5 steps above, a separate fast tab will be displayed.  For each step:
- Option 1: Select Enable for each of the Documents and Connection types you would like to create a batch for, then select **Batch > Create Batch**
- Option 2: Alternatively for all licensed documents, select **Batch > Create Batch**
- Enter the description of the batch in the **Caption** field
- Select the **Batch group**
- If you began setting up batch control with Option 2, select **Enable all documents** to setup up batch control for all licensed documents
- Import and Export batch: Select the applicable File transfer type (connection type) or leave blank if applies to all connection types.
- Update **Recurrence** and **Alerts** as required
- Select **Create Batch**
- Once the batches are created, documents and connection types can be enabled or disabled manually.
- To view the batch, select **Batch > View batch**
- Import and Export batch has to the option to create multiple batches on Batch control

## **Maintain Batch Control**

Ongoing maintenance is an important aspect of D365 batches. The batch control form provides a status on the header of each fast tab as well as a link to the underlying batch job in the standard D365 form in which the standard batch logs can be found and updated.

## Export batch jobs
Outbound staging records can be created either by:
1.	**Send to EDI** is set to _Yes_ when posting the D365 source transaction, or
2.	**Change tracking** is utilised to determine if there are new records for the EDI document type. These documents require the **Export batch jobs** to create the outbound staging record based on the required recurrence.

The following section will describe the setup required for scenario 2.

### Create outbound records manually 
Users can access the form by navigating to **EDI > Periodic tasks > Export batch jobs**.

Create a new Export batch job by:
-	Select **New batch job**
-	Select the **Company**
-	Select the **EDI document type**
- Select the **Trading partner**, where relevant
- Set the **Recurrence**
- Select **OK**

