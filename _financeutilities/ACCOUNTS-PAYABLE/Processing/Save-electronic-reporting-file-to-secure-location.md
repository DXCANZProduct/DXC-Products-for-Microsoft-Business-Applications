---
layout: product-content
header: Finance Utilities
toc: true
---

# Accounts payable functionality
The features as described in the following subsections are available to control the additional functionality for accounts payable.

## Save electronic reporting file to secure location
Setup requirements are discussed in detail at [Save electronic reporting file to secure location setup](../Setup/Save-electronic-reporting-file-to-secure-location). <br>
Generating the payments are discussed in the following subsections.

## Generate payment
When selecting **Generate payments** for a vendor payment journal that is using a **Method of payment** set to save the GER file to a secure location, the **Archive** destination is defaulted.

If there is an error saving the file to secure location and **Stop processing on failure** on the **Electronic reporting destination** was enabled, the processing will error and **Payment status** remains None. Example error ‘The process stopped because the delivery of file ‘%’ to the destination failed. The payments cannot be generated.’

