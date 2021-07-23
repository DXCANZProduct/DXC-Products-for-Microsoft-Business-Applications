---
# required metadata

title: [DXC Item Creation Wizard]
description: [DXC Item Creation Wizard - Item Creation Templates  ]
author: [helenho]
manager: Kym Parker
ms.date: 02/03/2021
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

# ms.search.form:  [DXC Item Creation Wizard ]
audience: [Application User]
# ms.devlang: 
ms.reviewer: [helenho]
ms.search.scope: [Which Operations client to show this topic as help for, to be set by content strategist, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
# ms.tgt_pltfrm: 
# ms.custom: [used by loc for topics migrated from the wiki]
ms.search.region: [Global]
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: [helenho]
ms.search.validFrom: [September 2017]
ms.dyn365.ops.version: [name of release that feature was introduced in, see list here: https://microsoft.sharepoint.com/teams/DynDoc/_layouts/15/WopiFrame.aspx?sourcedoc={23419e1c-eb64-42e9-aa9b-79875b428718}&action=edit&wd=target%28Core%20Dynamics%20AX%20CP%20requirements%2Eone%7C4CC185C0%2DEFAA%2D42CD%2D94B9%2D8F2A45E7F61A%2FVersions%20list%20for%20docs%20topics%7CC14BE630%2D5151%2D49D6%2D8305%2D554B5084593C%2F%29]
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
You can reach the header view (button) form by navigating to
**Item creation > Setup > Item creation > Item creation templates > header view (button)**

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

## Steps

A step represents a subset of fields that must be processed before the template can be submitted to workflow. For a manually initiated template there is no limit on the number of steps that can be created. Only a single step is supported when importing records from a .csv file. 

The order of the steps will determine the order in which the information is entered into the template when a template is initiated manually within D365 and processed through the workflow

A new step can be created by selecting to *Add line*.

|  **Field**  | **Description** | 
|:---|:---|     
|  **Step**  | Used to identify the step when the user is creating the product. |  
|  **Selected companies**  | Select if the companies which the product will be released to or updated in will be defined in this step. |  
|  **Attributes**  | Select if item attributes are to be entered for the selected step. Applicable attributes will be determined dynamically based on the selected category hierarchy. | 

*Note:  Select companies and attributes are only applicable to manual template. The fields should be marked no more than once per template.*

###### Fields
**Item creation > Setup > Item creation > Item creation templates > line view (button) > Setup > Fields (Button)**

All tables and fields available from the released products form are available for selection within the item creation templates

1.	From the Item creation template select the **Step** that you want to add **Fields** for. 
2.	Click on the **Fields** button. 
3.	To add a new field, click **New**. 
4.	In the **Tab** field select a template tab. These are the Fast tabs within the Designer form when creating a Product. 
5.	The **Position** will be selected automatically. 
6.	Select the **Table name** where the field resides. 
7.	Select the field you want to add by selecting the **Field label.**
8.	If the field is a **mandatory** field as required by D365 then it will not be possible to deselect the Mandatory check box. It is possible however to make non-mandatory Dynamics AX fields mandatory by selecting this check box. 
9.	Select the **Display only** check box if you want to allow the user to view this field only. 
10.	The **Hidden** check box can be selected to Hide the field within the Template, this reduces the number of fields within the Product creation template designer form and is often used in conjunction with the Default value. 
11.	The **Key field for update** box field is required when importing items. It is the key differentiator to identify if a value will be overwritten or appended to.

Ie. I have an Item coverage group for Site: 1, Warehouse: 11

If I then import a record for Site:2, Warehouse: 24, the above record for Site:1 will be overwritten unless I identify the Warehouse and site as ‘key field for update’ = YES.
Where this is the case, a new record for Site:2, Warehouse: 24 will be created.

12.	Select a **Default value**, this reduces the effort required in order to create a new product and furthermore reduces the complexities and ensures data consistency. You should use this wherever possible but keeping in mind the number of templates. 
13.	To change the **position of the fields** within the Template click on the Field you wish to move and click either the Up or Down button until it is in the desired position. 
14.	If using the **Bulk Import Product Creation** feature the Import file position and the Import file mask must be populated. 

##### Linked Fields

**Item creation > Setup > Item creation > Item creation templates > Lines view (button) > Fields (button) > Linked fields (button)** 

Linked fields allow the user of the item creation templates to populate information into a single field within the creation designer and have this populate subsequent fields automatically. An example of this is the Product Name. If the template specifies that the search name is linked to the product name, the search name will be populated automatically once the user populates the product name. 

1.	Select the **field line record** you wish to populate from, then select **Linked Fields**
2.	Select the **Table and field** that should be updated automatically (populate to). 

Ie. The user will populate the **Product name**, and the **search name** will automatically be populated with the same information. 

3.	Once the template is complete, **activate** the template.

*Note: Linked fields are only automatically populated when the populate from field is updated within the item creation designer. If a populate from field is defaulted in the template, the populate to field will not be populated with this default value.

<br> Note: Linked fields will be ignored when creating items via the bulk import tool as the templates file import can be used to populate multiple fields. Ie. Product Name is populated in File Import position 2. The search name should also be populated from File Import position 2.

<br> Note: Fields that require a new line to be created within the item creation designer will automatically be populated upon creation of the line. Therefore it is important that the template is setup in a logical order. 

<br> Note: Fields that require a new line to be created within the item creation designer (ie. Product Name) can only be linked to other fields within the same table (ie. Description) unless the table is added to the record setup table & once only is selected*

#### Assign Companies

Products in D365 are released to companies for use within those companies.  This function allows the organisation to select the companies which the products that they create or copy to be specified.  The companies selected can be amended at the time of product creation or copy.

**Item creation > Setup > Item creation > Item creation templates > Companies (button)**

1.	Select the **Companies** icon from the Ribbon bar on the Item creation template. 

2.	Select the check box next to the companies that a Product being created using this template will be released to.

3.	Click **OK** once complete.

*Note: Where information such as default order settings are defaulted in a template, it may not be possible to release an item to multiple companies. Where this is the case the **release to new company** template should be configured.*

#### Record Setup

It is possible to further control the item creation process by selecting tables that must have at least one record resulting in a more complete data setup for your products or to simplify the item creation process even further it is possible to change the table from allowing multiple records to only allow one record.  Companies often require just one record and have no requirement for multiple records, it only serves to complicate the setup. 

**Item creation > Setup > Item creation > Item creation templates > Record setup (button)**

*Note: These features are only available on a select number of tables*

1.	Select the **Record setup** icon from the Ribbon bar on the Item creation template.
2.	Click **New** button to create a record.
3.	Select the **Table name.**
4.	Check the **Mandatory** check box to insist on at least one record being added to this Product, failure to add a record at the time of setup will result in a validation error.
5.	Check the **Once only** option to limit the creation of records within this table for the Product being created to one.
6.	To delete the setup, select the relevant record and click the **Delete** button.

#### Assign Teams
**Item creation > Setup > Item creation > Item creation templates > Assign teams (button)**

Teams are used to allow or prevent a group of users from using an Item creation template.  This serves two purposes:

1.	It allows for simplification through the result of reducing the choice.
2.	It prevents the use of the incorrect template which is an additional layer of security. 

*Note: For information on how to create a team please refer to the standard Dynamics 365 Finance and Operations, Enterprise Edition functionality*

3.	Select the  **Assign Teams** icon from the Ribbon bar on the Item creation template.
4.	Select the team from the **Available Teams** pane and use the **Add** button.

*Note: It is possible to access the Creation templates if the user belongs to the administrator group.*
5.	To remove a team from the Item creation template, select the team in the **Assigned Teams** pane and click the Remove button.
6.	Click the **Close** button once complete.

#### Assign Attributes

Attributes in D365 are linked to the Product Category. Therefore, when the ‘attributes’ flag is selected on the step, attributes linked to the selected product category are displayed in the template for population. As an alternative, it is possible to specify default attributes to be displayed within the template. This is particularly useful for an update template where the product category may not be specified. Only attributes that are valid for the selected product category will be populated on the released product. 
You can reach the Default attributes (button) form by navigating to
**Item creation > Setup > Item creation > Item creation templates > Default attributes (button)**

1.	Select the **Default Attributes** icon from the Ribbon bar on the Item creation template.
2.	Click **New** button to create a record. 
3.	Select the **Attribute.**
4.	Specify a **Value** if required.
5.	Specify the **Import file mask**
6.	Specify the Import field position
7.	To delete the setup, select the relevant record and click the **Delete** button.

*Note: Default attributes can only be edited and updated when item creation template is not active. Only attributes that are valid for the selected product category will be populated on the release product regardless of the attributes populated on the import. The attribute template file can hold all available attributes. This may make the management of templates easier to manage as attribute mapping is done once. Any new attributes can be simply added at the end of the template file and mapped respectively. In addition to the default attributes being mapped, the item number must also be mapped for the file mask.*

#### Assign Record Templates

Record Templates can be configured for tables that may have multiple records.  An example of this may be site specific order settings.  Record templates can be used to default this information for multiple sites.
You can reach the  Record templates (button) form by navigating to
**Item creation > Setup > Item creation > Item creation templates > Record templates (button)**

1.	Select the **Record Templates** icon from the Ribbon bar on the Item creation template.
2.	Click **New** button to create a record.
3.	Select the **Table Name**.
4.	Select the **Lines** button.
5.	Specify the information to be populated.
6.	To delete the setup, select the relevant record and click the **Delete** button.
