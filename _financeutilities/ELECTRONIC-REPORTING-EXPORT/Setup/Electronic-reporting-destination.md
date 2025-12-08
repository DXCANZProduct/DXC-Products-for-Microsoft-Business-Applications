---
layout: product-content
header: Finance Utilities
toc: true
---

# Electronic reporting

Finance utilities includes functionality to export an Electronic reporting format to a secure location.

### Setup steps
1. [Electronic reporting export connections](Electronic-reporting-export-connections)
2. [Document types](Document-types)
3. [Electronic reporting destination](#setup-electronic-reporting-export-connections)

The following section will describe the required setup for Step 3 for assigning the Document type created in Documents types to an Electronic reporting destination.

### Electronic reporting destination
Users can access the page by navigating to **Organisation administration > Electronic reporting > Electronic reporting destination**. <br> 
Select **New** on the Action Pane to create an **Electronic reporting destination** for the selected GER and allocate **Document type** created in _step 2_.

|   Field    |   Description   |    Example or Options   |
|-|-|-|
|  **Reference**  |  Select the  Electronic reporting Reference  |  Example ‘ANZ Direct Credit Service (AU)’  |
|  Select  **New** on the **File destination** FastTab  |  |  |
|  **Name** |  Enter name for the destination  |   |
|  **File component name** |  Select  PaymentFile   |   PaymentFile   |
|  **Stop processing on failure**  |  If enabled and there are errors when saving the file to location, vendor payment processing  **Generate payment**  will create a file and attach to the job. The Payment status will remain  **None**   |  •	Yes <br> •	No          |
|  Select the **Settings** button on the **File destination** FastTab and select the **Archive** tab |  |  |
|  **Enabled**  |  Enable the Archive destination  |  • Yes <br> • No          |
|  **Save in job archive**  |  Enable saving to 'Electronic reporting archived jobs' |  • Yes <br> • No          |
|  **Type**  |  Select the **Document type** created in _step 2_  |  Example GER          |
