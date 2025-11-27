---
layout: product-content
header: Item Creation Wizard
toc: true
---

# Data entities

The following is a summary of data entities available for the Item creation module:

## Item creation setup

Item creation> Setup > Item creation > Item Creation Template

| **Order** | **Entity**                                    | **Description**                                                                                     | **Dependency**                                                                      |
| :-------- | :-------------------------------------------- | :-------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------- |
| 1         | Item creation import file masks               | Create new **File mask**. Item creation> Setup > Item creation > Item creation import file masks    |
| 1         | Item creation item status                     | Create new **item status**. Item creation > Setup > Item Setup > item status                        |
| 1         | Item creation template tabs                   | Create new **Tabs**. Item creation > Setup > Item creation > Item creation templates                |
| 2         | Item creation tab translation                 | Create new **Translation**. Item creation > Setup > Item creation > Item creation templates         | Tab Name                                                                            |
| 3         | Item creation parameters                      | Create **Parameters**. Item creation > Setup > Item creation parameters                             | Item Status                                                                         |
| 4         | Item creation templates                       | Create new **Template**. Item creation > Setup > Item creation > Item creation templates            | Template type, Template Name                                                        |
| 5         | Item creation template and team association   | Create new Template **Teams**. Item creation > Setup > Item creation > Item creation templates      | Template Name                                                                       |
| 6         | Item creation template versions               | Create new **Template version**. Item creation > Setup > Item creation > Item creation templates    | Template Name, Version                                                              |
| 7         | Item creation record setup                    | Create new **Template record**. Item creation > Setup > Item creation > Item creation template      | Template Name, Version                                                              |
| 8         | Item creation record templates - multiple     | Create new **Multiple template**. Item creation > Setup > Item creation > Item creation templates   | Template Name, Template Version                                                     |
| 9         | Item creation template attribute defaults     | Create new Template **Attributes**. Item creation > Setup > Item creation > Item creation templates | Template Name, Template Version, Product Attribute, Attribute Type, File Mask       |
| 10        | Item creation template steps                  | Create new **Template steps**. Item creation > Setup > Item creation > Item creation template       | Template Name, Version, Product Attribute , Field Line Number                       |
| 11        | Item creation template fields                 | Create new **Template Fields**. Item creation > Setup > Item creation > Item creation templates     | Template Name, Template Version, Step, Tab Name, Default Attribute Value, File Mask |
| 12        | tem creation template fields - linked fields  | Create new **Template fields**. Item creation > Setup > Item creation > Item creation template      | Template Name, Template Version, Step, Tab Name                                     |
| 13        | Item creation template dimension import setup | Create new **Template dimensions**. Item creation > Setup > Item creation > Item creation template  | Template Name, Template Version, Step, Tab Name, Default Attribute Value            |

Item creation> Periodic tasks > Creation > Item import

| **Order** | **Entity**       | **Description**                                                                 | **Dependency** |
| :-------- | :--------------- | :------------------------------------------------------------------------------ | :------------- |
| 1         | File import data | Create new **item import**. Item creation> Inquiries > Creation import sessions |
