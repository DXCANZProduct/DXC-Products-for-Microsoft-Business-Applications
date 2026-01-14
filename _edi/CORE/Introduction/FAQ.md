---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# Frequently asked questions - Core

## Generic EDI queries

See [EDI FAQ](../../FAQ) for generic EDI queries

## Fixing EDI errors
The following table describes a few staging errors that could be experienced with EDI documents. Short description of possible fixes are discussed. After fix, reset status on the record and either manually process again or leave for batch to process.

> Note: % contains staging data for the record

### Staging-to-Outbound files

The following table describes possible errors that could be experienced with EDI documents at the staging to outbound step.

Error	message           | Method to fix
:--                     |:--
Could not write file for document type % and trading partner % | The outbound file name is not unique for the trading partner. Check the setup for **Outbound file names** in **Document types** for the applicable outbound document type.