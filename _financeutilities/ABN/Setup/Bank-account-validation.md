---
layout: product-content
header: Finance Utilities
toc: true
---

# Bank account validation
The fields as described in the following subsections are available to control optional validation when creating new **Vendor** and **Customer bank accounts**. <br> 
Also applies to importing data entities:
- Vendor bank accounts
- Customer bank accounts


## Setup legal entity
1. Go to **Organization administration > Organizations > Legal entities** and select the applicable legal entity.
2. Use the setup available under **Validation** FastTab, heading **Bank account format validation**:
    - **Country/region** - Validation will only apply to bank accounts for this country. Once this field is populated, address becomes mandatory on vendor and customer bank accounts.
    - **Bank account format validation**
        - **No validation** (default) - incorrect formats will incur no validation.
        - **Warning** - warning message, user will be allowed to save incorrect formats.
        - **Error** - error message, user will not be allowed to save incorrect formats.
    - **Routing / bsb number format** - example ###-###
    - **Bank account minimum number of digits** - example 6 for Australia, 15 for New Zealand
    - **Bank account maximum number of digits** - example 9 for Australia, 17 for New Zealand
  
## Processing
See [link](../Processing/Bank-account-validation) for details on processing.
