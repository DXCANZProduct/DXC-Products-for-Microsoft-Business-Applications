---
layout: product-content
header: Finance Utilities
toc: true
---

# Accounts payable functionality
The fields as described in the following subsections are available to control the additional functionality for accounts payable.

## Save Electronic reporting file to secure location
The below setup can be used for any Electronic reporting file, but the example provided is for a Vendor GER EFT payment. The feature uses the **Archive** functionality with the following setup steps
-	Step 1: Setup [Electronic reporting export connection](../../ELECTRONIC-REPORTING-EXPORT/Setup/Electronic-reporting-export-connections)
-	Step 2: Setup [Document types](../../ELECTRONIC-REPORTING-EXPORT/Setup/Document-types), using Step 1’s Connection
-	Step 3: Setup [Electronic reporting destination](../../ELECTRONIC-REPORTING-EXPORT/Setup/Electronic-reporting-destination), using Step 2’s Document type
-	Step 4: Setup AP **Method of payment** and select the Export format configuration from Step 3

Processing: When generating a payment for a method of payment with above GER, the Archive destination is defaulted, and the GER EFT payment file is saved to the assigned connection path.

Please use links in above for setup required in step 1 - 3.

### Step 4 -	Method of payment
On the selected **Method of payment**, enable **Generic electronic Export format**, and in the **Export format configuration** field select the **Reference** from _step 3_.

## Processing
Vendor payment processing using the above method of payment is discussed at [Processing](../Processing/Save-electronic-reporting-file-to-secure-location)

