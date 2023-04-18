---
# required metadata

title: DXC Finance Utilities - AR Utilities
description: Customer remittance format setup
author: jdutoit2
manager: Kym Parker
ms.date: 2023-04-18
ms.topic: article
ms.prod: 
ms.service: dynamics-ax-applications
ms.technology: 

# optional metadata

ms.search.form:  DXCARRemittanceFormat
audience: Application User
# ms.devlang: 
ms.reviewer: jdutoit2

# ms.tgt_pltfrm: 
# ms.custom: : ["21901", "intro-internal"]
ms.search.region: FinanceUtilFeature
# ms.search.industry: [leave blank for most, retail, public sector]
ms.author: helenho
ms.search.validFrom: 2016-05-31
ms.dyn365.ops.version: AX 7.0.1
---

# Remittance format
The fields as described in the following subsections are available to control the file format for periodic import tasks available in additional licensed feature **Finance utilities - AR utilities**.

> Note: The page is only available where additional licensed feature **Finance utilities - AR utilities** is enabled.

To open the **Remittance format** page, go to **Accounts receivable > Payment setup > Remittance format**. <br>
On the Action Pane, select **New** and enter the following details.

### Setup

| **Field**     | **Description** |
:--             |:--
**Custom format**               | When set to _Yes_, a custom format can be set via button **Mappings**.
**Import format configuration** | When **Custom format** is set to _No_, an electronic reporting configuration can be selected.
**Processing group**            | Select the progressing group that will be used when importing the file and processing to customer payment journal.
When **Custom format** is set to _Yes_: | ^
**Flat or structured**          | Select if the import file format is flat or structured. <br> **Flat** – A single line per record. Each line of text in the file has all the header information on it as well as the line information. <br> **Structured** – Multiple lines per record. Each line in the file is either a header type or a line type.
**Delimited or fixed**          | Select if the import file format is delimited or fixed. <br> **Delimited** – Columns using a defined separator. <br> **Fixed** – Fixed width.
**Column delimiter**            | Select the Row delimiter used within the file, options: <br> **{CR}{LF}** – Carriage return/line feed for windows <br> **{CR}** – Carriage return for MAC. <br> **{LF}** – Line feed for UNIX <br> **{;}** – Semicolon <br> **{:}** – Colon <br> **{,}** – Comma <br> **{t}** – Tab <br> **{\|}** Vertical bar
**Record identifier position**  | Where the file is **Structured**, specify the Record identifier position.
**Date format**                 | Select the applicable date format.


### Mapping

Where **Custom format** is set to _Yes_, select **Mapping** to map the file format fields.

| **Field**     | **Description** |
:--             |:--
