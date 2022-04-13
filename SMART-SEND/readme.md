# Frequently Asked Questions

**My report is not supported, can I still use Smart Send?**

While out of the box functionality is for the business forms listed [here](../Overview.md), the solution can be extended on further business forms or reports. The [technical guide](Technical_guide) describes how the DXC Smart Business Form Email Manager solution can be extended by adding custom report.

**How can I use a different report format for different customers/vendors?**

Firstly you need to set up each version of report design in Smart Send Email parameters. For example you may have two report design for the Sales Invoice *SalesInvoice.Report* and *SalesInvoiceModern.Report*. Refer to Smart Send [Parameters](Parameters).

Then using Print Management conditions set a query with a set criteria to use the different report design. When the report is run using Print management or the Smart Send button will choose the report design used per the Print Management setup. Refer to [Print management conditions](Email_processing).

**How can I use a different email template for different customers/vendors?**

The Override email ID and Override file name allows the user to specify in print management an email template and file name different to that specified in Smart Send parameters. Refer to [Override Email Template and Filename](Email_processing).

**How can I use a different filename for different customers/vendors?**

The Override email ID and Override file name allows the user to specify in print management an email template and file name different to that specified in Smart Send parameters. Refer to [Override Email Template and Filename](Email_processing).

**How can I include attachments for all emails, like a terms and conditions?**

Smart Send uses the primary table and the email template to look for additional attachments. If you want to send the attachment on all emails or to a selected group, attach the file to the email template. You can use Print Management Conditions to use Override Email Id (templates) to send different Emails and Attachments to different groups of recipients. Refer to [Override Email Template and Filename,	Print management conditions and Additional attachments](Email_processing).

**How can I use include attachments that are not attached to the primary table or email template?**

Smart Send also includes an extension hook to enable a customer to create an extension class to attach a document handling attached file from another source, for example Purchase/Sales order lines. Refer to the Smart Send [technical guide](Technical_guide).

**How can I use a token placeholder which is not on the primary table?**

Smart Send supports dynamic place holder tags using the table and field names. Similarly, display method can also be used with the format %TableName.MethodName#%. 
If the field you wish to use is not on the primary table, you can add a display method to the table to return the data from another source. Refer to [Dynamic Placeholder Tokens](Email_placeholder).

**Why are the token placeholders showing as the token as opposed to the value e.g. %PurchId%?**

The main reasons this would occur:
* The token placeholder is invalid. The syntax used on the token placeholder is not per the fixed token list for the report or dynamic token is in the incorrect notation e.g. %TableName.FieldName% or %TableName.MethodName#%. Refer to [Dynamic Placeholder Tokens](Email_placeholder).
* HTML is not created using HTML editor. Customers who have not used a html editor, for example creating the html using MS Word experience problems with the token placeholders.

**Can I use images in email body?**

Yes. Although this feature is standard Dynamics 365 email functionality not Smart Send specific. However to achieve this the image must be converted using a base64 encoder to convert the image into html.

**Why are the token placeholders used in the filename are not the same as Dynamics 365 field?**

Placeholder tokens can contain invalid characters being inserted in a filename and therefore Smart Send is unable to create the file. A standard function "GetInvalidFileNameChars" is used to find and replace invalid characters with spaces.

**Can I use Smart Send with Electronic Reporting?**

No. Smart Send uses the standard Dynamics 365 SSRS and Print Management framework and supports both standard SSRS forms and Modern Forms. 

Smart Send does not support Business Documents as it uses the Electronic Reporting Framework which is separate from standard Dynamics 365 report generation using SSRS and Print Management.

It is a matter of assessing the benefits of using the ER framework for report design (which in many scenarios is a one off), against the robust and proven standard Dynamics 365 Reporting together with Smart Send for report distribution.
