---
layout: product-content
header: Core Extensions
toc: true
---

# Data Anonymization (Currently in Preview stage, under development)
Please note all features outlined below are considered to be under  preview  and may be subject to change or further development 

## Data Anonymization Overview

Data Anonymization is a process that allows for information to be scrambled after a database copy or when restored from production into a sandbox environment.  The process can assist in protecting sensitive or personal information like names, bank accounts, addresses and more from people who should or do not require visibility of sensitive data. The process can be used to protect data and confidentiality but still allow necessary third parties access to your environment. 

### Enable-Feature

Data Anonymization has a separate Feature Key from Core extensions and is licensed as an individual product from Release 10.0.36.20240530. It must be enabled via Feature management in addition to the [Core Extensions](../Release-notes#feature-management) Feature Key. 
To Utilise Data Anonymization Enable the following feature in D365 Feature management:

- Core Extensions - Data anonymization

Press **Check for updates** to refresh the feature management list if the above feature is not visible.

Once Enabled,  the Data Anonymization Menu is visible  under the Organization Administration module.  Navigate to **Organization administration > Setup > Data anonymization**

## Setup Data Anonymization

### Data anonymization parameters
The **Data anonymization parameters** page is used to ensure production values are safeguarded. The production URL is entered into the parameters form to prevent  users from accidentally scrambling production values. 

1. Navigate to **Organization administration > Setup > Data anonymization > Data anonymization parameters**
2. Insert your production URL into the PROD URL field.
Once completed select Save and close the form.

![Anonymization](../IMAGES/Anonymization_parameters.png)


### Data anonymization profiles

Data anonymization profiles allow users to set up individual combinations of tables and fields with set combinations of values that can be saved and reused, streamlining the anonymization process for future requirements. You must create at least one profile to run the anonymization process.
Navigate to **Organization administration > Setup > Data anonymization > Data anonymization profiles**

The following table outlines the fields available in the Data anonymization profiles form, whether the field is mandatory, and some information about the field. If a field is not required to be selected by the user, it can be left blank, unless it is a mandatory field.

|  **Field**  | **Mandatory** | **Details** | 
|:---|:---|:---|     
|  **Name**  | Yes | Name of the anonymization profile |  
|  **Description**  | Yes | Unique description for the anonymization profile that will be used to scramble data values. |  
|  **Anonymization table**  | Yes | The D365 Table name that contains the sensitive data. |  
|  **Table Label**  | N/A | This is the label given to the Table that is visible within the User Interface, sometimes referred to as a friendly name.  This field is displayed when  the Anonymization Dropdown is selected and will populate when you nominate the requested Table.    |  
|  **Run across all companies**  | No | When ticked this will apply the scramble values for the selected criteria in all legal entities within the environment.  In some cases where a table is global, this field is required to scramble data successfully |  
|  **Company**  | Yes | Select the legal entity for which you wish to run the scramble.  If “Run across all companies” is ticked this field is no longer mandatory and is greyed out. *Note:* When a Global Table is selected,  data in all legal entities can be impacted |  
|  **Data anonymization field**  | Yes | This is the name of the field that contains the data within your selected  table |  
|  **Field label value**  | Yes | This is the field's common name (a.k.a Friendly name) where the scrambled data is stored.  This is commonly what is seen by users within the user interface |  
|  **Field type**  | Auto | This will automatically populate and display the data input type into this field. Eg String, date <br> Fields of Type VarString is a variable length field and does not allow data types other than Random |  
|  **Is randomized**  | No | When enabled this field allows users to have Random Data, with various formats available,  generated per record. If not enabled the **Scrambled Data Value Type** will default to *custom* and will require a value to be specified |  
|  **Scrambled data value Type**  | No | This field allows you to select the format the scrambled data will take. Currently you can choose from <br> • Full Name <br> • First Name <br> • Middle Name <br> • Last Name <br> • Suffix <br> • Email <br> • Street Name <br> • Address <br> • City <br> • Zip Code <br> • State <br> • Company Name <br> • Random, which generates a randomised data string <br> • Title Id can be used to generate unique worker and employee Titles for the purpose of scrambling worker history  <br>
|  **Scrambled data value**  | No | If you select *Custom*  in **Scrambled Data Value Type** the user must input a value that will be utilised for all records in the specified field, that are being Anonymized.  However, if **Is randomized** is enabled the value displayed is a sample that will be used based on the selection made in **Scrambled data value Type**
|  **Prefix for scrambled data value**  | No | Inserts a prefix to the scrambled value, currently only company ID is available.<br/><br/>Note: When making use of prefixes, the Run across all companies must be set to No (Unchecked). If it is checked, then the prefix will be ignored and only the scramble value will be applied |  


### Initiate data anonymization. 
To initiate data anonymization, you first need to create the profile. 
1. Navigate to **Organization administration > Setup > Data anonymization > Data anonymization profiles**
2. Select “New” from the top menu ribbon, fill in Name and Description then click Save from the ribbon bar.
3. on the Data anonymization Table Tab select New to select the relevant table/s from the drop-down menu or select from a predefined list of default tables using the *Load default tables* option.
4. Select Company or tick *Run across all companies* to update all legal entities, then save the selection.
   *You can subsequently edit and/or delete tables from the list as required.

5. To add the fields Select **Add Fields** to display the field selector for your highlighted Table.
   
 ![Field_Selector](../IMAGES/Field_Selector.png)

7. Select the fields you want data scrambled in and select **Add** to populate your list or **Remove** to remove from the selection.  Once you have selected all fields for this table click **OK** and they will appear in the *Data anonymization fields* FastTab

*Repeat this process for all Tables and fields where data is to be scrambled

### Load default tables

When selected this function will bring up a list of common System tables and their “friendly/common name” that can be easily added to the anonymisation list. Select the required tables and once completed select **Add tables** to update them into your form. 

![Load_Deault_Tables](../IMAGES/Load_Deault_Tables.png)

### Populating Data

Once all fields have been added to the Data anonymization fields FastTab begin selecting the type of Data you want populated as outlined in  *Data anonymization profiles*

Selecting Is randomized allows you to choose the data value type from the drop-down list of available formats and apply this individually to each record within that field to generate unique records

When *Is randomized* is unticked the *Scrambled data value type* will default to Custom and requires the Scrambled data value to be populated manually, which subsequently applies to all records


Once all Tables and fields have been populated select the **Initiate data anonymisation** button from the ribbon bar and add the scramble job to the batch job processing queue.

### Batch Processing

When A batch process is initiated a runtime task is created with any associated description the user has provided for the task as well as a separate batch job/Task for each table that has been requested.  If All tables and fields are updated successfully  the user-initiated runtime task/job  status will be updated to ended

However, if a table cannot be updated a separate batch job identifying the Table (eg Process data anonymization for Customers table) will have an error status with a log of the error that can subsequently be reviewed.



