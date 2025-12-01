---
layout: product-content
header: Electronic Data Interchange (EDI)
toc: true
---

# DXC Electronic Data Interchange (EDI) - Technical Guide

The DXC EDI module provides enhanced functionalities to Microsoft Dynamics 365 for Finance and Operations (FinOps). This guide provides an overview of the technical requirements for making extensions to specific features.

## Summary of breaking changes and mitigation steps
As part of ongoing enhancements to the EDI core product, some changes introduced may impact customization. This section describes any known breaking and mitigation steps.

### SAB_EDIDocumentSettingsContract
The following changes affect extensions for this class. See [module library](./EDI-module-library.html#sab_edidocumentsettingscontract-1) for more info.

1. findOrInitBufferForUpdate  
   - Introduced In: 10.0.25.202206301  
   - Description: Auto-resolves the document settings profile record given the table Id of the document settings profile document type table and field Id of the foreign key document setting profile field.  
   - Impact: Two new abstract methods had been introduced. Both are required to be implemented in the extension classes.  
     - Method 1: getPprofileTableId  
        Example implementation:
        ``` x++
        returns tableNum(SAB_EDIDocumentSettingsProfile_ASN)
        ```
     - Method 2: getProfileFieldId  
        Example implementation:
        ```x++
        returns fieldNum(SAB_EDIDocumentSettingsProfile_ASN, DocumentSettingsProfile)
        ```

### SAB_EDIXSDGenerator
The following changes affect extensions for this class. See [module library](./EDI-module-library.html#sab_edixsdgenerator-1) for more info.

1. init
   - Introduced In: 10.0.25.202206301
   - Description: Enhancement added to ensure XSD Generator is not executed if initialization did not occur as expected.
   - Impact: Previously void, now expects a boolean value to be returned.
2. writeStartSection
    - Intoduced In: 10.0.25.202206301
    - Description: Introduced SAB_EDIXSDGeneratorSchemaItem to host all logic related to schema item to enhance extensibility and maintainability
    - Impact: A new parameter is required, sectionId (int64) to uniquely identify the section
3. createElement
   - Introduced In: 10.0.25.202206301 
   - Description: 
   - Impact: Moved to new class, SAB_EDIXSDGeneratorSchemaItem

### SAB_EDIProcessor_PickinglistRegistration
The following changes affect extensions for this class. See [module library](./EDI-module-library.html#sab_ediprocessor_picklistregistration) for more info.

1. processPackingSlip
   - Introduced In: 10.0.27.202211082
   - Description: Parameter SAB_EDIWMSPickingRouteExt is now auto-resolved during initialized
   - Impact: Parameter SAB_EDIWMSPickingRouteExt is no longer required. 