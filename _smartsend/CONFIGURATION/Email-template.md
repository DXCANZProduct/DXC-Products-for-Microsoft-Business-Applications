---
layout: product-content
header: Smart Business Form Email Manager (SmartSend)
toc: true
---

# Email template
The Smart Send feature utilizes, standard, Dynamics 365 for Finance and Operations [email templates](https://docs.microsoft.com/en-us/dynamics365/commerce/email-templates-transactions#create-an-email-template). It is necessary to configure at least one ‘Email template,’ to use the Smart Send features, and typically the email template used would be specific to the business form or report to be sent. 

The following new optional fields have been added:

|  **Field**  | **Description** | 
|:---|:---|     
|  **Additional email recipient**  | Specify an email address that will be appended to the “To” email address. |  
|  **Cc**  | Specify an email address to cc. |  
|  **Bcc**  | Specify an email address to Bcc. |  

In addition to the email addresses the Subject and Body of the email support token place holders. These placeholders will be dynamically replaced based on the context of the business form or report they it is running for. Refer to [Email Placeholder](Email_placeholder) for further detail on supported placeholder tags. It is recommended you create a template for each business form or report as they all have unique place holder tags.

Navigate to **Organization administration > Setup > Organisation email templates**

## Data entities
- Organization email template
- Address and contact information purpose
- Organization email template message
