---
# required metadata

title: Core Extensions
description: Core Extensions - Data Anonymization
author: Peter Musumeci
manager: Kym Parker
ms.date: 2023-10-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: DXCDataAnonymizationParameters, Data anonymization profiles, 
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci

# ms.tgt_pltfrm: 
ms.search.region: CoreUtil
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2023-10-31
ms.dyn365.ops.version: 10.0.34
---

# Data Anonymization
## Data Anonymization Overview

Data Anonymization is a process that allows for information to be scrambled post a database copy or restore from a production into a sandbox environment.  The process can assist in protecting sensitive or personal information like names, bank accounts, addresses and more from people that should or do not require visibility of sensitive data. The process can be used to protect data and confidentiality but still allow necessary third parties access to your environment. 

### Setup Data Anonymization
Data Anonymization is available under the Organization administration menu once the Core extensions feature has been enabled.

The **Data anonymization parameters** page is used to ensure production values are safeguarded. The production URL is entered into the parameters form to prevent any users accidentally scrambling production values. 

1. Navigate to **Organization administration > Setup > Data anonymization > Data anonymization parameters**
2. Insert your production URL into the PROD URL field.
Once completed select Save and close the form.

![Anonymization](/CORE-EXTENSIONS/IMAGES/Anonymization_parameters.png)

### Data anonymization profiles

Data anonymization profiles allows user to set up individual combinations of tables and fields with set combinations of values that that can be saved and reused, streamlining the anonymization process for future requirements. You must create at least one profile to run the anonymization process.
Navigate to **Organization administration > Setup > Data anonymization > Data anonymization profiles**

The following table outlines the fields available in the Data anonymization profiles form, whether the field is mandatory, and some information about the field. If a field is not required to be selected by the user, it can be left blank, unless it is mandatory field.

|  **Field**  | **Mandatory** | **Details** | 
|:---|:---|:---|     
|  **Name**  | Yes | Name of the anonymization profile |  
|  **Description**  | Yes | Unique description for the anonymization profile that will be used to scramble data values. |  
|  **Anonymization table**  | Yes | The D365 Table name that contains the sensitive data . |  
|  **Run across all companies**  | No | When ticked this will apply the scramble values for the selected criteria in all legal entities within the environment. |  
|  **Company**  | Yes | Select the legal entity you wish to run the scramble for.  If “Run across all companies” is ticked this field is no longer mandatory and is greyed out. |  
|  **Data anonymization field**  | Yes | This is then name of the field within your selected Anonymization table that contains the data you wish to. |  
|  **Field label value**  | Yes | This is the common name (a.k.a Friendly name) of the field where the scrambled data will be inserted to replace existing values. |  
|  **Field type**  | Yes | This will automatically populate and display the type of field you are updating data for. Eg String, Integer, Real, etc|  
|  **Scrambled data value**  | No | The value you wish to replace existing data with, eg your scramble value.  While this field is not mandatory consideration should be given to the values used as fields requiring unique indexes or have minimum lengths may generate errors when values are populated. |  
|  **Prefix for scrambled data value**  | No | Inserts a prefix to the scrambled value, currently only company Id is available.<br/><br/>Note: When making use of prefixes, the Run across all companies must be set to No (Unchecked). If it is checked, then the prefix will be ignored and only scramble value will be applied |  


### Initiate data anonymization. 
To initiate data anonymization, you firstly need to create the profile. 
1. Navigate to **Organization administration > Setup > Data anonymization > Data anonymization profiles**
2. Select “New” from the top menu ribbon, fill in Name and Description then click Save from the ribbon bar.
3. on the Data anonymization Table Tab select New to being selecting the relevant table/s from the drop down menu or select from a predefined list of default tables.
4. Select Company or tick Run across all companies to update all legal entities, then save the selection.
   *You can subsequently edit and/or delete tables from the list as required.

5. To add the fields and values to be scrambled Select **Add Fields** to display the field selector for your highlighted Table.
   
 ![Field_Selector](/CORE-EXTENSIONS/IMAGES/Field_Selector.png)

7. Select the fields you want data scrambled in and select **Add** to populate your list or **Remove** to remove from selection.  Once you have selected all fields for this table click **OK** to add them to the main form.
8. Populate the Scrambled data value and select prefix if desired, select Save to confirm changes 
*Repeat this process for all Tables and fields where data is to be scrambled 
populate fields  ![populate fields](/CORE-EXTENSIONS/IMAGES/populate fields.png)

### Load default tables

When selected this function will bring up a list of common System tables and their “friendly/common name” that can be easily added to the anonymisation list. Select the required tables and once completed select **Add tables** to update them into your form. 

![Load_Deault_Tables](/CORE-EXTENSIONS/IMAGES/Load_Deault_Tables.png)

8. Highlight the required Table and Select **Add Fields** to display the field selector for your highlighted Table.
9. Locate and select the fields you want to scramble data for and select **Add** to add them to your list or Remove to remove from selection.  Once all fields for this table have been added click **OK** to add them to the main form 
10. Populate the Scrambled data value and select prefix if you want to populate the scramble data with a prefix.  Select **Save** to move onto the next table 
*Repeat this process for all Tables and fields where data is to be scrambled

Once all Tables and fields have been populated select the **Initiate data anonymisation** button from the ribbon bar and add the scramble job to the batch job processing queue.

If the batch job completes successfully the below is displayed

![Ended](/CORE-EXTENSIONS/IMAGES/Ended.png)

However, if the batch job fails and the anonymisation process does not complete a error batch job is crated for the table. 

![Error](/CORE-EXTENSIONS/IMAGES/Error.png)

To identify the error that has caused the job to fail review the log from the batch tasks form as per standard batch job troubleshooting. 

