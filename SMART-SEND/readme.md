# Frequently Asked Questions

**My report is not supported, can I still use Smart Send?**

While out-of-the-box functionality is for the business forms listed [here](Overview), the solution can be extended to further business forms or reports. The technical guide describes how the DXC Smart Business Form Email Manager solution can be extended by adding a custom report.

**How can I use a different report format for different customers/vendors?**

Firstly you need to set up each version of the report design in Smart Send Email parameters. For example, you may have two report designs for the Sales Invoice *SalesInvoice.Report* and *SalesInvoiceModern.Report*. Refer to [Smart send parameters](CONFIGURATION/Parameters.md).

Then using Print Management conditions set a query with a set of criteria to use the different report design. When the report is run using Print Management the Smart Send button will choose the report design used per the Print Management setup. Refer to [Print management conditions](PROCESSES/Email-processing.md).

**How can I use a different email template for different customers/vendors?**

The Override email ID and Override file name allow the user to specify in print management an email template and file name different to that specified in Smart Send parameters. Refer to [Override Email Template and Filename](PROCESSES/Email-processing.md).

**How can I use a different filename for different customers/vendors?**

The Override email ID and Override file name allow the user to specify in print management an email template and file name different to that specified in Smart Send parameters. Refer to [Override Email Template and Filename](PROCESSES/Email-processing.md).

**How can I include attachments for all emails, like terms and conditions?**

Smart Send uses the primary table and the email template to look for additional attachments. If you want to send the attachment on all emails or to a selected group, attach the file to the email template. You can use Print Management Conditions to use Override Email ID (templates) to send different Emails and Attachments to different groups of recipients. Refer to [Override Email Template and Filename](PROCESSES/Email-processing.md),	[Print management conditions and Additional attachments](PROCESSES/Email-processing.md).

**How can I include attachments that are not attached to the primary table or email template?**

Smart Send also includes an extension hook to enable a customer to create an extension class to attach a document handling attached file from another source, for example, Purchase/Sales order lines. Refer to the Smart Send [technical guide](TECHNICAL-GUIDE/Technical-guide.md).

**How can I use a token placeholder which is not on the primary table?**

Smart Send supports dynamic placeholder tags using the table and field names. Similarly, the display method can also be used with the format %TableName.MethodName#%. 
If the field you wish to use is not on the primary table, you can add a display method to the table to return the data from another source. Refer to [Dynamic Placeholder Tokens](CONFIGURATION/Email_placeholder.md).

**Why are the token placeholders showing as the token as opposed to the value e.g. %PurchId%?**

The main reasons this would occur:
* The token placeholder is invalid. The syntax used on the token placeholder is not per the fixed token list for the report or the dynamic token is in the incorrect notation e.g. %TableName.FieldName% or %TableName.MethodName#%. Refer to [Dynamic Placeholder Tokens](CONFIGURATION/Email_placeholder.md).
* HTML is not created using an HTML editor. Customers who have not used an HTML editor, for example creating the HTML using MS Word experience problems with the token placeholders.

**Can I use images in the email body?**

Yes. Although this feature is standard Dynamics 365 email functionality not Smart Send specific. However, to achieve this the image must be converted using a base64 encoder to convert the image into html.

**Why are the token placeholders used in the filename not the same as Dynamics 365 field?**

Placeholder tokens can contain invalid characters being inserted in a filename and therefore Smart Send is unable to create the file. A standard function "GetInvalidFileNameChars" is used to find and replace invalid characters with spaces.

**Can I use Smart Send with the Email Body feature in Print management?**

When sending a document via email, a basic email body can be included thanks to the *Document Report email body* functionality, which was enabled by default starting with version 10.0.39.  This is a different feature from Smart Send that creates dynamic, transaction-based email templates using the Organization email templates. 

**How do I send my confirmation to the contact on my order instead of the main contact on the account ?**
From the Recipient drop down menu in Email Parameters, simply select "Specific" for the nominated report.  This will use the email address specified on the sales order header or purchase order header.


### Blob Storage Errors

**When sending my file via Smart Send I get "Message: The specified blob already exists."**

This message indicates that the file name alreday exists in your blob storage location.  If you have the Overwirte radio button in your email parameters set to "No",  files are not automatically over written when saving to blob storage and an error is thrown to indicate as such.  


### Dependency and Security Information

Data stored securely inside Finance and operations

DXC Smart Business Form Email Manager for Microsoft Dynamics 365 Finance and Operations (Smart Send) makes use of the existing email configuration influenced by a combination of administrator configuration, user configuration, and user choices.

The article ⁠[Configure and send email](https://learn.microsoft.com/en-us/dynamics365/fin-ops-core/dev-itpro/organization-administration/configure-email) by Microsoft is divided into sections for administrators and users to make it easy to find relevant information, including setup for SMTP. The behaviour of the email subsystem is influenced by a combination of administrator configuration, user configuration, and user choices.

Note: DXC does not collect or store any usage information, or telemetry against any other installed system or ISV module from DXC Smart Business Form Email Manager for Microsoft Dynamics 365 Finance and Operations (Smart Send)
