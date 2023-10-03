---
# required metadata

title: Smart Send
description: Smart Send - Roadmap
author: pmusumeci
manager: Kym Parker
ms.date: 2023-07-27
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  
audience: Application User
# ms.devlang: 
ms.reviewer: pmusumeci
# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: pmusumeci
ms.search.validFrom: 2023-07-27
ms.dyn365.ops.version: AX 7.0.1
---

# 	Roadmap 

This page describes the features planned for future releases.

> Note: Dates and features are subject to change.

## Roadmap

Coming Soon
<ins>Bug fixes</ins>

#### New Build 10.0.34

Number	  | Name	          | Description
:--       |:--              |:--
12885	    | Sales agreement - Confirmation issues error TTSBEGIN/TTSCOMMIT| When posting a Confirmation on Sales agreement form and you set print to Yes, the “TTSBEGIN/TTSCOMMIT” error will no longer be displayed.
13553	    | Final recipient missing semicolon in email address| When using the "Both" Selection under recipient for purchase order confirmations the final recipient would not have the semi colon prior to the email address. With this correction all email recipients are formatted correctly, and emails are delivered as per standard behavior.  
13707	    | Error on customer payment journal when processing Smart Send Email | When making multiple payments to a single Customer account in the customer payment journal only the first line will process the correct attachment.  This has now been corrected and each individual line will send to the related Smart Send contacts with the correct attachment.
14831	    | Centralized payment only utilized set up from creation legal entity | When utilizing the Centralized Payment Functionality for Vendor Payment Journals Smart Send would utilize set up from the current legal entity.  This has been updated and centralized payment now can utilize Smart Send templates from multiple legal entities when making centralized vendor payments.
13707	    | Smart Send does not recognize difference between free text invoice and customer invoice on Invoice Journal | When issuing a Free Text Invoice utilizing the Tax Invoice Journal (Accounts receivable>Enquiries and reports> Invoices >Invoice Journal) a "Report is not setup for Smart Send" Error would appear if the Legal entity did not have a Customer Invoice report set as well.  This has been corrected and both Free text and Customer Invoice can be issued with independent templates.
16073	    | The BankPaymAdviceVendController class has become obsolete by Microsoft in version 10.0.37 and mandatory in 10.0.34 | Smart Send now will only support BankPaymAdviceVendController V2.  Activate “Enable batch processing for bank payment advice reports” via Feature management if not auto enabled.   This feature lets you use batch processing for both the customer and vendor bank payment advice reports. To use this feature, you must use BankPaymAdviceVendV2 and BankPaymAdviceCustV2 bank payment advice, and set them up as the customer and vendor report formats in print management.

![BankPaymAdviceVendV2Report](IMAGES/BankPaymAdviceVendV2Report.png)


<ins>New features</ins>

Number	  | Name	          | Description
:--       |:--              |:--
9233	    | Additional fields in organizational email template data entity| Additional fields have now been added to the Organization email template Data Entity to incorporate the To, CC and BCC fields from the Smart Send email templates.
9483	    | Company logo placeholder for email template| You can now incorporate your company logo into your Smart Send email template.  Note you must use Tag "<img src="data:image/bmp;base64,%CompanyLogo%" alt="logo"/>" to render image correctly.
9735	    | rich html editor | New ability to use HTML editor when building content for Smart Send email templates.
12731	    | Additional placeholders | 2 additional placeholders have been added. For Purchase order confirmation (PurchTable.PurchName) %VendorName% For Sales order Confirmation (SalesTable.SalesNAme) %CustomerName%
14174	    | key vault is now in drop down menu | key vault has now been updated to a drop-down menu.  Azure Blob storage will be deprecated in the future. Date to be announced. 
14961	    | change to PRINTER DESTINATION IF NO SMART SEND RECIPIENT FOUND| When no Smart send recipient has been selected you now have the option to set documents to not print.  This setting works in conjunction with the Save to Azure Storage options and Alternate Email in email parameters. When “do not print” is enabled documents are not routed if no recipient is found.  By Default, this field is set with no option (Blank) which follows standard Smart Send logic and allows for both Azure storage or Alternate Email delivery.  “Do not print” if enabled will override alternate email and azure storage options and document will not be routed.  Only occurs if no smart send recipient found.

![Override_print_destination](IMAGES/Override_print_destination.png)

