---
layout: product-content
header: Solutions for DocuSign and Dynamics 365 (DocuSign)
toc: true
---

# Print Management

Within the print management forms in standard D365, users will be able to set documents to utilize Docusign as the default output location. On the **Print Management** form, a new destination has been added to the relevant documents, called _Docusign_. This destination must be used in order to set the email addresses that will be used for document recipients.

Within the Printer Settings for Print Management, the _Docusign_ option will allow you to set the following:

- **To** - The email address for the document signatories. Docusign will identify the order of the signatories in this field. The first email entered here will be associated with first signatory set in the **Templates** form. Each subsequent email in this field will be assigned to each of the subsequently defined signatories.
- **CC** - The email address for the CC of the document signatories.
- **Subject** - Enter the subject line that will be used for the document.

In addition to being able to hard-code email addresses into the **To** and **Cc** fields, users have the option of setting the email address to an external **Purpose** or an internal **Worker title**. The **Purpose** field provides a drop-down of the Roles associated to Customers or Vendors contacts. These are set on the **Customer** or **Vendor** pages, respectively. The **Worker title** field is a drop-down of the all of the availabe **worker titles** in the Employee setup forms. The **worker title** is set on each employee record.
