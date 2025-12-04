---
layout: product-content
header: License Manager
toc: true
---

# Frequently Asked Questions

## Version and Support Information

Where can I find contact information for support?
Email: ECLANZProductSupport@dxc.com

## Dependency and Security Information

License Manager includes

- Use of Microsoft Azure Application Insights library
- Makes secure HTTPS connections for license validation in accordance to the Microsoft security standards

_Customer telemetry retrieved by the license manager_

- Serial number
  - Used to uniquely identify a customer environment for license validation.
  - RSA encrption key is used for securing the serial number in the license server validation responses.
  - FinOps License Manager module verifies the response before extracting results from the payload.

_Other telemetry retrieved relating to the ISV product installed_

- Product name - Name of installed ISV product.
- Model name - Name of the installed ISV product's FinOps model
- Model version - Installed ISV product's FinOps model version
- Host url - URL of the host environment where the ISV product is installed.
- Is enabled - Current license status for the installed ISV product.
- Is installed - Indicates if ISV product is installed.
- Is production environment - Indicates if environment is a production environment.

_Customer telemetry retrieved by the DXC license (Applicable to DXC customers only)_
- Enabled users count - Count of the number of enabled users

All telemetry is collected and logged within Microsoft Azure Application Insights.

Note: License Manager does not collect any other information other than those specified above. It does not reference or collect any telemetry against any other installed system or ISV modules.

## Dynamics 365 Finance and Operations

### Customers receiving "Product XXX is enabled but not licensed" prompt in D365FO

#### Only a few users experience the issue but works for the rest of the organization

Please verify if there is no issue relating to network latency

#### Multiple or all users experience the issue

Please contact your system administrator to confirm if manually performing validate license within System parameters > Product licenses > Validate license resolves the issue.

#### Prompt is referring to a subset of the products

Please contact your licensing personnel to confirm whether the licenses are still active.

#### Prompt occurs for all products

In the case of such an event, please reach out to the DXC Product support team or [subscribe](./MARKETING-COMMUNICATIONS/subscribe.html) to get notifications.  
DXC Product Support Team periodically sends out notifications in the event of a downtime or scheduled update.


