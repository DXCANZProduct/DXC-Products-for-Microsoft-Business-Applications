---
layout: product-content
header: Finance Utilities
toc: true
---

# Electronic reporting

Finance utilities includes functionality to export an Electronic reporting format to a secure location.

### Setup steps

1. [Electronic reporting export connections](Electronic-reporting-export-connections.md)
2. [Document types](#setup-document-types)
3. [Electronic reporting destination](Electronic-reporting-destination.md)

The following section will describe the required setup for Step 2 for assigning the secure location created in **Electronic reporting export connections** to a **Document type**.

### Setup Document types

Users can access the page by navigating to **Organisation administration > Document management > Document types**. <br>
Select **New** to create the **Document type** and assign the **Electronic reporting export connection** created in _step 1_.

| Field                                   | Description                                                             | Example or Options                                                          |
| --------------------------------------- | ----------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| **Type**                                | Enter the type                                                          | Example GER                                                                 |
| **Name**                                | Enter a name for the document type                                      |                                                                             |
| **Class**                               | Select **Attach file**                                                  | • Attach file <br> • Attach URL <br> • Simple note                          |
| **Group**                               | Select **File**                                                         | • Note <br> • File <br> • Image <br> • Document <br> • Worksheet <br> • URL |
| **Category**                            | Select a **Category**                                                   | • None                                                                      |
| **Location**                            | Not used, select any                                                    | • Azure storage <br> • Database <br> • SharePoint                           |
| **SharePoint address**                  | Not used                                                                |
| **Remove**                              | Document and physical file                                              |                                                                             |
| **Ask for confirmation**                | Should confirmation be requested priori to removing the file            | • Yes <br> • No                                                             |
| **Electronic report export connection** | Select the **Electronic reporting export connection** setup in _step 1_ | Example ANZ_FTP                                                             |
