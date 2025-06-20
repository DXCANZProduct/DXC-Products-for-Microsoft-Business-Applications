---
# required metadata

title: DXC Care services 
Description: Care services, Accommodation Payments
author: Helen Ho
Manager: Pontus Ek
ms.date: 2025-03-31
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Peter Musumeci 

# ms.tgt_pltfrm: 
ms.custom: ["21901", "intro-internal"]
ms.search.region: Global
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Peter Musumeci
ms.search.validFrom: 2025-03-31
ms.dyn365.ops.version: 10.0.40
---

# New billing/funding codes and rate updates

Billing rates, subsidy rates capping limits, and interest rates require regular updates for adjustments in the amounts and interest rate percentage.

### Billing Rates

-   Fees on the ‘Department of Health and Care services Schedule of fees and charges’ are normally increased bi-annually.
-   Update other fees when required.

**Path: Care services\> Setup\> Billing\> Billing codes**

1.  Select the relevant billing code.
2.  Click on **\<Billing Rates\>**
3.  Populate an End date for the old rate.
4.  Click on **\<New\>** to create a new line.
5.  Populate the Start date for the new rate.
6.  Populate the new rate amount.
7.  Click on \<Run global rate update\> to update all clients.
8.  Generate the Billing adjustment journal to generate and post the adjustments.

### Subsidy and supplement Rates

Subsides and supplements on the Department of Health and Care services Schedule of subsidies and supplements have regular increases.

**Path: Care services\> Setup\> Funding \> Funding codes**

1.  Select the relevant funding code.
2.  Click on **\<Funding Rates\>**
3.  Populate an End date for the old rate.
4.  Click on **\<New\>** to create a new line.
5.  Populate the Start date for the new rate.
6.  Populate the new rate amount.

### Accommodation Payment interest Rates

Interest rates have quarterly adjustments.

**Path: Care services\> Setup\> Accommodation Payments \> Accommodation Payment interest rates**

1.  Populate the ‘To date’ for the old rate.
2.  Click on **\<New\>** to create a new line.
3.  Populate the ‘From date’ for the new rate.
4.  Populate the new **Base rate** and Maximum Permissible Interest Rate (**MPIR**)

### Capping limits for Means Tested Fees and Income Tested Fees

The annual and lifetime capping limits for Means Tested Fees and Income Tested Fees are adjusted bi-annually

**Path: Care services\> Setup\> Capping limits**

1.  Select the relevant capping limit.
2.  Click on \<Edit\>
3.  Change ‘Active’ to No
4.  Populate the ‘To date’ for the old threshold.
5.  Click on **\<Add\>** to create a new line.
6.  Populate the ‘From date’ for the new threshold.
7.  Populate the new threshold amount.
8.  Change ‘Active’ to Yes
9.  Repeat the steps to update the threshold for all capping limits.
10. Click **\<Save\>** to save the details.

### Create a new funding code

New subsidies and supplements are setup as funding codes.

**Path: Care services\> Setup\> Funding \> Funding codes**

1.  Click on **\<New\>**
2.  Populate the funding code and description.
3.  Select the relevant Billing account name.
4.  Select Item GST group and GST group.
5.  Right- click in the External funding code and select ‘View Details’
6.  Click on **\<New\>** to add the external funding code (from the Government Payment statement)
7.  Add a Description
8.  Select **\<Save\>** and close the form.
9.  Select the newly created External funding code.
10. Select Advance/Arrears to indicate if the code is billed in advance or arrears.
11. Select the relevant Main account.
12. Select Category code and Home based care set for Community care codes.
13. Select **supported ratio reduction** if the code is subject to supported ratio reduction (such as accommodation supplements)
14. Select the Recurrence pattern (e.g. Daily)
15. Click on **\<Funding Rates\>**
16. Click on **\<New\>**
17. Select Valid = All
18. Populate the Start date.
19. Populate the Rate amount.
20. Click on **\<Save\>** and close the form.
21. Click \<Save\> to save the new funding code.
22. Close the form.

### Create a new billing code

New fees are setup as billing codes.

**Path: Care services\> Setup\> Billing \> Billing codes**

1.  Click on **\<New\>**
2.  Populate the billing code and description.
3.  Select Item GST group and GST group.
4.  Select Advance/Arrears to indicate if the code is billed in advance or arrears.
5.  Select Prorata =Yes for fees to be calculated prorata
6.  Select the relevant Main account.
7.  Select ‘Used for accommodation payment billing’ for codes such as DAP or DAC
8.  Select Category code and Home based care set for Community care codes
9.  Right- click in the External funding code and select ‘View Details’
10. Click on **\<New\>** to add the external funding code (from the Government Payment statement)
11. Add a Description
12. Click on **\<Save\>** and close the form.
13. Select the newly created External funding code.
14. Select the Contribute to annual and lifetime capping for Means tested or Income tested fees.
15. Select Funding association – offset for subsidy clawback such as Means tested fee clawback.
16. Select the ‘Reduces supplement of’ for any fees that are reduced from the base subsidies.
17. Select the Recurrence pattern (e.g. Daily)
18. Click on **\<Funding Rates\>**
19. Click on **\<New\>**
20. Select Valid = All
21. Populate the Start date
22. Populate the Rate
23. Click on **\<Save\>** and close the form
24. Click **\<Save\>** to save the new funding code
25. Close the form
