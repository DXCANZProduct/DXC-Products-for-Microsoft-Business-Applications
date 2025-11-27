---
layout: product-content
header: Item Creation Wizard
toc: true
---

# Item creation parameters

The Item creation parameters form is used to manage the item status behaviour and ensure that all products receive a status.  
You can reach the parameters form by navigating to **Item creation > Setup > Item creation parameters**

## General

| **Field**                                         | **Description**                                                                       |
| :------------------------------------------------ | :------------------------------------------------------------------------------------ |
| **Delete product dimension value with a variant** | What should happen when a product dimension value with an existing variant is deleted |

## Item status

| **Field**                  | **Description**                                                                                                                                                                                                                                                                       |
| :------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **Status control enabled** | Controls the allowed transaction types as configured on the [item status](ITEM-SETUP/Item-Status.md). When enabled, only allowed transactions for items with the item status can occur. If this is disabled all transaction will be available regardless of item status configuration |
| **Default item status**    | Item status value applied to new items created without using an item creation template                                                                                                                                                                                                |

Note: The _Default item status_ will be setup at the item level.
