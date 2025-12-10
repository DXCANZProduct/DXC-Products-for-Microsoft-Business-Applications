---
layout: product-content
header: Finance Utilities
toc: true
---

# Bank account validation

When Bank account validation has been enabled for the legal entity and country, new vendor and customer bank accounts created with the allocated Country/region as setup in Legal entity goes through extra validation to ensure the length and/or format.

## Prerequisites
The following setup are [prerequisites](../Setup/Bank-account-validation) for Bank account validation:


## Validation
The following validations will occur when creating new records for vendor and customer bank accounts.

- **Country/region** - Validation will only apply to bank accounts for this country. Once this field is populated, address becomes mandatory on vendor and customer bank accounts.
- **Bank account format validation**: 
  - **No validation** (default) - incorrect formats will incur no validation.
  - **Warning** - warning message, user will be allowed to save incorrect formats.
  - **Error** - error message, user will not be allowed to save incorrect formats.

Example errors mesages when creating new vendor and customer bank account records and validation applies:
- **Routing / bsb number format** (Setup example ###-###) - The 123 number does not match the format defined for the legal entity '###-###'. Please enter a new value.
- **Bank account minimum number of digits** (Setup example 6) - The bank account number does not match the minimum number of digits defined for the legal entity '6'. Please enter a new value.
- **Bank account maximum number of digits** (Setup example 9) - The bank account number does not match the maximum number of digits defined for the legal entity '9'. Please enter a new value.


  
