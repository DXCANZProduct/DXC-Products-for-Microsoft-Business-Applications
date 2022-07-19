---
# required metadata

title: DXC Item Creation Wizard
description: DXC Item Creation Wizard - Item Creation Templates  
author: helenho
manager: Kym Parker
ms.date: 2021-03-02
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata
ms.search.form:  DXCICCreationTemplateTableListPage
audience: Application User
# ms.devlang: 
ms.reviewer: helenho
# ms.tgt_pltfrm: 
# ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Item creation templates

Use this feature to set up all your item creation templates and their respective values and requirements.  For example, you could set up a template per product type, in an apparel organisation this may be menswear / womenswear or shirts / dresses, in a toy manufacturer this could be wooden / metal or by age group etc...  

Getting the right balance between auto-completing as many fields as possible versus the number of templates is critical to the success of the ease of use.  As a rough guide between 10 and 50 templates is a sensible quantity.

You can reach the Item creation templates form by navigating to **Item creation > Setup > Item creation > Item creation templates**.

## Create a new template

1.	Click the *New* template button. 
2.	Enter a short *Template* name to identify what the template is used for. 
3.	In the *Description* field, type a detailed description for your template. 
4.	Select the *Number sequence code* that this product will be given. If you choose to leave this blank, then the standard product number sequence will be used. 

    *Note: This number can be renamed later if this is a product design product only. This is useful for some organisations who may use a design Id until the ‘design’ becomes approved where upon the temporary number is changed into the go to market product number.* 

5.	The *Template type* has the following options: 

|  **Template type**  | **Purpose** | 
|:---|:---|     
|  **Create**  | Used to create a new product. |  
|  **Update**  | Used to update an existing product. |  
|  **Copy**  | Used to create a new product using details from an existing product. |  
|  **Release to new company**  | Used to release an existing product to another legal entity. |  

6.	Select the *Product subtype*.
7.	Select the *Status* of the product once the template has been used. 
8.	Select one or more *Assign teams* to limit visibility of the template to selected users
9.	Click *OK* to create the template

## Template header
The header view within the item creation templates form is used to control or view the version of the template created. 
You can reach the header view (button) form by navigating to **Item creation > Setup > Item creation > Item creation templates > header view (button)**.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Template name**  | Set on template creation. |  
|  **Template type**  | Set on template creation. |  
|  **Product subtype**  | Set on template creation. |  
|  **Version**  | Versions allow the same template to be used but with an update, a new version number is generated. |  
|  **Number sequence code**  | Set on template creation. |
|  **Description**  | Set on template creation. |  
|  **Active**  | Is the template active. Only templates that have been activated are available for use. |
|  **Status**  | Set on template creation. |  
|  **Barcode creation**  | Select the method for barcode creation. |
|  **Bar code setup**  | If *Use barcode mask* is selected as the method of barcode creation, specify the mask to be used. |
|  **Unit**  | Specify the unit of measure that should be used for the barcode creation. |
|  **Folder name**  | File path within the *input* folder. |  
|  **Separator**  | The separator that is used to distiguish fields within the .csv import file. |  
|  **Header rows**  | The number of rows containing header information in the import file/s. The header row will be excluded during import. |  
|  **Update product number position**  | Applicable to the ‘Update’ template type. This field should be used in conjunction with a manual number sequence and will allow the item number to be updated. |  
|  **Clear field value**  | Applicable to the 'Update' template type. Including this value in a import field will remove the current value in the fieldd. |  
|  **Bar code setup**  | Allows you to select the type of barcode (ie. EAN13, UPC etc.) that should be used to create the GTIN. |

*Note:  Once a template has been activated, no further modifications can be made.  To make a change, a new version must be created.*

#### Assign Companies

Products in D365 are released to companies for use within those companies. This function allows the organisation to default the company or companies into which the products being created or copied will be released. The companies selected can be amended by the user creating the product if the step being undertaken has had the *Select companies* field marked. The list if company values can be accessed from the action pane of the template at **Item creation > Setup > Item creation > Item creation templates > Set up > Companies (button)**.

Where information being entered against the product is company specific, it may not be possible to release an item to multiple companies on creation. Where this is the case the *release to new company* template should be configured to allow update to a value accepted in the other companies. 

#### Record Setup

It is possible to further control the item creation process by selecting tables that must have at least one record resulting in a more complete data setup for your products or to simplify the item creation process even further it is possible to change the table from allowing multiple records to only allow one record.  Companies often require just one record and have no requirement for multiple records, it only serves to complicate the setup. Record setup can be accessed from the action pane at **Item creation > Setup > Item creation > Item creation templates > Set up > Record setup (button)**.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Table name**  | Select from available tables to enforce the below rules. |  
|  **Mandatory**  | Requires that at least one record be entered into the selected table, else validation cannot be completed. | 
|  **Once only**  | Prevents the entry of multiple records for the selected table. Fields previously visible as part of a table will appear as a stand alone field. | 

*Note: These features are only available on a select number of tables*

#### Assign Teams

Teams are used to allow or prevent a group of users from using an Item creation template. A user must be included in at least one of the teams assigned to the template to be able to select it during the creation process. This serves the duel purpose of simplifying list of available templates and reducing the likelihood that an incorrect template is selected. Teams can be assigned from the action pane at **Item creation > Setup > Item creation > Item creation templates > Assign teams (button)**.

The configuration of teams is managed from within the [Oranization administration](https://docs.microsoft.com/en-us/dynamics365/fin-ops-core/fin-ops/organization-administration/organization-administration-home-page?toc=/dynamics365/finance/toc.json) module. This form can be accessed from **Organization administation > Organizations > Teams**.

*Note: It is possible to access the all creation templates if the user has system administrator privileges.*

#### Default Attributes

Attributes in D365 are linked to the Product Category. When the *attributes* flag is selected on a step, attributes linked to the selected product category are displayed in the template for population. As an alternative, it is possible to specify default attributes to be displayed within the template. This is particularly useful for an update template where the product category may not be specified. Only attributes that are valid for the selected product category will be populated on the released product. You can reach the Default attributes from the action pane at **Item creation > Setup > Item creation > Item creation templates > Set up > Default attributes (button)**.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Attribute**  | The attribute being referenced. |  
|  **Data type**  | Characteristic of the selected attribute, cannot be edited. |  
|  **Attribute type**  | Characteristic of the selected attribute, cannot be edited. |  
|  **Import file mask**  | Identifies the column of the imported file in which the field value can be found. |  
|  **Import file position**  | Identifies the file that the values can be found in. |  
|  **Value**  | Default value to be applied where the attribute is applicable to the product. The field will vary based on the data type of the attribute. |  

*Note: Default attributes can only be edited and updated when item creation template is not active. Only attributes that are valid for the selected product category will be populated on the release product regardless of the attributes populated on the import. The attribute template file can hold all available attributes. This may make the management of templates easier to manage as attribute mapping is done once. Any new attributes can be simply added at the end of the template file and mapped respectively. In addition to the default attributes being mapped, the item number must also be mapped for the file mask.*

#### Assign Record Templates

Record Templates can be configured for tables that may have multiple records. An example of this may be coverage groups. Record templates can be used to default this information for multiple sites or warehouses. You can reach record templates from the action pane by navigating to **Item creation > Setup > Item creation > Item creation templates > Set up > Record templates**.

After selecting the table to create the records for, the user can select *lines* from the action pane and proceed to create multiple records for the selected table.


## Steps

A step represents a subset of fields that must be processed before the template can be submitted to workflow. For a manually initiated template there is no limit on the number of steps that can be created. Only a single step is supported when importing records. 

The order of the steps will determine the order in which the information is entered into the template when a template is initiated manually within D365 and processed through the workflow.

A new step can be created by selecting to *Add line*. 

|  **Field**  | **Description** | 
|:---|:---|     
|  **Step**  | Used to identify the step when the user is creating the product. |  
|  **Selected companies**  | Select if the companies which the product will be released to or updated in will be defined in this step. |  
|  **Attributes**  | Select if item attributes are to be entered for the selected step. Applicable attributes will be determined dynamically based on the selected category hierarchy. | 

*Note:  Select companies and attributes are only applicable to manual template. The fields should be marked no more than once per template.*

#### Export template

On selecting to *export template* a file will be downloaded locally based on the file masks and positions defined within the steps and in the *default attribute*. The export will either be a csv file where a single file mask has been used, or a compressed folder containing many csv files where multiple file masks have been set.

All fields referencing a file mask must have a file position defined for a template to be successfully exported.

## Fields

Each field included in the template represents a field All tables and fields available from the released products form are available for selection within the item creation templates. Fields can be accessed from a step by navigating to **Item creation > Setup > Item creation > Item creation templates > line view > Steps > Fields (Button)**.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Tab**  | The fast tab the field will be included in when using the designer. See [Item creation template tabs](Item-creation-template-tabs). |  
|  **Position**  | The order fields will appear within the tab. |  
|  **Table name**  | The table name where the field being populated or updated resides. |  
|  **Field label**  | The field being populated or updated. |  
|  **Mandatory**  | Will make the field mandatory when using the template. System mandatory field will already be marked and cannot be deselected. |  
|  **Display only**  | The field will be visible to the user, however the contents cannot be updated. |  
|  **Hidden**  | The field is included in the template, however will not be visible to the user in the designer. |  
|  **Key field for update**  | Used when importing records into an update template to determine if a record should be updated or inserted  |  
|  **Default value**  | This value will be applied to all uses of the template unless an alternative value is provided. Recommended to streamline creation and ensure data consistancy. |  
|  **Import file position**  | Identifies the column of the imported file in which the field value can be found. |  
|  **Import file mask**  | Identifies the file that the values can be found in. |  

#### Key field for update

Key field for update is related to the template type of *update* and is intended for use with tables that allow for multiple records to be created. This feature allows for determination of whether the record in the template is updating the table by updating an existing record or inserting a new record.

Fields marked as a key field for update are compared against records already existing in the table and where a imported record matches on all marked fields, the matching record is updated. If any of the fields do not match, a new record will be inserted into the table. 

#### Financial dimension setup

Creation templates can be used to create or update financial dimension values against a released product. To enable this in the action pane, the *dimension* field (Items table) must be added to the template and actively selected.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Dimension name**  | The financial dimension type. |  
|  **Default value**  | The default value for the selected financial dimension, optional. |  
|  **Import file position**  | Identifies the column of the imported file in which the field value can be found. |  

##### Linked Fields

Linked fields allow the user of the item creation templates to populate information into a single field within the creation designer and have this populate subsequent fields automatically. An example of this is the Product Name. If the template specifies that the search name is linked to the product name, the search name will be populated automatically once the user populates the product name. 

The form should be accessed by selecting the field into which the data will be entered, the tables and fields that will be populated with the value can then be selected. This can be selected at **Item creation > Setup > Item creation > Item creation templates > Steps > Fields > Linked fields **. 

This feature is not supported when importing csv files, the same outcome can be achieved by entering the same *import file position* against the fields that will be populated with the same information.

*Note: Linked fields are only automatically populated when the populate from field is updated within the item creation designer. If a populate from field is defaulted in the template, the populate to field will not be populated with this default value.

