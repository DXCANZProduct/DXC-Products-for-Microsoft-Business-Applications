---
# required metadata

title: DXC Solutions for DocuSign and Dynamics 365
description: Field Types
author: pmusumeci
manager: Kym Parker
ms.date: 2023-11-12
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  SAB_DSTemplate
audience: Application User
# ms.devlang: 
ms.reviewer: pmusumeci
# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: IconDocuSign 
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: pmusumeci
ms.search.validFrom: 2023-11-12
ms.dyn365.ops.version: AX 7.0.1
---

# Types of fields

## Signature. 
New users first confirm their signing name and initials, and then select a signature style. When they adopt their signature, it is applied to the signing field. Otherwise, the signature is applied with a single click. Easy! The signing name is the name as you entered it when you added the recipient to your document. Default: Required
Initial. Just like signing, new users first adopt a signature, and then their initials are applied to the document.

## Date Signed. 
This field is automatically filled in with the current date. Your account administrator can set the format of the date for all documents sent from your account, in the Signing Settings set for your account. The format can include a time stamp.

## Text. 
This is a free text field for data. By default, the text field accepts any characters. Enter a value in the Character Limit setting of the Add Text property to restrict the number of characters the recipient can enter. Set a Formatting property to hide text with asterisks, and conceal the signer's data entry from anyone viewing the document. Or select the Fixed Width option to restrict the field to a set size. Use the Validation property to restrict the data entry in the field to a specific format, such as an email address or a social security number. Place the field on your document and select it. In the field properties pane, expand the Validation section, click the drop down, and select the validation format for the field.

## Name. 
This name field supports three formats: First Name, Last Name, or Full Name. For First Name, the first word of the name is used. For Last Name, the last word of the name is used.
Depending on the format you choose, the field automatically populates with the recipient's name, or portion of the name, as you entered it when you added the recipient to your envelope. If the recipient changes their name when they adopt their signature, the Name field updates to reflect the new name.

## Company. 
This field automatically populates with the recipient's company name as specified in the Customer/Vendor account. 

## Title. 
This will prompt the user to complete thier title information in a displayed text box at the nominated coordinates.

## Email. 
This field automatically populates with the recipient's email address.

Checkbox. This is a standard, square box for recipients to select one or more options. You can add a single box or a group of multiple boxes. A checkbox group can include a validation rule to enforce how many checkboxes in the group your signer must select. Checkboxes can be required or optional, but if you apply validation that requires the signer to select a certain number of boxes, then the field becomes required. Learn more...
Tip: If you have a scenario where your recipient must mark to indicate explicit agreement, use a single checkbox and select the Required Field option.
Radio Buttons. Radio buttons provide options from which recipients can select only one response. Radio buttons are placed as a group, and you can add, remove, or position the individual buttons.
When you add a radio button field, the group contains two options. Click the "+" icon to add an option to the radio group.


Radio buttons have the following unique properties:

Group Label. This label identifies the radio button group. It is not shown to recipients but is included with the envelope form data.
Radio Button Values. Values for each radio button. These values are shown to recipients and the selected value is included when you download form data for the document. In order to collect meaningful data from radio button selections by the recipient, enter unique and representative values for each radio button. On the completed PDF, only the selected option remains, appearing as an "x". Default values: "Radio1" "Radio2"
Group Tooltip. Add an optional tooltip text to show to recipients when they hover over or select a radio button.
Radio buttons, as a group, can be required or optional. If you set the Required Field property, your recipient must select one of the options in order to finish signing. Default: Required

If you have a scenario where your recipient must mark to indicate explicit agreement, use a single checkbox with validation.
