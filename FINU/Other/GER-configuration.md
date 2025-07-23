---
# required metadata

title: Finance Utilities
description: Electronic reporting configuration
author: Monica du Toit
manager: Pontus Ek
ms.date: 2025-07-23
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form: 
audience: Application User
# ms.devlang: 
ms.reviewer: Monica du Toit

# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: Monica du Toit
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Electronic reporting configuration
Finance utilities provides below GER configurations in the LCS solution for typical GER modifications implemented in our region to standard configurations. <br>
These configurations will not be updated, supported or maintained by the Product team. <br>
Any bugs or issues identified can be fixed on T&M basis by the project delivery or support teams.

# Account payable module

Below sections describe which configurations apply to each format for the Accounts payable module.

### ANZ Domestic AU

- File type: XML
- External provider: ANZ bank

1.  ANZ Direct Credit Service (AU) DXC.xml

### ANZ Domestic NZ

1. ANZ Direct Credit Domestic (NZ).xml

### ANZ International_Domestic ISO20022 payment format

1. ISO20022 Credit transfer_DXC.xml

### ASB Domestic NZ

1. ASB Domestic (NZ).xml
1. BNZ Direct Credit Domestic (NZ).xml

### BNZ bank ib4b International payment format

- File type: Fixed width
- External provider: BNZ bank

1. Payment model mapping 1611_DXC.xml
1. BNZ International (Ib4b).xml

### BNZ Domestic Direct Credit

- File type: XML
- External provider: BNZ Bank

1. Payment model mapping 1611.xml
1. BNZ Direct Credit Domestic (NZ).xml


### Finance Utilities - Payment Advice

- File type: Excel

1. PaymentModel_DXC.xml
1. Payment advice model mapping DXC.xml
1. Vendor payment adviceV2_DXC(Excel).xml


### Wells Fargo ISO20022

- File type: XML
- External provider: Wells Fargo

1. Payment model (109).xml
1. Payment model DXC.xml
1. Payment model mapping 1611.xml
1. Payment model mapping 1611 DXC.xml 
1. Payment model mapping to destination ISO20022 DXC.xml
1. ISO20022 Credit transfer.xml
1. ISO20022 Credit transfer DAC.xml (CCD - Cash concentration and disbursement, PPD)
1. ISO20022 Credit transfer CCR.xml (CCR CARD - Credit card)
1. ISO20022 Credit transfer CHK.xml (CHK - Cheque)


### Westpac APT International payment format

- File type: Fixed width
- External provider: Westpac bank

1. Payment model mapping 1611_DXC.xml
2. WBC APT (International).xml

# Account receivable module

Below sections describe which configurations apply to each format for the Accounts receivable module.

### CBA Bank AR Customer Refund ABA format

- File type: Fixed width
- External provider: Commonwealth bank

1. Payment model mapping 1611_DXC.xml
2. CBA Direct Credit Service_DXC.xml

### NAB DD BPAY

1. Payment model.xml
2. Payment model mapping 1611.xml
3. Payment Model BPAY.xml
4. Payment model mapping 1611 BPAY.xml
5. NAB BPAY.xml

# Cash and bank management module

Below sections describe which configurations apply to each format for the Cash and bank management module.

### MT940 Bank Load (ANZ)

1. ABR MT940 DXC.xml


